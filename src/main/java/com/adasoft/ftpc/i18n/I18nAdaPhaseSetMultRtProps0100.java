package com.adasoft.ftpc.i18n;

import com.datasweep.compatibility.ui.CControl;
import com.datasweep.compatibility.ui.MessageIdHolder;
import com.datasweep.compatibility.ui.MessagesHolder;
import com.rockwell.mes.commons.base.ifc.i18n.I18nMessageUtility;
import com.rockwell.ssb.ftpc.commons.i18n.I18nMessage;
import org.apache.commons.lang3.StringUtils;

public enum I18nAdaPhaseSetMultRtProps0100 implements I18nMessage {
    InstructionText_Label("InstructionText_Label", "<InstructionTextLabel (placeholder)>"),
    Entity_Label("Entity_Label", "Entity:"),
    EntityIdentifier_Label("EntityIdentifier_Label", "<EntityIdentifierLabel (placeholder)>"),
    PropertyBundle_Label("PropertyBundle_Label", "<PropertyBundleLabel (placeholder)>"),
    PropertyGridCompleted_Label("PropertyGridCompleted_Label", "<PropertyGridLabel (placeholder)>"),
    TheConfirmButton("TheConfirmButton", "Confirm"),
    BooleanProperty_Name("BooleanProperty_Name", "_booleanProperty"),
    DecimalProperty_Name("DecimalProperty_Name", "_decimalProperty"),
    DTProperty_Name("DTProperty_Name", "_dateTimeProperty"),
    DurationProperty_Name("DurationProperty_Name", "_durationProperty"),
    DurationProperty_DayLabel("DurationProperty_DayLabel", "_durationDayProperty"),
    DurationProperty_HourLabel("DurationProperty_HourLabel", "_durationHourProperty"),
    DurationProperty_MinuteLabel("DurationProperty_MinuteLabel", "_durationMinuteProperty"),
    DurationProperty_SecondLabel("DurationProperty_SecondLabel", "_durationSecondProperty"),
    LongProperty_Name("LongProperty_Name", "_longProperty"),
    MVProperty_Name("MVProperty_Name", "_measuredValueProperty"),
    MVProperty_UoM("MVProperty_UoM", "_measuredValueUoM"),
    StringProperty_Name("StringProperty_Name", "_stringProperty"),
    NAValue_Label("NAValue_Label", "N/A"),
    EquConfigErr("EquConfigErr", "Equipment configuration is not correct. Please contact a system administrator"),
    EmptyValue_ErrorMsg("EmptyValue_ErrorMsg", "{0}. You have to enter or select a value before you can confirm the phase"),
    EquPropMissingErr("EquPropMissingErr", "Equipment entity does not have provided property type or it is not a Runtime Property"),
    EquPropUoMErr("EquPropUoMErr", "UoM set for limits or for default value cannot be converted to the UoM defined for this phase"),
    MandatoryUoMErr("MandatoryUoMErr", "UoM is mandatory field"),
    BundleIdentifierTooLongErr("BundleIdentifierTooLongErr", "The identifier of the bundle parameter {0} is too long"),
    DataTypeFormatErr("DataTypeFormatErr", "The format of the selected data type is not correct. Please correct the value"),
    ValidationINTErr("ValidationINTErr", "{0}. Value entered has Integral length bigger than allowed. Please correct the value"),
    ValidationFRErr("ValidationFRErr", "{0}. Value entered has Fractional length bigger than allowed. Please correct the value"),
    HighLimitErr("HighLimitErr", "{0}. Date time entered is too high. Please correct the value"),
    LowLimitErr("LowLimitErr", "{0}. Date time entered is too low. Please correct the value"),
    StringLenghtLargerErr("StringLenghtLargerErr", "{0}. Value entered has length larger than allowed string limit definition. Please correct the value"),
    StringAllowedMaxLenghtErr("StringAllowedMaxLenghtErr", "String entered is too large. Please correct the value"),
    Property_HigherLimitException("Property_HigherLimitException", "Higher limit: {0}"),
    Property_LowerLimitException("Property_LowerLimitException", "Lower limit: {0}"),
    Property_UpperLimitException("Property_UpperLimitException", "Upper limit: {0}"),
    Property_ExpectedLimitException("Property_ExpectedLimitException", "Expected: {0}"),
    Property_ActualLimitException("Property_ActualLimitException", "Actual value: {0}");

    private String messageId;
    private final String fallbackMessage;
    private static final String MESSAGE_PACK = "ada_PhaseSetMultRtProps0100";

    private I18nAdaPhaseSetMultRtProps0100(final String paramMessageId, final String paramFallbackMessage) {
        this.messageId = paramMessageId;
        this.fallbackMessage = StringUtils.isNotBlank(paramFallbackMessage) ? paramFallbackMessage : "!ada_PhaseSetMultRtProps0100." + this.messageId;
    }

    public static String msgPack() {
        return "ada_PhaseSetMultRtProps0100";
    }

    public String msgIdMsgPack() {
        return "ada_PhaseSetMultRtProps0100";
    }

    public String msgId() {
        return this.messageId;
    }

    public String msg(final Object... args) {
        return !AppMode.getMode().equals(AppMode.JUNIT_BASIC) && AppContext.isContextInitializedForGUI() ? (String)StringUtils.defaultIfEmpty(I18nMessageUtility.getLocalizedMessage(msgPack(), this.msgId(), args), I18nMessageUtility.replacePlaceholders(this.fallbackMessage, args)) : I18nMessageUtility.replacePlaceholders(this.fallbackMessage, args);
    }

    public String msg() {
        return !AppMode.getMode().equals(AppMode.JUNIT_BASIC) && AppContext.isContextInitializedForGUI() ? (String)StringUtils.defaultIfEmpty(I18nMessageUtility.getLocalizedMessage(msgPack(), this.msgId()), this.fallbackMessage) : this.fallbackMessage;
    }

    public void setMessage(CControl ctrl) {
        if (ctrl != null && AppContext.isContextInitializedForGUI()) {
            ctrl.setText(this.fallbackMessage);
            if (!AppMode.getMode().equals(AppMode.JUNIT_BASIC)) {
                MessagesHolder holder = new MessagesHolder();
                holder.setMessagesName(msgPack());
                ctrl.setMessages(holder);
                MessageIdHolder idHolder = new MessageIdHolder();
                idHolder.setMessagesName(msgPack());
                idHolder.setMessageId(this.msgId());
                ctrl.setTextId(idHolder);
            }

        }
    }

    public void setTooltip(CControl ctrl) {
        if (ctrl != null && AppContext.isContextInitializedForGUI()) {
            if (!AppMode.getMode().equals(AppMode.JUNIT_BASIC)) {
                MessagesHolder holder = new MessagesHolder();
                holder.setMessagesName(msgPack());
                ctrl.setMessages(holder);
                MessageIdHolder idHolder = new MessageIdHolder();
                idHolder.setMessagesName(msgPack());
                idHolder.setMessageId(this.msgId());
                ctrl.setToolTipId(idHolder);
            }

        }
    }
}
