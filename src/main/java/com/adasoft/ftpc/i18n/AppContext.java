package com.adasoft.ftpc.i18n;

import com.datasweep.compatibility.manager.ServerImpl;
import com.datasweep.compatibility.pnuts.Environment;
import com.google.common.base.Preconditions;
import com.google.inject.*;
import com.google.inject.name.Names;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import org.apache.bval.guice.ValidationModule;
import org.apache.bval.jsr303.ApacheValidationProvider;
import org.apache.bval.jsr303.ApacheValidatorConfiguration;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;

public class AppContext {
    private static Module[] staticModules;
    private static final Log LOGGER = LogFactory.getLog(AppContext.class);
    private static volatile boolean initialized = false;
    private static Injector appInjector;
    private static volatile ValidatorFactory beanValidatorFactory;
    private static String projectDefaultModuleClassName = "com.adasoft.ProjectModule";

    static void setStaticModules(Module... modules) {
        Class var1 = AppContext.class;
        synchronized (AppContext.class) {
            staticModules = modules == null ? new Module[0] : modules;
        }
    }

    static {
        Class var0 = AppContext.class;
        synchronized (AppContext.class) {
            staticModules = new Module[]{new AppContextModule(), new ValidationModule()};
        }
    }

    public static void setProjectDefaultModule(String paramProjectDefaultModuleClassName) {
        Preconditions.checkArgument(StringUtils.isNotBlank(paramProjectDefaultModuleClassName), "Default module cannot be blank!");
        projectDefaultModuleClassName = paramProjectDefaultModuleClassName;
    }

    public static void setProjectDefaultModule(Class<? extends Module> paramProjectDefaultModuleClass) {
        Preconditions.checkNotNull(paramProjectDefaultModuleClass, "Default module cannot be NULL!");
        projectDefaultModuleClassName = paramProjectDefaultModuleClass.getCanonicalName();
    }

    public static boolean isContextInitializedForGUI() {
        return !Boolean.getBoolean("dsxtool.assemble.active");
    }

    public static boolean isInitialized() {
        return initialized;
    }

    private static void isInitializedInternal() {
        Preconditions.checkArgument(initialized, AppContext.class.getSimpleName() + " is not yet initialized! Call initialize method first!");
    }

    public static boolean initialize(Environment environment, Module... appModules) {
        Class var2 = AppContext.class;
        synchronized (AppContext.class) {
            if (!initialized) {
                PCContext.setEnvironment(environment);
                initializeInjector(appModules);
                initialized = true;
            }
        }
        return initialized;
    }

    public static boolean initialize(Module... appModules) {
        Class var1 = AppContext.class;
        synchronized (AppContext.class) {
            if (!initialized) {
                PCContext.getEnvironment();
                initializeInjector(appModules);
                initialized = true;
            }
        }
        return initialized;
    }

    private static void initializeInjector(Module... appModules) {
        Module[] allModules = (Module[]) ArrayUtils.addAll(staticModules, appModules);
        try {
            // Use Class.forName instead of ClassUtils.getClass to avoid the need for casting
            Class<?> projectModuleRawClass = Class.forName(projectDefaultModuleClassName);

            // Check if the class is a subclass of Module to ensure type safety
            if (Module.class.isAssignableFrom(projectModuleRawClass)) {
                @SuppressWarnings("unchecked") // Safe cast because we checked with isAssignableFrom
                Class<? extends Module> projectModuleClass = (Class<? extends Module>) projectModuleRawClass;

                Module projectModule = (Module) ConstructorUtils.invokeExactConstructor(projectModuleClass, new Object[0]);
                allModules = (Module[]) ArrayUtils.add(allModules, projectModule);
            } else {
                throw new IllegalArgumentException("The class " + projectDefaultModuleClassName + " does not implement Module interface.");
            }
        } catch (Exception e) {
            LOGGER.warn("Could not load / instantiate the project specific module: " + projectDefaultModuleClassName, e);
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Modules used for injector creation: " + ArrayUtils.toString(allModules));
        }
        appInjector = Guice.createInjector(allModules);
    }

    public static void injectMembers(Object instance) {
        isInitializedInternal();
        Class var1 = AppContext.class;
        synchronized (AppContext.class) {
            appInjector.injectMembers(instance);
        }
    }

    public static Injector createChildInjector(Module... modules) {
        isInitializedInternal();
        Class var1 = AppContext.class;
        synchronized (AppContext.class) {
            return appInjector.createChildInjector(modules);
        }
    }

    public static <T> T getInstance(Class<T> type, String name) {
        Preconditions.checkNotNull(type, "Type cannot be NULL!");
        Preconditions.checkArgument(StringUtils.isNotBlank(name), "Name cannot be Blank!");
        isInitializedInternal();
        T instance = null;
        Class var3 = AppContext.class;
        synchronized (AppContext.class) {
            instance = appInjector.getInstance(Key.get(type, Names.named(name)));
            return instance;
        }
    }

    public static <T> T getInstance(Class<T> type) {
        Preconditions.checkNotNull(type, "Type cannot be NULL!");
        isInitializedInternal();
        T instance = null;
        Class var2 = AppContext.class;
        synchronized (AppContext.class) {
            try {
                instance = appInjector.getInstance(type);
            } catch (RuntimeException var7) {
                String mainMessageGuice = ExceptionUtils.getMessage(var7);
                String userMessageGuice;
                if (ConfigurationException.class.isAssignableFrom(var7.getClass())) {
                    userMessageGuice = "Invalid Injector configuration: " + mainMessageGuice;
                } else if (ProvisionException.class.isAssignableFrom(var7.getClass())) {
                    userMessageGuice = "Failed creating instance: " + mainMessageGuice;
                } else {
                    userMessageGuice = mainMessageGuice;
                }
                throw buildRuntimeExceptionForGetInstance(type, userMessageGuice);
            }
            return instance;
        }
    }

    private static RuntimeException buildRuntimeExceptionForGetInstance(Class type, String... messages) {
        StringBuilder builder = new StringBuilder();
        builder.append("Could not get an instance of '" + type.getSimpleName() + "' class!\n");
        String[] var3 = messages;
        int var4 = messages.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            String message = var3[var5];
            builder.append("\t- ").append(message).append("\n");
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(builder.toString());
        }
        return new RuntimeException(builder.toString());
    }

    public static ValidatorFactory getBeanValidationFactory() {
        if (beanValidatorFactory == null) {
            beanValidatorFactory = ((ApacheValidatorConfiguration) Validation.byProvider(ApacheValidationProvider.class).configure()).buildValidatorFactory();
        }
        return beanValidatorFactory;
    }

    public static void setEnvironment(Environment paramEnvironment) {
        isInitializedInternal();
        PCContext.setEnvironment(paramEnvironment);
    }

    public static Environment getEnvironment() {
        isInitializedInternal();
        return PCContext.getEnvironment();
    }

    public static ServerImpl getServerImpl() {
        isInitializedInternal();
        return PCContext.getServerImpl();
    }
}


