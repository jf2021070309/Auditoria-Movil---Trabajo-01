package com.fyber.inneractive.sdk.h;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* loaded from: classes.dex */
public final class f implements e {
    private HttpURLConnection a;
    private URL b;

    private g b() throws al, b {
        try {
            g gVar = new g(a(this.a), this.a.getResponseCode(), this.a.getHeaderFields(), this.a == null ? null : this.a.getHeaderField("Last-Modified"));
            if (gVar.a / 100 != 5) {
                return gVar;
            }
            throw new b(String.format("server returned error %d", Integer.valueOf(gVar.a)));
        } catch (b e) {
            IAlog.a("failed executing network request", e, new Object[0]);
            throw new b(e);
        } catch (Exception e2) {
            IAlog.a("failed reading network response", e2, new Object[0]);
            throw new al(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.h.e
    public final void a() {
        if (this.a != null) {
            IAlog.b("HttpExecutorImpl: disconnect: %s", this.b.toString());
            try {
                this.a.disconnect();
            } catch (Exception unused) {
                IAlog.b("HttpExecutorImpl: exception during disconnect: %s", this.b.toString());
            }
        }
        this.a = null;
    }

    private static InputStream a(URLConnection uRLConnection) {
        InputStream bufferedInputStream;
        try {
            InputStream inputStream = uRLConnection.getInputStream();
            if (TextUtils.equals("gzip", uRLConnection.getContentEncoding())) {
                IAlog.b("HttpExecutorImpl: getInputStream found gzip encoding", new Object[0]);
                bufferedInputStream = new GZIPInputStream(inputStream);
            } else {
                IAlog.b("HttpExecutorImpl: getInputStream no gzip encoding", new Object[0]);
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }

    private <T> void a(y<T> yVar) {
        Map<String, String> d = yVar.d();
        if (d != null) {
            for (String str : d.keySet()) {
                a(str, d.get(str));
            }
        }
    }

    private void a(String str, String str2) {
        if (this.a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        IAlog.a(IAlog.b, "%s %s : %s", "REQUEST_HEADER", str, str2);
        this.a.addRequestProperty(str, str2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|3|(3:8|9|10)|12|(1:14)(1:20)|15|16|17|9|10) */
    @Override // com.fyber.inneractive.sdk.h.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.h.g a(com.fyber.inneractive.sdk.h.y r5, java.lang.String r6, java.lang.String r7) throws java.lang.Exception {
        /*
            r4 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.lang.String r2 = r5.k()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r1.<init>(r2)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r4.b = r1     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r4.a = r1     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            com.fyber.inneractive.sdk.h.ak r2 = r5.q()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            int r3 = r2.a     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r1.setConnectTimeout(r3)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            int r2 = r2.b     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r1.setReadTimeout(r2)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.lang.String r1 = "User-Agent"
            r4.a(r1, r6)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.lang.String r6 = "If-Modified-Since"
            r4.a(r6, r7)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.lang.String r6 = "Accept-Encoding"
            java.lang.String r7 = "gzip"
            r4.a(r6, r7)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r4.a(r5)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            com.fyber.inneractive.sdk.h.u r6 = r5.c()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            com.fyber.inneractive.sdk.h.u r7 = com.fyber.inneractive.sdk.h.u.POST     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            if (r6 == r7) goto L4d
            com.fyber.inneractive.sdk.h.u r6 = r5.c()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            com.fyber.inneractive.sdk.h.u r7 = com.fyber.inneractive.sdk.h.u.PUT     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            if (r6 != r7) goto L47
            goto L4d
        L47:
            java.net.HttpURLConnection r5 = r4.a     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r5.connect()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            goto L93
        L4d:
            java.net.HttpURLConnection r6 = r4.a     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            com.fyber.inneractive.sdk.h.u r7 = r5.c()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.lang.String r7 = r7.e     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r6.setRequestMethod(r7)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.net.HttpURLConnection r6 = r4.a     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r7 = 1
            r6.setDoInput(r7)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.net.HttpURLConnection r6 = r4.a     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r6.setDoOutput(r7)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            byte[] r6 = r5.e()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            if (r6 == 0) goto L6b
            int r7 = r6.length     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            goto L6c
        L6b:
            r7 = r0
        L6c:
            java.net.HttpURLConnection r1 = r4.a     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.lang.String r2 = "Content-Length"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r1.setRequestProperty(r2, r7)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.net.HttpURLConnection r7 = r4.a     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.lang.String r1 = "Content-Type"
            java.lang.String r5 = r5.f()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r7.setRequestProperty(r1, r5)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.net.HttpURLConnection r5 = r4.a     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r5.connect()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.net.HttpURLConnection r5 = r4.a     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            java.io.OutputStream r5 = r5.getOutputStream()     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r5.write(r6)     // Catch: java.lang.Exception -> L98 java.net.MalformedURLException -> La6
            r5.close()     // Catch: java.lang.Throwable -> L93
        L93:
            com.fyber.inneractive.sdk.h.g r5 = r4.b()
            return r5
        L98:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r7 = "failed executing network request"
            com.fyber.inneractive.sdk.util.IAlog.a(r7, r5, r6)
            com.fyber.inneractive.sdk.h.b r6 = new com.fyber.inneractive.sdk.h.b
            r6.<init>(r5)
            throw r6
        La6:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r7 = "failed creating request URL"
            com.fyber.inneractive.sdk.util.IAlog.a(r7, r5, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.h.f.a(com.fyber.inneractive.sdk.h.y, java.lang.String, java.lang.String):com.fyber.inneractive.sdk.h.g");
    }
}
