package com.amazon.aps.iva.lc;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.aps.iva.lc.d;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes.dex */
public final class h implements d<InputStream> {
    public final com.amazon.aps.iva.rc.g b;
    public final int c;
    public HttpURLConnection d;
    public InputStream e;
    public volatile boolean f;

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    static {
        new a();
    }

    public h(com.amazon.aps.iva.rc.g gVar, int i) {
        this.b = gVar;
        this.c = i;
    }

    @Override // com.amazon.aps.iva.lc.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void b() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.d = null;
    }

    public final InputStream c(URL url, int i, URL url2, Map<String, String> map) throws com.amazon.aps.iva.kc.e {
        int i2;
        boolean z;
        int i3 = -1;
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new com.amazon.aps.iva.kc.e(-1, "In re-direct loop", null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z2 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                int i4 = this.c;
                httpURLConnection.setConnectTimeout(i4);
                httpURLConnection.setReadTimeout(i4);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.d = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.e = this.d.getInputStream();
                    if (this.f) {
                        return null;
                    }
                    try {
                        i2 = this.d.getResponseCode();
                    } catch (IOException unused2) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                        i2 = -1;
                    }
                    int i5 = i2 / 100;
                    if (i5 == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        HttpURLConnection httpURLConnection2 = this.d;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.e = new com.amazon.aps.iva.hd.c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    httpURLConnection2.getContentEncoding();
                                }
                                this.e = httpURLConnection2.getInputStream();
                            }
                            return this.e;
                        } catch (IOException e) {
                            try {
                                i3 = httpURLConnection2.getResponseCode();
                            } catch (IOException unused3) {
                                Log.isLoggable("HttpUrlFetcher", 3);
                            }
                            throw new com.amazon.aps.iva.kc.e(i3, "Failed to obtain InputStream", e);
                        }
                    }
                    if (i5 == 3) {
                        z2 = true;
                    }
                    if (z2) {
                        String headerField = this.d.getHeaderField(HttpHeaders.LOCATION);
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                b();
                                return c(url3, i + 1, url, map);
                            } catch (MalformedURLException e2) {
                                throw new com.amazon.aps.iva.kc.e(i2, com.amazon.aps.iva.oa.a.a("Bad redirect url: ", headerField), e2);
                            }
                        }
                        throw new com.amazon.aps.iva.kc.e(i2, "Received empty or null redirect url", null);
                    } else if (i2 == -1) {
                        throw new com.amazon.aps.iva.kc.e(i2, "Http request failed", null);
                    } else {
                        try {
                            throw new com.amazon.aps.iva.kc.e(i2, this.d.getResponseMessage(), null);
                        } catch (IOException e3) {
                            throw new com.amazon.aps.iva.kc.e(i2, "Failed to get a response message", e3);
                        }
                    }
                } catch (IOException e4) {
                    try {
                        i3 = this.d.getResponseCode();
                    } catch (IOException unused4) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                    }
                    throw new com.amazon.aps.iva.kc.e(i3, "Failed to connect or obtain data", e4);
                }
            } catch (IOException e5) {
                throw new com.amazon.aps.iva.kc.e(0, "URL.openConnection threw", e5);
            }
        }
        throw new com.amazon.aps.iva.kc.e(-1, "Too many (> 5) redirects!", null);
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void cancel() {
        this.f = true;
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super InputStream> aVar) {
        com.amazon.aps.iva.rc.g gVar = this.b;
        int i = com.amazon.aps.iva.hd.h.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (gVar.f == null) {
                    gVar.f = new URL(gVar.d());
                }
                aVar.f(c(gVar.f, 0, null, gVar.b.a()));
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (IOException e) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.c(e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            }
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.lc.d
    public final com.amazon.aps.iva.kc.a e() {
        return com.amazon.aps.iva.kc.a.REMOTE;
    }
}
