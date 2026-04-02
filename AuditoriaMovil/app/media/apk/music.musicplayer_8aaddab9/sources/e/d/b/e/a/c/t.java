package e.d.b.e.a.c;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public final class t extends s {
    public final s a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7011b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7012c;

    public t(s sVar, long j2, long j3) {
        this.a = sVar;
        long h2 = h(j2);
        this.f7011b = h2;
        this.f7012c = h(h2 + j3);
    }

    @Override // e.d.b.e.a.c.s
    public final long a() {
        return this.f7012c - this.f7011b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // e.d.b.e.a.c.s
    public final InputStream f(long j2, long j3) throws IOException {
        long h2 = h(this.f7011b);
        return this.a.f(h2, h(j3 + h2) - h2);
    }

    public final long h(long j2) {
        if (j2 < 0) {
            return 0L;
        }
        return j2 > this.a.a() ? this.a.a() : j2;
    }
}
