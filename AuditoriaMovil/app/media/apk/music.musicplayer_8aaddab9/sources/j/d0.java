package j;

import j.r;
import java.io.Closeable;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class d0 implements Closeable {
    public final z a;

    /* renamed from: b  reason: collision with root package name */
    public final x f9207b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9208c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9209d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final q f9210e;

    /* renamed from: f  reason: collision with root package name */
    public final r f9211f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final f0 f9212g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final d0 f9213h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final d0 f9214i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final d0 f9215j;

    /* renamed from: k  reason: collision with root package name */
    public final long f9216k;

    /* renamed from: l  reason: collision with root package name */
    public final long f9217l;

    /* loaded from: classes.dex */
    public static class a {
        @Nullable
        public z a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public x f9218b;

        /* renamed from: c  reason: collision with root package name */
        public int f9219c;

        /* renamed from: d  reason: collision with root package name */
        public String f9220d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public q f9221e;

        /* renamed from: f  reason: collision with root package name */
        public r.a f9222f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public f0 f9223g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public d0 f9224h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        public d0 f9225i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public d0 f9226j;

        /* renamed from: k  reason: collision with root package name */
        public long f9227k;

        /* renamed from: l  reason: collision with root package name */
        public long f9228l;

        public a() {
            this.f9219c = -1;
            this.f9222f = new r.a();
        }

        public a(d0 d0Var) {
            this.f9219c = -1;
            this.a = d0Var.a;
            this.f9218b = d0Var.f9207b;
            this.f9219c = d0Var.f9208c;
            this.f9220d = d0Var.f9209d;
            this.f9221e = d0Var.f9210e;
            this.f9222f = d0Var.f9211f.e();
            this.f9223g = d0Var.f9212g;
            this.f9224h = d0Var.f9213h;
            this.f9225i = d0Var.f9214i;
            this.f9226j = d0Var.f9215j;
            this.f9227k = d0Var.f9216k;
            this.f9228l = d0Var.f9217l;
        }

        public d0 a() {
            if (this.a != null) {
                if (this.f9218b != null) {
                    if (this.f9219c >= 0) {
                        if (this.f9220d != null) {
                            return new d0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    StringBuilder y = e.a.d.a.a.y("code < 0: ");
                    y.append(this.f9219c);
                    throw new IllegalStateException(y.toString());
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public a b(@Nullable d0 d0Var) {
            if (d0Var != null) {
                c("cacheResponse", d0Var);
            }
            this.f9225i = d0Var;
            return this;
        }

        public final void c(String str, d0 d0Var) {
            if (d0Var.f9212g != null) {
                throw new IllegalArgumentException(e.a.d.a.a.k(str, ".body != null"));
            }
            if (d0Var.f9213h != null) {
                throw new IllegalArgumentException(e.a.d.a.a.k(str, ".networkResponse != null"));
            }
            if (d0Var.f9214i != null) {
                throw new IllegalArgumentException(e.a.d.a.a.k(str, ".cacheResponse != null"));
            }
            if (d0Var.f9215j != null) {
                throw new IllegalArgumentException(e.a.d.a.a.k(str, ".priorResponse != null"));
            }
        }

        public a d(r rVar) {
            this.f9222f = rVar.e();
            return this;
        }
    }

    public d0(a aVar) {
        this.a = aVar.a;
        this.f9207b = aVar.f9218b;
        this.f9208c = aVar.f9219c;
        this.f9209d = aVar.f9220d;
        this.f9210e = aVar.f9221e;
        this.f9211f = new r(aVar.f9222f);
        this.f9212g = aVar.f9223g;
        this.f9213h = aVar.f9224h;
        this.f9214i = aVar.f9225i;
        this.f9215j = aVar.f9226j;
        this.f9216k = aVar.f9227k;
        this.f9217l = aVar.f9228l;
    }

    public boolean a() {
        int i2 = this.f9208c;
        return i2 >= 200 && i2 < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f0 f0Var = this.f9212g;
        if (f0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        f0Var.close();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Response{protocol=");
        y.append(this.f9207b);
        y.append(", code=");
        y.append(this.f9208c);
        y.append(", message=");
        y.append(this.f9209d);
        y.append(", url=");
        y.append(this.a.a);
        y.append('}');
        return y.toString();
    }
}
