package com.amazon.aps.iva.i0;

import com.amazon.aps.iva.yb0.j;
/* compiled from: CornerSize.kt */
/* loaded from: classes.dex */
public final class d implements b {
    public final float a;

    public d(float f) {
        this.a = f;
    }

    @Override // com.amazon.aps.iva.i0.b
    public final float a(long j, com.amazon.aps.iva.o2.c cVar) {
        j.f(cVar, "density");
        return cVar.P0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && com.amazon.aps.iva.o2.e.a(this.a, ((d) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
