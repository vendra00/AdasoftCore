package com.adasoft.ftps.parameter.datetime0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamDateTime extends MESParamDateTime {
    protected static final String ATDEFINITION_NAME = "C_RtParDateTime0100";

    public String getATDefinitionName() {
        return "C_RtParDateTime0100";
    }

    public MESRtParamDateTime(long key) {
        super(key);
    }

    public MESRtParamDateTime(MESRtParamDateTime source) {
        super(source);
    }

    public MESRtParamDateTime(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamDateTime() {
    }
}
