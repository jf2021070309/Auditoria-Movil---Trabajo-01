package com.amazon.aps.iva.ud0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.f;
import com.amazon.aps.iva.fe0.f;
import com.amazon.aps.iva.fe0.g;
import com.amazon.aps.iva.fe0.o;
import com.amazon.aps.iva.hc.m;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.e;
import com.amazon.aps.iva.oc0.f0;
import com.amazon.aps.iva.oc0.i;
import com.amazon.aps.iva.oc0.k;
import com.amazon.aps.iva.oc0.m0;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: DescriptorUtils.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final /* synthetic */ int a = 0;

    /* compiled from: DescriptorUtils.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends h implements l<c1, Boolean> {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final f getOwner() {
            return e0.a(c1.class);
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(c1 c1Var) {
            c1 c1Var2 = c1Var;
            j.f(c1Var2, "p0");
            return Boolean.valueOf(c1Var2.w0());
        }
    }

    static {
        com.amazon.aps.iva.nd0.f.h("value");
    }

    public static final boolean a(c1 c1Var) {
        j.f(c1Var, "<this>");
        Boolean d = com.amazon.aps.iva.me0.a.d(f1.J(c1Var), m.f, a.b);
        j.e(d, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return d.booleanValue();
    }

    public static com.amazon.aps.iva.oc0.b b(com.amazon.aps.iva.oc0.b bVar, l lVar) {
        j.f(bVar, "<this>");
        j.f(lVar, "predicate");
        return (com.amazon.aps.iva.oc0.b) com.amazon.aps.iva.me0.a.b(f1.J(bVar), new com.amazon.aps.iva.ud0.a(false), new c(lVar, new d0()));
    }

    public static final com.amazon.aps.iva.nd0.c c(k kVar) {
        j.f(kVar, "<this>");
        com.amazon.aps.iva.nd0.d h = h(kVar);
        if (!h.e()) {
            h = null;
        }
        if (h == null) {
            return null;
        }
        return h.h();
    }

    public static final e d(com.amazon.aps.iva.pc0.c cVar) {
        j.f(cVar, "<this>");
        com.amazon.aps.iva.oc0.h k = cVar.getType().I0().k();
        if (k instanceof e) {
            return (e) k;
        }
        return null;
    }

    public static final com.amazon.aps.iva.lc0.k e(k kVar) {
        j.f(kVar, "<this>");
        return j(kVar).j();
    }

    public static final com.amazon.aps.iva.nd0.b f(com.amazon.aps.iva.oc0.h hVar) {
        k d;
        com.amazon.aps.iva.nd0.b f;
        if (hVar == null || (d = hVar.d()) == null) {
            return null;
        }
        if (d instanceof f0) {
            return new com.amazon.aps.iva.nd0.b(((f0) d).c(), hVar.getName());
        }
        if (!(d instanceof i) || (f = f((com.amazon.aps.iva.oc0.h) d)) == null) {
            return null;
        }
        return f.d(hVar.getName());
    }

    public static final com.amazon.aps.iva.nd0.c g(k kVar) {
        j.f(kVar, "<this>");
        com.amazon.aps.iva.nd0.c h = com.amazon.aps.iva.qd0.i.h(kVar);
        if (h == null) {
            h = com.amazon.aps.iva.qd0.i.g(kVar.d()).b(kVar.getName()).h();
        }
        if (h != null) {
            return h;
        }
        com.amazon.aps.iva.qd0.i.a(4);
        throw null;
    }

    public static final com.amazon.aps.iva.nd0.d h(k kVar) {
        j.f(kVar, "<this>");
        com.amazon.aps.iva.nd0.d g = com.amazon.aps.iva.qd0.i.g(kVar);
        j.e(g, "getFqName(this)");
        return g;
    }

    public static final f.a i(c0 c0Var) {
        j.f(c0Var, "<this>");
        o oVar = (o) c0Var.A(g.a);
        return f.a.a;
    }

    public static final c0 j(k kVar) {
        j.f(kVar, "<this>");
        c0 d = com.amazon.aps.iva.qd0.i.d(kVar);
        j.e(d, "getContainingModule(this)");
        return d;
    }

    public static final com.amazon.aps.iva.oc0.b k(com.amazon.aps.iva.oc0.b bVar) {
        j.f(bVar, "<this>");
        if (bVar instanceof m0) {
            n0 S = ((m0) bVar).S();
            j.e(S, "correspondingProperty");
            return S;
        }
        return bVar;
    }
}
