package com.amazon.aps.iva.ve0;

import java.util.Arrays;
/* compiled from: SharedFlow.kt */
/* loaded from: classes4.dex */
public class l0<T> extends com.amazon.aps.iva.we0.b<n0> implements f0<T>, f {
    public final int f;
    public final int g;
    public final com.amazon.aps.iva.ue0.e h;
    public Object[] i;
    public long j;
    public long k;
    public int l;
    public int m;

    /* compiled from: SharedFlow.kt */
    /* loaded from: classes4.dex */
    public static final class a implements com.amazon.aps.iva.se0.t0 {
        public final l0<?> b;
        public final long c;
        public final Object d;
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> e;

        public a(l0 l0Var, long j, Object obj, com.amazon.aps.iva.se0.n nVar) {
            this.b = l0Var;
            this.c = j;
            this.d = obj;
            this.e = nVar;
        }

        @Override // com.amazon.aps.iva.se0.t0
        public final void dispose() {
            l0<?> l0Var = this.b;
            synchronized (l0Var) {
                if (this.c >= l0Var.p()) {
                    Object[] objArr = l0Var.i;
                    com.amazon.aps.iva.yb0.j.c(objArr);
                    int i = (int) this.c;
                    if (objArr[(objArr.length - 1) & i] == this) {
                        objArr[i & (objArr.length - 1)] = com.amazon.aps.iva.ab.t.k;
                        l0Var.k();
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    }
                }
            }
        }
    }

