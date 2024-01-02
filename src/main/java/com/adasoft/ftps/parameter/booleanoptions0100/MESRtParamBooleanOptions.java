package com.adasoft.ftps.parameter.booleanoptions0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamBooleanOptions extends MESParamBooleanOptions {
    protected static final String ATDEFINITION_NAME = "L_RtParBooleanOptions0100";

    public String getATDefinitionName() {
        return "L_RtParBooleanOptions0100";
    }

    public MESRtParamBooleanOptions(long key) {
        super(key);
    }

    public MESRtParamBooleanOptions(MESRtParamBooleanOptions source) {
        super(source);
    }

    public MESRtParamBooleanOptions(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamBooleanOptions() {
    }
}
