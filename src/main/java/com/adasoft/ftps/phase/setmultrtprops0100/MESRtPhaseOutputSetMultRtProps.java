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
    protected static final String ATDEFINITION_NAME = "AD_PhOutSetMultRtProps0100";
    public static final String PROP_NAME_EQUIPMENTENTITY = "equipmentEntity";
    public static final String DB_COAD_NAME_EQUIPMENTENTITY = "AD_EquipmentEntity_64";
    public static final String COAD_NAME_EQUIPMENTENTITY = "AD_EquipmentEntity";
    public static final String PROP_NAME_EXCEPTIONRECORDED = "exceptionRecorded";
    public static final String DB_COAD_NAME_EXCEPTIONRECORDED = "AD_ExceptionRecorded_Y";
    public static final String COAD_NAME_EXCEPTIONRECORDED = "AD_ExceptionRecorded";
    public static final String PROP_NAME_VALUES = "values";
    public static final String DB_COAD_NAME_VALUES = "AD_Values_B";
    public static final String COAD_NAME_VALUES = "AD_Values";
    private final MESATObjectReferenceFieldHandler<IMESS88Equipment> refEquipmentEntity = MESATObjectReferenceFieldHandler.createReferenceFieldHandler(this, IMESS88Equipment.class, "AD_EquipmentEntity");
    private static final List<IBuildingBlockOutputDescriptor> OUTPUT_DESCRIPTORS = new ArrayList();

    public String getATDefinitionName() {
        return "AD_PhOutSetMultRtProps0100";
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
        return (Boolean)this.dgtATRow.getValue("AD_ExceptionRecorded");
    }

    public void setExceptionRecorded(Boolean value) {
        Boolean oldValue = this.getExceptionRecorded();
        this.dgtATRow.setValue("AD_ExceptionRecorded", value);
        this.pcs.firePropertyChange("exceptionRecorded", oldValue, value);
    }

    public byte[] getValues() {
        return (byte[])((byte[])this.dgtATRow.getValue("AD_Values"));
    }

    public void setValues(byte[] value) {
        byte[] oldValue = this.getValues();
        this.dgtATRow.setValue("AD_Values", value);
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
