package com.amazon.aps.iva.j0;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.u1.e;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.l0.c0 h;
    public final /* synthetic */ p2 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> l;
    public final /* synthetic */ com.amazon.aps.iva.i2.e0 m;
    public final /* synthetic */ com.amazon.aps.iva.i2.q n;
    public final /* synthetic */ com.amazon.aps.iva.o2.c o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(com.amazon.aps.iva.l0.c0 c0Var, p2 p2Var, boolean z, boolean z2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.o2.c cVar, int i) {
        super(2);
        this.h = c0Var;
        this.i = p2Var;
        this.j = z;
        this.k = z2;
        this.l = lVar;
        this.m = e0Var;
        this.n = qVar;
        this.o = cVar;
        this.p = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.s1.q qVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            n nVar = new n(this.i, this.l, this.m, this.n, this.o, this.p);
            iVar2.s(-1323940314);
            f.a aVar = f.a.c;
            int S = com.amazon.aps.iva.cq.b.S(iVar2);
            com.amazon.aps.iva.o0.c2 l = iVar2.l();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.s1.u.a(aVar);
            if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                iVar2.z();
                if (iVar2.e()) {
                    iVar2.w(aVar2);
                } else {
                    iVar2.m();
                }
                com.amazon.aps.iva.cq.b.k0(iVar2, nVar, e.a.e);
                com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                    com.amazon.aps.iva.d0.b2.c(S, iVar2, S, c0752a);
                }
                boolean z = false;
                a.invoke(new x2(iVar2), iVar2, 0);
                iVar2.s(2058660585);
                iVar2.G();
                iVar2.o();
                iVar2.G();
                p2 p2Var = this.i;
                i0 a2 = p2Var.a();
                i0 i0Var = i0.Selection;
                boolean z2 = this.j;
                if (a2 == i0Var && (qVar = p2Var.g) != null && qVar.l() && z2) {
                    z = true;
                }
                com.amazon.aps.iva.l0.c0 c0Var = this.h;
                k.d(c0Var, z, iVar2, 8);
                if (p2Var.a() == i0.Cursor && !this.k && z2) {
                    k.c(c0Var, iVar2, 8);
                }
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
