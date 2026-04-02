package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: Animation.kt */
/* loaded from: classes.dex */
public final class z0<T, V extends p> implements f<T, V> {
    public final o1<V> a;
    public final l1<T, V> b;
    public final T c;
    public final T d;
    public final V e;
    public final V f;
    public final V g;
    public final long h;
    public final V i;

    public z0() {
        throw null;
    }

    public /* synthetic */ z0(j jVar, l1 l1Var, Object obj, Object obj2) {
        this(jVar, l1Var, obj, obj2, null);
    }

    @Override // com.amazon.aps.iva.z.f
    public final boolean a() {
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.z.f
    public final V b(long j) {
        if (!c(j)) {
            return this.a.f(j, this.e, this.f, this.g);
        }
        return this.i;
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
            V e = this.a.e(j, this.e, this.f, this.g);
            int b = e.b();
            for (int i = 0; i < b; i++) {
                if (!(!Float.isNaN(e.a(i)))) {
                    throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + e + ". Animation: " + this + ", playTimeNanos: " + j).toString());
                }
            }
            return this.b.b().invoke(e);
        }
        return this.d;
    }

    @Override // com.amazon.aps.iva.z.f
    public final T g() {
        return this.d;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.c + " -> " + this.d + ",initial velocity: " + this.g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.a;
    }

    public z0(j<T> jVar, l1<T, V> l1Var, T t, T t2, V v) {
        V v2;
        com.amazon.aps.iva.yb0.j.f(jVar, "animationSpec");
        com.amazon.aps.iva.yb0.j.f(l1Var, "typeConverter");
        o1<V> a = jVar.a(l1Var);
        com.amazon.aps.iva.yb0.j.f(a, "animationSpec");
        this.a = a;
        this.b = l1Var;
        this.c = t;
        this.d = t2;
        V invoke = l1Var.a().invoke(t);
        this.e = invoke;
        V invoke2 = l1Var.a().invoke(t2);
        this.f = invoke2;
        if (v != null) {
            v2 = (V) com.amazon.aps.iva.e.z.n(v);
        } else {
            v2 = (V) com.amazon.aps.iva.e.z.J(l1Var.a().invoke(t));
        }
        this.g = v2;
        this.h = a.b(invoke, invoke2, v2);
        this.i = a.g(invoke, invoke2, v2);
    }
}
