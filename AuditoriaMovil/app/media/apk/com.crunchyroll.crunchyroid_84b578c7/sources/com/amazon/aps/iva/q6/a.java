package com.amazon.aps.iva.q6;

import com.amazon.aps.iva.q5.v;
/* compiled from: BaseMediaChunk.java */
/* loaded from: classes.dex */
public abstract class a extends m {
    public final long k;
    public final long l;
    public c m;
    public int[] n;

    public a(com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar, v vVar, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(fVar, iVar, vVar, i, obj, j, j2, j5);
        this.k = j3;
        this.l = j4;
    }

    public final int e(int i) {
        int[] iArr = this.n;
        com.amazon.aps.iva.cq.b.D(iArr);
        return iArr[i];
    }
}
