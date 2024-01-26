package com.adasoft.parameter.duratpropdef0100;

import com.adasoft.ftps.parameter.duratpropdef0100.MESParamDuratPropDef;
import com.datasweep.compatibility.client.ATRow;
import com.rockwell.mes.commons.base.ifc.functional.MESDuration;
import com.adasoft.parameter.eqm.IRuntimePropertyValueConfig0100;
import com.adasoft.parameter.eqm.RuntimePropertyLimitConfig0100;

public class MESParamDuratPropDef0100 extends MESParamDuratPropDef implements IRuntimePropertyValueConfig0100 {
    public MESParamDuratPropDef0100(long key) {
        super(key);
    }

    public MESParamDuratPropDef0100(MESParamDuratPropDef0100 source) {
        super(source);
    }

    public MESParamDuratPropDef0100(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamDuratPropDef0100() {
    }

    public RuntimePropertyLimitConfig0100<MESDuration> getLimitConfiguration() {
        return new RuntimePropertyLimitConfig0100(this.getLowerLimit(), this.getUpperLimit());
    }

    public MESDuration getRuntimeValue() {
        return this.getDefaultValue();
    }

    public String getPropertyReference() {
        return (String)this.dgtATRow.getValue("L_property");
    }
}
