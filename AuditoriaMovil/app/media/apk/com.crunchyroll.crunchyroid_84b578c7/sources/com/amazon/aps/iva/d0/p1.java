package com.amazon.aps.iva.d0;
/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class p1 implements o1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public p1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // com.amazon.aps.iva.d0.o1
    public final float a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.d0.o1
    public final float b(com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
            return this.a;
        }
        return this.c;
    }

    @Override // com.amazon.aps.iva.d0.o1
    public final float c(com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
            return this.c;
        }
        return this.a;
    }

    @Override // com.amazon.aps.iva.d0.o1
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (!com.amazon.aps.iva.o2.e.a(this.a, p1Var.a) || !com.amazon.aps.iva.o2.e.a(this.b, p1Var.b) || !com.amazon.aps.iva.o2.e.a(this.c, p1Var.c) || !com.amazon.aps.iva.o2.e.a(this.d, p1Var.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + com.amazon.aps.iva.e4.t0.b(this.c, com.amazon.aps.iva.e4.t0.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) com.amazon.aps.iva.o2.e.b(this.a)) + ", top=" + ((Object) com.amazon.aps.iva.o2.e.b(this.b)) + ", end=" + ((Object) com.amazon.aps.iva.o2.e.b(this.c)) + ", bottom=" + ((Object) com.amazon.aps.iva.o2.e.b(this.d)) + ')';
    }
}
