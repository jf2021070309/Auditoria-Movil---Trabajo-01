package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.fc0.h;
import com.amazon.aps.iva.ic0.h0;
/* compiled from: KProperty2Impl.kt */
/* loaded from: classes4.dex */
public final class z<D, E, V> extends g0<D, E, V> implements com.amazon.aps.iva.fc0.h {
    public final com.amazon.aps.iva.kb0.e<a<D, E, V>> o;

    /* compiled from: KProperty2Impl.kt */
    /* loaded from: classes4.dex */
    public static final class a<D, E, V> extends h0.c<V> implements com.amazon.aps.iva.xb0.q {
        public final z<D, E, V> j;

        public a(z<D, E, V> zVar) {
            com.amazon.aps.iva.yb0.j.f(zVar, "property");
            this.j = zVar;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            this.j.o.getValue().call(obj, obj2, obj3);
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.ic0.h0.a
        public final h0 s() {
            return this.j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s sVar, com.amazon.aps.iva.oc0.n0 n0Var) {
        super(sVar, n0Var);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(n0Var, "descriptor");
        this.o = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new a0(this));
    }

    @Override // com.amazon.aps.iva.fc0.h
    public final h.a getSetter() {
        return this.o.getValue();
    }
}
