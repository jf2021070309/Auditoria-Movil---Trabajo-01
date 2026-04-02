package i.a.k2;

import e.j.d.w;
import i.a.i2.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes2.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;

    /* renamed from: e  reason: collision with root package name */
    public final int f9100e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9101f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9102g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9103h;

    /* renamed from: i  reason: collision with root package name */
    public final d f9104i;

    /* renamed from: j  reason: collision with root package name */
    public final d f9105j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicReferenceArray<C0207a> f9106k;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: d  reason: collision with root package name */
    public static final q f9099d = new q("NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9097b = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9098c = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: i.a.k2.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0207a extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(C0207a.class, "workerCtl");

        /* renamed from: b  reason: collision with root package name */
        public final m f9107b;

        /* renamed from: c  reason: collision with root package name */
        public b f9108c;

        /* renamed from: d  reason: collision with root package name */
        public long f9109d;

        /* renamed from: e  reason: collision with root package name */
        public long f9110e;

        /* renamed from: f  reason: collision with root package name */
        public int f9111f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f9112g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public C0207a(int i2) {
            a.this = a.this;
            setDaemon(true);
            this.f9107b = new m();
            this.f9108c = b.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f9099d;
            this.f9111f = h.p.c.a.b();
            f(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final i.a.k2.i a(boolean r11) {
            /*
                r10 = this;
                i.a.k2.a$b r0 = r10.f9108c
                i.a.k2.a$b r1 = i.a.k2.a.b.CPU_ACQUIRED
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L9
                goto L32
            L9:
                i.a.k2.a r0 = i.a.k2.a.this
            Lb:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L1b
                r0 = 0
                goto L2c
            L1b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = i.a.k2.a.f9097b
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto Lb
                r0 = 1
            L2c:
                if (r0 == 0) goto L34
                i.a.k2.a$b r0 = i.a.k2.a.b.CPU_ACQUIRED
                r10.f9108c = r0
            L32:
                r0 = 1
                goto L35
            L34:
                r0 = 0
            L35:
                if (r0 == 0) goto L6b
                if (r11 == 0) goto L60
                i.a.k2.a r11 = i.a.k2.a.this
                int r11 = r11.f9100e
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L46
                goto L47
            L46:
                r2 = 0
            L47:
                if (r2 == 0) goto L4f
                i.a.k2.i r11 = r10.e()
                if (r11 != 0) goto L6a
            L4f:
                i.a.k2.m r11 = r10.f9107b
                i.a.k2.i r11 = r11.e()
                if (r11 != 0) goto L6a
                if (r2 != 0) goto L66
                i.a.k2.i r11 = r10.e()
                if (r11 != 0) goto L6a
                goto L66
            L60:
                i.a.k2.i r11 = r10.e()
                if (r11 != 0) goto L6a
            L66:
                i.a.k2.i r11 = r10.i(r3)
            L6a:
                return r11
            L6b:
                if (r11 == 0) goto L80
                i.a.k2.m r11 = r10.f9107b
                i.a.k2.i r11 = r11.e()
                if (r11 != 0) goto L8a
                i.a.k2.a r11 = i.a.k2.a.this
                i.a.k2.d r11 = r11.f9105j
                java.lang.Object r11 = r11.d()
                i.a.k2.i r11 = (i.a.k2.i) r11
                goto L8a
            L80:
                i.a.k2.a r11 = i.a.k2.a.this
                i.a.k2.d r11 = r11.f9105j
                java.lang.Object r11 = r11.d()
                i.a.k2.i r11 = (i.a.k2.i) r11
            L8a:
                if (r11 != 0) goto L90
                i.a.k2.i r11 = r10.i(r2)
            L90:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: i.a.k2.a.C0207a.a(boolean):i.a.k2.i");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i2) {
            int i3 = this.f9111f;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f9111f = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final i e() {
            if (d(2) == 0) {
                i d2 = a.this.f9104i.d();
                return d2 == null ? a.this.f9105j.d() : d2;
            }
            i d3 = a.this.f9105j.d();
            return d3 == null ? a.this.f9104i.d() : d3;
        }

        public final void f(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f9103h);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(b bVar) {
            b bVar2 = this.f9108c;
            boolean z = bVar2 == b.CPU_ACQUIRED;
            if (z) {
                a.f9097b.addAndGet(a.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.f9108c = bVar;
            }
            return z;
        }

        public final i i(boolean z) {
            long h2;
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int d2 = d(i2);
            a aVar = a.this;
            long j2 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                d2++;
                if (d2 > i2) {
                    d2 = 1;
                }
                C0207a c0207a = aVar.f9106k.get(d2);
                if (c0207a != null && c0207a != this) {
                    if (z) {
                        h2 = this.f9107b.g(c0207a.f9107b);
                    } else {
                        m mVar = this.f9107b;
                        m mVar2 = c0207a.f9107b;
                        Objects.requireNonNull(mVar);
                        i f2 = mVar2.f();
                        if (f2 != null) {
                            mVar.a(f2, false);
                            h2 = -1;
                        } else {
                            h2 = mVar.h(mVar2, false);
                        }
                    }
                    if (h2 == -1) {
                        return this.f9107b.e();
                    }
                    if (h2 > 0) {
                        j2 = Math.min(j2, h2);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f9110e = j2;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:98:0x0003, code lost:
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i.a.k2.a.C0207a.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i2, int i3, long j2, String str) {
        this.f9100e = i2;
        this.f9101f = i3;
        this.f9102g = j2;
        this.f9103h = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(e.a.d.a.a.f("Core pool size ", i2, " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(e.a.d.a.a.g("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(e.a.d.a.a.f("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f9104i = new d();
        this.f9105j = new d();
        this.parkedWorkersStack = 0L;
        this.f9106k = new AtomicReferenceArray<>(i3 + 1);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void m(a aVar, Runnable runnable, j jVar, boolean z, int i2) {
        g gVar = (i2 & 2) != 0 ? g.a : null;
        if ((i2 & 4) != 0) {
            z = false;
        }
        aVar.i(runnable, gVar, z);
    }

    public final boolean B(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 < this.f9100e) {
            int a2 = a();
            if (a2 == 1 && this.f9100e > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            C0207a c0207a = this.f9106k.get((int) (2097151 & j2));
            if (c0207a == null) {
                c0207a = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                int r = r(c0207a);
                if (r >= 0 && a.compareAndSet(this, j2, r | j3)) {
                    c0207a.g(f9099d);
                }
            }
            if (c0207a == null) {
                return false;
            }
            if (C0207a.a.compareAndSet(c0207a, -1, 0)) {
                LockSupport.unpark(c0207a);
                return true;
            }
        }
    }

    public final int a() {
        synchronized (this.f9106k) {
            if (isTerminated()) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 >= this.f9100e) {
                return 0;
            }
            if (i2 >= this.f9101f) {
                return 0;
            }
            int i4 = ((int) (this.controlState & 2097151)) + 1;
            if (i4 > 0 && this.f9106k.get(i4) == null) {
                C0207a c0207a = new C0207a(i4);
                this.f9106k.set(i4, c0207a);
                if (i4 == ((int) (2097151 & f9097b.incrementAndGet(this)))) {
                    c0207a.start();
                    return i3 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[LOOP:0: B:13:0x001f->B:30:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0066 A[EDGE_INSN: B:53:0x0066->B:31:0x0066 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = i.a.k2.a.f9098c
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 != 0) goto Lc
            goto L9c
        Lc:
            i.a.k2.a$a r0 = r10.h()
            java.util.concurrent.atomic.AtomicReferenceArray<i.a.k2.a$a> r3 = r10.f9106k
            monitor-enter(r3)
            long r4 = r10.controlState     // Catch: java.lang.Throwable -> La1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            r4 = 0
            if (r2 > r5) goto L66
            r3 = 1
        L1f:
            int r6 = r3 + 1
            java.util.concurrent.atomic.AtomicReferenceArray<i.a.k2.a$a> r7 = r10.f9106k
            java.lang.Object r7 = r7.get(r3)
            h.o.c.j.c(r7)
            i.a.k2.a$a r7 = (i.a.k2.a.C0207a) r7
            if (r7 == r0) goto L61
        L2e:
            boolean r8 = r7.isAlive()
            if (r8 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r7)
            r8 = 10000(0x2710, double:4.9407E-320)
            r7.join(r8)
            goto L2e
        L3d:
            i.a.k2.m r7 = r7.f9107b
            i.a.k2.d r8 = r10.f9105j
            java.util.Objects.requireNonNull(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = i.a.k2.m.a
            java.lang.Object r9 = r9.getAndSet(r7, r4)
            i.a.k2.i r9 = (i.a.k2.i) r9
            if (r9 != 0) goto L4f
            goto L52
        L4f:
            r8.a(r9)
        L52:
            i.a.k2.i r9 = r7.f()
            if (r9 != 0) goto L5a
            r9 = 0
            goto L5e
        L5a:
            r8.a(r9)
            r9 = 1
        L5e:
            if (r9 == 0) goto L61
            goto L52
        L61:
            if (r3 != r5) goto L64
            goto L66
        L64:
            r3 = r6
            goto L1f
        L66:
            i.a.k2.d r1 = r10.f9105j
            r1.b()
            i.a.k2.d r1 = r10.f9104i
            r1.b()
        L70:
            if (r0 != 0) goto L74
            r1 = r4
            goto L78
        L74:
            i.a.k2.i r1 = r0.a(r2)
        L78:
            if (r1 != 0) goto L9d
            i.a.k2.d r1 = r10.f9104i
            java.lang.Object r1 = r1.d()
            i.a.k2.i r1 = (i.a.k2.i) r1
            if (r1 != 0) goto L9d
            i.a.k2.d r1 = r10.f9105j
            java.lang.Object r1 = r1.d()
            i.a.k2.i r1 = (i.a.k2.i) r1
            if (r1 != 0) goto L9d
            if (r0 != 0) goto L91
            goto L96
        L91:
            i.a.k2.a$b r1 = i.a.k2.a.b.TERMINATED
            r0.h(r1)
        L96:
            r0 = 0
            r10.parkedWorkersStack = r0
            r10.controlState = r0
        L9c:
            return
        L9d:
            r10.y(r1)
            goto L70
        La1:
            r0 = move-exception
            monitor-exit(r3)
            goto La5
        La4:
            throw r0
        La5:
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.k2.a.close():void");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m(this, runnable, null, false, 6);
    }

    public final i f(Runnable runnable, j jVar) {
        long a2 = l.f9132e.a();
        if (runnable instanceof i) {
            i iVar = (i) runnable;
            iVar.a = a2;
            iVar.f9127b = jVar;
            return iVar;
        }
        return new k(runnable, a2, jVar);
    }

    public final C0207a h() {
        Thread currentThread = Thread.currentThread();
        C0207a c0207a = currentThread instanceof C0207a ? (C0207a) currentThread : null;
        if (c0207a != null && h.o.c.j.a(a.this, this)) {
            return c0207a;
        }
        return null;
    }

    public final void i(Runnable runnable, j jVar, boolean z) {
        i a2;
        i f2 = f(runnable, jVar);
        C0207a h2 = h();
        boolean z2 = true;
        if (h2 == null || h2.f9108c == b.TERMINATED || (f2.f9127b.B() == 0 && h2.f9108c == b.BLOCKING)) {
            a2 = f2;
        } else {
            h2.f9112g = true;
            a2 = h2.f9107b.a(f2, z);
        }
        if (a2 != null) {
            if (!(a2.f9127b.B() == 1 ? this.f9105j.a(a2) : this.f9104i.a(a2))) {
                throw new RejectedExecutionException(h.o.c.j.i(this.f9103h, " was terminated"));
            }
        }
        z2 = (!z || h2 == null) ? false : false;
        if (f2.f9127b.B() == 0) {
            if (z2) {
                return;
            }
            z();
            return;
        }
        long addAndGet = f9097b.addAndGet(this, 2097152L);
        if (z2 || H() || B(addAndGet)) {
            return;
        }
        H();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final int r(C0207a c0207a) {
        Object c2 = c0207a.c();
        while (c2 != f9099d) {
            if (c2 == null) {
                return 0;
            }
            C0207a c0207a2 = (C0207a) c2;
            int b2 = c0207a2.b();
            if (b2 != 0) {
                return b2;
            }
            c2 = c0207a2.c();
        }
        return -1;
    }

    public String toString() {
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = new ArrayList();
        int length = this.f9106k.length();
        int i6 = 0;
        if (1 < length) {
            i3 = 0;
            int i7 = 0;
            i4 = 0;
            i5 = 0;
            int i8 = 1;
            while (true) {
                int i9 = i8 + 1;
                C0207a c0207a = this.f9106k.get(i8);
                if (c0207a != null) {
                    int d2 = c0207a.f9107b.d();
                    int ordinal = c0207a.f9108c.ordinal();
                    if (ordinal == 0) {
                        i7++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(d2);
                        sb.append('c');
                        arrayList.add(sb.toString());
                    } else if (ordinal == 1) {
                        i3++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(d2);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    } else if (ordinal == 2) {
                        i6++;
                    } else if (ordinal == 3) {
                        i4++;
                        if (d2 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(d2);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (ordinal == 4) {
                        i5++;
                    }
                }
                if (i9 >= length) {
                    break;
                }
                i8 = i9;
            }
            i2 = i6;
            i6 = i7;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        long j2 = this.controlState;
        return this.f9103h + '@' + w.M(this) + "[Pool Size {core = " + this.f9100e + ", max = " + this.f9101f + "}, Worker States {CPU = " + i6 + ", blocking = " + i3 + ", parked = " + i2 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f9104i.c() + ", global blocking queue size = " + this.f9105j.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f9100e - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final boolean u(C0207a c0207a) {
        long j2;
        int b2;
        if (c0207a.c() != f9099d) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            b2 = c0207a.b();
            c0207a.g(this.f9106k.get((int) (2097151 & j2)));
        } while (!a.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | b2));
        return true;
    }

    public final void v(C0207a c0207a, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                i4 = i3 == 0 ? r(c0207a) : i3;
            }
            if (i4 >= 0 && a.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public final void y(i iVar) {
        try {
            iVar.run();
        } finally {
        }
    }

    public final void z() {
        if (H() || B(this.controlState)) {
            return;
        }
        H();
    }
}
