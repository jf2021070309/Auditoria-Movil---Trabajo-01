package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.y;
import com.amazon.aps.iva.fe0.b;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.e0;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes4.dex */
public final class p implements b {
    public static final p a = new p();

    @Override // com.amazon.aps.iva.he0.n
    public final boolean A(com.amazon.aps.iva.he0.i iVar) {
        com.amazon.aps.iva.he0.d dVar;
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        m0 i = b.a.i(iVar);
        if (i != null) {
            dVar = b.a.d(this, i);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean B(com.amazon.aps.iva.he0.l lVar) {
        return b.a.H(lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.d C(com.amazon.aps.iva.he0.i iVar) {
        return b.a.d(this, iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final c1 D(com.amazon.aps.iva.he0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        m0 i = b.a.i(hVar);
        if (i == null) {
            i = b(hVar);
        }
        return b.a.f0(i);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final j1 E(com.amazon.aps.iva.he0.c cVar) {
        return b.a.c0(cVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.k F(com.amazon.aps.iva.he0.j jVar, int i) {
        com.amazon.aps.iva.yb0.j.f(jVar, "<this>");
        if (jVar instanceof com.amazon.aps.iva.he0.i) {
            return b.a.n((com.amazon.aps.iva.he0.h) jVar, i);
        }
        if (jVar instanceof com.amazon.aps.iva.he0.a) {
            com.amazon.aps.iva.he0.k kVar = ((com.amazon.aps.iva.he0.a) jVar).get(i);
            com.amazon.aps.iva.yb0.j.e(kVar, "get(index)");
            return kVar;
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + e0.a(jVar.getClass())).toString());
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.k G(com.amazon.aps.iva.he0.i iVar, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        if (i >= 0 && i < b.a.b(iVar)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return b.a.n(iVar, i);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean H(com.amazon.aps.iva.he0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "$receiver");
        return dVar instanceof com.amazon.aps.iva.rd0.a;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final c I(com.amazon.aps.iva.he0.i iVar) {
        return b.a.d0(this, iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean J(com.amazon.aps.iva.he0.l lVar) {
        return b.a.O(lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.h K(com.amazon.aps.iva.he0.h hVar) {
        return b.a.j0(this, hVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final int L(com.amazon.aps.iva.he0.l lVar) {
        return b.a.a0(lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final Collection<com.amazon.aps.iva.he0.h> M(com.amazon.aps.iva.he0.l lVar) {
        return b.a.e0(lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.k N(com.amazon.aps.iva.he0.h hVar, int i) {
        return b.a.n(hVar, i);
    }

    @Override // com.amazon.aps.iva.he0.p
    public final boolean O(com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.i iVar2) {
        return b.a.E(iVar, iVar2);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final u1 P(com.amazon.aps.iva.he0.d dVar) {
        return b.a.X(dVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.i Q(com.amazon.aps.iva.he0.i iVar) {
        m0 Z;
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        com.amazon.aps.iva.ee0.q e = b.a.e(iVar);
        if (e != null && (Z = b.a.Z(e)) != null) {
            return Z;
        }
        return iVar;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final m0 R(com.amazon.aps.iva.he0.h hVar) {
        return b.a.i(hVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean S(com.amazon.aps.iva.he0.m mVar, com.amazon.aps.iva.he0.l lVar) {
        return b.a.D(mVar, lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean T(com.amazon.aps.iva.he0.l lVar) {
        return b.a.I(lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final m0 U(com.amazon.aps.iva.he0.f fVar) {
        return b.a.h0(fVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean V(com.amazon.aps.iva.he0.i iVar) {
        return b.a.J(iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean W(com.amazon.aps.iva.he0.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        return b.a.G(b.a.f0(iVar));
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean X(com.amazon.aps.iva.he0.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        return b.a.L(b.a.f0(iVar));
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean Y(com.amazon.aps.iva.he0.h hVar) {
        com.amazon.aps.iva.ee0.q qVar;
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        m0 i = b.a.i(hVar);
        if (i != null) {
            qVar = b.a.e(i);
        } else {
            qVar = null;
        }
        if (qVar != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean Z(com.amazon.aps.iva.he0.h hVar) {
        com.amazon.aps.iva.ee0.v vVar;
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        y g = b.a.g(hVar);
        if (g != null) {
            vVar = b.a.f(g);
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.m a(com.amazon.aps.iva.he0.l lVar, int i) {
        return b.a.q(lVar, i);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.r a0(com.amazon.aps.iva.he0.m mVar) {
        return b.a.B(mVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final m0 b(com.amazon.aps.iva.he0.h hVar) {
        m0 W;
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        y g = b.a.g(hVar);
        if (g == null || (W = b.a.W(g)) == null) {
            m0 i = b.a.i(hVar);
            com.amazon.aps.iva.yb0.j.c(i);
            return i;
        }
        return W;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final m0 b0(com.amazon.aps.iva.he0.h hVar) {
        m0 h0;
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        y g = b.a.g(hVar);
        if (g == null || (h0 = b.a.h0(g)) == null) {
            m0 i = b.a.i(hVar);
            com.amazon.aps.iva.yb0.j.c(i);
            return i;
        }
        return h0;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean c(com.amazon.aps.iva.he0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "$receiver");
        return hVar instanceof com.amazon.aps.iva.fd0.j;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean c0(com.amazon.aps.iva.he0.l lVar) {
        return b.a.L(lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean d(com.amazon.aps.iva.he0.d dVar) {
        return b.a.R(dVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean d0(com.amazon.aps.iva.he0.l lVar) {
        return b.a.F(lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean e(com.amazon.aps.iva.he0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        if (b.a.O(D(hVar)) && !b.a.P(hVar)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.r e0(com.amazon.aps.iva.he0.k kVar) {
        return b.a.A(kVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final int f(com.amazon.aps.iva.he0.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "<this>");
        if (jVar instanceof com.amazon.aps.iva.he0.i) {
            return b.a.b((com.amazon.aps.iva.he0.h) jVar);
        }
        if (jVar instanceof com.amazon.aps.iva.he0.a) {
            return ((com.amazon.aps.iva.he0.a) jVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + e0.a(jVar.getClass())).toString());
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean f0(com.amazon.aps.iva.he0.i iVar) {
        return b.a.U(iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean g(com.amazon.aps.iva.he0.k kVar) {
        return b.a.S(kVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final u1 g0(com.amazon.aps.iva.he0.k kVar) {
        return b.a.v(kVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.ee0.q h(com.amazon.aps.iva.he0.i iVar) {
        return b.a.e(iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final y0 h0(com.amazon.aps.iva.he0.q qVar) {
        return b.a.w(qVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final c1 i(com.amazon.aps.iva.he0.i iVar) {
        return b.a.f0(iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final m0 i0(com.amazon.aps.iva.he0.e eVar) {
        return b.a.Z(eVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.j j(com.amazon.aps.iva.he0.i iVar) {
        return b.a.c(iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean j0(com.amazon.aps.iva.he0.i iVar) {
        return b.a.T(iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final u1 k(com.amazon.aps.iva.he0.h hVar) {
        return b.a.Y(hVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final m0 k0(com.amazon.aps.iva.he0.i iVar, boolean z) {
        return b.a.i0(iVar, z);
    }

    @Override // com.amazon.aps.iva.fe0.b
    public final u1 l(com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.i iVar2) {
        return b.a.m(this, iVar, iVar2);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final l1 l0(com.amazon.aps.iva.he0.h hVar) {
        return b.a.j(hVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final int m(com.amazon.aps.iva.he0.h hVar) {
        return b.a.b(hVar);
    }

    public final boolean m0(com.amazon.aps.iva.he0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        if ((hVar instanceof com.amazon.aps.iva.he0.i) && b.a.N((com.amazon.aps.iva.he0.i) hVar)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final y n(com.amazon.aps.iva.he0.h hVar) {
        return b.a.g(hVar);
    }

    public final com.amazon.aps.iva.he0.h n0(com.amazon.aps.iva.he0.h hVar) {
        m0 i0;
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        m0 i = b.a.i(hVar);
        if (i != null && (i0 = b.a.i0(i, true)) != null) {
            return i0;
        }
        return hVar;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean o(com.amazon.aps.iva.he0.i iVar) {
        return b.a.N(iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final m0 p(com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.b bVar) {
        return b.a.k(iVar, bVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean q(com.amazon.aps.iva.he0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        if (b.a.N(b(hVar)) != b.a.N(b0(hVar))) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.he0.n
    public final Collection<com.amazon.aps.iva.he0.h> r(com.amazon.aps.iva.he0.i iVar) {
        return b.a.b0(this, iVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final m0 s(com.amazon.aps.iva.he0.f fVar) {
        return b.a.W(fVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean t(com.amazon.aps.iva.he0.l lVar) {
        return b.a.G(lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final com.amazon.aps.iva.he0.b v(com.amazon.aps.iva.he0.d dVar) {
        return b.a.l(dVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean w(com.amazon.aps.iva.he0.l lVar, com.amazon.aps.iva.he0.l lVar2) {
        return b.a.a(lVar, lVar2);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final boolean x(com.amazon.aps.iva.he0.l lVar) {
        return b.a.M(lVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final u1 y(ArrayList arrayList) {
        return com.amazon.aps.iva.aq.k.q(arrayList);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final j z(com.amazon.aps.iva.he0.d dVar) {
        return b.a.g0(dVar);
    }

    @Override // com.amazon.aps.iva.he0.n
    public final void u(com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.l lVar) {
    }
}
