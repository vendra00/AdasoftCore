package com.adasoft.parameter.booleanpropdef0100;

import com.adasoft.ftps.parameter.booleanpropdef0100.MESParamBooleanPropDef;
import com.datasweep.compatibility.client.ATRow;
import com.adasoft.parameter.eqm.IRuntimePropertyValueConfig0100;
import com.adasoft.parameter.eqm.RuntimePropertyLimitConfig0100;

public class MESParamBooleanPropDef0100 extends MESParamBooleanPropDef implements IRuntimePropertyValueConfig0100 {
    public MESParamBooleanPropDef0100(long key) {
        super(key);
    }

    public MESParamBooleanPropDef0100(MESParamBooleanPropDef0100 source) {
        super(source);
    }

    public MESParamBooleanPropDef0100(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamBooleanPropDef0100() {
    }

    public RuntimePropertyLimitConfig0100<Long> getLimitConfiguration() {
        return new RuntimePropertyLimitConfig0100(this.getExpectedValue());
    }

    public Long getRuntimeValue() {
        return this.getDefaultValue();
    }

    public String getPropertyReference() {
        return (String)this.dgtATRow.getValue("L_Property");
    }
}
