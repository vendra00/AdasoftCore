package com.adasoft.ftps.parameter.bigdecimal0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.MeasuredValue;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.functional.MeasuredValueUtilities;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.math.BigDecimal;
import java.util.List;

public class MESParamBigDecimalFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "C_ParamBigDecimal0100";

    public MESParamBigDecimalFilter(Server server) {
        super(server, "C_ParamBigDecimal0100");
    }

    public MESParamBigDecimalFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamBigDecimal> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamBigDecimal.class);
    }

    public MESParamBigDecimalFilter forValueEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamBigDecimalFilter)this.forColumnNameEqualTo("C_Value", mv);
    }

    public MESParamBigDecimalFilter forValueNotEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamBigDecimalFilter)this.forColumnNameNotEqualTo("C_Value", mv);
    }
}
