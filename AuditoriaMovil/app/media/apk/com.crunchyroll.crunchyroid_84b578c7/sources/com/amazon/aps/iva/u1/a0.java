package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.h1.a;
/* compiled from: LayoutNodeDrawScope.kt */
/* loaded from: classes.dex */
public final class a0 implements com.amazon.aps.iva.h1.e, com.amazon.aps.iva.h1.c {
    public final com.amazon.aps.iva.h1.a b = new com.amazon.aps.iva.h1.a();
    public o c;

    @Override // com.amazon.aps.iva.h1.e
    public final void A0(com.amazon.aps.iva.f1.s sVar, long j, long j2, float f, int i, com.amazon.aps.iva.cq.b bVar, float f2, com.amazon.aps.iva.f1.y yVar, int i2) {
        com.amazon.aps.iva.yb0.j.f(sVar, "brush");
        this.b.A0(sVar, j, j2, f, i, bVar, f2, yVar, i2);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void B(com.amazon.aps.iva.f1.s sVar, long j, long j2, float f, com.amazon.aps.iva.h1.f fVar, com.amazon.aps.iva.f1.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(sVar, "brush");
        com.amazon.aps.iva.yb0.j.f(fVar, "style");
        this.b.B(sVar, j, j2, f, fVar, yVar, i);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void B0(long j, float f, float f2, long j2, long j3, float f3, com.amazon.aps.iva.h1.f fVar, com.amazon.aps.iva.f1.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(fVar, "style");
        this.b.B0(j, f, f2, j2, j3, f3, fVar, yVar, i);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void E0(com.amazon.aps.iva.f1.s sVar, long j, long j2, long j3, float f, com.amazon.aps.iva.h1.f fVar, com.amazon.aps.iva.f1.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(sVar, "brush");
        com.amazon.aps.iva.yb0.j.f(fVar, "style");
        this.b.E0(sVar, j, j2, j3, f, fVar, yVar, i);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void F(com.amazon.aps.iva.f1.m0 m0Var, com.amazon.aps.iva.f1.s sVar, float f, com.amazon.aps.iva.h1.f fVar, com.amazon.aps.iva.f1.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "path");
        com.amazon.aps.iva.yb0.j.f(sVar, "brush");
        com.amazon.aps.iva.yb0.j.f(fVar, "style");
        this.b.F(m0Var, sVar, f, fVar, yVar, i);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float I0(int i) {
        return this.b.I0(i);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float O0() {
        return this.b.O0();
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float P0(float f) {
        return this.b.getDensity() * f;
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void Q(long j, long j2, long j3, long j4, com.amazon.aps.iva.h1.f fVar, float f, com.amazon.aps.iva.f1.y yVar, int i) {
        this.b.Q(j, j2, j3, j4, fVar, f, yVar, i);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final a.b R0() {
        return this.b.c;
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void T(com.amazon.aps.iva.f1.i0 i0Var, long j, float f, com.amazon.aps.iva.h1.f fVar, com.amazon.aps.iva.f1.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(i0Var, "image");
        com.amazon.aps.iva.yb0.j.f(fVar, "style");
        this.b.T(i0Var, j, f, fVar, yVar, i);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void U0(long j, float f, long j2, float f2, com.amazon.aps.iva.h1.f fVar, com.amazon.aps.iva.f1.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(fVar, "style");
        this.b.U0(j, f, j2, f2, fVar, yVar, i);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void X0(long j, long j2, long j3, float f, com.amazon.aps.iva.h1.f fVar, com.amazon.aps.iva.f1.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(fVar, "style");
        this.b.X0(j, j2, j3, f, fVar, yVar, i);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final long Z0() {
        return this.b.Z0();
    }

    public final void b(com.amazon.aps.iva.f1.u uVar, long j, androidx.compose.ui.node.o oVar, o oVar2) {
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        com.amazon.aps.iva.yb0.j.f(oVar, "coordinator");
        o oVar3 = this.c;
        this.c = oVar2;
        com.amazon.aps.iva.o2.l lVar = oVar.i.t;
        com.amazon.aps.iva.h1.a aVar = this.b;
        a.C0315a c0315a = aVar.b;
        com.amazon.aps.iva.o2.c cVar = c0315a.a;
        com.amazon.aps.iva.o2.l lVar2 = c0315a.b;
        com.amazon.aps.iva.f1.u uVar2 = c0315a.c;
        long j2 = c0315a.d;
        c0315a.a = oVar;
        com.amazon.aps.iva.yb0.j.f(lVar, "<set-?>");
        c0315a.b = lVar;
        c0315a.c = uVar;
        c0315a.d = j;
        uVar.n();
        oVar2.w(this);
        uVar.g();
        a.C0315a c0315a2 = aVar.b;
        c0315a2.getClass();
        com.amazon.aps.iva.yb0.j.f(cVar, "<set-?>");
        c0315a2.a = cVar;
        com.amazon.aps.iva.yb0.j.f(lVar2, "<set-?>");
        c0315a2.b = lVar2;
        com.amazon.aps.iva.yb0.j.f(uVar2, "<set-?>");
        c0315a2.c = uVar2;
        c0315a2.d = j2;
        this.c = oVar3;
    }

    @Override // com.amazon.aps.iva.o2.c
    public final long b1(long j) {
        return this.b.b1(j);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void c0(long j, long j2, long j3, float f, int i, com.amazon.aps.iva.cq.b bVar, float f2, com.amazon.aps.iva.f1.y yVar, int i2) {
        this.b.c0(j, j2, j3, f, i, bVar, f2, yVar, i2);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final int f0(float f) {
        return this.b.f0(f);
    }

    @Override // com.amazon.aps.iva.h1.c
    public final void f1() {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.f1.u a = this.b.c.a();
        o oVar = this.c;
        com.amazon.aps.iva.yb0.j.c(oVar);
        j jVar = oVar.V().g;
        if (jVar != null && (jVar.e & 4) != 0) {
            while (jVar != null) {
                int i = jVar.d;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    jVar = jVar.g;
                }
            }
        }
        jVar = null;
        if (jVar != null) {
            com.amazon.aps.iva.p0.f fVar = null;
            while (jVar != null) {
                if (jVar instanceof o) {
                    o oVar2 = (o) jVar;
                    com.amazon.aps.iva.yb0.j.f(a, "canvas");
                    androidx.compose.ui.node.o d = i.d(oVar2, 4);
                    long b = com.amazon.aps.iva.o2.k.b(d.d);
                    androidx.compose.ui.node.e eVar = d.i;
                    eVar.getClass();
                    com.amazon.aps.iva.aq.j.K(eVar).getSharedDrawScope().b(a, b, d, oVar2);
                } else {
                    if ((jVar.d & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (jVar instanceof j)) {
                        int i2 = 0;
                        for (f.c cVar = jVar.p; cVar != null; cVar = cVar.g) {
                            if ((cVar.d & 4) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                i2++;
                                if (i2 == 1) {
                                    jVar = cVar;
                                } else {
                                    if (fVar == null) {
                                        fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                    }
                                    if (jVar != null) {
                                        fVar.b(jVar);
                                        jVar = null;
                                    }
                                    fVar.b(cVar);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                }
                jVar = i.b(fVar);
            }
            return;
        }
        androidx.compose.ui.node.o d2 = i.d(oVar, 4);
        if (d2.r1() == oVar.V()) {
            d2 = d2.j;
            com.amazon.aps.iva.yb0.j.c(d2);
        }
        d2.D1(a);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // com.amazon.aps.iva.h1.e
    public final com.amazon.aps.iva.o2.l getLayoutDirection() {
        return this.b.b.b;
    }

    @Override // com.amazon.aps.iva.h1.e
    public final long h() {
        return this.b.h();
    }

    @Override // com.amazon.aps.iva.o2.c
    public final long j(long j) {
        return this.b.j(j);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void j0(com.amazon.aps.iva.f1.m mVar, long j, float f, com.amazon.aps.iva.h1.f fVar, com.amazon.aps.iva.f1.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "path");
        com.amazon.aps.iva.yb0.j.f(fVar, "style");
        this.b.j0(mVar, j, f, fVar, yVar, i);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float l0(long j) {
        return this.b.l0(j);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void n0(com.amazon.aps.iva.f1.i0 i0Var, long j, long j2, long j3, long j4, float f, com.amazon.aps.iva.h1.f fVar, com.amazon.aps.iva.f1.y yVar, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(i0Var, "image");
        com.amazon.aps.iva.yb0.j.f(fVar, "style");
        this.b.n0(i0Var, j, j2, j3, j4, f, fVar, yVar, i, i2);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float x(float f) {
        return f / this.b.getDensity();
    }
}
