package com.adasoft.ftps.parameter.datetime0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.datasweep.compatibility.ui.Time;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamDateTimeFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "C_ParamDateTime0100";

    public MESParamDateTimeFilter(Server server) {
        super(server, "C_ParamDateTime0100");
    }

    public MESParamDateTimeFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamDateTime> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamDateTime.class);
    }

    public MESParamDateTimeFilter forValueEqualTo(Time value) throws DatasweepException {
        return (MESParamDateTimeFilter)this.forColumnNameEqualTo("C_Value", value);
    }

    public MESParamDateTimeFilter forValueNotEqualTo(Time value) throws DatasweepException {
        return (MESParamDateTimeFilter)this.forColumnNameNotEqualTo("C_Value", value);
    }

    public MESParamDateTimeFilter forValueGreaterThanOrEqualTo(Time value) throws DatasweepException {
        return (MESParamDateTimeFilter)this.forColumnNameGreaterThanOrEqualTo("C_Value", value);
    }

    public MESParamDateTimeFilter forValueLessThan(Time value) throws DatasweepException {
        return (MESParamDateTimeFilter)this.forColumnNameLessThan("C_Value", value);
    }
}
