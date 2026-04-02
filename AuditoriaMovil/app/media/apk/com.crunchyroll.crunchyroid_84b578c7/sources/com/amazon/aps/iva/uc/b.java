package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
/* compiled from: BitmapEncoder.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.kc.k<Bitmap> {
    public static final com.amazon.aps.iva.kc.g<Integer> c = com.amazon.aps.iva.kc.g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final com.amazon.aps.iva.kc.g<Bitmap.CompressFormat> d = new com.amazon.aps.iva.kc.g<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, com.amazon.aps.iva.kc.g.e);
    public final com.amazon.aps.iva.oc.b b;

    public b(com.amazon.aps.iva.oc.b bVar) {
        this.b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileOutputStream] */
    @Override // com.amazon.aps.iva.kc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r7, java.io.File r8, com.amazon.aps.iva.kc.h r9) {
        /*
            r6 = this;
            com.amazon.aps.iva.nc.w r7 = (com.amazon.aps.iva.nc.w) r7
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r7 = r7.get()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            com.amazon.aps.iva.kc.g<android.graphics.Bitmap$CompressFormat> r1 = com.amazon.aps.iva.uc.b.d
            java.lang.Object r2 = r9.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r7.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r7.getWidth()
            r7.getHeight()
            int r3 = com.amazon.aps.iva.hd.h.a
            android.os.SystemClock.elapsedRealtimeNanos()
            com.amazon.aps.iva.kc.g<java.lang.Integer> r3 = com.amazon.aps.iva.uc.b.c
            java.lang.Object r3 = r9.c(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            com.amazon.aps.iva.oc.b r8 = r6.b
            if (r8 == 0) goto L4b
            com.amazon.aps.iva.lc.c r4 = new com.amazon.aps.iva.lc.c     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r4.<init>(r5, r8)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            goto L4c
        L47:
            r7 = move-exception
            goto L82
        L49:
            r4 = r5
            goto L59
        L4b:
            r4 = r5
        L4c:
            r7.compress(r2, r3, r4)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r4.close()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r4.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L63
        L55:
            r8 = 1
            goto L66
        L57:
            r7 = move-exception
            goto L81
        L59:
            r8 = 3
            android.util.Log.isLoggable(r0, r8)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L65
            r4.close()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            goto L65
        L63:
            r7 = move-exception
            goto L88
        L65:
            r8 = 0
        L66:
            r3 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L80
            java.util.Objects.toString(r2)
            com.amazon.aps.iva.hd.l.c(r7)
            android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Object r9 = r9.c(r1)
            java.util.Objects.toString(r9)
            r7.hasAlpha()
        L80:
            return r8
        L81:
            r5 = r4
        L82:
            if (r5 == 0) goto L89
            r5.close()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L89
            goto L89
        L88:
            throw r7
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.uc.b.c(java.lang.Object, java.io.File, com.amazon.aps.iva.kc.h):boolean");
    }

    @Override // com.amazon.aps.iva.kc.k
    public final com.amazon.aps.iva.kc.c d(com.amazon.aps.iva.kc.h hVar) {
        return com.amazon.aps.iva.kc.c.TRANSFORMED;
    }
}
