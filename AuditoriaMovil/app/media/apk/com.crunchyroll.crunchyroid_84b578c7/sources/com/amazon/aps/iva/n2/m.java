package com.amazon.aps.iva.n2;

import com.amazon.aps.iva.e.z;
/* compiled from: TextIndent.kt */
/* loaded from: classes.dex */
public final class m {
    public static final m c = new m(z.z(0), z.z(0));
    public final long a;
    public final long b;

    public m(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (com.amazon.aps.iva.o2.m.a(this.a, mVar.a) && com.amazon.aps.iva.o2.m.a(this.b, mVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        com.amazon.aps.iva.o2.n[] nVarArr = com.amazon.aps.iva.o2.m.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) com.amazon.aps.iva.o2.m.d(this.a)) + ", restLine=" + ((Object) com.amazon.aps.iva.o2.m.d(this.b)) + ')';
    }
}
