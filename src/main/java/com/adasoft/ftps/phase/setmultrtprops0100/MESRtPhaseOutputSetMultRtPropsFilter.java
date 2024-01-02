package com.adasoft.ftps.phase.setmultrtprops0100;

import com.datasweep.compatibility.client.ATRowFilter;
import com.datasweep.compatibility.client.DatasweepException;
import com.datasweep.compatibility.client.Server;
import com.rockwell.mes.commons.base.ifc.objects.MESATObject;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import com.rockwell.mes.services.s88.ifc.execution.IMESRtPhase;
import com.rockwell.mes.services.s88.ifc.processdata.IMESRtPhaseOutputFilter;
import com.rockwell.mes.services.s88equipment.ifc.IMESS88Equipment;
import java.util.List;

public class MESRtPhaseOutputSetMultRtPropsFilter extends ATRowFilter implements IMESRtPhaseOutputFilter {
    private static final long serialVersionUID = 1L;
    protected static final String ATDEFINITION_NAME = "L_PhOutSetMultRtProps0100";

    public MESRtPhaseOutputSetMultRtPropsFilter(Server server) {
        super(server, "L_PhOutSetMultRtProps0100");
    }

    public MESRtPhaseOutputSetMultRtPropsFilter() {
        this(PCContext.getServerImpl());
    }

    public List<MESRtPhaseOutputSetMultRtProps> getFilteredObjects() {
        return MESATObject.getFilteredMESATObjectList(this, MESRtPhaseOutputSetMultRtProps.class);
    }

    public MESRtPhaseOutputSetMultRtPropsFilter forParentEqualTo(IMESRtPhase value) throws DatasweepException {
        String columnName = "X_parent";
        return (MESRtPhaseOutputSetMultRtPropsFilter)this.forColumnNameEqualTo(columnName, new Long(value.getKey()));
    }

    public MESRtPhaseOutputSetMultRtPropsFilter forParentNotEqualTo(IMESRtPhase value) throws DatasweepException {
        String columnName = "X_parent";
        return (MESRtPhaseOutputSetMultRtPropsFilter)this.forColumnNameNotEqualTo(columnName, new Long(value.getKey()));
    }

    public MESRtPhaseOutputSetMultRtPropsFilter forEquipmentEntityEqualTo(IMESS88Equipment value) throws DatasweepException {
        return (MESRtPhaseOutputSetMultRtPropsFilter)this.forColumnNameEqualTo("L_EquipmentEntity", value);
    }

    public MESRtPhaseOutputSetMultRtPropsFilter forEquipmentEntityNotEqualTo(IMESS88Equipment value) throws DatasweepException {
        return (MESRtPhaseOutputSetMultRtPropsFilter)this.forColumnNameNotEqualTo("L_EquipmentEntity", value);
    }

    public MESRtPhaseOutputSetMultRtPropsFilter forExceptionRecordedEqualTo(Boolean value) throws DatasweepException {
        return (MESRtPhaseOutputSetMultRtPropsFilter)this.forColumnNameEqualTo("L_ExceptionRecorded", value);
    }

    public MESRtPhaseOutputSetMultRtPropsFilter forExceptionRecordedNotEqualTo(Boolean value) throws DatasweepException {
        return (MESRtPhaseOutputSetMultRtPropsFilter)this.forColumnNameNotEqualTo("L_ExceptionRecorded", value);
    }

    public MESRtPhaseOutputSetMultRtPropsFilter forValuesEqualTo(byte[] value) throws DatasweepException {
        return (MESRtPhaseOutputSetMultRtPropsFilter)this.forColumnNameEqualTo("L_Values", value);
    }

    public MESRtPhaseOutputSetMultRtPropsFilter forValuesNotEqualTo(byte[] value) throws DatasweepException {
        return (MESRtPhaseOutputSetMultRtPropsFilter)this.forColumnNameNotEqualTo("L_Values", value);
    }
}
