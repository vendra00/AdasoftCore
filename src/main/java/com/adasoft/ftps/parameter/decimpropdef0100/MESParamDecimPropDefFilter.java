package com.adasoft.ftps.parameter.decimpropdef0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.MeasuredValue;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.functional.MeasuredValueUtilities;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import java.math.BigDecimal;
import java.util.List;

public class MESParamDecimPropDefFilter extends ATRowFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "L_ParamDecimPropDef0100";

    public MESParamDecimPropDefFilter(Server server) {
        super(server, "L_ParamDecimPropDef0100");
    }

    public MESParamDecimPropDefFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamDecimPropDef> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamDecimPropDef.class);
    }

    public MESParamDecimPropDefFilter forDefaultValueEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("L_DefaultValue", mv);
    }

    public MESParamDecimPropDefFilter forDefaultValueNotEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("L_DefaultValue", mv);
    }

    public MESParamDecimPropDefFilter forFractionalPlacesEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("L_FractionalPlaces", value);
    }

    public MESParamDecimPropDefFilter forFractionalPlacesNotEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("L_FractionalPlaces", value);
    }

    public MESParamDecimPropDefFilter forFractionalPlacesGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_FractionalPlaces", value);
    }

    public MESParamDecimPropDefFilter forFractionalPlacesLessThan(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameLessThan("L_FractionalPlaces", value);
    }

    public MESParamDecimPropDefFilter forIntegralPlacesEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("L_IntegralPlaces", value);
    }

    public MESParamDecimPropDefFilter forIntegralPlacesNotEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("L_IntegralPlaces", value);
    }

    public MESParamDecimPropDefFilter forIntegralPlacesGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("L_IntegralPlaces", value);
    }

    public MESParamDecimPropDefFilter forIntegralPlacesLessThan(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameLessThan("L_IntegralPlaces", value);
    }

    public MESParamDecimPropDefFilter forLowerLimitEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("L_LowerLimit", mv);
    }

    public MESParamDecimPropDefFilter forLowerLimitNotEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("L_LowerLimit", mv);
    }

    public MESParamDecimPropDefFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("L_property", value);
    }

    public MESParamDecimPropDefFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("L_property", value);
    }

    public MESParamDecimPropDefFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameContaining("L_property", value);
    }

    public MESParamDecimPropDefFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameStartingWith("L_property", value);
    }

    public MESParamDecimPropDefFilter forUpperLimitEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("L_UpperLimit", mv);
    }

    public MESParamDecimPropDefFilter forUpperLimitNotEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("L_UpperLimit", mv);
    }

    public MESParamDecimPropDefFilter forValueEditableEqualTo(Boolean value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("L_ValueEditable", value);
    }

    public MESParamDecimPropDefFilter forValueEditableNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("L_ValueEditable", value);
    }
}
