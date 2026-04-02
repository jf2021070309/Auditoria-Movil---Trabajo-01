package i.a.i2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class i {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9066b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9067c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes2.dex */
    public static abstract class a extends c<i> {

        /* renamed from: b  reason: collision with root package name */
        public final i f9068b;

        /* renamed from: c  reason: collision with root package name */
        public i f9069c;

        public a(i iVar) {
            this.f9068b = iVar;
        }

        @Override // i.a.i2.c
        public void b(i iVar, Object obj) {
            i iVar2 = iVar;
            boolean z = obj == null;
            i iVar3 = z ? this.f9068b : this.f9069c;
            if (iVar3 != null && i.a.compareAndSet(iVar2, this, iVar3) && z) {
                i iVar4 = this.f9068b;
                i iVar5 = this.f9069c;
                h.o.c.j.c(iVar5);
                iVar4.e(iVar5);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (i.a.i2.i.a.compareAndSet(r2, r1, ((i.a.i2.n) r3).a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i.a.i2.i d(i.a.i2.m r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r7 = r6._prev
            i.a.i2.i r7 = (i.a.i2.i) r7
            r0 = 0
            r1 = r7
        L6:
            r2 = r0
        L7:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L18
            if (r7 != r1) goto Le
            return r1
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i.a.i2.i.f9066b
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L17
            goto L0
        L17:
            return r1
        L18:
            boolean r4 = r6.m()
            if (r4 == 0) goto L1f
            return r0
        L1f:
            if (r3 != 0) goto L22
            return r1
        L22:
            boolean r4 = r3 instanceof i.a.i2.m
            if (r4 == 0) goto L2c
            i.a.i2.m r3 = (i.a.i2.m) r3
            r3.a(r1)
            goto L0
        L2c:
            boolean r4 = r3 instanceof i.a.i2.n
            if (r4 == 0) goto L46
            if (r2 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = i.a.i2.i.a
            i.a.i2.n r3 = (i.a.i2.n) r3
            i.a.i2.i r3 = r3.a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r1 = r2
            goto L6
        L41:
            java.lang.Object r1 = r1._prev
            i.a.i2.i r1 = (i.a.i2.i) r1
            goto L7
        L46:
            r2 = r3
            i.a.i2.i r2 = (i.a.i2.i) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.i2.i.d(i.a.i2.m):i.a.i2.i");
    }

    public final void e(i iVar) {
        i iVar2;
        do {
            iVar2 = (i) iVar._prev;
            if (g() != iVar) {
                return;
            }
        } while (!f9066b.compareAndSet(iVar, iVar2, this));
        if (m()) {
            iVar.d(null);
        }
    }

    public final Object g() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof m)) {
                return obj;
            }
            ((m) obj).a(this);
        }
    }

    public final i j() {
        Object g2 = g();
        n nVar = g2 instanceof n ? (n) g2 : null;
        return nVar == null ? (i) g2 : nVar.a;
    }

    public final i k() {
        i d2 = d(null);
        if (d2 == null) {
            Object obj = this._prev;
            while (true) {
                d2 = (i) obj;
                if (!d2.m()) {
                    break;
                }
                obj = d2._prev;
            }
        }
        return d2;
    }

    public final void l() {
        i iVar = this;
        while (true) {
            Object g2 = iVar.g();
            if (!(g2 instanceof n)) {
                iVar.d(null);
                return;
            }
            iVar = ((n) g2).a;
        }
    }

    public boolean m() {
        return g() instanceof n;
    }

    public final i n() {
        Object g2;
        i iVar;
        n nVar;
        do {
            g2 = g();
            if (g2 instanceof n) {
                return ((n) g2).a;
            }
            if (g2 == this) {
                return (i) g2;
            }
            iVar = (i) g2;
            nVar = (n) iVar._removedRef;
            if (nVar == null) {
                nVar = new n(iVar);
                f9067c.lazySet(iVar, nVar);
            }
        } while (!a.compareAndSet(this, g2, nVar));
        iVar.d(null);
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
