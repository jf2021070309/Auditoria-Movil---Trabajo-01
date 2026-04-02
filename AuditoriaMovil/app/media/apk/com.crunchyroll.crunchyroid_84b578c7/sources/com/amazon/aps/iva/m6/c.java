package com.amazon.aps.iva.m6;
/* compiled from: Download.java */
/* loaded from: classes.dex */
public final class c {
    public final m a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final l h;

    public c(m mVar, int i, long j, long j2, int i2) {
        this(mVar, i, j, j2, -1L, i2, 0, new l());
    }

    public c(m mVar, int i, long j, long j2, long j3, int i2, int i3, l lVar) {
        lVar.getClass();
        boolean z = true;
        com.amazon.aps.iva.cq.b.t((i3 == 0) == (i != 4));
        if (i2 != 0) {
            com.amazon.aps.iva.cq.b.t((i == 2 || i == 0) ? false : z);
        }
        this.a = mVar;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = lVar;
    }
}
