package com.adasoft.ftps.parameter.decimpropdef0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamDecimPropDef extends MESParamDecimPropDef {
    protected static final String ATDEFINITION_NAME = "AD_RtParDecimPropDef0100";

    public String getATDefinitionName() {
        return "AD_RtParDecimPropDef0100";
    }

    public MESRtParamDecimPropDef(long key) {
        super(key);
    }

    public MESRtParamDecimPropDef(MESRtParamDecimPropDef source) {
        super(source);
    }

    public MESRtParamDecimPropDef(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamDecimPropDef() {
    }
}
