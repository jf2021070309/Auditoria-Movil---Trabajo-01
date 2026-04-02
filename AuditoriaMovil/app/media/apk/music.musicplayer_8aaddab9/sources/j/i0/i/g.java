package j.i0.i;

import j.i0.i.p;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class g implements Closeable {
    public static final ExecutorService a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9398b;

    /* renamed from: c  reason: collision with root package name */
    public final e f9399c;

    /* renamed from: e  reason: collision with root package name */
    public final String f9401e;

    /* renamed from: f  reason: collision with root package name */
    public int f9402f;

    /* renamed from: g  reason: collision with root package name */
    public int f9403g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9404h;

    /* renamed from: i  reason: collision with root package name */
    public final ScheduledExecutorService f9405i;

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f9406j;

    /* renamed from: k  reason: collision with root package name */
    public final t f9407k;
    public long s;
    public final u u;
    public final Socket v;
    public final r w;
    public final C0209g x;
    public final Set<Integer> y;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Integer, q> f9400d = new LinkedHashMap();

    /* renamed from: l  reason: collision with root package name */
    public long f9408l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f9409m = 0;

    /* renamed from: n  reason: collision with root package name */
    public long f9410n = 0;
    public long o = 0;
    public long p = 0;
    public long q = 0;
    public long r = 0;
    public u t = new u();

    /* loaded from: classes2.dex */
    public class a extends j.i0.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f9411b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j.i0.i.b f9412c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i2, j.i0.i.b bVar) {
            super(str, objArr);
            this.f9411b = i2;
            this.f9412c = bVar;
        }

        @Override // j.i0.b
        public void a() {
            try {
                g gVar = g.this;
                gVar.w.u(this.f9411b, this.f9412c);
            } catch (IOException unused) {
                g.a(g.this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends j.i0.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f9414b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f9415c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i2, long j2) {
            super(str, objArr);
            this.f9414b = i2;
            this.f9415c = j2;
        }

        @Override // j.i0.b
        public void a() {
            try {
                g.this.w.v(this.f9414b, this.f9415c);
            } catch (IOException unused) {
                g.a(g.this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public Socket a;

        /* renamed from: b  reason: collision with root package name */
        public String f9417b;

        /* renamed from: c  reason: collision with root package name */
        public k.g f9418c;

        /* renamed from: d  reason: collision with root package name */
        public k.f f9419d;

        /* renamed from: e  reason: collision with root package name */
        public e f9420e = e.a;

        /* renamed from: f  reason: collision with root package name */
        public int f9421f;

        public c(boolean z) {
        }
    }

    /* loaded from: classes2.dex */
    public final class d extends j.i0.b {
        public d() {
            super("OkHttp %s ping", g.this.f9401e);
        }

        @Override // j.i0.b
        public void a() {
            g gVar;
            boolean z;
            synchronized (g.this) {
                gVar = g.this;
                long j2 = gVar.f9409m;
                long j3 = gVar.f9408l;
                if (j2 < j3) {
                    z = true;
                } else {
                    gVar.f9408l = j3 + 1;
                    z = false;
                }
            }
            if (z) {
                g.a(gVar);
            } else {
                gVar.B(false, 1, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public static final e a = new a();

        /* loaded from: classes2.dex */
        public class a extends e {
            @Override // j.i0.i.g.e
            public void b(q qVar) throws IOException {
                qVar.c(j.i0.i.b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void b(q qVar) throws IOException;
    }

    /* loaded from: classes2.dex */
    public final class f extends j.i0.b {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9423b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9424c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9425d;

        public f(boolean z, int i2, int i3) {
            super("OkHttp %s ping %08x%08x", g.this.f9401e, Integer.valueOf(i2), Integer.valueOf(i3));
            this.f9423b = z;
            this.f9424c = i2;
            this.f9425d = i3;
        }

        @Override // j.i0.b
        public void a() {
            g.this.B(this.f9423b, this.f9424c, this.f9425d);
        }
    }

    /* renamed from: j.i0.i.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0209g extends j.i0.b implements p.b {

        /* renamed from: b  reason: collision with root package name */
        public final p f9427b;

        public C0209g(p pVar) {
            super("OkHttp %s", g.this.f9401e);
            this.f9427b = pVar;
        }

        @Override // j.i0.b
        public void a() {
            j.i0.i.b bVar;
            j.i0.i.b bVar2 = j.i0.i.b.INTERNAL_ERROR;
            try {
                try {
                    this.f9427b.h(this);
                    while (this.f9427b.f(false, this)) {
                    }
                    bVar = j.i0.i.b.NO_ERROR;
                    try {
                        try {
                            g.this.f(bVar, j.i0.i.b.CANCEL);
                        } catch (IOException unused) {
                            j.i0.i.b bVar3 = j.i0.i.b.PROTOCOL_ERROR;
                            g.this.f(bVar3, bVar3);
                            j.i0.c.e(this.f9427b);
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            g.this.f(bVar, bVar2);
                        } catch (IOException unused2) {
                        }
                        j.i0.c.e(this.f9427b);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                bVar = bVar2;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                g.this.f(bVar, bVar2);
                j.i0.c.e(this.f9427b);
                throw th;
            }
            j.i0.c.e(this.f9427b);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = j.i0.c.a;
        a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j.i0.d("OkHttp Http2Connection", true));
    }

    public g(c cVar) {
        u uVar = new u();
        this.u = uVar;
        this.y = new LinkedHashSet();
        this.f9407k = t.a;
        this.f9398b = true;
        this.f9399c = cVar.f9420e;
        this.f9403g = 1;
        this.f9403g = 3;
        this.t.b(7, 16777216);
        String str = cVar.f9417b;
        this.f9401e = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new j.i0.d(j.i0.c.m("OkHttp %s Writer", str), false));
        this.f9405i = scheduledThreadPoolExecutor;
        if (cVar.f9421f != 0) {
            d dVar = new d();
            long j2 = cVar.f9421f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.f9406j = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j.i0.d(j.i0.c.m("OkHttp %s Push Observer", str), true));
        uVar.b(7, 65535);
        uVar.b(5, 16384);
        this.s = uVar.a();
        this.v = cVar.a;
        this.w = new r(cVar.f9419d, true);
        this.x = new C0209g(new p(cVar.f9418c, true));
    }

    public static void a(g gVar) {
        Objects.requireNonNull(gVar);
        try {
            j.i0.i.b bVar = j.i0.i.b.PROTOCOL_ERROR;
            gVar.f(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    public void B(boolean z, int i2, int i3) {
        try {
            try {
                this.w.r(z, i2, i3);
            } catch (IOException unused) {
                j.i0.i.b bVar = j.i0.i.b.PROTOCOL_ERROR;
                f(bVar, bVar);
            }
        } catch (IOException unused2) {
        }
    }

    public void H(int i2, j.i0.i.b bVar) {
        try {
            this.f9405i.execute(new a("OkHttp %s stream %d", new Object[]{this.f9401e, Integer.valueOf(i2)}, i2, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void I(int i2, long j2) {
        try {
            this.f9405i.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f9401e, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        f(j.i0.i.b.NO_ERROR, j.i0.i.b.CANCEL);
    }

    public void f(j.i0.i.b bVar, j.i0.i.b bVar2) throws IOException {
        q[] qVarArr = null;
        try {
            v(bVar);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f9400d.isEmpty()) {
                qVarArr = (q[]) this.f9400d.values().toArray(new q[this.f9400d.size()]);
                this.f9400d.clear();
            }
        }
        if (qVarArr != null) {
            for (q qVar : qVarArr) {
                try {
                    qVar.c(bVar2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.v.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f9405i.shutdown();
        this.f9406j.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void flush() throws IOException {
        this.w.flush();
    }

    public synchronized q h(int i2) {
        return this.f9400d.get(Integer.valueOf(i2));
    }

    public synchronized int i() {
        u uVar;
        uVar = this.u;
        return (uVar.a & 16) != 0 ? uVar.f9490b[4] : Integer.MAX_VALUE;
    }

    public final synchronized void m(j.i0.b bVar) {
        if (!this.f9404h) {
            this.f9406j.execute(bVar);
        }
    }

    public boolean r(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public synchronized q u(int i2) {
        q remove;
        remove = this.f9400d.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public void v(j.i0.i.b bVar) throws IOException {
        synchronized (this.w) {
            synchronized (this) {
                if (this.f9404h) {
                    return;
                }
                this.f9404h = true;
                this.w.i(this.f9402f, bVar, j.i0.c.a);
            }
        }
    }

    public synchronized void y(long j2) {
        long j3 = this.r + j2;
        this.r = j3;
        if (j3 >= this.t.a() / 2) {
            I(0, this.r);
            this.r = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.w.f9482e);
        r6 = r3;
        r8.s -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(int r9, boolean r10, k.d r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            j.i0.i.r r12 = r8.w
            r12.f(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r3 = r8.s     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, j.i0.i.q> r3 = r8.f9400d     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L54
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L54
            j.i0.i.r r3 = r8.w     // Catch: java.lang.Throwable -> L54
            int r3 = r3.f9482e     // Catch: java.lang.Throwable -> L54
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L54
            long r4 = r8.s     // Catch: java.lang.Throwable -> L54
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r6
            r8.s = r4     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            long r12 = r12 - r6
            j.i0.i.r r4 = r8.w
            if (r10 == 0) goto L4f
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            r4.f(r5, r9, r11, r3)
            goto Ld
        L54:
            r9 = move-exception
            goto L63
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L54
            r9.interrupt()     // Catch: java.lang.Throwable -> L54
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L54
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.i.g.z(int, boolean, k.d, long):void");
    }
}
