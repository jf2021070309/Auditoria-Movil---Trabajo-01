package com.facebook.ads.internal.p.b;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes2.dex */
public class h implements n {
    public final String a;
    private HttpURLConnection b;
    private InputStream c;
    private volatile int d;
    private volatile String e;

    public h(h hVar) {
        this.d = Integer.MIN_VALUE;
        this.a = hVar.a;
        this.e = hVar.e;
        this.d = hVar.d;
    }

    public h(String str) {
        this(str, m.a(str));
    }

    public h(String str, String str2) {
        this.d = Integer.MIN_VALUE;
        this.a = (String) j.a(str);
        this.e = str2;
    }

    private int a(HttpURLConnection httpURLConnection, int i, int i2) {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.d;
    }

    private HttpURLConnection a(int i, int i2) {
        HttpURLConnection httpURLConnection;
        boolean z;
        String str = this.a;
        int i3 = 0;
        do {
            Log.d("ProxyCache", "Open connection " + (i > 0 ? " with offset " + i : "") + " to " + str);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (i > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + i + "-");
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                str = httpURLConnection.getHeaderField("Location");
                i3++;
                httpURLConnection.disconnect();
            }
            if (i3 > 5) {
                throw new l("Too many redirects: " + i3);
            }
        } while (z);
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d() {
        /*
            r6 = this;
            r1 = 0
            java.lang.String r0 = "ProxyCache"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Read content info from "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r6.a
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
            r0 = 0
            r2 = 10000(0x2710, float:1.4013E-41)
            java.net.HttpURLConnection r2 = r6.a(r0, r2)     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L92
            int r0 = r2.getContentLength()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r6.d = r0     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r0 = r2.getContentType()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r6.e = r0     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.io.InputStream r1 = r2.getInputStream()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r0 = "ProxyCache"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r4 = "Content info for `"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r4 = r6.a     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r4 = "`: mime: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r4 = r6.e     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r4 = ", content-length: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            int r4 = r6.d     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            android.util.Log.i(r0, r3)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> L9f
            com.facebook.ads.internal.p.b.m.a(r1)
            if (r2 == 0) goto L6c
            r2.disconnect()
        L6c:
            return
        L6d:
            r0 = move-exception
            r2 = r1
        L6f:
            java.lang.String r3 = "ProxyCache"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r4.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = "Error fetching info from "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = r6.a     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L9d
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L9d
            com.facebook.ads.internal.p.b.m.a(r1)
            if (r2 == 0) goto L6c
            r2.disconnect()
            goto L6c
        L92:
            r0 = move-exception
            r2 = r1
        L94:
            com.facebook.ads.internal.p.b.m.a(r1)
            if (r2 == 0) goto L9c
            r2.disconnect()
        L9c:
            throw r0
        L9d:
            r0 = move-exception
            goto L94
        L9f:
            r0 = move-exception
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p.b.h.d():void");
    }

    @Override // com.facebook.ads.internal.p.b.n
    public synchronized int a() {
        if (this.d == Integer.MIN_VALUE) {
            d();
        }
        return this.d;
    }

    @Override // com.facebook.ads.internal.p.b.n
    public int a(byte[] bArr) {
        if (this.c == null) {
            throw new l("Error reading data from " + this.a + ": connection is absent!");
        }
        try {
            return this.c.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            throw new i("Reading source " + this.a + " is interrupted", e);
        } catch (IOException e2) {
            throw new l("Error reading data from " + this.a, e2);
        }
    }

    @Override // com.facebook.ads.internal.p.b.n
    public void a(int i) {
        try {
            this.b = a(i, -1);
            this.e = this.b.getContentType();
            this.c = new BufferedInputStream(this.b.getInputStream(), 8192);
            this.d = a(this.b, i, this.b.getResponseCode());
        } catch (IOException e) {
            throw new l("Error opening connection for " + this.a + " with offset " + i, e);
        }
    }

    @Override // com.facebook.ads.internal.p.b.n
    public void b() {
        if (this.b != null) {
            try {
                this.b.disconnect();
            } catch (NullPointerException e) {
                throw new l("Error disconnecting HttpUrlConnection", e);
            }
        }
    }

    public synchronized String c() {
        if (TextUtils.isEmpty(this.e)) {
            d();
        }
        return this.e;
    }

    public String toString() {
        return "HttpUrlSource{url='" + this.a + "}";
    }
}
