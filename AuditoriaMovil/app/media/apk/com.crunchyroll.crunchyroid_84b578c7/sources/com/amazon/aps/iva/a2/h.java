package com.amazon.aps.iva.a2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class h {
    public static final h d = new h(0.0f, new com.amazon.aps.iva.ec0.e(0.0f, 0.0f), 0);
    public final float a;
    public final com.amazon.aps.iva.ec0.f<Float> b;
    public final int c;

    public h(float f, com.amazon.aps.iva.ec0.f<Float> fVar, int i) {
        com.amazon.aps.iva.yb0.j.f(fVar, "range");
        this.a = f;
        this.b = fVar;
        this.c = i;
        if (!Float.isNaN(f)) {
            return;
        }
        throw new IllegalArgumentException("current must not be NaN".toString());
    }

    public final boolean equals(Object obj) {
        boolean z;
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
        if (z && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b) && this.c == hVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return b2.b(sb, this.c, ')');
    }
}
