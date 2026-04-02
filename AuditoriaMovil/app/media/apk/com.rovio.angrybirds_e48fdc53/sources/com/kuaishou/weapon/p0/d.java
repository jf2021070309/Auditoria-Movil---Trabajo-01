package com.kuaishou.weapon.p0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
public abstract class d {
    public static final int a = 2048;
    public static final String b = ".gz";

    public static void a(InputStream inputStream, OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream;
        try {
            gZIPOutputStream = new GZIPOutputStream(outputStream);
        } catch (Throwable th) {
            gZIPOutputStream = null;
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = inputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    gZIPOutputStream.flush();
                    gZIPOutputStream.finish();
                    gZIPOutputStream.close();
                    return;
                }
                gZIPOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            if (gZIPOutputStream != null) {
                try {
                    gZIPOutputStream.close();
                } catch (Exception e) {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Throwable] */
    public static byte[] a(byte[] bArr) {
        byte[] bArr2;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] bArr3 = null;
        byteArrayOutputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    a(byteArrayInputStream, byteArrayOutputStream2);
                    bArr3 = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream2.flush();
                    byteArrayOutputStream2.close();
                    byteArrayInputStream.close();
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e) {
                    }
                    try {
                        byteArrayInputStream.close();
                        return bArr3;
                    } catch (Exception e2) {
                        return bArr3;
                    }
                } catch (Throwable th) {
                    byte[] bArr4 = bArr3;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    bArr2 = bArr4;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e3) {
                        }
                    }
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception e4) {
                        }
                    }
                    return bArr2;
                }
            } catch (Throwable th2) {
                bArr2 = null;
            }
        } catch (Throwable th3) {
            bArr2 = null;
            byteArrayInputStream = null;
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(inputStream);
        } catch (Exception e) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = gZIPInputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    gZIPInputStream.close();
                    try {
                        gZIPInputStream.close();
                        return;
                    } catch (Exception e2) {
                        return;
                    }
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Exception e3) {
            gZIPInputStream2 = gZIPInputStream;
            if (gZIPInputStream2 != null) {
                try {
                    gZIPInputStream2.close();
                } catch (Exception e4) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream2 = gZIPInputStream;
            if (gZIPInputStream2 != null) {
                try {
                    gZIPInputStream2.close();
                } catch (Exception e5) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(byte[] r3) {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            b(r1, r2)     // Catch: java.lang.Throwable -> L26
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L26
            r2.flush()     // Catch: java.lang.Throwable -> L26
            r2.close()     // Catch: java.lang.Throwable -> L26
            r1.close()     // Catch: java.lang.Throwable -> L26
            r2.close()     // Catch: java.lang.Exception -> L1f
            goto L20
        L1f:
            r0 = move-exception
        L20:
            r1.close()     // Catch: java.lang.Exception -> L24
            goto L37
        L24:
            r0 = move-exception
            goto L37
        L26:
            r0 = move-exception
            r0 = r2
            goto L2d
        L29:
            r2 = move-exception
            goto L2d
        L2b:
            r1 = move-exception
            r1 = r0
        L2d:
            if (r0 == 0) goto L34
            r0.close()     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
            r0 = move-exception
        L34:
            if (r1 == 0) goto L37
            goto L20
        L37:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.d.b(byte[]):byte[]");
    }
}
