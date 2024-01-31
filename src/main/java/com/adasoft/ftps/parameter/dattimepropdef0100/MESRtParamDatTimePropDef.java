package com.adasoft.ftps.parameter.dattimepropdef0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamDatTimePropDef extends MESParamDatTimePropDef {
    protected static final String ATDEFINITION_NAME = "AD_RtParDatTimePropDef0100";

    public String getATDefinitionName() {
        return "AD_RtParDatTimePropDef0100";
    }

    public MESRtParamDatTimePropDef(long key) {
        super(key);
    }

    public MESRtParamDatTimePropDef(MESRtParamDatTimePropDef source) {
        super(source);
    }

    public MESRtParamDatTimePropDef(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamDatTimePropDef() {
    }
}
