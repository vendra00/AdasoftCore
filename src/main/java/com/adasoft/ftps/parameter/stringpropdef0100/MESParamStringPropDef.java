package com.adasoft.ftps.parameter.stringpropdef0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamStringPropDef extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "L_ParamStringPropDef0100";
    public static final String PROP_NAME_DEFAULTVALUE = "defaultValue";
    public static final String DB_COL_NAME_DEFAULTVALUE = "L_DefaultValue_S";
    public static final String COL_NAME_DEFAULTVALUE = "L_DefaultValue";
    public static final String PROP_NAME_EXPECTEDVALUE = "expectedValue";
    public static final String DB_COL_NAME_EXPECTEDVALUE = "L_ExpectedValue_S";
    public static final String COL_NAME_EXPECTEDVALUE = "L_ExpectedValue";
    public static final String PROP_NAME_MAXIMUMSTRINGLENGTH = "maximumStringLength";
    public static final String DB_COL_NAME_MAXIMUMSTRINGLENGTH = "L_MaximumStringLength_I";
    public static final String COL_NAME_MAXIMUMSTRINGLENGTH = "L_MaximumStringLength";
    public static final String PROP_NAME_PROPERTY = "property";
    public static final String DB_COL_NAME_PROPERTY = "L_property_S";
    public static final String COL_NAME_PROPERTY = "L_property";
    public static final String PROP_NAME_VALUEEDITABLE = "valueEditable";
    public static final String DB_COL_NAME_VALUEEDITABLE = "L_ValueEditable_Y";
    public static final String COL_NAME_VALUEEDITABLE = "L_ValueEditable";

    public String getATDefinitionName() {
        return "L_ParamStringPropDef0100";
    }

    public MESParamStringPropDef(long key) {
        super(key);
    }

    public MESParamStringPropDef(MESParamStringPropDef source) {
        super(source);
    }

    public MESParamStringPropDef(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamStringPropDef() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public String getDefaultValue() {
        return (String)this.dgtATRow.getValue("L_DefaultValue");
    }

    public void setDefaultValue(String value) {
        String oldValue = this.getDefaultValue();
        this.dgtATRow.setValue("L_DefaultValue", value);
        this.pcs.firePropertyChange("defaultValue", oldValue, value);
    }

    public String getExpectedValue() {
        return (String)this.dgtATRow.getValue("L_ExpectedValue");
    }

    public void setExpectedValue(String value) {
        String oldValue = this.getExpectedValue();
        this.dgtATRow.setValue("L_ExpectedValue", value);
        this.pcs.firePropertyChange("expectedValue", oldValue, value);
    }

    public Long getMaximumStringLength() {
        return (Long)this.dgtATRow.getValue("L_MaximumStringLength");
    }

    public void setMaximumStringLength(Long value) {
        Long oldValue = this.getMaximumStringLength();
        this.dgtATRow.setValue("L_MaximumStringLength", value);
        this.pcs.firePropertyChange("maximumStringLength", oldValue, value);
    }

    public String getProperty() {
        return (String)this.dgtATRow.getValue("L_property");
    }

    public void setProperty(String value) {
        String oldValue = this.getProperty();
        this.dgtATRow.setValue("L_property", value);
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
        result.add(this.getMaximumStringLength());
        result.add(this.getProperty());
        result.add(this.getValueEditable());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
