package com.adasoft.parameter.stringpropdef0100;

import com.adasoft.ftps.parameter.stringpropdef0100.MESParamStringPropDef;
import com.datasweep.compatibility.client.ATRow;
import com.adasoft.parameter.eqm.IRuntimePropertyValueConfig0100;
import com.adasoft.parameter.eqm.RuntimePropertyLimitConfig0100;

public class MESParamStringPropDef0100 extends MESParamStringPropDef implements IRuntimePropertyValueConfig0100 {
    public MESParamStringPropDef0100(long key) {
        super(key);
    }

    public MESParamStringPropDef0100(MESParamStringPropDef0100 source) {
        super(source);
    }

    public MESParamStringPropDef0100(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESParamStringPropDef0100() {
    }

    public RuntimePropertyLimitConfig0100<String> getLimitConfiguration() {
        return new RuntimePropertyLimitConfig0100(this.getExpectedValue());
    }

    public String getRuntimeValue() {
        return this.getDefaultValue();
    }

    public String getPropertyReference() {
        return (String)this.dgtATRow.getValue("L_property");
    }
}
