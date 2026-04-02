package com.facebook.ads.internal.c;
/* loaded from: classes2.dex */
public class c {

    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        public String b;
        public boolean c;

        public a(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.c.c.a a(android.content.ContentResolver r7) {
        /*
            r6 = 0
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            r0 = 0
            java.lang.String r1 = "aid"
            r2[r0] = r1     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            r0 = 1
            java.lang.String r1 = "androidid"
            r2[r0] = r1     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            r0 = 2
            java.lang.String r1 = "limit_tracking"
            r2[r0] = r1     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            java.lang.String r0 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L78
            if (r1 == 0) goto L29
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            if (r0 != 0) goto L37
        L29:
            com.facebook.ads.internal.c.c$a r0 = new com.facebook.ads.internal.c.c$a     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            java.lang.String r0 = "aid"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r2 = r1.getString(r0)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r0 = "androidid"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r3 = r1.getString(r0)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r0 = "limit_tracking"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            com.facebook.ads.internal.c.c$a r0 = new com.facebook.ads.internal.c.c$a     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r0.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            if (r1 == 0) goto L36
            r1.close()
            goto L36
        L68:
            r0 = move-exception
            r1 = r6
        L6a:
            com.facebook.ads.internal.c.c$a r0 = new com.facebook.ads.internal.c.c$a     // Catch: java.lang.Throwable -> L80
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L36
            r1.close()
            goto L36
        L78:
            r0 = move-exception
            r1 = r6
        L7a:
            if (r1 == 0) goto L7f
            r1.close()
        L7f:
            throw r0
        L80:
            r0 = move-exception
            goto L7a
        L82:
            r0 = move-exception
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.c.c.a(android.content.ContentResolver):com.facebook.ads.internal.c.c$a");
    }
}
