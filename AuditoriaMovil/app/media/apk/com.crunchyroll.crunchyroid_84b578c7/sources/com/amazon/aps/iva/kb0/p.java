package com.amazon.aps.iva.kb0;

import com.amazon.aps.iva.ab.x;
/* compiled from: ULong.kt */
/* loaded from: classes4.dex */
public final class p implements Comparable<p> {
    public final long b;

    public /* synthetic */ p(long j) {
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(p pVar) {
        int i = ((this.b ^ Long.MIN_VALUE) > (pVar.b ^ Long.MIN_VALUE) ? 1 : ((this.b ^ Long.MIN_VALUE) == (pVar.b ^ Long.MIN_VALUE) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (this.b != ((p) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        long j = this.b;
        if (j >= 0) {
            x.x(10);
            String l = Long.toString(j, 10);
            com.amazon.aps.iva.yb0.j.e(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        x.x(10);
        String l2 = Long.toString(j3, 10);
        com.amazon.aps.iva.yb0.j.e(l2, "toString(this, checkRadix(radix))");
        x.x(10);
        String l3 = Long.toString(j4, 10);
        com.amazon.aps.iva.yb0.j.e(l3, "toString(this, checkRadix(radix))");
        return l2.concat(l3);
    }
}
