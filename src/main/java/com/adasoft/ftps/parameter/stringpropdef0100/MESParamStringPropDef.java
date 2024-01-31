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
    protected static final String ATDEFINITION_NAME = "AD_ParamStringPropDef0100";
    public static final String PROP_NAME_DEFAULTVALUE = "defaultValue";
    public static final String DB_COAD_NAME_DEFAULTVALUE = "AD_DefaultValue_S";
    public static final String COAD_NAME_DEFAULTVALUE = "AD_DefaultValue";
    public static final String PROP_NAME_EXPECTEDVALUE = "expectedValue";
    public static final String DB_COAD_NAME_EXPECTEDVALUE = "AD_ExpectedValue_S";
    public static final String COAD_NAME_EXPECTEDVALUE = "AD_ExpectedValue";
    public static final String PROP_NAME_MAXIMUMSTRINGLENGTH = "maximumStringLength";
    public static final String DB_COAD_NAME_MAXIMUMSTRINGLENGTH = "AD_MaximumStringLength_I";
    public static final String COAD_NAME_MAXIMUMSTRINGLENGTH = "AD_MaximumStringLength";
    public static final String PROP_NAME_PROPERTY = "property";
    public static final String DB_COAD_NAME_PROPERTY = "AD_property_S";
    public static final String COAD_NAME_PROPERTY = "AD_property";
    public static final String PROP_NAME_VALUEEDITABLE = "valueEditable";
    public static final String DB_COAD_NAME_VALUEEDITABLE = "AD_ValueEditable_Y";
    public static final String COAD_NAME_VALUEEDITABLE = "AD_ValueEditable";

    public String getATDefinitionName() {
        return "AD_ParamStringPropDef0100";
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
        return (String)this.dgtATRow.getValue("AD_DefaultValue");
    }

    public void setDefaultValue(String value) {
        String oldValue = this.getDefaultValue();
        this.dgtATRow.setValue("AD_DefaultValue", value);
        this.pcs.firePropertyChange("defaultValue", oldValue, value);
    }

    public String getExpectedValue() {
        return (String)this.dgtATRow.getValue("AD_ExpectedValue");
    }

    public void setExpectedValue(String value) {
        String oldValue = this.getExpectedValue();
        this.dgtATRow.setValue("AD_ExpectedValue", value);
        this.pcs.firePropertyChange("expectedValue", oldValue, value);
    }

    public Long getMaximumStringLength() {
        return (Long)this.dgtATRow.getValue("AD_MaximumStringLength");
    }

    public void setMaximumStringLength(Long value) {
        Long oldValue = this.getMaximumStringLength();
        this.dgtATRow.setValue("AD_MaximumStringLength", value);
        this.pcs.firePropertyChange("maximumStringLength", oldValue, value);
    }

    public String getProperty() {
        return (String)this.dgtATRow.getValue("AD_property");
    }

    public void setProperty(String value) {
        String oldValue = this.getProperty();
        this.dgtATRow.setValue("AD_property", value);
        this.pcs.firePropertyChange("property", oldValue, value);
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
