package com.unity.qp;
/* loaded from: classes.dex */
public class o {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:241)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:54)
        */
    public static void c(android.content.Context r7) {
        /*
            r0 = 0
            return
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = r7.getPackageName()     // Catch: java.lang.Exception -> L14
            r3 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Exception -> L14
            android.content.pm.Signature[] r1 = r1.signatures     // Catch: java.lang.Exception -> L14
            r0 = r1
            goto L15
        L14:
            r1 = move-exception
        L15:
            if (r0 == 0) goto L54
            r1 = 0
            r2 = r0[r1]
            if (r2 == 0) goto L54
            r1 = r0[r1]
            java.lang.String r1 = r1.toCharsString()
            if (r1 == 0) goto L54
            int r2 = r1.hashCode()
            java.lang.String r3 = "386333006"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r3.intValue()
            if (r2 == r3) goto L54
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            r4 = 5
            int r3 = r3.nextInt(r4)
            int r3 = r3 + 2
            com.unity.qp.o$1 r4 = new com.unity.qp.o$1
            r4.<init>()
            int r5 = r3 * 1000
            long r5 = (long) r5
            r2.postDelayed(r4, r5)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity.qp.o.c(android.content.Context):void");
    }
}
