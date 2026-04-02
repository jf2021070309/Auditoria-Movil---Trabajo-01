package com.amazon.aps.iva.m0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.u1.e;
/* compiled from: TextFieldImpl.kt */
/* loaded from: classes.dex */
public final class p3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.e1.g> h;
    public final /* synthetic */ com.amazon.aps.iva.d0.o1 i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p3(com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.e1.g> q1Var, com.amazon.aps.iva.d0.o1 o1Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i) {
        super(2);
        this.h = q1Var;
        this.i = o1Var;
        this.j = pVar;
        this.k = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.a1.f b = androidx.compose.ui.layout.a.b(f.a.c, "border");
            long j = this.h.getValue().a;
            float f = h2.a;
            com.amazon.aps.iva.yb0.j.f(b, "$this$outlineCutout");
            com.amazon.aps.iva.d0.o1 o1Var = this.i;
            com.amazon.aps.iva.yb0.j.f(o1Var, "paddingValues");
            com.amazon.aps.iva.a1.f c = androidx.compose.ui.draw.a.c(b, new i2(j, o1Var));
            iVar2.s(733328855);
            com.amazon.aps.iva.s1.d0 c2 = com.amazon.aps.iva.d0.f.c(a.C0097a.a, true, iVar2);
            iVar2.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(iVar2);
            com.amazon.aps.iva.o0.c2 l = iVar2.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar = e.a.b;
            com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.s1.u.a(c);
            if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                iVar2.z();
                if (iVar2.e()) {
                    iVar2.w(aVar);
                } else {
                    iVar2.m();
                }
                com.amazon.aps.iva.cq.b.k0(iVar2, c2, e.a.e);
                com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                    com.amazon.aps.iva.d0.b2.c(S, iVar2, S, c0752a);
                }
                a.invoke(new com.amazon.aps.iva.o0.x2(iVar2), iVar2, 0);
                iVar2.s(2058660585);
                iVar2.s(1661576646);
                com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.j;
                if (pVar != null) {
                    pVar.invoke(iVar2, Integer.valueOf((this.k >> 12) & 14));
                }
                iVar2.G();
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
