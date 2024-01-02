package com.adasoft.ftps.parameter.bigdecimal0100;

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

public class MESParamBigDecimal extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "C_ParamBigDecimal0100";
    public static final String PROP_NAME_VALUE = "value";
    public static final String DB_COL_NAME_VALUE = "C_Value_V";
    public static final String COL_NAME_VALUE = "C_Value";

    public String getATDefinitionName() {
        return "C_ParamBigDecimal0100";
    }

    public MESParamBigDecimal(long key) {
        super(key);
    }

    public MESParamBigDecimal(MESParamBigDecimal source) {
        super(source);
    }

    public MESParamBigDecimal(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamBigDecimal() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public BigDecimal getValue() {
        MeasuredValue mv = (MeasuredValue)this.dgtATRow.getValue("C_Value");
        return mv == null ? null : mv.getValue();
    }

    public void setValue(BigDecimal value) {
        BigDecimal oldValue = this.getValue();
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        this.dgtATRow.setValue("C_Value", mv);
        this.pcs.firePropertyChange("value", oldValue, value);
    }

    public Response prepareATRowForSave(boolean isBulkSave) {
        Response res = super.prepareATRowForSave(isBulkSave);
        return res;
    }

    public String getDataAsString() {
        List<Object> result = new ArrayList<>();
        result.add(this.getValue());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
