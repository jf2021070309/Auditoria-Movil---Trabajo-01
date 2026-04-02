package com.amazon.aps.iva.z;
/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class u0<T> implements z<T> {
    public final float a;
    public final float b;
    public final T c;

    public u0() {
        this(0.0f, 0.0f, null, 7);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (u0Var.a == this.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (u0Var.b == this.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !com.amazon.aps.iva.yb0.j.a(u0Var.c, this.c)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.z.j
    /* renamed from: f */
    public final <V extends p> y1<V> a(l1<T, V> l1Var) {
        V invoke;
        com.amazon.aps.iva.yb0.j.f(l1Var, "converter");
        T t = this.c;
        if (t == null) {
            invoke = null;
        } else {
            invoke = l1Var.a().invoke(t);
        }
        return new y1<>(this.a, this.b, invoke);
    }

    public final int hashCode() {
        int i;
        T t = this.c;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(this.b) + com.amazon.aps.iva.e4.t0.b(this.a, i * 31, 31);
    }

    public u0(float f, float f2, T t) {
        this.a = f;
        this.b = f2;
        this.c = t;
    }

    public /* synthetic */ u0(float f, float f2, Object obj, int i) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
