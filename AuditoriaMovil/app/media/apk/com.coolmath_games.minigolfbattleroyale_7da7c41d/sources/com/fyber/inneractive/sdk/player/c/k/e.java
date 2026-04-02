package com.fyber.inneractive.sdk.player.c.k;
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;

    public e(byte[] bArr) {
        j jVar = new j(bArr);
        jVar.a(136);
        this.a = jVar.c(16);
        this.b = jVar.c(16);
        this.c = jVar.c(24);
        this.d = jVar.c(24);
        this.e = jVar.c(20);
        this.f = jVar.c(3) + 1;
        this.g = jVar.c(5) + 1;
        this.h = ((jVar.c(4) & 15) << 32) | (jVar.c(32) & 4294967295L);
    }
}
