package com.adasoft.parameter.mvalpropdef0100;

import com.adasoft.ftps.parameter.mvalpropdef0100.MESParamMValPropDef;
import com.datasweep.compatibility.client.ATRow;
import com.datasweep.plantops.common.measuredvalue.IMeasuredValue;
import com.adasoft.parameter.eqm.IRuntimePropertyValueConfig0100;
import com.adasoft.parameter.eqm.RuntimePropertyLimitConfig0100;

public class MESParamMValPropDef0100 extends MESParamMValPropDef implements IRuntimePropertyValueConfig0100 {
    public MESParamMValPropDef0100(long key) {
        super(key);
    }

    public MESParamMValPropDef0100(MESParamMValPropDef0100 source) {
        super(source);
    }

    public MESParamMValPropDef0100(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamMValPropDef0100() {
    }

    public RuntimePropertyLimitConfig0100<IMeasuredValue> getLimitConfiguration() {
        return new RuntimePropertyLimitConfig0100(this.getLowerLimit(), this.getUpperLimit());
    }

    public IMeasuredValue getRuntimeValue() {
        return this.getDefaultValue();
    }

    public String getPropertyReference() {
        return (String)this.dgtATRow.getValue("L_property");
    }
}
