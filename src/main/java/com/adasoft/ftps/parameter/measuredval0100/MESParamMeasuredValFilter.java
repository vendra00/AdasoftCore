package com.adasoft.ftps.parameter.measuredval0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.datasweep.plantops.common.measuredvalue.IMeasuredValue;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamMeasuredValFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "C_ParamMeasuredVal0100";

    public MESParamMeasuredValFilter(Server server) {
        super(server, "C_ParamMeasuredVal0100");
    }

    public MESParamMeasuredValFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamMeasuredVal> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamMeasuredVal.class);
    }

    public MESParamMeasuredValFilter forValueEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESParamMeasuredValFilter)this.forColumnNameEqualTo("C_Value", value);
    }

    public MESParamMeasuredValFilter forValueNotEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESParamMeasuredValFilter)this.forColumnNameNotEqualTo("C_Value", value);
    }
}
