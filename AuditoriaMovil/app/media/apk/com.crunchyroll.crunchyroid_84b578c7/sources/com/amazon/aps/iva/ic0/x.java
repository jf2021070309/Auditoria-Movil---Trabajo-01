package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.fc0.h;
import com.amazon.aps.iva.fc0.i;
import com.amazon.aps.iva.ic0.h0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: KProperty0Impl.kt */
/* loaded from: classes4.dex */
public final class x<V> extends e0<V> implements com.amazon.aps.iva.fc0.i<V> {
    public final com.amazon.aps.iva.kb0.e<a<V>> p;

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes4.dex */
    public static final class a<R> extends h0.c<R> implements i.a<R> {
        public final x<R> j;

        public a(x<R> xVar) {
            com.amazon.aps.iva.yb0.j.f(xVar, "property");
            this.j = xVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
            this.j.set(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.ic0.h0.a
        public final h0 s() {
            return this.j;
        }
    }

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a<V>> {
        public final /* synthetic */ x<V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x<V> xVar) {
            super(0);
            this.h = xVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            return new a(this.h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s sVar, com.amazon.aps.iva.oc0.n0 n0Var) {
        super(sVar, n0Var);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(n0Var, "descriptor");
        this.p = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new b(this));
    }

    @Override // com.amazon.aps.iva.fc0.h
    public final h.a getSetter() {
        return this.p.getValue();
    }

    @Override // com.amazon.aps.iva.fc0.i
    public final void set(V v) {
        this.p.getValue().call(v);
    }

    @Override // com.amazon.aps.iva.fc0.i, com.amazon.aps.iva.fc0.h
    public final i.a getSetter() {
        return this.p.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s sVar, String str, String str2, Object obj) {
        super(sVar, str, str2, obj);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(str2, "signature");
        this.p = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new b(this));
    }
}
