package com.amazon.aps.iva.m0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.u1.e;
/* compiled from: TextFieldImpl.kt */
/* loaded from: classes.dex */
public final class m3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ float h;
    public final /* synthetic */ e3 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m3(float f, e3 e3Var, boolean z, int i, int i2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar) {
        super(3);
        this.h = f;
        this.i = e3Var;
        this.j = z;
        this.k = i;
        this.l = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        int i;
        com.amazon.aps.iva.a1.f fVar2 = fVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(fVar2, "modifier");
        if ((intValue & 14) == 0) {
            if (iVar2.H(fVar2)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 91) == 18 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.a1.f j = defpackage.i.j(fVar2, this.h);
            com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> pVar = this.l;
            iVar2.s(733328855);
            com.amazon.aps.iva.s1.d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, iVar2);
            iVar2.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(iVar2);
            com.amazon.aps.iva.o0.c2 l = iVar2.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar = e.a.b;
            com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.s1.u.a(j);
            if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                iVar2.z();
                if (iVar2.e()) {
                    iVar2.w(aVar);
                } else {
                    iVar2.m();
                }
                com.amazon.aps.iva.cq.b.k0(iVar2, c, e.a.e);
                com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                    com.amazon.aps.iva.d0.b2.c(S, iVar2, S, c0752a);
                }
                com.amazon.aps.iva.b8.i.c(0, a, new com.amazon.aps.iva.o0.x2(iVar2), iVar2, 2058660585);
                j3.b(((com.amazon.aps.iva.f1.x) this.i.j(this.j, iVar2).getValue()).a, ((b4) iVar2.i(c4.b)).g, null, pVar, iVar2, (this.k >> 6) & 7168, 4);
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
