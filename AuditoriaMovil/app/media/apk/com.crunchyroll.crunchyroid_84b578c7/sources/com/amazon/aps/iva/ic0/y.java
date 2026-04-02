package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.fc0.h;
import com.amazon.aps.iva.fc0.j;
import com.amazon.aps.iva.ic0.h0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: KProperty1Impl.kt */
/* loaded from: classes4.dex */
public final class y<T, V> extends f0<T, V> implements com.amazon.aps.iva.fc0.j<T, V> {
    public final com.amazon.aps.iva.kb0.e<a<T, V>> o;

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes4.dex */
    public static final class a<T, V> extends h0.c<V> implements j.a<T, V> {
        public final y<T, V> j;

        public a(y<T, V> yVar) {
            com.amazon.aps.iva.yb0.j.f(yVar, "property");
            this.j = yVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Object obj, Object obj2) {
            this.j.o.getValue().call(obj, obj2);
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.ic0.h0.a
        public final h0 s() {
            return this.j;
        }
    }

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a<T, V>> {
        public final /* synthetic */ y<T, V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y<T, V> yVar) {
            super(0);
            this.h = yVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            return new a(this.h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar, String str, String str2, Object obj) {
        super(sVar, str, str2, obj);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(str2, "signature");
        this.o = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new b(this));
    }

    @Override // com.amazon.aps.iva.fc0.h
    public final h.a getSetter() {
        return this.o.getValue();
    }

    @Override // com.amazon.aps.iva.fc0.j, com.amazon.aps.iva.fc0.h
    public final j.a getSetter() {
        return this.o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar, com.amazon.aps.iva.oc0.n0 n0Var) {
        super(sVar, n0Var);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(n0Var, "descriptor");
        this.o = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new b(this));
    }
}
