package com.adasoft.ftps.parameter.datewfrmt0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamDateWFrmt extends MESParamDateWFrmt {
    protected static final String ATDEFINITION_NAME = "C_RtParDateWFrmt0100";

    public String getATDefinitionName() {
        return "C_RtParDateWFrmt0100";
    }

    public MESRtParamDateWFrmt(long key) {
        super(key);
    }

    public MESRtParamDateWFrmt(MESRtParamDateWFrmt source) {
        super(source);
    }

    public MESRtParamDateWFrmt(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamDateWFrmt() {
    }
}
