package i.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes2.dex */
public abstract class u0 extends v0 implements l0 {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9164e = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_queue");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9165f = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes2.dex */
    public final class a extends c {

        /* renamed from: d  reason: collision with root package name */
        public final j<h.k> f9166d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j2, j<? super h.k> jVar) {
            super(j2);
            this.f9166d = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9166d.G(u0.this, h.k.a);
        }

        @Override // i.a.u0.c
        public String toString() {
            return h.o.c.j.i(super.toString(), this.f9166d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: d  reason: collision with root package name */
        public final Runnable f9168d;

        public b(long j2, Runnable runnable) {
            super(j2);
            this.f9168d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9168d.run();
        }

        @Override // i.a.u0.c
        public String toString() {
            return h.o.c.j.i(super.toString(), this.f9168d);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c implements Runnable, Comparable<c>, p0, i.a.i2.u {
        public long a;

        /* renamed from: b  reason: collision with root package name */
        public Object f9169b;

        /* renamed from: c  reason: collision with root package name */
        public int f9170c = -1;

        public c(long j2) {
            this.a = j2;
        }

        @Override // i.a.i2.u
        public void a(i.a.i2.t<?> tVar) {
            if (!(this.f9169b != w0.a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f9169b = tVar;
        }

        @Override // i.a.i2.u
        public i.a.i2.t<?> c() {
            Object obj = this.f9169b;
            if (obj instanceof i.a.i2.t) {
                return (i.a.i2.t) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            long j2 = this.a - cVar.a;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        @Override // i.a.i2.u
        public void d(int i2) {
            this.f9170c = i2;
        }

        @Override // i.a.p0
        public final synchronized void dispose() {
            Object obj = this.f9169b;
            i.a.i2.q qVar = w0.a;
            if (obj == qVar) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                synchronized (dVar) {
                    if (c() != null) {
                        dVar.d(e());
                    }
                }
            }
            this.f9169b = qVar;
        }

        @Override // i.a.i2.u
        public int e() {
            return this.f9170c;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("Delayed[nanos=");
            y.append(this.a);
            y.append(']');
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends i.a.i2.t<c> {

        /* renamed from: b  reason: collision with root package name */
        public long f9171b;

        public d(long j2) {
            this.f9171b = j2;
        }
    }

    public p0 H(long j2, Runnable runnable, h.m.f fVar) {
        return i0.a.H(j2, runnable, fVar);
    }

    @Override // i.a.c0
    public final void e0(h.m.f fVar, Runnable runnable) {
        o0(runnable);
    }

    @Override // i.a.l0
    public void m(long j2, j<? super h.k> jVar) {
        long a2 = w0.a(j2);
        if (a2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(a2 + nanoTime, jVar);
            ((k) jVar).r(new q0(aVar));
            u0(nanoTime, aVar);
        }
    }

    public final void o0(Runnable runnable) {
        if (!p0(runnable)) {
            h0.f8996g.o0(runnable);
            return;
        }
        Thread n0 = n0();
        if (Thread.currentThread() != n0) {
            LockSupport.unpark(n0);
        }
    }

    public final boolean p0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (q0()) {
                return false;
            }
            if (obj == null) {
                if (f9164e.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof i.a.i2.k) {
                i.a.i2.k kVar = (i.a.i2.k) obj;
                int a2 = kVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f9164e.compareAndSet(this, obj, kVar.e());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == w0.f9178b) {
                return false;
            } else {
                i.a.i2.k kVar2 = new i.a.i2.k(8, true);
                kVar2.a((Runnable) obj);
                kVar2.a(runnable);
                if (f9164e.compareAndSet(this, obj, kVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean q0() {
        return this._isCompleted;
    }

    public boolean r0() {
        i.a.i2.a<n0<?>> aVar = this.f9163d;
        if (aVar == null || aVar.f9058b == aVar.f9059c) {
            d dVar = (d) this._delayed;
            if (dVar == null || dVar.c()) {
                Object obj = this._queue;
                if (obj == null) {
                    return true;
                }
                return obj instanceof i.a.i2.k ? ((i.a.i2.k) obj).d() : obj == w0.f9178b;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0050 A[EDGE_INSN: B:98:0x0050->B:35:0x0050 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long s0() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.u0.s0():long");
    }

    @Override // i.a.t0
    public void shutdown() {
        y1 y1Var = y1.a;
        y1.f9180b.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f9164e.compareAndSet(this, null, w0.f9178b)) {
                    break;
                }
            } else if (obj instanceof i.a.i2.k) {
                ((i.a.i2.k) obj).b();
                break;
            } else if (obj == w0.f9178b) {
                break;
            } else {
                i.a.i2.k kVar = new i.a.i2.k(8, true);
                kVar.a((Runnable) obj);
                if (f9164e.compareAndSet(this, obj, kVar)) {
                    break;
                }
            }
        }
        do {
        } while (s0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            c e2 = dVar == null ? null : dVar.e();
            if (e2 == null) {
                return;
            }
            h0.f8996g.u0(nanoTime, e2);
        }
    }

    public final void t0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(long r13, i.a.u0.c r15) {
        /*
            r12 = this;
            boolean r0 = r12.q0()
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto Lb
            goto L3b
        Lb:
            java.lang.Object r0 = r12._delayed
            i.a.u0$d r0 = (i.a.u0.d) r0
            if (r0 != 0) goto L22
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i.a.u0.f9165f
            i.a.u0$d r5 = new i.a.u0$d
            r5.<init>(r13)
            r0.compareAndSet(r12, r4, r5)
            java.lang.Object r0 = r12._delayed
            h.o.c.j.c(r0)
            i.a.u0$d r0 = (i.a.u0.d) r0
        L22:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f9169b     // Catch: java.lang.Throwable -> Laa
            i.a.i2.q r6 = i.a.w0.a     // Catch: java.lang.Throwable -> Laa
            if (r5 != r6) goto L2c
            monitor-exit(r15)
            r0 = 2
            goto L68
        L2c:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Laa
            i.a.i2.u r5 = r0.b()     // Catch: java.lang.Throwable -> La7
            i.a.u0$c r5 = (i.a.u0.c) r5     // Catch: java.lang.Throwable -> La7
            boolean r6 = r12.q0()     // Catch: java.lang.Throwable -> La7
            if (r6 == 0) goto L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r15)
        L3b:
            r0 = 1
            goto L68
        L3d:
            r6 = 0
            if (r5 != 0) goto L44
            r0.f9171b = r13     // Catch: java.lang.Throwable -> La7
            goto L57
        L44:
            long r8 = r5.a     // Catch: java.lang.Throwable -> La7
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L4d
            r8 = r13
        L4d:
            long r10 = r0.f9171b     // Catch: java.lang.Throwable -> La7
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L57
            r0.f9171b = r8     // Catch: java.lang.Throwable -> La7
        L57:
            long r8 = r15.a     // Catch: java.lang.Throwable -> La7
            long r10 = r0.f9171b     // Catch: java.lang.Throwable -> La7
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L62
            r15.a = r10     // Catch: java.lang.Throwable -> La7
        L62:
            r0.a(r15)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r15)
            r0 = 0
        L68:
            if (r0 == 0) goto L81
            if (r0 == r3) goto L7b
            if (r0 != r1) goto L6f
            goto La3
        L6f:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L7b:
            i.a.h0 r0 = i.a.h0.f8996g
            r0.u0(r13, r15)
            goto La3
        L81:
            java.lang.Object r13 = r12._delayed
            i.a.u0$d r13 = (i.a.u0.d) r13
            if (r13 != 0) goto L88
            goto L91
        L88:
            monitor-enter(r13)
            i.a.i2.u r14 = r13.b()     // Catch: java.lang.Throwable -> La4
            monitor-exit(r13)
            r4 = r14
            i.a.u0$c r4 = (i.a.u0.c) r4
        L91:
            if (r4 != r15) goto L94
            r2 = 1
        L94:
            if (r2 == 0) goto La3
            java.lang.Thread r13 = r12.n0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto La3
            java.util.concurrent.locks.LockSupport.unpark(r13)
        La3:
            return
        La4:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        La7:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            throw r13     // Catch: java.lang.Throwable -> Laa
        Laa:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.u0.u0(long, i.a.u0$c):void");
    }
}
