package com.amazon.aps.iva.g1;

import com.amazon.aps.iva.q.c0;
/* compiled from: WhitePoint.kt */
/* loaded from: classes.dex */
public final class w {
    public final float a;
    public final float b;

    public w(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Float.compare(this.a, wVar.a) == 0 && Float.compare(this.b, wVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return c0.b(sb, this.b, ')');
    }
}
