package com.kwad.sdk.core.videocache;

import android.text.TextUtils;
import com.kwad.sdk.core.network.q;
import com.kwad.sdk.core.network.s;
import com.kwad.sdk.utils.ao;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
/* loaded from: classes.dex */
public final class h implements l {
    private m awO;
    private HttpURLConnection awP;
    private InputStream awQ;
    private final com.kwad.sdk.core.videocache.d.b aws;
    private final com.kwad.sdk.core.videocache.b.b awt;

    public h(h hVar) {
        this.awO = hVar.awO;
        this.aws = hVar.aws;
        this.awt = hVar.awt;
    }

    public h(String str, com.kwad.sdk.core.videocache.d.b bVar, com.kwad.sdk.core.videocache.b.b bVar2) {
        this.aws = (com.kwad.sdk.core.videocache.d.b) ao.checkNotNull(bVar);
        this.awt = (com.kwad.sdk.core.videocache.b.b) ao.checkNotNull(bVar2);
        m dW = bVar.dW(str);
        this.awO = dW == null ? new m(str, -2147483648L, k.dU(str)) : dW;
    }

    private void DI() {
        HttpURLConnection httpURLConnection;
        com.kwad.sdk.core.e.c.d("HttpUrlSource", "Read content info from " + this.awO.url);
        InputStream inputStream = null;
        try {
            httpURLConnection = c(0L, 10000);
            try {
                try {
                    long c = c(httpURLConnection);
                    String contentType = httpURLConnection.getContentType();
                    inputStream = httpURLConnection.getInputStream();
                    m mVar = new m(this.awO.url, c, contentType);
                    this.awO = mVar;
                    this.aws.a(mVar.url, this.awO);
                    com.kwad.sdk.core.e.c.d("HttpUrlSource", "Source info fetched: " + this.awO);
                } catch (IOException e) {
                    com.kwad.sdk.core.e.c.e("HttpUrlSource", "Error fetching info from " + this.awO.url);
                    com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
                    com.kwad.sdk.crash.utils.b.a(httpURLConnection);
                }
            } catch (Throwable th) {
                th = th;
                com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
                com.kwad.sdk.crash.utils.b.a(httpURLConnection);
                throw th;
            }
        } catch (IOException e2) {
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
            com.kwad.sdk.crash.utils.b.a(httpURLConnection);
            throw th;
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
        com.kwad.sdk.crash.utils.b.a(httpURLConnection);
    }

    private long a(HttpURLConnection httpURLConnection, long j, int i) {
        long c = c(httpURLConnection);
        return i == 200 ? c : i == 206 ? c + j : this.awO.axd;
    }

    private void a(HttpURLConnection httpURLConnection, String str) {
        for (Map.Entry<String, String> entry : this.awt.DQ().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private static long c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField(DownloadUtils.CONTENT_LENGTH);
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    private HttpURLConnection c(long j, int i) {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z;
        String str2 = this.awO.url;
        int i2 = 0;
        do {
            StringBuilder sb = new StringBuilder("Open connection ");
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i3 > 0) {
                str = " with offset " + j;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" to ");
            sb.append(str2);
            com.kwad.sdk.core.e.c.d("HttpUrlSource", sb.toString());
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            s.wrapHttpURLConnection(httpURLConnection);
            a(httpURLConnection, str2);
            if (i3 > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-");
            }
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            q.b(httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                str2 = httpURLConnection.getHeaderField("Location");
                i2++;
                httpURLConnection.disconnect();
            }
            if (i2 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }

    public final synchronized String DJ() {
        if (TextUtils.isEmpty(this.awO.axe)) {
            DI();
        }
        return this.awO.axe;
    }

    @Override // com.kwad.sdk.core.videocache.l
    public final void ah(long j) {
        try {
            HttpURLConnection c = c(j, -1);
            this.awP = c;
            String contentType = c.getContentType();
            this.awQ = new BufferedInputStream(this.awP.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.awP;
            m mVar = new m(this.awO.url, a(httpURLConnection, j, httpURLConnection.getResponseCode()), contentType);
            this.awO = mVar;
            this.aws.a(mVar.url, this.awO);
        } catch (IOException e) {
            throw new ProxyCacheException("Error opening connection for " + this.awO.url + " with offset " + j, e);
        }
    }

    @Override // com.kwad.sdk.core.videocache.l
    public final void close() {
        HttpURLConnection httpURLConnection = this.awP;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e) {
                com.kwad.sdk.core.e.c.e("HttpUrlSource", "Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue.");
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e3) {
                e = e3;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    @Override // com.kwad.sdk.core.videocache.l
    public final synchronized long length() {
        if (this.awO.axd == -2147483648L) {
            DI();
        }
        return this.awO.axd;
    }

    @Override // com.kwad.sdk.core.videocache.l
    public final int read(byte[] bArr) {
        InputStream inputStream = this.awQ;
        if (inputStream == null) {
            throw new ProxyCacheException("Error reading data from " + this.awO.url + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, 8192);
        } catch (InterruptedIOException e) {
            throw new InterruptedProxyCacheException("Reading source " + this.awO.url + " is interrupted", e);
        } catch (IOException e2) {
            throw new ProxyCacheException("Error reading data from " + this.awO.url, e2);
        }
    }

    public final String toString() {
        return "HttpUrlSource{sourceInfo='" + this.awO + "}";
    }
}
