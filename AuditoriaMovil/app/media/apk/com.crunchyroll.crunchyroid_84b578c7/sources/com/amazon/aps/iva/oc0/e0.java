package com.amazon.aps.iva.oc0;

import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.xd0.i;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: NotFoundClasses.kt */
/* loaded from: classes4.dex */
public final class e0 {
    public final com.amazon.aps.iva.de0.l a;
    public final c0 b;
    public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.c, f0> c;
    public final com.amazon.aps.iva.de0.g<a, e> d;

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final com.amazon.aps.iva.nd0.b a;
        public final List<Integer> b;

        public a(com.amazon.aps.iva.nd0.b bVar, List<Integer> list) {
            com.amazon.aps.iva.yb0.j.f(bVar, "classId");
            this.a = bVar;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.rc0.m {
        public final boolean i;
        public final ArrayList j;
        public final com.amazon.aps.iva.ee0.m k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.de0.l lVar, g gVar, com.amazon.aps.iva.nd0.f fVar, boolean z, int i) {
            super(lVar, gVar, fVar, t0.a);
            com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
            com.amazon.aps.iva.yb0.j.f(gVar, "container");
            this.i = z;
            com.amazon.aps.iva.ec0.j T = com.amazon.aps.iva.aq.j.T(0, i);
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(T));
            com.amazon.aps.iva.ec0.i it = T.iterator();
            while (it.d) {
                int b = it.b();
                v1 v1Var = v1.INVARIANT;
                arrayList.add(com.amazon.aps.iva.rc0.t0.K0(this, v1Var, com.amazon.aps.iva.nd0.f.h(RequestConfiguration.MAX_AD_CONTENT_RATING_T + b), b, lVar));
            }
            this.j = arrayList;
            this.k = new com.amazon.aps.iva.ee0.m(this, z0.b(this), l1.H(com.amazon.aps.iva.ud0.b.j(this).j().f()), lVar);
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final com.amazon.aps.iva.oc0.d D() {
            return null;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final a1<com.amazon.aps.iva.ee0.m0> R() {
            return null;
        }

        @Override // com.amazon.aps.iva.oc0.a0
        public final boolean U() {
            return false;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final boolean X() {
            return false;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final boolean a0() {
            return false;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final Collection<com.amazon.aps.iva.oc0.d> e() {
            return com.amazon.aps.iva.lb0.b0.b;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final boolean f0() {
            return false;
        }

        @Override // com.amazon.aps.iva.oc0.a0
        public final boolean g0() {
            return false;
        }

        @Override // com.amazon.aps.iva.pc0.a
        public final com.amazon.aps.iva.pc0.h getAnnotations() {
            return h.a.a;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final f getKind() {
            return f.CLASS;
        }

        @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
        public final r getVisibility() {
            q.h hVar = q.e;
            com.amazon.aps.iva.yb0.j.e(hVar, "PUBLIC");
            return hVar;
        }

        @Override // com.amazon.aps.iva.oc0.h
        public final com.amazon.aps.iva.ee0.c1 h() {
            return this.k;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final com.amazon.aps.iva.xd0.i h0() {
            return i.b.b;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final e i0() {
            return null;
        }

        @Override // com.amazon.aps.iva.rc0.m, com.amazon.aps.iva.oc0.a0
        public final boolean isExternal() {
            return false;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final boolean isInline() {
            return false;
        }

        @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.i
        public final List<y0> n() {
            return this.j;
        }

        @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.a0
        public final b0 o() {
            return b0.FINAL;
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final boolean s() {
            return false;
        }

        @Override // com.amazon.aps.iva.rc0.b0
        public final com.amazon.aps.iva.xd0.i s0(com.amazon.aps.iva.fe0.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
            return i.b.b;
        }

        public final String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // com.amazon.aps.iva.oc0.e
        public final Collection<e> x() {
            return com.amazon.aps.iva.lb0.z.b;
        }

        @Override // com.amazon.aps.iva.oc0.i
        public final boolean z() {
            return this.i;
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a, e> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final e invoke(a aVar) {
            g gVar;
            int i;
            a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "<name for destructuring parameter 0>");
            com.amazon.aps.iva.nd0.b bVar = aVar2.a;
            if (!bVar.c) {
                com.amazon.aps.iva.nd0.b g = bVar.g();
                e0 e0Var = e0.this;
                List<Integer> list = aVar2.b;
                if (g == null || (gVar = e0Var.a(g, com.amazon.aps.iva.lb0.x.o0(list))) == null) {
                    com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.c, f0> gVar2 = e0Var.c;
                    com.amazon.aps.iva.nd0.c h = bVar.h();
                    com.amazon.aps.iva.yb0.j.e(h, "classId.packageFqName");
                    gVar = (g) ((c.k) gVar2).invoke(h);
                }
                g gVar3 = gVar;
                boolean k = bVar.k();
                com.amazon.aps.iva.de0.l lVar = e0Var.a;
                com.amazon.aps.iva.nd0.f j = bVar.j();
                com.amazon.aps.iva.yb0.j.e(j, "classId.shortClassName");
                Integer num = (Integer) com.amazon.aps.iva.lb0.x.v0(list);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                return new b(lVar, gVar3, j, k, i);
            }
            throw new UnsupportedOperationException("Unresolved local class: " + bVar);
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.c, f0> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final f0 invoke(com.amazon.aps.iva.nd0.c cVar) {
            com.amazon.aps.iva.nd0.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "fqName");
            return new com.amazon.aps.iva.rc0.r(e0.this.b, cVar2);
        }
    }

    public e0(com.amazon.aps.iva.de0.l lVar, c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        this.a = lVar;
        this.b = c0Var;
        this.c = lVar.f(new d());
        this.d = lVar.f(new c());
    }

    public final e a(com.amazon.aps.iva.nd0.b bVar, List<Integer> list) {
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        return (e) ((c.k) this.d).invoke(new a(bVar, list));
    }
}
