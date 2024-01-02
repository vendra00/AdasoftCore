package com.adasoft.ftps.parameter.mvalpropdef0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.datasweep.plantops.common.measuredvalue.IMeasuredValue;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.util.List;

public class MESParamMValPropDefFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "L_ParamMValPropDef0100";

    public MESParamMValPropDefFilter(Server server) {
        super(server, "L_ParamMValPropDef0100");
    }

    public MESParamMValPropDefFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamMValPropDef> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamMValPropDef.class);
    }

    public MESParamMValPropDefFilter forDefaultValueEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameEqualTo("L_DefaultValue", value);
    }

    public MESParamMValPropDefFilter forDefaultValueNotEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameNotEqualTo("L_DefaultValue", value);
    }

    public MESParamMValPropDefFilter forFractionalPlacesEqualTo(Long value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameEqualTo("L_FractionalPlaces", value);
    }

    public MESParamMValPropDefFilter forFractionalPlacesNotEqualTo(Long value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameNotEqualTo("L_FractionalPlaces", value);
    }

    public MESParamMValPropDefFilter forFractionalPlacesGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_FractionalPlaces", value);
    }

    public MESParamMValPropDefFilter forFractionalPlacesLessThan(Long value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameLessThan("L_FractionalPlaces", value);
    }

    public MESParamMValPropDefFilter forIntegralPlacesEqualTo(Long value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameEqualTo("L_IntegralPlaces", value);
    }

    public MESParamMValPropDefFilter forIntegralPlacesNotEqualTo(Long value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameNotEqualTo("L_IntegralPlaces", value);
    }

    public MESParamMValPropDefFilter forIntegralPlacesGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_IntegralPlaces", value);
    }

    public MESParamMValPropDefFilter forIntegralPlacesLessThan(Long value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameLessThan("L_IntegralPlaces", value);
    }

    public MESParamMValPropDefFilter forLowerLimitEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameEqualTo("L_LowerLimit", value);
    }

    public MESParamMValPropDefFilter forLowerLimitNotEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameNotEqualTo("L_LowerLimit", value);
    }

    public MESParamMValPropDefFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameEqualTo("L_property", value);
    }

    public MESParamMValPropDefFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameNotEqualTo("L_property", value);
    }

    public MESParamMValPropDefFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameContaining("L_property", value);
    }

    public MESParamMValPropDefFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameStartingWith("L_property", value);
    }

    public MESParamMValPropDefFilter forUpperLimitEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameEqualTo("L_UpperLimit", value);
    }

    public MESParamMValPropDefFilter forUpperLimitNotEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameNotEqualTo("L_UpperLimit", value);
    }

    public MESParamMValPropDefFilter forValueEditableEqualTo(Boolean value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameEqualTo("L_ValueEditable", value);
    }

    public MESParamMValPropDefFilter forValueEditableNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamMValPropDefFilter)this.forColumnNameNotEqualTo("L_ValueEditable", value);
    }
}
