package com.adasoft.ftps.parameter.booleanoptions0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamBooleanOptions extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "L_ParamBooleanOptions0100";
    public static final String PROP_NAME_DISPLAYTEXTFORFALSE = "displayTextForFalse";
    public static final String DB_COL_NAME_DISPLAYTEXTFORFALSE = "L_DisplayTextForFalse_S";
    public static final String COL_NAME_DISPLAYTEXTFORFALSE = "L_DisplayTextForFalse";
    public static final String PROP_NAME_DISPLAYTEXTFORTRUE = "displayTextForTrue";
    public static final String DB_COL_NAME_DISPLAYTEXTFORTRUE = "L_DisplayTextForTrue_S";
    public static final String COL_NAME_DISPLAYTEXTFORTRUE = "L_DisplayTextForTrue";

    public String getATDefinitionName() {
        return "L_ParamBooleanOptions0100";
    }

    public MESParamBooleanOptions(long key) {
        super(key);
    }

    public MESParamBooleanOptions(MESParamBooleanOptions source) {
        super(source);
    }

    public MESParamBooleanOptions(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamBooleanOptions() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public String getDisplayTextForFalse() {
        return (String)this.dgtATRow.getValue("L_DisplayTextForFalse");
    }

    public void setDisplayTextForFalse(String value) {
        String oldValue = this.getDisplayTextForFalse();
        this.dgtATRow.setValue("L_DisplayTextForFalse", value);
        this.pcs.firePropertyChange("displayTextForFalse", oldValue, value);
    }

    public String getDisplayTextForTrue() {
        return (String)this.dgtATRow.getValue("L_DisplayTextForTrue");
    }

    public void setDisplayTextForTrue(String value) {
        String oldValue = this.getDisplayTextForTrue();
        this.dgtATRow.setValue("L_DisplayTextForTrue", value);
        this.pcs.firePropertyChange("displayTextForTrue", oldValue, value);
    }

    public Response prepareATRowForSave(boolean isBulkSave) {
        Response res = super.prepareATRowForSave(isBulkSave);
        return res;
    }

    public String getDataAsString() {
        List<Object> result = new ArrayList();
        result.add(this.getDisplayTextForFalse());
        result.add(this.getDisplayTextForTrue());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
