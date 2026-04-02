package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.i0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.nc0.g;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.qd0.n;
import com.amazon.aps.iva.rc0.g0;
import com.amazon.aps.iva.xd0.i;
import com.amazon.aps.iva.yb0.e0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes4.dex */
public final class k implements com.amazon.aps.iva.qc0.a, com.amazon.aps.iva.qc0.c {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] h = {e0.c(new com.amazon.aps.iva.yb0.v(e0.a(k.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), e0.c(new com.amazon.aps.iva.yb0.v(e0.a(k.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), e0.c(new com.amazon.aps.iva.yb0.v(e0.a(k.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    public final c0 a;
    public final w b;
    public final com.amazon.aps.iva.de0.i c;
    public final m0 d;
    public final com.amazon.aps.iva.de0.i e;
    public final com.amazon.aps.iva.de0.a<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.oc0.e> f;
    public final com.amazon.aps.iva.de0.i g;

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes4.dex */
    public enum a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public k(g0 g0Var, com.amazon.aps.iva.de0.l lVar, h hVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        this.a = g0Var;
        this.b = w.e;
        this.c = lVar.g(hVar);
        com.amazon.aps.iva.rc0.n nVar = new com.amazon.aps.iva.rc0.n(new m(g0Var, new com.amazon.aps.iva.nd0.c("java.io")), com.amazon.aps.iva.nd0.f.h("Serializable"), b0.ABSTRACT, com.amazon.aps.iva.oc0.f.INTERFACE, f1.J(new i0(lVar, new n(this))), lVar);
        nVar.G0(i.b.b, com.amazon.aps.iva.lb0.b0.b, null);
        m0 m = nVar.m();
        com.amazon.aps.iva.yb0.j.e(m, "mockSerializableClass.defaultType");
        this.d = m;
        this.e = lVar.g(new l(this, lVar));
        this.f = lVar.a();
        this.g = lVar.g(new s(this));
    }

    @Override // com.amazon.aps.iva.qc0.a
    public final Collection a(com.amazon.aps.iva.ce0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "classDescriptor");
        com.amazon.aps.iva.nd0.d h2 = com.amazon.aps.iva.ud0.b.h(dVar);
        LinkedHashSet linkedHashSet = u.a;
        boolean a2 = u.a(h2);
        m0 m0Var = this.d;
        boolean z = true;
        if (a2) {
            m0 m0Var2 = (m0) x.T(this.e, h[1]);
            com.amazon.aps.iva.yb0.j.e(m0Var2, "cloneableType");
            return f1.K(m0Var2, m0Var);
        }
        if (!u.a(h2)) {
            String str = c.a;
            com.amazon.aps.iva.nd0.b g = c.g(h2);
            if (g != null) {
                try {
                    z = Serializable.class.isAssignableFrom(Class.forName(g.b().b()));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
            }
            z = false;
        }
        if (z) {
            return f1.J(m0Var);
        }
        return z.b;
    }

    @Override // com.amazon.aps.iva.qc0.c
    public final boolean b(com.amazon.aps.iva.ce0.d dVar, com.amazon.aps.iva.ce0.o oVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "classDescriptor");
        com.amazon.aps.iva.bd0.e f = f(dVar);
        if (f == null || !oVar.getAnnotations().A(com.amazon.aps.iva.qc0.d.a)) {
            return true;
        }
        if (!g().b) {
            return false;
        }
        String a2 = com.amazon.aps.iva.gd0.x.a(oVar, 3);
        com.amazon.aps.iva.bd0.k T = f.T();
        com.amazon.aps.iva.nd0.f name = oVar.getName();
        com.amazon.aps.iva.yb0.j.e(name, "functionDescriptor.name");
        Collection<s0> b2 = T.b(name, com.amazon.aps.iva.wc0.d.FROM_BUILTINS);
        if (!(b2 instanceof Collection) || !b2.isEmpty()) {
            for (s0 s0Var : b2) {
                if (com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.gd0.x.a(s0Var, 3), a2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.qc0.a
    public final Collection c(com.amazon.aps.iva.ce0.d dVar) {
        com.amazon.aps.iva.bd0.e f;
        Set<com.amazon.aps.iva.nd0.f> a2;
        com.amazon.aps.iva.yb0.j.f(dVar, "classDescriptor");
        boolean z = g().b;
        Set<com.amazon.aps.iva.nd0.f> set = com.amazon.aps.iva.lb0.b0.b;
        if (z && (f = f(dVar)) != null && (a2 = f.T().a()) != null) {
            set = a2;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e2, code lost:
        if (r4 != 3) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025e  */
    @Override // com.amazon.aps.iva.qc0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection d(com.amazon.aps.iva.nd0.f r17, com.amazon.aps.iva.ce0.d r18) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nc0.k.d(com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.ce0.d):java.util.Collection");
    }

    @Override // com.amazon.aps.iva.qc0.a
    public final Collection e(com.amazon.aps.iva.ce0.d dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.nd0.d dVar2;
        com.amazon.aps.iva.oc0.f fVar = com.amazon.aps.iva.oc0.f.CLASS;
        z zVar = z.b;
        if (dVar.l == fVar && g().b) {
            com.amazon.aps.iva.bd0.e f = f(dVar);
            if (f == null) {
                return zVar;
            }
            com.amazon.aps.iva.oc0.e p = w.p(this.b, com.amazon.aps.iva.ud0.b.g(f), com.amazon.aps.iva.nc0.b.f);
            if (p == null) {
                return zVar;
            }
            q1 e = q1.e(v.a(p, f));
            ArrayList arrayList = new ArrayList();
            for (Object obj : f.s.q.invoke()) {
                com.amazon.aps.iva.oc0.d dVar3 = (com.amazon.aps.iva.oc0.d) obj;
                boolean z4 = false;
                if (dVar3.getVisibility().a().b) {
                    Collection<com.amazon.aps.iva.oc0.d> e2 = p.e();
                    com.amazon.aps.iva.yb0.j.e(e2, "defaultKotlinVersion.constructors");
                    Collection<com.amazon.aps.iva.oc0.d> collection = e2;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        for (com.amazon.aps.iva.oc0.d dVar4 : collection) {
                            com.amazon.aps.iva.yb0.j.e(dVar4, "it");
                            if (com.amazon.aps.iva.qd0.n.j(dVar4, dVar3.b(e)) == n.c.a.OVERRIDABLE) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        if (dVar3.f().size() == 1) {
                            List<c1> f2 = dVar3.f();
                            com.amazon.aps.iva.yb0.j.e(f2, "valueParameters");
                            com.amazon.aps.iva.oc0.h k = ((c1) com.amazon.aps.iva.lb0.x.P0(f2)).getType().I0().k();
                            if (k != null) {
                                dVar2 = com.amazon.aps.iva.ud0.b.h(k);
                            } else {
                                dVar2 = null;
                            }
                            if (com.amazon.aps.iva.yb0.j.a(dVar2, com.amazon.aps.iva.ud0.b.h(dVar))) {
                                z3 = true;
                                if (!z3 && !com.amazon.aps.iva.lc0.k.D(dVar3) && !u.e.contains(com.amazon.aps.iva.aq.k.F(f, com.amazon.aps.iva.gd0.x.a(dVar3, 3)))) {
                                    z4 = true;
                                }
                            }
                        }
                        z3 = false;
                        if (!z3) {
                            z4 = true;
                        }
                    }
                }
                if (z4) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.oc0.d dVar5 = (com.amazon.aps.iva.oc0.d) it.next();
                v.a<? extends com.amazon.aps.iva.oc0.v> C0 = dVar5.C0();
                C0.o(dVar);
                C0.j(dVar.m());
                C0.p();
                C0.a(e.g());
                if (!u.f.contains(com.amazon.aps.iva.aq.k.F(f, com.amazon.aps.iva.gd0.x.a(dVar5, 3)))) {
                    C0.m((com.amazon.aps.iva.pc0.h) x.T(this.g, h[2]));
                }
                com.amazon.aps.iva.oc0.v build = C0.build();
                com.amazon.aps.iva.yb0.j.d(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((com.amazon.aps.iva.oc0.d) build);
            }
            return arrayList2;
        }
        return zVar;
    }

    public final com.amazon.aps.iva.bd0.e f(com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.nd0.c b2;
        if (eVar != null) {
            com.amazon.aps.iva.nd0.f fVar = com.amazon.aps.iva.lc0.k.e;
            if (com.amazon.aps.iva.lc0.k.c(eVar, o.a.a) || !com.amazon.aps.iva.lc0.k.L(eVar)) {
                return null;
            }
            com.amazon.aps.iva.nd0.d h2 = com.amazon.aps.iva.ud0.b.h(eVar);
            if (!h2.e()) {
                return null;
            }
            String str = c.a;
            com.amazon.aps.iva.nd0.b g = c.g(h2);
            if (g == null || (b2 = g.b()) == null) {
                return null;
            }
            com.amazon.aps.iva.oc0.e c0 = x.c0(g().a, b2, com.amazon.aps.iva.wc0.d.FROM_BUILTINS);
            if (!(c0 instanceof com.amazon.aps.iva.bd0.e)) {
                return null;
            }
            return (com.amazon.aps.iva.bd0.e) c0;
        }
        com.amazon.aps.iva.lc0.k.a(108);
        throw null;
    }

    public final g.b g() {
        return (g.b) x.T(this.c, h[0]);
    }
}
