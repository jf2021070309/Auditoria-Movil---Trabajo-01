package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.ee0.f1;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ArrayChannel.kt */
/* loaded from: classes4.dex */
public final class d<E> extends com.amazon.aps.iva.ue0.a<E> {
    public final int e;
    public final e f;
    public final ReentrantLock g;
    public Object[] h;
    public int i;
    private volatile /* synthetic */ int size;

    /* compiled from: ArrayChannel.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            a = iArr;
        }
    }

    public d(int i, e eVar, com.amazon.aps.iva.xb0.l<? super E, com.amazon.aps.iva.kb0.q> lVar) {
        super(lVar);
        this.e = i;
        this.f = eVar;
        if (i >= 1) {
            this.g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            com.amazon.aps.iva.lb0.m.K(objArr, com.amazon.aps.iva.a0.k.e);
            this.h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final Object A() {
        Object obj;
        boolean z;
        v vVar;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            int i = this.size;
            Object obj2 = com.amazon.aps.iva.a0.k.h;
            if (i == 0) {
                j<?> f = f();
                if (f != null) {
                    obj2 = f;
                }
                return obj2;
            }
            Object[] objArr = this.h;
            int i2 = this.i;
            Object obj3 = objArr[i2];
            v vVar2 = null;
            objArr[i2] = null;
            this.size = i - 1;
            if (i == this.e) {
                while (true) {
                    vVar = p();
                    if (vVar == null) {
                        break;
                    } else if (vVar.t() != null) {
                        obj = vVar.r();
                        z = true;
                        break;
                    } else {
                        vVar.u();
                        vVar2 = vVar;
                    }
                }
            }
            obj = obj2;
            v vVar3 = vVar2;
            z = false;
            vVar = vVar3;
            if (obj != obj2 && !(obj instanceof j)) {
                this.size = i;
                Object[] objArr2 = this.h;
                objArr2[(this.i + i) % objArr2.length] = obj;
            }
            this.i = (this.i + 1) % this.h.length;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            if (z) {
                com.amazon.aps.iva.yb0.j.c(vVar);
                vVar.q();
            }
            return obj3;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void D(int i, E e) {
        int i2 = this.e;
        if (i < i2) {
            Object[] objArr = this.h;
            if (i >= objArr.length) {
                int min = Math.min(objArr.length * 2, i2);
                Object[] objArr2 = new Object[min];
                for (int i3 = 0; i3 < i; i3++) {
                    Object[] objArr3 = this.h;
                    objArr2[i3] = objArr3[(this.i + i3) % objArr3.length];
                }
                Arrays.fill(objArr2, i, min, com.amazon.aps.iva.a0.k.e);
                this.h = objArr2;
                this.i = 0;
            }
            Object[] objArr4 = this.h;
            objArr4[(this.i + i) % objArr4.length] = e;
            return;
        }
        Object[] objArr5 = this.h;
        int i4 = this.i;
        objArr5[i4 % objArr5.length] = null;
        objArr5[(i + i4) % objArr5.length] = e;
        this.i = (i4 + 1) % objArr5.length;
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final Object d(x xVar) {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            return super.d(xVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final String e() {
        StringBuilder sb = new StringBuilder("(buffer:capacity=");
        sb.append(this.e);
        sb.append(",size=");
        return b2.b(sb, this.size, ')');
    }

    @Override // com.amazon.aps.iva.ue0.a, com.amazon.aps.iva.ue0.s
    public final boolean isEmpty() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            return x();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final boolean k() {
        return false;
    }

    @Override // com.amazon.aps.iva.ue0.b
    public final boolean l() {
        if (this.size == this.e && this.f == e.SUSPEND) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    @Override // com.amazon.aps.iva.ue0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(E r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.g
            r0.lock()
            int r1 = r5.size     // Catch: java.lang.Throwable -> L70
            com.amazon.aps.iva.ue0.j r2 = r5.f()     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L11
            r0.unlock()
            return r2
        L11:
            int r2 = r5.e     // Catch: java.lang.Throwable -> L70
            com.amazon.aps.iva.xe0.s r3 = com.amazon.aps.iva.a0.k.f
            if (r1 >= r2) goto L1c
            int r2 = r1 + 1
            r5.size = r2     // Catch: java.lang.Throwable -> L70
            goto L2f
        L1c:
            com.amazon.aps.iva.ue0.e r2 = r5.f     // Catch: java.lang.Throwable -> L70
            int[] r4 = com.amazon.aps.iva.ue0.d.a.a     // Catch: java.lang.Throwable -> L70
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L70
            r2 = r4[r2]     // Catch: java.lang.Throwable -> L70
            r4 = 1
            if (r2 == r4) goto L39
            r4 = 2
            if (r2 == r4) goto L37
            r4 = 3
            if (r2 != r4) goto L31
        L2f:
            r2 = 0
            goto L3b
        L31:
            com.amazon.aps.iva.kb0.h r6 = new com.amazon.aps.iva.kb0.h     // Catch: java.lang.Throwable -> L70
            r6.<init>()     // Catch: java.lang.Throwable -> L70
            throw r6     // Catch: java.lang.Throwable -> L70
        L37:
            r2 = r3
            goto L3b
        L39:
            com.amazon.aps.iva.xe0.s r2 = com.amazon.aps.iva.a0.k.g     // Catch: java.lang.Throwable -> L70
        L3b:
            if (r2 == 0) goto L41
            r0.unlock()
            return r2
        L41:
            if (r1 != 0) goto L69
        L43:
            com.amazon.aps.iva.ue0.t r2 = r5.n()     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L4a
            goto L69
        L4a:
            boolean r4 = r2 instanceof com.amazon.aps.iva.ue0.j     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L54
            r5.size = r1     // Catch: java.lang.Throwable -> L70
            r0.unlock()
            return r2
        L54:
            com.amazon.aps.iva.xe0.s r4 = r2.a(r6)     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L43
            r5.size = r1     // Catch: java.lang.Throwable -> L70
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L70
            r0.unlock()
            r2.e(r6)
            java.lang.Object r6 = r2.b()
            return r6
        L69:
            r5.D(r1, r6)     // Catch: java.lang.Throwable -> L70
            r0.unlock()
            return r3
        L70:
            r6 = move-exception
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ue0.d.m(java.lang.Object):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final boolean s(r<? super E> rVar) {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            return super.s(rVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final boolean t() {
        return false;
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final boolean v() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final boolean w() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            return super.w();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.amazon.aps.iva.ue0.a
    public final void y(boolean z) {
        com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> lVar = this.b;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            int i = this.size;
            com.amazon.aps.iva.xe0.y yVar = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.h[this.i];
                com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.a0.k.e;
                if (lVar != null && obj != sVar) {
                    yVar = f1.m(lVar, obj, yVar);
                }
                Object[] objArr = this.h;
                int i3 = this.i;
                objArr[i3] = sVar;
                this.i = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            reentrantLock.unlock();
            super.y(z);
            if (yVar == null) {
                return;
            }
            throw yVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
