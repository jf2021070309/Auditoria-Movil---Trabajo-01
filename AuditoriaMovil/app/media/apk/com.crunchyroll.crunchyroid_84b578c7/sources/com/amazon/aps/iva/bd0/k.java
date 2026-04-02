package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.bd0.o;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.r1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.o0;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.qd0.n;
import com.amazon.aps.iva.rc0.m0;
import com.amazon.aps.iva.rc0.v0;
import com.amazon.aps.iva.xc0.c0;
import com.amazon.aps.iva.xc0.d0;
import com.amazon.aps.iva.xc0.i0;
import com.amazon.aps.iva.xc0.j0;
import com.amazon.aps.iva.xc0.k0;
import com.amazon.aps.iva.xc0.q;
import com.amazon.aps.iva.xc0.u;
import com.amazon.aps.iva.xd0.i;
import com.amazon.aps.iva.yc0.h;
import com.amazon.aps.iva.yc0.k;
import com.amazon.aps.iva.zc0.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes4.dex */
public final class k extends o {
    public final com.amazon.aps.iva.oc0.e n;
    public final com.amazon.aps.iva.ed0.g o;
    public final boolean p;
    public final com.amazon.aps.iva.de0.i<List<com.amazon.aps.iva.oc0.d>> q;
    public final com.amazon.aps.iva.de0.i<Set<com.amazon.aps.iva.nd0.f>> r;
    public final com.amazon.aps.iva.de0.i<Set<com.amazon.aps.iva.nd0.f>> s;
    public final com.amazon.aps.iva.de0.i<Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.ed0.n>> t;
    public final com.amazon.aps.iva.de0.h<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.e> u;

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.oc0.d>> {
        public final /* synthetic */ k h;
        public final /* synthetic */ com.amazon.aps.iva.la0.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.la0.c cVar, k kVar) {
            super(0);
            this.h = kVar;
            this.i = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1, types: [com.amazon.aps.iva.zc0.b, com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.rc0.l] */
        /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.oc0.d> invoke() {
            boolean z;
            com.amazon.aps.iva.la0.c cVar;
            com.amazon.aps.iva.oc0.e eVar;
            k kVar;
            com.amazon.aps.iva.la0.c cVar2;
            com.amazon.aps.iva.la0.c cVar3;
            Collection collection;
            com.amazon.aps.iva.fd0.t tVar;
            com.amazon.aps.iva.fd0.t tVar2;
            com.amazon.aps.iva.la0.c cVar4;
            String str;
            String str2;
            ?? emptyList;
            int i;
            com.amazon.aps.iva.la0.c cVar5;
            com.amazon.aps.iva.kb0.j jVar;
            Object obj;
            boolean z2;
            e0 e0Var;
            k kVar2 = this.h;
            Collection<com.amazon.aps.iva.ed0.k> e = kVar2.o.e();
            ArrayList arrayList = new ArrayList(e.size());
            Iterator<com.amazon.aps.iva.ed0.k> it = e.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                z = false;
                cVar = kVar2.b;
                eVar = kVar2.n;
                if (!hasNext) {
                    break;
                }
                com.amazon.aps.iva.ed0.k next = it.next();
                com.amazon.aps.iva.ad0.e E = l1.E(cVar, next);
                Object obj2 = cVar.a;
                com.amazon.aps.iva.zc0.b T0 = com.amazon.aps.iva.zc0.b.T0(eVar, E, false, ((com.amazon.aps.iva.ad0.c) obj2).j.a(next));
                com.amazon.aps.iva.la0.c cVar6 = new com.amazon.aps.iva.la0.c((com.amazon.aps.iva.ad0.c) obj2, new com.amazon.aps.iva.ad0.g(cVar, T0, next, eVar.n().size()), (com.amazon.aps.iva.kb0.e) cVar.c);
                o.b u = o.u(cVar6, T0, next.f());
                List<y0> n = eVar.n();
                com.amazon.aps.iva.yb0.j.e(n, "classDescriptor.declaredTypeParameters");
                List<y0> list = n;
                ArrayList<com.amazon.aps.iva.ed0.x> typeParameters = next.getTypeParameters();
                ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(typeParameters));
                for (com.amazon.aps.iva.ed0.x xVar : typeParameters) {
                    y0 a = ((com.amazon.aps.iva.ad0.j) cVar6.b).a(xVar);
                    com.amazon.aps.iva.yb0.j.c(a);
                    arrayList2.add(a);
                }
                T0.S0(u.a, k0.a(next.getVisibility()), com.amazon.aps.iva.lb0.x.L0(arrayList2, list));
                T0.M0(false);
                T0.N0(u.b);
                T0.O0(eVar.m());
                ((h.a) ((com.amazon.aps.iva.ad0.c) cVar6.a).g).getClass();
                arrayList.add(T0);
            }
            com.amazon.aps.iva.ed0.g gVar = kVar2.o;
            boolean p = gVar.p();
            h.a.C0609a c0609a = h.a.a;
            com.amazon.aps.iva.la0.c cVar7 = this.i;
            if (p) {
                com.amazon.aps.iva.zc0.b T02 = com.amazon.aps.iva.zc0.b.T0(eVar, c0609a, true, ((com.amazon.aps.iva.ad0.c) cVar.a).j.a(gVar));
                ArrayList l = gVar.l();
                ArrayList arrayList3 = new ArrayList(l.size());
                com.amazon.aps.iva.cd0.a w = com.amazon.aps.iva.a60.b.w(r1.COMMON, false, false, null, 6);
                Iterator it2 = l.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    int i3 = i2 + 1;
                    com.amazon.aps.iva.ed0.v vVar = (com.amazon.aps.iva.ed0.v) it2.next();
                    e0 d = ((com.amazon.aps.iva.cd0.d) cVar.e).d(vVar.getType(), w);
                    boolean a2 = vVar.a();
                    Iterator it3 = it2;
                    Object obj3 = cVar.a;
                    if (a2) {
                        e0Var = ((com.amazon.aps.iva.ad0.c) obj3).o.j().g(d);
                    } else {
                        e0Var = null;
                    }
                    k kVar3 = kVar2;
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(new v0(T02, null, i2, c0609a, vVar.getName(), d, false, false, false, e0Var, ((com.amazon.aps.iva.ad0.c) obj3).j.a(vVar)));
                    cVar7 = cVar7;
                    arrayList3 = arrayList4;
                    i2 = i3;
                    it2 = it3;
                    w = w;
                    kVar2 = kVar3;
                    z = false;
                }
                kVar = kVar2;
                cVar2 = cVar7;
                ArrayList arrayList5 = arrayList3;
                T02.N0(z);
                com.amazon.aps.iva.oc0.r visibility = eVar.getVisibility();
                com.amazon.aps.iva.yb0.j.e(visibility, "classDescriptor.visibility");
                if (com.amazon.aps.iva.yb0.j.a(visibility, com.amazon.aps.iva.xc0.t.b)) {
                    visibility = com.amazon.aps.iva.xc0.t.c;
                    com.amazon.aps.iva.yb0.j.e(visibility, "PROTECTED_AND_PACKAGE");
                }
                T02.R0(arrayList5, visibility);
                T02.M0(false);
                T02.O0(eVar.m());
                String a3 = com.amazon.aps.iva.gd0.x.a(T02, 2);
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.gd0.x.a((com.amazon.aps.iva.oc0.d) it4.next(), 2), a3)) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (z2) {
                    arrayList.add(T02);
                    ((h.a) ((com.amazon.aps.iva.ad0.c) cVar2.a).g).getClass();
                }
            } else {
                kVar = kVar2;
                cVar2 = cVar7;
            }
            ((com.amazon.aps.iva.ad0.c) cVar2.a).x.f(cVar2, eVar, arrayList);
            com.amazon.aps.iva.fd0.t tVar3 = ((com.amazon.aps.iva.ad0.c) cVar2.a).r;
            if (arrayList.isEmpty()) {
                boolean n2 = gVar.n();
                if (!gVar.J()) {
                    gVar.r();
                }
                if (!n2) {
                    tVar2 = tVar3;
                    cVar4 = cVar2;
                    obj = null;
                } else {
                    ?? T03 = com.amazon.aps.iva.zc0.b.T0(eVar, c0609a, true, ((com.amazon.aps.iva.ad0.c) cVar.a).j.a(gVar));
                    if (n2) {
                        Collection<com.amazon.aps.iva.ed0.q> A = gVar.A();
                        emptyList = new ArrayList(A.size());
                        com.amazon.aps.iva.cd0.a w2 = com.amazon.aps.iva.a60.b.w(r1.COMMON, true, false, null, 6);
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj4 : A) {
                            if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.ed0.q) obj4).getName(), d0.b)) {
                                arrayList6.add(obj4);
                            } else {
                                arrayList7.add(obj4);
                            }
                        }
                        arrayList6.size();
                        com.amazon.aps.iva.ed0.q qVar = (com.amazon.aps.iva.ed0.q) com.amazon.aps.iva.lb0.x.v0(arrayList6);
                        Object obj5 = cVar.e;
                        if (qVar != null) {
                            com.amazon.aps.iva.uc0.e0 C = qVar.C();
                            if (C instanceof com.amazon.aps.iva.ed0.f) {
                                com.amazon.aps.iva.cd0.d dVar = (com.amazon.aps.iva.cd0.d) obj5;
                                com.amazon.aps.iva.ed0.f fVar = (com.amazon.aps.iva.ed0.f) C;
                                cVar5 = cVar2;
                                jVar = new com.amazon.aps.iva.kb0.j(dVar.c(fVar, w2, true), dVar.d(fVar.z(), w2));
                            } else {
                                cVar5 = cVar2;
                                jVar = new com.amazon.aps.iva.kb0.j(((com.amazon.aps.iva.cd0.d) obj5).d(C, w2), null);
                            }
                            cVar4 = cVar5;
                            str = "classDescriptor.visibility";
                            tVar2 = tVar3;
                            str2 = "PROTECTED_AND_PACKAGE";
                            kVar.x(emptyList, T03, 0, qVar, (e0) jVar.b, (e0) jVar.c);
                        } else {
                            tVar2 = tVar3;
                            cVar4 = cVar2;
                            str = "classDescriptor.visibility";
                            str2 = "PROTECTED_AND_PACKAGE";
                        }
                        if (qVar != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        Iterator it5 = arrayList7.iterator();
                        int i4 = 0;
                        while (it5.hasNext()) {
                            com.amazon.aps.iva.ed0.q qVar2 = (com.amazon.aps.iva.ed0.q) it5.next();
                            kVar.x(emptyList, T03, i4 + i, qVar2, ((com.amazon.aps.iva.cd0.d) obj5).d(qVar2.C(), w2), null);
                            i4++;
                        }
                    } else {
                        tVar2 = tVar3;
                        cVar4 = cVar2;
                        str = "classDescriptor.visibility";
                        str2 = "PROTECTED_AND_PACKAGE";
                        emptyList = Collections.emptyList();
                    }
                    T03.N0(false);
                    com.amazon.aps.iva.oc0.r visibility2 = eVar.getVisibility();
                    com.amazon.aps.iva.yb0.j.e(visibility2, str);
                    if (com.amazon.aps.iva.yb0.j.a(visibility2, com.amazon.aps.iva.xc0.t.b)) {
                        visibility2 = com.amazon.aps.iva.xc0.t.c;
                        com.amazon.aps.iva.yb0.j.e(visibility2, str2);
                    }
                    T03.R0(emptyList, visibility2);
                    T03.M0(true);
                    T03.O0(eVar.m());
                    ((h.a) ((com.amazon.aps.iva.ad0.c) cVar.a).g).getClass();
                    obj = T03;
                }
                tVar = tVar2;
                cVar3 = cVar4;
                collection = f1.L(obj);
            } else {
                cVar3 = cVar2;
                tVar = tVar3;
                collection = arrayList;
            }
            return com.amazon.aps.iva.lb0.x.X0(tVar.c(cVar3, collection));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.ed0.n>> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.ed0.n> invoke() {
            ArrayList arrayList = new ArrayList();
            for (Object obj : k.this.o.getFields()) {
                if (((com.amazon.aps.iva.ed0.n) obj).I()) {
                    arrayList.add(obj);
                }
            }
            int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(arrayList));
            if (w < 16) {
                w = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(w);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(((com.amazon.aps.iva.ed0.n) next).getName(), next);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
        public final /* synthetic */ com.amazon.aps.iva.la0.c h;
        public final /* synthetic */ k i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.la0.c cVar, k kVar) {
            super(0);
            this.h = cVar;
            this.i = kVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
            com.amazon.aps.iva.la0.c cVar = this.h;
            return com.amazon.aps.iva.lb0.x.c1(((com.amazon.aps.iva.ad0.c) cVar.a).x.d(cVar, this.i.n));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Collection<? extends s0>> {
        public final /* synthetic */ s0 h;
        public final /* synthetic */ k i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s0 s0Var, k kVar) {
            super(1);
            this.h = s0Var;
            this.i = kVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Collection<? extends s0> invoke(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.nd0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "accessorName");
            s0 s0Var = this.h;
            if (com.amazon.aps.iva.yb0.j.a(s0Var.getName(), fVar2)) {
                return f1.J(s0Var);
            }
            k kVar = this.i;
            return com.amazon.aps.iva.lb0.x.L0(k.w(kVar, fVar2), k.v(kVar, fVar2));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
            return com.amazon.aps.iva.lb0.x.c1(k.this.o.y());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.e> {
        public final /* synthetic */ k h;
        public final /* synthetic */ com.amazon.aps.iva.la0.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.la0.c cVar, k kVar) {
            super(1);
            this.h = kVar;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.oc0.e invoke(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.nd0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, AppMeasurementSdk.ConditionalUserProperty.NAME);
            k kVar = this.h;
            boolean contains = kVar.r.invoke().contains(fVar2);
            com.amazon.aps.iva.oc0.e eVar = kVar.n;
            com.amazon.aps.iva.la0.c cVar = this.i;
            if (contains) {
                com.amazon.aps.iva.xc0.q qVar = ((com.amazon.aps.iva.ad0.c) cVar.a).b;
                com.amazon.aps.iva.nd0.b f = com.amazon.aps.iva.ud0.b.f(eVar);
                com.amazon.aps.iva.yb0.j.c(f);
                com.amazon.aps.iva.uc0.r c = qVar.c(new q.a(f.d(fVar2), kVar.o, 2));
                if (c == null) {
                    return null;
                }
                com.amazon.aps.iva.bd0.e eVar2 = new com.amazon.aps.iva.bd0.e(cVar, eVar, c, null);
                ((com.amazon.aps.iva.ad0.c) cVar.a).s.a(eVar2);
                return eVar2;
            } else if (kVar.s.invoke().contains(fVar2)) {
                com.amazon.aps.iva.mb0.a aVar = new com.amazon.aps.iva.mb0.a();
                ((com.amazon.aps.iva.ad0.c) cVar.a).x.b(cVar, eVar, fVar2, aVar);
                com.amazon.aps.iva.mb0.a l = f1.l(aVar);
                int b = l.b();
                if (b == 0) {
                    return null;
                }
                if (b == 1) {
                    return (com.amazon.aps.iva.oc0.e) com.amazon.aps.iva.lb0.x.P0(l);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + l).toString());
            } else {
                com.amazon.aps.iva.ed0.n nVar = kVar.t.invoke().get(fVar2);
                if (nVar == null) {
                    return null;
                }
                return com.amazon.aps.iva.rc0.s.G0(cVar.b(), kVar.n, fVar2, cVar.b().g(new l(kVar)), l1.E(cVar, nVar), ((com.amazon.aps.iva.ad0.c) cVar.a).j.a(nVar));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.ed0.g gVar, boolean z, k kVar) {
        super(cVar, kVar);
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        com.amazon.aps.iva.yb0.j.f(eVar, "ownerDescriptor");
        com.amazon.aps.iva.yb0.j.f(gVar, "jClass");
        this.n = eVar;
        this.o = gVar;
        this.p = z;
        this.q = cVar.b().g(new a(cVar, this));
        this.r = cVar.b().g(new e());
        this.s = cVar.b().g(new c(cVar, this));
        this.t = cVar.b().g(new b());
        this.u = cVar.b().h(new f(cVar, this));
    }

    public static s0 C(s0 s0Var, com.amazon.aps.iva.oc0.v vVar, AbstractCollection abstractCollection) {
        boolean z;
        boolean z2 = true;
        if (!abstractCollection.isEmpty()) {
            Iterator it = abstractCollection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s0 s0Var2 = (s0) it.next();
                if (!com.amazon.aps.iva.yb0.j.a(s0Var, s0Var2) && s0Var2.m0() == null && F(s0Var2, vVar)) {
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
        if (!z2) {
            com.amazon.aps.iva.oc0.v build = s0Var.C0().l().build();
            com.amazon.aps.iva.yb0.j.c(build);
            return (s0) build;
        }
        return s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.oc0.s0 D(com.amazon.aps.iva.oc0.s0 r5) {
        /*
            java.util.List r0 = r5.f()
            java.lang.String r1 = "valueParameters"
            com.amazon.aps.iva.yb0.j.e(r0, r1)
            java.lang.Object r0 = com.amazon.aps.iva.lb0.x.E0(r0)
            com.amazon.aps.iva.oc0.c1 r0 = (com.amazon.aps.iva.oc0.c1) r0
            r2 = 0
            if (r0 == 0) goto L7b
            com.amazon.aps.iva.ee0.e0 r3 = r0.getType()
            com.amazon.aps.iva.ee0.c1 r3 = r3.I0()
            com.amazon.aps.iva.oc0.h r3 = r3.k()
            if (r3 == 0) goto L33
            com.amazon.aps.iva.nd0.d r3 = com.amazon.aps.iva.ud0.b.h(r3)
            boolean r4 = r3.e()
            if (r4 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r2
        L2c:
            if (r3 == 0) goto L33
            com.amazon.aps.iva.nd0.c r3 = r3.h()
            goto L34
        L33:
            r3 = r2
        L34:
            com.amazon.aps.iva.nd0.c r4 = com.amazon.aps.iva.lc0.o.f
            boolean r3 = com.amazon.aps.iva.yb0.j.a(r3, r4)
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 != 0) goto L41
            goto L7b
        L41:
            com.amazon.aps.iva.oc0.v$a r2 = r5.C0()
            java.util.List r5 = r5.f()
            com.amazon.aps.iva.yb0.j.e(r5, r1)
            java.util.List r5 = com.amazon.aps.iva.lb0.x.p0(r5)
            com.amazon.aps.iva.oc0.v$a r5 = r2.b(r5)
            com.amazon.aps.iva.ee0.e0 r0 = r0.getType()
            java.util.List r0 = r0.G0()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.amazon.aps.iva.ee0.j1 r0 = (com.amazon.aps.iva.ee0.j1) r0
            com.amazon.aps.iva.ee0.e0 r0 = r0.getType()
            com.amazon.aps.iva.oc0.v$a r5 = r5.j(r0)
            com.amazon.aps.iva.oc0.v r5 = r5.build()
            com.amazon.aps.iva.oc0.s0 r5 = (com.amazon.aps.iva.oc0.s0) r5
            r0 = r5
            com.amazon.aps.iva.rc0.p0 r0 = (com.amazon.aps.iva.rc0.p0) r0
            if (r0 != 0) goto L77
            goto L7a
        L77:
            r1 = 1
            r0.w = r1
        L7a:
            return r5
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bd0.k.D(com.amazon.aps.iva.oc0.s0):com.amazon.aps.iva.oc0.s0");
    }

    public static boolean F(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2) {
        n.c.a c2 = com.amazon.aps.iva.qd0.n.f.n(aVar2, aVar, true).c();
        com.amazon.aps.iva.yb0.j.e(c2, "DEFAULT.isOverridableByW…iptor, this, true).result");
        if (c2 == n.c.a.OVERRIDABLE && !u.a.a(aVar2, aVar)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.amazon.aps.iva.oc0.s0, com.amazon.aps.iva.oc0.v] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.oc0.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.amazon.aps.iva.oc0.v] */
    public static boolean G(s0 s0Var, s0 s0Var2) {
        boolean z;
        int i = com.amazon.aps.iva.xc0.g.m;
        com.amazon.aps.iva.yb0.j.f(s0Var, "<this>");
        if (com.amazon.aps.iva.yb0.j.a(s0Var.getName().b(), "removeAt") && com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.gd0.x.b(s0Var), j0.h.b)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            s0Var2 = s0Var2.a();
        }
        com.amazon.aps.iva.yb0.j.e(s0Var2, "if (superDescriptor.isRe…iginal else subDescriptor");
        return F(s0Var2, s0Var);
    }

    public static s0 H(n0 n0Var, String str, com.amazon.aps.iva.xb0.l lVar) {
        s0 s0Var;
        boolean d2;
        Iterator it = ((Iterable) lVar.invoke(com.amazon.aps.iva.nd0.f.h(str))).iterator();
        do {
            s0Var = null;
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var2 = (s0) it.next();
            if (s0Var2.f().size() == 0) {
                com.amazon.aps.iva.fe0.m mVar = com.amazon.aps.iva.fe0.d.a;
                e0 returnType = s0Var2.getReturnType();
                if (returnType == null) {
                    d2 = false;
                } else {
                    d2 = mVar.d(returnType, n0Var.getType());
                }
                if (d2) {
                    s0Var = s0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (s0Var == null);
        return s0Var;
    }

    public static s0 J(n0 n0Var, com.amazon.aps.iva.xb0.l lVar) {
        s0 s0Var;
        e0 returnType;
        String b2 = n0Var.getName().b();
        com.amazon.aps.iva.yb0.j.e(b2, "name.asString()");
        Iterator it = ((Iterable) lVar.invoke(com.amazon.aps.iva.nd0.f.h(c0.b(b2)))).iterator();
        do {
            s0Var = null;
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var2 = (s0) it.next();
            if (s0Var2.f().size() == 1 && (returnType = s0Var2.getReturnType()) != null) {
                com.amazon.aps.iva.nd0.f fVar = com.amazon.aps.iva.lc0.k.e;
                if (com.amazon.aps.iva.lc0.k.E(returnType, o.a.d)) {
                    com.amazon.aps.iva.fe0.m mVar = com.amazon.aps.iva.fe0.d.a;
                    List<c1> f2 = s0Var2.f();
                    com.amazon.aps.iva.yb0.j.e(f2, "descriptor.valueParameters");
                    if (mVar.b(((c1) com.amazon.aps.iva.lb0.x.P0(f2)).getType(), n0Var.getType())) {
                        s0Var = s0Var2;
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        } while (s0Var == null);
        return s0Var;
    }

    public static boolean M(s0 s0Var, com.amazon.aps.iva.oc0.v vVar) {
        String a2 = com.amazon.aps.iva.gd0.x.a(s0Var, 2);
        com.amazon.aps.iva.oc0.v a3 = vVar.a();
        com.amazon.aps.iva.yb0.j.e(a3, "builtinWithErasedParameters.original");
        if (com.amazon.aps.iva.yb0.j.a(a2, com.amazon.aps.iva.gd0.x.a(a3, 2)) && !F(s0Var, vVar)) {
            return true;
        }
        return false;
    }

    public static final ArrayList v(k kVar, com.amazon.aps.iva.nd0.f fVar) {
        Collection<com.amazon.aps.iva.ed0.q> e2 = kVar.e.invoke().e(fVar);
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(e2));
        for (com.amazon.aps.iva.ed0.q qVar : e2) {
            arrayList.add(kVar.t(qVar));
        }
        return arrayList;
    }

    public static final ArrayList w(k kVar, com.amazon.aps.iva.nd0.f fVar) {
        boolean z;
        LinkedHashSet K = kVar.K(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : K) {
            s0 s0Var = (s0) obj;
            com.amazon.aps.iva.yb0.j.f(s0Var, "<this>");
            boolean z2 = true;
            if (i0.b(s0Var) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && com.amazon.aps.iva.xc0.h.a(s0Var) == null) {
                z2 = false;
            }
            if (!z2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, com.amazon.aps.iva.me0.d dVar, com.amazon.aps.iva.xb0.l lVar) {
        s0 s0Var;
        com.amazon.aps.iva.rc0.n0 n0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            n0 n0Var2 = (n0) it.next();
            com.amazon.aps.iva.zc0.d dVar2 = null;
            if (E(n0Var2, lVar)) {
                s0 I = I(n0Var2, lVar);
                com.amazon.aps.iva.yb0.j.c(I);
                if (n0Var2.L()) {
                    s0Var = J(n0Var2, lVar);
                    com.amazon.aps.iva.yb0.j.c(s0Var);
                } else {
                    s0Var = null;
                }
                if (s0Var != null) {
                    s0Var.o();
                    I.o();
                }
                com.amazon.aps.iva.zc0.d dVar3 = new com.amazon.aps.iva.zc0.d(this.n, I, s0Var, n0Var2);
                e0 returnType = I.getReturnType();
                com.amazon.aps.iva.yb0.j.c(returnType);
                com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
                dVar3.M0(returnType, zVar, p(), null, zVar);
                m0 i = com.amazon.aps.iva.qd0.h.i(dVar3, I.getAnnotations(), false, I.g());
                i.m = I;
                i.I0(dVar3.getType());
                if (s0Var != null) {
                    List<c1> f2 = s0Var.f();
                    com.amazon.aps.iva.yb0.j.e(f2, "setterMethod.valueParameters");
                    c1 c1Var = (c1) com.amazon.aps.iva.lb0.x.v0(f2);
                    if (c1Var != null) {
                        n0Var = com.amazon.aps.iva.qd0.h.j(dVar3, s0Var.getAnnotations(), c1Var.getAnnotations(), false, s0Var.getVisibility(), s0Var.g());
                        n0Var.m = s0Var;
                    } else {
                        throw new AssertionError("No parameter found for " + s0Var);
                    }
                } else {
                    n0Var = null;
                }
                dVar3.K0(i, n0Var, null, null);
                dVar2 = dVar3;
            }
            if (dVar2 != null) {
                abstractCollection.add(dVar2);
                if (dVar != null) {
                    dVar.add(n0Var2);
                    return;
                }
                return;
            }
        }
    }

    public final Collection<e0> B() {
        boolean z = this.p;
        com.amazon.aps.iva.oc0.e eVar = this.n;
        if (z) {
            Collection<e0> g = eVar.h().g();
            com.amazon.aps.iva.yb0.j.e(g, "ownerDescriptor.typeConstructor.supertypes");
            return g;
        }
        return ((com.amazon.aps.iva.ad0.c) this.b.a).u.c().v(eVar);
    }

    public final boolean E(n0 n0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, ? extends Collection<? extends s0>> lVar) {
        if (com.amazon.aps.iva.ab.x.W(n0Var)) {
            return false;
        }
        s0 I = I(n0Var, lVar);
        s0 J = J(n0Var, lVar);
        if (I == null) {
            return false;
        }
        if (!n0Var.L()) {
            return true;
        }
        if (J == null || J.o() != I.o()) {
            return false;
        }
        return true;
    }

    public final s0 I(n0 n0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, ? extends Collection<? extends s0>> lVar) {
        o0 o0Var;
        com.amazon.aps.iva.nd0.f fVar;
        m0 getter = n0Var.getGetter();
        String str = null;
        if (getter != null) {
            o0Var = (o0) i0.b(getter);
        } else {
            o0Var = null;
        }
        if (o0Var != null) {
            com.amazon.aps.iva.lc0.k.A(o0Var);
            com.amazon.aps.iva.oc0.b b2 = com.amazon.aps.iva.ud0.b.b(com.amazon.aps.iva.ud0.b.k(o0Var), com.amazon.aps.iva.xc0.k.h);
            if (b2 != null && (fVar = com.amazon.aps.iva.xc0.j.a.get(com.amazon.aps.iva.ud0.b.g(b2))) != null) {
                str = fVar.b();
            }
        }
        if (str != null && !i0.d(this.n, o0Var)) {
            return H(n0Var, str, lVar);
        }
        String b3 = n0Var.getName().b();
        com.amazon.aps.iva.yb0.j.e(b3, "name.asString()");
        return H(n0Var, c0.a(b3), lVar);
    }

    public final LinkedHashSet K(com.amazon.aps.iva.nd0.f fVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (e0 e0Var : B()) {
            com.amazon.aps.iva.lb0.t.d0(linkedHashSet, e0Var.l().b(fVar, com.amazon.aps.iva.wc0.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    public final Set<n0> L(com.amazon.aps.iva.nd0.f fVar) {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : B()) {
            Collection<n0> c2 = e0Var.l().c(fVar, com.amazon.aps.iva.wc0.d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(c2));
            for (n0 n0Var : c2) {
                arrayList2.add(n0Var);
            }
            com.amazon.aps.iva.lb0.t.d0(arrayList, arrayList2);
        }
        return com.amazon.aps.iva.lb0.x.c1(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
        if (com.amazon.aps.iva.oe0.m.h0(r2, "set", false) == false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(com.amazon.aps.iva.oc0.s0 r10) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bd0.k.N(com.amazon.aps.iva.oc0.s0):boolean");
    }

    public final void O(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(bVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.vc0.a.a(((com.amazon.aps.iva.ad0.c) this.b.a).n, (com.amazon.aps.iva.wc0.d) bVar, this.n, fVar);
    }

    @Override // com.amazon.aps.iva.bd0.o, com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        O(fVar, dVar);
        return super.b(fVar, dVar);
    }

    @Override // com.amazon.aps.iva.bd0.o, com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        O(fVar, dVar);
        return super.c(fVar, dVar);
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.de0.h<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.e> hVar;
        com.amazon.aps.iva.oc0.e invoke;
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        O(fVar, dVar);
        k kVar = (k) this.c;
        if (kVar == null || (hVar = kVar.u) == null || (invoke = hVar.invoke(fVar)) == null) {
            return this.u.invoke(fVar);
        }
        return invoke;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final Set h(com.amazon.aps.iva.xd0.d dVar, i.a.C0852a c0852a) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        return com.amazon.aps.iva.lb0.m0.Q(this.r.invoke(), this.t.invoke().keySet());
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final Set i(com.amazon.aps.iva.xd0.d dVar, i.a.C0852a c0852a) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.oc0.e eVar = this.n;
        Collection<e0> g = eVar.h().g();
        com.amazon.aps.iva.yb0.j.e(g, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (e0 e0Var : g) {
            com.amazon.aps.iva.lb0.t.d0(linkedHashSet, e0Var.l().a());
        }
        com.amazon.aps.iva.de0.i<com.amazon.aps.iva.bd0.b> iVar = this.e;
        linkedHashSet.addAll(iVar.invoke().a());
        linkedHashSet.addAll(iVar.invoke().b());
        linkedHashSet.addAll(h(dVar, c0852a));
        com.amazon.aps.iva.la0.c cVar = this.b;
        linkedHashSet.addAll(((com.amazon.aps.iva.ad0.c) cVar.a).x.e(cVar, eVar));
        return linkedHashSet;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final void j(ArrayList arrayList, com.amazon.aps.iva.nd0.f fVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        boolean p = this.o.p();
        com.amazon.aps.iva.oc0.e eVar = this.n;
        com.amazon.aps.iva.la0.c cVar = this.b;
        if (p) {
            com.amazon.aps.iva.de0.i<com.amazon.aps.iva.bd0.b> iVar = this.e;
            if (iVar.invoke().f(fVar) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((s0) it.next()).f().isEmpty()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    com.amazon.aps.iva.ed0.v f2 = iVar.invoke().f(fVar);
                    com.amazon.aps.iva.yb0.j.c(f2);
                    com.amazon.aps.iva.ad0.e E = l1.E(cVar, f2);
                    com.amazon.aps.iva.nd0.f name = f2.getName();
                    com.amazon.aps.iva.ad0.c cVar2 = (com.amazon.aps.iva.ad0.c) cVar.a;
                    com.amazon.aps.iva.zc0.e U0 = com.amazon.aps.iva.zc0.e.U0(eVar, E, name, cVar2.j.a(f2), true);
                    e0 d2 = ((com.amazon.aps.iva.cd0.d) cVar.e).d(f2.getType(), com.amazon.aps.iva.a60.b.w(r1.COMMON, false, false, null, 6));
                    q0 p2 = p();
                    com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
                    b0.Companion.getClass();
                    U0.T0(null, p2, zVar, zVar, zVar, d2, b0.a.a(false, false, true), com.amazon.aps.iva.oc0.q.e, null);
                    U0.F = e.c.get(false, false);
                    ((h.a) cVar2.g).getClass();
                    arrayList.add(U0);
                }
            }
        }
        ((com.amazon.aps.iva.ad0.c) cVar.a).x.a(cVar, eVar, fVar, arrayList);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final com.amazon.aps.iva.bd0.b k() {
        return new com.amazon.aps.iva.bd0.a(this.o, com.amazon.aps.iva.bd0.f.h);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final void m(LinkedHashSet linkedHashSet, com.amazon.aps.iva.nd0.f fVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        LinkedHashSet<com.amazon.aps.iva.oc0.v> K = K(fVar);
        j0.a aVar = j0.a;
        if (!j0.k.contains(fVar)) {
            int i = com.amazon.aps.iva.xc0.h.m;
            if (!com.amazon.aps.iva.xc0.h.b(fVar)) {
                if (!K.isEmpty()) {
                    for (com.amazon.aps.iva.oc0.v vVar : K) {
                        if (vVar.isSuspend()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : K) {
                        if (N((s0) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    y(linkedHashSet, fVar, arrayList, false);
                    return;
                }
            }
        }
        com.amazon.aps.iva.me0.d dVar = new com.amazon.aps.iva.me0.d();
        LinkedHashSet v = com.amazon.aps.iva.hc.m.v(fVar, K, com.amazon.aps.iva.lb0.z.b, this.n, com.amazon.aps.iva.ae0.s.a, ((com.amazon.aps.iva.ad0.c) this.b.a).u.a());
        z(fVar, linkedHashSet, v, linkedHashSet, new g(this));
        z(fVar, linkedHashSet, v, dVar, new h(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : K) {
            if (N((s0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        y(linkedHashSet, fVar, com.amazon.aps.iva.lb0.x.L0(dVar, arrayList2), true);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final void n(ArrayList arrayList, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.ed0.q qVar;
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        boolean n = this.o.n();
        com.amazon.aps.iva.la0.c cVar = this.b;
        if (n && (qVar = (com.amazon.aps.iva.ed0.q) com.amazon.aps.iva.lb0.x.Q0(this.e.invoke().e(fVar))) != null) {
            com.amazon.aps.iva.zc0.f N0 = com.amazon.aps.iva.zc0.f.N0(this.n, l1.E(cVar, qVar), b0.FINAL, k0.a(qVar.getVisibility()), false, qVar.getName(), ((com.amazon.aps.iva.ad0.c) cVar.a).j.a(qVar), false);
            m0 c2 = com.amazon.aps.iva.qd0.h.c(N0, h.a.a);
            N0.K0(c2, null, null, null);
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            e0 l = o.l(qVar, new com.amazon.aps.iva.la0.c((com.amazon.aps.iva.ad0.c) cVar.a, new com.amazon.aps.iva.ad0.g(cVar, N0, qVar, 0), (com.amazon.aps.iva.kb0.e) cVar.c));
            com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
            N0.M0(l, zVar, p(), null, zVar);
            c2.I0(l);
            arrayList.add(N0);
        }
        Set<n0> L = L(fVar);
        if (L.isEmpty()) {
            return;
        }
        com.amazon.aps.iva.me0.d dVar = new com.amazon.aps.iva.me0.d();
        com.amazon.aps.iva.me0.d dVar2 = new com.amazon.aps.iva.me0.d();
        A(L, arrayList, dVar, new i(this));
        A(com.amazon.aps.iva.lb0.m0.P(L, dVar), dVar2, null, new j(this));
        LinkedHashSet Q = com.amazon.aps.iva.lb0.m0.Q(L, dVar2);
        com.amazon.aps.iva.oc0.e eVar = this.n;
        com.amazon.aps.iva.ad0.c cVar2 = (com.amazon.aps.iva.ad0.c) cVar.a;
        arrayList.addAll(com.amazon.aps.iva.hc.m.v(fVar, Q, arrayList, eVar, cVar2.f, cVar2.u.a()));
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final Set o(com.amazon.aps.iva.xd0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        if (this.o.n()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.e.invoke().c());
        Collection<e0> g = this.n.h().g();
        com.amazon.aps.iva.yb0.j.e(g, "ownerDescriptor.typeConstructor.supertypes");
        for (e0 e0Var : g) {
            com.amazon.aps.iva.lb0.t.d0(linkedHashSet, e0Var.l().d());
        }
        return linkedHashSet;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final q0 p() {
        com.amazon.aps.iva.oc0.e eVar = this.n;
        if (eVar != null) {
            int i = com.amazon.aps.iva.qd0.i.a;
            return eVar.F0();
        }
        com.amazon.aps.iva.qd0.i.a(0);
        throw null;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final com.amazon.aps.iva.oc0.k q() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final boolean r(com.amazon.aps.iva.zc0.e eVar) {
        if (this.o.n()) {
            return false;
        }
        return N(eVar);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final o.a s(com.amazon.aps.iva.ed0.q qVar, ArrayList arrayList, e0 e0Var, List list) {
        com.amazon.aps.iva.yb0.j.f(qVar, FirebaseAnalytics.Param.METHOD);
        com.amazon.aps.iva.yb0.j.f(list, "valueParameters");
        ((k.a) ((com.amazon.aps.iva.ad0.c) this.b.a).e).getClass();
        if (this.n != null) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return new o.a(list, arrayList, emptyList, e0Var);
            }
            k.b.a(3);
            throw null;
        }
        k.a.a(1);
        throw null;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public final void x(ArrayList arrayList, com.amazon.aps.iva.zc0.b bVar, int i, com.amazon.aps.iva.ed0.q qVar, e0 e0Var, e0 e0Var2) {
        u1 u1Var;
        h.a.C0609a c0609a = h.a.a;
        com.amazon.aps.iva.nd0.f name = qVar.getName();
        u1 i2 = s1.i(e0Var);
        boolean M = qVar.M();
        if (e0Var2 != null) {
            u1Var = s1.i(e0Var2);
        } else {
            u1Var = null;
        }
        arrayList.add(new v0(bVar, null, i, c0609a, name, i2, M, false, false, u1Var, ((com.amazon.aps.iva.ad0.c) this.b.a).j.a(qVar)));
    }

    public final void y(LinkedHashSet linkedHashSet, com.amazon.aps.iva.nd0.f fVar, ArrayList arrayList, boolean z) {
        com.amazon.aps.iva.oc0.e eVar = this.n;
        com.amazon.aps.iva.ad0.c cVar = (com.amazon.aps.iva.ad0.c) this.b.a;
        LinkedHashSet<s0> v = com.amazon.aps.iva.hc.m.v(fVar, arrayList, linkedHashSet, eVar, cVar.f, cVar.u.a());
        if (!z) {
            linkedHashSet.addAll(v);
            return;
        }
        ArrayList L0 = com.amazon.aps.iva.lb0.x.L0(v, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(v));
        for (s0 s0Var : v) {
            s0 s0Var2 = (s0) i0.c(s0Var);
            if (s0Var2 != null) {
                s0Var = C(s0Var, s0Var2, L0);
            }
            arrayList2.add(s0Var);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(com.amazon.aps.iva.nd0.f r9, java.util.LinkedHashSet r10, java.util.LinkedHashSet r11, java.util.AbstractSet r12, com.amazon.aps.iva.xb0.l r13) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bd0.k.z(com.amazon.aps.iva.nd0.f, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, com.amazon.aps.iva.xb0.l):void");
    }
}
