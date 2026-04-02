package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.se0.o0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes4.dex */
public abstract class y0 extends z0 implements o0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_queue");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes4.dex */
    public final class a extends c {
        public final m<com.amazon.aps.iva.kb0.q> d;

        public a(long j, n nVar) {
            super(j);
            this.d = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.v(y0.this, com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.se0.y0.c
        public final String toString() {
            return super.toString() + this.d;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes4.dex */
    public static final class b extends c {
        public final Runnable d;

        public b(Runnable runnable, long j) {
            super(j);
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.run();
        }

        @Override // com.amazon.aps.iva.se0.y0.c
        public final String toString() {
            return super.toString() + this.d;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes4.dex */
    public static abstract class c implements Runnable, Comparable<c>, t0, com.amazon.aps.iva.xe0.w {
        private volatile Object _heap;
        public long b;
        public int c = -1;

        public c(long j) {
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xe0.w
        public final void a(d dVar) {
            boolean z;
            if (this._heap != com.amazon.aps.iva.b30.j.d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = dVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [T extends com.amazon.aps.iva.xe0.w & java.lang.Comparable<? super T>[]] */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final synchronized int b(long j, d dVar, y0 y0Var) {
            c cVar;
            if (this._heap == com.amazon.aps.iva.b30.j.d) {
                return 2;
            }
            synchronized (dVar) {
                ?? r0 = dVar.a;
                if (r0 != 0) {
                    cVar = r0[0];
                } else {
                    cVar = null;
                }
                c cVar2 = cVar;
                if (y0.k0(y0Var)) {
                    return 1;
                }
                if (cVar2 == null) {
                    dVar.b = j;
                } else {
                    long j2 = cVar2.b;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - dVar.b > 0) {
                        dVar.b = j;
                    }
                }
                long j3 = this.b;
                long j4 = dVar.b;
                if (j3 - j4 < 0) {
                    this.b = j4;
                }
                dVar.a(this);
                return 0;
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            int i = ((this.b - cVar.b) > 0L ? 1 : ((this.b - cVar.b) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        @Override // com.amazon.aps.iva.se0.t0
        public final synchronized void dispose() {
            d dVar;
            Object obj = this._heap;
            com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.b30.j.d;
            if (obj == sVar) {
                return;
            }
            com.amazon.aps.iva.xe0.v vVar = null;
            if (obj instanceof d) {
                dVar = (d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                synchronized (dVar) {
                    Object obj2 = this._heap;
                    if (obj2 instanceof com.amazon.aps.iva.xe0.v) {
                        vVar = (com.amazon.aps.iva.xe0.v) obj2;
                    }
                    if (vVar != null) {
                        dVar.c(this.c);
                    }
                }
            }
            this._heap = sVar;
        }

        @Override // com.amazon.aps.iva.xe0.w
        public final void setIndex(int i) {
            this.c = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.b + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.xe0.v<c> {
        public long b;

        public d(long j) {
            this.b = j;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    public static final boolean k0(y0 y0Var) {
        return y0Var._isCompleted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007f A[EDGE_INSN: B:115:0x007f->B:54:0x007f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b9  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, com.amazon.aps.iva.se0.y0, com.amazon.aps.iva.se0.x0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T extends com.amazon.aps.iva.xe0.w & java.lang.Comparable<? super T>[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7, types: [T extends com.amazon.aps.iva.xe0.w & java.lang.Comparable<? super T>[]] */
    @Override // com.amazon.aps.iva.se0.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Z() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.y0.Z():long");
    }

    public t0 h(long j, Runnable runnable, com.amazon.aps.iva.ob0.g gVar) {
        return o0.a.a(j, runnable, gVar);
    }

    public void l0(Runnable runnable) {
        if (t0(runnable)) {
            Thread c0 = c0();
            if (Thread.currentThread() != c0) {
                LockSupport.unpark(c0);
                return;
            }
            return;
        }
        k0.i.l0(runnable);
    }

    @Override // com.amazon.aps.iva.se0.x0
    public void shutdown() {
        c d2;
        ThreadLocal<x0> threadLocal = g2.a;
        g2.a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.b30.j.e;
            boolean z = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, sVar)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else if (obj instanceof com.amazon.aps.iva.xe0.j) {
                ((com.amazon.aps.iva.xe0.j) obj).b();
                break;
            } else if (obj == sVar) {
                break;
            } else {
                com.amazon.aps.iva.xe0.j jVar = new com.amazon.aps.iva.xe0.j(8, true);
                jVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, jVar)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        do {
        } while (Z() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (d2 = dVar.d()) != null) {
                j0(nanoTime, d2);
            } else {
                return;
            }
        }
    }

    public final boolean t0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof com.amazon.aps.iva.xe0.j) {
                com.amazon.aps.iva.xe0.j jVar = (com.amazon.aps.iva.xe0.j) obj;
                int a2 = jVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 != 1) {
                    if (a2 == 2) {
                        return false;
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
                    com.amazon.aps.iva.xe0.j e = jVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                }
            } else if (obj == com.amazon.aps.iva.b30.j.e) {
                return false;
            } else {
                com.amazon.aps.iva.xe0.j jVar2 = new com.amazon.aps.iva.xe0.j(8, true);
                jVar2.a((Runnable) obj);
                jVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = g;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, jVar2)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
    }

    public final boolean u0() {
        boolean z;
        com.amazon.aps.iva.x6.k kVar = this.e;
        if (kVar != null && kVar.a != kVar.b) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof com.amazon.aps.iva.xe0.j) {
                return ((com.amazon.aps.iva.xe0.j) obj).d();
            }
            if (obj != com.amazon.aps.iva.b30.j.e) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.se0.o0
    public final void v(long j, n nVar) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j2 + nanoTime, nVar);
            w0(nanoTime, aVar);
            nVar.w(new u0(aVar));
        }
    }

    public final void v0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void w0(long j, c cVar) {
        int b2;
        Thread c0;
        com.amazon.aps.iva.xe0.w wVar = null;
        boolean z = true;
        if (this._isCompleted != 0) {
            b2 = 1;
        } else {
            d dVar = (d) this._delayed;
            if (dVar == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                d dVar2 = new d(j);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                com.amazon.aps.iva.yb0.j.c(obj);
                dVar = (d) obj;
            }
            b2 = cVar.b(j, dVar, this);
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            j0(j, cVar);
            return;
        }
        d dVar3 = (d) this._delayed;
        if (dVar3 != null) {
            synchronized (dVar3) {
                com.amazon.aps.iva.xe0.w[] wVarArr = dVar3.a;
                if (wVarArr != null) {
                    wVar = wVarArr[0];
                }
            }
            wVar = (c) wVar;
        }
        if (wVar != cVar) {
            z = false;
        }
        if (z && Thread.currentThread() != (c0 = c0())) {
            LockSupport.unpark(c0);
        }
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void x(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        l0(runnable);
    }
}
