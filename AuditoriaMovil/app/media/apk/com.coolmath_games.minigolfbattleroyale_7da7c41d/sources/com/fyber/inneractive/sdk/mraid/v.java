package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public final class v extends t {
    private final int a;
    private final int b;

    private v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static v a(int i, int i2) {
        return new v(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.mraid.t
    final String a() {
        return "maxSize: { width: " + this.a + ", height: " + this.b + " }";
    }
}
