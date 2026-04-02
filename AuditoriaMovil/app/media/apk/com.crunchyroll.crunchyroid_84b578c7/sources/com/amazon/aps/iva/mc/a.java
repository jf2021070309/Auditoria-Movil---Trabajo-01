package com.amazon.aps.iva.mc;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.amazon.aps.iva.lc.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ThumbFetcher.java */
/* loaded from: classes.dex */
public final class a implements d<InputStream> {
    public final Uri b;
    public final c c;
    public InputStream d;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: com.amazon.aps.iva.mc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0509a implements com.amazon.aps.iva.mc.b {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public C0509a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.amazon.aps.iva.mc.b
        public final Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* loaded from: classes.dex */
    public static class b implements com.amazon.aps.iva.mc.b {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.amazon.aps.iva.mc.b
        public final Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.b = uri;
        this.c = cVar;
    }

    public static a c(Context context, Uri uri, com.amazon.aps.iva.mc.b bVar) {
        return new a(uri, new c(com.bumptech.glide.a.a(context).d.a().d(), bVar, com.bumptech.glide.a.a(context).e, context.getContentResolver()));
    }

    @Override // com.amazon.aps.iva.lc.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void b() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super InputStream> aVar) {
        try {
            InputStream f = f();
            this.d = f;
            aVar.f(f);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.c(e);
        }
    }

    @Override // com.amazon.aps.iva.lc.d
    public final com.amazon.aps.iva.kc.a e() {
        return com.amazon.aps.iva.kc.a.LOCAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r6 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r6 != null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream f() throws java.io.FileNotFoundException {
        /*
            r13 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            android.net.Uri r1 = r13.b
            com.amazon.aps.iva.mc.c r2 = r13.c
            r2.getClass()
            r3 = 3
            r4 = 0
            r5 = 0
            com.amazon.aps.iva.mc.b r6 = r2.a     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L28
            android.database.Cursor r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L28
            if (r6 == 0) goto L22
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.SecurityException -> L29 java.lang.Throwable -> Lbc
            if (r7 == 0) goto L22
            java.lang.String r7 = r6.getString(r5)     // Catch: java.lang.SecurityException -> L29 java.lang.Throwable -> Lbc
            r6.close()
            goto L38
        L22:
            if (r6 == 0) goto L37
            goto L34
        L25:
            r0 = move-exception
            goto Lbe
        L28:
            r6 = r4
        L29:
            boolean r7 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L32
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> Lbc
        L32:
            if (r6 == 0) goto L37
        L34:
            r6.close()
        L37:
            r7 = r4
        L38:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            android.content.ContentResolver r8 = r2.c
            if (r6 == 0) goto L41
            goto L59
        L41:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L57
            long r9 = r6.length()
            r11 = 0
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 >= 0) goto L57
            r5 = 1
        L57:
            if (r5 != 0) goto L5b
        L59:
            r5 = r4
            goto L63
        L5b:
            android.net.Uri r5 = android.net.Uri.fromFile(r6)
            java.io.InputStream r5 = r8.openInputStream(r5)     // Catch: java.lang.NullPointerException -> L99
        L63:
            r6 = -1
            if (r5 == 0) goto L8f
            java.io.InputStream r4 = r8.openInputStream(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L7a
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r2.d     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L7a
            com.amazon.aps.iva.oc.b r2 = r2.b     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L7a
            int r0 = com.bumptech.glide.load.a.a(r2, r4, r7)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L7a
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.io.IOException -> L90
            goto L90
        L78:
            r0 = move-exception
            goto L89
        L7a:
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L83
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L78
        L83:
            if (r4 == 0) goto L8f
            r4.close()     // Catch: java.io.IOException -> L8f
            goto L8f
        L89:
            if (r4 == 0) goto L8e
            r4.close()     // Catch: java.io.IOException -> L8e
        L8e:
            throw r0
        L8f:
            r0 = r6
        L90:
            if (r0 == r6) goto L98
            com.amazon.aps.iva.lc.e r1 = new com.amazon.aps.iva.lc.e
            r1.<init>(r5, r0)
            r5 = r1
        L98:
            return r5
        L99:
            r0 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "NPE opening uri: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        Lbc:
            r0 = move-exception
            r4 = r6
        Lbe:
            if (r4 == 0) goto Lc3
            r4.close()
        Lc3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.mc.a.f():java.io.InputStream");
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void cancel() {
    }
}
