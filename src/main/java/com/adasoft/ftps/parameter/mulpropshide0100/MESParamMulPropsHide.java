package com.adasoft.ftps.parameter.mulpropshide0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamMulPropsHide extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "AD_ParamMulPropsHide0100";
    public static final String PROP_NAME_MAKEPHASEHIDDEN = "makePhaseHidden";
    public static final String DB_COAD_NAME_MAKEPHASEHIDDEN = "AD_MakePhaseHidden_Y";
    public static final String COAD_NAME_MAKEPHASEHIDDEN = "AD_MakePhaseHidden";

    public String getATDefinitionName() {
        return "AD_ParamMulPropsHide0100";
    }

    public MESParamMulPropsHide(long key) {
        super(key);
    }

    public MESParamMulPropsHide(MESParamMulPropsHide source) {
        super(source);
    }

    public MESParamMulPropsHide(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamMulPropsHide() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public Boolean getMakePhaseHidden() {
        return (Boolean)this.dgtATRow.getValue("AD_MakePhaseHidden");
    }

    public void setMakePhaseHidden(Boolean value) {
        Boolean oldValue = this.getMakePhaseHidden();
        this.dgtATRow.setValue("AD_MakePhaseHidden", value);
        this.pcs.firePropertyChange("makePhaseHidden", oldValue, value);
    }

    public Response prepareATRowForSave(boolean isBulkSave) {
        Response res = super.prepareATRowForSave(isBulkSave);
        return res;
    }

    public String getDataAsString() {
        List<Object> result = new ArrayList();
        result.add(this.getMakePhaseHidden());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
