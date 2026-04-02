package com.amazon.aps.iva.j50;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.yb0.j;
/* compiled from: RateButtonUiModel.kt */
/* loaded from: classes2.dex */
public final class d {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final String d;

    public d() {
        this(null, 0, false, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && j.a(this.d, dVar.d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int hashCode;
        int i = 1;
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int a = r.a(this.b, r1 * 31, 31);
        boolean z2 = this.c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int i2 = (a + i) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }

    public final String toString() {
        return "RateButtonUiModel(isPressed=" + this.a + ", ratesCount=" + this.b + ", animate=" + this.c + ", ratesCountText=" + this.d + ")";
    }

    public d(String str, int i, boolean z, boolean z2, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        i = (i2 & 2) != 0 ? 0 : i;
        z2 = (i2 & 4) != 0 ? false : z2;
        str = (i2 & 8) != 0 ? null : str;
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = str;
    }
}
