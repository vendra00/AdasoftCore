package com.adasoft.ftps.parameter.duratpropdef0100;

import com.datasweep.compatibility.client.ATRow;

public class MESRtParamDuratPropDef extends MESParamDuratPropDef {
    protected static final String ATDEFINITION_NAME = "AD_RtParDuratPropDef0100";

    public String getATDefinitionName() {
        return "AD_RtParDuratPropDef0100";
    }

    public MESRtParamDuratPropDef(long key) {
        super(key);
    }

    public MESRtParamDuratPropDef(MESRtParamDuratPropDef source) {
        super(source);
    }

    public MESRtParamDuratPropDef(ATRow baseATRow) {
        super(baseATRow);
    }

    public MESRtParamDuratPropDef() {
    }
}