    /* compiled from: SharedFlow.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.ue0.e.values().length];
            iArr[com.amazon.aps.iva.ue0.e.SUSPEND.ordinal()] = 1;
            iArr[com.amazon.aps.iva.ue0.e.DROP_LATEST.ordinal()] = 2;
            iArr[com.amazon.aps.iva.ue0.e.DROP_OLDEST.ordinal()] = 3;
            a = iArr;
        }
    }

    public l0(int i, int i2, com.amazon.aps.iva.ue0.e eVar) {
        this.f = i;
        this.g = i2;
        this.h = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
        throw r8.p();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.pb0.a l(com.amazon.aps.iva.ve0.l0 r8, com.amazon.aps.iva.ve0.g r9, com.amazon.aps.iva.ob0.d r10) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.l0.l(com.amazon.aps.iva.ve0.l0, com.amazon.aps.iva.ve0.g, com.amazon.aps.iva.ob0.d):com.amazon.aps.iva.pb0.a");
    }

    @Override // com.amazon.aps.iva.ve0.f0, com.amazon.aps.iva.ve0.g
    public final Object a(T t, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>[] dVarArr;
        a aVar;
        if (b(t)) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>[] dVarArr2 = com.amazon.aps.iva.da0.a.b;
        synchronized (this) {
            if (r(t)) {
                nVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
                dVarArr = o(dVarArr2);
                aVar = null;
            } else {
                a aVar2 = new a(this, this.l + this.m + p(), t, nVar);
                n(aVar2);
                this.m++;
                if (this.g == 0) {
                    dVarArr2 = o(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            nVar.w(new com.amazon.aps.iva.se0.u0(aVar));
        }
        for (com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> dVar2 : dVarArr) {
            if (dVar2 != null) {
                dVar2.resumeWith(com.amazon.aps.iva.kb0.q.a);
            }
        }
        Object q = nVar.q();
        com.amazon.aps.iva.pb0.a aVar3 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (q != aVar3) {
            q = com.amazon.aps.iva.kb0.q.a;
        }
        if (q != aVar3) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        return q;
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final boolean b(T t) {
        int i;
        boolean z;
        com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>[] dVarArr = com.amazon.aps.iva.da0.a.b;
        synchronized (this) {
            if (r(t)) {
                dVarArr = o(dVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(g<? super T> gVar, com.amazon.aps.iva.ob0.d<?> dVar) {
        return l(this, gVar, dVar);
    }

    @Override // com.amazon.aps.iva.we0.b
    public final n0 e() {
        return new n0();
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final void g() {
        synchronized (this) {
            u(p() + this.l, this.k, p() + this.l, p() + this.l + this.m);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.we0.b
    public final com.amazon.aps.iva.we0.c[] h() {
        return new n0[2];
    }

    public final Object j(n0 n0Var, m0 m0Var) {
        com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(m0Var));
        nVar.r();
        synchronized (this) {
            if (s(n0Var) < 0) {
                n0Var.b = nVar;
            } else {
                nVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
        Object q = nVar.q();
        if (q == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return q;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final void k() {
        if (this.g == 0 && this.m <= 1) {
            return;
        }
        Object[] objArr = this.i;
        com.amazon.aps.iva.yb0.j.c(objArr);
        while (this.m > 0) {
            long p = p();
            int i = this.l;
            int i2 = this.m;
            if (objArr[((int) ((p + (i + i2)) - 1)) & (objArr.length - 1)] == com.amazon.aps.iva.ab.t.k) {
                this.m = i2 - 1;
                objArr[((int) (p() + this.l + this.m)) & (objArr.length - 1)] = null;
            } else {
                return;
            }
        }
    }

    public final void m() {
        Object[] objArr;
        Object[] objArr2 = this.i;
        com.amazon.aps.iva.yb0.j.c(objArr2);
        objArr2[((int) p()) & (objArr2.length - 1)] = null;
        this.l--;
        long p = p() + 1;
        if (this.j < p) {
            this.j = p;
        }
        if (this.k < p) {
            if (this.c != 0 && (objArr = this.b) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        n0 n0Var = (n0) obj;
                        long j = n0Var.a;
                        if (j >= 0 && j < p) {
                            n0Var.a = p;
                        }
                    }
                }
            }
            this.k = p;
        }
    }

    public final void n(Object obj) {
        int i = this.l + this.m;
        Object[] objArr = this.i;
        if (objArr == null) {
            objArr = q(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = q(i, objArr.length * 2, objArr);
        }
        objArr[((int) (p() + i)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>[] o(com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>[] dVarArr) {
        Object[] objArr;
        n0 n0Var;
        com.amazon.aps.iva.se0.n nVar;
        int length = dVarArr.length;
        if (this.c != 0 && (objArr = this.b) != null) {
            int length2 = objArr.length;
            int i = 0;
            dVarArr = dVarArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (nVar = (n0Var = (n0) obj).b) != null && s(n0Var) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = nVar;
                    n0Var.b = null;
                    length++;
                }
                i++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long p() {
        return Math.min(this.k, this.j);
    }

    public final Object[] q(int i, int i2, Object[] objArr) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.i = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long p = p();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (i3 + p);
                objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean r(T t) {
        int i = this.c;
        int i2 = this.f;
        if (i == 0) {
            if (i2 != 0) {
                n(t);
                int i3 = this.l + 1;
                this.l = i3;
                if (i3 > i2) {
                    m();
                }
                this.k = p() + this.l;
            }
            return true;
        }
        int i4 = this.l;
        int i5 = this.g;
        if (i4 >= i5 && this.k <= this.j) {
            int i6 = b.a[this.h.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        n(t);
        int i7 = this.l + 1;
        this.l = i7;
        if (i7 > i5) {
            m();
        }
        long p = p() + this.l;
        long j = this.j;
        if (((int) (p - j)) > i2) {
            u(j + 1, this.k, p() + this.l, p() + this.l + this.m);
        }
        return true;
    }

    public final long s(n0 n0Var) {
        long j = n0Var.a;
        if (j < p() + this.l) {
            return j;
        }
        if (this.g > 0 || j > p() || this.m == 0) {
            return -1L;
        }
        return j;
    }

    public final Object t(n0 n0Var) {
        Object obj;
        com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>[] dVarArr = com.amazon.aps.iva.da0.a.b;
        synchronized (this) {
            long s = s(n0Var);
            if (s < 0) {
                obj = com.amazon.aps.iva.ab.t.k;
            } else {
                long j = n0Var.a;
                Object[] objArr = this.i;
                com.amazon.aps.iva.yb0.j.c(objArr);
                Object obj2 = objArr[((int) s) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).d;
                }
                n0Var.a = s + 1;
                Object obj3 = obj2;
                dVarArr = v(j);
                obj = obj3;
            }
        }
        for (com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long p = p(); p < min; p++) {
            Object[] objArr = this.i;
            com.amazon.aps.iva.yb0.j.c(objArr);
            objArr[((int) p) & (objArr.length - 1)] = null;
        }
        this.j = j;
        this.k = j2;
        this.l = (int) (j3 - min);
        this.m = (int) (j4 - j3);
    }

    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>[] v(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        Object[] objArr;
        int i2 = (j > this.k ? 1 : (j == this.k ? 0 : -1));
        com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>[] dVarArr = com.amazon.aps.iva.da0.a.b;
        if (i2 > 0) {
            return dVarArr;
        }
        long p = p();
        long j6 = this.l + p;
        int i3 = this.g;
        if (i3 == 0 && this.m > 0) {
            j6++;
        }
        if (this.c != 0 && (objArr = this.b) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j7 = ((n0) obj).a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.k) {
            return dVarArr;
        }
        long p2 = p() + this.l;
        if (this.c > 0) {
            i = Math.min(this.m, i3 - ((int) (p2 - j6)));
        } else {
            i = this.m;
        }
        long j8 = this.m + p2;
        com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.ab.t.k;
        if (i > 0) {
            dVarArr = new com.amazon.aps.iva.ob0.d[i];
            Object[] objArr2 = this.i;
            com.amazon.aps.iva.yb0.j.c(objArr2);
            long j9 = p2;
            int i4 = 0;
            while (true) {
                if (p2 < j8) {
                    j2 = j6;
                    int i5 = (int) p2;
                    Object obj2 = objArr2[(objArr2.length - 1) & i5];
                    if (obj2 != sVar) {
                        if (obj2 != null) {
                            a aVar = (a) obj2;
                            j3 = j8;
                            int i6 = i4 + 1;
                            dVarArr[i4] = aVar.e;
                            objArr2[i5 & (objArr2.length - 1)] = sVar;
                            objArr2[((int) j9) & (objArr2.length - 1)] = aVar.d;
                            j5 = 1;
                            j9++;
                            if (i6 >= i) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        }
                    } else {
                        j3 = j8;
                        j5 = 1;
                    }
                    p2 += j5;
                    j6 = j2;
                    j8 = j3;
                } else {
                    j2 = j6;
                    j3 = j8;
                    break;
                }
            }
            p2 = j9;
        } else {
            j2 = j6;
            j3 = j8;
        }
        com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>[] dVarArr2 = dVarArr;
        int i7 = (int) (p2 - p);
        if (this.c == 0) {
            j4 = p2;
        } else {
            j4 = j2;
        }
        long max = Math.max(this.j, p2 - Math.min(this.f, i7));
        if (i3 == 0 && max < j3) {
            Object[] objArr3 = this.i;
            com.amazon.aps.iva.yb0.j.c(objArr3);
            if (com.amazon.aps.iva.yb0.j.a(objArr3[((int) max) & (objArr3.length - 1)], sVar)) {
                p2++;
                max++;
            }
        }
        u(max, j4, p2, j3);
        k();
        if (dVarArr2.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return o(dVarArr2);
        }
        return dVarArr2;
    }
}
