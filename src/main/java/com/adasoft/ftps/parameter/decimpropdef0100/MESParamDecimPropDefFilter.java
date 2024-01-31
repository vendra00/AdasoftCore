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
    protected static final String ATDEFINITION_NAME = "AD_ParamDecimPropDef0100";

    public MESParamDecimPropDefFilter(Server server) {
        super(server, "AD_ParamDecimPropDef0100");
    }

    public MESParamDecimPropDefFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESParamDecimPropDef> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESParamDecimPropDef.class);
    }

    public MESParamDecimPropDefFilter forDefaultValueEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("AD_DefaultValue", mv);
    }

    public MESParamDecimPropDefFilter forDefaultValueNotEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("AD_DefaultValue", mv);
    }

    public MESParamDecimPropDefFilter forFractionalPlacesEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("AD_FractionalPlaces", value);
    }

    public MESParamDecimPropDefFilter forFractionalPlacesNotEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("AD_FractionalPlaces", value);
    }

    public MESParamDecimPropDefFilter forFractionalPlacesGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("AD_FractionalPlaces", value);
    }

    public MESParamDecimPropDefFilter forFractionalPlacesLessThan(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameLessThan("AD_FractionalPlaces", value);
    }

    public MESParamDecimPropDefFilter forIntegralPlacesEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("AD_IntegralPlaces", value);
    }

    public MESParamDecimPropDefFilter forIntegralPlacesNotEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("AD_IntegralPlaces", value);
    }

    public MESParamDecimPropDefFilter forIntegralPlacesGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameGreaterThanOrEqualTo("AD_IntegralPlaces", value);
    }

    public MESParamDecimPropDefFilter forIntegralPlacesLessThan(Long value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameLessThan("AD_IntegralPlaces", value);
    }

    public MESParamDecimPropDefFilter forLowerLimitEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("AD_LowerLimit", mv);
    }

    public MESParamDecimPropDefFilter forLowerLimitNotEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("AD_LowerLimit", mv);
    }

    public MESParamDecimPropDefFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("AD_property", value);
    }

    public MESParamDecimPropDefFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("AD_property", value);
    }

    public MESParamDecimPropDefFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameContaining("AD_property", value);
    }

    public MESParamDecimPropDefFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameStartingWith("AD_property", value);
    }

    public MESParamDecimPropDefFilter forUpperLimitEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("AD_UpperLimit", mv);
    }

    public MESParamDecimPropDefFilter forUpperLimitNotEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("AD_UpperLimit", mv);
    }

    public MESParamDecimPropDefFilter forValueEditableEqualTo(Boolean value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameEqualTo("AD_ValueEditable", value);
    }

    public MESParamDecimPropDefFilter forValueEditableNotEqualTo(Boolean value) throws DatasweepException {
        return (MESParamDecimPropDefFilter)this.forColumnNameNotEqualTo("AD_ValueEditable", value);
    }
}
