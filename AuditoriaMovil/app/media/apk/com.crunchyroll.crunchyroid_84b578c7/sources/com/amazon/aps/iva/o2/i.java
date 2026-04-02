package com.amazon.aps.iva.o2;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.d0.b2;
/* compiled from: IntRect.kt */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public i(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == iVar.a && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + r.a(this.c, r.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return b2.b(sb, this.d, ')');
    }
}
