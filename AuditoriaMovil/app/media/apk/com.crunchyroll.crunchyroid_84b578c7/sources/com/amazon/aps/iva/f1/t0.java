package com.amazon.aps.iva.f1;
/* compiled from: Shadow.kt */
/* loaded from: classes.dex */
public final class t0 {
    public static final t0 d = new t0();
    public final long a;
    public final long b;
    public final float c;

    public t0(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (!x.c(this.a, t0Var.a) || !com.amazon.aps.iva.e1.c.a(this.b, t0Var.b)) {
            return false;
        }
        if (this.c == t0Var.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = x.h;
        int i2 = com.amazon.aps.iva.e1.c.e;
        return Float.hashCode(this.c) + com.amazon.aps.iva.b8.i.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        sb.append((Object) x.i(this.a));
        sb.append(", offset=");
        sb.append((Object) com.amazon.aps.iva.e1.c.h(this.b));
        sb.append(", blurRadius=");
        return com.amazon.aps.iva.q.c0.b(sb, this.c, ')');
    }

    public t0() {
        this(defpackage.i.e(4278190080L), com.amazon.aps.iva.e1.c.b, 0.0f);
    }
}
