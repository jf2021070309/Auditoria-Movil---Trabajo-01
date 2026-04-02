package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.fc0.n;
import com.amazon.aps.iva.ic0.h0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Member;
/* compiled from: KProperty1Impl.kt */
/* loaded from: classes4.dex */
public class f0<T, V> extends h0<V> implements com.amazon.aps.iva.fc0.n<T, V> {
    public final com.amazon.aps.iva.kb0.e<a<T, V>> n;

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes4.dex */
    public static final class a<T, V> extends h0.b<V> implements n.a<T, V> {
        public final f0<T, V> j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(f0<T, ? extends V> f0Var) {
            com.amazon.aps.iva.yb0.j.f(f0Var, "property");
            this.j = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final V invoke(T t) {
            return this.j.get(t);
        }

        @Override // com.amazon.aps.iva.ic0.h0.a
        public final h0 s() {
            return this.j;
        }
    }

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a<T, ? extends V>> {
        public final /* synthetic */ f0<T, V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(f0<T, ? extends V> f0Var) {
            super(0);
            this.h = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            return new a(this.h);
        }
    }

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Member> {
        public final /* synthetic */ f0<T, V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(f0<T, ? extends V> f0Var) {
            super(0);
            this.h = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Member invoke() {
            return this.h.r();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(s sVar, String str, String str2, Object obj) {
        super(sVar, str, str2, obj);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(str2, "signature");
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.PUBLICATION;
        this.n = com.amazon.aps.iva.kb0.f.a(gVar, new b(this));
        com.amazon.aps.iva.kb0.f.a(gVar, new c(this));
    }

    @Override // com.amazon.aps.iva.fc0.n
    public final V get(T t) {
        return this.n.getValue().call(t);
    }

    @Override // com.amazon.aps.iva.fc0.n
    public final n.a getGetter() {
        return this.n.getValue();
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final V invoke(T t) {
        return get(t);
    }

    @Override // com.amazon.aps.iva.ic0.h0
    public final h0.b t() {
        return this.n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(s sVar, com.amazon.aps.iva.oc0.n0 n0Var) {
        super(sVar, n0Var);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(n0Var, "descriptor");
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.PUBLICATION;
        this.n = com.amazon.aps.iva.kb0.f.a(gVar, new b(this));
        com.amazon.aps.iva.kb0.f.a(gVar, new c(this));
    }
}
