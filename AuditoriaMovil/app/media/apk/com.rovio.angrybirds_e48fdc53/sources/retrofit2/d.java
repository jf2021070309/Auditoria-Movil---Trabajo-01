package retrofit2;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class d<T> implements Call<T> {
    private final h<T, ?> a;
    private final Object[] b;
    private volatile boolean c;
    private okhttp3.Call d;
    private Throwable e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(h<T, ?> hVar, Object[] objArr) {
        this.a = hVar;
        this.b = objArr;
    }

    @Override // retrofit2.Call
    /* renamed from: a */
    public d<T> mo25clone() {
        return new d<>(this.a, this.b);
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        Request request;
        okhttp3.Call call = this.d;
        if (call != null) {
            request = call.request();
        } else if (this.e != null) {
            if (this.e instanceof IOException) {
                throw new RuntimeException("Unable to create request.", this.e);
            }
            throw ((RuntimeException) this.e);
        } else {
            try {
                okhttp3.Call b2 = b();
                this.d = b2;
                request = b2.request();
            } catch (IOException e) {
                this.e = e;
                throw new RuntimeException("Unable to create request.", e);
            } catch (RuntimeException e2) {
                this.e = e2;
                throw e2;
            }
        }
        return request;
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        Throwable th;
        okhttp3.Call call;
        if (callback == null) {
            throw new NullPointerException("callback == null");
        }
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f = true;
            okhttp3.Call call2 = this.d;
            th = this.e;
            if (call2 == null && th == null) {
                call = b();
                this.d = call;
            } else {
                call = call2;
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.c) {
            call.cancel();
        }
        call.enqueue(new okhttp3.Callback() { // from class: retrofit2.d.1
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call3, okhttp3.Response response) {
                try {
                    a(d.this.a(response));
                } catch (Throwable th2) {
                    a(th2);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call3, IOException iOException) {
                try {
                    callback.onFailure(d.this, iOException);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }

            private void a(Throwable th2) {
                try {
                    callback.onFailure(d.this, th2);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }

            private void a(Response<T> response) {
                try {
                    callback.onResponse(d.this, response);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.f;
    }

    @Override // retrofit2.Call
    public Response<T> execute() {
        okhttp3.Call call;
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f = true;
            if (this.e != null) {
                if (this.e instanceof IOException) {
                    throw ((IOException) this.e);
                }
                throw ((RuntimeException) this.e);
            }
            call = this.d;
            if (call == null) {
                try {
                    call = b();
                    this.d = call;
                } catch (IOException | RuntimeException e) {
                    this.e = e;
                    throw e;
                }
            }
        }
        if (this.c) {
            call.cancel();
        }
        return a(call.execute());
    }

    private okhttp3.Call b() {
        okhttp3.Call newCall = this.a.c.newCall(this.a.a(this.b));
        if (newCall == null) {
            throw new NullPointerException("Call.Factory returned null.");
        }
        return newCall;
    }

    Response<T> a(okhttp3.Response response) {
        ResponseBody body = response.body();
        okhttp3.Response build = response.newBuilder().body(new b(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return Response.error(i.a(body), build);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return Response.success((Object) null, build);
        } else {
            a aVar = new a(body);
            try {
                return Response.success(this.a.a(aVar), build);
            } catch (RuntimeException e) {
                aVar.a();
                throw e;
            }
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.Call call;
        this.c = true;
        synchronized (this) {
            call = this.d;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (!this.c) {
            synchronized (this) {
                z = (this.d == null || !this.d.isCanceled()) ? false : false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends ResponseBody {
        private final MediaType a;
        private final long b;

        b(MediaType mediaType, long j) {
            this.a = mediaType;
            this.b = j;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.a;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.b;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends ResponseBody {
        IOException a;
        private final ResponseBody b;

        a(ResponseBody responseBody) {
            this.b = responseBody;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.b.contentType();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.b.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return Okio.buffer(new ForwardingSource(this.b.source()) { // from class: retrofit2.d.a.1
                @Override // okio.ForwardingSource, okio.Source
                public long read(Buffer buffer, long j) {
                    try {
                        return super.read(buffer, j);
                    } catch (IOException e) {
                        a.this.a = e;
                        throw e;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        void a() {
            if (this.a != null) {
                throw this.a;
            }
        }
    }
}
