package com.amazon.aps.iva.q6;

import com.amazon.aps.iva.q5.v;
/* compiled from: MediaChunk.java */
/* loaded from: classes.dex */
public abstract class m extends e {
    public final long j;

    public m(com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar, v vVar, int i, Object obj, long j, long j2, long j3) {
        super(fVar, iVar, 1, vVar, i, obj, j, j2);
        vVar.getClass();
        this.j = j3;
    }

    public long c() {
        long j = this.j;
        if (j == -1) {
            return -1L;
        }
        return 1 + j;
    }

    public abstract boolean d();
}
