package com.amazon.aps.iva.r1;

import com.amazon.aps.iva.e4.t0;
/* compiled from: RotaryScrollEvent.kt */
/* loaded from: classes.dex */
public final class c {
    public final float a;
    public final float b;
    public final long c;

    public c(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.a == this.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (cVar.b == this.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || cVar.c != this.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + t0.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ')';
    }
}
