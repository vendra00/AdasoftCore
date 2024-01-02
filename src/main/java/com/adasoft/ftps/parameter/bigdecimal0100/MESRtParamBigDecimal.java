package com.adasoft.ftps.parameter.bigdecimal0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamBigDecimal extends MESParamBigDecimal {
    protected static final String ATDEFINITION_NAME = "C_RtParBigDecimal0100";

    public String getATDefinitionName() {
        return "C_RtParBigDecimal0100";
    }

    public MESRtParamBigDecimal(long key) {
        super(key);
    }

    public MESRtParamBigDecimal(MESRtParamBigDecimal source) {
        super(source);
    }

    public MESRtParamBigDecimal(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamBigDecimal() {
    }
}
