package com.bytedance.sdk.openadsdk.mediation.ad;
/* loaded from: classes.dex */
public abstract class MediationSplashRequestInfo {
    private String a;
    private String b;
    private String c;
    private String d;

    public MediationSplashRequestInfo(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public String getAdnName() {
        return this.a;
    }

    public String getAdnSlotId() {
        return this.b;
    }

    public String getAppId() {
        return this.c;
    }

    public String getAppkey() {
        return this.d;
    }
}
