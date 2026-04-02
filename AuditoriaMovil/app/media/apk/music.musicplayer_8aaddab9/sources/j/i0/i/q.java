package j.i0.i;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nullable;
import k.x;
import k.y;
/* loaded from: classes.dex */
public final class q {
    public long a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f9460b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9461c;

    /* renamed from: d  reason: collision with root package name */
    public final g f9462d;

    /* renamed from: e  reason: collision with root package name */
    public final Deque<j.r> f9463e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9464f;

    /* renamed from: g  reason: collision with root package name */
    public final b f9465g;

    /* renamed from: h  reason: collision with root package name */
    public final a f9466h;

    /* renamed from: i  reason: collision with root package name */
    public final c f9467i;

    /* renamed from: j  reason: collision with root package name */
    public final c f9468j;

    /* renamed from: k  reason: collision with root package name */
    public j.i0.i.b f9469k;

    /* loaded from: classes2.dex */
    public final class a implements k.v {
        public final k.d a = new k.d();

        /* renamed from: b  reason: collision with root package name */
        public boolean f9470b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9471c;

        public a() {
        }

        @Override // k.v
        public void E(k.d dVar, long j2) throws IOException {
            this.a.E(dVar, j2);
            while (this.a.f9620b >= 16384) {
                a(false);
            }
        }

        public final void a(boolean z) throws IOException {
            q qVar;
            long min;
            q qVar2;
            synchronized (q.this) {
                q.this.f9468j.h();
                while (true) {
                    qVar = q.this;
                    if (qVar.f9460b > 0 || this.f9471c || this.f9470b || qVar.f9469k != null) {
                        break;
                    }
                    qVar.j();
                }
                qVar.f9468j.l();
                q.this.b();
                min = Math.min(q.this.f9460b, this.a.f9620b);
                qVar2 = q.this;
                qVar2.f9460b -= min;
            }
            qVar2.f9468j.h();
            try {
                q qVar3 = q.this;
                qVar3.f9462d.z(qVar3.f9461c, z && min == this.a.f9620b, this.a, min);
            } finally {
                q.this.f9468j.l();
            }
        }

        @Override // k.v
        public y c() {
            return q.this.f9468j;
        }

