package com.amazon.aps.iva.xe0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes4.dex */
public final class j<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final s g = new s("REMOVE_FROZEN");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(j.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    public j(int i, boolean z) {
        boolean z2;
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((i & i2) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r15) {
        /*
            r14 = this;
        L0:
            long r2 = r14._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L15
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L14
            r1 = 2
        L14:
            return r1
        L15:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r11 = r14.c
            int r4 = r10 + 2
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L30
            return r1
        L30:
            boolean r4 = r14.b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.d
            r12 = r10 & r11
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r2 = r14.a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L0
        L4e:
            return r1
        L4f:
            int r0 = r10 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = com.amazon.aps.iva.xe0.j.f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r0
            long r12 = r12 << r9
            long r4 = r4 | r12
            r0 = r1
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L94
            com.amazon.aps.iva.xe0.j r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.d
            int r2 = r0.c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof com.amazon.aps.iva.xe0.j.a
            if (r4 == 0) goto L91
            com.amazon.aps.iva.xe0.j$a r3 = (com.amazon.aps.iva.xe0.j.a) r3
            int r3 = r3.a
            if (r3 != r10) goto L91
            r1.set(r2, r15)
            goto L92
        L91:
            r0 = 0
        L92:
            if (r0 != 0) goto L6d
        L94:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe0.j.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j = this._state;
        if (((int) ((1073741823 & j) >> 0)) != ((int) ((j & 1152921503533105152L) >> 30))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<E> e() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) == 0) {
                long j2 = j | 1152921504606846976L;
                if (f.compareAndSet(this, j, j2)) {
                    j = j2;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            j<E> jVar = (j) this._next;
            if (jVar != null) {
                return jVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            j jVar2 = new j(this.a * 2, this.b);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new a(i);
                }
                jVar2.d.set(jVar2.c & i, obj);
                i++;
            }
            jVar2._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, jVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.c;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.d.get(i4);
            if (obj == null) {
                if (this.b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j2 = ((i + 1) & 1073741823) << 0;
                if (f.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    this.d.set(this.c & i, null);
                    return obj;
                } else if (this.b) {
                    j<E> jVar = this;
                    while (true) {
                        long j3 = jVar._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            jVar = jVar.e();
                        } else {
                            if (f.compareAndSet(jVar, j3, (j3 & (-1073741824)) | j2)) {
                                jVar.d.set(jVar.c & i5, null);
                                jVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (jVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
