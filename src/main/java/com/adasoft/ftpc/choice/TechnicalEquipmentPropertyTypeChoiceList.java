package com.adasoft.ftpc.choice;

import com.datasweep.compatibility.client.DatasweepException;
import com.rockwell.mes.commons.base.ifc.choicelist.IMESChoiceElement;
import com.rockwell.mes.commons.base.ifc.choicelist.IMESChoiceList;
import com.rockwell.mes.commons.base.ifc.choicelist.MESChoiceListHelper;
import com.rockwell.mes.commons.base.ifc.choicelist.MESChoiceListHelper.MESItemNotFoundException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public enum TechnicalEquipmentPropertyTypeChoiceList implements IChoiceListEnum {
    Boolean(10L, "Boolean", "TechnicalEquipmentPropertyType-Boolean", false, true, true),
    FlexibleTagDefinition(20L, "FlexibleTagDefinition", "TechnicalEquipmentPropertyType-FlexibleTagDefinition", false, true, true),
    FlexibleAttrDef(30L, "FlexibleAttrDef", "TechnicalEquipmentPropertyType-FlexibleAttrDef", false, true, true),
    Decimal(40L, "Decimal", "TechnicalEquipmentPropertyType-Decimal", false, true, true),
    FlexibleStateModel(60L, "FlexibleStateModel", "TechnicalEquipmentPropertyType-FlexibleStateModel", false, true, true),
    MeasuredValue(80L, "MeasuredValue", "TechnicalEquipmentPropertyType-MeasuredValue", false, true, true),
    EquipmentType(90L, "EquipmentType", "TechnicalEquipmentPropertyType-EquipmentType", false, true, true),
    String(100L, "String", "TechnicalEquipmentPropertyType-String", false, true, true),
    Ranges(110L, "Ranges", "TechnicalEquipmentPropertyType-Ranges", false, true, true),
    ScalesConfiguration(120L, "ScalesConfiguration", "TechnicalEquipmentPropertyType-ScalesConfiguration", false, true, true),
    WorkCenterAssignment(130L, "WorkCenterAssignment", "TechnicalEquipmentPropertyType-WorkCenterAssignment", false, true, true),
    Duration(140L, "Duration", "TechnicalEquipmentPropertyType-Duration", false, true, true),
    RoomCleaningRules(150L, "RoomCleaningRules", "TechnicalEquipmentPropertyType-RoomCleaningRules", false, true, true),
    ScaleTestAndCalibration(160L, "ScaleTestAndCalibration", "TechnicalEquipmentPropertyType-ScaleTestAndCalibration", false, true, true);

    private static final Log LOGGER = LogFactory.getLog(TechnicalEquipmentPropertyTypeChoiceList.class);
    public static final String CHOICE_LIST_NAME = "TechnicalEquipmentPropertyType";
    public static final String ENUM_NAME = "TechnicalEquipmentPropertyTypeChoiceList";
    private String meaning;
    private Long value;
    public String messageId;
    public boolean editable;
    public boolean selectable;
    public boolean visible;

    public static TechnicalEquipmentPropertyTypeChoiceList valueOf(Long value) {
        return value(value);
    }
    public static TechnicalEquipmentPropertyTypeChoiceList value(Long value) {      TechnicalEquipmentPropertyTypeChoiceList[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {         TechnicalEquipmentPropertyTypeChoiceList enumForValue = var1[var3];
            if (enumForValue.val().equals(value)) {
                return enumForValue;
            }
        }

        return null;
    }
    public static TechnicalEquipmentPropertyTypeChoiceList value(String value) {      TechnicalEquipmentPropertyTypeChoiceList[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {         TechnicalEquipmentPropertyTypeChoiceList enumForValue = var1[var3];
            if (enumForValue.meaning().equals(StringUtils.defaultString(value))) {
                return enumForValue;
            }
        }

        return null;
    }




    private TechnicalEquipmentPropertyTypeChoiceList(Long paramValue, String meaning, String messageId, boolean paramEditable, boolean paramSelectable, boolean paramVisible) {
        this.value = paramValue;
        this.meaning = meaning;
        this.messageId = messageId;
        this.editable = paramEditable;
        this.selectable = paramSelectable;
        this.visible = paramVisible;
    }


    public static String meaning(Long val) {
        try {
            return MESChoiceListHelper.getChoiceElement("TechnicalEquipmentPropertyType", val).getMeaning();
        } catch (MESItemNotFoundException var2) {
            LOGGER.error("fetching meaning " + val + " for choice list " + "TechnicalEquipmentPropertyType" + " failed");

            return "";
        }
    }





    public static String msg(Long val) {
        try {
            return MESChoiceListHelper.getChoiceElement("TechnicalEquipmentPropertyType", val).getLocalizedMessage();
        } catch (MESItemNotFoundException var2) {
            LOGGER.error("fetching val " + val + " for choice list " + "TechnicalEquipmentPropertyType" + " failed");

            return "";
        }
    }

    public String msg() {
        IMESChoiceElement element = MESChoiceListHelper.getChoiceElement("TechnicalEquipmentPropertyType", this.val());
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
        return "TechnicalEquipmentPropertyType";
    }


    public String choiceListDescriptionInternal() {
        return "";
    }


    public boolean choiceListAlphabetizedInternal() {
        return true;
    }


    public boolean choiceListEditableInternal() {
        return false;
    }


    public String choiceListMessagePackInternal() {
        return "MESChoiceListStrings";
    }

    public static String choiceListName() {
        return "TechnicalEquipmentPropertyType";
    }

    public static String choiceListDescription() {
        return "";
    }

    public static boolean choiceListAlphabetized() {
        return true;
    }

    public static boolean choiceListEditable() {
        return false;
    }

    public static String choiceListMessagePack() {
        return "MESChoiceListStrings";
    }

    public static IMESChoiceList choiceList() {
        try {
            return MESChoiceListHelper.getChoiceList("TechnicalEquipmentPropertyType");
        } catch (DatasweepException var1) {
            return null;
        }
    }

    public IMESChoiceElement choiceElement() {
        return MESChoiceListHelper.getChoiceElement("TechnicalEquipmentPropertyType", this.val());
    }

    public String item() {
        return MESChoiceListHelper.val2Item("TechnicalEquipmentPropertyType", this.val());
    }
}

