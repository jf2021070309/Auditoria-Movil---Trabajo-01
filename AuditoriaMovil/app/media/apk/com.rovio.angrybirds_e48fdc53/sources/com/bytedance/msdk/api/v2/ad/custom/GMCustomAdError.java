package com.bytedance.msdk.api.v2.ad.custom;
/* loaded from: classes.dex */
public class GMCustomAdError {
    private int a;
    private String b;

    public GMCustomAdError(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int getCode() {
        return this.a;
    }

    public String getMessage() {
        return this.b;
    }
}
