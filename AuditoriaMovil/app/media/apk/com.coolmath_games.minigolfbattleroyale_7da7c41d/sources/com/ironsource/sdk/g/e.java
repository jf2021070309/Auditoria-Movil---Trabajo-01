package com.ironsource.sdk.g;
/* loaded from: classes2.dex */
public final class e {
    public String a;
    public int b;

    public e(int i, String str) {
        this.b = i;
        this.a = str == null ? "" : str;
    }

    public final String toString() {
        return "error - code:" + this.b + ", message:" + this.a;
    }
}
