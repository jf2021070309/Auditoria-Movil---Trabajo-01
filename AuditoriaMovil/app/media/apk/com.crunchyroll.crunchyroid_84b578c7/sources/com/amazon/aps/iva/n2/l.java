package com.amazon.aps.iva.n2;

import com.amazon.aps.iva.q.c0;
/* compiled from: TextGeometricTransform.kt */
/* loaded from: classes.dex */
public final class l {
    public static final l c = new l(1.0f, 0.0f);
    public final float a;
    public final float b;

    public l(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.b == lVar.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return c0.b(sb, this.b, ')');
    }

    public l() {
        this(1.0f, 0.0f);
    }
}
