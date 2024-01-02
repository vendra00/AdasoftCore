package com.adasoft.ftps.parameter.longpropdef0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamLongPropDefFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "L_ParamLongPropDef0100";

    public MESParamLongPropDefFilter(Server server) {
        super(server, "L_ParamLongPropDef0100");
    }

    public MESParamLongPropDefFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamLongPropDef> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamLongPropDef.class);
    }

    public MESParamLongPropDefFilter forDefaultValueEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("L_DefaultValue", value);
    }

    public MESParamLongPropDefFilter forDefaultValueNotEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("L_DefaultValue", value);
    }

    public MESParamLongPropDefFilter forDefaultValueGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_DefaultValue", value);
    }

    public MESParamLongPropDefFilter forDefaultValueLessThan(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameLessThan("L_DefaultValue", value);
    }

    public MESParamLongPropDefFilter forLowerLimitEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("L_LowerLimit", value);
    }

    public MESParamLongPropDefFilter forLowerLimitNotEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("L_LowerLimit", value);
    }

    public MESParamLongPropDefFilter forLowerLimitGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_LowerLimit", value);
    }

    public MESParamLongPropDefFilter forLowerLimitLessThan(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameLessThan("L_LowerLimit", value);
    }

    public MESParamLongPropDefFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("L_property", value);
    }

    public MESParamLongPropDefFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("L_property", value);
    }

    public MESParamLongPropDefFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameContaining("L_property", value);
    }

    public MESParamLongPropDefFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameStartingWith("L_property", value);
    }

    public MESParamLongPropDefFilter forUpperLimitEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("L_UpperLimit", value);
    }

    public MESParamLongPropDefFilter forUpperLimitNotEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("L_UpperLimit", value);
    }

    public MESParamLongPropDefFilter forUpperLimitGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_UpperLimit", value);
    }

    public MESParamLongPropDefFilter forUpperLimitLessThan(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameLessThan("L_UpperLimit", value);
    }

    public MESParamLongPropDefFilter forValueEditableEqualTo(Boolean value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("L_ValueEditable", value);
    }

    public MESParamLongPropDefFilter forValueEditableNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("L_ValueEditable", value);
    }
}
