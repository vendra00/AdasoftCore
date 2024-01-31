package com.adasoft.ftps.parameter.decimpropdef0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.MeasuredValue;
import com.datasweep.compatibility.client.Response;
import com.rockwell.mes.commons.base.ifc.functional.MeasuredValueUtilities;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamDecimPropDef extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "AD_ParamDecimPropDef0100";
    public static final String PROP_NAME_DEFAULTVALUE = "defaultValue";
    public static final String DB_COAD_NAME_DEFAULTVALUE = "AD_DefaultValue_V";
    public static final String COAD_NAME_DEFAULTVALUE = "AD_DefaultValue";
    public static final String PROP_NAME_FRACTIONALPLACES = "fractionalPlaces";
    public static final String DB_COAD_NAME_FRACTIONALPLACES = "AD_FractionalPlaces_I";
    public static final String COAD_NAME_FRACTIONALPLACES = "AD_FractionalPlaces";
    public static final String PROP_NAME_INTEGRALPLACES = "integralPlaces";
    public static final String DB_COAD_NAME_INTEGRALPLACES = "AD_IntegralPlaces_I";
    public static final String COAD_NAME_INTEGRALPLACES = "AD_IntegralPlaces";
    public static final String PROP_NAME_LOWERLIMIT = "lowerLimit";
    public static final String DB_COAD_NAME_LOWERLIMIT = "AD_LowerLimit_V";
    public static final String COAD_NAME_LOWERLIMIT = "AD_LowerLimit";
    public static final String PROP_NAME_PROPERTY = "property";
    public static final String DB_COAD_NAME_PROPERTY = "AD_property_S";
    public static final String COAD_NAME_PROPERTY = "AD_property";
    public static final String PROP_NAME_UPPERLIMIT = "upperLimit";
    public static final String DB_COAD_NAME_UPPERLIMIT = "AD_UpperLimit_V";
    public static final String COAD_NAME_UPPERLIMIT = "AD_UpperLimit";
    public static final String PROP_NAME_VALUEEDITABLE = "valueEditable";
    public static final String DB_COAD_NAME_VALUEEDITABLE = "AD_ValueEditable_Y";
    public static final String COAD_NAME_VALUEEDITABLE = "AD_ValueEditable";

    public String getATDefinitionName() {
        return "AD_ParamDecimPropDef0100";
    }

    public MESParamDecimPropDef(long key) {
        super(key);
    }

    public MESParamDecimPropDef(MESParamDecimPropDef source) {
        super(source);
    }

    public MESParamDecimPropDef(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamDecimPropDef() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public BigDecimal getDefaultValue() {
        MeasuredValue mv = (MeasuredValue)this.dgtATRow.getValue("AD_DefaultValue");
        return mv == null ? null : mv.getValue();
    }

    public void setDefaultValue(BigDecimal value) {
        BigDecimal oldValue = this.getDefaultValue();
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        this.dgtATRow.setValue("AD_DefaultValue", mv);
        this.pcs.firePropertyChange("defaultValue", oldValue, value);
    }

    public Long getFractionalPlaces() {
        return (Long)this.dgtATRow.getValue("AD_FractionalPlaces");
    }

    public void setFractionalPlaces(Long value) {
        Long oldValue = this.getFractionalPlaces();
        this.dgtATRow.setValue("AD_FractionalPlaces", value);
        this.pcs.firePropertyChange("fractionalPlaces", oldValue, value);
    }

    public Long getIntegralPlaces() {
        return (Long)this.dgtATRow.getValue("AD_IntegralPlaces");
    }

    public void setIntegralPlaces(Long value) {
        Long oldValue = this.getIntegralPlaces();
        this.dgtATRow.setValue("AD_IntegralPlaces", value);
        this.pcs.firePropertyChange("integralPlaces", oldValue, value);
    }

    public BigDecimal getLowerLimit() {
        MeasuredValue mv = (MeasuredValue)this.dgtATRow.getValue("AD_LowerLimit");
        return mv == null ? null : mv.getValue();
    }

    public void setLowerLimit(BigDecimal value) {
        BigDecimal oldValue = this.getLowerLimit();
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        this.dgtATRow.setValue("AD_LowerLimit", mv);
        this.pcs.firePropertyChange("lowerLimit", oldValue, value);
    }

    public String getProperty() {
        return (String)this.dgtATRow.getValue("AD_property");
    }

    public void setProperty(String value) {
        String oldValue = this.getProperty();
        this.dgtATRow.setValue("AD_property", value);
        this.pcs.firePropertyChange("property", oldValue, value);
    }

    public BigDecimal getUpperLimit() {
        MeasuredValue mv = (MeasuredValue)this.dgtATRow.getValue("AD_UpperLimit");
        return mv == null ? null : mv.getValue();
    }

    public void setUpperLimit(BigDecimal value) {
        BigDecimal oldValue = this.getUpperLimit();
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        this.dgtATRow.setValue("AD_UpperLimit", mv);
        this.pcs.firePropertyChange("upperLimit", oldValue, value);
    }

    public Boolean getValueEditable() {
        return (Boolean)this.dgtATRow.getValue("AD_ValueEditable");
    }

    public void setValueEditable(Boolean value) {
        Boolean oldValue = this.getValueEditable();
        this.dgtATRow.setValue("AD_ValueEditable", value);
        this.pcs.firePropertyChange("valueEditable", oldValue, value);
    }

    public Response prepareATRowForSave(boolean isBulkSave) {
        Response res = super.prepareATRowForSave(isBulkSave);
        return res;
    }

    public String getDataAsString() {
        List<Object> result = new ArrayList<>();
        result.add(this.getDefaultValue());
        result.add(this.getFractionalPlaces());
        result.add(this.getIntegralPlaces());
        result.add(this.getLowerLimit());
        result.add(this.getProperty());
        result.add(this.getUpperLimit());
        result.add(this.getValueEditable());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
