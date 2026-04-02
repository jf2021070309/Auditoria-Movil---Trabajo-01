package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: DecayAnimationSpec.kt */
/* loaded from: classes.dex */
public final class v1<V extends p> implements r1<V> {
    public final b0 a;
    public V b;
    public V c;
    public V d;
    public final float e;

    public v1(b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "floatDecaySpec");
        this.a = b0Var;
        b0Var.a();
        this.e = 0.0f;
    }

    @Override // com.amazon.aps.iva.z.r1
    public final float a() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.z.r1
    public final V b(long j, V v, V v2) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "initialVelocity");
        if (this.c == null) {
            this.c = (V) com.amazon.aps.iva.e.z.J(v);
        }
        V v3 = this.c;
        if (v3 != null) {
            int b = v3.b();
            for (int i = 0; i < b; i++) {
                V v4 = this.c;
                if (v4 != null) {
                    v.a(i);
                    v4.e(this.a.b(v2.a(i), j), i);
                } else {
                    com.amazon.aps.iva.yb0.j.m("velocityVector");
                    throw null;
                }
            }
            V v5 = this.c;
            if (v5 != null) {
                return v5;
            }
            com.amazon.aps.iva.yb0.j.m("velocityVector");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("velocityVector");
        throw null;
    }

    @Override // com.amazon.aps.iva.z.r1
    public final V c(long j, V v, V v2) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "initialVelocity");
        if (this.b == null) {
            this.b = (V) com.amazon.aps.iva.e.z.J(v);
        }
        V v3 = this.b;
        if (v3 != null) {
            int b = v3.b();
            for (int i = 0; i < b; i++) {
                V v4 = this.b;
                if (v4 != null) {
                    v4.e(this.a.c(v.a(i), v2.a(i), j), i);
                } else {
                    com.amazon.aps.iva.yb0.j.m("valueVector");
                    throw null;
                }
            }
            V v5 = this.b;
            if (v5 != null) {
                return v5;
            }
            com.amazon.aps.iva.yb0.j.m("valueVector");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("valueVector");
        throw null;
    }

    public final long d(V v, V v2) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "initialVelocity");
        if (this.c == null) {
            this.c = (V) com.amazon.aps.iva.e.z.J(v);
        }
        V v3 = this.c;
        if (v3 != null) {
            int b = v3.b();
            long j = 0;
            for (int i = 0; i < b; i++) {
                v.a(i);
                j = Math.max(j, this.a.d(v2.a(i)));
            }
            return j;
        }
        com.amazon.aps.iva.yb0.j.m("velocityVector");
        throw null;
    }

    public final V e(V v, V v2) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "initialVelocity");
        if (this.d == null) {
            this.d = (V) com.amazon.aps.iva.e.z.J(v);
        }
        V v3 = this.d;
        if (v3 != null) {
            int b = v3.b();
            for (int i = 0; i < b; i++) {
                V v4 = this.d;
                if (v4 != null) {
                    v4.e(this.a.e(v.a(i), v2.a(i)), i);
                } else {
                    com.amazon.aps.iva.yb0.j.m("targetVector");
                    throw null;
                }
            }
            V v5 = this.d;
            if (v5 != null) {
                return v5;
            }
            com.amazon.aps.iva.yb0.j.m("targetVector");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("targetVector");
        throw null;
    }
}
