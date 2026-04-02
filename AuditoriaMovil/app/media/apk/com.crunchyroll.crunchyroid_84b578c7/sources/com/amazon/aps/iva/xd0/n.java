package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.oc0.v0;
import com.amazon.aps.iva.xd0.l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: SubstitutingScope.kt */
/* loaded from: classes4.dex */
public final class n implements i {
    public final i b;
    public final q1 c;
    public HashMap d;
    public final com.amazon.aps.iva.kb0.m e;

    /* compiled from: SubstitutingScope.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Collection<? extends com.amazon.aps.iva.oc0.k>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Collection<? extends com.amazon.aps.iva.oc0.k> invoke() {
            n nVar = n.this;
            return nVar.i(l.a.a(nVar.b, null, 3));
        }
    }

    /* compiled from: SubstitutingScope.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q1> {
        public final /* synthetic */ q1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q1 q1Var) {
            super(0);
            this.h = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q1 invoke() {
            m1 g = this.h.g();
            g.getClass();
            return q1.e(g);
        }
    }

    public n(i iVar, q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(iVar, "workerScope");
        com.amazon.aps.iva.yb0.j.f(q1Var, "givenSubstitutor");
        this.b = iVar;
        com.amazon.aps.iva.kb0.f.b(new b(q1Var));
        m1 g = q1Var.g();
        com.amazon.aps.iva.yb0.j.e(g, "givenSubstitutor.substitution");
        this.c = q1.e(com.amazon.aps.iva.rd0.d.b(g));
        this.e = com.amazon.aps.iva.kb0.f.b(new a());
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> a() {
        return this.b.a();
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return i(this.b.b(fVar, dVar));
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return i(this.b.c(fVar, dVar));
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> d() {
        return this.b.d();
    }

    @Override // com.amazon.aps.iva.xd0.l
    public final Collection<com.amazon.aps.iva.oc0.k> e(d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        return (Collection) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> f() {
        return this.b.f();
    }

    @Override // com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.oc0.h g = this.b.g(fVar, dVar);
        if (g != null) {
            return (com.amazon.aps.iva.oc0.h) h(g);
        }
        return null;
    }

    public final <D extends com.amazon.aps.iva.oc0.k> D h(D d) {
        q1 q1Var = this.c;
        if (q1Var.h()) {
            return d;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        HashMap hashMap = this.d;
        com.amazon.aps.iva.yb0.j.c(hashMap);
        Object obj = hashMap.get(d);
        if (obj == null) {
            if (d instanceof v0) {
                obj = ((v0) d).b(q1Var);
                if (obj != null) {
                    hashMap.put(d, obj);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
        }
        return (D) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends com.amazon.aps.iva.oc0.k> Collection<D> i(Collection<? extends D> collection) {
        if (this.c.h()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        int i = 3;
        if (size >= 3) {
            i = (size / 3) + size + 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((com.amazon.aps.iva.oc0.k) it.next()));
        }
        return linkedHashSet;
    }
}
