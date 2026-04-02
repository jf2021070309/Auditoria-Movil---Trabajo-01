package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.z7.e0;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
/* compiled from: Ac3Extractor.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.x6.n {
    public final b a = new b(null);
    public final com.amazon.aps.iva.t5.v b = new com.amazon.aps.iva.t5.v(2786);
    public boolean c;

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(com.amazon.aps.iva.x6.o oVar) throws IOException {
        com.amazon.aps.iva.x6.i iVar;
        boolean z;
        int a;
        com.amazon.aps.iva.t5.v vVar = new com.amazon.aps.iva.t5.v(10);
        int i = 0;
        while (true) {
            iVar = (com.amazon.aps.iva.x6.i) oVar;
            iVar.c(vVar.a, 0, 10, false);
            vVar.F(0);
            if (vVar.w() != 4801587) {
                break;
            }
            vVar.G(3);
            int t = vVar.t();
            i += t + 10;
            iVar.m(t, false);
        }
        iVar.f = 0;
        iVar.m(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            iVar.c(vVar.a, 0, 6, false);
            vVar.F(0);
            if (vVar.z() != 2935) {
                iVar.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                iVar.m(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.a;
                if (bArr.length < 6) {
                    a = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        a = ((((bArr[2] & 7) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE)) + 1) * 2;
                    } else {
                        byte b = bArr[4];
                        a = com.amazon.aps.iva.x6.b.a((b & 192) >> 6, b & 63);
                    }
                }
                if (a == -1) {
                    return false;
                }
                iVar.m(a - 6, false);
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
        int l = ((com.amazon.aps.iva.x6.i) oVar).l(vVar.a, 0, 2786);
        if (l == -1) {
            return -1;
        }
        vVar.F(0);
        vVar.E(l);
        boolean z = this.c;
        b bVar = this.a;
        if (!z) {
            bVar.e(4, 0L);
            this.c = true;
        }
        bVar.a(vVar);
        return 0;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
