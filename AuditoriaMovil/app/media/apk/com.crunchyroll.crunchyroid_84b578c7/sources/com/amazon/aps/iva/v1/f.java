package com.amazon.aps.iva.v1;
/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public final class f extends b {
    public static f c;

    public f(int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        return null;
     */
    @Override // com.amazon.aps.iva.v1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] a(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.d()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r5 < r0) goto Lf
            return r1
        Lf:
            if (r5 >= 0) goto L12
            r5 = 0
        L12:
            if (r5 >= r0) goto L29
            java.lang.String r2 = r4.d()
            char r2 = r2.charAt(r5)
            r3 = 10
            if (r2 != r3) goto L29
            boolean r2 = r4.f(r5)
            if (r2 != 0) goto L29
            int r5 = r5 + 1
            goto L12
        L29:
            if (r5 < r0) goto L2c
            return r1
        L2c:
            int r1 = r5 + 1
        L2e:
            if (r1 >= r0) goto L39
            boolean r2 = r4.e(r1)
            if (r2 != 0) goto L39
            int r1 = r1 + 1
            goto L2e
        L39:
            int[] r5 = r4.c(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v1.f.a(int):int[]");
    }

    @Override // com.amazon.aps.iva.v1.g
    public final int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            int i2 = i - 1;
            if (d().charAt(i2) != '\n' || e(i)) {
                break;
            }
            i = i2;
        }
        if (i <= 0) {
            return null;
        }
        int i3 = i - 1;
        while (i3 > 0 && !f(i3)) {
            i3--;
        }
        return c(i3, i);
    }

    public final boolean e(int i) {
        if (i > 0 && d().charAt(i - 1) != '\n' && (i == d().length() || d().charAt(i) == '\n')) {
            return true;
        }
        return false;
    }

    public final boolean f(int i) {
        if (d().charAt(i) != '\n' && (i == 0 || d().charAt(i - 1) == '\n')) {
            return true;
        }
        return false;
    }
}
