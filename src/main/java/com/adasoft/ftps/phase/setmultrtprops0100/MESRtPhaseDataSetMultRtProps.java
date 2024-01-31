package com.adasoft.ftps.phase.setmultrtprops0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.MeasuredValue;
import com.datasweep.compatibility.client.Response;
import com.datasweep.compatibility.ui.Time;
import com.datasweep.plantops.common.measuredvalue.IMeasuredValue;
import com.rockwell.mes.commons.base.ifc.functional.MESDuration;
import com.rockwell.mes.commons.base.ifc.functional.MeasuredValueUtilities;
import com.rockwell.mes.commons.base.ifc.utility.StringUtilsEx;
import com.rockwell.mes.services.s88.ifc.processdata.IMESRtPhaseData;
import com.rockwell.mes.services.s88.ifc.processdata.MESRtPhaseData;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESRtPhaseDataSetMultRtProps extends MESRtPhaseData implements IMESRtPhaseData {
    protected static final String ATDEFINITION_NAME = "AD_PhDatSetMultRtProps0100";
    public static final String PROP_NAME_BOOLEANVALUE = "booleanValue";
    public static final String DB_COAD_NAME_BOOLEANVALUE = "AD_BooleanValue_Y";
    public static final String COAD_NAME_BOOLEANVALUE = "AD_BooleanValue";
    public static final String PROP_NAME_BUNDLEID = "bundleId";
    public static final String DB_COAD_NAME_BUNDLEID = "AD_BundleId_S";
    public static final String COAD_NAME_BUNDLEID = "AD_BundleId";
    public static final String PROP_NAME_CREATIONSEQINDEX = "creationSeqIndex";
    public static final String DB_COAD_NAME_CREATIONSEQINDEX = "X_creationSeqIndex_I";
    public static final String COAD_NAME_CREATIONSEQINDEX = "X_creationSeqIndex";
    public static final String PROP_NAME_DATETIMEFORMAT = "dateTimeFormat";
    public static final String DB_COAD_NAME_DATETIMEFORMAT = "AD_DateTimeFormat_S";
    public static final String COAD_NAME_DATETIMEFORMAT = "AD_DateTimeFormat";
    public static final String PROP_NAME_DATETIMEVALUE = "dateTimeValue";
    public static final String DB_COAD_NAME_DATETIMEVALUE = "AD_DateTimeValue_T";
    public static final String COAD_NAME_DATETIMEVALUE = "AD_DateTimeValue";
    public static final String PROP_NAME_DECIMALVALUE = "decimalValue";
    public static final String DB_COAD_NAME_DECIMALVALUE = "AD_DecimalValue_V";
    public static final String COAD_NAME_DECIMALVALUE = "AD_DecimalValue";
    public static final String PROP_NAME_DURATIONVALUE = "durationValue";
    public static final String DB_COAD_NAME_DURATIONVALUE = "AD_DurationValue_I";
    public static final String COAD_NAME_DURATIONVALUE = "AD_DurationValue";
    public static final String PROP_NAME_EQUIPENTITYID = "equipEntityId";
    public static final String DB_COAD_NAME_EQUIPENTITYID = "AD_EquipEntityId_S";
    public static final String COAD_NAME_EQUIPENTITYID = "AD_EquipEntityId";
    public static final String PROP_NAME_LONGVALUE = "longValue";
    public static final String DB_COAD_NAME_LONGVALUE = "AD_LongValue_I";
    public static final String COAD_NAME_LONGVALUE = "AD_LongValue";
    public static final String PROP_NAME_MEASUREDVALUEVALUE = "measuredValueValue";
    public static final String DB_COAD_NAME_MEASUREDVALUEVALUE = "AD_MeasuredValueValue_V";
    public static final String COAD_NAME_MEASUREDVALUEVALUE = "AD_MeasuredValueValue";
    public static final String PROP_NAME_PROPERTY = "property";
    public static final String DB_COAD_NAME_PROPERTY = "AD_Property_S";
    public static final String COAD_NAME_PROPERTY = "AD_Property";
    public static final String PROP_NAME_STRINGVALUE = "stringValue";
    public static final String DB_COAD_NAME_STRINGVALUE = "AD_StringValue_S";
    public static final String COAD_NAME_STRINGVALUE = "AD_StringValue";

    public String getATDefinitionName() {
        return "AD_PhDatSetMultRtProps0100";
    }

    public MESRtPhaseDataSetMultRtProps(long key) {
        super(key);
    }

    public MESRtPhaseDataSetMultRtProps(MESRtPhaseDataSetMultRtProps source) {
        super(source);
    }

    public MESRtPhaseDataSetMultRtProps(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtPhaseDataSetMultRtProps() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public Boolean getBooleanValue() {
        return (Boolean)this.dgtATRow.getValue("AD_BooleanValue");
    }

    public void setBooleanValue(Boolean value) {
        Boolean oldValue = this.getBooleanValue();
        this.dgtATRow.setValue("AD_BooleanValue", value);
        this.pcs.firePropertyChange("booleanValue", oldValue, value);
    }

    public String getBundleId() {
        return StringUtilsEx.decodeStringForUI((String)this.dgtATRow.getValue("AD_BundleId"));
    }

    public void setBundleId(String value) {
        String oldValue = this.getBundleId();
        this.dgtATRow.setValue("AD_BundleId", StringUtilsEx.encodeStringForDB(value));
        this.pcs.firePropertyChange("bundleId", oldValue, value);
    }

    public Long getCreationSeqIndex() {
        return (Long)this.dgtATRow.getValue("X_creationSeqIndex");
    }

    public void setCreationSeqIndex(Long value) {
        Long oldValue = this.getCreationSeqIndex();
        this.dgtATRow.setValue("X_creationSeqIndex", value);
        this.pcs.firePropertyChange("creationSeqIndex", oldValue, value);
    }

    public String getDateTimeFormat() {
        return StringUtilsEx.decodeStringForUI((String)this.dgtATRow.getValue("AD_DateTimeFormat"));
    }

    public void setDateTimeFormat(String value) {
        String oldValue = this.getDateTimeFormat();
        this.dgtATRow.setValue("AD_DateTimeFormat", StringUtilsEx.encodeStringForDB(value));
        this.pcs.firePropertyChange("dateTimeFormat", oldValue, value);
    }

    public Time getDateTimeValue() {
        return (Time)this.dgtATRow.getValue("AD_DateTimeValue");
    }

    public void setDateTimeValue(Time value) {
        Time oldValue = this.getDateTimeValue();
        this.dgtATRow.setValue("AD_DateTimeValue", value);
        this.pcs.firePropertyChange("dateTimeValue", oldValue, value);
    }

    public BigDecimal getDecimalValue() {
        MeasuredValue mv = (MeasuredValue)this.dgtATRow.getValue("AD_DecimalValue");
        return mv == null ? null : mv.getValue();
    }

    public void setDecimalValue(BigDecimal value) {
        BigDecimal oldValue = this.getDecimalValue();
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        this.dgtATRow.setValue("AD_DecimalValue", mv);
        this.pcs.firePropertyChange("decimalValue", oldValue, value);
    }

    public MESDuration getDurationValue() {
        Object value = this.dgtATRow.getValue("AD_DurationValue");
        return value != null ? MESDuration.fromLong((Long)value) : null;
    }

    public void setDurationValue(MESDuration value) {
        MESDuration oldValue = this.getDurationValue();
        this.dgtATRow.setValue("AD_DurationValue", value != null ? MESDuration.toLong(value) : null);
        this.pcs.firePropertyChange("durationValue", oldValue, value);
    }

    public String getEquipEntityId() {
        return StringUtilsEx.decodeStringForUI((String)this.dgtATRow.getValue("AD_EquipEntityId"));
    }

    public void setEquipEntityId(String value) {
        String oldValue = this.getEquipEntityId();
        this.dgtATRow.setValue("AD_EquipEntityId", StringUtilsEx.encodeStringForDB(value));
        this.pcs.firePropertyChange("equipEntityId", oldValue, value);
    }

    public Long getLongValue() {
        return (Long)this.dgtATRow.getValue("AD_LongValue");
    }

    public void setLongValue(Long value) {
        Long oldValue = this.getLongValue();
        this.dgtATRow.setValue("AD_LongValue", value);
        this.pcs.firePropertyChange("longValue", oldValue, value);
    }

    public IMeasuredValue getMeasuredValueValue() {
        return (IMeasuredValue)this.dgtATRow.getValue("AD_MeasuredValueValue");
    }

    public void setMeasuredValueValue(IMeasuredValue value) {
        IMeasuredValue oldValue = this.getMeasuredValueValue();
        this.dgtATRow.setValue("AD_MeasuredValueValue", value);
        this.pcs.firePropertyChange("measuredValueValue", oldValue, value);
    }

    public String getProperty() {
        return StringUtilsEx.decodeStringForUI((String)this.dgtATRow.getValue("AD_Property"));
    }

    public void setProperty(String value) {
        String oldValue = this.getProperty();
        this.dgtATRow.setValue("AD_Property", StringUtilsEx.encodeStringForDB(value));
        this.pcs.firePropertyChange("property", oldValue, value);
    }

    public String getStringValue() {
        return StringUtilsEx.decodeStringForUI((String)this.dgtATRow.getValue("AD_StringValue"));
    }

    public void setStringValue(String value) {
        String oldValue = this.getStringValue();
        this.dgtATRow.setValue("AD_StringValue", StringUtilsEx.encodeStringForDB(value));
        this.pcs.firePropertyChange("stringValue", oldValue, value);
    }

    protected Response prepareATRowForSave() {
        Response res = super.prepareATRowForSave();
        return res;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
