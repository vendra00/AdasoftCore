package com.adasoft.ftpc.i18n;

import com.datasweep.compatibility.manager.ServerImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.matcher.Matchers;
import com.rockwell.library.ftpc.service.IBaseService;
import com.rockwell.mes.commons.base.ifc.services.IFunctionsEx;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import com.rockwell.mes.commons.base.ifc.services.TransactionInterceptorGuice;
import com.rockwell.mes.commons.base.ifc.services.Transactional;
import org.aopalliance.intercept.MethodInterceptor;

public class AppContextBaseModule extends AbstractModule {
    private ServerImpl serverImpl;
    private IFunctionsEx functions;

    @Singleton
    @Provides
    ServerImpl getServerImpl() {
        if (this.serverImpl == null) {
            this.serverImpl = PCContext.getServerImpl();
        }

        return this.serverImpl;
    }

    @Singleton
    @Provides
    IFunctionsEx getFunctions() {
        if (this.functions == null) {
            this.functions = PCContext.getFunctions();
        }

        return this.functions;
    }

    protected void configure() {
        this.requestInjection(this.getServerImpl());

        TransactionInterceptorGuice trxInterceptor = new TransactionInterceptorGuice();
        this.bindInterceptor(Matchers.annotatedWith(Transactional.class), Matchers.annotatedWith(Transactional.class), new MethodInterceptor[]{trxInterceptor});

        this.bindInterceptor(Matchers.subclassesOf(IBaseService.class), Matchers.annotatedWith(Transactional.class), new MethodInterceptor[]{trxInterceptor});

        this.requestInjection(trxInterceptor);
    }
}
