package com.amazon.aps.iva.h1;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.f1.y0;
import com.amazon.aps.iva.f1.z0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: DrawScope.kt */
/* loaded from: classes.dex */
public final class i extends f {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public i(float f, float f2, int i, int i2, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == iVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.b == iVar.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.c == iVar.c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.d == iVar.d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        iVar.getClass();
        if (j.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return r.a(this.d, r.a(this.c, t0.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31) + 0;
    }

    public final String toString() {
        return "Stroke(width=" + this.a + ", miter=" + this.b + ", cap=" + ((Object) y0.a(this.c)) + ", join=" + ((Object) z0.a(this.d)) + ", pathEffect=" + ((Object) null) + ')';
    }
}
