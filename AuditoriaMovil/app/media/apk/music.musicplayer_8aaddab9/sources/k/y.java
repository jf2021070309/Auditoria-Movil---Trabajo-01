package k;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class y {
    public static final y a = new a();

    /* renamed from: b  reason: collision with root package name */
    public boolean f9651b;

    /* renamed from: c  reason: collision with root package name */
    public long f9652c;

    /* renamed from: d  reason: collision with root package name */
    public long f9653d;

    /* loaded from: classes2.dex */
    public static final class a extends y {
        @Override // k.y
        public y d(long j2) {
            return this;
        }

        @Override // k.y
        public void f() {
        }

        @Override // k.y
        public y g(long j2, TimeUnit timeUnit) {
            h.o.c.j.e(timeUnit, "unit");
            return this;
        }
    }

    public y a() {
        this.f9651b = false;
        return this;
    }

    public y b() {
        this.f9653d = 0L;
        return this;
    }

    public long c() {
        if (this.f9651b) {
            return this.f9652c;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public y d(long j2) {
        this.f9651b = true;
        this.f9652c = j2;
        return this;
    }

    public boolean e() {
        return this.f9651b;
    }

    public void f() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f9651b && this.f9652c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j2, TimeUnit timeUnit) {
        h.o.c.j.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f9653d = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(h.o.c.j.i("timeout < 0: ", Long.valueOf(j2)).toString());
    }
}
