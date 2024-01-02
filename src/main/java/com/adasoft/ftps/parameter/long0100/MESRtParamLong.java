package com.adasoft.ftps.parameter.long0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamLong extends MESParamLong {
    protected static final String ATDEFINITION_NAME = "C_RtParLong0100";

    public String getATDefinitionName() {
        return "C_RtParLong0100";
    }

    public MESRtParamLong(long key) {
        super(key);
    }

    public MESRtParamLong(MESRtParamLong source) {
        super(source);
    }

    public MESRtParamLong(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamLong() {
    }
}
