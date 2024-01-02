package com.adasoft.ftps.parameter.dattimepropdef0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.datasweep.compatibility.ui.Time;
import com.rockwell.mes.commons.base.ifc.functional.MESDuration;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamDatTimePropDef extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "L_ParamDatTimePropDef0100";
    public static final String PROP_NAME_DATEFORMAT = "dateFormat";
    public static final String DB_COL_NAME_DATEFORMAT = "L_DateFormat_I";
    public static final String COL_NAME_DATEFORMAT = "L_DateFormat";
    public static final String PROP_NAME_DEFAULTVALUE = "defaultValue";
    public static final String DB_COL_NAME_DEFAULTVALUE = "L_DefaultValue_T";
    public static final String COL_NAME_DEFAULTVALUE = "L_DefaultValue";
    public static final String PROP_NAME_HLIMIT = "hLimit";
    public static final String DB_COL_NAME_HLIMIT = "L_HLimit_I";
    public static final String COL_NAME_HLIMIT = "L_HLimit";
    public static final String PROP_NAME_LLIMIT = "lLimit";
    public static final String DB_COL_NAME_LLIMIT = "L_LLimit_I";
    public static final String COL_NAME_LLIMIT = "L_LLimit";
    public static final String PROP_NAME_PROPERTY = "property";
    public static final String DB_COL_NAME_PROPERTY = "L_property_S";
    public static final String COL_NAME_PROPERTY = "L_property";
    public static final String PROP_NAME_REFERENCEVALUE = "referenceValue";
    public static final String DB_COL_NAME_REFERENCEVALUE = "L_ReferenceValue_T";
    public static final String COL_NAME_REFERENCEVALUE = "L_ReferenceValue";
    public static final String PROP_NAME_VALUEEDITABLE = "valueEditable";
    public static final String DB_COL_NAME_VALUEEDITABLE = "L_ValueEditable_Y";
    public static final String COL_NAME_VALUEEDITABLE = "L_ValueEditable";

    public String getATDefinitionName() {
        return "L_ParamDatTimePropDef0100";
    }

    public MESParamDatTimePropDef(long key) {
        super(key);
    }

    public MESParamDatTimePropDef(MESParamDatTimePropDef source) {
        super(source);
    }

    public MESParamDatTimePropDef(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamDatTimePropDef() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public Long getDateFormat() {
        return (Long)this.dgtATRow.getValue("L_DateFormat");
    }

    public void setDateFormat(Long value) {
        Long oldValue = this.getDateFormat();
        this.dgtATRow.setValue("L_DateFormat", value);
        this.pcs.firePropertyChange("dateFormat", oldValue, value);
    }

    public Time getDefaultValue() {
        return (Time)this.dgtATRow.getValue("L_DefaultValue");
    }

    public void setDefaultValue(Time value) {
        Time oldValue = this.getDefaultValue();
        this.dgtATRow.setValue("L_DefaultValue", value);
        this.pcs.firePropertyChange("defaultValue", oldValue, value);
    }

    public MESDuration getHLimit() {
        Object value = this.dgtATRow.getValue("L_HLimit");
        return value != null ? MESDuration.fromLong((Long)value) : null;
    }

    public void setHLimit(MESDuration value) {
        MESDuration oldValue = this.getHLimit();
        this.dgtATRow.setValue("L_HLimit", value != null ? MESDuration.toLong(value) : null);
        this.pcs.firePropertyChange("hLimit", oldValue, value);
    }

    public MESDuration getLLimit() {
        Object value = this.dgtATRow.getValue("L_LLimit");
        return value != null ? MESDuration.fromLong((Long)value) : null;
    }

    public void setLLimit(MESDuration value) {
        MESDuration oldValue = this.getLLimit();
        this.dgtATRow.setValue("L_LLimit", value != null ? MESDuration.toLong(value) : null);
        this.pcs.firePropertyChange("lLimit", oldValue, value);
    }

    public String getProperty() {
        return (String)this.dgtATRow.getValue("L_property");
    }

    public void setProperty(String value) {
        String oldValue = this.getProperty();
        this.dgtATRow.setValue("L_property", value);
        this.pcs.firePropertyChange("property", oldValue, value);
    }

    public Time getReferenceValue() {
        return (Time)this.dgtATRow.getValue("L_ReferenceValue");
    }

    public void setReferenceValue(Time value) {
        Time oldValue = this.getReferenceValue();
        this.dgtATRow.setValue("L_ReferenceValue", value);
        this.pcs.firePropertyChange("referenceValue", oldValue, value);
    }

    public Boolean getValueEditable() {
        return (Boolean)this.dgtATRow.getValue("L_ValueEditable");
    }

    public void setValueEditable(Boolean value) {
        Boolean oldValue = this.getValueEditable();
        this.dgtATRow.setValue("L_ValueEditable", value);
        this.pcs.firePropertyChange("valueEditable", oldValue, value);
    }

    public Response prepareATRowForSave(boolean isBulkSave) {
        Response res = super.prepareATRowForSave(isBulkSave);
        return res;
    }

    public String getDataAsString() {
        List<Object> result = new ArrayList();
        result.add(this.getDateFormat());
        result.add(this.getDefaultValue());
        result.add(this.getHLimit());
        result.add(this.getLLimit());
        result.add(this.getProperty());
        result.add(this.getReferenceValue());
        result.add(this.getValueEditable());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
