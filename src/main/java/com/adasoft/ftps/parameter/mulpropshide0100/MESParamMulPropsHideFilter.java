package com.adasoft.ftps.parameter.mulpropshide0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamMulPropsHideFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "L_ParamMulPropsHide0100";

    public MESParamMulPropsHideFilter(Server server) {
        super(server, "L_ParamMulPropsHide0100");
    }

    public MESParamMulPropsHideFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamMulPropsHide> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamMulPropsHide.class);
    }

    public MESParamMulPropsHideFilter forMakePhaseHiddenEqualTo(Boolean value) throws DatasweepException {
        return (MESParamMulPropsHideFilter)this.forColumnNameEqualTo("L_MakePhaseHidden", value);
    }

    public MESParamMulPropsHideFilter forMakePhaseHiddenNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamMulPropsHideFilter)this.forColumnNameNotEqualTo("L_MakePhaseHidden", value);
    }
}
