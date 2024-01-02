package com.adasoft.ftps.parameter.phaseenum0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamPhaseEnum extends MESParamPhaseEnum {
    protected static final String ATDEFINITION_NAME = "C_RtParPhaseEnum0100";

    public String getATDefinitionName() {
        return "C_RtParPhaseEnum0100";
    }

    public MESRtParamPhaseEnum(long key) {
        super(key);
    }

    public MESRtParamPhaseEnum(MESRtParamPhaseEnum source) {
        super(source);
    }

    public MESRtParamPhaseEnum(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamPhaseEnum() {
    }
}
