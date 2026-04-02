package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.a1;
import com.amazon.aps.iva.oc0.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: LazySubstitutingClassDescriptor.java */
/* loaded from: classes4.dex */
public final class a0 extends b0 {
    public final b0 b;
    public final q1 c;
    public q1 d;
    public ArrayList e;
    public ArrayList f;
    public com.amazon.aps.iva.ee0.m g;

    public a0(b0 b0Var, q1 q1Var) {
        this.b = b0Var;
        this.c = q1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void A0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rc0.a0.A0(int):void");
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.d D() {
        return this.b.D();
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.d(this, d);
    }

    public final q1 E0() {
        if (this.d == null) {
            q1 q1Var = this.c;
            if (q1Var.h()) {
                this.d = q1Var;
            } else {
                List<y0> parameters = this.b.h().getParameters();
                this.e = new ArrayList(parameters.size());
                this.d = com.amazon.aps.iva.aq.j.P(parameters, q1Var.g(), this, this.e);
                ArrayList arrayList = this.e;
                com.amazon.aps.iva.yb0.j.f(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (Boolean.valueOf(!((y0) obj).O()).booleanValue()) {
                        arrayList2.add(obj);
                    }
                }
                this.f = arrayList2;
            }
        }
        return this.d;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.q0 F0() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i Q() {
        com.amazon.aps.iva.xd0.i Q = this.b.Q();
        if (Q != null) {
            return Q;
        }
        A0(28);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final a1<com.amazon.aps.iva.ee0.m0> R() {
        a1<com.amazon.aps.iva.ee0.m0> R = this.b.R();
        if (R == null) {
            return null;
        }
        boolean z = R instanceof com.amazon.aps.iva.oc0.w;
        q1 q1Var = this.c;
        if (z) {
            com.amazon.aps.iva.oc0.w wVar = (com.amazon.aps.iva.oc0.w) R;
            com.amazon.aps.iva.ee0.m0 m0Var = (com.amazon.aps.iva.ee0.m0) wVar.b;
            if (m0Var != null && !q1Var.h()) {
                m0Var = (com.amazon.aps.iva.ee0.m0) E0().k(m0Var, v1.INVARIANT);
            }
            return new com.amazon.aps.iva.oc0.w(wVar.a, m0Var);
        } else if (R instanceof com.amazon.aps.iva.oc0.d0) {
            List<com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.ee0.m0>> a = R.a();
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(a));
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) it.next();
                com.amazon.aps.iva.nd0.f fVar = (com.amazon.aps.iva.nd0.f) jVar.b;
                com.amazon.aps.iva.ee0.m0 m0Var2 = (com.amazon.aps.iva.ee0.m0) ((com.amazon.aps.iva.he0.i) jVar.c);
                if (m0Var2 != null && !q1Var.h()) {
                    m0Var2 = (com.amazon.aps.iva.ee0.m0) E0().k(m0Var2, v1.INVARIANT);
                }
                arrayList.add(new com.amazon.aps.iva.kb0.j(fVar, m0Var2));
            }
            return new com.amazon.aps.iva.oc0.d0(arrayList);
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i T() {
        com.amazon.aps.iva.xd0.i s0 = s0(com.amazon.aps.iva.ud0.b.i(com.amazon.aps.iva.qd0.i.d(this.b)));
        if (s0 != null) {
            return s0;
        }
        A0(12);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return this.b.U();
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final List<com.amazon.aps.iva.oc0.q0> V() {
        List<com.amazon.aps.iva.oc0.q0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        A0(17);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean X() {
        return this.b.X();
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean a0() {
        return this.b.a0();
    }

    @Override // com.amazon.aps.iva.oc0.v0
    public final com.amazon.aps.iva.oc0.i b(q1 q1Var) {
        if (q1Var != null) {
            if (q1Var.h()) {
                return this;
            }
            return new a0(this, q1.f(q1Var.g(), E0().g()));
        }
        A0(23);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        com.amazon.aps.iva.oc0.k d = this.b.d();
        if (d != null) {
            return d;
        }
        A0(22);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.b0
    public final com.amazon.aps.iva.xd0.i d0(m1 m1Var, com.amazon.aps.iva.fe0.f fVar) {
        if (m1Var != null) {
            if (fVar != null) {
                com.amazon.aps.iva.xd0.i d0 = this.b.d0(m1Var, fVar);
                if (this.c.h()) {
                    if (d0 != null) {
                        return d0;
                    }
                    A0(7);
                    throw null;
                }
                return new com.amazon.aps.iva.xd0.n(d0, E0());
            }
            A0(6);
            throw null;
        }
        A0(5);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final Collection<com.amazon.aps.iva.oc0.d> e() {
        Collection<com.amazon.aps.iva.oc0.d> e = this.b.e();
        ArrayList arrayList = new ArrayList(e.size());
        for (com.amazon.aps.iva.oc0.d dVar : e) {
            arrayList.add(((com.amazon.aps.iva.oc0.d) dVar.C0().g(dVar.a()).d(dVar.o()).q(dVar.getVisibility()).n(dVar.getKind()).i().build()).b(E0()));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean f0() {
        return this.b.f0();
    }

    @Override // com.amazon.aps.iva.oc0.n
    public final com.amazon.aps.iva.oc0.t0 g() {
        return com.amazon.aps.iva.oc0.t0.a;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return this.b.g0();
    }

    @Override // com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        com.amazon.aps.iva.pc0.h annotations = this.b.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        A0(19);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.f getKind() {
        com.amazon.aps.iva.oc0.f kind = this.b.getKind();
        if (kind != null) {
            return kind;
        }
        A0(25);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.nd0.f getName() {
        com.amazon.aps.iva.nd0.f name = this.b.getName();
        if (name != null) {
            return name;
        }
        A0(20);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        com.amazon.aps.iva.oc0.r visibility = this.b.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        A0(27);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final c1 h() {
        c1 h = this.b.h();
        if (this.c.h()) {
            if (h != null) {
                return h;
            }
            A0(0);
            throw null;
        }
        if (this.g == null) {
            q1 E0 = E0();
            Collection<com.amazon.aps.iva.ee0.e0> g = h.g();
            ArrayList arrayList = new ArrayList(g.size());
            for (com.amazon.aps.iva.ee0.e0 e0Var : g) {
                arrayList.add(E0.k(e0Var, v1.INVARIANT));
            }
            this.g = new com.amazon.aps.iva.ee0.m(this, this.e, arrayList, com.amazon.aps.iva.de0.c.e);
        }
        com.amazon.aps.iva.ee0.m mVar = this.g;
        if (mVar != null) {
            return mVar;
        }
        A0(1);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i h0() {
        com.amazon.aps.iva.xd0.i h0 = this.b.h0();
        if (h0 != null) {
            return h0;
        }
        A0(15);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.e i0() {
        return this.b.i0();
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean isExternal() {
        return this.b.isExternal();
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean isInline() {
        return this.b.isInline();
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.h
    public final com.amazon.aps.iva.ee0.m0 m() {
        com.amazon.aps.iva.ee0.a1 c;
        List<j1> e = s1.e(h().getParameters());
        com.amazon.aps.iva.pc0.h annotations = getAnnotations();
        com.amazon.aps.iva.yb0.j.f(annotations, "annotations");
        if (annotations.isEmpty()) {
            com.amazon.aps.iva.ee0.a1.c.getClass();
            c = com.amazon.aps.iva.ee0.a1.d;
        } else {
            a1.a aVar = com.amazon.aps.iva.ee0.a1.c;
            List J = f1.J(new com.amazon.aps.iva.ee0.k(annotations));
            aVar.getClass();
            c = a1.a.c(J);
        }
        return com.amazon.aps.iva.ee0.f0.h(e, T(), c, h(), false);
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.i
    public final List<y0> n() {
        E0();
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            return arrayList;
        }
        A0(30);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.b0 o() {
        com.amazon.aps.iva.oc0.b0 o = this.b.o();
        if (o != null) {
            return o;
        }
        A0(26);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean s() {
        return this.b.s();
    }

    @Override // com.amazon.aps.iva.rc0.b0
    public final com.amazon.aps.iva.xd0.i s0(com.amazon.aps.iva.fe0.f fVar) {
        if (fVar != null) {
            com.amazon.aps.iva.xd0.i s0 = this.b.s0(fVar);
            if (this.c.h()) {
                if (s0 != null) {
                    return s0;
                }
                A0(14);
                throw null;
            }
            return new com.amazon.aps.iva.xd0.n(s0, E0());
        }
        A0(13);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i u(m1 m1Var) {
        if (m1Var != null) {
            com.amazon.aps.iva.xd0.i d0 = d0(m1Var, com.amazon.aps.iva.ud0.b.i(com.amazon.aps.iva.qd0.i.d(this)));
            if (d0 != null) {
                return d0;
            }
            A0(11);
            throw null;
        }
        A0(10);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final Collection<com.amazon.aps.iva.oc0.e> x() {
        Collection<com.amazon.aps.iva.oc0.e> x = this.b.x();
        if (x != null) {
            return x;
        }
        A0(31);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.i
    public final boolean z() {
        return this.b.z();
    }

    @Override // com.amazon.aps.iva.rc0.b0, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.e a() {
        com.amazon.aps.iva.oc0.e a = this.b.a();
        if (a != null) {
            return a;
        }
        A0(21);
        throw null;
    }
}
