package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.j0.g2;
import com.amazon.aps.iva.o0.e0;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p2 h;
    public final /* synthetic */ com.amazon.aps.iva.c2.a0 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ k2 l;
    public final /* synthetic */ com.amazon.aps.iva.i2.e0 m;
    public final /* synthetic */ com.amazon.aps.iva.i2.p0 n;
    public final /* synthetic */ com.amazon.aps.iva.a1.f o;
    public final /* synthetic */ com.amazon.aps.iva.a1.f p;
    public final /* synthetic */ com.amazon.aps.iva.a1.f q;
    public final /* synthetic */ com.amazon.aps.iva.a1.f r;
    public final /* synthetic */ com.amazon.aps.iva.g0.d s;
    public final /* synthetic */ com.amazon.aps.iva.l0.c0 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> w;
    public final /* synthetic */ com.amazon.aps.iva.i2.q x;
    public final /* synthetic */ com.amazon.aps.iva.o2.c y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(p2 p2Var, com.amazon.aps.iva.c2.a0 a0Var, int i, int i2, k2 k2Var, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.p0 p0Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.f fVar2, com.amazon.aps.iva.a1.f fVar3, com.amazon.aps.iva.a1.f fVar4, com.amazon.aps.iva.g0.d dVar, com.amazon.aps.iva.l0.c0 c0Var, boolean z, boolean z2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.o2.c cVar) {
        super(2);
        this.h = p2Var;
        this.i = a0Var;
        this.j = i;
        this.k = i2;
        this.l = k2Var;
        this.m = e0Var;
        this.n = p0Var;
        this.o = fVar;
        this.p = fVar2;
        this.q = fVar3;
        this.r = fVar4;
        this.s = dVar;
        this.t = c0Var;
        this.u = z;
        this.v = z2;
        this.w = lVar;
        this.x = qVar;
        this.y = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f v2Var;
        com.amazon.aps.iva.a1.f a;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            f.a aVar = f.a.c;
            p2 p2Var = this.h;
            com.amazon.aps.iva.a1.f g = androidx.compose.foundation.layout.e.g(aVar, ((com.amazon.aps.iva.o2.e) p2Var.f.getValue()).b, Float.NaN);
            com.amazon.aps.iva.yb0.j.f(g, "<this>");
            com.amazon.aps.iva.c2.a0 a0Var = this.i;
            com.amazon.aps.iva.yb0.j.f(a0Var, "textStyle");
            com.amazon.aps.iva.a1.f a2 = com.amazon.aps.iva.a1.e.a(g, com.amazon.aps.iva.v1.t1.a, new k0(this.j, this.k, a0Var));
            p pVar = new p(p2Var);
            com.amazon.aps.iva.yb0.j.f(a2, "<this>");
            k2 k2Var = this.l;
            com.amazon.aps.iva.yb0.j.f(k2Var, "scrollerPosition");
            com.amazon.aps.iva.i2.e0 e0Var = this.m;
            com.amazon.aps.iva.yb0.j.f(e0Var, "textFieldValue");
            com.amazon.aps.iva.i2.p0 p0Var = this.n;
            com.amazon.aps.iva.yb0.j.f(p0Var, "visualTransformation");
            com.amazon.aps.iva.b0.f0 f0Var = (com.amazon.aps.iva.b0.f0) k2Var.e.getValue();
            int i = com.amazon.aps.iva.c2.z.c;
            long j = e0Var.b;
            int i2 = (int) (j >> 32);
            if (i2 == ((int) (k2Var.d >> 32))) {
                if (com.amazon.aps.iva.c2.z.c(j) != com.amazon.aps.iva.c2.z.c(k2Var.d)) {
                    i2 = com.amazon.aps.iva.c2.z.c(j);
                } else {
                    i2 = com.amazon.aps.iva.c2.z.e(j);
                }
            }
            k2Var.d = j;
            com.amazon.aps.iva.i2.o0 a3 = u2.a(p0Var, e0Var.a);
            int i3 = g2.a.a[f0Var.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    v2Var = new l0(k2Var, i2, a3, pVar);
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                v2Var = new v2(k2Var, i2, a3, pVar);
            }
            com.amazon.aps.iva.a1.f o = com.amazon.aps.iva.cq.b.G(a2).o(v2Var).o(this.o).o(this.p);
            com.amazon.aps.iva.yb0.j.f(o, "<this>");
            a = com.amazon.aps.iva.a1.e.a(o, com.amazon.aps.iva.v1.t1.a, new o2(a0Var));
            com.amazon.aps.iva.l0.y.a(48, 0, iVar2, androidx.compose.foundation.relocation.a.a(a.o(this.q).o(this.r), this.s), com.amazon.aps.iva.v0.b.b(iVar2, -363167407, new o(this.t, this.h, this.u, this.v, this.w, this.m, this.x, this.y, this.k)));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
