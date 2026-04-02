package com.amazon.aps.iva.a0;
/* compiled from: Magnifier.kt */
/* loaded from: classes.dex */
public final class f1 {
    public static final f1 g;
    public static final f1 h;
    public final boolean a;
    public final long b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;

    static {
        long j = com.amazon.aps.iva.o2.g.c;
        g = new f1(false, j, Float.NaN, Float.NaN, true, false);
        h = new f1(true, j, Float.NaN, Float.NaN, true, false);
    }

    public f1(boolean z, long j, float f, float f2, boolean z2, boolean z3) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (this.a == f1Var.a && com.amazon.aps.iva.o2.g.a(this.b, f1Var.b) && com.amazon.aps.iva.o2.e.a(this.c, f1Var.c) && com.amazon.aps.iva.o2.e.a(this.d, f1Var.d) && this.e == f1Var.e && this.f == f1Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = com.amazon.aps.iva.o2.g.d;
        return Boolean.hashCode(this.f) + r.b(this.e, com.amazon.aps.iva.e4.t0.b(this.d, com.amazon.aps.iva.e4.t0.b(this.c, com.amazon.aps.iva.b8.i.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        if (this.a) {
            return "MagnifierStyle.TextDefault";
        }
        StringBuilder sb = new StringBuilder("MagnifierStyle(size=");
        sb.append((Object) com.amazon.aps.iva.o2.g.d(this.b));
        sb.append(", cornerRadius=");
        sb.append((Object) com.amazon.aps.iva.o2.e.b(this.c));
        sb.append(", elevation=");
        sb.append((Object) com.amazon.aps.iva.o2.e.b(this.d));
        sb.append(", clippingEnabled=");
        sb.append(this.e);
        sb.append(", fishEyeEnabled=");
        return defpackage.a.b(sb, this.f, ')');
    }
}
