package com.amazon.aps.iva.q7;

import java.nio.ByteBuffer;
/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes.dex */
public abstract class c extends com.amazon.aps.iva.z5.h<g, h, f> implements e {
    public c() {
        super(new g[2], new h[2]);
        boolean z;
        int i = this.g;
        com.amazon.aps.iva.z5.f[] fVarArr = this.e;
        if (i == fVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        for (com.amazon.aps.iva.z5.f fVar : fVarArr) {
            fVar.m(1024);
        }
    }

    @Override // com.amazon.aps.iva.z5.h
    public final f e(com.amazon.aps.iva.z5.f fVar, com.amazon.aps.iva.z5.g gVar, boolean z) {
        g gVar2 = (g) fVar;
        h hVar = (h) gVar;
        try {
            ByteBuffer byteBuffer = gVar2.d;
            byteBuffer.getClass();
            hVar.l(gVar2.f, g(byteBuffer.limit(), byteBuffer.array(), z), gVar2.j);
            hVar.b &= Integer.MAX_VALUE;
            return null;
        } catch (f e) {
            return e;
        }
    }

    public abstract d g(int i, byte[] bArr, boolean z) throws f;

    @Override // com.amazon.aps.iva.q7.e
    public final void b(long j) {
    }
}
