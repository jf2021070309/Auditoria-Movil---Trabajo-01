package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.r1;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.c0;
import com.amazon.aps.iva.lb0.d0;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.o0;
import com.amazon.aps.iva.rc0.v0;
import com.amazon.aps.iva.tc0.i;
import com.amazon.aps.iva.xc0.k0;
import com.amazon.aps.iva.xd0.c;
import com.amazon.aps.iva.xd0.i;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yc0.h;
import com.amazon.aps.iva.yc0.k;
import com.amazon.aps.iva.zc0.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: LazyJavaScope.kt */
/* loaded from: classes4.dex */
public abstract class o extends com.amazon.aps.iva.xd0.j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] m = {e0.c(new com.amazon.aps.iva.yb0.v(e0.a(o.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), e0.c(new com.amazon.aps.iva.yb0.v(e0.a(o.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), e0.c(new com.amazon.aps.iva.yb0.v(e0.a(o.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    public final com.amazon.aps.iva.la0.c b;
    public final o c;
    public final com.amazon.aps.iva.de0.i<Collection<com.amazon.aps.iva.oc0.k>> d;
    public final com.amazon.aps.iva.de0.i<com.amazon.aps.iva.bd0.b> e;
    public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.f, Collection<s0>> f;
    public final com.amazon.aps.iva.de0.h<com.amazon.aps.iva.nd0.f, n0> g;
    public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.f, Collection<s0>> h;
    public final com.amazon.aps.iva.de0.i i;
    public final com.amazon.aps.iva.de0.i j;
    public final com.amazon.aps.iva.de0.i k;
    public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.f, List<n0>> l;

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final com.amazon.aps.iva.ee0.e0 a;
        public final com.amazon.aps.iva.ee0.e0 b;
        public final List<c1> c;
        public final List<y0> d;
        public final boolean e;
        public final List<String> f;

        public a(List list, ArrayList arrayList, List list2, com.amazon.aps.iva.ee0.e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(list, "valueParameters");
            this.a = e0Var;
            this.b = null;
            this.c = list;
            this.d = arrayList;
            this.e = false;
            this.f = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d) && this.e == aVar.e && com.amazon.aps.iva.yb0.j.a(this.f, aVar.f)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            com.amazon.aps.iva.ee0.e0 e0Var = this.b;
            if (e0Var == null) {
                hashCode = 0;
            } else {
                hashCode = e0Var.hashCode();
            }
            int a = defpackage.a.a(this.d, defpackage.a.a(this.c, (hashCode2 + hashCode) * 31, 31), 31);
            boolean z = this.e;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return this.f.hashCode() + ((a + i) * 31);
        }

        public final String toString() {
            return "MethodSignatureData(returnType=" + this.a + ", receiverType=" + this.b + ", valueParameters=" + this.c + ", typeParameters=" + this.d + ", hasStableParameterNames=" + this.e + ", errors=" + this.f + ')';
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class b {
        public final List<c1> a;
        public final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends c1> list, boolean z) {
            this.a = list;
            this.b = z;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.oc0.k>> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Collection<? extends com.amazon.aps.iva.oc0.k> invoke() {
            com.amazon.aps.iva.xd0.d dVar = com.amazon.aps.iva.xd0.d.m;
            com.amazon.aps.iva.xd0.i.a.getClass();
            i.a.C0852a c0852a = i.a.b;
            o oVar = o.this;
            oVar.getClass();
            com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
            com.amazon.aps.iva.yb0.j.f(c0852a, "nameFilter");
            com.amazon.aps.iva.wc0.d dVar2 = com.amazon.aps.iva.wc0.d.WHEN_GET_ALL_DESCRIPTORS;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (dVar.a(com.amazon.aps.iva.xd0.d.l)) {
                for (com.amazon.aps.iva.nd0.f fVar : oVar.h(dVar, c0852a)) {
                    if (((Boolean) c0852a.invoke(fVar)).booleanValue()) {
                        com.amazon.aps.iva.a60.b.i(linkedHashSet, oVar.g(fVar, dVar2));
                    }
                }
            }
            boolean a = dVar.a(com.amazon.aps.iva.xd0.d.i);
            List<com.amazon.aps.iva.xd0.c> list = dVar.a;
            if (a && !list.contains(c.a.a)) {
                for (com.amazon.aps.iva.nd0.f fVar2 : oVar.i(dVar, c0852a)) {
                    if (((Boolean) c0852a.invoke(fVar2)).booleanValue()) {
                        linkedHashSet.addAll(oVar.b(fVar2, dVar2));
                    }
                }
            }
            if (dVar.a(com.amazon.aps.iva.xd0.d.j) && !list.contains(c.a.a)) {
                for (com.amazon.aps.iva.nd0.f fVar3 : oVar.o(dVar)) {
                    if (((Boolean) c0852a.invoke(fVar3)).booleanValue()) {
                        linkedHashSet.addAll(oVar.c(fVar3, dVar2));
                    }
                }
            }
            return com.amazon.aps.iva.lb0.x.X0(linkedHashSet);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
            return o.this.h(com.amazon.aps.iva.xd0.d.o, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, n0> {
        public e() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0101, code lost:
            if (com.amazon.aps.iva.lc0.s.a(r4) == false) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.oc0.n0 invoke(com.amazon.aps.iva.nd0.f r23) {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bd0.o.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Collection<? extends s0>> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Collection<? extends s0> invoke(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.nd0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, AppMeasurementSdk.ConditionalUserProperty.NAME);
            o oVar = o.this;
            o oVar2 = oVar.c;
            if (oVar2 != null) {
                return (Collection) ((c.k) oVar2.f).invoke(fVar2);
            }
            ArrayList arrayList = new ArrayList();
            for (com.amazon.aps.iva.ed0.q qVar : oVar.e.invoke().e(fVar2)) {
                com.amazon.aps.iva.zc0.e t = oVar.t(qVar);
                if (oVar.r(t)) {
                    ((h.a) ((com.amazon.aps.iva.ad0.c) oVar.b.a).g).getClass();
                    arrayList.add(t);
                }
            }
            oVar.j(arrayList, fVar2);
            return arrayList;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.bd0.b> {
        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.bd0.b invoke() {
            return o.this.k();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
            return o.this.i(com.amazon.aps.iva.xd0.d.p, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Collection<? extends s0>> {
        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Collection<? extends s0> invoke(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.nd0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, AppMeasurementSdk.ConditionalUserProperty.NAME);
            o oVar = o.this;
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((c.k) oVar.f).invoke(fVar2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                String a = com.amazon.aps.iva.gd0.x.a((s0) obj, 2);
                Object obj2 = linkedHashMap.get(a);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(a, obj2);
                }
                ((List) obj2).add(obj);
            }
            for (List list : linkedHashMap.values()) {
                if (list.size() != 1) {
                    List list2 = list;
                    Collection a2 = com.amazon.aps.iva.qd0.u.a(list2, r.h);
                    linkedHashSet.removeAll(list2);
                    linkedHashSet.addAll(a2);
                }
            }
            oVar.m(linkedHashSet, fVar2);
            com.amazon.aps.iva.la0.c cVar = oVar.b;
            return com.amazon.aps.iva.lb0.x.X0(((com.amazon.aps.iva.ad0.c) cVar.a).r.c(cVar, linkedHashSet));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, List<? extends n0>> {
        public j() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final List<? extends n0> invoke(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.nd0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, AppMeasurementSdk.ConditionalUserProperty.NAME);
            ArrayList arrayList = new ArrayList();
            o oVar = o.this;
            com.amazon.aps.iva.a60.b.i(arrayList, oVar.g.invoke(fVar2));
            oVar.n(arrayList, fVar2);
            com.amazon.aps.iva.oc0.k q = oVar.q();
            int i = com.amazon.aps.iva.qd0.i.a;
            if (com.amazon.aps.iva.qd0.i.n(q, com.amazon.aps.iva.oc0.f.ANNOTATION_CLASS)) {
                return com.amazon.aps.iva.lb0.x.X0(arrayList);
            }
            com.amazon.aps.iva.la0.c cVar = oVar.b;
            return com.amazon.aps.iva.lb0.x.X0(((com.amazon.aps.iva.ad0.c) cVar.a).r.c(cVar, arrayList));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes4.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
            return o.this.o(com.amazon.aps.iva.xd0.d.q);
        }
    }

    public o(com.amazon.aps.iva.la0.c cVar, o oVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        this.b = cVar;
        this.c = oVar;
        this.d = cVar.b().c(new c());
        this.e = cVar.b().g(new g());
        this.f = cVar.b().f(new f());
        this.g = cVar.b().h(new e());
        this.h = cVar.b().f(new i());
        this.i = cVar.b().g(new h());
        this.j = cVar.b().g(new k());
        this.k = cVar.b().g(new d());
        this.l = cVar.b().f(new j());
    }

    public static com.amazon.aps.iva.ee0.e0 l(com.amazon.aps.iva.ed0.q qVar, com.amazon.aps.iva.la0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(qVar, FirebaseAnalytics.Param.METHOD);
        return ((com.amazon.aps.iva.cd0.d) cVar.e).d(qVar.C(), com.amazon.aps.iva.a60.b.w(r1.COMMON, qVar.m().n(), false, null, 6));
    }

    public static b u(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.rc0.x xVar, List list) {
        com.amazon.aps.iva.kb0.j jVar;
        com.amazon.aps.iva.nd0.f name;
        com.amazon.aps.iva.yb0.j.f(list, "jValueParameters");
        d0 d1 = com.amazon.aps.iva.lb0.x.d1(list);
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(d1));
        Iterator it = d1.iterator();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            com.amazon.aps.iva.lb0.e0 e0Var = (com.amazon.aps.iva.lb0.e0) it;
            if (e0Var.hasNext()) {
                c0 c0Var = (c0) e0Var.next();
                int i2 = c0Var.a;
                com.amazon.aps.iva.ed0.z zVar = (com.amazon.aps.iva.ed0.z) c0Var.b;
                com.amazon.aps.iva.ad0.e E = l1.E(cVar, zVar);
                com.amazon.aps.iva.ed0.f fVar = null;
                com.amazon.aps.iva.cd0.a w = com.amazon.aps.iva.a60.b.w(r1.COMMON, z, z, null, 7);
                boolean a2 = zVar.a();
                Object obj = cVar.e;
                if (a2) {
                    com.amazon.aps.iva.ed0.w type = zVar.getType();
                    if (type instanceof com.amazon.aps.iva.ed0.f) {
                        fVar = (com.amazon.aps.iva.ed0.f) type;
                    }
                    if (fVar != null) {
                        u1 c2 = ((com.amazon.aps.iva.cd0.d) obj).c(fVar, w, true);
                        jVar = new com.amazon.aps.iva.kb0.j(c2, cVar.a().j().g(c2));
                    } else {
                        throw new AssertionError("Vararg parameter should be an array: " + zVar);
                    }
                } else {
                    jVar = new com.amazon.aps.iva.kb0.j(((com.amazon.aps.iva.cd0.d) obj).d(zVar.getType(), w), null);
                }
                com.amazon.aps.iva.ee0.e0 e0Var2 = (com.amazon.aps.iva.ee0.e0) jVar.b;
                com.amazon.aps.iva.ee0.e0 e0Var3 = (com.amazon.aps.iva.ee0.e0) jVar.c;
                if (com.amazon.aps.iva.yb0.j.a(xVar.getName().b(), "equals") && list.size() == 1 && com.amazon.aps.iva.yb0.j.a(cVar.a().j().p(), e0Var2)) {
                    name = com.amazon.aps.iva.nd0.f.h("other");
                } else {
                    name = zVar.getName();
                    if (name == null) {
                        z2 = true;
                    }
                    if (name == null) {
                        name = com.amazon.aps.iva.nd0.f.h("p" + i2);
                    }
                }
                arrayList.add(new v0(xVar, null, i2, E, name, e0Var2, false, false, false, e0Var3, ((com.amazon.aps.iva.ad0.c) cVar.a).j.a(zVar)));
                z = false;
            } else {
                return new b(com.amazon.aps.iva.lb0.x.X0(arrayList), z2);
            }
        }
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> a() {
        return (Set) com.amazon.aps.iva.ab.x.T(this.i, m[0]);
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        if (!a().contains(fVar)) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        return (Collection) ((c.k) this.h).invoke(fVar);
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        if (!d().contains(fVar)) {
            return com.amazon.aps.iva.lb0.z.b;
        }
        return (Collection) ((c.k) this.l).invoke(fVar);
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> d() {
        return (Set) com.amazon.aps.iva.ab.x.T(this.j, m[1]);
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public Collection<com.amazon.aps.iva.oc0.k> e(com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        return this.d.invoke();
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> f() {
        return (Set) com.amazon.aps.iva.ab.x.T(this.k, m[2]);
    }

    public abstract Set h(com.amazon.aps.iva.xd0.d dVar, i.a.C0852a c0852a);

    public abstract Set i(com.amazon.aps.iva.xd0.d dVar, i.a.C0852a c0852a);

    public void j(ArrayList arrayList, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    public abstract com.amazon.aps.iva.bd0.b k();

    public abstract void m(LinkedHashSet linkedHashSet, com.amazon.aps.iva.nd0.f fVar);

    public abstract void n(ArrayList arrayList, com.amazon.aps.iva.nd0.f fVar);

    public abstract Set o(com.amazon.aps.iva.xd0.d dVar);

    public abstract q0 p();

    public abstract com.amazon.aps.iva.oc0.k q();

    public boolean r(com.amazon.aps.iva.zc0.e eVar) {
        return true;
    }

    public abstract a s(com.amazon.aps.iva.ed0.q qVar, ArrayList arrayList, com.amazon.aps.iva.ee0.e0 e0Var, List list);

    public final com.amazon.aps.iva.zc0.e t(com.amazon.aps.iva.ed0.q qVar) {
        boolean z;
        o0 o0Var;
        Map map;
        com.amazon.aps.iva.yb0.j.f(qVar, FirebaseAnalytics.Param.METHOD);
        com.amazon.aps.iva.la0.c cVar = this.b;
        com.amazon.aps.iva.ad0.e E = l1.E(cVar, qVar);
        com.amazon.aps.iva.oc0.k q = q();
        com.amazon.aps.iva.nd0.f name = qVar.getName();
        i.a a2 = ((com.amazon.aps.iva.ad0.c) cVar.a).j.a(qVar);
        if (this.e.invoke().f(qVar.getName()) != null && qVar.f().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.zc0.e U0 = com.amazon.aps.iva.zc0.e.U0(q, E, name, a2, z);
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.la0.c cVar2 = new com.amazon.aps.iva.la0.c((com.amazon.aps.iva.ad0.c) cVar.a, new com.amazon.aps.iva.ad0.g(cVar, U0, qVar, 0), (com.amazon.aps.iva.kb0.e) cVar.c);
        ArrayList<com.amazon.aps.iva.ed0.x> typeParameters = qVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(typeParameters));
        for (com.amazon.aps.iva.ed0.x xVar : typeParameters) {
            y0 a3 = ((com.amazon.aps.iva.ad0.j) cVar2.b).a(xVar);
            com.amazon.aps.iva.yb0.j.c(a3);
            arrayList.add(a3);
        }
        b u = u(cVar2, U0, qVar.f());
        com.amazon.aps.iva.ee0.e0 l = l(qVar, cVar2);
        List<c1> list = u.a;
        a s = s(qVar, arrayList, l, list);
        com.amazon.aps.iva.ee0.e0 e0Var = s.b;
        if (e0Var != null) {
            o0Var = com.amazon.aps.iva.qd0.h.h(U0, e0Var, h.a.a);
        } else {
            o0Var = null;
        }
        q0 p = p();
        com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
        List<y0> list2 = s.d;
        List<c1> list3 = s.c;
        com.amazon.aps.iva.ee0.e0 e0Var2 = s.a;
        b0.Companion.getClass();
        b0 a4 = b0.a.a(false, qVar.isAbstract(), !qVar.isFinal());
        com.amazon.aps.iva.oc0.r a5 = k0.a(qVar.getVisibility());
        if (s.b != null) {
            map = com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.zc0.e.H, com.amazon.aps.iva.lb0.x.t0(list)));
        } else {
            map = a0.b;
        }
        U0.T0(o0Var, p, zVar, list2, list3, e0Var2, a4, a5, map);
        U0.F = e.c.get(s.e, u.b);
        List<String> list4 = s.f;
        if (!list4.isEmpty()) {
            ((k.a) ((com.amazon.aps.iva.ad0.c) cVar2.a).e).getClass();
            if (list4 == null) {
                k.a.a(6);
                throw null;
            }
            throw new UnsupportedOperationException("Should not be called");
        }
        return U0;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
