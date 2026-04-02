package com.bytedance.sdk.openadsdk.mediation.manager;
/* loaded from: classes.dex */
public class MediationAdLoadInfo {
    private String a;
    private String b;
    private String c;
    private int d;
    private String e;

    public MediationAdLoadInfo(String str, String str2, String str3, int i, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public String getAdType() {
        return this.c;
    }

    public String getAdnName() {
        return this.b;
    }

    public int getErrCode() {
        return this.d;
    }

    public String getErrMsg() {
        return this.e;
    }

    public String getMediationRit() {
        return this.a;
    }
}
