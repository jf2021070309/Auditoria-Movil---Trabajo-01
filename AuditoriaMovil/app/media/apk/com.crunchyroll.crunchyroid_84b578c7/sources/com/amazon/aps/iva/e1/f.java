package com.amazon.aps.iva.e1;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.k.q;
/* compiled from: RoundRect.kt */
/* loaded from: classes.dex */
public final class f {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        int i = a.c;
        com.amazon.aps.iva.dg.b.e(0.0f, 0.0f, 0.0f, 0.0f, a.b);
    }

    public f(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Float.compare(this.a, fVar.a) == 0 && Float.compare(this.b, fVar.b) == 0 && Float.compare(this.c, fVar.c) == 0 && Float.compare(this.d, fVar.d) == 0 && a.a(this.e, fVar.e) && a.a(this.f, fVar.f) && a.a(this.g, fVar.g) && a.a(this.h, fVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = t0.b(this.d, t0.b(this.c, t0.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        int i = a.c;
        return Long.hashCode(this.h) + i.a(this.g, i.a(this.f, i.a(this.e, b, 31), 31), 31);
    }

    public final String toString() {
        boolean z;
        String str = com.amazon.aps.iva.cq.b.r0(this.a) + ", " + com.amazon.aps.iva.cq.b.r0(this.b) + ", " + com.amazon.aps.iva.cq.b.r0(this.c) + ", " + com.amazon.aps.iva.cq.b.r0(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean a = a.a(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (a && a.a(j2, j3) && a.a(j3, j4)) {
            if (a.b(j) == a.c(j)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder c = q.c("RoundRect(rect=", str, ", radius=");
                c.append(com.amazon.aps.iva.cq.b.r0(a.b(j)));
                c.append(')');
                return c.toString();
            }
            StringBuilder c2 = q.c("RoundRect(rect=", str, ", x=");
            c2.append(com.amazon.aps.iva.cq.b.r0(a.b(j)));
            c2.append(", y=");
            c2.append(com.amazon.aps.iva.cq.b.r0(a.c(j)));
            c2.append(')');
            return c2.toString();
        }
        StringBuilder c3 = q.c("RoundRect(rect=", str, ", topLeft=");
        c3.append((Object) a.d(j));
        c3.append(", topRight=");
        c3.append((Object) a.d(j2));
        c3.append(", bottomRight=");
        c3.append((Object) a.d(j3));
        c3.append(", bottomLeft=");
        c3.append((Object) a.d(j4));
        c3.append(')');
        return c3.toString();
    }
}
