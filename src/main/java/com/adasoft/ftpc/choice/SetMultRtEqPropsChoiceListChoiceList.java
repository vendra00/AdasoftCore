package com.adasoft.ftpc.choice;

import com.datasweep.compatibility.client.DatasweepException;
import com.rockwell.mes.commons.base.ifc.choicelist.IMESChoiceElement;
import com.rockwell.mes.commons.base.ifc.choicelist.IMESChoiceList;
import com.rockwell.mes.commons.base.ifc.choicelist.MESChoiceListHelper;
import com.rockwell.mes.commons.base.ifc.choicelist.MESChoiceListHelper.MESItemNotFoundException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public enum SetMultRtEqPropsChoiceListChoiceList implements IChoiceListEnum {
    NA(10L, "NA", "ada_SetMultRtEqPropsChoiceList-NA", false, true, true),
    Yes(20L, "Yes", "ada_SetMultRtEqPropsChoiceList-Yes", false, true, true),
    No(30L, "No", "ada_SetMultRtEqPropsChoiceList-No", false, true, true);

    private static final Log LOGGER = LogFactory.getLog(SetMultRtEqPropsChoiceListChoiceList.class);
    public static final String CHOICE_LIST_NAME = "ada_SetMultRtEqPropsChoiceList";
    public static final String ENUM_NAME = "SetMultRtEqPropsChoiceListChoiceList";
    private final String meaning;
    private final Long value;
    public final String messageId;
    public final boolean editable;
    public final boolean selectable;
    public final boolean visible;

    public static SetMultRtEqPropsChoiceListChoiceList valueOf(Long value) {
        return value(value);
    }
    public static SetMultRtEqPropsChoiceListChoiceList value(Long value) {      SetMultRtEqPropsChoiceListChoiceList[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {         SetMultRtEqPropsChoiceListChoiceList enumForValue = var1[var3];
            if (enumForValue.val().equals(value)) {
                return enumForValue;
            }
        }

        return null;
    }
    public static SetMultRtEqPropsChoiceListChoiceList value(String value) {      SetMultRtEqPropsChoiceListChoiceList[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {         SetMultRtEqPropsChoiceListChoiceList enumForValue = var1[var3];
            if (enumForValue.meaning().equals(StringUtils.defaultString(value))) {
                return enumForValue;
            }
        }

        return null;
    }




    private SetMultRtEqPropsChoiceListChoiceList(Long paramValue, String meaning, String messageId, boolean paramEditable, boolean paramSelectable, boolean paramVisible) {
        this.value = paramValue;
        this.meaning = meaning;
        this.messageId = messageId;
        this.editable = paramEditable;
        this.selectable = paramSelectable;
        this.visible = paramVisible;
    }


    public static String meaning(Long val) {
        try {
            return MESChoiceListHelper.getChoiceElement("ada_SetMultRtEqPropsChoiceList", val).getMeaning();
        } catch (MESItemNotFoundException var2) {
            LOGGER.error("fetching meaning " + val + " for choice list " + "ada_SetMultRtEqPropsChoiceList" + " failed");

            return "";
        }
    }





    public static String msg(Long val) {
        try {
            return MESChoiceListHelper.getChoiceElement("ada_SetMultRtEqPropsChoiceList", val).getLocalizedMessage();
        } catch (MESItemNotFoundException var2) {
            LOGGER.error("fetching val " + val + " for choice list " + "ada_SetMultRtEqPropsChoiceList" + " failed");

            return "";
        }
    }

    public String msg() {
        IMESChoiceElement element = MESChoiceListHelper.getChoiceElement("ada_SetMultRtEqPropsChoiceList", this.val());
        return element.getLocalizedMessage();
    }


    public String meaning() {
        return this.meaning;
    }


    public Long val() {
        return this.value;
    }


    public String messageId() {
        return this.messageId;
    }


    public boolean editable() {
        return this.editable;
    }


    public boolean selectable() {
        return this.selectable;
    }


    public boolean visible() {
        return this.visible;
    }


    public String choiceListNameInternal() {
        return "ada_SetMultRtEqPropsChoiceList";
    }


    public String choiceListDescriptionInternal() {
        return "N/A,Yes,No choice list";
    }


    public boolean choiceListAlphabetizedInternal() {
        return false;
    }


    public boolean choiceListEditableInternal() {
        return false;
    }


    public String choiceListMessagePackInternal() {
        return "ada_SetMultRtEqPropsChoiceListStrings";
    }

    public static String choiceListName() {
        return "ada_SetMultRtEqPropsChoiceList";
    }

    public static String choiceListDescription() {
        return "N/A,Yes,No choice list";
    }

    public static boolean choiceListAlphabetized() {
        return false;
    }

    public static boolean choiceListEditable() {
        return false;
    }

    public static String choiceListMessagePack() {
        return "ada_SetMultRtEqPropsChoiceListStrings";
    }

    public static IMESChoiceList choiceList() {
        try {
            return MESChoiceListHelper.getChoiceList("ada_SetMultRtEqPropsChoiceList");
        } catch (DatasweepException var1) {
            return null;
        }
    }

    public IMESChoiceElement choiceElement() {
        return MESChoiceListHelper.getChoiceElement("ada_SetMultRtEqPropsChoiceList", this.val());
    }

    public String item() {
        return MESChoiceListHelper.val2Item("ada_SetMultRtEqPropsChoiceList", this.val());
    }
}

