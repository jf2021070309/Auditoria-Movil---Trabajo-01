package com.amazon.aps.iva.y5;

import android.net.Uri;
import com.amazon.aps.iva.q5.c0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.w5.g;
import com.amazon.aps.iva.w5.i;
import com.amazon.aps.iva.w5.p;
import com.amazon.aps.iva.w5.q;
import com.amazon.aps.iva.w5.r;
import com.amazon.aps.iva.w5.s;
import com.amazon.aps.iva.w5.t;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.common.base.Predicate;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: OkHttpDataSource.java */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.w5.b {
    public final Call.Factory e;
    public final s f;
    public final String g;
    public final CacheControl h;
    public final s i;
    public final Predicate<String> j;
    public i k;
    public Response l;
    public InputStream m;
    public boolean n;
    public long o;
    public long p;

    /* compiled from: OkHttpDataSource.java */
    /* loaded from: classes.dex */
    public static final class a implements f.a {
        public final s a = new s();
        public final Call.Factory b;

        public a(Call.Factory factory) {
            this.b = factory;
        }

        @Override // com.amazon.aps.iva.w5.f.a
        public final f a() {
            return new b(this.b, this.a);
        }
    }

    static {
        c0.a("media3.datasource.okhttp");
    }

    public b(Call.Factory factory, s sVar) {
        super(true);
        factory.getClass();
        this.e = factory;
        this.g = null;
        this.h = null;
        this.i = sVar;
        this.j = null;
        this.f = new s();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws p {
        boolean z;
        RequestBody requestBody;
        String str;
        String str2;
        g gVar;
        this.k = iVar;
        long j = 0;
        this.p = 0L;
        this.o = 0L;
        o(iVar);
        long j2 = iVar.f;
        HttpUrl parse = HttpUrl.parse(iVar.a.toString());
        if (parse != null) {
            Request.Builder url = new Request.Builder().url(parse);
            CacheControl cacheControl = this.h;
            if (cacheControl != null) {
                url.cacheControl(cacheControl);
            }
            HashMap hashMap = new HashMap();
            s sVar = this.i;
            if (sVar != null) {
                hashMap.putAll(sVar.a());
            }
            hashMap.putAll(this.f.a());
            hashMap.putAll(iVar.e);
            for (Map.Entry entry : hashMap.entrySet()) {
                url.header((String) entry.getKey(), (String) entry.getValue());
            }
            long j3 = iVar.g;
            String a2 = t.a(j2, j3);
            if (a2 != null) {
                url.addHeader(HttpHeaders.RANGE, a2);
            }
            String str3 = this.g;
            if (str3 != null) {
                url.addHeader(HttpHeaders.USER_AGENT, str3);
            }
            if ((iVar.i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                url.addHeader(HttpHeaders.ACCEPT_ENCODING, "identity");
            }
            int i = iVar.c;
            byte[] bArr = iVar.d;
            if (bArr != null) {
                requestBody = RequestBody.create((MediaType) null, bArr);
            } else if (i == 2) {
                requestBody = RequestBody.create((MediaType) null, g0.e);
            } else {
                requestBody = null;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "HEAD";
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    str = "POST";
                }
            } else {
                str = "GET";
            }
            url.method(str, requestBody);
            Call newCall = this.e.newCall(url.build());
            try {
                SettableFuture create = SettableFuture.create();
                newCall.enqueue(new com.amazon.aps.iva.y5.a(create));
                try {
                    try {
                        Response response = (Response) create.get();
                        this.l = response;
                        ResponseBody body = response.body();
                        body.getClass();
                        this.m = body.byteStream();
                        int code = response.code();
                        boolean isSuccessful = response.isSuccessful();
                        long j4 = -1;
                        long j5 = iVar.f;
                        if (!isSuccessful) {
                            if (code == 416 && j5 == t.b(response.headers().get(HttpHeaders.CONTENT_RANGE))) {
                                this.n = true;
                                p(iVar);
                                if (j3 == -1) {
                                    return 0L;
                                }
                                return j3;
                            }
                            try {
                                InputStream inputStream = this.m;
                                inputStream.getClass();
                                g0.c0(inputStream);
                            } catch (IOException unused) {
                                int i2 = g0.a;
                            }
                            Map<String, List<String>> multimap = response.headers().toMultimap();
                            q();
                            if (code == 416) {
                                gVar = new g(2008);
                            } else {
                                gVar = null;
                            }
                            response.message();
                            throw new r(code, gVar, multimap, iVar);
                        }
                        MediaType contentType = body.contentType();
                        if (contentType != null) {
                            str2 = contentType.toString();
                        } else {
                            str2 = "";
                        }
                        Predicate<String> predicate = this.j;
                        if (predicate != null && !predicate.apply(str2)) {
                            q();
                            throw new q(str2, iVar);
                        }
                        if (code == 200 && j5 != 0) {
                            j = j5;
                        }
                        if (j3 != -1) {
                            this.o = j3;
                        } else {
                            long contentLength = body.contentLength();
                            if (contentLength != -1) {
                                j4 = contentLength - j;
                            }
                            this.o = j4;
                        }
                        this.n = true;
                        p(iVar);
                        try {
                            r(j, iVar);
                            return this.o;
                        } catch (p e) {
                            q();
                            throw e;
                        }
                    } catch (ExecutionException e2) {
                        throw new IOException(e2);
                    }
                } catch (InterruptedException unused2) {
                    newCall.cancel();
                    throw new InterruptedIOException();
                }
            } catch (IOException e3) {
                throw p.a(e3, iVar, 1);
            }
        }
        throw new p("Malformed URL", iVar, 1004);
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() {
        if (this.n) {
            this.n = false;
            n();
            q();
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Map<String, List<String>> d() {
        Response response = this.l;
        if (response == null) {
            return Collections.emptyMap();
        }
        return response.headers().toMultimap();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        Response response = this.l;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.request().url().toString());
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws p {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            if (j != -1) {
                long j2 = j - this.p;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.m;
            int i3 = g0.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.p += read;
                m(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            i iVar = this.k;
            int i4 = g0.a;
            throw p.a(e, iVar, 2);
        }
    }

    public final void q() {
        Response response = this.l;
        if (response != null) {
            ResponseBody body = response.body();
            body.getClass();
            body.close();
            this.l = null;
        }
        this.m = null;
    }

    public final void r(long j, i iVar) throws p {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                InputStream inputStream = this.m;
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
                    throw new InterruptedIOException();
                }
            } catch (IOException e) {
                if (e instanceof p) {
                    throw ((p) e);
                }
                throw new p(iVar, CastStatusCodes.AUTHENTICATION_FAILED);
            }
        }
    }
}
