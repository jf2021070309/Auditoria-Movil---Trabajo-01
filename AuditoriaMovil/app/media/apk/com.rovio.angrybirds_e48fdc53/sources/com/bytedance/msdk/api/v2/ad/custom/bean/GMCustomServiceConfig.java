package com.bytedance.msdk.api.v2.ad.custom.bean;
/* loaded from: classes.dex */
public final class GMCustomServiceConfig {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final String e;

    public GMCustomServiceConfig(String str, String str2, int i, int i2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
    }

    public String getADNNetworkName() {
        return this.a;
    }

    public String getADNNetworkSlotId() {
        return this.b;
    }

    public int getAdStyleType() {
        return this.c;
    }

    public String getCustomAdapterJson() {
        return this.e;
    }

    public int getSubAdtype() {
        return this.d;
    }
}
