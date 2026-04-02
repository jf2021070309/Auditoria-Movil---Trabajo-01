package com.amazon.aps.iva.z;
/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class g0<T> implements j<T> {
    public final w<T> a;
    public final s0 b;
    public final long c;

    public g0() {
        throw null;
    }

    public g0(w wVar, s0 s0Var, long j) {
        this.a = wVar;
        this.b = s0Var;
        this.c = j;
    }

    @Override // com.amazon.aps.iva.z.j
    public final <V extends p> o1<V> a(l1<T, V> l1Var) {
        com.amazon.aps.iva.yb0.j.f(l1Var, "converter");
        return new w1(this.a.a((l1) l1Var), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (!com.amazon.aps.iva.yb0.j.a(g0Var.a, this.a) || g0Var.b != this.b) {
            return false;
        }
        if (g0Var.c == this.c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Long.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }
}
