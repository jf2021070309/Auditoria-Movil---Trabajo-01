package com.amazon.aps.iva.a0;
/* compiled from: Border.kt */
/* loaded from: classes.dex */
public final class h {
    public com.amazon.aps.iva.f1.i0 a;
    public com.amazon.aps.iva.f1.u b;
    public com.amazon.aps.iva.h1.a c;
    public com.amazon.aps.iva.f1.m0 d;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, hVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, hVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        com.amazon.aps.iva.f1.i0 i0Var = this.a;
        int i = 0;
        if (i0Var == null) {
            hashCode = 0;
        } else {
            hashCode = i0Var.hashCode();
        }
        int i2 = hashCode * 31;
        com.amazon.aps.iva.f1.u uVar = this.b;
        if (uVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        com.amazon.aps.iva.h1.a aVar = this.c;
        if (aVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        com.amazon.aps.iva.f1.m0 m0Var = this.d;
        if (m0Var != null) {
            i = m0Var.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }

    public h(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
