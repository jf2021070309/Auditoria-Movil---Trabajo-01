package e.c.a.m.u.c;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class c implements e.c.a.m.p<Bitmap> {
    public static final e.c.a.m.l<Integer> a = e.c.a.m.l.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: b  reason: collision with root package name */
    public static final e.c.a.m.l<Bitmap.CompressFormat> f5855b = new e.c.a.m.l<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, e.c.a.m.l.a);

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.m.s.c0.b f5856c;

    public c(e.c.a.m.s.c0.b bVar) {
        this.f5856c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r6 == null) goto L22;
     */
    @Override // e.c.a.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Object r9, java.io.File r10, e.c.a.m.m r11) {
        /*
            r8 = this;
            e.c.a.m.s.w r9 = (e.c.a.m.s.w) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            e.c.a.m.l<android.graphics.Bitmap$CompressFormat> r1 = e.c.a.m.u.c.c.f5855b
            java.lang.Object r1 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L15
            goto L20
        L15:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r2 = e.c.a.s.f.f6026b     // Catch: java.lang.Throwable -> Lb5
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lb5
            e.c.a.m.l<java.lang.Integer> r4 = e.c.a.m.u.c.c.a     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r4 = r11.c(r4)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lb5
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lb5
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            e.c.a.m.s.c0.b r10 = r8.f5856c     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r10 == 0) goto L4c
            e.c.a.m.r.c r10 = new e.c.a.m.r.c     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            e.c.a.m.s.c0.b r6 = r8.f5856c     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r6 = r10
            goto L4d
        L4c:
            r6 = r7
        L4d:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            r6.close()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            r5 = 1
            goto L61
        L55:
            r9 = move-exception
            goto Laf
        L57:
            r6 = r7
            goto L5b
        L59:
            r9 = move-exception
            goto Lae
        L5b:
            r10 = 3
            android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L64
        L61:
            r6.close()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> Lb5
        L64:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lb5
            if (r10 == 0) goto Lad
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r10.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = "Compressed with type: "
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb5
            r10.append(r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = " of size "
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb5
            int r0 = e.c.a.s.j.d(r9)     // Catch: java.lang.Throwable -> Lb5
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = " in "
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb5
            double r0 = e.c.a.s.f.a(r2)     // Catch: java.lang.Throwable -> Lb5
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = ", options format: "
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb5
            e.c.a.m.l<android.graphics.Bitmap$CompressFormat> r0 = e.c.a.m.u.c.c.f5855b     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r11 = r11.c(r0)     // Catch: java.lang.Throwable -> Lb5
            r10.append(r11)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lb5
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lb5
            r10.append(r9)     // Catch: java.lang.Throwable -> Lb5
            r10.toString()     // Catch: java.lang.Throwable -> Lb5
        Lad:
            return r5
        Lae:
            r7 = r6
        Laf:
            if (r7 == 0) goto Lb4
            r7.close()     // Catch: java.io.IOException -> Lb4 java.lang.Throwable -> Lb5
        Lb4:
            throw r9     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.m.u.c.c.a(java.lang.Object, java.io.File, e.c.a.m.m):boolean");
    }

    @Override // e.c.a.m.p
    public e.c.a.m.c b(e.c.a.m.m mVar) {
        return e.c.a.m.c.TRANSFORMED;
    }
}
