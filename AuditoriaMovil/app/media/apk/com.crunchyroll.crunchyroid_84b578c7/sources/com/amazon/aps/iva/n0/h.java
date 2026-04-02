package com.amazon.aps.iva.n0;

import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.q.c0;
/* compiled from: RippleTheme.kt */
/* loaded from: classes.dex */
public final class h {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public h(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.b == hVar.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.c == hVar.c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.d == hVar.d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + t0.b(this.c, t0.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return c0.b(sb, this.d, ')');
    }
}
