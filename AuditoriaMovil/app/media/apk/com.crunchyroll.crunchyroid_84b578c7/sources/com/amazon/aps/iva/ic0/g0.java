package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.fc0.o;
import com.amazon.aps.iva.ic0.h0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Member;
/* compiled from: KProperty2Impl.kt */
/* loaded from: classes4.dex */
public class g0<D, E, V> extends h0<V> implements com.amazon.aps.iva.fc0.o<D, E, V> {
    public final com.amazon.aps.iva.kb0.e<a<D, E, V>> n;

    /* compiled from: KProperty2Impl.kt */
    /* loaded from: classes4.dex */
    public static final class a<D, E, V> extends h0.b<V> implements o.a<D, E, V> {
        public final g0<D, E, V> j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g0<D, E, ? extends V> g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "property");
            this.j = g0Var;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final V invoke(D d, E e) {
            return this.j.n.getValue().call(d, e);
        }

        @Override // com.amazon.aps.iva.ic0.h0.a
        public final h0 s() {
            return this.j;
        }
    }

    /* compiled from: KProperty2Impl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a<D, E, ? extends V>> {
        public final /* synthetic */ g0<D, E, V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(g0<D, E, ? extends V> g0Var) {
            super(0);
            this.h = g0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            return new a(this.h);
        }
    }

    /* compiled from: KProperty2Impl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Member> {
        public final /* synthetic */ g0<D, E, V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(g0<D, E, ? extends V> g0Var) {
            super(0);
            this.h = g0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Member invoke() {
            return this.h.r();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(s sVar, String str, String str2) {
        super(sVar, str, str2, com.amazon.aps.iva.yb0.b.NO_RECEIVER);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(str2, "signature");
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.PUBLICATION;
        this.n = com.amazon.aps.iva.kb0.f.a(gVar, new b(this));
        com.amazon.aps.iva.kb0.f.a(gVar, new c(this));
    }

    @Override // com.amazon.aps.iva.fc0.o
    public final o.a getGetter() {
        return this.n.getValue();
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final V invoke(D d, E e) {
        return this.n.getValue().call(d, e);
    }

    @Override // com.amazon.aps.iva.ic0.h0
    public final h0.b t() {
        return this.n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(s sVar, com.amazon.aps.iva.oc0.n0 n0Var) {
        super(sVar, n0Var);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(n0Var, "descriptor");
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.PUBLICATION;
        this.n = com.amazon.aps.iva.kb0.f.a(gVar, new b(this));
        com.amazon.aps.iva.kb0.f.a(gVar, new c(this));
    }
}
