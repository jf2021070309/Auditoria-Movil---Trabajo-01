package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.qd0.u;
import com.amazon.aps.iva.xd0.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: TypeIntersectionScope.kt */
/* loaded from: classes4.dex */
public final class o extends com.amazon.aps.iva.xd0.a {
    public final i b;

    /* compiled from: TypeIntersectionScope.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static i a(String str, Collection collection) {
            i iVar;
            com.amazon.aps.iva.yb0.j.f(str, "message");
            com.amazon.aps.iva.yb0.j.f(collection, "types");
            Collection<e0> collection2 = collection;
            ArrayList arrayList = new ArrayList(r.Y(collection2));
            for (e0 e0Var : collection2) {
                arrayList.add(e0Var.l());
            }
            com.amazon.aps.iva.me0.c b = com.amazon.aps.iva.le0.a.b(arrayList);
            int i = b.b;
            if (i != 0) {
                if (i != 1) {
                    iVar = new com.amazon.aps.iva.xd0.b(str, (i[]) b.toArray(new i[0]));
                } else {
                    iVar = (i) b.get(0);
                }
            } else {
                iVar = i.b.b;
            }
            if (b.b <= 1) {
                return iVar;
            }
            return new o(iVar);
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.a, com.amazon.aps.iva.oc0.a> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.oc0.a invoke(com.amazon.aps.iva.oc0.a aVar) {
            com.amazon.aps.iva.oc0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$selectMostSpecificInEachOverridableGroup");
            return aVar2;
        }
    }

    public o(i iVar) {
        this.b = iVar;
    }

    @Override // com.amazon.aps.iva.xd0.a, com.amazon.aps.iva.xd0.i
    public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return u.a(super.b(fVar, dVar), p.h);
    }

    @Override // com.amazon.aps.iva.xd0.a, com.amazon.aps.iva.xd0.i
    public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return u.a(super.c(fVar, dVar), q.h);
    }

    @Override // com.amazon.aps.iva.xd0.a, com.amazon.aps.iva.xd0.l
    public final Collection<com.amazon.aps.iva.oc0.k> e(d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : super.e(dVar, lVar)) {
            if (((com.amazon.aps.iva.oc0.k) obj) instanceof com.amazon.aps.iva.oc0.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return x.L0(arrayList2, u.a(arrayList, b.h));
    }

    @Override // com.amazon.aps.iva.xd0.a
    public final i i() {
        return this.b;
    }
}