        @Override // k.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (q.this) {
                if (this.f9470b) {
                    return;
                }
                q qVar = q.this;
                if (!qVar.f9466h.f9471c) {
                    if (this.a.f9620b > 0) {
                        while (this.a.f9620b > 0) {
                            a(true);
                        }
                    } else {
                        qVar.f9462d.z(qVar.f9461c, true, null, 0L);
                    }
                }
                synchronized (q.this) {
                    this.f9470b = true;
                }
                q.this.f9462d.w.flush();
                q.this.a();
            }
        }

        @Override // k.v, java.io.Flushable
        public void flush() throws IOException {
            synchronized (q.this) {
                q.this.b();
            }
            while (this.a.f9620b > 0) {
                a(false);
                q.this.f9462d.flush();
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements x {
        public final k.d a = new k.d();

        /* renamed from: b  reason: collision with root package name */
        public final k.d f9473b = new k.d();

        /* renamed from: c  reason: collision with root package name */
        public final long f9474c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9475d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9476e;

        public b(long j2) {
            this.f9474c = j2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
            r12 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
            r11.f9477f.f9467i.l();
         */
        @Override // k.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long S(k.d r12, long r13) throws java.io.IOException {
            /*
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto La5
            L6:
                r2 = 0
                j.i0.i.q r3 = j.i0.i.q.this
                monitor-enter(r3)
                j.i0.i.q r4 = j.i0.i.q.this     // Catch: java.lang.Throwable -> La2
                j.i0.i.q$c r4 = r4.f9467i     // Catch: java.lang.Throwable -> La2
                r4.h()     // Catch: java.lang.Throwable -> La2
                j.i0.i.q r4 = j.i0.i.q.this     // Catch: java.lang.Throwable -> L99
                j.i0.i.b r5 = r4.f9469k     // Catch: java.lang.Throwable -> L99
                if (r5 == 0) goto L18
                r2 = r5
            L18:
                boolean r5 = r11.f9475d     // Catch: java.lang.Throwable -> L99
                if (r5 != 0) goto L91
                java.util.Deque<j.r> r4 = r4.f9463e     // Catch: java.lang.Throwable -> L99
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L99
                if (r4 != 0) goto L29
                j.i0.i.q r4 = j.i0.i.q.this     // Catch: java.lang.Throwable -> L99
                java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L99
            L29:
                k.d r4 = r11.f9473b     // Catch: java.lang.Throwable -> L99
                long r5 = r4.f9620b     // Catch: java.lang.Throwable -> L99
                r7 = -1
                int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r9 <= 0) goto L63
                long r13 = java.lang.Math.min(r13, r5)     // Catch: java.lang.Throwable -> L99
                long r12 = r4.S(r12, r13)     // Catch: java.lang.Throwable -> L99
                j.i0.i.q r14 = j.i0.i.q.this     // Catch: java.lang.Throwable -> L99
                long r4 = r14.a     // Catch: java.lang.Throwable -> L99
                long r4 = r4 + r12
                r14.a = r4     // Catch: java.lang.Throwable -> L99
                if (r2 != 0) goto L78
                j.i0.i.g r14 = r14.f9462d     // Catch: java.lang.Throwable -> L99
                j.i0.i.u r14 = r14.t     // Catch: java.lang.Throwable -> L99
                int r14 = r14.a()     // Catch: java.lang.Throwable -> L99
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> L99
                int r14 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r14 < 0) goto L78
                j.i0.i.q r14 = j.i0.i.q.this     // Catch: java.lang.Throwable -> L99
                j.i0.i.g r4 = r14.f9462d     // Catch: java.lang.Throwable -> L99
                int r5 = r14.f9461c     // Catch: java.lang.Throwable -> L99
                long r9 = r14.a     // Catch: java.lang.Throwable -> L99
                r4.I(r5, r9)     // Catch: java.lang.Throwable -> L99
                j.i0.i.q r14 = j.i0.i.q.this     // Catch: java.lang.Throwable -> L99
                r14.a = r0     // Catch: java.lang.Throwable -> L99
                goto L78
            L63:
                boolean r4 = r11.f9476e     // Catch: java.lang.Throwable -> L99
                if (r4 != 0) goto L77
                if (r2 != 0) goto L77
                j.i0.i.q r2 = j.i0.i.q.this     // Catch: java.lang.Throwable -> L99
                r2.j()     // Catch: java.lang.Throwable -> L99
                j.i0.i.q r2 = j.i0.i.q.this     // Catch: java.lang.Throwable -> La2
                j.i0.i.q$c r2 = r2.f9467i     // Catch: java.lang.Throwable -> La2
                r2.l()     // Catch: java.lang.Throwable -> La2
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
                goto L6
            L77:
                r12 = r7
            L78:
                j.i0.i.q r14 = j.i0.i.q.this     // Catch: java.lang.Throwable -> La2
                j.i0.i.q$c r14 = r14.f9467i     // Catch: java.lang.Throwable -> La2
                r14.l()     // Catch: java.lang.Throwable -> La2
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
                int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
                if (r14 == 0) goto L88
                r11.a(r12)
                return r12
            L88:
                if (r2 != 0) goto L8b
                return r7
            L8b:
                j.i0.i.v r12 = new j.i0.i.v
                r12.<init>(r2)
                throw r12
            L91:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L99
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> L99
                throw r12     // Catch: java.lang.Throwable -> L99
            L99:
                r12 = move-exception
                j.i0.i.q r13 = j.i0.i.q.this     // Catch: java.lang.Throwable -> La2
                j.i0.i.q$c r13 = r13.f9467i     // Catch: java.lang.Throwable -> La2
                r13.l()     // Catch: java.lang.Throwable -> La2
                throw r12     // Catch: java.lang.Throwable -> La2
            La2:
                r12 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
                throw r12
            La5:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r13 = e.a.d.a.a.h(r0, r13)
                r12.<init>(r13)
                goto Lb2
            Lb1:
                throw r12
            Lb2:
                goto Lb1
            */
            throw new UnsupportedOperationException("Method not decompiled: j.i0.i.q.b.S(k.d, long):long");
        }

        public final void a(long j2) {
            q.this.f9462d.y(j2);
        }

        @Override // k.x
        public y c() {
            return q.this.f9467i;
        }

        @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long j2;
            synchronized (q.this) {
                this.f9475d = true;
                k.d dVar = this.f9473b;
                j2 = dVar.f9620b;
                dVar.skip(j2);
                if (!q.this.f9463e.isEmpty()) {
                    Objects.requireNonNull(q.this);
                }
                q.this.notifyAll();
            }
            if (j2 > 0) {
                a(j2);
            }
            q.this.a();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends k.a {
        public c() {
        }

        @Override // k.a
        public IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // k.a
        public void k() {
            q.this.e(j.i0.i.b.CANCEL);
            g gVar = q.this.f9462d;
            synchronized (gVar) {
                long j2 = gVar.o;
                long j3 = gVar.f9410n;
                if (j2 < j3) {
                    return;
                }
                gVar.f9410n = j3 + 1;
                gVar.q = System.nanoTime() + 1000000000;
                try {
                    gVar.f9405i.execute(new h(gVar, "OkHttp %s ping", gVar.f9401e));
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        public void l() throws IOException {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public q(int i2, g gVar, boolean z, boolean z2, @Nullable j.r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f9463e = arrayDeque;
        this.f9467i = new c();
        this.f9468j = new c();
        this.f9469k = null;
        Objects.requireNonNull(gVar, "connection == null");
        this.f9461c = i2;
        this.f9462d = gVar;
        this.f9460b = gVar.u.a();
        b bVar = new b(gVar.t.a());
        this.f9465g = bVar;
        a aVar = new a();
        this.f9466h = aVar;
        bVar.f9476e = z2;
        aVar.f9471c = z;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (g() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!g() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public void a() throws IOException {
        boolean z;
        boolean h2;
        synchronized (this) {
            b bVar = this.f9465g;
            if (!bVar.f9476e && bVar.f9475d) {
                a aVar = this.f9466h;
                if (aVar.f9471c || aVar.f9470b) {
                    z = true;
                    h2 = h();
                }
            }
            z = false;
            h2 = h();
        }
        if (z) {
            c(j.i0.i.b.CANCEL);
        } else if (h2) {
        } else {
            this.f9462d.u(this.f9461c);
        }
    }

    public void b() throws IOException {
        a aVar = this.f9466h;
        if (aVar.f9470b) {
            throw new IOException("stream closed");
        }
        if (aVar.f9471c) {
            throw new IOException("stream finished");
        }
        if (this.f9469k != null) {
            throw new v(this.f9469k);
        }
    }

    public void c(j.i0.i.b bVar) throws IOException {
        if (d(bVar)) {
            g gVar = this.f9462d;
            gVar.w.u(this.f9461c, bVar);
        }
    }

    public final boolean d(j.i0.i.b bVar) {
        synchronized (this) {
            if (this.f9469k != null) {
                return false;
            }
            if (this.f9465g.f9476e && this.f9466h.f9471c) {
                return false;
            }
            this.f9469k = bVar;
            notifyAll();
            this.f9462d.u(this.f9461c);
            return true;
        }
    }

    public void e(j.i0.i.b bVar) {
        if (d(bVar)) {
            this.f9462d.H(this.f9461c, bVar);
        }
    }

    public k.v f() {
        synchronized (this) {
            if (!this.f9464f && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f9466h;
    }

    public boolean g() {
        return this.f9462d.f9398b == ((this.f9461c & 1) == 1);
    }

    public synchronized boolean h() {
        if (this.f9469k != null) {
            return false;
        }
        b bVar = this.f9465g;
        if (bVar.f9476e || bVar.f9475d) {
            a aVar = this.f9466h;
            if (aVar.f9471c || aVar.f9470b) {
                if (this.f9464f) {
                    return false;
                }
            }
        }
        return true;
    }

    public void i() {
        boolean h2;
        synchronized (this) {
            this.f9465g.f9476e = true;
            h2 = h();
            notifyAll();
        }
        if (h2) {
            return;
        }
        this.f9462d.u(this.f9461c);
    }

    public void j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
