package com.amazon.aps.iva.ye0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: WorkQueue.kt */
/* loaded from: classes4.dex */
public final class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray<g> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final g a(g gVar, boolean z) {
        if (z) {
            return b(gVar);
        }
        g gVar2 = (g) b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        boolean z = true;
        if (gVar.c.b() != 1) {
            z = false;
        }
        if (z) {
            e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, gVar);
        c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        if (this.lastScheduledTask != null) {
            return (this.producerIndex - this.consumerIndex) + 1;
        }
        return this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (d.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                boolean z = true;
                if (andSet.c.b() != 1) {
                    z = false;
                }
                if (z) {
                    e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        return f(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(com.amazon.aps.iva.ye0.m r9) {
        /*
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray<com.amazon.aps.iva.ye0.g> r2 = r9.a
        L6:
            r3 = 1
            if (r0 == r1) goto L44
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 == 0) goto L44
            java.lang.Object r5 = r2.get(r4)
            com.amazon.aps.iva.ye0.g r5 = (com.amazon.aps.iva.ye0.g) r5
            if (r5 == 0) goto L41
            com.amazon.aps.iva.ye0.h r6 = r5.c
            int r6 = r6.b()
            r7 = 0
            if (r6 != r3) goto L22
            r6 = r3
            goto L23
        L22:
            r6 = r7
        L23:
            if (r6 == 0) goto L41
        L25:
            r6 = 0
            boolean r6 = r2.compareAndSet(r4, r5, r6)
            if (r6 == 0) goto L2d
            goto L34
        L2d:
            java.lang.Object r6 = r2.get(r4)
            if (r6 == r5) goto L25
            r3 = r7
        L34:
            if (r3 == 0) goto L41
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.amazon.aps.iva.ye0.m.e
            r0.decrementAndGet(r9)
            r8.a(r5, r7)
            r0 = -1
            return r0
        L41:
            int r0 = r0 + 1
            goto L6
        L44:
            long r0 = r8.f(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ye0.m.e(com.amazon.aps.iva.ye0.m):long");
    }

    public final long f(m mVar, boolean z) {
        g gVar;
        boolean z2;
        boolean z3;
        do {
            gVar = (g) mVar.lastScheduledTask;
            if (gVar == null) {
                return -2L;
            }
            z2 = true;
            if (z) {
                if (gVar.c.b() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    return -2L;
                }
            }
            k.e.getClass();
            long nanoTime = System.nanoTime() - gVar.b;
            long j = k.a;
            if (nanoTime < j) {
                return j - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(mVar, gVar, null)) {
                    if (atomicReferenceFieldUpdater.get(mVar) != gVar) {
                        z2 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z2);
        a(gVar, false);
        return -1L;
    }
}
