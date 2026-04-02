package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a extends t {
    private static final long h;
    private static final long i;
    static a j;
    private boolean e;
    private a f;
    private long g;

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0020a implements r {
        final /* synthetic */ r a;

        C0020a(r rVar) {
            this.a = rVar;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
        public t b() {
            return a.this;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
        public void b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            try {
                u.a(cVar.b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    o oVar = cVar.a;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += oVar.c - oVar.b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        oVar = oVar.f;
                    }
                    a.this.g();
                    try {
                        try {
                            this.a.b(cVar, j2);
                            j -= j2;
                            a.this.a(true);
                        } catch (IOException e) {
                            throw a.this.a(e);
                        }
                    } catch (Throwable th) {
                        a.this.a(false);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.g();
            try {
                try {
                    this.a.close();
                    a.this.a(true);
                } catch (IOException e) {
                    throw a.this.a(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.g();
            try {
                try {
                    this.a.flush();
                    a.this.a(true);
                } catch (IOException e) {
                    throw a.this.a(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.a + ")";
        }
    }

    /* loaded from: classes.dex */
    class b implements s {
        final /* synthetic */ s a;

        b(s sVar) {
            this.a = sVar;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
        public long a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            a.this.g();
            try {
                try {
                    long a = this.a.a(cVar, j);
                    a.this.a(true);
                    return a;
                } catch (IOException e) {
                    throw a.this.a(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
        public t b() {
            return a.this;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.g();
            try {
                try {
                    this.a.close();
                    a.this.a(true);
                } catch (IOException e) {
                    throw a.this.a(e);
                }
            } catch (Throwable th) {
                a.this.a(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
            r0.i();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r2 = this;
            L0:
                java.lang.Class<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a> r0 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L24
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.j()     // Catch: java.lang.Throwable -> L1f
                if (r0 != 0) goto Ld
                java.lang.Class<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a> r0 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.class
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                goto L0
            Ld:
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a r1 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.j     // Catch: java.lang.Throwable -> L1f
                if (r0 != r1) goto L18
                r0 = 0
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.j = r0     // Catch: java.lang.Throwable -> L1f
                java.lang.Class<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a> r0 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.class
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                return
            L18:
                java.lang.Class<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a> r1 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.class
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
                r0.i()     // Catch: java.lang.InterruptedException -> L24
                goto L0
            L1f:
                r0 = move-exception
                java.lang.Class<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a> r1 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.class
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
                throw r0     // Catch: java.lang.InterruptedException -> L24
            L24:
                r0 = move-exception
                goto L0
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private static void a(a aVar, long j2, boolean z) {
        synchronized (a.class) {
            if (j == null) {
                j = new a();
                c cVar = new c();
                cVar.setName("gm_t_watch_dog");
                try {
                    cVar.start();
                } catch (Throwable th) {
                }
            }
            long nanoTime = System.nanoTime();
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i2 != 0 && z) {
                aVar.g = Math.min(j2, aVar.c() - nanoTime) + nanoTime;
            } else if (i2 != 0) {
                aVar.g = j2 + nanoTime;
            } else if (!z) {
                throw new AssertionError();
            } else {
                aVar.g = aVar.c();
            }
            long b2 = aVar.b(nanoTime);
            a aVar2 = j;
            while (true) {
                a aVar3 = aVar2.f;
                if (aVar3 == null || b2 < aVar3.b(nanoTime)) {
                    break;
                }
                aVar2 = aVar2.f;
            }
            aVar.f = aVar2.f;
            aVar2.f = aVar;
            if (aVar2 == j) {
                a.class.notify();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1.f = r3.f;
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a r3) {
        /*
            java.lang.Class<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a> r0 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.class
            monitor-enter(r0)
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a r1 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.j     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L16
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a r2 = r1.f     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L14
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a r2 = r3.f     // Catch: java.lang.Throwable -> L19
            r1.f = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
            goto L17
        L14:
            r1 = r2
            goto L5
        L16:
            r3 = 1
        L17:
            monitor-exit(r0)
            return r3
        L19:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a):boolean");
    }

    private long b(long j2) {
        return this.g - j2;
    }

    static a j() throws InterruptedException {
        a aVar = j.f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            a.class.wait(h);
            if (j.f == null && System.nanoTime() - nanoTime >= i) {
                return j;
            }
        } else {
            long b2 = aVar.b(nanoTime);
            if (b2 <= 0) {
                j.f = aVar.f;
                aVar.f = null;
                return aVar;
            }
            long j2 = b2 / 1000000;
            a.class.wait(j2, (int) (b2 - (1000000 * j2)));
        }
        return null;
    }

    public final r a(r rVar) {
        return new C0020a(rVar);
    }

    public final s a(s sVar) {
        return new b(sVar);
    }

    final IOException a(IOException iOException) throws IOException {
        return !h() ? iOException : b(iOException);
    }

    final void a(boolean z) throws IOException {
        if (h() && z) {
            throw b((IOException) null);
        }
    }

    protected IOException b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void g() {
        if (this.e) {
            return;
        }
        long f = f();
        boolean d = d();
        if (f != 0 || d) {
            this.e = true;
            a(this, f, d);
        }
    }

    public final boolean h() {
        if (this.e) {
            this.e = false;
            return a(this);
        }
        return false;
    }

    protected void i() {
    }
}
