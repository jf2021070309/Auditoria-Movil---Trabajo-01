package com.bytedance.msdk.api.nativeAd;

import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class TTNativeAdAppInfo {
    private String a;
    private String b;
    private long c;
    private String d;
    private Map<String, String> e;
    private String f;
    private String g;
    private Map<String, Object> h;

    public Map<String, Object> getAppInfoExtra() {
        return this.h;
    }

    public String getAppName() {
        return this.a;
    }

    public String getAuthorName() {
        return this.b;
    }

    public long getPackageSizeBytes() {
        return this.c;
    }

    public Map<String, String> getPermissionsMap() {
        return this.e;
    }

    public String getPermissionsUrl() {
        return this.d;
    }

    public String getPrivacyAgreement() {
        return this.f;
    }

    public String getVersionName() {
        return this.g;
    }

    public void setAppInfoExtra(Map<String, Object> map) {
        this.h = map;
    }

    public void setAppName(String str) {
        this.a = str;
    }

    public void setAuthorName(String str) {
        this.b = str;
    }

    public void setPackageSizeBytes(long j) {
        this.c = j;
    }

    public void setPermissionsMap(Map<String, String> map) {
        this.e = map;
    }

    public void setPermissionsUrl(String str) {
        this.d = str;
    }

    public void setPrivacyAgreement(String str) {
        this.f = str;
    }

    public void setVersionName(String str) {
        this.g = str;
    }
}
