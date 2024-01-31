package com.adasoft.ftps.parameter.mvalpropdef0100;


import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.datasweep.plantops.common.measuredvalue.IMeasuredValue;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamMValPropDef extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "AD_ParamMValPropDef0100";
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
        return "AD_ParamMValPropDef0100";
    }

    public MESParamMValPropDef(long key) {
        super(key);
    }

    public MESParamMValPropDef(MESParamMValPropDef source) {
        super(source);
    }

    public MESParamMValPropDef(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamMValPropDef() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public IMeasuredValue getDefaultValue() {
        return (IMeasuredValue)this.dgtATRow.getValue("AD_DefaultValue");
    }

    public void setDefaultValue(IMeasuredValue value) {
        IMeasuredValue oldValue = this.getDefaultValue();
        this.dgtATRow.setValue("AD_DefaultValue", value);
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

    public IMeasuredValue getLowerLimit() {
        return (IMeasuredValue)this.dgtATRow.getValue("AD_LowerLimit");
    }

    public void setLowerLimit(IMeasuredValue value) {
        IMeasuredValue oldValue = this.getLowerLimit();
        this.dgtATRow.setValue("AD_LowerLimit", value);
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

    public IMeasuredValue getUpperLimit() {
        return (IMeasuredValue)this.dgtATRow.getValue("AD_UpperLimit");
    }

    public void setUpperLimit(IMeasuredValue value) {
        IMeasuredValue oldValue = this.getUpperLimit();
        this.dgtATRow.setValue("AD_UpperLimit", value);
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
        List<Object> result = new ArrayList();
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