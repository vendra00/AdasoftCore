package com.adasoft.parameter.longpropdef0100;

import com.adasoft.ftps.parameter.longpropdef0100.MESParamLongPropDef;
import com.datasweep.compatibility.client.ATRow;
import com.adasoft.parameter.eqm.IRuntimePropertyValueConfig0100;
import com.adasoft.parameter.eqm.RuntimePropertyLimitConfig0100;

public class MESParamLongPropDef0100 extends MESParamLongPropDef implements IRuntimePropertyValueConfig0100 {
    public MESParamLongPropDef0100(long key) {
        super(key);
    }

    public MESParamLongPropDef0100(MESParamLongPropDef0100 source) {
        super(source);
    }

    public MESParamLongPropDef0100(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamLongPropDef0100() {
    }

    public RuntimePropertyLimitConfig0100<Long> getLimitConfiguration() {
        return new RuntimePropertyLimitConfig0100(this.getLowerLimit(), this.getUpperLimit());
    }

    public Long getRuntimeValue() {
        return this.getDefaultValue();
    }

    public String getPropertyReference() {
        return (String)this.dgtATRow.getValue("L_property");
    }
}
