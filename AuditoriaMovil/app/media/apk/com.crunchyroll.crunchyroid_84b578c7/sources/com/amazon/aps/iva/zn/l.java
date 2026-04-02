package com.amazon.aps.iva.zn;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.m0.t0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import java.util.Locale;
/* compiled from: Inputs.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;
    public final /* synthetic */ com.amazon.aps.iva.i1.c m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z, int i, int i2, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, long j, int i3, com.amazon.aps.iva.i1.c cVar) {
        super(2);
        this.h = z;
        this.i = i;
        this.j = aVar;
        this.k = j;
        this.l = i3;
        this.m = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            Object obj = i.a.a;
            f.a aVar = f.a.c;
            boolean z = this.h;
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2 = this.j;
            if (z) {
                iVar2.s(-1613263532);
                String upperCase = defpackage.i.E(this.i, iVar2).toUpperCase(Locale.ROOT);
                com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                a0 a0Var = com.amazon.aps.iva.ao.b.o;
                float f = 8;
                com.amazon.aps.iva.a1.f i = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.o(aVar, null, 3), f, f, 16, 0.0f, 8);
                iVar2.s(1157296644);
                boolean H = iVar2.H(aVar2);
                Object t = iVar2.t();
                if (H || t == obj) {
                    t = new j(aVar2);
                    iVar2.n(t);
                }
                iVar2.G();
                a4.b(upperCase, androidx.compose.foundation.f.c(i, (com.amazon.aps.iva.xb0.a) t), this.k, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var, iVar2, (this.l << 6) & 896, 1572864, 65528);
                iVar2.G();
            } else if (this.m != null) {
                iVar2.s(-1613262996);
                com.amazon.aps.iva.a1.f o = androidx.compose.foundation.layout.e.o(aVar, null, 3);
                iVar2.s(-492369756);
                Object t2 = iVar2.t();
                if (t2 == obj) {
                    t2 = new com.amazon.aps.iva.c0.m();
                    iVar2.n(t2);
                }
                iVar2.G();
                com.amazon.aps.iva.c0.l lVar = (com.amazon.aps.iva.c0.l) t2;
                long j = com.amazon.aps.iva.ao.a.j;
                com.amazon.aps.iva.n0.e a = com.amazon.aps.iva.n0.q.a(false, 0.0f, j, iVar2, 384, 3);
                iVar2.s(1157296644);
                boolean H2 = iVar2.H(aVar2);
                Object t3 = iVar2.t();
                if (H2 || t3 == obj) {
                    t3 = new k(aVar2);
                    iVar2.n(t3);
                }
                iVar2.G();
                t0.a(this.m, null, androidx.compose.foundation.f.b(o, lVar, a, false, null, (com.amazon.aps.iva.xb0.a) t3, 28), j, iVar2, 3128, 0);
                iVar2.G();
            } else {
                iVar2.s(-1613262387);
                iVar2.G();
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
