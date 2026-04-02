package com.amazon.aps.iva.e1;

import com.amazon.aps.iva.e4.t0;
/* compiled from: Rect.kt */
/* loaded from: classes.dex */
public final class e {
    public static final e e = new e(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public e(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final long a() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return d.d(f3, ((f4 - f5) / 2.0f) + f5);
    }

    public final e b(e eVar) {
        return new e(Math.max(this.a, eVar.a), Math.max(this.b, eVar.b), Math.min(this.c, eVar.c), Math.min(this.d, eVar.d));
    }

    public final e c(float f, float f2) {
        return new e(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final e d(long j) {
        return new e(c.c(j) + this.a, c.d(j) + this.b, c.c(j) + this.c, c.d(j) + this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Float.compare(this.a, eVar.a) == 0 && Float.compare(this.b, eVar.b) == 0 && Float.compare(this.c, eVar.c) == 0 && Float.compare(this.d, eVar.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + t0.b(this.c, t0.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + com.amazon.aps.iva.cq.b.r0(this.a) + ", " + com.amazon.aps.iva.cq.b.r0(this.b) + ", " + com.amazon.aps.iva.cq.b.r0(this.c) + ", " + com.amazon.aps.iva.cq.b.r0(this.d) + ')';
    }
}
