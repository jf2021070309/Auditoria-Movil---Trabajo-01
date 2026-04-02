package com.amazon.aps.iva.m0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.u1.e;
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.d0.o1 h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.d0.x1, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(com.amazon.aps.iva.d0.o1 o1Var, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.d0.x1, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i) {
        super(2);
        this.h = o1Var;
        this.i = qVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.a1.f d = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.e.a(f.a.c, x.b, x.c), this.h);
            a.b bVar2 = com.amazon.aps.iva.d0.a.e;
            b.C0098b c0098b = a.C0097a.k;
            int i = ((this.j >> 18) & 7168) | 432;
            iVar2.s(693286680);
            com.amazon.aps.iva.s1.d0 a = com.amazon.aps.iva.d0.v1.a(bVar2, c0098b, iVar2);
            iVar2.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(iVar2);
            com.amazon.aps.iva.o0.c2 l = iVar2.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(d);
            int i2 = ((((i << 3) & 112) << 9) & 7168) | 6;
            if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                iVar2.z();
                if (iVar2.e()) {
                    iVar2.w(aVar);
                } else {
                    iVar2.m();
                }
                com.amazon.aps.iva.cq.b.k0(iVar2, a, e.a.e);
                com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                    com.amazon.aps.iva.d0.b2.c(S, iVar2, S, c0752a);
                }
                com.amazon.aps.iva.b8.i.c((i2 >> 3) & 112, a2, new com.amazon.aps.iva.o0.x2(iVar2), iVar2, 2058660585);
                this.i.invoke(com.amazon.aps.iva.d0.y1.a, iVar2, Integer.valueOf(((i >> 6) & 112) | 6));
                iVar2.G();
                iVar2.o();
                iVar2.G();
                iVar2.G();
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
