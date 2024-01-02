package com.adasoft.ftps.parameter.mastbundlident0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESParamMastBundlIdent extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "L_ParamMastBundlIdent0100";
    public static final String PROP_NAME_DESCRIPTION = "description";
    public static final String DB_COL_NAME_DESCRIPTION = "L_description_S";
    public static final String COL_NAME_DESCRIPTION = "L_description";
    public static final String PROP_NAME_SHORTDESCRIPTION = "shortDescription";
    public static final String DB_COL_NAME_SHORTDESCRIPTION = "L_ShortDescription_S";
    public static final String COL_NAME_SHORTDESCRIPTION = "L_ShortDescription";

    public String getATDefinitionName() {
        return "L_ParamMastBundlIdent0100";
    }

    public MESParamMastBundlIdent(long key) {
        super(key);
    }

    public MESParamMastBundlIdent(MESParamMastBundlIdent source) {
        super(source);
    }

    public MESParamMastBundlIdent(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamMastBundlIdent() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public String getDescription() {
        return (String)this.dgtATRow.getValue("L_description");
    }

    public void setDescription(String value) {
        String oldValue = this.getDescription();
        this.dgtATRow.setValue("L_description", value);
        this.pcs.firePropertyChange("description", oldValue, value);
    }

    public String getShortDescription() {
        return (String)this.dgtATRow.getValue("L_ShortDescription");
    }

    public void setShortDescription(String value) {
        String oldValue = this.getShortDescription();
        this.dgtATRow.setValue("L_ShortDescription", value);
        this.pcs.firePropertyChange("shortDescription", oldValue, value);
    }

    public Response prepareATRowForSave(boolean isBulkSave) {
        Response res = super.prepareATRowForSave(isBulkSave);
        return res;
    }

    public String getDataAsString() {
        List<Object> result = new ArrayList();
        result.add(this.getDescription());
        result.add(this.getShortDescription());
        return StringUtils.join(result, ';');
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
