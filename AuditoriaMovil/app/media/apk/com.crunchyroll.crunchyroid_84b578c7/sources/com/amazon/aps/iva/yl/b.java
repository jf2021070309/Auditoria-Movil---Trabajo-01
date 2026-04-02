package com.amazon.aps.iva.yl;
/* compiled from: TruexConfiguration.kt */
/* loaded from: classes2.dex */
public final class b {
    public final boolean a;
    public final boolean b;

    public b() {
        this(false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && this.b == bVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = 1;
        boolean z = this.a;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = i2 * 31;
        boolean z2 = this.b;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TruexConfiguration(enabled=");
        sb.append(this.a);
        sb.append(", enableRateLimiter=");
        return defpackage.a.b(sb, this.b, ')');
    }

    public b(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
