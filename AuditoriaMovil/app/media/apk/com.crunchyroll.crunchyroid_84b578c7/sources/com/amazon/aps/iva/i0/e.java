package com.amazon.aps.iva.i0;

import com.amazon.aps.iva.yb0.j;
/* compiled from: CornerSize.kt */
/* loaded from: classes.dex */
public final class e implements b {
    public final float a;

    public e(float f) {
        this.a = f;
        if (f >= 0.0f && f <= 100.0f) {
            return;
        }
        throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
    }

    @Override // com.amazon.aps.iva.i0.b
    public final float a(long j, com.amazon.aps.iva.o2.c cVar) {
        j.f(cVar, "density");
        return (this.a / 100.0f) * com.amazon.aps.iva.e1.g.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && Float.compare(this.a, ((e) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
