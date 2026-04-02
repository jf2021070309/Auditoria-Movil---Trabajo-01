package com.amazon.aps.iva.r4;
/* compiled from: Switch.kt */
/* loaded from: classes.dex */
public final class y1 extends com.amazon.aps.iva.ab.a {
    public final com.amazon.aps.iva.x4.a a;
    public final com.amazon.aps.iva.x4.a b;

    public y1(com.amazon.aps.iva.x4.a aVar, com.amazon.aps.iva.x4.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, y1Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, y1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SwitchColorsImpl(thumb=" + this.a + ", track=" + this.b + ')';
    }
}
