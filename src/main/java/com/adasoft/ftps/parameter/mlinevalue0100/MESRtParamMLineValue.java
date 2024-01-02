package com.adasoft.ftps.parameter.mlinevalue0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamMLineValue extends MESParamMLineValue {
    protected static final String ATDEFINITION_NAME = "C_RtParMLineValue0100";

    public String getATDefinitionName() {
        return "C_RtParMLineValue0100";
    }

    public MESRtParamMLineValue(long key) {
        super(key);
    }

    public MESRtParamMLineValue(MESRtParamMLineValue source) {
        super(source);
    }

    public MESRtParamMLineValue(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamMLineValue() {
    }
}
