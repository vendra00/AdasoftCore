package com.adasoft.ftps.parameter.datewfrmt0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.datasweep.compatibility.ui.Time;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamDateWFrmtFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "C_ParamDateWFrmt0100";

    public MESParamDateWFrmtFilter(Server server) {
        super(server, "C_ParamDateWFrmt0100");
    }

    public MESParamDateWFrmtFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamDateWFrmt> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamDateWFrmt.class);
    }

    public MESParamDateWFrmtFilter forFormatEqualTo(String value) throws DatasweepException {
        return (MESParamDateWFrmtFilter)this.forColumnNameEqualTo("C_Format", value);
    }

    public MESParamDateWFrmtFilter forFormatNotEqualTo(String value) throws DatasweepException {
        return (MESParamDateWFrmtFilter)this.forColumnNameNotEqualTo("C_Format", value);
    }

    public MESParamDateWFrmtFilter forFormatContaining(String value) throws DatasweepException {
        return (MESParamDateWFrmtFilter)this.forColumnNameContaining("C_Format", value);
    }

    public MESParamDateWFrmtFilter forFormatStartingWith(String value) throws DatasweepException {
        return (MESParamDateWFrmtFilter)this.forColumnNameStartingWith("C_Format", value);
    }

    public MESParamDateWFrmtFilter forValueEqualTo(Time value) throws DatasweepException {
        return (MESParamDateWFrmtFilter)this.forColumnNameEqualTo("C_Value", value);
    }

    public MESParamDateWFrmtFilter forValueNotEqualTo(Time value) throws DatasweepException {
        return (MESParamDateWFrmtFilter)this.forColumnNameNotEqualTo("C_Value", value);
    }

    public MESParamDateWFrmtFilter forValueGreaterThanOrEqualTo(Time value) throws DatasweepException {
        return (MESParamDateWFrmtFilter)this.forColumnNameGreaterThanOrEqualTo("C_Value", value);
    }

    public MESParamDateWFrmtFilter forValueLessThan(Time value) throws DatasweepException {
        return (MESParamDateWFrmtFilter)this.forColumnNameLessThan("C_Value", value);
    }
}
