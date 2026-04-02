package com.amazon.aps.iva.x4;

import com.amazon.aps.iva.d0.b2;
/* compiled from: ColorProvider.kt */
/* loaded from: classes.dex */
public final class d implements a {
    public final int a;
    public final int b;

    public d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceCheckableColorProvider(resId=");
        sb.append(this.a);
        sb.append(", fallback=");
        return b2.b(sb, this.b, ')');
    }
}
