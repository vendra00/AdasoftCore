package com.adasoft.ftps.parameter.stringpropdef0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamStringPropDefFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "L_ParamStringPropDef0100";

    public MESParamStringPropDefFilter(Server server) {
        super(server, "L_ParamStringPropDef0100");
    }

    public MESParamStringPropDefFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamStringPropDef> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamStringPropDef.class);
    }

    public MESParamStringPropDefFilter forDefaultValueEqualTo(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameEqualTo("L_DefaultValue", value);
    }

    public MESParamStringPropDefFilter forDefaultValueNotEqualTo(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameNotEqualTo("L_DefaultValue", value);
    }

    public MESParamStringPropDefFilter forDefaultValueContaining(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameContaining("L_DefaultValue", value);
    }

    public MESParamStringPropDefFilter forDefaultValueStartingWith(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameStartingWith("L_DefaultValue", value);
    }

    public MESParamStringPropDefFilter forExpectedValueEqualTo(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameEqualTo("L_ExpectedValue", value);
    }

    public MESParamStringPropDefFilter forExpectedValueNotEqualTo(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameNotEqualTo("L_ExpectedValue", value);
    }

    public MESParamStringPropDefFilter forExpectedValueContaining(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameContaining("L_ExpectedValue", value);
    }

    public MESParamStringPropDefFilter forExpectedValueStartingWith(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameStartingWith("L_ExpectedValue", value);
    }

    public MESParamStringPropDefFilter forMaximumStringLengthEqualTo(Long value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameEqualTo("L_MaximumStringLength", value);
    }

    public MESParamStringPropDefFilter forMaximumStringLengthNotEqualTo(Long value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameNotEqualTo("L_MaximumStringLength", value);
    }

    public MESParamStringPropDefFilter forMaximumStringLengthGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_MaximumStringLength", value);
    }

    public MESParamStringPropDefFilter forMaximumStringLengthLessThan(Long value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameLessThan("L_MaximumStringLength", value);
    }

    public MESParamStringPropDefFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameEqualTo("L_property", value);
    }

    public MESParamStringPropDefFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameNotEqualTo("L_property", value);
    }

    public MESParamStringPropDefFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameContaining("L_property", value);
    }

    public MESParamStringPropDefFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameStartingWith("L_property", value);
    }

    public MESParamStringPropDefFilter forValueEditableEqualTo(Boolean value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameEqualTo("L_ValueEditable", value);
    }

    public MESParamStringPropDefFilter forValueEditableNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamStringPropDefFilter)this.forColumnNameNotEqualTo("L_ValueEditable", value);
    }
}
