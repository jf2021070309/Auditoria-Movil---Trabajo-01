package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.f0.t0;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: LazyListIntervalContent.kt */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.f0.i<h> implements e0 {
    public final t0<h> a;

    public i(com.amazon.aps.iva.xb0.l<? super e0, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, FirebaseAnalytics.Param.CONTENT);
        this.a = new t0<>();
        lVar.invoke(this);
    }

    @Override // com.amazon.aps.iva.e0.e0
    public final void a(int i, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.v0.a aVar) {
        boolean z;
        h hVar = new h(lVar, aVar);
        t0<h> t0Var = this.a;
        t0Var.getClass();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i != 0) {
                com.amazon.aps.iva.f0.d dVar = new com.amazon.aps.iva.f0.d(t0Var.b, i, hVar);
                t0Var.b += i;
                t0Var.a.b(dVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("size should be >=0, but was ", i).toString());
    }
}
