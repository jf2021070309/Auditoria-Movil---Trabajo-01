package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.ee0.w0;
import com.amazon.aps.iva.xd0.o;
import java.util.List;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes4.dex */
public final class f0 {
    public static final /* synthetic */ int a = 0;

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        public static final /* synthetic */ int h = 0;

        static {
            new a();
        }

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.f((com.amazon.aps.iva.fe0.f) obj, "<anonymous parameter 0>");
            return null;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes4.dex */
    public static final class b {
    }

    /* compiled from: KotlinTypeFactory.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fe0.f, m0> {
        public final /* synthetic */ c1 h;
        public final /* synthetic */ List<j1> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, a1 a1Var, c1 c1Var, boolean z) {
            super(1);
            this.h = c1Var;
            this.i = list;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final m0 invoke(com.amazon.aps.iva.fe0.f fVar) {
            com.amazon.aps.iva.fe0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "refiner");
            int i = f0.a;
            f0.a(this.h, fVar2, this.i);
            return null;
        }
    }

    static {
        int i = a.h;
    }

    public static final b a(c1 c1Var, com.amazon.aps.iva.fe0.f fVar, List list) {
        com.amazon.aps.iva.oc0.h k = c1Var.k();
        if (k != null) {
            fVar.u(k);
            return null;
        }
        return null;
    }

    public static final m0 b(com.amazon.aps.iva.oc0.x0 x0Var, List<? extends j1> list) {
        com.amazon.aps.iva.yb0.j.f(x0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(list, "arguments");
        v0 v0Var = new v0();
        w0 a2 = w0.a.a(null, x0Var, list);
        a1.c.getClass();
        a1 a1Var = a1.d;
        com.amazon.aps.iva.yb0.j.f(a1Var, "attributes");
        return v0Var.c(a2, a1Var, false, 0, true);
    }

    public static final u1 c(m0 m0Var, m0 m0Var2) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "lowerBound");
        com.amazon.aps.iva.yb0.j.f(m0Var2, "upperBound");
        if (com.amazon.aps.iva.yb0.j.a(m0Var, m0Var2)) {
            return m0Var;
        }
        return new z(m0Var, m0Var2);
    }

    public static final m0 d(a1 a1Var, com.amazon.aps.iva.sd0.p pVar) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "attributes");
        com.amazon.aps.iva.yb0.j.f(pVar, "constructor");
        return h(com.amazon.aps.iva.lb0.z.b, com.amazon.aps.iva.ge0.k.a(com.amazon.aps.iva.ge0.g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), a1Var, pVar, false);
    }

    public static final m0 e(a1 a1Var, com.amazon.aps.iva.oc0.e eVar, List<? extends j1> list) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "attributes");
        com.amazon.aps.iva.yb0.j.f(eVar, "descriptor");
        com.amazon.aps.iva.yb0.j.f(list, "arguments");
        c1 h = eVar.h();
        com.amazon.aps.iva.yb0.j.e(h, "descriptor.typeConstructor");
        return f(a1Var, h, list, false, null);
    }

    public static final m0 f(a1 a1Var, c1 c1Var, List<? extends j1> list, boolean z, com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.xd0.i a2;
        com.amazon.aps.iva.yb0.j.f(a1Var, "attributes");
        com.amazon.aps.iva.yb0.j.f(c1Var, "constructor");
        com.amazon.aps.iva.yb0.j.f(list, "arguments");
        if (a1Var.isEmpty() && list.isEmpty() && !z && c1Var.k() != null) {
            com.amazon.aps.iva.oc0.h k = c1Var.k();
            com.amazon.aps.iva.yb0.j.c(k);
            m0 m = k.m();
            com.amazon.aps.iva.yb0.j.e(m, "constructor.declarationDescriptor!!.defaultType");
            return m;
        }
        com.amazon.aps.iva.oc0.h k2 = c1Var.k();
        if (k2 instanceof com.amazon.aps.iva.oc0.y0) {
            a2 = ((com.amazon.aps.iva.oc0.y0) k2).m().l();
        } else if (k2 instanceof com.amazon.aps.iva.oc0.e) {
            if (fVar == null) {
                fVar = com.amazon.aps.iva.ud0.b.i(com.amazon.aps.iva.ud0.b.j(k2));
            }
            com.amazon.aps.iva.rc0.b0 b0Var = null;
            if (list.isEmpty()) {
                com.amazon.aps.iva.oc0.e eVar = (com.amazon.aps.iva.oc0.e) k2;
                com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
                com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
                if (eVar instanceof com.amazon.aps.iva.rc0.b0) {
                    b0Var = (com.amazon.aps.iva.rc0.b0) eVar;
                }
                if (b0Var == null || (a2 = b0Var.s0(fVar)) == null) {
                    a2 = eVar.T();
                    com.amazon.aps.iva.yb0.j.e(a2, "this.unsubstitutedMemberScope");
                }
            } else {
                com.amazon.aps.iva.oc0.e eVar2 = (com.amazon.aps.iva.oc0.e) k2;
                m1 b2 = e1.b.b(c1Var, list);
                com.amazon.aps.iva.yb0.j.f(eVar2, "<this>");
                com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
                if (eVar2 instanceof com.amazon.aps.iva.rc0.b0) {
                    b0Var = (com.amazon.aps.iva.rc0.b0) eVar2;
                }
                if (b0Var == null || (a2 = b0Var.d0(b2, fVar)) == null) {
                    a2 = eVar2.u(b2);
                    com.amazon.aps.iva.yb0.j.e(a2, "this.getMemberScope(\n   …ubstitution\n            )");
                }
            }
        } else if (k2 instanceof com.amazon.aps.iva.oc0.x0) {
            com.amazon.aps.iva.ge0.g gVar = com.amazon.aps.iva.ge0.g.SCOPE_FOR_ABBREVIATION_TYPE;
            String str = ((com.amazon.aps.iva.oc0.x0) k2).getName().b;
            com.amazon.aps.iva.yb0.j.e(str, "descriptor.name.toString()");
            a2 = com.amazon.aps.iva.ge0.k.a(gVar, true, str);
        } else if (c1Var instanceof c0) {
            a2 = o.a.a("member scope for intersection type", ((c0) c1Var).b);
        } else {
            throw new IllegalStateException("Unsupported classifier: " + k2 + " for constructor: " + c1Var);
        }
        return g(a1Var, c1Var, list, z, a2, new c(list, a1Var, c1Var, z));
    }

    public static final m0 g(a1 a1Var, c1 c1Var, List<? extends j1> list, boolean z, com.amazon.aps.iva.xd0.i iVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fe0.f, ? extends m0> lVar) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "attributes");
        com.amazon.aps.iva.yb0.j.f(c1Var, "constructor");
        com.amazon.aps.iva.yb0.j.f(list, "arguments");
        com.amazon.aps.iva.yb0.j.f(iVar, "memberScope");
        com.amazon.aps.iva.yb0.j.f(lVar, "refinedTypeFactory");
        n0 n0Var = new n0(c1Var, list, z, iVar, lVar);
        if (!a1Var.isEmpty()) {
            return new o0(n0Var, a1Var);
        }
        return n0Var;
    }

    public static final m0 h(List list, com.amazon.aps.iva.xd0.i iVar, a1 a1Var, c1 c1Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "attributes");
        com.amazon.aps.iva.yb0.j.f(c1Var, "constructor");
        com.amazon.aps.iva.yb0.j.f(list, "arguments");
        com.amazon.aps.iva.yb0.j.f(iVar, "memberScope");
        n0 n0Var = new n0(c1Var, list, z, iVar, new g0(list, iVar, a1Var, c1Var, z));
        if (!a1Var.isEmpty()) {
            return new o0(n0Var, a1Var);
        }
        return n0Var;
    }
}
