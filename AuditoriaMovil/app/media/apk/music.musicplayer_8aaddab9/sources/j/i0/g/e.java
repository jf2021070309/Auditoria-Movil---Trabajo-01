package j.i0.g;

import j.d0;
/* loaded from: classes2.dex */
public final class e {
    static {
        k.h.h("\"\\");
        k.h.h("\t ,=");
    }

    public static long a(d0 d0Var) {
        String c2 = d0Var.f9211f.c("Content-Length");
        if (c2 != null) {
            try {
                return Long.parseLong(c2);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public static boolean b(d0 d0Var) {
        if (d0Var.a.f9602b.equals("HEAD")) {
            return false;
        }
        int i2 = d0Var.f9208c;
        if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && a(d0Var) == -1) {
            String c2 = d0Var.f9211f.c("Transfer-Encoding");
            if (c2 == null) {
                c2 = null;
            }
            if (!"chunked".equalsIgnoreCase(c2)) {
                return false;
            }
        }
        return true;
    }

    public static int c(String str, int i2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c2, code lost:
        if ((r0.equals(r10) || (r0.endsWith(r10) && r0.charAt((r0.length() - r10.length()) - 1) == '.' && !j.i0.c.q.matcher(r0).matches())) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f3, code lost:
        if (r13 != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0202, code lost:
        if (r13 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0204, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
        if (r20 <= 0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(j.k r34, j.s r35, j.r r36) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.g.e.d(j.k, j.s, j.r):void");
    }

    public static int e(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }
}
