package com.adasoft.ftps.parameter.dattimepropdef0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.datasweep.compatibility.ui.Time;
import com.rockwell.mes.commons.base.ifc.functional.MESDuration;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamDatTimePropDefFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "L_ParamDatTimePropDef0100";

    public MESParamDatTimePropDefFilter(Server server) {
        super(server, "L_ParamDatTimePropDef0100");
    }

    public MESParamDatTimePropDefFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamDatTimePropDef> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamDatTimePropDef.class);
    }

    public MESParamDatTimePropDefFilter forDateFormatEqualTo(Long value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameEqualTo("L_DateFormat", value);
    }

    public MESParamDatTimePropDefFilter forDateFormatNotEqualTo(Long value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameNotEqualTo("L_DateFormat", value);
    }

    public MESParamDatTimePropDefFilter forDateFormatGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_DateFormat", value);
    }

    public MESParamDatTimePropDefFilter forDateFormatLessThan(Long value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameLessThan("L_DateFormat", value);
    }

    public MESParamDatTimePropDefFilter forDefaultValueEqualTo(Time value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameEqualTo("L_DefaultValue", value);
    }

    public MESParamDatTimePropDefFilter forDefaultValueNotEqualTo(Time value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameNotEqualTo("L_DefaultValue", value);
    }

    public MESParamDatTimePropDefFilter forDefaultValueGreaterThanOrEqualTo(Time value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_DefaultValue", value);
    }

    public MESParamDatTimePropDefFilter forDefaultValueLessThan(Time value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameLessThan("L_DefaultValue", value);
    }

    public MESParamDatTimePropDefFilter forHLimitEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameEqualTo("L_HLimit", value);
    }

    public MESParamDatTimePropDefFilter forHLimitNotEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameNotEqualTo("L_HLimit", value);
    }

    public MESParamDatTimePropDefFilter forLLimitEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameEqualTo("L_LLimit", value);
    }

    public MESParamDatTimePropDefFilter forLLimitNotEqualTo(MESDuration value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameNotEqualTo("L_LLimit", value);
    }

    public MESParamDatTimePropDefFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameEqualTo("L_property", value);
    }

    public MESParamDatTimePropDefFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameNotEqualTo("L_property", value);
    }

    public MESParamDatTimePropDefFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameContaining("L_property", value);
    }

    public MESParamDatTimePropDefFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameStartingWith("L_property", value);
    }

    public MESParamDatTimePropDefFilter forReferenceValueEqualTo(Time value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameEqualTo("L_ReferenceValue", value);
    }

    public MESParamDatTimePropDefFilter forReferenceValueNotEqualTo(Time value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameNotEqualTo("L_ReferenceValue", value);
    }

    public MESParamDatTimePropDefFilter forReferenceValueGreaterThanOrEqualTo(Time value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_ReferenceValue", value);
    }

    public MESParamDatTimePropDefFilter forReferenceValueLessThan(Time value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameLessThan("L_ReferenceValue", value);
    }

    public MESParamDatTimePropDefFilter forValueEditableEqualTo(Boolean value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameEqualTo("L_ValueEditable", value);
    }

    public MESParamDatTimePropDefFilter forValueEditableNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamDatTimePropDefFilter)this.forColumnNameNotEqualTo("L_ValueEditable", value);
    }
}
