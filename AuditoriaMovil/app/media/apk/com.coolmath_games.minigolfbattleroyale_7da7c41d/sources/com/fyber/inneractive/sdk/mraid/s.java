package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public final class s extends t {
    private final int a;
    private final int b;

    private s(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static s a(int i, int i2) {
        return new s(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.mraid.t
    final String a() {
        return "adSize: { width: " + this.a + ", height: " + this.b + " }";
    }
}
