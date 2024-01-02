package com.adasoft.ftps.parameter.datewfrmt0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.datasweep.compatibility.ui.Time;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamDateWFrmt extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "C_ParamDateWFrmt0100";
    public static final String PROP_NAME_FORMAT = "format";
    public static final String DB_COL_NAME_FORMAT = "C_Format_S";
    public static final String COL_NAME_FORMAT = "C_Format";
    public static final String PROP_NAME_VALUE = "value";
    public static final String DB_COL_NAME_VALUE = "C_Value_T";
    public static final String COL_NAME_VALUE = "C_Value";

    public String getATDefinitionName() {
        return "C_ParamDateWFrmt0100";
    }

    public MESParamDateWFrmt(long key) {
        super(key);
    }

    public MESParamDateWFrmt(MESParamDateWFrmt source) {
        super(source);
    }

    public MESParamDateWFrmt(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamDateWFrmt() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public String getFormat() {
        return (String)this.dgtATRow.getValue("C_Format");
    }

    public void setFormat(String value) {
        String oldValue = this.getFormat();
        this.dgtATRow.setValue("C_Format", value);
        this.pcs.firePropertyChange("format", oldValue, value);
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
        List<Object> result = new ArrayList<>();
        result.add(this.getFormat());
        result.add(this.getValue());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
