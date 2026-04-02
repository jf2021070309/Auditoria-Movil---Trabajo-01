package com.bytedance.pangle.util.a;
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] a(java.io.File r11) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            r2 = 0
            r3 = 0
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lab
            r4.<init>(r11)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> Lab
            java.util.Enumeration r11 = r4.entries()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            r3.<init>()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            r5 = r2
            r6 = r5
            r7 = r6
        L1b:
            boolean r8 = r11.hasMoreElements()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            if (r8 == 0) goto L68
            java.lang.Object r8 = r11.nextElement()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.util.zip.ZipEntry r8 = (java.util.zip.ZipEntry) r8     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.String r10 = "META-INF/"
            boolean r9 = r9.startsWith(r10)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            if (r9 == 0) goto L67
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.String r10 = "MANIFEST.MF"
            boolean r9 = r9.endsWith(r10)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            if (r9 == 0) goto L41
            r7 = r1
            goto L5c
        L41:
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.String r10 = ".SF"
            boolean r9 = r9.endsWith(r10)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            if (r9 == 0) goto L4f
            r5 = r1
            goto L5c
        L4f:
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.String r10 = ".RSA"
            boolean r9 = r9.endsWith(r10)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            if (r9 == 0) goto L5c
            r6 = r1
        L5c:
            long r8 = r8.getCrc()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            r3.add(r8)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
        L67:
            goto L1b
        L68:
            java.util.Comparator r11 = java.util.Collections.reverseOrder()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.util.Collections.sort(r3, r11)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            r11.<init>()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
        L78:
            boolean r8 = r3.hasNext()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            if (r8 == 0) goto L88
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            r11.append(r8)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            goto L78
        L88:
            if (r7 == 0) goto L98
            if (r5 == 0) goto L98
            if (r6 == 0) goto L98
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.String r11 = com.bytedance.pangle.util.f.a(r11)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            r3 = r0
            goto L9c
        L98:
            java.lang.String r11 = "without v1 signature."
            r3 = r11
            r11 = r0
        L9c:
            com.bytedance.pangle.util.a.c.a(r4)
            goto Lb1
        La0:
            r11 = move-exception
            r3 = r4
            goto La7
        La3:
            r11 = move-exception
            r3 = r4
            goto Lac
        La6:
            r11 = move-exception
        La7:
            com.bytedance.pangle.util.a.c.a(r3)
            throw r11
        Lab:
            r11 = move-exception
        Lac:
            com.bytedance.pangle.util.a.c.a(r3)
            r11 = r0
            r3 = r11
        Lb1:
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]
            r4[r2] = r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto Lbd
            goto Lbf
        Lbd:
            java.lang.String r0 = "V1"
        Lbf:
            r4[r1] = r0
            r11 = 2
            r4[r11] = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.util.a.a.a(java.io.File):java.lang.String[]");
    }
}
