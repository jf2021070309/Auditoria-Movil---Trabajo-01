package com.amazon.aps.iva.p7;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.h0;
import com.amazon.aps.iva.x6.n;
import com.amazon.aps.iva.x6.o;
import com.amazon.aps.iva.x6.p;
import java.io.IOException;
/* compiled from: OggExtractor.java */
/* loaded from: classes.dex */
public final class c implements n {
    public p a;
    public h b;
    public boolean c;

    public final boolean a(com.amazon.aps.iva.x6.i iVar) throws IOException {
        boolean z;
        boolean z2;
        e eVar = new e();
        if (eVar.a(iVar, true) && (eVar.a & 2) == 2) {
            int min = Math.min(eVar.e, 8);
            v vVar = new v(min);
            iVar.c(vVar.a, 0, min, false);
            vVar.F(0);
            if (vVar.c - vVar.b >= 5 && vVar.u() == 127 && vVar.v() == 1179402563) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.b = new b();
            } else {
                vVar.F(0);
                try {
                    z2 = h0.c(1, vVar, true);
                } catch (com.amazon.aps.iva.q5.h0 unused) {
                    z2 = false;
                }
                if (z2) {
                    this.b = new i();
                } else {
                    vVar.F(0);
                    if (g.e(vVar, g.o)) {
                        this.b = new g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(o oVar) throws IOException {
        try {
            return a((com.amazon.aps.iva.x6.i) oVar);
        } catch (com.amazon.aps.iva.q5.h0 unused) {
            return false;
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        h hVar = this.b;
        if (hVar != null) {
            d dVar = hVar.a;
            e eVar = dVar.a;
            eVar.a = 0;
            eVar.b = 0L;
            eVar.c = 0;
            eVar.d = 0;
            eVar.e = 0;
            dVar.b.C(0);
            dVar.c = -1;
            dVar.e = false;
            if (j == 0) {
                hVar.d(!hVar.l);
            } else if (hVar.h != 0) {
                long j3 = (hVar.i * j2) / 1000000;
                hVar.e = j3;
                f fVar = hVar.d;
                int i = g0.a;
                fVar.c(j3);
                hVar.h = 2;
            }
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.a = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r21, com.amazon.aps.iva.x6.c0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p7.c.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
