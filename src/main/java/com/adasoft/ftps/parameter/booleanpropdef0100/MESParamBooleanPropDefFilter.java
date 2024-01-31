package com.adasoft.ftps.parameter.booleanpropdef0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamBooleanPropDefFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "AD_ParamBooleanPropDef0100";

    public MESParamBooleanPropDefFilter(Server server) {
        super(server, "AD_ParamBooleanPropDef0100");
    }

    public MESParamBooleanPropDefFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamBooleanPropDef> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamBooleanPropDef.class);
    }

    public MESParamBooleanPropDefFilter forDefaultValueEqualTo(Long value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameEqualTo("AD_DefaultValue", value);
    }

    public MESParamBooleanPropDefFilter forDefaultValueNotEqualTo(Long value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameNotEqualTo("AD_DefaultValue", value);
    }

    public MESParamBooleanPropDefFilter forDefaultValueGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("AD_DefaultValue", value);
    }

    public MESParamBooleanPropDefFilter forDefaultValueLessThan(Long value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameLessThan("AD_DefaultValue", value);
    }

    public MESParamBooleanPropDefFilter forExpectedValueEqualTo(Long value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameEqualTo("AD_ExpectedValue", value);
    }

    public MESParamBooleanPropDefFilter forExpectedValueNotEqualTo(Long value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameNotEqualTo("AD_ExpectedValue", value);
    }

    public MESParamBooleanPropDefFilter forExpectedValueGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("AD_ExpectedValue", value);
    }

    public MESParamBooleanPropDefFilter forExpectedValueLessThan(Long value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameLessThan("AD_ExpectedValue", value);
    }

    public MESParamBooleanPropDefFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameEqualTo("AD_Property", value);
    }

    public MESParamBooleanPropDefFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameNotEqualTo("AD_Property", value);
    }

    public MESParamBooleanPropDefFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameContaining("AD_Property", value);
    }

    public MESParamBooleanPropDefFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameStartingWith("AD_Property", value);
    }

    public MESParamBooleanPropDefFilter forValueEditableEqualTo(Boolean value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameEqualTo("AD_ValueEditable", value);
    }

    public MESParamBooleanPropDefFilter forValueEditableNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamBooleanPropDefFilter)this.forColumnNameNotEqualTo("AD_ValueEditable", value);
    }
}
