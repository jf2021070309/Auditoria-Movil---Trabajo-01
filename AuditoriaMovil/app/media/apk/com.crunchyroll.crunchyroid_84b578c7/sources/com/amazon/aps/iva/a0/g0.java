package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.s1.s0;
/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
public final class g0 extends com.amazon.aps.iva.u1.j implements com.amazon.aps.iva.d1.f, com.amazon.aps.iva.u1.w, com.amazon.aps.iva.u1.i1, com.amazon.aps.iva.u1.r {
    public com.amazon.aps.iva.d1.w q;
    public final k0 r;
    public final c0 s;
    public final i0 t;
    public final l0 u;
    public final com.amazon.aps.iva.g0.e v;
    public final com.amazon.aps.iva.g0.g w;

    public g0(com.amazon.aps.iva.c0.l lVar) {
        k0 k0Var = new k0();
        t1(k0Var);
        this.r = k0Var;
        c0 c0Var = new c0(lVar);
        t1(c0Var);
        this.s = c0Var;
        i0 i0Var = new i0();
        t1(i0Var);
        this.t = i0Var;
        l0 l0Var = new l0();
        t1(l0Var);
        this.u = l0Var;
        com.amazon.aps.iva.g0.e eVar = new com.amazon.aps.iva.g0.e();
        this.v = eVar;
        com.amazon.aps.iva.g0.g gVar = new com.amazon.aps.iva.g0.g(eVar);
        t1(gVar);
        this.w = gVar;
    }

    @Override // com.amazon.aps.iva.u1.i1
    public final void o0(com.amazon.aps.iva.a2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
        this.r.o0(lVar);
    }

    @Override // com.amazon.aps.iva.d1.f
    public final void p0(com.amazon.aps.iva.d1.x xVar) {
        com.amazon.aps.iva.xb0.l lVar;
        com.amazon.aps.iva.xb0.l lVar2;
        com.amazon.aps.iva.yb0.j.f(xVar, "focusState");
        if (!com.amazon.aps.iva.yb0.j.a(this.q, xVar)) {
            boolean isFocused = xVar.isFocused();
            com.amazon.aps.iva.f0.y yVar = null;
            if (isFocused) {
                com.amazon.aps.iva.se0.i.d(i1(), null, null, new f0(this, null), 3);
            }
            if (this.n) {
                com.amazon.aps.iva.u1.j1.a(this);
            }
            c0 c0Var = this.s;
            com.amazon.aps.iva.c0.l lVar3 = c0Var.o;
            if (lVar3 != null) {
                if (isFocused) {
                    com.amazon.aps.iva.c0.d dVar = c0Var.p;
                    if (dVar != null) {
                        c0Var.t1(lVar3, new com.amazon.aps.iva.c0.e(dVar));
                        c0Var.p = null;
                    }
                    com.amazon.aps.iva.c0.d dVar2 = new com.amazon.aps.iva.c0.d();
                    c0Var.t1(lVar3, dVar2);
                    c0Var.p = dVar2;
                } else {
                    com.amazon.aps.iva.c0.d dVar3 = c0Var.p;
                    if (dVar3 != null) {
                        c0Var.t1(lVar3, new com.amazon.aps.iva.c0.e(dVar3));
                        c0Var.p = null;
                    }
                }
            }
            l0 l0Var = this.u;
            if (isFocused != l0Var.o) {
                if (!isFocused) {
                    if (l0Var.n) {
                        lVar2 = (com.amazon.aps.iva.xb0.l) l0Var.l(androidx.compose.foundation.k.a);
                    } else {
                        lVar2 = null;
                    }
                    if (lVar2 != null) {
                        lVar2.invoke(null);
                    }
                } else {
                    com.amazon.aps.iva.s1.q qVar = l0Var.p;
                    if (qVar != null && qVar.l()) {
                        if (l0Var.n) {
                            lVar = (com.amazon.aps.iva.xb0.l) l0Var.l(androidx.compose.foundation.k.a);
                        } else {
                            lVar = null;
                        }
                        if (lVar != null) {
                            lVar.invoke(l0Var.p);
                        }
                    }
                }
                l0Var.o = isFocused;
            }
            i0 i0Var = this.t;
            if (isFocused) {
                i0Var.getClass();
                com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
                com.amazon.aps.iva.u1.q0.a(i0Var, new h0(d0Var, i0Var));
                com.amazon.aps.iva.s1.s0 s0Var = (com.amazon.aps.iva.s1.s0) d0Var.b;
                if (s0Var != null) {
                    yVar = s0Var.a();
                }
                i0Var.o = yVar;
            } else {
                s0.a aVar = i0Var.o;
                if (aVar != null) {
                    aVar.release();
                }
                i0Var.o = null;
            }
            i0Var.p = isFocused;
            this.r.o = isFocused;
            this.q = xVar;
        }
    }

    @Override // com.amazon.aps.iva.u1.w
    public final void v(androidx.compose.ui.node.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "coordinates");
        com.amazon.aps.iva.g0.g gVar = this.w;
        gVar.getClass();
        gVar.p = oVar;
    }

    @Override // com.amazon.aps.iva.u1.r
    public final void z(androidx.compose.ui.node.o oVar) {
        this.u.z(oVar);
    }
}
