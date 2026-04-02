package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.ae0.e0;
import com.amazon.aps.iva.ae0.f0;
import com.amazon.aps.iva.ae0.g0;
import com.amazon.aps.iva.ae0.s;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.id0.b;
import com.amazon.aps.iva.id0.v;
import com.amazon.aps.iva.kd0.h;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.a1;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.d0;
import com.amazon.aps.iva.oc0.e0;
import com.amazon.aps.iva.oc0.f0;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.r0;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.w;
import com.amazon.aps.iva.oc0.w0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.oc0.z0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.qd0.h;
import com.amazon.aps.iva.rc0.o0;
import com.amazon.aps.iva.xd0.i;
import com.amazon.aps.iva.xd0.l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes4.dex */
public final class d extends com.amazon.aps.iva.rc0.b implements com.amazon.aps.iva.oc0.k {
    public final com.amazon.aps.iva.id0.b f;
    public final com.amazon.aps.iva.kd0.a g;
    public final t0 h;
    public final com.amazon.aps.iva.nd0.b i;
    public final b0 j;
    public final com.amazon.aps.iva.oc0.p k;
    public final com.amazon.aps.iva.oc0.f l;
    public final com.amazon.aps.iva.ae0.n m;
    public final com.amazon.aps.iva.xd0.j n;
    public final b o;
    public final r0<a> p;
    public final c q;
    public final com.amazon.aps.iva.oc0.k r;
    public final com.amazon.aps.iva.de0.j<com.amazon.aps.iva.oc0.d> s;
    public final com.amazon.aps.iva.de0.i<Collection<com.amazon.aps.iva.oc0.d>> t;
    public final com.amazon.aps.iva.de0.j<com.amazon.aps.iva.oc0.e> u;
    public final com.amazon.aps.iva.de0.i<Collection<com.amazon.aps.iva.oc0.e>> v;
    public final com.amazon.aps.iva.de0.j<a1<m0>> w;
    public final e0.a x;
    public final com.amazon.aps.iva.pc0.h y;

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public final class a extends l {
        public final com.amazon.aps.iva.fe0.f g;
        public final com.amazon.aps.iva.de0.i<Collection<com.amazon.aps.iva.oc0.k>> h;
        public final com.amazon.aps.iva.de0.i<Collection<com.amazon.aps.iva.ee0.e0>> i;
        public final /* synthetic */ d j;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: com.amazon.aps.iva.ce0.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0169a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.nd0.f>> {
            public final /* synthetic */ List<com.amazon.aps.iva.nd0.f> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0169a(ArrayList arrayList) {
                super(0);
                this.h = arrayList;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends com.amazon.aps.iva.nd0.f> invoke() {
                return this.h;
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes4.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.oc0.k>> {
            public b() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Collection<? extends com.amazon.aps.iva.oc0.k> invoke() {
                com.amazon.aps.iva.xd0.d dVar = com.amazon.aps.iva.xd0.d.m;
                com.amazon.aps.iva.xd0.i.a.getClass();
                return a.this.i(dVar, i.a.b, com.amazon.aps.iva.wc0.d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes4.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.ee0.e0>> {
            public c() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Collection<? extends com.amazon.aps.iva.ee0.e0> invoke() {
                a aVar = a.this;
                return aVar.g.v(aVar.j);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(com.amazon.aps.iva.ce0.d r8, com.amazon.aps.iva.fe0.f r9) {
            /*
                r7 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                com.amazon.aps.iva.yb0.j.f(r9, r0)
                r7.j = r8
                com.amazon.aps.iva.ae0.n r2 = r8.m
                com.amazon.aps.iva.id0.b r0 = r8.f
                java.util.List<com.amazon.aps.iva.id0.h> r3 = r0.r
                java.lang.String r1 = "classProto.functionList"
                com.amazon.aps.iva.yb0.j.e(r3, r1)
                java.util.List<com.amazon.aps.iva.id0.m> r4 = r0.s
                java.lang.String r1 = "classProto.propertyList"
                com.amazon.aps.iva.yb0.j.e(r4, r1)
                java.util.List<com.amazon.aps.iva.id0.q> r5 = r0.t
                java.lang.String r1 = "classProto.typeAliasList"
                com.amazon.aps.iva.yb0.j.e(r5, r1)
                java.util.List<java.lang.Integer> r0 = r0.l
                java.lang.String r1 = "classProto.nestedClassNameList"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                com.amazon.aps.iva.ae0.n r8 = r8.m
                com.amazon.aps.iva.kd0.c r8 = r8.b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r6 = com.amazon.aps.iva.lb0.r.Y(r0)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L3a:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L52
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                com.amazon.aps.iva.nd0.f r6 = com.amazon.aps.iva.aq.j.w(r8, r6)
                r1.add(r6)
                goto L3a
            L52:
                com.amazon.aps.iva.ce0.d$a$a r6 = new com.amazon.aps.iva.ce0.d$a$a
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.g = r9
                com.amazon.aps.iva.ae0.n r8 = r7.b
                com.amazon.aps.iva.ae0.l r8 = r8.a
                com.amazon.aps.iva.de0.l r8 = r8.a
                com.amazon.aps.iva.ce0.d$a$b r9 = new com.amazon.aps.iva.ce0.d$a$b
                r9.<init>()
                com.amazon.aps.iva.de0.c$h r8 = r8.g(r9)
                r7.h = r8
                com.amazon.aps.iva.ae0.n r8 = r7.b
                com.amazon.aps.iva.ae0.l r8 = r8.a
                com.amazon.aps.iva.de0.l r8 = r8.a
                com.amazon.aps.iva.ce0.d$a$c r9 = new com.amazon.aps.iva.ce0.d$a$c
                r9.<init>()
                com.amazon.aps.iva.de0.c$h r8 = r8.g(r9)
                r7.i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ce0.d.a.<init>(com.amazon.aps.iva.ce0.d, com.amazon.aps.iva.fe0.f):void");
        }

        @Override // com.amazon.aps.iva.ce0.l, com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
            t(fVar, dVar);
            return super.b(fVar, dVar);
        }

        @Override // com.amazon.aps.iva.ce0.l, com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
            t(fVar, dVar);
            return super.c(fVar, dVar);
        }

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
        public final Collection<com.amazon.aps.iva.oc0.k> e(com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
            com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
            com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
            return this.h.invoke();
        }

        @Override // com.amazon.aps.iva.ce0.l, com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
        public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
            com.amazon.aps.iva.oc0.e invoke;
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
            t(fVar, dVar);
            c cVar = this.j.q;
            if (cVar != null && (invoke = cVar.b.invoke(fVar)) != null) {
                return invoke;
            }
            return super.g(fVar, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r1v3, types: [com.amazon.aps.iva.lb0.z] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        @Override // com.amazon.aps.iva.ce0.l
        public final void h(ArrayList arrayList, com.amazon.aps.iva.xb0.l lVar) {
            ?? r1;
            com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
            c cVar = this.j.q;
            if (cVar != null) {
                r1 = new ArrayList();
                for (com.amazon.aps.iva.nd0.f fVar : cVar.a.keySet()) {
                    com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    com.amazon.aps.iva.oc0.e invoke = cVar.b.invoke(fVar);
                    if (invoke != null) {
                        r1.add(invoke);
                    }
                }
            } else {
                r1 = 0;
            }
            if (r1 == 0) {
                r1 = z.b;
            }
            arrayList.addAll(r1);
        }

        @Override // com.amazon.aps.iva.ce0.l
        public final void j(com.amazon.aps.iva.nd0.f fVar, ArrayList arrayList) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            ArrayList arrayList2 = new ArrayList();
            for (com.amazon.aps.iva.ee0.e0 e0Var : this.i.invoke()) {
                arrayList2.addAll(e0Var.l().b(fVar, com.amazon.aps.iva.wc0.d.FOR_ALREADY_TRACKED));
            }
            arrayList.addAll(this.b.a.n.d(fVar, this.j));
            s(fVar, arrayList2, arrayList);
        }

        @Override // com.amazon.aps.iva.ce0.l
        public final void k(com.amazon.aps.iva.nd0.f fVar, ArrayList arrayList) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            ArrayList arrayList2 = new ArrayList();
            for (com.amazon.aps.iva.ee0.e0 e0Var : this.i.invoke()) {
                arrayList2.addAll(e0Var.l().c(fVar, com.amazon.aps.iva.wc0.d.FOR_ALREADY_TRACKED));
            }
            s(fVar, arrayList2, arrayList);
        }

        @Override // com.amazon.aps.iva.ce0.l
        public final com.amazon.aps.iva.nd0.b l(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return this.j.i.d(fVar);
        }

        @Override // com.amazon.aps.iva.ce0.l
        public final Set<com.amazon.aps.iva.nd0.f> n() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (com.amazon.aps.iva.ee0.e0 e0Var : this.j.o.g()) {
                Set<com.amazon.aps.iva.nd0.f> f = e0Var.l().f();
                if (f == null) {
                    return null;
                }
                t.d0(linkedHashSet, f);
            }
            return linkedHashSet;
        }

        @Override // com.amazon.aps.iva.ce0.l
        public final Set<com.amazon.aps.iva.nd0.f> o() {
            d dVar = this.j;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (com.amazon.aps.iva.ee0.e0 e0Var : dVar.o.g()) {
                t.d0(linkedHashSet, e0Var.l().a());
            }
            linkedHashSet.addAll(this.b.a.n.c(dVar));
            return linkedHashSet;
        }

        @Override // com.amazon.aps.iva.ce0.l
        public final Set<com.amazon.aps.iva.nd0.f> p() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (com.amazon.aps.iva.ee0.e0 e0Var : this.j.o.g()) {
                t.d0(linkedHashSet, e0Var.l().d());
            }
            return linkedHashSet;
        }

        @Override // com.amazon.aps.iva.ce0.l
        public final boolean r(o oVar) {
            return this.b.a.o.b(this.j, oVar);
        }

        public final void s(com.amazon.aps.iva.nd0.f fVar, ArrayList arrayList, ArrayList arrayList2) {
            this.b.a.q.a().h(fVar, arrayList, new ArrayList(arrayList2), this.j, new com.amazon.aps.iva.ce0.e(arrayList2));
        }

        public final void t(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.b bVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(bVar, FirebaseAnalytics.Param.LOCATION);
            com.amazon.aps.iva.vc0.a.a(this.b.a.i, (com.amazon.aps.iva.wc0.d) bVar, this.j, fVar);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public final class b extends com.amazon.aps.iva.ee0.b {
        public final com.amazon.aps.iva.de0.i<List<y0>> c;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes4.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends y0>> {
            public final /* synthetic */ d h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(0);
                this.h = dVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final List<? extends y0> invoke() {
                return z0.b(this.h);
            }
        }

        public b() {
            super(d.this.m.a.a);
            this.c = d.this.m.a.a.g(new a(d.this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v17 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // com.amazon.aps.iva.ee0.h
        public final Collection<com.amazon.aps.iva.ee0.e0> d() {
            String b;
            com.amazon.aps.iva.nd0.c b2;
            e0.b bVar;
            d dVar = d.this;
            com.amazon.aps.iva.id0.b bVar2 = dVar.f;
            com.amazon.aps.iva.ae0.n nVar = dVar.m;
            com.amazon.aps.iva.kd0.g gVar = nVar.d;
            com.amazon.aps.iva.yb0.j.f(bVar2, "<this>");
            com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
            List<com.amazon.aps.iva.id0.p> list = bVar2.i;
            boolean z = !list.isEmpty();
            ?? r4 = list;
            if (!z) {
                r4 = 0;
            }
            if (r4 == 0) {
                List<Integer> list2 = bVar2.j;
                com.amazon.aps.iva.yb0.j.e(list2, "supertypeIdList");
                List<Integer> list3 = list2;
                r4 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
                for (Integer num : list3) {
                    com.amazon.aps.iva.yb0.j.e(num, "it");
                    r4.add(gVar.a(num.intValue()));
                }
            }
            Iterable<com.amazon.aps.iva.id0.p> iterable = (Iterable) r4;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
            for (com.amazon.aps.iva.id0.p pVar : iterable) {
                arrayList.add(nVar.h.g(pVar));
            }
            ArrayList L0 = x.L0(nVar.a.n.a(dVar), arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = L0.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.oc0.h k = ((com.amazon.aps.iva.ee0.e0) it.next()).I0().k();
                if (k instanceof e0.b) {
                    bVar = (e0.b) k;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                s sVar = nVar.a.h;
                ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList2));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    e0.b bVar3 = (e0.b) it2.next();
                    com.amazon.aps.iva.nd0.b f = com.amazon.aps.iva.ud0.b.f(bVar3);
                    if (f != null && (b2 = f.b()) != null) {
                        b = b2.b();
                    } else {
                        b = bVar3.getName().b();
                    }
                    arrayList3.add(b);
                }
                sVar.b(dVar, arrayList3);
            }
            return x.X0(L0);
        }

        @Override // com.amazon.aps.iva.ee0.c1
        public final List<y0> getParameters() {
            return this.c.invoke();
        }

        @Override // com.amazon.aps.iva.ee0.h
        public final w0 h() {
            return w0.a.a;
        }

        @Override // com.amazon.aps.iva.ee0.b, com.amazon.aps.iva.ee0.c1
        public final com.amazon.aps.iva.oc0.h k() {
            return d.this;
        }

        @Override // com.amazon.aps.iva.ee0.c1
        public final boolean l() {
            return true;
        }

        @Override // com.amazon.aps.iva.ee0.b
        public final com.amazon.aps.iva.oc0.e p() {
            return d.this;
        }

        public final String toString() {
            String str = d.this.getName().b;
            com.amazon.aps.iva.yb0.j.e(str, "name.toString()");
            return str;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public final class c {
        public final LinkedHashMap a;
        public final com.amazon.aps.iva.de0.h<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.e> b;
        public final com.amazon.aps.iva.de0.i<Set<com.amazon.aps.iva.nd0.f>> c;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes4.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.e> {
            public final /* synthetic */ d i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.i = dVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.oc0.e invoke(com.amazon.aps.iva.nd0.f fVar) {
                com.amazon.aps.iva.nd0.f fVar2 = fVar;
                com.amazon.aps.iva.yb0.j.f(fVar2, AppMeasurementSdk.ConditionalUserProperty.NAME);
                c cVar = c.this;
                com.amazon.aps.iva.id0.f fVar3 = (com.amazon.aps.iva.id0.f) cVar.a.get(fVar2);
                if (fVar3 != null) {
                    d dVar = this.i;
                    return com.amazon.aps.iva.rc0.s.G0(dVar.m.a.a, dVar, fVar2, cVar.c, new com.amazon.aps.iva.ce0.a(dVar.m.a.a, new com.amazon.aps.iva.ce0.f(dVar, fVar3)), t0.a);
                }
                return null;
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes4.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
            public b() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
                com.amazon.aps.iva.ae0.n nVar;
                c cVar = c.this;
                cVar.getClass();
                HashSet hashSet = new HashSet();
                d dVar = d.this;
                for (com.amazon.aps.iva.ee0.e0 e0Var : dVar.o.g()) {
                    for (com.amazon.aps.iva.oc0.k kVar : l.a.a(e0Var.l(), null, 3)) {
                        if ((kVar instanceof s0) || (kVar instanceof n0)) {
                            hashSet.add(kVar.getName());
                        }
                    }
                }
                com.amazon.aps.iva.id0.b bVar = dVar.f;
                List<com.amazon.aps.iva.id0.h> list = bVar.r;
                com.amazon.aps.iva.yb0.j.e(list, "classProto.functionList");
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    nVar = dVar.m;
                    if (!hasNext) {
                        break;
                    }
                    hashSet.add(com.amazon.aps.iva.aq.j.w(nVar.b, ((com.amazon.aps.iva.id0.h) it.next()).g));
                }
                List<com.amazon.aps.iva.id0.m> list2 = bVar.s;
                com.amazon.aps.iva.yb0.j.e(list2, "classProto.propertyList");
                for (com.amazon.aps.iva.id0.m mVar : list2) {
                    hashSet.add(com.amazon.aps.iva.aq.j.w(nVar.b, mVar.g));
                }
                return com.amazon.aps.iva.lb0.m0.Q(hashSet, hashSet);
            }
        }

        public c() {
            List<com.amazon.aps.iva.id0.f> list = d.this.f.u;
            com.amazon.aps.iva.yb0.j.e(list, "classProto.enumEntryList");
            List<com.amazon.aps.iva.id0.f> list2 = list;
            int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(list2));
            LinkedHashMap linkedHashMap = new LinkedHashMap(w < 16 ? 16 : w);
            for (Object obj : list2) {
                linkedHashMap.put(com.amazon.aps.iva.aq.j.w(d.this.m.b, ((com.amazon.aps.iva.id0.f) obj).e), obj);
            }
            this.a = linkedHashMap;
            d dVar = d.this;
            this.b = dVar.m.a.a.h(new a(dVar));
            this.c = d.this.m.a.a.g(new b());
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: com.amazon.aps.iva.ce0.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0170d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.pc0.c>> {
        public C0170d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.pc0.c> invoke() {
            d dVar = d.this;
            return x.X0(dVar.m.a.e.i(dVar.x));
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oc0.e> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oc0.e invoke() {
            boolean z;
            d dVar = d.this;
            com.amazon.aps.iva.id0.b bVar = dVar.f;
            if ((bVar.d & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.amazon.aps.iva.oc0.h g = dVar.G0().g(com.amazon.aps.iva.aq.j.w(dVar.m.b, bVar.g), com.amazon.aps.iva.wc0.d.FROM_DESERIALIZATION);
                if (g instanceof com.amazon.aps.iva.oc0.e) {
                    return (com.amazon.aps.iva.oc0.e) g;
                }
            }
            return null;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.oc0.d>> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Collection<? extends com.amazon.aps.iva.oc0.d> invoke() {
            d dVar = d.this;
            List<com.amazon.aps.iva.id0.c> list = dVar.f.q;
            com.amazon.aps.iva.yb0.j.e(list, "classProto.constructorList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (l1.c(com.amazon.aps.iva.kd0.b.m, ((com.amazon.aps.iva.id0.c) obj).e, "IS_SECONDARY.get(it.flags)")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                com.amazon.aps.iva.ae0.n nVar = dVar.m;
                if (hasNext) {
                    com.amazon.aps.iva.id0.c cVar = (com.amazon.aps.iva.id0.c) it.next();
                    com.amazon.aps.iva.ae0.x xVar = nVar.i;
                    com.amazon.aps.iva.yb0.j.e(cVar, "it");
                    arrayList2.add(xVar.d(cVar, false));
                } else {
                    return x.L0(nVar.a.n.e(dVar), x.L0(f1.L(dVar.D()), arrayList2));
                }
            }
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class g extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fe0.f, a> {
        public g(Object obj) {
            super(1, obj);
        }

        @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
        public final String getName() {
            return "<init>";
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final com.amazon.aps.iva.fc0.f getOwner() {
            return com.amazon.aps.iva.yb0.e0.a(a.class);
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final a invoke(com.amazon.aps.iva.fe0.f fVar) {
            com.amazon.aps.iva.fe0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "p0");
            return new a((d) this.receiver, fVar2);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oc0.d> {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oc0.d invoke() {
            Object obj;
            d dVar = d.this;
            if (dVar.l.isSingleton()) {
                h.a aVar = new h.a(dVar);
                aVar.O0(dVar.m());
                return aVar;
            }
            List<com.amazon.aps.iva.id0.c> list = dVar.f.q;
            com.amazon.aps.iva.yb0.j.e(list, "classProto.constructorList");
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (!com.amazon.aps.iva.kd0.b.m.c(((com.amazon.aps.iva.id0.c) obj).e).booleanValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.amazon.aps.iva.id0.c cVar = (com.amazon.aps.iva.id0.c) obj;
            if (cVar == null) {
                return null;
            }
            return dVar.m.i.d(cVar, true);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.oc0.e>> {
        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Collection<? extends com.amazon.aps.iva.oc0.e> invoke() {
            d dVar = d.this;
            dVar.getClass();
            b0 b0Var = b0.SEALED;
            z zVar = z.b;
            b0 b0Var2 = dVar.j;
            if (b0Var2 == b0Var) {
                List<Integer> list = dVar.f.v;
                com.amazon.aps.iva.yb0.j.e(list, "fqNames");
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : list) {
                        com.amazon.aps.iva.ae0.n nVar = dVar.m;
                        com.amazon.aps.iva.ae0.l lVar = nVar.a;
                        com.amazon.aps.iva.yb0.j.e(num, FirebaseAnalytics.Param.INDEX);
                        com.amazon.aps.iva.oc0.e b = lVar.b(com.amazon.aps.iva.aq.j.s(nVar.b, num.intValue()));
                        if (b != null) {
                            arrayList.add(b);
                        }
                    }
                    return arrayList;
                } else if (b0Var2 == b0Var) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    com.amazon.aps.iva.oc0.k kVar = dVar.r;
                    if (kVar instanceof f0) {
                        com.amazon.aps.iva.qd0.b.s(dVar, linkedHashSet, ((f0) kVar).l(), false);
                    }
                    com.amazon.aps.iva.xd0.i Q = dVar.Q();
                    com.amazon.aps.iva.yb0.j.e(Q, "sealedClass.unsubstitutedInnerClassesScope");
                    com.amazon.aps.iva.qd0.b.s(dVar, linkedHashSet, Q, true);
                    return x.T0(linkedHashSet, new com.amazon.aps.iva.qd0.a());
                } else {
                    return zVar;
                }
            }
            return zVar;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a1<m0>> {
        public j() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [com.amazon.aps.iva.ce0.g] */
        /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List<com.amazon.aps.iva.id0.p>] */
        /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
        @Override // com.amazon.aps.iva.xb0.a
        public final a1<m0> invoke() {
            boolean z;
            a1<m0> a1Var;
            boolean z2;
            com.amazon.aps.iva.id0.p pVar;
            com.amazon.aps.iva.he0.i iVar;
            ?? r5;
            d dVar = d.this;
            if (!dVar.isInline() && !dVar.f0()) {
                return null;
            }
            com.amazon.aps.iva.ae0.n nVar = dVar.m;
            com.amazon.aps.iva.kd0.c cVar = nVar.b;
            ?? gVar = new com.amazon.aps.iva.ce0.g(nVar.h);
            com.amazon.aps.iva.ce0.h hVar = new com.amazon.aps.iva.ce0.h(dVar);
            com.amazon.aps.iva.id0.b bVar = dVar.f;
            com.amazon.aps.iva.yb0.j.f(bVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
            com.amazon.aps.iva.kd0.g gVar2 = nVar.d;
            com.amazon.aps.iva.yb0.j.f(gVar2, "typeTable");
            boolean z3 = false;
            if (bVar.A.size() > 0) {
                List<Integer> list = bVar.A;
                com.amazon.aps.iva.yb0.j.e(list, "multiFieldValueClassUnderlyingNameList");
                List<Integer> list2 = list;
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                for (Integer num : list2) {
                    com.amazon.aps.iva.yb0.j.e(num, "it");
                    arrayList.add(com.amazon.aps.iva.aq.j.w(cVar, num.intValue()));
                }
                com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j(Integer.valueOf(bVar.D.size()), Integer.valueOf(bVar.C.size()));
                if (com.amazon.aps.iva.yb0.j.a(jVar, new com.amazon.aps.iva.kb0.j(Integer.valueOf(arrayList.size()), 0))) {
                    List<Integer> list3 = bVar.D;
                    com.amazon.aps.iva.yb0.j.e(list3, "multiFieldValueClassUnderlyingTypeIdList");
                    List<Integer> list4 = list3;
                    r5 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list4));
                    for (Integer num2 : list4) {
                        com.amazon.aps.iva.yb0.j.e(num2, "it");
                        r5.add(gVar2.a(num2.intValue()));
                    }
                } else if (com.amazon.aps.iva.yb0.j.a(jVar, new com.amazon.aps.iva.kb0.j(0, Integer.valueOf(arrayList.size())))) {
                    r5 = bVar.C;
                } else {
                    throw new IllegalStateException(("class " + com.amazon.aps.iva.aq.j.w(cVar, bVar.f) + " has illegal multi-field value class representation").toString());
                }
                com.amazon.aps.iva.yb0.j.e(r5, "when (typeIdCount to typ…epresentation\")\n        }");
                Iterable<Object> iterable = (Iterable) r5;
                ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
                for (Object obj : iterable) {
                    arrayList2.add(gVar.invoke(obj));
                }
                a1Var = new d0<>(x.e1(arrayList, arrayList2));
            } else {
                if ((bVar.d & 8) == 8) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    com.amazon.aps.iva.nd0.f w = com.amazon.aps.iva.aq.j.w(cVar, bVar.x);
                    int i = bVar.d;
                    if ((i & 16) == 16) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        pVar = bVar.y;
                    } else {
                        if ((i & 32) == 32) {
                            z3 = true;
                        }
                        if (z3) {
                            pVar = gVar2.a(bVar.z);
                        } else {
                            pVar = null;
                        }
                    }
                    if ((pVar != null && (iVar = (com.amazon.aps.iva.he0.i) gVar.invoke(pVar)) != null) || (iVar = (com.amazon.aps.iva.he0.i) hVar.invoke(w)) != null) {
                        a1Var = new w<>(w, iVar);
                    } else {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + com.amazon.aps.iva.aq.j.w(cVar, bVar.f) + " with property " + w).toString());
                    }
                } else {
                    a1Var = null;
                }
            }
            if (a1Var != null) {
                return a1Var;
            }
            if (dVar.g.a(1, 5, 1)) {
                return null;
            }
            com.amazon.aps.iva.oc0.d D = dVar.D();
            if (D != null) {
                List<c1> f = D.f();
                com.amazon.aps.iva.yb0.j.e(f, "constructor.valueParameters");
                com.amazon.aps.iva.nd0.f name = ((c1) x.t0(f)).getName();
                com.amazon.aps.iva.yb0.j.e(name, "constructor.valueParameters.first().name");
                m0 H0 = dVar.H0(name);
                if (H0 != null) {
                    return new w(name, H0);
                }
                throw new IllegalStateException(("Value class has no underlying property: " + dVar).toString());
            }
            throw new IllegalStateException(("Inline class has no primary constructor: " + dVar).toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.ae0.n nVar, com.amazon.aps.iva.id0.b bVar, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.a aVar, t0 t0Var) {
        super(nVar.a.a, com.amazon.aps.iva.aq.j.s(cVar, bVar.f).j());
        int i2;
        com.amazon.aps.iva.oc0.f fVar;
        com.amazon.aps.iva.xd0.j jVar;
        c cVar2;
        d dVar;
        com.amazon.aps.iva.pc0.h rVar;
        com.amazon.aps.iva.yb0.j.f(nVar, "outerContext");
        com.amazon.aps.iva.yb0.j.f(bVar, "classProto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(aVar, "metadataVersion");
        com.amazon.aps.iva.yb0.j.f(t0Var, "sourceElement");
        this.f = bVar;
        this.g = aVar;
        this.h = t0Var;
        this.i = com.amazon.aps.iva.aq.j.s(cVar, bVar.f);
        this.j = com.amazon.aps.iva.ae0.f0.a((com.amazon.aps.iva.id0.j) com.amazon.aps.iva.kd0.b.e.c(bVar.e));
        this.k = g0.a((com.amazon.aps.iva.id0.w) com.amazon.aps.iva.kd0.b.d.c(bVar.e));
        b.c cVar3 = (b.c) com.amazon.aps.iva.kd0.b.f.c(bVar.e);
        if (cVar3 == null) {
            i2 = -1;
        } else {
            i2 = f0.a.b[cVar3.ordinal()];
        }
        switch (i2) {
            case 1:
                fVar = com.amazon.aps.iva.oc0.f.CLASS;
                break;
            case 2:
                fVar = com.amazon.aps.iva.oc0.f.INTERFACE;
                break;
            case 3:
                fVar = com.amazon.aps.iva.oc0.f.ENUM_CLASS;
                break;
            case 4:
                fVar = com.amazon.aps.iva.oc0.f.ENUM_ENTRY;
                break;
            case 5:
                fVar = com.amazon.aps.iva.oc0.f.ANNOTATION_CLASS;
                break;
            case 6:
            case 7:
                fVar = com.amazon.aps.iva.oc0.f.OBJECT;
                break;
            default:
                fVar = com.amazon.aps.iva.oc0.f.CLASS;
                break;
        }
        this.l = fVar;
        List<com.amazon.aps.iva.id0.r> list = bVar.h;
        com.amazon.aps.iva.yb0.j.e(list, "classProto.typeParameterList");
        com.amazon.aps.iva.id0.s sVar = bVar.F;
        com.amazon.aps.iva.yb0.j.e(sVar, "classProto.typeTable");
        com.amazon.aps.iva.kd0.g gVar = new com.amazon.aps.iva.kd0.g(sVar);
        com.amazon.aps.iva.kd0.h hVar = com.amazon.aps.iva.kd0.h.b;
        v vVar = bVar.H;
        com.amazon.aps.iva.yb0.j.e(vVar, "classProto.versionRequirementTable");
        com.amazon.aps.iva.ae0.n a2 = nVar.a(this, list, cVar, gVar, h.a.a(vVar), aVar);
        this.m = a2;
        com.amazon.aps.iva.oc0.f fVar2 = com.amazon.aps.iva.oc0.f.ENUM_CLASS;
        com.amazon.aps.iva.ae0.l lVar = a2.a;
        if (fVar == fVar2) {
            jVar = new com.amazon.aps.iva.xd0.m(lVar.a, this);
        } else {
            jVar = i.b.b;
        }
        this.n = jVar;
        this.o = new b();
        r0.a aVar2 = r0.e;
        com.amazon.aps.iva.de0.l lVar2 = lVar.a;
        com.amazon.aps.iva.fe0.f c2 = lVar.q.c();
        g gVar2 = new g(this);
        aVar2.getClass();
        this.p = r0.a.a(gVar2, this, lVar2, c2);
        if (fVar == fVar2) {
            cVar2 = new c();
        } else {
            cVar2 = null;
        }
        this.q = cVar2;
        com.amazon.aps.iva.oc0.k kVar = nVar.c;
        this.r = kVar;
        h hVar2 = new h();
        com.amazon.aps.iva.de0.l lVar3 = lVar.a;
        this.s = lVar3.b(hVar2);
        this.t = lVar3.g(new f());
        this.u = lVar3.b(new e());
        this.v = lVar3.g(new i());
        this.w = lVar3.b(new j());
        com.amazon.aps.iva.kd0.c cVar4 = a2.b;
        com.amazon.aps.iva.kd0.g gVar3 = a2.d;
        if (kVar instanceof d) {
            dVar = (d) kVar;
        } else {
            dVar = null;
        }
        this.x = new e0.a(bVar, cVar4, gVar3, t0Var, dVar != null ? dVar.x : null);
        if (!com.amazon.aps.iva.kd0.b.c.c(bVar.e).booleanValue()) {
            rVar = h.a.a;
        } else {
            rVar = new r(lVar3, new C0170d());
        }
        this.y = rVar;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.d D() {
        return this.s.invoke();
    }

    public final a G0() {
        return this.p.a(this.m.a.q.c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r2 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.ee0.m0 H0(com.amazon.aps.iva.nd0.f r8) {
        /*
            r7 = this;
            com.amazon.aps.iva.ce0.d$a r0 = r7.G0()
            com.amazon.aps.iva.wc0.d r1 = com.amazon.aps.iva.wc0.d.FROM_DESERIALIZATION
            java.util.Collection r8 = r0.c(r8, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = r1
        L14:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r8.next()
            r5 = r4
            com.amazon.aps.iva.oc0.n0 r5 = (com.amazon.aps.iva.oc0.n0) r5
            com.amazon.aps.iva.oc0.q0 r5 = r5.M()
            r6 = 1
            if (r5 != 0) goto L2a
            r5 = r6
            goto L2b
        L2a:
            r5 = r1
        L2b:
            if (r5 == 0) goto L14
            if (r2 == 0) goto L30
            goto L35
        L30:
            r3 = r4
            r2 = r6
            goto L14
        L33:
            if (r2 != 0) goto L36
        L35:
            r3 = r0
        L36:
            com.amazon.aps.iva.oc0.n0 r3 = (com.amazon.aps.iva.oc0.n0) r3
            if (r3 == 0) goto L3e
            com.amazon.aps.iva.ee0.e0 r0 = r3.getType()
        L3e:
            com.amazon.aps.iva.ee0.m0 r0 = (com.amazon.aps.iva.ee0.m0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ce0.d.H0(com.amazon.aps.iva.nd0.f):com.amazon.aps.iva.ee0.m0");
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final a1<m0> R() {
        return this.w.invoke();
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // com.amazon.aps.iva.rc0.b, com.amazon.aps.iva.oc0.e
    public final List<q0> V() {
        com.amazon.aps.iva.ae0.n nVar = this.m;
        com.amazon.aps.iva.kd0.g gVar = nVar.d;
        com.amazon.aps.iva.id0.b bVar = this.f;
        com.amazon.aps.iva.yb0.j.f(bVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        List<com.amazon.aps.iva.id0.p> list = bVar.n;
        boolean z = !list.isEmpty();
        ?? r3 = list;
        if (!z) {
            r3 = 0;
        }
        if (r3 == 0) {
            List<Integer> list2 = bVar.o;
            com.amazon.aps.iva.yb0.j.e(list2, "contextReceiverTypeIdList");
            List<Integer> list3 = list2;
            r3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
            for (Integer num : list3) {
                com.amazon.aps.iva.yb0.j.e(num, "it");
                r3.add(gVar.a(num.intValue()));
            }
        }
        Iterable<com.amazon.aps.iva.id0.p> iterable = (Iterable) r3;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
        for (com.amazon.aps.iva.id0.p pVar : iterable) {
            arrayList.add(new o0(F0(), new com.amazon.aps.iva.yd0.b(this, nVar.h.g(pVar), null), h.a.a));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean X() {
        if (com.amazon.aps.iva.kd0.b.f.c(this.f.e) == b.c.COMPANION_OBJECT) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean a0() {
        return l1.c(com.amazon.aps.iva.kd0.b.l, this.f.e, "IS_FUN_INTERFACE.get(classProto.flags)");
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final Collection<com.amazon.aps.iva.oc0.d> e() {
        return this.t.invoke();
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean f0() {
        if (l1.c(com.amazon.aps.iva.kd0.b.k, this.f.e, "IS_VALUE_CLASS.get(classProto.flags)") && this.g.a(1, 4, 2)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.n
    public final t0 g() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return l1.c(com.amazon.aps.iva.kd0.b.j, this.f.e, "IS_EXPECT_CLASS.get(classProto.flags)");
    }

    @Override // com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        return this.y;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.f getKind() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final com.amazon.aps.iva.ee0.c1 h() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i h0() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.e i0() {
        return this.u.invoke();
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean isExternal() {
        return l1.c(com.amazon.aps.iva.kd0.b.i, this.f.e, "IS_EXTERNAL_CLASS.get(classProto.flags)");
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean isInline() {
        boolean z;
        int i2;
        if (!l1.c(com.amazon.aps.iva.kd0.b.k, this.f.e, "IS_VALUE_CLASS.get(classProto.flags)")) {
            return false;
        }
        com.amazon.aps.iva.kd0.a aVar = this.g;
        int i3 = aVar.b;
        if (i3 < 1 || (i3 <= 1 && ((i2 = aVar.c) < 4 || (i2 <= 4 && aVar.d <= 1)))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.i
    public final List<y0> n() {
        return this.m.h.b();
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.a0
    public final b0 o() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean s() {
        return l1.c(com.amazon.aps.iva.kd0.b.h, this.f.e, "IS_DATA.get(classProto.flags)");
    }

    @Override // com.amazon.aps.iva.rc0.b0
    public final com.amazon.aps.iva.xd0.i s0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        return this.p.a(fVar);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("deserialized ");
        if (g0()) {
            str = "expect ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final Collection<com.amazon.aps.iva.oc0.e> x() {
        return this.v.invoke();
    }

    @Override // com.amazon.aps.iva.oc0.i
    public final boolean z() {
        return l1.c(com.amazon.aps.iva.kd0.b.g, this.f.e, "IS_INNER.get(classProto.flags)");
    }
}
