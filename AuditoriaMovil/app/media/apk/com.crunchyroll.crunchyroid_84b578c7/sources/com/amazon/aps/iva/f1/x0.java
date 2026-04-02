package com.amazon.aps.iva.f1;
/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public final class x0 extends s {
    public final long a;

    public x0(long j) {
        this.a = j;
    }

    @Override // com.amazon.aps.iva.f1.s
    public final void a(float f, long j, l0 l0Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(l0Var, "p");
        l0Var.g(1.0f);
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        long j2 = this.a;
        if (!z) {
            j2 = x.b(j2, x.d(j2) * f);
        }
        l0Var.f(j2);
        if (l0Var.k() != null) {
            l0Var.j(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        if (x.c(this.a, ((x0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = x.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) x.i(this.a)) + ')';
    }
}
