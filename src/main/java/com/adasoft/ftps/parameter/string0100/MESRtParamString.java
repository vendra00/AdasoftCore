package com.adasoft.ftps.parameter.string0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamString extends MESParamString {
    protected static final String ATDEFINITION_NAME = "C_RtParString0100";

    public String getATDefinitionName() {
        return "C_RtParString0100";
    }

    public MESRtParamString(long key) {
        super(key);
    }

    public MESRtParamString(MESRtParamString source) {
        super(source);
    }

    public MESRtParamString(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamString() {
    }
}
