package com.adasoft.ftps.parameter.datetime0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.datasweep.compatibility.ui.Time;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamDateTime extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "C_ParamDateTime0100";
    public static final String PROP_NAME_VALUE = "value";
    public static final String DB_COL_NAME_VALUE = "C_Value_T";
    public static final String COL_NAME_VALUE = "C_Value";

    public String getATDefinitionName() {
        return "C_ParamDateTime0100";
    }

    public MESParamDateTime(long key) {
        super(key);
    }

    public MESParamDateTime(MESParamDateTime source) {
        super(source);
    }

    public MESParamDateTime(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamDateTime() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public Time getValue() {
        return (Time)this.dgtATRow.getValue("C_Value");
    }

    public void setValue(Time value) {
        Time oldValue = this.getValue();
        this.dgtATRow.setValue("C_Value", value);
        this.pcs.firePropertyChange("value", oldValue, value);
    }

    public Response prepareATRowForSave(boolean isBulkSave) {
        Response res = super.prepareATRowForSave(isBulkSave);
        return res;
    }

    public String getDataAsString() {
        List<Object> result = new ArrayList();
        result.add(this.getValue());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
