package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class w1<V extends p> implements o1<V> {
    public final s1<V> a;
    public final s0 b;
    public final long c;
    public final long d;

    public w1(s1 s1Var, s0 s0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(s1Var, "animation");
        com.amazon.aps.iva.yb0.j.f(s0Var, "repeatMode");
        this.a = s1Var;
        this.b = s0Var;
        this.c = (s1Var.d() + s1Var.c()) * 1000000;
        this.d = j * 1000000;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final boolean a() {
        return true;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final long b(V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        return Long.MAX_VALUE;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V e(long j, V v, V v2, V v3) {
        V v4;
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        s1<V> s1Var = this.a;
        long h = h(j);
        long j2 = this.d;
        long j3 = this.c;
        if (j + j2 > j3) {
            v4 = f(j3 - j2, v, v3, v2);
        } else {
            v4 = v3;
        }
        return s1Var.e(h, v, v2, v4);
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V f(long j, V v, V v2, V v3) {
        V v4;
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        s1<V> s1Var = this.a;
        long h = h(j);
        long j2 = this.d;
        long j3 = this.c;
        if (j + j2 > j3) {
            v4 = f(j3 - j2, v, v3, v2);
        } else {
            v4 = v3;
        }
        return s1Var.f(h, v, v2, v4);
    }

    public final long h(long j) {
        long j2 = this.d;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.c;
        long j5 = j3 / j4;
        if (this.b != s0.Restart && j5 % 2 != 0) {
            return ((j5 + 1) * j4) - j3;
        }
        return j3 - (j5 * j4);
    }
}
