package com.adasoft.ftpc.i18n;

import com.google.inject.matcher.Matchers;
import com.rockwell.library.ftpc.guice.logger.CommonsLoggingTypeListener;

public class AppContextModule extends AppContextBaseModule {
    protected void configure() {
        super.configure();
        this.bindListener(Matchers.any(), new CommonsLoggingTypeListener());
    }
}
