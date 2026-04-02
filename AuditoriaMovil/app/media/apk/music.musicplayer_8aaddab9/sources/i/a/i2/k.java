package i.a.i2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public final class k<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f9073e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9074f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9075g;

    /* renamed from: h  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f9076h;
    public static final a a = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final q f9072d = new q("REMOVE_FROZEN");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9070b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9071c = AtomicLongFieldUpdater.newUpdater(k.class, "_state");

    /* loaded from: classes2.dex */
    public static final class a {
        public a(h.o.c.f fVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;

        public b(int i2) {
            this.a = i2;
        }
    }

    public k(int i2, boolean z) {
        this.f9073e = i2;
        this.f9074f = z;
        int i3 = i2 - 1;
        this.f9075g = i3;
        this.f9076h = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
        L4:
            long r2 = r6._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r8 = 0
            r4 = 1
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 == 0) goto L19
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L18
            r4 = 2
        L18:
            return r4
        L19:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r10 = 0
            long r0 = r0 >> r10
            int r1 = (int) r0
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r13 = r2 & r11
            r0 = 30
            long r13 = r13 >> r0
            int r14 = (int) r13
            int r13 = r6.f9075g
            int r5 = r14 + 2
            r5 = r5 & r13
            r15 = r1 & r13
            if (r5 != r15) goto L35
            return r4
        L35:
            boolean r5 = r6.f9074f
            r15 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L54
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r6.f9076h
            r10 = r14 & r13
            java.lang.Object r5 = r5.get(r10)
            if (r5 == 0) goto L54
            int r0 = r6.f9073e
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L53
            int r14 = r14 - r1
            r1 = r14 & r15
            int r0 = r0 >> 1
            if (r1 <= r0) goto L4
        L53:
            return r4
        L54:
            int r1 = r14 + 1
            r1 = r1 & r15
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = i.a.i2.k.f9071c
            r16 = -1
            long r11 = r11 ^ r16
            long r11 = r11 & r2
            long r8 = (long) r1
            long r0 = r8 << r0
            long r8 = r11 | r0
            r0 = r4
            r1 = r18
            r4 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f9076h
            r1 = r14 & r13
            r0.set(r1, r7)
            r0 = r6
        L75:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L82
        L80:
            r1 = 0
            goto La6
        L82:
            i.a.i2.k r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f9076h
            int r2 = r0.f9075g
            r2 = r2 & r14
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof i.a.i2.k.b
            if (r2 == 0) goto La2
            i.a.i2.k$b r1 = (i.a.i2.k.b) r1
            int r1 = r1.a
            if (r1 != r14) goto La2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f9076h
            int r2 = r0.f9075g
            r2 = r2 & r14
            r1.set(r2, r7)
            goto La3
        La2:
            r0 = 0
        La3:
            if (r0 != 0) goto L75
            goto L80
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.i2.k.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f9071c.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final boolean d() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k<E> e() {
        long j2;
        while (true) {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) == 0) {
                long j3 = j2 | 1152921504606846976L;
                if (f9071c.compareAndSet(this, j2, j3)) {
                    j2 = j3;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            k<E> kVar = (k) this._next;
            if (kVar != null) {
                return kVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9070b;
            k kVar2 = new k(this.f9073e * 2, this.f9074f);
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.f9075g;
                int i5 = i2 & i4;
                if (i5 != (i4 & i3)) {
                    Object obj = this.f9076h.get(i5);
                    if (obj == null) {
                        obj = new b(i2);
                    }
                    kVar2.f9076h.set(kVar2.f9075g & i2, obj);
                    i2++;
                }
            }
            kVar2._state = (-1152921504606846977L) & j2;
            atomicReferenceFieldUpdater.compareAndSet(this, null, kVar2);
        }
    }

    public final Object f() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return f9072d;
            }
            int i2 = (int) ((j2 & 1073741823) >> 0);
            int i3 = this.f9075g;
            int i4 = ((int) ((1152921503533105152L & j2) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                return null;
            }
            Object obj = this.f9076h.get(i5);
            if (obj == null) {
                if (this.f9074f) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                long j3 = ((i2 + 1) & 1073741823) << 0;
                if (f9071c.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    this.f9076h.set(this.f9075g & i2, null);
                    return obj;
                } else if (this.f9074f) {
                    k<E> kVar = this;
                    while (true) {
                        long j4 = kVar._state;
                        int i6 = (int) ((j4 & 1073741823) >> 0);
                        if ((j4 & 1152921504606846976L) != 0) {
                            kVar = kVar.e();
                        } else {
                            if (f9071c.compareAndSet(kVar, j4, j3 | (j4 & (-1073741824)))) {
                                kVar.f9076h.set(kVar.f9075g & i6, null);
                                kVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (kVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
