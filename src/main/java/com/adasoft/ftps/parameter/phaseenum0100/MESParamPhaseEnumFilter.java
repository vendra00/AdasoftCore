package com.adasoft.ftps.parameter.phaseenum0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamPhaseEnumFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "C_ParamPhaseEnum0100";

    public MESParamPhaseEnumFilter(Server server) {
        super(server, "C_ParamPhaseEnum0100");
    }

    public MESParamPhaseEnumFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamPhaseEnum> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamPhaseEnum.class);
    }

    public MESParamPhaseEnumFilter forValueEqualTo(String value) throws DatasweepException {
        return (MESParamPhaseEnumFilter)this.forColumnNameEqualTo("C_Value", value);
    }

    public MESParamPhaseEnumFilter forValueNotEqualTo(String value) throws DatasweepException {
        return (MESParamPhaseEnumFilter)this.forColumnNameNotEqualTo("C_Value", value);
    }

    public MESParamPhaseEnumFilter forValueContaining(String value) throws DatasweepException {
        return (MESParamPhaseEnumFilter)this.forColumnNameContaining("C_Value", value);
    }

    public MESParamPhaseEnumFilter forValueStartingWith(String value) throws DatasweepException {
        return (MESParamPhaseEnumFilter)this.forColumnNameStartingWith("C_Value", value);
    }
}