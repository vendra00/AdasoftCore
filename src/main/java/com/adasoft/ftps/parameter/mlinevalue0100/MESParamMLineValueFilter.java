package com.adasoft.ftps.parameter.mlinevalue0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamMLineValueFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "C_ParamMLineValue0100";

    public MESParamMLineValueFilter(Server server) {
        super(server, "C_ParamMLineValue0100");
    }

    public MESParamMLineValueFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamMLineValue> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamMLineValue.class);
    }

    public MESParamMLineValueFilter forValueEqualTo(String value) throws DatasweepException {
        return (MESParamMLineValueFilter)this.forColumnNameEqualTo("C_Value", value);
    }

    public MESParamMLineValueFilter forValueNotEqualTo(String value) throws DatasweepException {
        return (MESParamMLineValueFilter)this.forColumnNameNotEqualTo("C_Value", value);
    }

    public MESParamMLineValueFilter forValueContaining(String value) throws DatasweepException {
        return (MESParamMLineValueFilter)this.forColumnNameContaining("C_Value", value);
    }

    public MESParamMLineValueFilter forValueStartingWith(String value) throws DatasweepException {
        return (MESParamMLineValueFilter)this.forColumnNameStartingWith("C_Value", value);
    }
}
