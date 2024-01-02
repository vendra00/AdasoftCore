package com.adasoft.ftps.parameter.measuredval0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamMeasuredVal extends MESParamMeasuredVal {
    protected static final String ATDEFINITION_NAME = "C_RtParMeasuredVal0100";

    public String getATDefinitionName() {
        return "C_RtParMeasuredVal0100";
    }

    public MESRtParamMeasuredVal(long key) {
        super(key);
    }

    public MESRtParamMeasuredVal(MESRtParamMeasuredVal source) {
        super(source);
    }

    public MESRtParamMeasuredVal(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamMeasuredVal() {
    }
}