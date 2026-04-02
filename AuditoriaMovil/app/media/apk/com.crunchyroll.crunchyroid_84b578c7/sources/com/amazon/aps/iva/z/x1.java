package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class x1<V extends p> implements s1<V> {
    public final Map<Integer, com.amazon.aps.iva.kb0.j<V, x>> a;
    public final int b;
    public final int c = 0;
    public V d;
    public V e;

    public x1(int i, LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
        this.b = i;
    }

    @Override // com.amazon.aps.iva.z.s1
    public final int c() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.z.s1
    public final int d() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V e(long j, V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        int k = (int) com.amazon.aps.iva.aq.j.k((j / 1000000) - c(), d());
        Integer valueOf = Integer.valueOf(k);
        Map<Integer, com.amazon.aps.iva.kb0.j<V, x>> map = this.a;
        if (map.containsKey(valueOf)) {
            return (V) ((com.amazon.aps.iva.kb0.j) com.amazon.aps.iva.lb0.i0.S(Integer.valueOf(k), map)).b;
        }
        int i = this.b;
        if (k >= i) {
            return v2;
        }
        if (k <= 0) {
            return v;
        }
        x xVar = y.b;
        V v4 = v;
        int i2 = 0;
        for (Map.Entry<Integer, com.amazon.aps.iva.kb0.j<V, x>> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            com.amazon.aps.iva.kb0.j<V, x> value = entry.getValue();
            if (k > intValue && intValue >= i2) {
                v4 = value.b;
                xVar = value.c;
                i2 = intValue;
            } else if (k < intValue && intValue <= i) {
                v2 = value.b;
                i = intValue;
            }
        }
        float a = xVar.a((k - i2) / (i - i2));
        if (this.d == null) {
            this.d = (V) com.amazon.aps.iva.e.z.J(v);
            this.e = (V) com.amazon.aps.iva.e.z.J(v);
        }
        int b = v4.b();
        for (int i3 = 0; i3 < b; i3++) {
            V v5 = this.d;
            if (v5 != null) {
                float a2 = v4.a(i3);
                float a3 = v2.a(i3);
                m1 m1Var = n1.a;
                v5.e((a3 * a) + ((1 - a) * a2), i3);
            } else {
                com.amazon.aps.iva.yb0.j.m("valueVector");
                throw null;
            }
        }
        V v6 = this.d;
        if (v6 != null) {
            return v6;
        }
        com.amazon.aps.iva.yb0.j.m("valueVector");
        throw null;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V f(long j, V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        long k = com.amazon.aps.iva.aq.j.k((j / 1000000) - c(), d());
        if (k <= 0) {
            return v3;
        }
        p r = com.amazon.aps.iva.ab.t.r(this, k - 1, v, v2, v3);
        p r2 = com.amazon.aps.iva.ab.t.r(this, k, v, v2, v3);
        if (this.d == null) {
            this.d = (V) com.amazon.aps.iva.e.z.J(v);
            this.e = (V) com.amazon.aps.iva.e.z.J(v);
        }
        int b = r.b();
        for (int i = 0; i < b; i++) {
            V v4 = this.e;
            if (v4 != null) {
                v4.e((r.a(i) - r2.a(i)) * 1000.0f, i);
            } else {
                com.amazon.aps.iva.yb0.j.m("velocityVector");
                throw null;
            }
        }
        V v5 = this.e;
        if (v5 != null) {
            return v5;
        }
        com.amazon.aps.iva.yb0.j.m("velocityVector");
        throw null;
    }
}
