package com.adasoft.ftpc.i18n;

import com.datasweep.compatibility.ui.CControl;
import com.datasweep.compatibility.ui.MessageIdHolder;
import com.datasweep.compatibility.ui.MessagesHolder;
import com.rockwell.mes.commons.base.ifc.i18n.I18nMessageUtility;
import org.apache.commons.lang3.StringUtils;
import com.rockwell.ssb.ftpc.commons.i18n.I18nMessage;

public enum I18nMesFieldFormats implements I18nMessage {
    DateForFileName_WithHoursMinutesSeconds("DateForFileName_WithHoursMinutesSeconds", "yyyy-MM-dd_HH-mm-ss"),
    DateLetters_Alone("DateLetters_Alone", "MMM/dd/yyyy"),
    DateLetters_WithHours("DateLetters_WithHours", "MMM/dd/yyyy hh a"),
    DateLetters_WithHoursMinutes("DateLetters_WithHoursMinutes", "MMM/dd/yyyy hh:mm a"),
    DateLetters_WithHoursMinutesSeconds("DateLetters_WithHoursMinutesSeconds", "MMM/dd/yyyy hh:mm:ss a"),
    DateLetters_WithHoursMinutesSecondsTimezone("DateLetters_WithHoursMinutesSecondsTimezone", "MMM/dd/yyyy hh:mm:ss a z"),
    DateLetters_WithHoursMinutesTimezone("DateLetters_WithHoursMinutesTimezone", "MMM/dd/yyyy hh:mm a z"),
    Date_Alone("Date_Alone", "MM/dd/yyyy"),
    Date_WithHours("Date_WithHours", "MM/dd/yyyy hh a"),
    Date_WithHoursMinutes("Date_WithHoursMinutes", "MM/dd/yyyy hh:mm a"),
    Date_WithHoursMinutesSeconds("Date_WithHoursMinutesSeconds", "MM/dd/yyyy hh:mm:ss a"),
    Date_WithHoursMinutesSecondsTimezone("Date_WithHoursMinutesSecondsTimezone", "MM/dd/yyyy hh:mm:ss a z"),
    Date_WithHoursMinutesTimezone("Date_WithHoursMinutesTimezone", "MM/dd/yyyy hh:mm a z"),
    TimeWithoutTimezone("TimeWithoutTimezone", "hh:mm a"),
    Time_Alone("Time_Alone", "hh:mm a z"),
    ShortDateFormat("shortDateFormat", "MM/dd/yyyy"),
    ShortDateTimeFormat("shortDateTimeFormat", "MM/dd/yyyy hh:mm:ss a z");

    private String messageId;
    private final String fallbackMessage;
    private static final String MESSAGE_PACK = "mes_FieldFormats";

    private I18nMesFieldFormats(final String paramMessageId, final String paramFallbackMessage) {
        this.messageId = paramMessageId;
        this.fallbackMessage = StringUtils.isNotBlank(paramFallbackMessage) ? paramFallbackMessage : "!mes_FieldFormats." + this.messageId;
    }

    public static String msgPack() {
        return "mes_FieldFormats";
    }

    public String msgIdMsgPack() {
        return "mes_FieldFormats";
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

