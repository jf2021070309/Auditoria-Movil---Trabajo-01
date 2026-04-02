package com.amazon.aps.iva.n7;

import com.amazon.aps.iva.x6.b0;
import com.amazon.aps.iva.x6.h;
/* compiled from: ConstantBitrateSeeker.java */
/* loaded from: classes.dex */
public final class a extends h implements e {
    public a(long j, long j2, b0.a aVar, boolean z) {
        super(aVar.f, aVar.c, j, j2, z);
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long a(long j) {
        return ((Math.max(0L, j - this.b) * 8) * 1000000) / this.e;
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long e() {
        return -1L;
    }
}
