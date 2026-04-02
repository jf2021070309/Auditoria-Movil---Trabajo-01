package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
/* loaded from: classes4.dex */
final class a implements Call {
    final OkHttpClient a;
    final RetryAndFollowUpInterceptor b;
    final Request c;
    final boolean d;
    private boolean e;

    a(OkHttpClient okHttpClient, Request request, boolean z) {
        this.a = okHttpClient;
        this.c = request;
        this.d = z;
        this.b = new RetryAndFollowUpInterceptor(okHttpClient, z);
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.c;
    }

    @Override // okhttp3.Call
    public Response execute() {
        synchronized (this) {
            if (this.e) {
                throw new IllegalStateException("Already Executed");
            }
            this.e = true;
        }
        f();
        try {
            this.a.dispatcher().a(this);
            Response e = e();
            if (e == null) {
                throw new IOException("Canceled");
            }
            return e;
        } finally {
            this.a.dispatcher().b(this);
        }
    }

    private void f() {
        this.b.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
        synchronized (this) {
            if (this.e) {
                throw new IllegalStateException("Already Executed");
            }
            this.e = true;
        }
        f();
        this.a.dispatcher().a(new C0338a(callback));
    }

    @Override // okhttp3.Call
    public void cancel() {
        this.b.cancel();
    }

    @Override // okhttp3.Call
    public synchronized boolean isExecuted() {
        return this.e;
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.b.isCanceled();
    }

    @Override // okhttp3.Call
    /* renamed from: a */
    public a mo23clone() {
        return new a(this.a, this.c, this.d);
    }

    StreamAllocation b() {
        return this.b.streamAllocation();
    }

    /* renamed from: okhttp3.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    final class C0338a extends NamedRunnable {
        private final Callback b;

        C0338a(Callback callback) {
            super("OkHttp %s", a.this.d());
            this.b = callback;
        }

        String a() {
            return a.this.c.url().host();
        }

        a b() {
            return a.this;
        }

        @Override // okhttp3.internal.NamedRunnable
        protected void execute() {
            Response e;
            boolean z = true;
            try {
                try {
                    e = a.this.e();
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                }
                try {
                    if (a.this.b.isCanceled()) {
                        this.b.onFailure(a.this, new IOException("Canceled"));
                    } else {
                        this.b.onResponse(a.this, e);
                    }
                } catch (IOException e3) {
                    e = e3;
                    if (z) {
                        Platform.get().log(4, "Callback failure for " + a.this.c(), e);
                    } else {
                        this.b.onFailure(a.this, e);
                    }
                }
            } finally {
                a.this.a.dispatcher().b(this);
            }
        }
    }

    String c() {
        return (isCanceled() ? "canceled " : "") + (this.d ? "web socket" : "call") + " to " + d();
    }

    String d() {
        return this.c.url().redact();
    }

    Response e() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.interceptors());
        arrayList.add(this.b);
        arrayList.add(new BridgeInterceptor(this.a.cookieJar()));
        arrayList.add(new CacheInterceptor(this.a.a()));
        arrayList.add(new ConnectInterceptor(this.a));
        if (!this.d) {
            arrayList.addAll(this.a.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.d));
        return new RealInterceptorChain(arrayList, (StreamAllocation) null, (HttpCodec) null, (Connection) null, 0, this.c).proceed(this.c);
    }
}
