package com.amazon.aps.iva.ze0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: Semaphore.kt */
/* loaded from: classes4.dex */
public final class h implements f {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    volatile /* synthetic */ int _availablePermits;
    public final g b;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;
    public final int a = 1;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;

    public h(int i) {
        boolean z;
        if (i >= 0 && i <= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j jVar = new j(0L, null, 2);
            this.head = jVar;
            this.tail = jVar;
            this._availablePermits = 1 - i;
            this.b = new g(this);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    @Override // com.amazon.aps.iva.ze0.f
    public final int a() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // com.amazon.aps.iva.ze0.f
    public final boolean b() {
        int i;
        do {
            i = this._availablePermits;
            if (i <= 0) {
                return false;
            }
        } while (!g.compareAndSet(this, i, i - 1));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0077, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00de A[EDGE_INSN: B:91:0x00de->B:68:0x00de ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.amazon.aps.iva.xe0.q] */
    @Override // com.amazon.aps.iva.ze0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r16) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ze0.h.c(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x007d, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
        r8 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.amazon.aps.iva.xe0.q] */
    @Override // com.amazon.aps.iva.ze0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void release() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ze0.h.release():void");
    }
}
