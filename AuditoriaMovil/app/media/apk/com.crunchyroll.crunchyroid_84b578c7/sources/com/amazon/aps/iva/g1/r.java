package com.amazon.aps.iva.g1;

import com.amazon.aps.iva.b8.a2;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.g6.e;
import com.google.common.util.concurrent.Futures;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements j, com.amazon.aps.iva.t5.g, t.c, p1.e, Deferred.DeferredHandler {
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj) {
        this.b = obj;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        ((e.a) obj).f((Exception) this.b);
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        p1.b bVar = (p1.b) this.b;
        int i2 = p1.i;
        if (tVar.g()) {
            return Futures.immediateVoidFuture();
        }
        bVar.c(dVar, tVar.o);
        p1.A0(dVar, i, new a2(0));
        return Futures.immediateVoidFuture();
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        v vVar = (v) this.b;
        com.amazon.aps.iva.yb0.j.f(vVar, "$function");
        if (d >= vVar.e) {
            return Math.pow((vVar.b * d) + vVar.c, vVar.a) + vVar.f;
        }
        return vVar.g + (vVar.d * d);
    }

    @Override // com.amazon.aps.iva.b8.t.c
    public final void g(q.c cVar, int i) {
        cVar.A();
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        ((AnalyticsDeferredProxy) this.b).lambda$init$2(provider);
    }
}
