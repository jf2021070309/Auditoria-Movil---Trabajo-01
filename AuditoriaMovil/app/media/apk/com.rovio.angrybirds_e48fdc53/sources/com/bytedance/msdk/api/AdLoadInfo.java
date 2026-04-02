package com.bytedance.msdk.api;
/* loaded from: classes.dex */
public class AdLoadInfo {
    public static final String AD_LOADED = "广告加载成功";
    public static final String AD_LOADING = "广告请求中";
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;

    public String getAdType() {
        return this.d;
    }

    public String getAdnName() {
        return this.b;
    }

    public String getCustomAdnName() {
        return this.c;
    }

    public int getErrCode() {
        return this.e;
    }

    public String getErrMsg() {
        return this.f;
    }

    public String getMediationRit() {
        return this.a;
    }

    public AdLoadInfo setAdType(String str) {
        this.d = str;
        return this;
    }

    public AdLoadInfo setAdnName(String str) {
        this.b = str;
        return this;
    }

    public AdLoadInfo setCustomAdnName(String str) {
        this.c = str;
        return this;
    }

    public AdLoadInfo setErrCode(int i) {
        this.e = i;
        return this;
    }

    public AdLoadInfo setErrMsg(String str) {
        this.f = str;
        return this;
    }

    public AdLoadInfo setMediationRit(String str) {
        this.a = str;
        return this;
    }

    public String toString() {
        return "{mediationRit='" + this.a + "', adnName='" + this.b + "', customAdnName='" + this.c + "', adType='" + this.d + "', errCode=" + this.e + ", errMsg=" + this.f + '}';
    }
}
