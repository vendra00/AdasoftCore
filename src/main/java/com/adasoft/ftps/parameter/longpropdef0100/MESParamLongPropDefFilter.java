package com.adasoft.ftps.parameter.longpropdef0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamLongPropDefFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "AD_ParamLongPropDef0100";

    public MESParamLongPropDefFilter(Server server) {
        super(server, "AD_ParamLongPropDef0100");
    }

    public MESParamLongPropDefFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamLongPropDef> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamLongPropDef.class);
    }

    public MESParamLongPropDefFilter forDefaultValueEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("AD_DefaultValue", value);
    }

    public MESParamLongPropDefFilter forDefaultValueNotEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("AD_DefaultValue", value);
    }

    public MESParamLongPropDefFilter forDefaultValueGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("AD_DefaultValue", value);
    }

    public MESParamLongPropDefFilter forDefaultValueLessThan(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameLessThan("AD_DefaultValue", value);
    }

    public MESParamLongPropDefFilter forLowerLimitEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("AD_LowerLimit", value);
    }

    public MESParamLongPropDefFilter forLowerLimitNotEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("AD_LowerLimit", value);
    }

    public MESParamLongPropDefFilter forLowerLimitGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("AD_LowerLimit", value);
    }

    public MESParamLongPropDefFilter forLowerLimitLessThan(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameLessThan("AD_LowerLimit", value);
    }

    public MESParamLongPropDefFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("AD_property", value);
    }

    public MESParamLongPropDefFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("AD_property", value);
    }

    public MESParamLongPropDefFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameContaining("AD_property", value);
    }

    public MESParamLongPropDefFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameStartingWith("AD_property", value);
    }

    public MESParamLongPropDefFilter forUpperLimitEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("AD_UpperLimit", value);
    }

    public MESParamLongPropDefFilter forUpperLimitNotEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("AD_UpperLimit", value);
    }

    public MESParamLongPropDefFilter forUpperLimitGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("AD_UpperLimit", value);
    }

    public MESParamLongPropDefFilter forUpperLimitLessThan(Long value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameLessThan("AD_UpperLimit", value);
    }

    public MESParamLongPropDefFilter forValueEditableEqualTo(Boolean value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameEqualTo("AD_ValueEditable", value);
    }

    public MESParamLongPropDefFilter forValueEditableNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamLongPropDefFilter)this.forColumnNameNotEqualTo("AD_ValueEditable", value);
    }
}
