package com.amazon.aps.iva.g8;
/* compiled from: NavOptions.kt */
/* loaded from: classes.dex */
public final class o0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    /* compiled from: NavOptions.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public int a = -1;
        public int b = -1;
        public int c = -1;
        public int d = -1;
    }

    public o0(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !com.amazon.aps.iva.yb0.j.a(o0.class, obj.getClass())) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.a == o0Var.a && this.b == o0Var.b && this.c == o0Var.c) {
            o0Var.getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && this.d == o0Var.d && this.e == o0Var.e && this.f == o0Var.f && this.g == o0Var.g && this.h == o0Var.h && this.i == o0Var.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31) + 0) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }
}
