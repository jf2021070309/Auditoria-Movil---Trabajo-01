package i.a.k2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public final class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9133b = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9134c = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9135d = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceArray<i> f9136e = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final i a(i iVar, boolean z) {
        if (z) {
            return b(iVar);
        }
        i iVar2 = (i) a.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return b(iVar2);
    }

    public final i b(i iVar) {
        if (iVar.f9127b.B() == 1) {
            f9135d.incrementAndGet(this);
        }
        if (c() == 127) {
            return iVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.f9136e.get(i2) != null) {
            Thread.yield();
        }
        this.f9136e.lazySet(i2, iVar);
        f9133b.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final i e() {
        i iVar = (i) a.getAndSet(this, null);
        return iVar == null ? f() : iVar;
    }

    public final i f() {
        i andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f9134c.compareAndSet(this, i2, i2 + 1) && (andSet = this.f9136e.getAndSet(i3, null)) != null) {
                if (andSet.f9127b.B() == 1) {
                    f9135d.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long g(m mVar) {
        int i2 = mVar.consumerIndex;
        int i3 = mVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = mVar.f9136e;
        while (true) {
            if (i2 == i3) {
                break;
            }
            int i4 = i2 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(i4);
            if (iVar != null) {
                if ((iVar.f9127b.B() == 1) && atomicReferenceArray.compareAndSet(i4, iVar, null)) {
                    f9135d.decrementAndGet(mVar);
                    a(iVar, false);
                    return -1L;
                }
            }
            i2++;
        }
        return h(mVar, true);
    }

    public final long h(m mVar, boolean z) {
        i iVar;
        do {
            iVar = (i) mVar.lastScheduledTask;
            if (iVar == null) {
                return -2L;
            }
            if (z) {
                if (!(iVar.f9127b.B() == 1)) {
                    return -2L;
                }
            }
            long a2 = l.f9132e.a() - iVar.a;
            long j2 = l.a;
            if (a2 < j2) {
                return j2 - a2;
            }
        } while (!a.compareAndSet(mVar, iVar, null));
        a(iVar, false);
        return -1L;
    }
}
