package com.amazon.aps.iva.o2;

import com.amazon.aps.iva.o2.a;
/* compiled from: Constraints.kt */
/* loaded from: classes.dex */
public final class b {
    public static final long a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i4 >= i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i < 0 || i3 < 0) {
                    z3 = false;
                }
                if (z3) {
                    return a.C0554a.b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(com.amazon.aps.iva.q.n.a("minWidth(", i, ") and minHeight(", i3, ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    public static /* synthetic */ long b(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return a(0, i, 0, i2);
    }

    public static final long c(long j, long j2) {
        return k.a(com.amazon.aps.iva.aq.j.j((int) (j2 >> 32), a.j(j), a.h(j)), com.amazon.aps.iva.aq.j.j(j.b(j2), a.i(j), a.g(j)));
    }

    public static final long d(long j, long j2) {
        return a(com.amazon.aps.iva.aq.j.j(a.j(j2), a.j(j), a.h(j)), com.amazon.aps.iva.aq.j.j(a.h(j2), a.j(j), a.h(j)), com.amazon.aps.iva.aq.j.j(a.i(j2), a.i(j), a.g(j)), com.amazon.aps.iva.aq.j.j(a.g(j2), a.i(j), a.g(j)));
    }

    public static final int e(int i, long j) {
        return com.amazon.aps.iva.aq.j.j(i, a.i(j), a.g(j));
    }

    public static final int f(int i, long j) {
        return com.amazon.aps.iva.aq.j.j(i, a.j(j), a.h(j));
    }

    public static final boolean g(long j, long j2) {
        boolean z;
        boolean z2;
        int j3 = a.j(j);
        int h = a.h(j);
        int i = (int) (j2 >> 32);
        if (j3 <= i && i <= h) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = a.i(j);
            int g = a.g(j);
            int b = j.b(j2);
            if (i2 <= b && b <= g) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static final long h(int i, long j, int i2) {
        int j2 = a.j(j) + i;
        int i3 = 0;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = a.h(j);
        if (h != Integer.MAX_VALUE && (h = h + i) < 0) {
            h = 0;
        }
        int i4 = a.i(j) + i2;
        if (i4 < 0) {
            i4 = 0;
        }
        int g = a.g(j);
        if (g == Integer.MAX_VALUE || (g = g + i2) >= 0) {
            i3 = g;
        }
        return a(j2, h, i4, i3);
    }
}
