package com.amazon.aps.iva.m0;
/* compiled from: Shapes.kt */
/* loaded from: classes.dex */
public final class y2 {
    public final com.amazon.aps.iva.i0.a a;
    public final com.amazon.aps.iva.i0.a b;
    public final com.amazon.aps.iva.i0.a c;

    public y2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, y2Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, y2Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, y2Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }

    public y2(int i) {
        com.amazon.aps.iva.i0.f fVar = com.amazon.aps.iva.i0.g.a;
        com.amazon.aps.iva.i0.d dVar = new com.amazon.aps.iva.i0.d(4);
        com.amazon.aps.iva.i0.f fVar2 = new com.amazon.aps.iva.i0.f(dVar, dVar, dVar, dVar);
        com.amazon.aps.iva.i0.d dVar2 = new com.amazon.aps.iva.i0.d(4);
        com.amazon.aps.iva.i0.f fVar3 = new com.amazon.aps.iva.i0.f(dVar2, dVar2, dVar2, dVar2);
        com.amazon.aps.iva.i0.d dVar3 = new com.amazon.aps.iva.i0.d(0);
        com.amazon.aps.iva.i0.f fVar4 = new com.amazon.aps.iva.i0.f(dVar3, dVar3, dVar3, dVar3);
        this.a = fVar2;
        this.b = fVar3;
        this.c = fVar4;
    }
}
