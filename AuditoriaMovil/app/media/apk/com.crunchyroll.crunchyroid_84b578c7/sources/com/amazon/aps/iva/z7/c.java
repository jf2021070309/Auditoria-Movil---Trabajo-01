package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.z7.e0;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import okhttp3.internal.http2.Http2;
/* compiled from: Ac4Extractor.java */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.x6.n {
    public final d a = new d(null);
    public final com.amazon.aps.iva.t5.v b = new com.amazon.aps.iva.t5.v((int) Http2.INITIAL_MAX_FRAME_SIZE);
    public boolean c;

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(com.amazon.aps.iva.x6.o oVar) throws IOException {
        com.amazon.aps.iva.x6.i iVar;
        int i;
        com.amazon.aps.iva.t5.v vVar = new com.amazon.aps.iva.t5.v(10);
        int i2 = 0;
        while (true) {
            iVar = (com.amazon.aps.iva.x6.i) oVar;
            iVar.c(vVar.a, 0, 10, false);
            vVar.F(0);
            if (vVar.w() != 4801587) {
                break;
            }
            vVar.G(3);
            int t = vVar.t();
            i2 += t + 10;
            iVar.m(t, false);
        }
        iVar.f = 0;
        iVar.m(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            iVar.c(vVar.a, 0, 7, false);
            vVar.F(0);
            int z = vVar.z();
            if (z != 44096 && z != 44097) {
                iVar.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                iVar.m(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[5] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[6] & UnsignedBytes.MAX_VALUE);
                    } else {
                        i5 = 4;
                    }
                    if (z == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                iVar.m(i - 7, false);
            }
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        this.c = false;
        this.a.b();
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(com.amazon.aps.iva.x6.p pVar) {
        this.a.d(pVar, new e0.d(0, 1));
        pVar.o();
        pVar.m(new d0.b(-9223372036854775807L));
    }

    @Override // com.amazon.aps.iva.x6.n
    public final int h(com.amazon.aps.iva.x6.o oVar, com.amazon.aps.iva.x6.c0 c0Var) throws IOException {
        com.amazon.aps.iva.t5.v vVar = this.b;
        int l = ((com.amazon.aps.iva.x6.i) oVar).l(vVar.a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (l == -1) {
            return -1;
        }
        vVar.F(0);
        vVar.E(l);
        boolean z = this.c;
        d dVar = this.a;
        if (!z) {
            dVar.e(4, 0L);
            this.c = true;
        }
        dVar.a(vVar);
        return 0;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
