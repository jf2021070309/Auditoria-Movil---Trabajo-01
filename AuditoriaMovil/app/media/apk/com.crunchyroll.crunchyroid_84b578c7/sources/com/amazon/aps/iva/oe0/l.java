package com.amazon.aps.iva.oe0;

import com.amazon.aps.iva.ab.x;
/* compiled from: StringNumberConversions.kt */
/* loaded from: classes4.dex */
public class l extends k {
    public static final Double V(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        try {
            if (!g.a.b(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Integer W(String str) {
        boolean z;
        int i;
        int i2;
        x.x(10);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            int i4 = -2147483647;
            if (com.amazon.aps.iva.yb0.j.h(charAt, 48) < 0) {
                i = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        i4 = Integer.MIN_VALUE;
                        z = true;
                    } else if (charAt == '+') {
                        z = false;
                    }
                }
            } else {
                z = false;
                i = 0;
            }
            int i5 = -59652323;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0 && ((i3 >= i5 || (i5 == -59652323 && i3 >= (i5 = i4 / 10))) && (i2 = i3 * 10) >= i4 + digit)) {
                    i3 = i2 - digit;
                    i++;
                }
            }
            if (z) {
                return Integer.valueOf(i3);
            }
            return Integer.valueOf(-i3);
        }
        return null;
    }

    public static final Long X(String str) {
        boolean z;
        x.x(10);
        int length = str.length();
        if (length != 0) {
            int i = 0;
            char charAt = str.charAt(0);
            long j = -9223372036854775807L;
            if (com.amazon.aps.iva.yb0.j.h(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '-') {
                        j = Long.MIN_VALUE;
                        i = 1;
                    } else if (charAt == '+') {
                        z = false;
                        i = 1;
                    }
                }
            } else {
                z = false;
            }
            long j2 = 0;
            long j3 = -256204778801521550L;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if (j2 < j3) {
                        if (j3 == -256204778801521550L) {
                            j3 = j / 10;
                            if (j2 < j3) {
                            }
                        }
                    }
                    long j4 = j2 * 10;
                    long j5 = digit;
                    if (j4 >= j + j5) {
                        j2 = j4 - j5;
                        i++;
                    }
                }
            }
            if (z) {
                return Long.valueOf(j2);
            }
            return Long.valueOf(-j2);
        }
        return null;
    }
}
