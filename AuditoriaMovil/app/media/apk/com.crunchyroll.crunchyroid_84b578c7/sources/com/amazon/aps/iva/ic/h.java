package com.amazon.aps.iva.ic;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.hd.l;
/* compiled from: Flows.kt */
/* loaded from: classes.dex */
public final class h {
    public final int a;
    public final int b;

    public h(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (l.h(i)) {
            if (l.h(i2)) {
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && this.b == hVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Size(width=");
        sb.append(this.a);
        sb.append(", height=");
        return b2.b(sb, this.b, ')');
    }
}
