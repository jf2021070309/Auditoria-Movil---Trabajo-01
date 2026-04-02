package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.x6.f0;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: DummyTrackOutput.java */
/* loaded from: classes.dex */
public final class m implements f0 {
    public final byte[] a = new byte[4096];

    @Override // com.amazon.aps.iva.x6.f0
    public final int e(com.amazon.aps.iva.q5.o oVar, int i, boolean z) throws IOException {
        byte[] bArr = this.a;
        int l = oVar.l(bArr, 0, Math.min(bArr.length, i));
        if (l == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return l;
    }

    @Override // com.amazon.aps.iva.x6.f0
    public final void f(int i, com.amazon.aps.iva.t5.v vVar) {
        vVar.G(i);
    }

    @Override // com.amazon.aps.iva.x6.f0
    public final void c(com.amazon.aps.iva.q5.v vVar) {
    }

    @Override // com.amazon.aps.iva.x6.f0
    public final void d(long j, int i, int i2, int i3, f0.a aVar) {
    }
}
