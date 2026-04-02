package com.amazon.aps.iva.w5;

import android.net.Uri;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.f;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaStatus;
import com.google.common.base.Predicate;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: DefaultHttpDataSource.java */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.w5.b {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final s i;
    public final s j;
    public final boolean k;
    public final Predicate<String> l;
    public i m;
    public HttpURLConnection n;
    public InputStream o;
    public boolean p;
    public int q;
    public long r;
    public long s;

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: classes.dex */
    public static final class a implements f.a {
        public String b;
        public final s a = new s();
        public final int c = 8000;
        public final int d = 8000;

        @Override // com.amazon.aps.iva.w5.f.a
        public final f a() {
            return new k(this.b, this.c, this.d, this.a);
        }
    }

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: classes.dex */
    public static class b extends ForwardingMap<String, List<String>> {
        public final Map<String, List<String>> b;

        public b(Map<String, List<String>> map) {
            this.b = map;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean containsKey(Object obj) {
            if (obj != null && super.containsKey(obj)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean containsValue(Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object delegate() {
            return this.b;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return Sets.filter(super.entrySet(), new l());
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean equals(Object obj) {
            if (obj != null && super.standardEquals(obj)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final int hashCode() {
            return super.standardHashCode();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            if (super.size() == 1 && super.containsKey(null)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set<String> keySet() {
            return Sets.filter(super.keySet(), new m());
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Map<String, List<String>> delegate() {
            return this.b;
        }
    }

    public k(String str, int i, int i2, s sVar) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = false;
        this.i = sVar;
        this.l = null;
        this.j = new s();
        this.k = false;
    }

    public static void u(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = g0.a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= MediaStatus.COMMAND_QUEUE_REPEAT_ONE) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    @Override // com.amazon.aps.iva.w5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.amazon.aps.iva.w5.i r18) throws com.amazon.aps.iva.w5.p {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.w5.k.b(com.amazon.aps.iva.w5.i):long");
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws p {
        try {
            InputStream inputStream = this.o;
            if (inputStream != null) {
                long j = this.r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.s;
                }
                u(this.n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    i iVar = this.m;
                    int i = g0.a;
                    throw new p(e, iVar, (int) CastStatusCodes.AUTHENTICATION_FAILED, 3);
                }
            }
        } finally {
            this.o = null;
            q();
            if (this.p) {
                this.p = false;
                n();
            }
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Map<String, List<String>> d() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return ImmutableMap.of();
        }
        return new b(httpURLConnection.getHeaderFields());
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws p {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.r;
            if (j != -1) {
                long j2 = j - this.s;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.o;
            int i3 = g0.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.s += read;
                m(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            i iVar = this.m;
            int i4 = g0.a;
            throw p.a(e, iVar, 2);
        }
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.amazon.aps.iva.t5.p.d("Unexpected error while disconnecting", e);
            }
            this.n = null;
        }
    }

    public final URL r(URL url, String str, i iVar) throws p {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new p(com.amazon.aps.iva.oa.a.a("Unsupported protocol redirect: ", protocol), iVar, CastStatusCodes.INVALID_REQUEST);
                }
                if (!this.e && !protocol.equals(url.getProtocol())) {
                    throw new p("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", iVar, CastStatusCodes.INVALID_REQUEST);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new p(e, iVar, (int) CastStatusCodes.INVALID_REQUEST, 1);
            }
        }
        throw new p("Null location redirect", iVar, CastStatusCodes.INVALID_REQUEST);
    }

    public final HttpURLConnection s(i iVar) throws IOException {
        boolean z;
        HttpURLConnection t;
        boolean z2;
        URL url = new URL(iVar.a.toString());
        int i = iVar.c;
        byte[] bArr = iVar.d;
        long j = iVar.f;
        long j2 = iVar.g;
        if ((iVar.i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.e;
        boolean z4 = this.k;
        if (!z3 && !z4) {
            return t(url, i, bArr, j, j2, z, true, iVar.e);
        }
        URL url2 = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                long j3 = j;
                long j4 = j;
                URL url3 = url2;
                int i5 = i2;
                boolean z5 = z4;
                long j5 = j2;
                t = t(url2, i2, bArr2, j3, j2, z, false, iVar.e);
                int responseCode = t.getResponseCode();
                String headerField = t.getHeaderField(HttpHeaders.LOCATION);
                if ((i5 != 1 && i5 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    t.disconnect();
                    if (z5 && responseCode == 302) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        bArr2 = null;
                        i2 = 1;
                    } else {
                        i2 = i5;
                    }
                    url2 = r(url3, headerField, iVar);
                } else {
                    t.disconnect();
                    url2 = r(url3, headerField, iVar);
                    i2 = i5;
                }
                i3 = i4;
                j = j4;
                z4 = z5;
                j2 = j5;
            } else {
                throw new p(new NoRouteToHostException(c0.a("Too many redirects: ", i4)), iVar, (int) CastStatusCodes.INVALID_REQUEST, 1);
            }
        }
        return t;
    }

    public final HttpURLConnection t(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String str;
        boolean z3;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        s sVar = this.i;
        if (sVar != null) {
            hashMap.putAll(sVar.a());
        }
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a2 = t.a(j, j2);
        if (a2 != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.RANGE, a2);
        }
        String str3 = this.h;
        if (str3 != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str3);
        }
        if (z) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, str);
        httpURLConnection.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        httpURLConnection.setDoOutput(z3);
        int i2 = i.k;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void v(long j, i iVar) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            InputStream inputStream = this.o;
            int i = g0.a;
            int read = inputStream.read(bArr, 0, (int) Math.min(j, 4096));
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j -= read;
                    m(read);
                } else {
                    throw new p(iVar, 2008);
                }
            } else {
                throw new p(new InterruptedIOException(), iVar, (int) CastStatusCodes.AUTHENTICATION_FAILED, 1);
            }
        }
    }
}
