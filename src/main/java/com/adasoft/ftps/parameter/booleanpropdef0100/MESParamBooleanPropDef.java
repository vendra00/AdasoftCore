package com.adasoft.ftps.parameter.booleanpropdef0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamBooleanPropDef extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "L_ParamBooleanPropDef0100";
    public static final String PROP_NAME_DEFAULTVALUE = "defaultValue";
    public static final String DB_COL_NAME_DEFAULTVALUE = "L_DefaultValue_I";
    public static final String COL_NAME_DEFAULTVALUE = "L_DefaultValue";
    public static final String PROP_NAME_EXPECTEDVALUE = "expectedValue";
    public static final String DB_COL_NAME_EXPECTEDVALUE = "L_ExpectedValue_I";
    public static final String COL_NAME_EXPECTEDVALUE = "L_ExpectedValue";
    public static final String PROP_NAME_PROPERTY = "property";
    public static final String DB_COL_NAME_PROPERTY = "L_Property_S";
    public static final String COL_NAME_PROPERTY = "L_Property";
    public static final String PROP_NAME_VALUEEDITABLE = "valueEditable";
    public static final String DB_COL_NAME_VALUEEDITABLE = "L_ValueEditable_Y";
    public static final String COL_NAME_VALUEEDITABLE = "L_ValueEditable";

    public String getATDefinitionName() {
        return "L_ParamBooleanPropDef0100";
    }

    public MESParamBooleanPropDef(long key) {
        super(key);
    }

    public MESParamBooleanPropDef(MESParamBooleanPropDef source) {
        super(source);
    }

    public MESParamBooleanPropDef(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamBooleanPropDef() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public Long getDefaultValue() {
        return (Long)this.dgtATRow.getValue("L_DefaultValue");
    }

    public void setDefaultValue(Long value) {
        Long oldValue = this.getDefaultValue();
        this.dgtATRow.setValue("L_DefaultValue", value);
        this.pcs.firePropertyChange("defaultValue", oldValue, value);
    }

    public Long getExpectedValue() {
        return (Long)this.dgtATRow.getValue("L_ExpectedValue");
    }

    public void setExpectedValue(Long value) {
        Long oldValue = this.getExpectedValue();
        this.dgtATRow.setValue("L_ExpectedValue", value);
        this.pcs.firePropertyChange("expectedValue", oldValue, value);
    }

    public String getProperty() {
        return (String)this.dgtATRow.getValue("L_Property");
    }

    public void setProperty(String value) {
        String oldValue = this.getProperty();
        this.dgtATRow.setValue("L_Property", value);
        this.pcs.firePropertyChange("property", oldValue, value);
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
        result.add(this.getDefaultValue());
        result.add(this.getExpectedValue());
        result.add(this.getProperty());
        result.add(this.getValueEditable());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}