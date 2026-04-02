package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public final class x extends t {
    private final int a;
    private final int b;

    private x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static x a(int i, int i2) {
        return new x(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.mraid.t
    final String a() {
        return "screenSize: { width: " + this.a + ", height: " + this.b + " }";
    }
}
