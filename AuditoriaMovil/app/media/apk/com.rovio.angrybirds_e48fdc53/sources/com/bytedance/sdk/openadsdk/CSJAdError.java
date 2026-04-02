package com.bytedance.sdk.openadsdk;
/* loaded from: classes.dex */
public class CSJAdError {
    private int dr;
    private String ge;

    public CSJAdError(int i, String str) {
        this.dr = i;
        this.ge = str;
    }

    public int getCode() {
        return this.dr;
    }

    public String getMsg() {
        return this.ge;
    }
}
