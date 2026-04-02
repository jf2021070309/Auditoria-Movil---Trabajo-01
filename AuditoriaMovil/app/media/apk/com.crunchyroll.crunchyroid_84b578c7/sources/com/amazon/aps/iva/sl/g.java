package com.amazon.aps.iva.sl;

import com.amazon.aps.iva.a0.r;
/* compiled from: QualitySetting.kt */
/* loaded from: classes2.dex */
public final class g {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public g(int i, int i2, int i3, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Integer.hashCode(this.d) + r.a(this.c, r.a(this.b, r0 * 31, 31), 31);
    }

    public final String toString() {
        return "QualitySetting(isAuto=" + this.a + ", width=" + this.b + ", height=" + this.c + ", bitrate=" + this.d + ")";
    }
}
