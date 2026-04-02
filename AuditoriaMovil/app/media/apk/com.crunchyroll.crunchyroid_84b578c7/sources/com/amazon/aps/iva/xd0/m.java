package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
/* compiled from: StaticScopeForKotlinEnum.kt */
/* loaded from: classes4.dex */
public final class m extends j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {e0.c(new v(e0.a(m.class), "functions", "getFunctions()Ljava/util/List;")), e0.c(new v(e0.a(m.class), "properties", "getProperties()Ljava/util/List;"))};
    public final com.amazon.aps.iva.oc0.e b;
    public final com.amazon.aps.iva.de0.i c;
    public final com.amazon.aps.iva.de0.i d;

    /* compiled from: StaticScopeForKotlinEnum.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends s0>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends s0> invoke() {
            m mVar = m.this;
            return f1.K(com.amazon.aps.iva.qd0.h.f(mVar.b), com.amazon.aps.iva.qd0.h.g(mVar.b));
        }
    }

    /* compiled from: StaticScopeForKotlinEnum.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends n0>> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends n0> invoke() {
            return f1.L(com.amazon.aps.iva.qd0.h.e(m.this.b));
        }
    }

    public m(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        com.amazon.aps.iva.yb0.j.f(eVar, "containingClass");
        this.b = eVar;
        eVar.getKind();
        com.amazon.aps.iva.oc0.f fVar = com.amazon.aps.iva.oc0.f.CLASS;
        this.c = lVar.g(new a());
        this.d = lVar.g(new b());
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.fc0.l<Object> lVar = e[0];
        com.amazon.aps.iva.me0.c cVar = new com.amazon.aps.iva.me0.c();
        for (Object obj : (List) x.T(this.c, lVar)) {
            if (com.amazon.aps.iva.yb0.j.a(((s0) obj).getName(), fVar)) {
                cVar.add(obj);
            }
        }
        return cVar;
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.fc0.l<Object> lVar = e[1];
        com.amazon.aps.iva.me0.c cVar = new com.amazon.aps.iva.me0.c();
        for (Object obj : (List) x.T(this.d, lVar)) {
            if (com.amazon.aps.iva.yb0.j.a(((n0) obj).getName(), fVar)) {
                cVar.add(obj);
            }
        }
        return cVar;
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final Collection e(d dVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = e;
        com.amazon.aps.iva.fc0.l<Object> lVar2 = lVarArr[0];
        return com.amazon.aps.iva.lb0.x.L0((List) x.T(this.d, lVarArr[1]), (List) x.T(this.c, lVar2));
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return null;
    }
}
