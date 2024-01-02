package com.adasoft.ftps.phase.setmultrtprops0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.Response;
import com.rockwell.mes.commons.base.ifc.objects.MESATObjectReferenceFieldHandler;
import com.rockwell.mes.commons.base.ifc.objects.PersistentMESATObject;
import com.rockwell.mes.commons.base.ifc.utility.ObjectFactory;
import com.rockwell.mes.services.s88.ifc.library.IBuildingBlockOutputDescriptor;
import com.rockwell.mes.services.s88.ifc.processdata.IMESRtPhaseOutput;
import com.rockwell.mes.services.s88.ifc.processdata.MESRtPhaseOutput;
import com.rockwell.mes.services.s88equipment.ifc.IMESS88Equipment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MESRtPhaseOutputSetMultRtProps extends MESRtPhaseOutput implements IMESRtPhaseOutput {
    protected static final String ATDEFINITION_NAME = "L_PhOutSetMultRtProps0100";
    public static final String PROP_NAME_EQUIPMENTENTITY = "equipmentEntity";
    public static final String DB_COL_NAME_EQUIPMENTENTITY = "L_EquipmentEntity_64";
    public static final String COL_NAME_EQUIPMENTENTITY = "L_EquipmentEntity";
    public static final String PROP_NAME_EXCEPTIONRECORDED = "exceptionRecorded";
    public static final String DB_COL_NAME_EXCEPTIONRECORDED = "L_ExceptionRecorded_Y";
    public static final String COL_NAME_EXCEPTIONRECORDED = "L_ExceptionRecorded";
    public static final String PROP_NAME_VALUES = "values";
    public static final String DB_COL_NAME_VALUES = "L_Values_B";
    public static final String COL_NAME_VALUES = "L_Values";
    private final MESATObjectReferenceFieldHandler<IMESS88Equipment> refEquipmentEntity = MESATObjectReferenceFieldHandler.createReferenceFieldHandler(this, IMESS88Equipment.class, "L_EquipmentEntity");
    private static final List<IBuildingBlockOutputDescriptor> OUTPUT_DESCRIPTORS = new ArrayList();

    public String getATDefinitionName() {
        return "L_PhOutSetMultRtProps0100";
    }

    public MESRtPhaseOutputSetMultRtProps(long key) {
        super(key);
    }

    public MESRtPhaseOutputSetMultRtProps(MESRtPhaseOutputSetMultRtProps source) {
        super(source);
        this.refEquipmentEntity.initFromCopyConstructor(source.refEquipmentEntity);
    }

    public MESRtPhaseOutputSetMultRtProps(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtPhaseOutputSetMultRtProps() {
    }

    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    public IMESS88Equipment getEquipmentEntity() {
        return (IMESS88Equipment)this.refEquipmentEntity.getReference();
    }

    public void setEquipmentEntity(IMESS88Equipment value) {
        this.refEquipmentEntity.setReference(value, this.pcs, "PROP_NAME_EQUIPMENTENTITY");
    }

    public Boolean getExceptionRecorded() {
        return (Boolean)this.dgtATRow.getValue("L_ExceptionRecorded");
    }

    public void setExceptionRecorded(Boolean value) {
        Boolean oldValue = this.getExceptionRecorded();
        this.dgtATRow.setValue("L_ExceptionRecorded", value);
        this.pcs.firePropertyChange("exceptionRecorded", oldValue, value);
    }

    public byte[] getValues() {
        return (byte[])((byte[])this.dgtATRow.getValue("L_Values"));
    }

    public void setValues(byte[] value) {
        byte[] oldValue = this.getValues();
        this.dgtATRow.setValue("L_Values", value);
        this.pcs.firePropertyChange("values", oldValue, value);
    }

    protected Response prepareATRowForSave() {
        Response res = super.prepareATRowForSave();
        return res;
    }

    public static List<IBuildingBlockOutputDescriptor> getOutputDescriptorsOfClass() {
        return Collections.unmodifiableList(OUTPUT_DESCRIPTORS);
    }

    public List<IBuildingBlockOutputDescriptor> getOutputDescriptors() {
        return getOutputDescriptorsOfClass();
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    static {
        IBuildingBlockOutputDescriptor descriptor = (IBuildingBlockOutputDescriptor)ObjectFactory.getInstance().createObject(IBuildingBlockOutputDescriptor.class, new Class[]{String.class, String.class, Class.class, Class.class}, new Object[]{"EquipmentEntity", "EquipmentEntity", IMESS88Equipment.class, PersistentMESATObject.class});
        OUTPUT_DESCRIPTORS.add(descriptor);
        descriptor = (IBuildingBlockOutputDescriptor)ObjectFactory.getInstance().createObject(IBuildingBlockOutputDescriptor.class, new Class[]{String.class, String.class, Class.class}, new Object[]{"ExceptionRecorded", "ExceptionRecorded", Boolean.class});
        OUTPUT_DESCRIPTORS.add(descriptor);
        descriptor = (IBuildingBlockOutputDescriptor)ObjectFactory.getInstance().createObject(IBuildingBlockOutputDescriptor.class, new Class[]{String.class, String.class, Class.class}, new Object[]{"Values", "Values", byte[].class});
        OUTPUT_DESCRIPTORS.add(descriptor);
    }
}
