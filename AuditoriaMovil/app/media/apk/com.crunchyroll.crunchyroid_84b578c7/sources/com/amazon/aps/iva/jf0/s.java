package com.amazon.aps.iva.jf0;

import com.amazon.aps.iva.jf0.y;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: OkHttpCall.java */
/* loaded from: classes4.dex */
public final class s<T> implements com.amazon.aps.iva.jf0.b<T> {
    public final z b;
    public final Object[] c;
    public final Call.Factory d;
    public final f<ResponseBody, T> e;
    public volatile boolean f;
    public Call g;
    public Throwable h;
    public boolean i;

    /* compiled from: OkHttpCall.java */
    /* loaded from: classes4.dex */
    public class a implements Callback {
        public final /* synthetic */ d b;

        public a(d dVar) {
            this.b = dVar;
        }

        @Override // okhttp3.Callback
        public final void onFailure(Call call, IOException iOException) {
            try {
                this.b.onFailure(s.this, iOException);
            } catch (Throwable th) {
                f0.m(th);
                th.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public final void onResponse(Call call, Response response) {
            d dVar = this.b;
            s sVar = s.this;
            try {
                try {
                    dVar.onResponse(sVar, sVar.c(response));
                } catch (Throwable th) {
                    f0.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                f0.m(th2);
                try {
                    dVar.onFailure(sVar, th2);
                } catch (Throwable th3) {
                    f0.m(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* compiled from: OkHttpCall.java */
    /* loaded from: classes4.dex */
    public static final class b extends ResponseBody {
        public final ResponseBody b;
        public final com.amazon.aps.iva.ef0.x c;
        public IOException d;

        /* compiled from: OkHttpCall.java */
        /* loaded from: classes4.dex */
        public class a extends com.amazon.aps.iva.ef0.l {
            public a(com.amazon.aps.iva.ef0.h hVar) {
                super(hVar);
            }

            @Override // com.amazon.aps.iva.ef0.l, com.amazon.aps.iva.ef0.d0
            public final long read(com.amazon.aps.iva.ef0.e eVar, long j) throws IOException {
                try {
                    return super.read(eVar, j);
                } catch (IOException e) {
                    b.this.d = e;
                    throw e;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.b = responseBody;
            this.c = com.amazon.aps.iva.ef0.r.b(new a(responseBody.source()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.b.close();
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.b.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.b.contentType();
        }

        @Override // okhttp3.ResponseBody
        public final com.amazon.aps.iva.ef0.h source() {
            return this.c;
        }
    }

    /* compiled from: OkHttpCall.java */
    /* loaded from: classes4.dex */
    public static final class c extends ResponseBody {
        public final MediaType b;
        public final long c;

        public c(MediaType mediaType, long j) {
            this.b = mediaType;
            this.c = j;
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.c;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.b;
        }

        @Override // okhttp3.ResponseBody
        public final com.amazon.aps.iva.ef0.h source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public s(z zVar, Object[] objArr, Call.Factory factory, f<ResponseBody, T> fVar) {
        this.b = zVar;
        this.c = objArr;
        this.d = factory;
        this.e = fVar;
    }

    public final Call a() throws IOException {
        HttpUrl resolve;
        z zVar = this.b;
        zVar.getClass();
        Object[] objArr = this.c;
        int length = objArr.length;
        w<?>[] wVarArr = zVar.j;
        if (length == wVarArr.length) {
            y yVar = new y(zVar.c, zVar.b, zVar.d, zVar.e, zVar.f, zVar.g, zVar.h, zVar.i);
            if (zVar.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                wVarArr[i].a(yVar, objArr[i]);
            }
            HttpUrl.Builder builder = yVar.d;
            if (builder != null) {
                resolve = builder.build();
            } else {
                String str = yVar.c;
                HttpUrl httpUrl = yVar.b;
                resolve = httpUrl.resolve(str);
                if (resolve == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + yVar.c);
                }
            }
            y.a aVar = yVar.k;
            if (aVar == null) {
                FormBody.Builder builder2 = yVar.j;
                if (builder2 != null) {
                    aVar = builder2.build();
                } else {
                    MultipartBody.Builder builder3 = yVar.i;
                    if (builder3 != null) {
                        aVar = builder3.build();
                    } else if (yVar.h) {
                        aVar = RequestBody.create((MediaType) null, new byte[0]);
                    }
                }
            }
            MediaType mediaType = yVar.g;
            Headers.Builder builder4 = yVar.f;
            if (mediaType != null) {
                if (aVar != null) {
                    aVar = new y.a(aVar, mediaType);
                } else {
                    builder4.add(HttpHeaders.CONTENT_TYPE, mediaType.toString());
                }
            }
            Call newCall = this.d.newCall(yVar.e.url(resolve).headers(builder4.build()).method(yVar.a, aVar).tag(k.class, new k(zVar.a, arrayList)).build());
            if (newCall != null) {
                return newCall;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(defpackage.e.f(com.amazon.aps.iva.e4.e.d("Argument count (", length, ") doesn't match expected count ("), wVarArr.length, ")"));
    }

    public final Call b() throws IOException {
        Call call = this.g;
        if (call != null) {
            return call;
        }
        Throwable th = this.h;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            Call a2 = a();
            this.g = a2;
            return a2;
        } catch (IOException | Error | RuntimeException e) {
            f0.m(e);
            this.h = e;
            throw e;
        }
    }

    public final a0<T> c(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                b bVar = new b(body);
                try {
                    T convert = this.e.convert(bVar);
                    if (build.isSuccessful()) {
                        return new a0<>(build, convert);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e) {
                    IOException iOException = bVar.d;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
            body.close();
            if (build.isSuccessful()) {
                return new a0<>(build, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            com.amazon.aps.iva.ef0.e eVar = new com.amazon.aps.iva.ef0.e();
            body.source().W(eVar);
            Objects.requireNonNull(ResponseBody.create(body.contentType(), body.contentLength(), eVar), "body == null");
            if (!build.isSuccessful()) {
                return new a0<>(build, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            body.close();
        }
    }

    @Override // com.amazon.aps.iva.jf0.b
    public final void cancel() {
        Call call;
        this.f = true;
        synchronized (this) {
            call = this.g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.amazon.aps.iva.jf0.b
    public final com.amazon.aps.iva.jf0.b clone() {
        return new s(this.b, this.c, this.d, this.e);
    }

    @Override // com.amazon.aps.iva.jf0.b
    public final a0<T> execute() throws IOException {
        Call b2;
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                b2 = b();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f) {
            b2.cancel();
        }
        return c(b2.execute());
    }

    @Override // com.amazon.aps.iva.jf0.b
    public final boolean isCanceled() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            Call call = this.g;
            if (call == null || !call.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.jf0.b
    public final void n(d<T> dVar) {
        Call call;
        Throwable th;
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                call = this.g;
                th = this.h;
                if (call == null && th == null) {
                    Call a2 = a();
                    this.g = a2;
                    call = a2;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.onFailure(this, th);
            return;
        }
        if (this.f) {
            call.cancel();
        }
        call.enqueue(new a(dVar));
    }

    @Override // com.amazon.aps.iva.jf0.b
    public final synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().request();
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final Object m20clone() throws CloneNotSupportedException {
        return new s(this.b, this.c, this.d, this.e);
    }
}
