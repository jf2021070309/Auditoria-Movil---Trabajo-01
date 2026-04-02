package com.amazon.aps.iva.ye0;

import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.xe0.o;
import com.amazon.aps.iva.xe0.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes4.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public final int b;
    public final int c;
    volatile /* synthetic */ long controlState;
    public final long d;
    public final String e;
    public final d f;
    public final d g;
    public final o<b> h;
    private volatile /* synthetic */ long parkedWorkersStack;
    public static final s l = new s("NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: com.amazon.aps.iva.ye0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0890a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.PARKING.ordinal()] = 1;
            iArr[c.BLOCKING.ordinal()] = 2;
            iArr[c.CPU_ACQUIRED.ordinal()] = 3;
            iArr[c.DORMANT.ordinal()] = 4;
            iArr[c.TERMINATED.ordinal()] = 5;
            a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes4.dex */
    public final class b extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");
        public final m b;
        public c c;
        public long d;
        public long e;
        public int f;
        public boolean g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        public b() {
            throw null;
        }

        public b(int i2) {
            setDaemon(true);
            this.b = new m();
            this.c = c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.l;
            this.f = com.amazon.aps.iva.cc0.c.b.b();
            f(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.ye0.g a(boolean r11) {
            /*
                r10 = this;
                com.amazon.aps.iva.ye0.a$c r0 = r10.c
                com.amazon.aps.iva.ye0.a$c r1 = com.amazon.aps.iva.ye0.a.c.CPU_ACQUIRED
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L9
                goto L32
            L9:
                com.amazon.aps.iva.ye0.a r0 = com.amazon.aps.iva.ye0.a.this
            Lb:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L1b
                r0 = r2
                goto L2c
            L1b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = com.amazon.aps.iva.ye0.a.j
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto Lb
                r0 = r3
            L2c:
                if (r0 == 0) goto L34
                com.amazon.aps.iva.ye0.a$c r0 = com.amazon.aps.iva.ye0.a.c.CPU_ACQUIRED
                r10.c = r0
            L32:
                r0 = r3
                goto L35
            L34:
                r0 = r2
            L35:
                r1 = 0
                if (r0 == 0) goto L7e
                if (r11 == 0) goto L72
                com.amazon.aps.iva.ye0.a r11 = com.amazon.aps.iva.ye0.a.this
                int r11 = r11.b
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L47
                goto L48
            L47:
                r3 = r2
            L48:
                if (r3 == 0) goto L51
                com.amazon.aps.iva.ye0.g r11 = r10.e()
                if (r11 == 0) goto L51
                goto L7d
            L51:
                com.amazon.aps.iva.ye0.m r11 = r10.b
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.amazon.aps.iva.ye0.m.b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                com.amazon.aps.iva.ye0.g r0 = (com.amazon.aps.iva.ye0.g) r0
                if (r0 != 0) goto L65
                com.amazon.aps.iva.ye0.g r11 = r11.d()
                goto L66
            L65:
                r11 = r0
            L66:
                if (r11 == 0) goto L69
                goto L7d
            L69:
                if (r3 != 0) goto L79
                com.amazon.aps.iva.ye0.g r11 = r10.e()
                if (r11 == 0) goto L79
                goto L7d
            L72:
                com.amazon.aps.iva.ye0.g r11 = r10.e()
                if (r11 == 0) goto L79
                goto L7d
            L79:
                com.amazon.aps.iva.ye0.g r11 = r10.i(r2)
            L7d:
                return r11
            L7e:
                if (r11 == 0) goto La1
                com.amazon.aps.iva.ye0.m r11 = r10.b
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.amazon.aps.iva.ye0.m.b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                com.amazon.aps.iva.ye0.g r0 = (com.amazon.aps.iva.ye0.g) r0
                if (r0 != 0) goto L93
                com.amazon.aps.iva.ye0.g r0 = r11.d()
            L93:
                if (r0 != 0) goto Lac
                com.amazon.aps.iva.ye0.a r11 = com.amazon.aps.iva.ye0.a.this
                com.amazon.aps.iva.ye0.d r11 = r11.g
                java.lang.Object r11 = r11.d()
                r0 = r11
                com.amazon.aps.iva.ye0.g r0 = (com.amazon.aps.iva.ye0.g) r0
                goto Lac
            La1:
                com.amazon.aps.iva.ye0.a r11 = com.amazon.aps.iva.ye0.a.this
                com.amazon.aps.iva.ye0.d r11 = r11.g
                java.lang.Object r11 = r11.d()
                r0 = r11
                com.amazon.aps.iva.ye0.g r0 = (com.amazon.aps.iva.ye0.g) r0
            Lac:
                if (r0 != 0) goto Lb2
                com.amazon.aps.iva.ye0.g r0 = r10.i(r3)
            Lb2:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ye0.a.b.a(boolean):com.amazon.aps.iva.ye0.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i2) {
            int i3 = this.f;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f = i6;
            int i7 = i2 - 1;
            if ((i7 & i2) == 0) {
                return i6 & i7;
            }
            return (i6 & Integer.MAX_VALUE) % i2;
        }

        public final g e() {
            int d = d(2);
            a aVar = a.this;
            if (d == 0) {
                g d2 = aVar.f.d();
                if (d2 != null) {
                    return d2;
                }
                return aVar.g.d();
            }
            g d3 = aVar.g.d();
            if (d3 != null) {
                return d3;
            }
            return aVar.f.d();
        }

        public final void f(int i2) {
            String valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.e);
            sb.append("-worker-");
            if (i2 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i2);
            }
            sb.append(valueOf);
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(c cVar) {
            boolean z;
            c cVar2 = this.c;
            if (cVar2 == c.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a.j.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.c = cVar;
            }
            return z;
        }

        public final g i(boolean z) {
            long f;
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int d = d(i2);
            a aVar = a.this;
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                d++;
                if (d > i2) {
                    d = 1;
                }
                b b = aVar.h.b(d);
                if (b != null && b != this) {
                    if (z) {
                        f = this.b.e(b.b);
                    } else {
                        m mVar = this.b;
                        m mVar2 = b.b;
                        mVar.getClass();
                        g d2 = mVar2.d();
                        if (d2 != null) {
                            mVar.a(d2, false);
                            f = -1;
                        } else {
                            f = mVar.f(mVar2, false);
                        }
                    }
                    if (f == -1) {
                        m mVar3 = this.b;
                        mVar3.getClass();
                        g gVar = (g) m.b.getAndSet(mVar3, null);
                        if (gVar == null) {
                            return mVar3.d();
                        }
                        return gVar;
                    } else if (f > 0) {
                        j = Math.min(j, f);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.e = j;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:111:0x0002, code lost:
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 343
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ye0.a.b.run():void");
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes4.dex */
    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i2, int i3, String str, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        this.b = i2;
        this.c = i3;
        this.d = j2;
        this.e = str;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i3 >= i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i3 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j2 > 0) {
                        this.f = new d();
                        this.g = new d();
                        this.parkedWorkersStack = 0L;
                        this.h = new o<>(i2 + 1);
                        this.controlState = i2 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(j0.e("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Core pool size ", i2, " should be at least 1").toString());
    }

    public final int a() {
        boolean z;
        synchronized (this.h) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
            boolean z2 = false;
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 >= this.b) {
                return 0;
            }
            if (i2 >= this.c) {
                return 0;
            }
            int i4 = ((int) (this.controlState & 2097151)) + 1;
            if (i4 > 0 && this.h.b(i4) == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b bVar = new b(i4);
                this.h.c(i4, bVar);
                if (i4 == ((int) (2097151 & j.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    bVar.start();
                    return i3 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void c(Runnable runnable, h hVar, boolean z) {
        g jVar;
        b bVar;
        g gVar;
        boolean z2;
        boolean a;
        k.e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            jVar = (g) runnable;
            jVar.b = nanoTime;
            jVar.c = hVar;
        } else {
            jVar = new j(runnable, nanoTime, hVar);
        }
        Thread currentThread = Thread.currentThread();
        b bVar2 = null;
        if (currentThread instanceof b) {
            bVar = (b) currentThread;
        } else {
            bVar = null;
        }
        if (bVar != null && com.amazon.aps.iva.yb0.j.a(a.this, this)) {
            bVar2 = bVar;
        }
        boolean z3 = true;
        if (bVar2 == null || bVar2.c == c.TERMINATED || (jVar.c.b() == 0 && bVar2.c == c.BLOCKING)) {
            gVar = jVar;
        } else {
            bVar2.g = true;
            gVar = bVar2.b.a(jVar, z);
        }
        if (gVar != null) {
            if (gVar.c.b() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                a = this.g.a(gVar);
            } else {
                a = this.f.a(gVar);
            }
            if (!a) {
                throw new RejectedExecutionException(defpackage.b.c(new StringBuilder(), this.e, " was terminated"));
            }
        }
        if (!z || bVar2 == null) {
            z3 = false;
        }
        if (jVar.c.b() == 0) {
            if (!z3 && !k() && !i(this.controlState)) {
                k();
                return;
            }
            return;
        }
        long addAndGet = j.addAndGet(this, 2097152L);
        if (!z3 && !k() && !i(addAndGet)) {
            k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[LOOP:0: B:21:0x0033->B:35:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0076 A[EDGE_INSN: B:59:0x0076->B:36:0x0076 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.amazon.aps.iva.ye0.a.k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto La9
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof com.amazon.aps.iva.ye0.a.b
            r4 = 0
            if (r3 == 0) goto L18
            com.amazon.aps.iva.ye0.a$b r0 = (com.amazon.aps.iva.ye0.a.b) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L24
            com.amazon.aps.iva.ye0.a r3 = com.amazon.aps.iva.ye0.a.this
            boolean r3 = com.amazon.aps.iva.yb0.j.a(r3, r9)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            com.amazon.aps.iva.xe0.o<com.amazon.aps.iva.ye0.a$b> r3 = r9.h
            monitor-enter(r3)
            long r5 = r9.controlState     // Catch: java.lang.Throwable -> Lbb
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L76
            r3 = r2
        L33:
            com.amazon.aps.iva.xe0.o<com.amazon.aps.iva.ye0.a$b> r6 = r9.h
            java.lang.Object r6 = r6.b(r3)
            com.amazon.aps.iva.yb0.j.c(r6)
            com.amazon.aps.iva.ye0.a$b r6 = (com.amazon.aps.iva.ye0.a.b) r6
            if (r6 == r0) goto L71
        L40:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L4f
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L40
        L4f:
            com.amazon.aps.iva.ye0.m r6 = r6.b
            com.amazon.aps.iva.ye0.d r7 = r9.g
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = com.amazon.aps.iva.ye0.m.b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            com.amazon.aps.iva.ye0.g r8 = (com.amazon.aps.iva.ye0.g) r8
            if (r8 == 0) goto L63
            r7.a(r8)
        L63:
            com.amazon.aps.iva.ye0.g r8 = r6.d()
            if (r8 != 0) goto L6b
            r8 = r1
            goto L6f
        L6b:
            r7.a(r8)
            r8 = r2
        L6f:
            if (r8 != 0) goto L63
        L71:
            if (r3 == r5) goto L76
            int r3 = r3 + 1
            goto L33
        L76:
            com.amazon.aps.iva.ye0.d r1 = r9.g
            r1.b()
            com.amazon.aps.iva.ye0.d r1 = r9.f
            r1.b()
        L80:
            if (r0 == 0) goto L88
            com.amazon.aps.iva.ye0.g r1 = r0.a(r2)
            if (r1 != 0) goto Laa
        L88:
            com.amazon.aps.iva.ye0.d r1 = r9.f
            java.lang.Object r1 = r1.d()
            com.amazon.aps.iva.ye0.g r1 = (com.amazon.aps.iva.ye0.g) r1
            if (r1 != 0) goto Laa
            com.amazon.aps.iva.ye0.d r1 = r9.g
            java.lang.Object r1 = r1.d()
            com.amazon.aps.iva.ye0.g r1 = (com.amazon.aps.iva.ye0.g) r1
            if (r1 != 0) goto Laa
            if (r0 == 0) goto La3
            com.amazon.aps.iva.ye0.a$c r1 = com.amazon.aps.iva.ye0.a.c.TERMINATED
            r0.h(r1)
        La3:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        La9:
            return
        Laa:
            r1.run()     // Catch: java.lang.Throwable -> Lae
            goto L80
        Lae:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L80
        Lbb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ye0.a.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, k.f, false);
    }

    public final void f(b bVar) {
        long j2;
        int b2;
        if (bVar.c() != l) {
            return;
        }
        do {
            j2 = this.parkedWorkersStack;
            b2 = bVar.b();
            bVar.g(this.h.b((int) (2097151 & j2)));
        } while (!i.compareAndSet(this, j2, b2 | ((2097152 + j2) & (-2097152))));
    }

    public final void h(b bVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c2 = bVar.c();
                    while (true) {
                        if (c2 == l) {
                            i4 = -1;
                            break;
                        } else if (c2 == null) {
                            i4 = 0;
                            break;
                        } else {
                            b bVar2 = (b) c2;
                            int b2 = bVar2.b();
                            if (b2 != 0) {
                                i4 = b2;
                                break;
                            }
                            c2 = bVar2.c();
                        }
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0 && i.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public final boolean i(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.b;
        if (i2 < i3) {
            int a = a();
            if (a == 1 && i3 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean k() {
        s sVar;
        int i2;
        while (true) {
            long j2 = this.parkedWorkersStack;
            b b2 = this.h.b((int) (2097151 & j2));
            if (b2 == null) {
                b2 = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c2 = b2.c();
                while (true) {
                    sVar = l;
                    if (c2 == sVar) {
                        i2 = -1;
                        break;
                    } else if (c2 == null) {
                        i2 = 0;
                        break;
                    } else {
                        b bVar = (b) c2;
                        i2 = bVar.b();
                        if (i2 != 0) {
                            break;
                        }
                        c2 = bVar.c();
                    }
                }
                if (i2 >= 0 && i.compareAndSet(this, j2, i2 | j3)) {
                    b2.g(sVar);
                }
            }
            if (b2 == null) {
                return false;
            }
            if (b.i.compareAndSet(b2, -1, 0)) {
                LockSupport.unpark(b2);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.h.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a; i7++) {
            b b2 = this.h.b(i7);
            if (b2 != null) {
                int c2 = b2.b.c();
                int i8 = C0890a.a[b2.c.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 == 5) {
                                    i6++;
                                }
                            } else {
                                i5++;
                                if (c2 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c2);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i2++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c2);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i3++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c2);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i4++;
                }
            }
        }
        long j2 = this.controlState;
        return this.e + '@' + com.amazon.aps.iva.se0.j0.e(this) + "[Pool Size {core = " + this.b + ", max = " + this.c + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f.c() + ", global blocking queue size = " + this.g.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.b - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }
}
