package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public final class u extends t {
    private final int a;
    private final int b;
    private final int d = 0;
    private final int c = 0;

    private u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static u a(int i, int i2) {
        return new u(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.mraid.t
    final String a() {
        return "currentPosition: { x: " + this.c + ", y: " + this.d + ", width: " + this.a + ", height: " + this.b + " }";
    }
}
