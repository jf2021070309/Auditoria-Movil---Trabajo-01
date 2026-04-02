package com.amazon.aps.iva.q7;

import java.util.List;
/* compiled from: SubtitleOutputBuffer.java */
/* loaded from: classes.dex */
public abstract class h extends com.amazon.aps.iva.z5.g implements d {
    public d d;
    public long e;

    @Override // com.amazon.aps.iva.q7.d
    public final int a(long j) {
        d dVar = this.d;
        dVar.getClass();
        return dVar.a(j - this.e);
    }

    @Override // com.amazon.aps.iva.q7.d
    public final List<com.amazon.aps.iva.s5.a> b(long j) {
        d dVar = this.d;
        dVar.getClass();
        return dVar.b(j - this.e);
    }

    @Override // com.amazon.aps.iva.q7.d
    public final long c(int i) {
        d dVar = this.d;
        dVar.getClass();
        return dVar.c(i) + this.e;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int f() {
        d dVar = this.d;
        dVar.getClass();
        return dVar.f();
    }

    public final void l(long j, d dVar, long j2) {
        this.c = j;
        this.d = dVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.e = j;
    }
}
