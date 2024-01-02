package com.adasoft.ftps.parameter.duratpropdef0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.functional.MESDuration;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamDuratPropDefFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "L_ParamDuratPropDef0100";

    public MESParamDuratPropDefFilter(Server server) {
        super(server, "L_ParamDuratPropDef0100");
    }

    public MESParamDuratPropDefFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamDuratPropDef> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamDuratPropDef.class);
    }

    public MESParamDuratPropDefFilter forDefaultValueEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameEqualTo("L_DefaultValue", value);
    }

    public MESParamDuratPropDefFilter forDefaultValueNotEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameNotEqualTo("L_DefaultValue", value);
    }

    public MESParamDuratPropDefFilter forLowerLimitEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameEqualTo("L_LowerLimit", value);
    }

    public MESParamDuratPropDefFilter forLowerLimitNotEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameNotEqualTo("L_LowerLimit", value);
    }

    public MESParamDuratPropDefFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameEqualTo("L_property", value);
    }

    public MESParamDuratPropDefFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameNotEqualTo("L_property", value);
    }

    public MESParamDuratPropDefFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameContaining("L_property", value);
    }

    public MESParamDuratPropDefFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameStartingWith("L_property", value);
    }

    public MESParamDuratPropDefFilter forUpperLimitEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameEqualTo("L_UpperLimit", value);
    }

    public MESParamDuratPropDefFilter forUpperLimitNotEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameNotEqualTo("L_UpperLimit", value);
    }

    public MESParamDuratPropDefFilter forValueEditableEqualTo(Boolean value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameEqualTo("L_ValueEditable", value);
    }

    public MESParamDuratPropDefFilter forValueEditableNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamDuratPropDefFilter)this.forColumnNameNotEqualTo("L_ValueEditable", value);
    }
}
