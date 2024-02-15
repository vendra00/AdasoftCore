package com.adasoft;

import com.google.inject.AbstractModule;
import com.rockwell.mes.commons.base.ifc.RegisterJideTools;

public class ProjectModule extends AbstractModule {
    public ProjectModule() {
    }

    protected void configure() {
        RegisterJideTools.registerJideTools();
    }
}
