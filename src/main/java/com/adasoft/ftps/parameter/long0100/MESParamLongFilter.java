package com.adasoft.ftps.parameter.long0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamLongFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "C_ParamLong0100";

    public MESParamLongFilter(Server server) {
        super(server, "C_ParamLong0100");
    }

    public MESParamLongFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamLong> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamLong.class);
    }

    public MESParamLongFilter forValueEqualTo(Long value) throws DatasweepException {
        return (MESParamLongFilter)this.forColumnNameEqualTo("C_Value", value);
    }

    public MESParamLongFilter forValueNotEqualTo(Long value) throws DatasweepException {
        return (MESParamLongFilter)this.forColumnNameNotEqualTo("C_Value", value);
    }

    public MESParamLongFilter forValueGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamLongFilter)this.forColumnNameGreaterThanOrEqualTo("C_Value", value);
    }

    public MESParamLongFilter forValueLessThan(Long value) throws DatasweepException {
        return (MESParamLongFilter)this.forColumnNameLessThan("C_Value", value);
    }
}
