package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.n2.k;
import com.amazon.aps.iva.o0.e0;
/* compiled from: TextFieldImpl.kt */
/* loaded from: classes.dex */
public final class k3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ float h;
    public final /* synthetic */ long i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k3(float f, long j, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i, boolean z, long j2) {
        super(2);
        this.h = f;
        this.i = j;
        this.j = pVar;
        this.k = i;
        this.l = z;
        this.m = j2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.n2.k kVar;
        float f;
        com.amazon.aps.iva.c2.r rVar;
        com.amazon.aps.iva.c2.q qVar;
        boolean z;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.o0.q3 q3Var = c4.b;
            com.amazon.aps.iva.c2.a0 a0Var = ((b4) iVar2.i(q3Var)).g;
            com.amazon.aps.iva.c2.a0 a0Var2 = ((b4) iVar2.i(q3Var)).l;
            com.amazon.aps.iva.yb0.j.f(a0Var, "start");
            com.amazon.aps.iva.yb0.j.f(a0Var2, "stop");
            int i = com.amazon.aps.iva.c2.w.e;
            com.amazon.aps.iva.c2.u uVar = a0Var.a;
            com.amazon.aps.iva.yb0.j.f(uVar, "start");
            com.amazon.aps.iva.c2.u uVar2 = a0Var2.a;
            com.amazon.aps.iva.yb0.j.f(uVar2, "stop");
            com.amazon.aps.iva.n2.k kVar2 = uVar.a;
            com.amazon.aps.iva.yb0.j.f(kVar2, "start");
            com.amazon.aps.iva.n2.k kVar3 = uVar2.a;
            com.amazon.aps.iva.yb0.j.f(kVar3, "stop");
            boolean z2 = kVar2 instanceof com.amazon.aps.iva.n2.b;
            float f2 = this.h;
            if (!z2 && !(kVar3 instanceof com.amazon.aps.iva.n2.b)) {
                long x = defpackage.i.x(kVar2.b(), kVar3.b(), f2);
                if (x != com.amazon.aps.iva.f1.x.g) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    kVar = new com.amazon.aps.iva.n2.c(x);
                } else {
                    kVar = k.b.a;
                }
            } else if (z2 && (kVar3 instanceof com.amazon.aps.iva.n2.b)) {
                kVar = k.a.a(com.amazon.aps.iva.cq.b.Y(kVar2.a(), kVar3.a(), f2), (com.amazon.aps.iva.f1.s) com.amazon.aps.iva.c2.w.b(f2, ((com.amazon.aps.iva.n2.b) kVar2).a, ((com.amazon.aps.iva.n2.b) kVar3).a));
            } else {
                kVar = (com.amazon.aps.iva.n2.k) com.amazon.aps.iva.c2.w.b(f2, kVar2, kVar3);
            }
            com.amazon.aps.iva.n2.k kVar4 = kVar;
            com.amazon.aps.iva.h2.k kVar5 = (com.amazon.aps.iva.h2.k) com.amazon.aps.iva.c2.w.b(f2, uVar.f, uVar2.f);
            long c = com.amazon.aps.iva.c2.w.c(uVar.b, uVar2.b, f2);
            com.amazon.aps.iva.h2.y yVar = uVar.c;
            if (yVar == null) {
                yVar = com.amazon.aps.iva.h2.y.g;
            }
            com.amazon.aps.iva.h2.y yVar2 = uVar2.c;
            if (yVar2 == null) {
                yVar2 = com.amazon.aps.iva.h2.y.g;
            }
            com.amazon.aps.iva.yb0.j.f(yVar, "start");
            com.amazon.aps.iva.yb0.j.f(yVar2, "stop");
            com.amazon.aps.iva.h2.y yVar3 = new com.amazon.aps.iva.h2.y(com.amazon.aps.iva.aq.j.j(com.amazon.aps.iva.cq.b.Z(yVar.b, yVar2.b, f2), 1, 1000));
            com.amazon.aps.iva.h2.t tVar = (com.amazon.aps.iva.h2.t) com.amazon.aps.iva.c2.w.b(f2, uVar.d, uVar2.d);
            com.amazon.aps.iva.h2.u uVar3 = (com.amazon.aps.iva.h2.u) com.amazon.aps.iva.c2.w.b(f2, uVar.e, uVar2.e);
            String str = (String) com.amazon.aps.iva.c2.w.b(f2, uVar.g, uVar2.g);
            long c2 = com.amazon.aps.iva.c2.w.c(uVar.h, uVar2.h, f2);
            float f3 = 0.0f;
            com.amazon.aps.iva.n2.a aVar = uVar.i;
            if (aVar != null) {
                f = aVar.a;
            } else {
                f = 0.0f;
            }
            com.amazon.aps.iva.n2.a aVar2 = uVar2.i;
            if (aVar2 != null) {
                f3 = aVar2.a;
            }
            float Y = com.amazon.aps.iva.cq.b.Y(f, f3, f2);
            com.amazon.aps.iva.n2.l lVar = com.amazon.aps.iva.n2.l.c;
            com.amazon.aps.iva.n2.l lVar2 = uVar.j;
            if (lVar2 == null) {
                lVar2 = lVar;
            }
            com.amazon.aps.iva.n2.l lVar3 = uVar2.j;
            if (lVar3 != null) {
                lVar = lVar3;
            }
            com.amazon.aps.iva.n2.l lVar4 = new com.amazon.aps.iva.n2.l(com.amazon.aps.iva.cq.b.Y(lVar2.a, lVar.a, f2), com.amazon.aps.iva.cq.b.Y(lVar2.b, lVar.b, f2));
            com.amazon.aps.iva.j2.d dVar = (com.amazon.aps.iva.j2.d) com.amazon.aps.iva.c2.w.b(f2, uVar.k, uVar2.k);
            long x2 = defpackage.i.x(uVar.l, uVar2.l, f2);
            com.amazon.aps.iva.n2.i iVar3 = (com.amazon.aps.iva.n2.i) com.amazon.aps.iva.c2.w.b(f2, uVar.m, uVar2.m);
            com.amazon.aps.iva.f1.t0 t0Var = uVar.n;
            if (t0Var == null) {
                t0Var = new com.amazon.aps.iva.f1.t0();
            }
            com.amazon.aps.iva.f1.t0 t0Var2 = uVar2.n;
            if (t0Var2 == null) {
                t0Var2 = new com.amazon.aps.iva.f1.t0();
            }
            long x3 = defpackage.i.x(t0Var.a, t0Var2.a, f2);
            long j = t0Var.b;
            float c3 = com.amazon.aps.iva.e1.c.c(j);
            long j2 = t0Var2.b;
            com.amazon.aps.iva.f1.t0 t0Var3 = new com.amazon.aps.iva.f1.t0(x3, com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.cq.b.Y(c3, com.amazon.aps.iva.e1.c.c(j2), f2), com.amazon.aps.iva.cq.b.Y(com.amazon.aps.iva.e1.c.d(j), com.amazon.aps.iva.e1.c.d(j2), f2)), com.amazon.aps.iva.cq.b.Y(t0Var.c, t0Var2.c, f2));
            com.amazon.aps.iva.c2.r rVar2 = uVar.o;
            if (rVar2 == null && uVar2.o == null) {
                rVar = null;
            } else {
                if (rVar2 == null) {
                    rVar2 = com.amazon.aps.iva.c2.r.a;
                }
                rVar = rVar2;
            }
            com.amazon.aps.iva.c2.u uVar4 = new com.amazon.aps.iva.c2.u(kVar4, c, yVar3, tVar, uVar3, kVar5, str, c2, new com.amazon.aps.iva.n2.a(Y), lVar4, dVar, x2, iVar3, t0Var3, rVar, (com.amazon.aps.iva.h1.f) com.amazon.aps.iva.c2.w.b(f2, uVar.p, uVar2.p));
            int i2 = com.amazon.aps.iva.c2.o.b;
            com.amazon.aps.iva.c2.n nVar = a0Var.b;
            com.amazon.aps.iva.yb0.j.f(nVar, "start");
            com.amazon.aps.iva.c2.n nVar2 = a0Var2.b;
            com.amazon.aps.iva.yb0.j.f(nVar2, "stop");
            com.amazon.aps.iva.n2.h hVar = (com.amazon.aps.iva.n2.h) com.amazon.aps.iva.c2.w.b(f2, nVar.a, nVar2.a);
            com.amazon.aps.iva.n2.j jVar = (com.amazon.aps.iva.n2.j) com.amazon.aps.iva.c2.w.b(f2, nVar.b, nVar2.b);
            long c4 = com.amazon.aps.iva.c2.w.c(nVar.c, nVar2.c, f2);
            com.amazon.aps.iva.n2.m mVar = nVar.d;
            if (mVar == null) {
                mVar = com.amazon.aps.iva.n2.m.c;
            }
            com.amazon.aps.iva.n2.m mVar2 = nVar2.d;
            if (mVar2 == null) {
                mVar2 = com.amazon.aps.iva.n2.m.c;
            }
            com.amazon.aps.iva.yb0.j.f(mVar, "start");
            com.amazon.aps.iva.yb0.j.f(mVar2, "stop");
            com.amazon.aps.iva.n2.m mVar3 = new com.amazon.aps.iva.n2.m(com.amazon.aps.iva.c2.w.c(mVar.a, mVar2.a, f2), com.amazon.aps.iva.c2.w.c(mVar.b, mVar2.b, f2));
            com.amazon.aps.iva.c2.q qVar2 = nVar.e;
            com.amazon.aps.iva.c2.q qVar3 = nVar2.e;
            if (qVar2 == null && qVar3 == null) {
                qVar = null;
            } else {
                if (qVar2 == null) {
                    qVar2 = com.amazon.aps.iva.c2.q.c;
                }
                if (qVar3 == null) {
                    qVar3 = com.amazon.aps.iva.c2.q.c;
                }
                com.amazon.aps.iva.yb0.j.f(qVar2, "start");
                com.amazon.aps.iva.yb0.j.f(qVar3, "stop");
                boolean z3 = qVar2.a;
                boolean z4 = qVar3.a;
                if (z3 != z4) {
                    qVar2 = new com.amazon.aps.iva.c2.q(((Boolean) com.amazon.aps.iva.c2.w.b(f2, Boolean.valueOf(z3), Boolean.valueOf(z4))).booleanValue(), ((com.amazon.aps.iva.c2.e) com.amazon.aps.iva.c2.w.b(f2, new com.amazon.aps.iva.c2.e(qVar2.b), new com.amazon.aps.iva.c2.e(qVar3.b))).a);
                }
                qVar = qVar2;
            }
            com.amazon.aps.iva.c2.a0 a0Var3 = new com.amazon.aps.iva.c2.a0(uVar4, new com.amazon.aps.iva.c2.n(hVar, jVar, c4, mVar3, qVar, (com.amazon.aps.iva.n2.f) com.amazon.aps.iva.c2.w.b(f2, nVar.f, nVar2.f), (com.amazon.aps.iva.n2.e) com.amazon.aps.iva.c2.w.b(f2, nVar.g, nVar2.g), (com.amazon.aps.iva.n2.d) com.amazon.aps.iva.c2.w.b(f2, nVar.h, nVar2.h), (com.amazon.aps.iva.n2.n) com.amazon.aps.iva.c2.w.b(f2, nVar.i, nVar2.i)));
            long j3 = this.m;
            if (this.l) {
                a0Var3 = com.amazon.aps.iva.c2.a0.a(16777214, j3, 0L, 0L, null, a0Var3, null, null, null);
            }
            j3.b(this.i, a0Var3, null, this.j, iVar2, ((this.k >> 6) & 14) | 384, 0);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
