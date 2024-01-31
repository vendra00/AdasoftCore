package com.adasoft.ftps.parameter.booleanoptions0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamBooleanOptionsFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "AD_ParamBooleanOptions0100";

    public MESParamBooleanOptionsFilter(Server server) {
        super(server, "AD_ParamBooleanOptions0100");
    }

    public MESParamBooleanOptionsFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamBooleanOptions> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamBooleanOptions.class);
    }

    public MESParamBooleanOptionsFilter forDisplayTextForFalseEqualTo(String value) throws DatasweepException {
        return (MESParamBooleanOptionsFilter)this.forColumnNameEqualTo("AD_DisplayTextForFalse", value);
    }

    public MESParamBooleanOptionsFilter forDisplayTextForFalseNotEqualTo(String value) throws DatasweepException {
        return (MESParamBooleanOptionsFilter)this.forColumnNameNotEqualTo("AD_DisplayTextForFalse", value);
    }

    public MESParamBooleanOptionsFilter forDisplayTextForFalseContaining(String value) throws DatasweepException {
        return (MESParamBooleanOptionsFilter)this.forColumnNameContaining("AD_DisplayTextForFalse", value);
    }

    public MESParamBooleanOptionsFilter forDisplayTextForFalseStartingWith(String value) throws DatasweepException {
        return (MESParamBooleanOptionsFilter)this.forColumnNameStartingWith("AD_DisplayTextForFalse", value);
    }

    public MESParamBooleanOptionsFilter forDisplayTextForTrueEqualTo(String value) throws DatasweepException {
        return (MESParamBooleanOptionsFilter)this.forColumnNameEqualTo("AD_DisplayTextForTrue", value);
    }

    public MESParamBooleanOptionsFilter forDisplayTextForTrueNotEqualTo(String value) throws DatasweepException {
        return (MESParamBooleanOptionsFilter)this.forColumnNameNotEqualTo("AD_DisplayTextForTrue", value);
    }

    public MESParamBooleanOptionsFilter forDisplayTextForTrueContaining(String value) throws DatasweepException {
        return (MESParamBooleanOptionsFilter)this.forColumnNameContaining("AD_DisplayTextForTrue", value);
    }

    public MESParamBooleanOptionsFilter forDisplayTextForTrueStartingWith(String value) throws DatasweepException {
        return (MESParamBooleanOptionsFilter)this.forColumnNameStartingWith("AD_DisplayTextForTrue", value);
    }
}
