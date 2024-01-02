package com.adasoft.ftps.parameter.string0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamStringFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "C_ParamString0100";

    public MESParamStringFilter(Server server) {
        super(server, "C_ParamString0100");
    }

    public MESParamStringFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamString> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamString.class);
    }

    public MESParamStringFilter forValueEqualTo(String value) throws DatasweepException {
        return (MESParamStringFilter)this.forColumnNameEqualTo("C_Value", value);
    }

    public MESParamStringFilter forValueNotEqualTo(String value) throws DatasweepException {
        return (MESParamStringFilter)this.forColumnNameNotEqualTo("C_Value", value);
    }

    public MESParamStringFilter forValueContaining(String value) throws DatasweepException {
        return (MESParamStringFilter)this.forColumnNameContaining("C_Value", value);
    }

    public MESParamStringFilter forValueStartingWith(String value) throws DatasweepException {
        return (MESParamStringFilter)this.forColumnNameStartingWith("C_Value", value);
    }
}
