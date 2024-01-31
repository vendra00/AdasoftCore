package com.adasoft.ftps.phase.setmultrtprops0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.MeasuredValue;
import com.datasweep.compatibility.client.Server;
import com.datasweep.compatibility.ui.Time;
import com.datasweep.plantops.common.measuredvalue.IMeasuredValue;
import com.rockwell.mes.commons.base.ifc.functional.MESDuration;
import com.rockwell.mes.commons.base.ifc.functional.MeasuredValueUtilities;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import com.rockwell.mes.services.s88.ifc.execution.IMESRtPhase;
import com.rockwell.mes.services.s88.ifc.processdata.IMESRtPhaseDataFilter;
import java.math.BigDecimal;
import java.util.List;

public class MESRtPhaseDataSetMultRtPropsFilter extends ATRowFilter implements IMESRtPhaseDataFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "AD_PhDatSetMultRtProps0100";

    public MESRtPhaseDataSetMultRtPropsFilter(Server server) {
        super(server, "AD_PhDatSetMultRtProps0100");
    }

    public MESRtPhaseDataSetMultRtPropsFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESRtPhaseDataSetMultRtProps> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESRtPhaseDataSetMultRtProps.class);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forParentEqualTo(IMESRtPhase value) throws DatasweepException {
        String columnName = "X_parent";
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo(columnName, new Long(value.getKey()));
    }

    public MESRtPhaseDataSetMultRtPropsFilter forParentNotEqualTo(IMESRtPhase value) throws DatasweepException {
        String columnName = "X_parent";
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo(columnName, new Long(value.getKey()));
    }

    public MESRtPhaseDataSetMultRtPropsFilter forBooleanValueEqualTo(Boolean value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_BooleanValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forBooleanValueNotEqualTo(Boolean value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_BooleanValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forBundleIdEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_BundleId", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forBundleIdNotEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_BundleId", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forBundleIdContaining(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameContaining("AD_BundleId", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forBundleIdStartingWith(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameStartingWith("AD_BundleId", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forCreationSeqIndexEqualTo(Long value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("X_creationSeqIndex", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forCreationSeqIndexNotEqualTo(Long value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("X_creationSeqIndex", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forCreationSeqIndexGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameGreaterThanOrEqualTo("X_creationSeqIndex", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forCreationSeqIndexLessThan(Long value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameLessThan("X_creationSeqIndex", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDateTimeFormatEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_DateTimeFormat", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDateTimeFormatNotEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_DateTimeFormat", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDateTimeFormatContaining(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameContaining("AD_DateTimeFormat", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDateTimeFormatStartingWith(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameStartingWith("AD_DateTimeFormat", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDateTimeValueEqualTo(Time value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_DateTimeValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDateTimeValueNotEqualTo(Time value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_DateTimeValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDateTimeValueGreaterThanOrEqualTo(Time value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameGreaterThanOrEqualTo("AD_DateTimeValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDateTimeValueLessThan(Time value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameLessThan("AD_DateTimeValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDecimalValueEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_DecimalValue", mv);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDecimalValueNotEqualTo(BigDecimal value) throws DatasweepException {
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_DecimalValue", mv);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDurationValueEqualTo(MESDuration value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_DurationValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forDurationValueNotEqualTo(MESDuration value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_DurationValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forEquipEntityIdEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_EquipEntityId", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forEquipEntityIdNotEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_EquipEntityId", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forEquipEntityIdContaining(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameContaining("AD_EquipEntityId", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forEquipEntityIdStartingWith(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameStartingWith("AD_EquipEntityId", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forLongValueEqualTo(Long value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_LongValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forLongValueNotEqualTo(Long value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_LongValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forLongValueGreaterThanOrEqualTo(Long value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameGreaterThanOrEqualTo("AD_LongValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forLongValueLessThan(Long value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameLessThan("AD_LongValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forMeasuredValueValueEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_MeasuredValueValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forMeasuredValueValueNotEqualTo(IMeasuredValue value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_MeasuredValueValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forPropertyEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_Property", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forPropertyNotEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_Property", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forPropertyContaining(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameContaining("AD_Property", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forPropertyStartingWith(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameStartingWith("AD_Property", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forStringValueEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameEqualTo("AD_StringValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forStringValueNotEqualTo(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameNotEqualTo("AD_StringValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forStringValueContaining(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameContaining("AD_StringValue", value);
    }

    public MESRtPhaseDataSetMultRtPropsFilter forStringValueStartingWith(String value) throws DatasweepException {
        return (MESRtPhaseDataSetMultRtPropsFilter)this.forColumnNameStartingWith("AD_StringValue", value);
    }
}
