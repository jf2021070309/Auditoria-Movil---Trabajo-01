package com.bytedance.sdk.openadsdk.api.plugin;
/* loaded from: classes.dex */
public class o extends Exception {
    private final int dr;

    public o(int i, String str) {
        super(str);
        this.dr = i;
    }

    public int dr() {
        return this.dr;
    }
}
