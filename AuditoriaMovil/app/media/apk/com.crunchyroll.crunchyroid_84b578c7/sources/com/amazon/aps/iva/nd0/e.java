package com.amazon.aps.iva.nd0;
/* compiled from: FqNamesUtil.kt */
/* loaded from: classes4.dex */
public final class e {

    /* compiled from: FqNamesUtil.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r0.charAt(r2.length()) == '.') goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.nd0.c a(com.amazon.aps.iva.nd0.c r5, com.amazon.aps.iva.nd0.c r6) {
        /*
            java.lang.String r0 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r5, r0)
            java.lang.String r0 = "prefix"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r5, r6)
            r1 = 1
            if (r0 == 0) goto L12
            goto L3e
        L12:
            boolean r0 = r6.d()
            if (r0 == 0) goto L19
            goto L3e
        L19:
            java.lang.String r0 = r5.b()
            java.lang.String r2 = "this.asString()"
            com.amazon.aps.iva.yb0.j.e(r0, r2)
            java.lang.String r2 = r6.b()
            java.lang.String r3 = "packageName.asString()"
            com.amazon.aps.iva.yb0.j.e(r2, r3)
            r3 = 0
            boolean r4 = com.amazon.aps.iva.oe0.m.h0(r0, r2, r3)
            if (r4 == 0) goto L3f
            int r2 = r2.length()
            char r0 = r0.charAt(r2)
            r2 = 46
            if (r0 != r2) goto L3f
        L3e:
            r3 = r1
        L3f:
            if (r3 == 0) goto L77
            boolean r0 = r6.d()
            if (r0 == 0) goto L48
            goto L77
        L48:
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r5, r6)
            if (r0 == 0) goto L56
            com.amazon.aps.iva.nd0.c r5 = com.amazon.aps.iva.nd0.c.c
            java.lang.String r6 = "ROOT"
            com.amazon.aps.iva.yb0.j.e(r5, r6)
            goto L77
        L56:
            com.amazon.aps.iva.nd0.c r0 = new com.amazon.aps.iva.nd0.c
            java.lang.String r5 = r5.b()
            java.lang.String r2 = "asString()"
            com.amazon.aps.iva.yb0.j.e(r5, r2)
            java.lang.String r6 = r6.b()
            int r6 = r6.length()
            int r6 = r6 + r1
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            com.amazon.aps.iva.yb0.j.e(r5, r6)
            r0.<init>(r5)
            r5 = r0
        L77:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nd0.e.a(com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.nd0.c):com.amazon.aps.iva.nd0.c");
    }
}
