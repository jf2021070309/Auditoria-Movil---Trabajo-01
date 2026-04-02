package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.ae0.x;
import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.id0.h;
import com.amazon.aps.iva.id0.m;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.oc0.x0;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: DeserializedMemberScope.kt */
/* loaded from: classes4.dex */
public abstract class l extends com.amazon.aps.iva.xd0.j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {e0.c(new v(e0.a(l.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), e0.c(new v(e0.a(l.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    public final com.amazon.aps.iva.ae0.n b;
    public final a c;
    public final com.amazon.aps.iva.de0.i d;
    public final com.amazon.aps.iva.de0.j e;

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes4.dex */
    public interface a {
        Set<com.amazon.aps.iva.nd0.f> a();

        Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar);

        Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar);

        Set<com.amazon.aps.iva.nd0.f> d();

        void e(ArrayList arrayList, com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.wc0.d dVar2);

        Set<com.amazon.aps.iva.nd0.f> f();

        x0 g(com.amazon.aps.iva.nd0.f fVar);
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes4.dex */
    public final class b implements a {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] j = {e0.c(new v(e0.a(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), e0.c(new v(e0.a(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        public final LinkedHashMap a;
        public final LinkedHashMap b;
        public final Map<com.amazon.aps.iva.nd0.f, byte[]> c;
        public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.f, Collection<s0>> d;
        public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.f, Collection<n0>> e;
        public final com.amazon.aps.iva.de0.h<com.amazon.aps.iva.nd0.f, x0> f;
        public final com.amazon.aps.iva.de0.i g;
        public final com.amazon.aps.iva.de0.i h;

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes4.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public final /* synthetic */ com.amazon.aps.iva.od0.r h;
            public final /* synthetic */ ByteArrayInputStream i;
            public final /* synthetic */ l j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.od0.b bVar, ByteArrayInputStream byteArrayInputStream, l lVar) {
                super(0);
                this.h = bVar;
                this.i = byteArrayInputStream;
                this.j = lVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Object invoke() {
                return ((com.amazon.aps.iva.od0.b) this.h).c(this.i, this.j.b.a.p);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: com.amazon.aps.iva.ce0.l$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0171b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
            public final /* synthetic */ l i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0171b(l lVar) {
                super(0);
                this.i = lVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
                return m0.Q(b.this.a.keySet(), this.i.o());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes4.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Collection<? extends s0>> {
            public c() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final Collection<? extends s0> invoke(com.amazon.aps.iva.nd0.f fVar) {
                Collection<com.amazon.aps.iva.id0.h> collection;
                com.amazon.aps.iva.nd0.f fVar2 = fVar;
                com.amazon.aps.iva.yb0.j.f(fVar2, "it");
                b bVar = b.this;
                LinkedHashMap linkedHashMap = bVar.a;
                h.a aVar = com.amazon.aps.iva.id0.h.w;
                com.amazon.aps.iva.yb0.j.e(aVar, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(fVar2);
                l lVar = l.this;
                if (bArr != null) {
                    a aVar2 = new a(aVar, new ByteArrayInputStream(bArr), lVar);
                    collection = s.f0(com.amazon.aps.iva.ne0.k.P(new com.amazon.aps.iva.ne0.g(aVar2, new com.amazon.aps.iva.ne0.n(aVar2))));
                } else {
                    collection = z.b;
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (com.amazon.aps.iva.id0.h hVar : collection) {
                    x xVar = lVar.b.i;
                    com.amazon.aps.iva.yb0.j.e(hVar, "it");
                    o e = xVar.e(hVar);
                    if (!lVar.r(e)) {
                        e = null;
                    }
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
                lVar.j(fVar2, arrayList);
                return com.amazon.aps.iva.a60.b.l(arrayList);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes4.dex */
        public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Collection<? extends n0>> {
            public d() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final Collection<? extends n0> invoke(com.amazon.aps.iva.nd0.f fVar) {
                Collection<com.amazon.aps.iva.id0.m> collection;
                com.amazon.aps.iva.nd0.f fVar2 = fVar;
                com.amazon.aps.iva.yb0.j.f(fVar2, "it");
                b bVar = b.this;
                LinkedHashMap linkedHashMap = bVar.b;
                m.a aVar = com.amazon.aps.iva.id0.m.w;
                com.amazon.aps.iva.yb0.j.e(aVar, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(fVar2);
                l lVar = l.this;
                if (bArr != null) {
                    a aVar2 = new a(aVar, new ByteArrayInputStream(bArr), lVar);
                    collection = s.f0(com.amazon.aps.iva.ne0.k.P(new com.amazon.aps.iva.ne0.g(aVar2, new com.amazon.aps.iva.ne0.n(aVar2))));
                } else {
                    collection = z.b;
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (com.amazon.aps.iva.id0.m mVar : collection) {
                    x xVar = lVar.b.i;
                    com.amazon.aps.iva.yb0.j.e(mVar, "it");
                    arrayList.add(xVar.f(mVar));
                }
                lVar.k(fVar2, arrayList);
                return com.amazon.aps.iva.a60.b.l(arrayList);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes4.dex */
        public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, x0> {
            public e() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final x0 invoke(com.amazon.aps.iva.nd0.f fVar) {
                com.amazon.aps.iva.nd0.f fVar2 = fVar;
                com.amazon.aps.iva.yb0.j.f(fVar2, "it");
                b bVar = b.this;
                byte[] bArr = bVar.c.get(fVar2);
                if (bArr != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    l lVar = l.this;
                    com.amazon.aps.iva.id0.q qVar = (com.amazon.aps.iva.id0.q) com.amazon.aps.iva.id0.q.q.c(byteArrayInputStream, lVar.b.a.p);
                    if (qVar != null) {
                        return lVar.b.i.g(qVar);
                    }
                }
                return null;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes4.dex */
        public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
            public final /* synthetic */ l i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(l lVar) {
                super(0);
                this.i = lVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
                return m0.Q(b.this.b.keySet(), this.i.p());
            }
        }

        public b(List<com.amazon.aps.iva.id0.h> list, List<com.amazon.aps.iva.id0.m> list2, List<com.amazon.aps.iva.id0.q> list3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                com.amazon.aps.iva.nd0.f w = com.amazon.aps.iva.aq.j.w(l.this.b.b, ((com.amazon.aps.iva.id0.h) ((com.amazon.aps.iva.od0.p) obj)).g);
                Object obj2 = linkedHashMap.get(w);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(w, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.a = h(linkedHashMap);
            l lVar = l.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                com.amazon.aps.iva.nd0.f w2 = com.amazon.aps.iva.aq.j.w(lVar.b.b, ((com.amazon.aps.iva.id0.m) ((com.amazon.aps.iva.od0.p) obj3)).g);
                Object obj4 = linkedHashMap2.get(w2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(w2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.b = h(linkedHashMap2);
            l.this.b.a.c.d();
            l lVar2 = l.this;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj5 : list3) {
                com.amazon.aps.iva.nd0.f w3 = com.amazon.aps.iva.aq.j.w(lVar2.b.b, ((com.amazon.aps.iva.id0.q) ((com.amazon.aps.iva.od0.p) obj5)).f);
                Object obj6 = linkedHashMap3.get(w3);
                if (obj6 == null) {
                    obj6 = new ArrayList();
                    linkedHashMap3.put(w3, obj6);
                }
                ((List) obj6).add(obj5);
            }
            this.c = h(linkedHashMap3);
            this.d = l.this.b.a.a.f(new c());
            this.e = l.this.b.a.a.f(new d());
            this.f = l.this.b.a.a.h(new e());
            l lVar3 = l.this;
            this.g = lVar3.b.a.a.g(new C0171b(lVar3));
            l lVar4 = l.this;
            this.h = lVar4.b.a.a.g(new f(lVar4));
        }

        public static LinkedHashMap h(LinkedHashMap linkedHashMap) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<com.amazon.aps.iva.od0.a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
                for (com.amazon.aps.iva.od0.a aVar : iterable) {
                    int serializedSize = aVar.getSerializedSize();
                    int f2 = com.amazon.aps.iva.od0.e.f(serializedSize) + serializedSize;
                    if (f2 > 4096) {
                        f2 = 4096;
                    }
                    com.amazon.aps.iva.od0.e j2 = com.amazon.aps.iva.od0.e.j(byteArrayOutputStream, f2);
                    j2.v(serializedSize);
                    aVar.a(j2);
                    j2.i();
                    arrayList.add(com.amazon.aps.iva.kb0.q.a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // com.amazon.aps.iva.ce0.l.a
        public final Set<com.amazon.aps.iva.nd0.f> a() {
            return (Set) com.amazon.aps.iva.ab.x.T(this.g, j[0]);
        }

        @Override // com.amazon.aps.iva.ce0.l.a
        public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
            if (!a().contains(fVar)) {
                return z.b;
            }
            return (Collection) ((c.k) this.d).invoke(fVar);
        }

        @Override // com.amazon.aps.iva.ce0.l.a
        public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
            if (!d().contains(fVar)) {
                return z.b;
            }
            return (Collection) ((c.k) this.e).invoke(fVar);
        }

        @Override // com.amazon.aps.iva.ce0.l.a
        public final Set<com.amazon.aps.iva.nd0.f> d() {
            return (Set) com.amazon.aps.iva.ab.x.T(this.h, j[1]);
        }

        @Override // com.amazon.aps.iva.ce0.l.a
        public final void e(ArrayList arrayList, com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.wc0.d dVar2) {
            com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
            com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
            com.amazon.aps.iva.yb0.j.f(dVar2, FirebaseAnalytics.Param.LOCATION);
            boolean a2 = dVar.a(com.amazon.aps.iva.xd0.d.j);
            com.amazon.aps.iva.qd0.l lVar2 = com.amazon.aps.iva.qd0.l.b;
            if (a2) {
                ArrayList arrayList2 = new ArrayList();
                for (com.amazon.aps.iva.nd0.f fVar : d()) {
                    if (((Boolean) lVar.invoke(fVar)).booleanValue()) {
                        arrayList2.addAll(c(fVar, dVar2));
                    }
                }
                com.amazon.aps.iva.lb0.s.a0(arrayList2, lVar2);
                arrayList.addAll(arrayList2);
            }
            if (dVar.a(com.amazon.aps.iva.xd0.d.i)) {
                ArrayList arrayList3 = new ArrayList();
                for (com.amazon.aps.iva.nd0.f fVar2 : a()) {
                    if (((Boolean) lVar.invoke(fVar2)).booleanValue()) {
                        arrayList3.addAll(b(fVar2, dVar2));
                    }
                }
                com.amazon.aps.iva.lb0.s.a0(arrayList3, lVar2);
                arrayList.addAll(arrayList3);
            }
        }

        @Override // com.amazon.aps.iva.ce0.l.a
        public final Set<com.amazon.aps.iva.nd0.f> f() {
            return this.c.keySet();
        }

        @Override // com.amazon.aps.iva.ce0.l.a
        public final x0 g(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return this.f.invoke(fVar);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<Collection<com.amazon.aps.iva.nd0.f>> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.xb0.a<? extends Collection<com.amazon.aps.iva.nd0.f>> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
            return com.amazon.aps.iva.lb0.x.c1(this.h.invoke());
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends com.amazon.aps.iva.nd0.f>> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Set<? extends com.amazon.aps.iva.nd0.f> invoke() {
            l lVar = l.this;
            Set<com.amazon.aps.iva.nd0.f> n = lVar.n();
            if (n == null) {
                return null;
            }
            return m0.Q(m0.Q(lVar.m(), lVar.c.f()), n);
        }
    }

    public l(com.amazon.aps.iva.ae0.n nVar, List<com.amazon.aps.iva.id0.h> list, List<com.amazon.aps.iva.id0.m> list2, List<com.amazon.aps.iva.id0.q> list3, com.amazon.aps.iva.xb0.a<? extends Collection<com.amazon.aps.iva.nd0.f>> aVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "c");
        com.amazon.aps.iva.yb0.j.f(aVar, "classNames");
        this.b = nVar;
        com.amazon.aps.iva.ae0.l lVar = nVar.a;
        lVar.c.a();
        this.c = new b(list, list2, list3);
        c cVar = new c(aVar);
        com.amazon.aps.iva.de0.l lVar2 = lVar.a;
        this.d = lVar2.g(cVar);
        this.e = lVar2.b(new d());
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> a() {
        return this.c.a();
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return this.c.b(fVar, dVar);
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return this.c.c(fVar, dVar);
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> d() {
        return this.c.d();
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> f() {
        com.amazon.aps.iva.fc0.l<Object> lVar = f[1];
        com.amazon.aps.iva.de0.j jVar = this.e;
        com.amazon.aps.iva.yb0.j.f(jVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "p");
        return (Set) jVar.invoke();
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        if (q(fVar)) {
            return this.b.a.b(l(fVar));
        }
        a aVar = this.c;
        if (aVar.f().contains(fVar)) {
            return aVar.g(fVar);
        }
        return null;
    }

    public abstract void h(ArrayList arrayList, com.amazon.aps.iva.xb0.l lVar);

    public final Collection i(com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.wc0.d dVar2) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        com.amazon.aps.iva.yb0.j.f(dVar2, FirebaseAnalytics.Param.LOCATION);
        ArrayList arrayList = new ArrayList(0);
        if (dVar.a(com.amazon.aps.iva.xd0.d.f)) {
            h(arrayList, lVar);
        }
        a aVar = this.c;
        aVar.e(arrayList, dVar, lVar, dVar2);
        if (dVar.a(com.amazon.aps.iva.xd0.d.l)) {
            for (com.amazon.aps.iva.nd0.f fVar : m()) {
                if (((Boolean) lVar.invoke(fVar)).booleanValue()) {
                    com.amazon.aps.iva.a60.b.i(arrayList, this.b.a.b(l(fVar)));
                }
            }
        }
        if (dVar.a(com.amazon.aps.iva.xd0.d.g)) {
            for (com.amazon.aps.iva.nd0.f fVar2 : aVar.f()) {
                if (((Boolean) lVar.invoke(fVar2)).booleanValue()) {
                    com.amazon.aps.iva.a60.b.i(arrayList, aVar.g(fVar2));
                }
            }
        }
        return com.amazon.aps.iva.a60.b.l(arrayList);
    }

    public void j(com.amazon.aps.iva.nd0.f fVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    public void k(com.amazon.aps.iva.nd0.f fVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    public abstract com.amazon.aps.iva.nd0.b l(com.amazon.aps.iva.nd0.f fVar);

    public final Set<com.amazon.aps.iva.nd0.f> m() {
        return (Set) com.amazon.aps.iva.ab.x.T(this.d, f[0]);
    }

    public abstract Set<com.amazon.aps.iva.nd0.f> n();

    public abstract Set<com.amazon.aps.iva.nd0.f> o();

    public abstract Set<com.amazon.aps.iva.nd0.f> p();

    public boolean q(com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return m().contains(fVar);
    }

    public boolean r(o oVar) {
        return true;
    }
}
