package com.amazon.aps.iva.z;
/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class k1<T> implements w<T> {
    public final int a;
    public final int b;
    public final x c;

    public k1() {
        this(0, (x) null, 7);
    }

    @Override // com.amazon.aps.iva.z.j
    public final o1 a(l1 l1Var) {
        com.amazon.aps.iva.yb0.j.f(l1Var, "converter");
        return new z1(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (k1Var.a != this.a || k1Var.b != this.b || !com.amazon.aps.iva.yb0.j.a(k1Var.c, this.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public k1(int i, x xVar, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? y.a : xVar);
    }

    @Override // com.amazon.aps.iva.z.w, com.amazon.aps.iva.z.j
    public final s1 a(l1 l1Var) {
        com.amazon.aps.iva.yb0.j.f(l1Var, "converter");
        return new z1(this.a, this.b, this.c);
    }

    public k1(int i, int i2, x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "easing");
        this.a = i;
        this.b = i2;
        this.c = xVar;
    }
}
