package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.se0.j0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes4.dex */
public class h {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_prev");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes4.dex */
    public static abstract class a extends com.amazon.aps.iva.xe0.a<h> {
        public final h b;
        public h c;

        public a(h hVar) {
            this.b = hVar;
        }

        @Override // com.amazon.aps.iva.xe0.a
        public final void b(h hVar, Object obj) {
            boolean z;
            h hVar2;
            h hVar3 = hVar;
            boolean z2 = true;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            h hVar4 = this.b;
            if (z) {
                hVar2 = hVar4;
            } else {
                hVar2 = this.c;
            }
            if (hVar2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(hVar3, this, hVar2)) {
                        if (atomicReferenceFieldUpdater.get(hVar3) != this) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z2 && z) {
                    h hVar5 = this.c;
                    com.amazon.aps.iva.yb0.j.c(hVar5);
                    hVar4.h(hVar5);
                }
            }
        }
    }

    public void dispose() {
        n();
    }

    public final boolean f(h hVar, g gVar) {
        boolean z;
        c.lazySet(hVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        atomicReferenceFieldUpdater.lazySet(hVar, gVar);
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, gVar, hVar)) {
                z = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != gVar) {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        hVar.h(gVar);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
        r7 = com.amazon.aps.iva.xe0.h.b;
        r4 = ((com.amazon.aps.iva.xe0.n) r4).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        if (r7.compareAndSet(r3, r1, r4) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
        if (r7.get(r3) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
        if (r5 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.xe0.h g() {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = r9._prev
            com.amazon.aps.iva.xe0.h r0 = (com.amazon.aps.iva.xe0.h) r0
            r1 = r0
        L5:
            r2 = 0
            r3 = r2
        L7:
            java.lang.Object r4 = r1._next
            r5 = 0
            r6 = 1
            if (r4 != r9) goto L24
            if (r0 != r1) goto L10
            return r1
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = com.amazon.aps.iva.xe0.h.c
        L12:
            boolean r2 = r7.compareAndSet(r9, r0, r1)
            if (r2 == 0) goto L1a
            r5 = r6
            goto L20
        L1a:
            java.lang.Object r2 = r7.get(r9)
            if (r2 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r1
        L24:
            boolean r7 = r9.m()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r4 != 0) goto L2e
            return r1
        L2e:
            boolean r7 = r4 instanceof com.amazon.aps.iva.xe0.m
            if (r7 == 0) goto L38
            com.amazon.aps.iva.xe0.m r4 = (com.amazon.aps.iva.xe0.m) r4
            r4.a(r1)
            goto L0
        L38:
            boolean r7 = r4 instanceof com.amazon.aps.iva.xe0.n
            if (r7 == 0) goto L5c
            if (r3 == 0) goto L57
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = com.amazon.aps.iva.xe0.h.b
            com.amazon.aps.iva.xe0.n r4 = (com.amazon.aps.iva.xe0.n) r4
            com.amazon.aps.iva.xe0.h r4 = r4.a
        L44:
            boolean r2 = r7.compareAndSet(r3, r1, r4)
            if (r2 == 0) goto L4c
            r5 = r6
            goto L52
        L4c:
            java.lang.Object r2 = r7.get(r3)
            if (r2 == r1) goto L44
        L52:
            if (r5 != 0) goto L55
            goto L0
        L55:
            r1 = r3
            goto L5
        L57:
            java.lang.Object r1 = r1._prev
            com.amazon.aps.iva.xe0.h r1 = (com.amazon.aps.iva.xe0.h) r1
            goto L7
        L5c:
            r3 = r4
            com.amazon.aps.iva.xe0.h r3 = (com.amazon.aps.iva.xe0.h) r3
            r8 = r3
            r3 = r1
            r1 = r8
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe0.h.g():com.amazon.aps.iva.xe0.h");
    }

    public final void h(h hVar) {
        boolean z;
        do {
            h hVar2 = (h) hVar._prev;
            if (i() != hVar) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(hVar, hVar2, this)) {
                    z = true;
                    continue;
                    break;
                } else if (atomicReferenceFieldUpdater.get(hVar) != hVar2) {
                    z = false;
                    continue;
                    break;
                }
            }
        } while (!z);
        if (m()) {
            hVar.g();
        }
    }

    public final Object i() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof m)) {
                return obj;
            }
            ((m) obj).a(this);
        }
    }

    public final h j() {
        n nVar;
        h hVar;
        Object i = i();
        if (i instanceof n) {
            nVar = (n) i;
        } else {
            nVar = null;
        }
        if (nVar == null || (hVar = nVar.a) == null) {
            return (h) i;
        }
        return hVar;
    }

    public final h k() {
        h g = g();
        if (g == null) {
            Object obj = this._prev;
            while (true) {
                g = (h) obj;
                if (!g.m()) {
                    break;
                }
                obj = g._prev;
            }
        }
        return g;
    }

    public final void l() {
        h hVar = this;
        while (true) {
            Object i = hVar.i();
            if (i instanceof n) {
                hVar = ((n) i).a;
            } else {
                hVar.g();
                return;
            }
        }
    }

    public boolean m() {
        return i() instanceof n;
    }

    public boolean n() {
        if (o() == null) {
            return true;
        }
        return false;
    }

    public final h o() {
        h hVar;
        boolean z;
        do {
            Object i = i();
            if (i instanceof n) {
                return ((n) i).a;
            }
            if (i == this) {
                return (h) i;
            }
            hVar = (h) i;
            n nVar = (n) hVar._removedRef;
            if (nVar == null) {
                nVar = new n(hVar);
                d.lazySet(hVar, nVar);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, i, nVar)) {
                    z = true;
                    continue;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != i) {
                    z = false;
                    continue;
                    break;
                }
            }
        } while (!z);
        hVar.g();
        return null;
    }

    public final int p(h hVar, h hVar2, a aVar) {
        boolean z;
        c.lazySet(hVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        atomicReferenceFieldUpdater.lazySet(hVar, hVar2);
        aVar.c = hVar2;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, hVar2, aVar)) {
                z = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != hVar2) {
                z = false;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new com.amazon.aps.iva.yb0.t(this) { // from class: com.amazon.aps.iva.xe0.h.b
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + j0.e(this);
    }
}
