package com.adasoft.parameter.dattimepropdef0100;

import com.adasoft.ftps.parameter.dattimepropdef0100.MESParamDatTimePropDef;
import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.ui.Time;
import com.adasoft.parameter.eqm.IRuntimePropertyValueConfig0100;
import com.adasoft.parameter.eqm.RuntimePropertyLimitConfig0100;

public class MESParamDatTimePropDef0100 extends MESParamDatTimePropDef implements IRuntimePropertyValueConfig0100 {
    public MESParamDatTimePropDef0100(long key) {
        super(key);
    }

    public MESParamDatTimePropDef0100(MESParamDatTimePropDef0100 source) {
        super(source);
    }

    public MESParamDatTimePropDef0100(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamDatTimePropDef0100() {
    }

    public RuntimePropertyLimitConfig0100<Time> getLimitConfiguration() {
        return new RuntimePropertyLimitConfig0100();
    }

    public Time getRuntimeValue() {
        return this.getDefaultValue();
    }

    public String getPropertyReference() {
        return (String)this.dgtATRow.getValue("L_property");
    }
}
