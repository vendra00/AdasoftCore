package com.adasoft.ftps.parameter.mastbundlident0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamMastBundlIdentFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "AD_ParamMastBundlIdent0100";

    public MESParamMastBundlIdentFilter(Server server) {
        super(server, "AD_ParamMastBundlIdent0100");
    }

    public MESParamMastBundlIdentFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamMastBundlIdent> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamMastBundlIdent.class);
    }

    public MESParamMastBundlIdentFilter forDescriptionEqualTo(String value) throws DatasweepException {
        return (MESParamMastBundlIdentFilter)this.forColumnNameEqualTo("AD_description", value);
    }

    public MESParamMastBundlIdentFilter forDescriptionNotEqualTo(String value) throws DatasweepException {
        return (MESParamMastBundlIdentFilter)this.forColumnNameNotEqualTo("AD_description", value);
    }

    public MESParamMastBundlIdentFilter forDescriptionContaining(String value) throws DatasweepException {
        return (MESParamMastBundlIdentFilter)this.forColumnNameContaining("AD_description", value);
    }

    public MESParamMastBundlIdentFilter forDescriptionStartingWith(String value) throws DatasweepException {
        return (MESParamMastBundlIdentFilter)this.forColumnNameStartingWith("AD_description", value);
    }

    public MESParamMastBundlIdentFilter forShortDescriptionEqualTo(String value) throws DatasweepException {
        return (MESParamMastBundlIdentFilter)this.forColumnNameEqualTo("AD_ShortDescription", value);
    }

    public MESParamMastBundlIdentFilter forShortDescriptionNotEqualTo(String value) throws DatasweepException {
        return (MESParamMastBundlIdentFilter)this.forColumnNameNotEqualTo("AD_ShortDescription", value);
    }

    public MESParamMastBundlIdentFilter forShortDescriptionContaining(String value) throws DatasweepException {
        return (MESParamMastBundlIdentFilter)this.forColumnNameContaining("AD_ShortDescription", value);
    }

    public MESParamMastBundlIdentFilter forShortDescriptionStartingWith(String value) throws DatasweepException {
        return (MESParamMastBundlIdentFilter)this.forColumnNameStartingWith("AD_ShortDescription", value);
    }
}
