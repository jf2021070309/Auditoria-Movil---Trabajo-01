package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
/* loaded from: classes.dex */
public final class p {
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    public static void a(String str, int i, OutputStream outputStream) throws IOException {
        InputStream inputStream;
        InputStream inputStream2;
        ByteBuffer b = c.a().b();
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setRequestProperty("Range", String.format(Locale.ENGLISH, "bytes=%d-", Integer.valueOf(i)));
                httpURLConnection2.connect();
                if (httpURLConnection2.getResponseCode() == 206) {
                    InputStream inputStream3 = httpURLConnection2.getInputStream();
                    byte[] array = b.array();
                    while (inputStream3.read(array) != -1) {
                        outputStream.write(array);
                    }
                    inputStream3.close();
                    httpURLConnection2.disconnect();
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused) {
                        }
                    }
                    if (inputStream3 != null) {
                        try {
                            inputStream3.close();
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    return;
                }
                throw new IOException("Server did not reply with proper range.");
            } catch (IOException e) {
                e = e;
                httpURLConnection = httpURLConnection2;
                inputStream2 = null;
                try {
                    throw e;
                } finally {
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused3) {
                        }
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception unused4) {
                        }
                    }
                }
            } catch (Throwable unused5) {
                httpURLConnection = httpURLConnection2;
                inputStream = null;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception unused6) {
                    }
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream2 = null;
        } catch (Throwable unused7) {
            inputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc A[Catch: all -> 0x00ca, Exception -> 0x00d3, TryCatch #2 {Exception -> 0x00d3, all -> 0x00ca, blocks: (B:3:0x0002, B:5:0x001d, B:11:0x002d, B:13:0x0048, B:17:0x0070, B:20:0x0078, B:22:0x0080, B:23:0x0098, B:25:0x009b, B:31:0x00bc, B:33:0x00c6, B:27:0x00a4, B:29:0x00ac, B:14:0x0052, B:15:0x006e), top: B:41:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r8, int r9, int r10, int r11) throws java.lang.Exception {
        /*
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r2.<init>(r8)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.net.URLConnection r8 = r2.openConnection()     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r8.setConnectTimeout(r9)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r8.setReadTimeout(r10)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r8.connect()     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.io.InputStream r2 = a(r8)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r3 = 1
            if (r8 == 0) goto L6f
            int r4 = r8.getResponseCode()     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L2d
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L2d
            r5 = 307(0x133, float:4.3E-43)
            if (r4 != r5) goto L6f
        L2d:
            java.lang.String r5 = "getRedirectUrl: received redirect code %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r7 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r6[r1] = r7     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            com.fyber.inneractive.sdk.util.IAlog.b(r5, r6)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            com.fyber.inneractive.sdk.h.i r5 = com.fyber.inneractive.sdk.h.i.LOCATION     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r5 = r5.E     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r5 = r8.getHeaderField(r5)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            if (r6 != 0) goto L52
            java.lang.String r4 = "getRedirectUrl: redirecting target url: %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r6[r1] = r5     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            com.fyber.inneractive.sdk.util.IAlog.b(r4, r6)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            goto L70
        L52:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r10 = "Server returned HTTP "
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r10 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r9.append(r10)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r10 = " with empty location header!"
            r9.append(r10)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            throw r8     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
        L6f:
            r5 = r0
        L70:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            if (r4 != 0) goto L99
            if (r11 < 0) goto L80
            r8.disconnect()     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r8 = a(r5, r10, r9, r11)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            return r8
        L80:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r10 = "AdServer returned HTTP redirect response more than "
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r9.append(r11)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r10 = " times! aborting"
            r9.append(r10)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            throw r8     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
        L99:
            if (r8 != 0) goto La4
            java.lang.String r9 = "null connection returned"
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            com.fyber.inneractive.sdk.util.IAlog.b(r9, r10)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
        La2:
            r3 = r1
            goto Lba
        La4:
            int r9 = r8.getResponseCode()     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r10 = 200(0xc8, float:2.8E-43)
            if (r9 == r10) goto Lba
            java.lang.String r10 = "isResponseValid: found invalid response status: %s"
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            r11[r1] = r9     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            com.fyber.inneractive.sdk.util.IAlog.b(r10, r11)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            goto La2
        Lba:
            if (r3 == 0) goto Lc5
            java.lang.StringBuffer r9 = com.fyber.inneractive.sdk.util.q.a(r2)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            goto Lc6
        Lc5:
            r9 = r0
        Lc6:
            r8.disconnect()     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Ld3
            return r9
        Lca:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "getBodyFromUrl failed with error"
            com.fyber.inneractive.sdk.util.IAlog.a(r10, r8, r9)
            return r0
        Ld3:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "getBodyFromUrl failed with exception"
            com.fyber.inneractive.sdk.util.IAlog.a(r10, r8, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.p.a(java.lang.String, int, int, int):java.lang.String");
    }

    private static InputStream a(URLConnection uRLConnection) {
        InputStream bufferedInputStream;
        try {
            InputStream inputStream = uRLConnection.getInputStream();
            if (TextUtils.equals("gzip", uRLConnection.getContentEncoding())) {
                bufferedInputStream = new GZIPInputStream(inputStream);
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }
}
