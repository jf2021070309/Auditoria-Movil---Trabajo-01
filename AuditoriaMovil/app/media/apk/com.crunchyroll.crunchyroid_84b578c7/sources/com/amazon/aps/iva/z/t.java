package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: Animation.kt */
/* loaded from: classes.dex */
public final class t<T, V extends p> implements f<T, V> {
    public final r1<V> a;
    public final l1<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;

    public t(u<T> uVar, l1<T, V> l1Var, T t, V v) {
        com.amazon.aps.iva.yb0.j.f(uVar, "animationSpec");
        com.amazon.aps.iva.yb0.j.f(l1Var, "typeConverter");
        com.amazon.aps.iva.yb0.j.f(v, "initialVelocityVector");
        v1 a = uVar.a(l1Var);
        com.amazon.aps.iva.yb0.j.f(a, "animationSpec");
        this.a = a;
        this.b = l1Var;
        this.c = t;
        V invoke = l1Var.a().invoke(t);
        this.d = invoke;
        this.e = (V) com.amazon.aps.iva.e.z.n(v);
        this.g = l1Var.b().invoke((V) a.e(invoke, v));
        long d = a.d(invoke, v);
        this.h = d;
        V v2 = (V) com.amazon.aps.iva.e.z.n(a.b(d, invoke, v));
        this.f = v2;
        int b = v2.b();
        for (int i = 0; i < b; i++) {
            V v3 = this.f;
            v3.e(com.amazon.aps.iva.aq.j.i(v3.a(i), -this.a.a(), this.a.a()), i);
        }
    }

    @Override // com.amazon.aps.iva.z.f
    public final boolean a() {
        return false;
    }

    @Override // com.amazon.aps.iva.z.f
    public final V b(long j) {
        if (!c(j)) {
            return this.a.b(j, this.d, this.e);
        }
        return this.f;
    }

    @Override // com.amazon.aps.iva.z.f
    public final long d() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.z.f
    public final l1<T, V> e() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.z.f
    public final T f(long j) {
        if (!c(j)) {
            return this.b.b().invoke(this.a.c(j, this.d, this.e));
        }
        return this.g;
    }

    @Override // com.amazon.aps.iva.z.f
    public final T g() {
        return this.g;
    }
}
