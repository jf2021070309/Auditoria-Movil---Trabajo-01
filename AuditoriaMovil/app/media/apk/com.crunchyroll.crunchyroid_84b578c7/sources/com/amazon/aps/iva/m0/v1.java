package com.amazon.aps.iva.m0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.u1.e;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class v1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.d0.o, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v1(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.d0.o, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, int i) {
        super(2);
        this.h = qVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            int i = (this.i << 9) & 7168;
            iVar2.s(-483455358);
            f.a aVar = f.a.c;
            com.amazon.aps.iva.s1.d0 a = com.amazon.aps.iva.d0.m.a(com.amazon.aps.iva.d0.a.c, a.C0097a.m, iVar2);
            iVar2.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(iVar2);
            com.amazon.aps.iva.o0.c2 l = iVar2.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = com.amazon.aps.iva.s1.u.a(aVar);
            int i2 = ((((i << 3) & 112) << 9) & 7168) | 6;
            if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                iVar2.z();
                if (iVar2.e()) {
                    iVar2.w(aVar2);
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
                this.h.invoke(com.amazon.aps.iva.d0.p.a, iVar2, Integer.valueOf(((i >> 6) & 112) | 6));
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
