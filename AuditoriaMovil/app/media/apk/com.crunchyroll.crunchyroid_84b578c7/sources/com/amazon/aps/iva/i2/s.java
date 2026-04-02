package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.i2.q;
/* compiled from: VisualTransformation.kt */
/* loaded from: classes.dex */
public final class s implements p0 {
    public final char b;

    public s() {
        this(0);
    }

    @Override // com.amazon.aps.iva.i2.p0
    public final o0 a(com.amazon.aps.iva.c2.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "text");
        return new o0(new com.amazon.aps.iva.c2.b(com.amazon.aps.iva.oe0.m.d0(bVar.b.length(), String.valueOf(this.b)), null, 6), q.a.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        if (this.b == ((s) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Character.hashCode(this.b);
    }

    public s(int i) {
        this.b = (char) 8226;
    }
}
