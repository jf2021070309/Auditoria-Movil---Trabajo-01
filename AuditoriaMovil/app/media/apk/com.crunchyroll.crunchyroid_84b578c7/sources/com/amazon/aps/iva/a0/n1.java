package com.amazon.aps.iva.a0;
/* compiled from: OverscrollConfiguration.kt */
/* loaded from: classes.dex */
public final class n1 {
    public final long a;
    public final com.amazon.aps.iva.d0.o1 b;

    public n1() {
        long e = defpackage.i.e(4284900966L);
        com.amazon.aps.iva.d0.p1 a = androidx.compose.foundation.layout.d.a(0.0f, 3);
        this.a = e;
        this.b = a;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(n1.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        n1 n1Var = (n1) obj;
        if (com.amazon.aps.iva.f1.x.c(this.a, n1Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, n1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = com.amazon.aps.iva.f1.x.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) com.amazon.aps.iva.f1.x.i(this.a)) + ", drawPadding=" + this.b + ')';
    }
}
