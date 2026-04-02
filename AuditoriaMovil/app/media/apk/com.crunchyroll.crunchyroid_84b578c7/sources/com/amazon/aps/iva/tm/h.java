package com.amazon.aps.iva.tm;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nm.j;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.tm.c;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
/* compiled from: SwitchProfileDialog.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ m0 h;
    public final /* synthetic */ c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m0 m0Var, c cVar) {
        super(2);
        this.h = m0Var;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f b;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            f.a aVar = f.a.c;
            b = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.d(aVar), com.amazon.aps.iva.ao.a.l, p0.a);
            iVar2.s(733328855);
            d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, iVar2);
            iVar2.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(iVar2);
            c2 l = iVar2.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a = u.a(b);
            if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                iVar2.z();
                if (iVar2.e()) {
                    iVar2.w(aVar2);
                } else {
                    iVar2.m();
                }
                com.amazon.aps.iva.cq.b.k0(iVar2, c, e.a.e);
                com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                    b2.c(S, iVar2, S, c0752a);
                }
                com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar2), iVar2, 2058660585);
                androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.a;
                c.a aVar3 = c.c;
                com.amazon.aps.iva.nm.a.a(this.h, this.i.ci(), j.b.b, iVar2, 392);
                com.amazon.aps.iva.a1.f c2 = bVar2.c(aVar, a.C0097a.b);
                float f = 5;
                com.amazon.aps.iva.a1.f f2 = androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.d.i(c2, 0.0f, f, 0.0f, 0.0f, 13), 36), f);
                long j = com.amazon.aps.iva.ao.a.k;
                com.amazon.aps.iva.i0.f fVar = com.amazon.aps.iva.i0.g.a;
                com.amazon.aps.iva.i0.d dVar = new com.amazon.aps.iva.i0.d(2);
                com.amazon.aps.iva.cq.b.k(androidx.compose.foundation.c.b(f2, j, new com.amazon.aps.iva.i0.f(dVar, dVar, dVar, dVar)), iVar2, 0);
                iVar2.G();
                iVar2.o();
                iVar2.G();
                iVar2.G();
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        return q.a;
    }
}
