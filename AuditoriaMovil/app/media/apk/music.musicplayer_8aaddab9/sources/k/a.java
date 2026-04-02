package k;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class a extends y {

    /* renamed from: e  reason: collision with root package name */
    public static final C0213a f9611e = new C0213a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final long f9612f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f9613g;

    /* renamed from: h  reason: collision with root package name */
    public static a f9614h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9615i;

    /* renamed from: j  reason: collision with root package name */
    public a f9616j;

    /* renamed from: k  reason: collision with root package name */
    public long f9617k;

    /* renamed from: k.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0213a {
        public C0213a(h.o.c.f fVar) {
        }

        public final a a() throws InterruptedException {
            a aVar = a.f9614h;
            h.o.c.j.c(aVar);
            a aVar2 = aVar.f9616j;
            if (aVar2 == null) {
                long nanoTime = System.nanoTime();
                a.class.wait(a.f9612f);
                a aVar3 = a.f9614h;
                h.o.c.j.c(aVar3);
                if (aVar3.f9616j != null || System.nanoTime() - nanoTime < a.f9613g) {
                    return null;
                }
                return a.f9614h;
            }
            long nanoTime2 = aVar2.f9617k - System.nanoTime();
            if (nanoTime2 > 0) {
                long j2 = nanoTime2 / 1000000;
                a.class.wait(j2, (int) (nanoTime2 - (1000000 * j2)));
                return null;
            }
            a aVar4 = a.f9614h;
            h.o.c.j.c(aVar4);
            aVar4.f9616j = aVar2.f9616j;
            aVar2.f9616j = null;
            return aVar2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a a;
            while (true) {
                try {
                    synchronized (a.class) {
                        a = a.f9611e.a();
                        if (a == a.f9614h) {
                            a.f9614h = null;
                            return;
                        }
                    }
                    if (a != null) {
                        a.k();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f9612f = millis;
        f9613g = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j2 = this.f9653d;
        boolean z = this.f9651b;
        if (j2 != 0 || z) {
            synchronized (a.class) {
                if (!(!this.f9615i)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f9615i = true;
                if (f9614h == null) {
                    f9614h = new a();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    this.f9617k = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f9617k = j2 + nanoTime;
                } else if (!z) {
                    throw new AssertionError();
                } else {
                    this.f9617k = c();
                }
                long j3 = this.f9617k - nanoTime;
                a aVar = f9614h;
                h.o.c.j.c(aVar);
                while (true) {
                    a aVar2 = aVar.f9616j;
                    if (aVar2 == null) {
                        break;
                    }
                    h.o.c.j.c(aVar2);
                    if (j3 < aVar2.f9617k - nanoTime) {
                        break;
                    }
                    aVar = aVar.f9616j;
                    h.o.c.j.c(aVar);
                }
                this.f9616j = aVar.f9616j;
                aVar.f9616j = this;
                if (aVar == f9614h) {
                    a.class.notify();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
        r1.f9616j = r4.f9616j;
        r4.f9616j = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            r4 = this;
            java.lang.Class<k.a> r0 = k.a.class
            monitor-enter(r0)
            boolean r1 = r4.f9615i     // Catch: java.lang.Throwable -> L22
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)
            goto L21
        La:
            r4.f9615i = r2     // Catch: java.lang.Throwable -> L22
            k.a r1 = k.a.f9614h     // Catch: java.lang.Throwable -> L22
        Le:
            if (r1 == 0) goto L1f
            k.a r3 = r1.f9616j     // Catch: java.lang.Throwable -> L22
            if (r3 != r4) goto L1d
            k.a r3 = r4.f9616j     // Catch: java.lang.Throwable -> L22
            r1.f9616j = r3     // Catch: java.lang.Throwable -> L22
            r1 = 0
            r4.f9616j = r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L21
        L1d:
            r1 = r3
            goto Le
        L1f:
            r2 = 1
            monitor-exit(r0)
        L21:
            return r2
        L22:
            r1 = move-exception
            monitor-exit(r0)
            goto L26
        L25:
            throw r1
        L26:
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: k.a.i():boolean");
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
