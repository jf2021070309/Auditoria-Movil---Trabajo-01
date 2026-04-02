package com.amazon.aps.iva.i2;
/* compiled from: VisualTransformation.kt */
/* loaded from: classes.dex */
public final class o0 {
    public final com.amazon.aps.iva.c2.b a;
    public final q b;

    public o0(com.amazon.aps.iva.c2.b bVar, q qVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "text");
        com.amazon.aps.iva.yb0.j.f(qVar, "offsetMapping");
        this.a = bVar;
        this.b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, o0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, o0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
