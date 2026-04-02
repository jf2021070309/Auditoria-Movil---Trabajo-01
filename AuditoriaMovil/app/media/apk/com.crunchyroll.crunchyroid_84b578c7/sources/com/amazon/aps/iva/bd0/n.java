package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.bd0.b;
import com.amazon.aps.iva.ed0.b0;
import com.amazon.aps.iva.gd0.r;
import com.amazon.aps.iva.hd0.a;
import com.amazon.aps.iva.xc0.q;
import com.amazon.aps.iva.xd0.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: LazyJavaPackageScope.kt */
/* loaded from: classes4.dex */
public final class n extends y {
    public final com.amazon.aps.iva.ed0.t n;
    public final m o;
    public final com.amazon.aps.iva.de0.j<Set<String>> p;
    public final com.amazon.aps.iva.de0.h<a, com.amazon.aps.iva.oc0.e> q;

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final com.amazon.aps.iva.nd0.f a;
        public final com.amazon.aps.iva.ed0.g b;

        public a(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.ed0.g gVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.a = fVar;
            this.b = gVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (com.amazon.aps.iva.yb0.j.a(this.a, ((a) obj).a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes4.dex */
    public static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        /* loaded from: classes4.dex */
        public static final class a extends b {
            public final com.amazon.aps.iva.oc0.e a;

            public a(com.amazon.aps.iva.oc0.e eVar) {
                this.a = eVar;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: com.amazon.aps.iva.bd0.n$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0141b extends b {
            public static final C0141b a = new C0141b();
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* loaded from: classes4.dex */
        public static final class c extends b {
            public static final c a = new c();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a, com.amazon.aps.iva.oc0.e> {
        public final /* synthetic */ n h;
        public final /* synthetic */ com.amazon.aps.iva.la0.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.la0.c cVar, n nVar) {
            super(1);
            this.h = nVar;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.oc0.e invoke(a aVar) {
            r.a.b b;
            com.amazon.aps.iva.gd0.t tVar;
            com.amazon.aps.iva.nd0.b bVar;
            Object obj;
            com.amazon.aps.iva.oc0.e a;
            com.amazon.aps.iva.nd0.c cVar;
            a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "request");
            n nVar = this.h;
            com.amazon.aps.iva.nd0.b bVar2 = new com.amazon.aps.iva.nd0.b(nVar.o.f, aVar2.a);
            com.amazon.aps.iva.la0.c cVar2 = this.i;
            com.amazon.aps.iva.ed0.g gVar = aVar2.b;
            if (gVar != null) {
                b = ((com.amazon.aps.iva.ad0.c) cVar2.a).c.a(gVar, n.v(nVar));
            } else {
                b = ((com.amazon.aps.iva.ad0.c) cVar2.a).c.b(bVar2, n.v(nVar));
            }
            com.amazon.aps.iva.gd0.t tVar2 = null;
            if (b != null) {
                tVar = b.a;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                bVar = tVar.i();
            } else {
                bVar = null;
            }
            if (bVar != null && (bVar.k() || bVar.c)) {
                return null;
            }
            if (tVar == null) {
                obj = b.C0141b.a;
            } else if (tVar.b().a == a.EnumC0334a.CLASS) {
                com.amazon.aps.iva.gd0.l lVar = ((com.amazon.aps.iva.ad0.c) nVar.b.a).d;
                lVar.getClass();
                com.amazon.aps.iva.ae0.h g = lVar.g(tVar);
                if (g == null) {
                    a = null;
                } else {
                    a = lVar.c().t.a(tVar.i(), g);
                }
                if (a != null) {
                    obj = new b.a(a);
                } else {
                    obj = b.C0141b.a;
                }
            } else {
                obj = b.c.a;
            }
            if (obj instanceof b.a) {
                return ((b.a) obj).a;
            }
            if (obj instanceof b.c) {
                return null;
            }
            if (obj instanceof b.C0141b) {
                if (gVar == null) {
                    com.amazon.aps.iva.xc0.q qVar = ((com.amazon.aps.iva.ad0.c) cVar2.a).b;
                    if (b instanceof r.a.C0304a) {
                        r.a.C0304a c0304a = (r.a.C0304a) b;
                    }
                    gVar = qVar.c(new q.a(bVar2, null, 4));
                }
                if (gVar != null) {
                    gVar.K();
                }
                if (b0.BINARY == null) {
                    StringBuilder sb = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                    sb.append(gVar);
                    sb.append("\nClassId: ");
                    sb.append(bVar2);
                    sb.append("\nfindKotlinClass(JavaClass) = ");
                    com.amazon.aps.iva.gd0.r rVar = ((com.amazon.aps.iva.ad0.c) cVar2.a).c;
                    com.amazon.aps.iva.md0.e v = n.v(nVar);
                    com.amazon.aps.iva.yb0.j.f(rVar, "<this>");
                    com.amazon.aps.iva.yb0.j.f(gVar, "javaClass");
                    com.amazon.aps.iva.yb0.j.f(v, "jvmMetadataVersion");
                    r.a.b a2 = rVar.a(gVar, v);
                    if (a2 != null) {
                        tVar2 = a2.a;
                    }
                    sb.append(tVar2);
                    sb.append("\nfindKotlinClass(ClassId) = ");
                    sb.append(com.amazon.aps.iva.gd0.s.a(((com.amazon.aps.iva.ad0.c) cVar2.a).c, bVar2, n.v(nVar)));
                    sb.append('\n');
                    throw new IllegalStateException(sb.toString());
                }
                if (gVar != null) {
                    cVar = gVar.c();
                } else {
                    cVar = null;
                }
                if (cVar == null || cVar.d()) {
                    return null;
                }
                com.amazon.aps.iva.nd0.c e = cVar.e();
                m mVar = nVar.o;
                if (!com.amazon.aps.iva.yb0.j.a(e, mVar.f)) {
                    return null;
                }
                e eVar = new e(cVar2, mVar, gVar, null);
                ((com.amazon.aps.iva.ad0.c) cVar2.a).s.a(eVar);
                return eVar;
            }
            throw new com.amazon.aps.iva.kb0.h();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Set<? extends String>> {
        public final /* synthetic */ com.amazon.aps.iva.la0.c h;
        public final /* synthetic */ n i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.la0.c cVar, n nVar) {
            super(0);
            this.h = cVar;
            this.i = nVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Set<? extends String> invoke() {
            ((com.amazon.aps.iva.ad0.c) this.h.a).b.a(this.i.o.f);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.t tVar, m mVar) {
        super(cVar);
        com.amazon.aps.iva.yb0.j.f(tVar, "jPackage");
        com.amazon.aps.iva.yb0.j.f(mVar, "ownerDescriptor");
        this.n = tVar;
        this.o = mVar;
        this.p = cVar.b().b(new d(cVar, this));
        this.q = cVar.b().h(new c(cVar, this));
    }

    public static final com.amazon.aps.iva.md0.e v(n nVar) {
        return com.amazon.aps.iva.aq.j.E(((com.amazon.aps.iva.ad0.c) nVar.b.a).d.c().c);
    }

    @Override // com.amazon.aps.iva.bd0.o, com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return com.amazon.aps.iva.lb0.z.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002b A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.bd0.o, com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<com.amazon.aps.iva.oc0.k> e(com.amazon.aps.iva.xd0.d r5, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            com.amazon.aps.iva.yb0.j.f(r5, r0)
            java.lang.String r0 = "nameFilter"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            com.amazon.aps.iva.xd0.d$a r0 = com.amazon.aps.iva.xd0.d.c
            int r0 = com.amazon.aps.iva.xd0.d.l
            int r1 = com.amazon.aps.iva.xd0.d.e
            r0 = r0 | r1
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L1a
            com.amazon.aps.iva.lb0.z r5 = com.amazon.aps.iva.lb0.z.b
            goto L5d
        L1a:
            com.amazon.aps.iva.de0.i<java.util.Collection<com.amazon.aps.iva.oc0.k>> r5 = r4.d
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r5.next()
            r2 = r1
            com.amazon.aps.iva.oc0.k r2 = (com.amazon.aps.iva.oc0.k) r2
            boolean r3 = r2 instanceof com.amazon.aps.iva.oc0.e
            if (r3 == 0) goto L55
            com.amazon.aps.iva.oc0.e r2 = (com.amazon.aps.iva.oc0.e) r2
            com.amazon.aps.iva.nd0.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            com.amazon.aps.iva.yb0.j.e(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L55
            r2 = 1
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L2b
            r0.add(r1)
            goto L2b
        L5c:
            r5 = r0
        L5d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bd0.n.e(com.amazon.aps.iva.xd0.d, com.amazon.aps.iva.xb0.l):java.util.Collection");
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return w(fVar, null);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final Set h(com.amazon.aps.iva.xd0.d dVar, i.a.C0852a c0852a) {
        com.amazon.aps.iva.nd0.f name;
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        if (!dVar.a(com.amazon.aps.iva.xd0.d.e)) {
            return com.amazon.aps.iva.lb0.b0.b;
        }
        Set<String> invoke = this.p.invoke();
        com.amazon.aps.iva.xb0.l lVar = c0852a;
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            for (String str : invoke) {
                hashSet.add(com.amazon.aps.iva.nd0.f.h(str));
            }
            return hashSet;
        }
        if (c0852a == null) {
            lVar = com.amazon.aps.iva.me0.b.a;
        }
        this.n.F(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        com.amazon.aps.iva.lb0.y yVar = com.amazon.aps.iva.lb0.y.b;
        while (yVar.hasNext()) {
            com.amazon.aps.iva.ed0.g gVar = (com.amazon.aps.iva.ed0.g) yVar.next();
            gVar.K();
            if (b0.SOURCE == null) {
                name = null;
            } else {
                name = gVar.getName();
            }
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final Set i(com.amazon.aps.iva.xd0.d dVar, i.a.C0852a c0852a) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        return com.amazon.aps.iva.lb0.b0.b;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final com.amazon.aps.iva.bd0.b k() {
        return b.a.a;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final void m(LinkedHashSet linkedHashSet, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final Set o(com.amazon.aps.iva.xd0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        return com.amazon.aps.iva.lb0.b0.b;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final com.amazon.aps.iva.oc0.k q() {
        return this.o;
    }

    public final com.amazon.aps.iva.oc0.e w(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.ed0.g gVar) {
        boolean z;
        com.amazon.aps.iva.nd0.f fVar2 = com.amazon.aps.iva.nd0.h.a;
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String b2 = fVar.b();
        com.amazon.aps.iva.yb0.j.e(b2, "name.asString()");
        boolean z2 = true;
        if (b2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || fVar.c) {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        Set<String> invoke = this.p.invoke();
        if (gVar == null && invoke != null && !invoke.contains(fVar.b())) {
            return null;
        }
        return this.q.invoke(new a(fVar, gVar));
    }
}
