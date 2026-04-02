package i.a.h2;

import ch.qos.logback.classic.Level;
import e.j.d.w;
import i.a.p0;
import i.a.q0;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class o<T> extends i.a.h2.w.b<q> implements j<T>, i.a.h2.b {

    /* renamed from: d  reason: collision with root package name */
    public final int f9019d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9020e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.g2.e f9021f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f9022g;

    /* renamed from: h  reason: collision with root package name */
    public long f9023h;

    /* renamed from: i  reason: collision with root package name */
    public long f9024i;

    /* renamed from: j  reason: collision with root package name */
    public int f9025j;

    /* renamed from: k  reason: collision with root package name */
    public int f9026k;

    /* loaded from: classes2.dex */
    public static final class a implements p0 {
        public final o<?> a;

        /* renamed from: b  reason: collision with root package name */
        public long f9027b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f9028c;

        /* renamed from: d  reason: collision with root package name */
        public final h.m.d<h.k> f9029d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(o<?> oVar, long j2, Object obj, h.m.d<? super h.k> dVar) {
            this.a = oVar;
            this.f9027b = j2;
            this.f9028c = obj;
            this.f9029d = dVar;
        }

        @Override // i.a.p0
        public void dispose() {
            o<?> oVar = this.a;
            synchronized (oVar) {
                if (this.f9027b < oVar.m()) {
                    return;
                }
                Object[] objArr = oVar.f9022g;
                h.o.c.j.c(objArr);
                int i2 = (int) this.f9027b;
                if (objArr[(objArr.length - 1) & i2] != this) {
                    return;
                }
                objArr[i2 & (objArr.length - 1)] = p.a;
                oVar.h();
            }
        }
    }

    @h.m.i.a.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {341, 348, 351}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class b extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f9030b;

        /* renamed from: c  reason: collision with root package name */
        public Object f9031c;

        /* renamed from: d  reason: collision with root package name */
        public Object f9032d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f9033e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ o<T> f9034f;

        /* renamed from: g  reason: collision with root package name */
        public int f9035g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o<T> oVar, h.m.d<? super b> dVar) {
            super(dVar);
            this.f9034f = oVar;
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f9033e = obj;
            this.f9035g |= Level.ALL_INT;
            return this.f9034f.a(null, this);
        }
    }

    public o(int i2, int i3, i.a.g2.e eVar) {
        this.f9019d = i2;
        this.f9020e = i3;
        this.f9021f = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:14:0x0039, B:35:0x00a0, B:41:0x00b1, B:39:0x00ab, B:44:0x00c2, B:45:0x00c6, B:46:0x00c7, B:19:0x0057, B:22:0x0069, B:33:0x0090), top: B:56:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [i.a.h2.w.d] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6, types: [i.a.h2.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [i.a.h2.w.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00bf -> B:15:0x003c). Please submit an issue!!! */
    @Override // i.a.h2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(i.a.h2.c<? super T> r9, h.m.d<? super h.k> r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.h2.o.a(i.a.h2.c, h.m.d):java.lang.Object");
    }

    @Override // i.a.h2.j, i.a.h2.c
    public Object b(T t, h.m.d<? super h.k> dVar) {
        int i2;
        boolean z;
        h.m.d<h.k>[] dVarArr;
        a aVar;
        h.m.d<h.k>[] dVarArr2 = i.a.h2.w.c.a;
        synchronized (this) {
            i2 = 0;
            if (p(t)) {
                dVarArr2 = k(dVarArr2);
                z = true;
            } else {
                z = false;
            }
        }
        int length = dVarArr2.length;
        int i3 = 0;
        while (i3 < length) {
            h.m.d<h.k> dVar2 = dVarArr2[i3];
            i3++;
            if (dVar2 != null) {
                dVar2.resumeWith(h.k.a);
            }
        }
        if (z) {
            return h.k.a;
        }
        i.a.k kVar = new i.a.k(w.P(dVar), 1);
        kVar.p();
        h.m.d<h.k>[] dVarArr3 = i.a.h2.w.c.a;
        synchronized (this) {
            if (p(t)) {
                kVar.resumeWith(h.k.a);
                dVarArr = k(dVarArr3);
                aVar = null;
            } else {
                a aVar2 = new a(this, n() + m(), t, kVar);
                j(aVar2);
                this.f9026k++;
                if (this.f9020e == 0) {
                    dVarArr3 = k(dVarArr3);
                }
                dVarArr = dVarArr3;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            kVar.r(new q0(aVar));
        }
        int length2 = dVarArr.length;
        while (i2 < length2) {
            h.m.d<h.k> dVar3 = dVarArr[i2];
            i2++;
            if (dVar3 != null) {
                dVar3.resumeWith(h.k.a);
            }
        }
        Object o = kVar.o();
        h.m.h.a aVar3 = h.m.h.a.COROUTINE_SUSPENDED;
        if (o == aVar3) {
            h.o.c.j.e(dVar, "frame");
        }
        if (o != aVar3) {
            o = h.k.a;
        }
        return o == aVar3 ? o : h.k.a;
    }

    @Override // i.a.h2.w.b
    public q d() {
        return new q();
    }

    @Override // i.a.h2.w.b
    public q[] e(int i2) {
        return new q[i2];
    }

    public final Object g(q qVar, h.m.d<? super h.k> dVar) {
        h.k kVar;
        i.a.k kVar2 = new i.a.k(w.P(dVar), 1);
        kVar2.p();
        synchronized (this) {
            if (q(qVar) < 0) {
                qVar.f9036b = kVar2;
                qVar.f9036b = kVar2;
            } else {
                kVar2.resumeWith(h.k.a);
            }
            kVar = h.k.a;
        }
        Object o = kVar2.o();
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        if (o == aVar) {
            h.o.c.j.e(dVar, "frame");
        }
        return o == aVar ? o : kVar;
    }

    public final void h() {
        if (this.f9020e != 0 || this.f9026k > 1) {
            Object[] objArr = this.f9022g;
            h.o.c.j.c(objArr);
            while (this.f9026k > 0) {
                if (objArr[(objArr.length - 1) & ((int) ((m() + n()) - 1))] != p.a) {
                    return;
                }
                this.f9026k--;
                objArr[(objArr.length - 1) & ((int) (m() + n()))] = null;
            }
        }
    }

    public final void i() {
        Object[] objArr;
        Object[] objArr2 = this.f9022g;
        h.o.c.j.c(objArr2);
        objArr2[(objArr2.length - 1) & ((int) m())] = null;
        this.f9025j--;
        long m2 = m() + 1;
        if (this.f9023h < m2) {
            this.f9023h = m2;
        }
        if (this.f9024i < m2) {
            if (this.f9050b != 0 && (objArr = this.a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        q qVar = (q) obj;
                        long j2 = qVar.a;
                        if (j2 >= 0 && j2 < m2) {
                            qVar.a = m2;
                        }
                    }
                }
            }
            this.f9024i = m2;
        }
    }

    public final void j(Object obj) {
        int n2 = n();
        Object[] objArr = this.f9022g;
        if (objArr == null) {
            objArr = o(null, 0, 2);
        } else if (n2 >= objArr.length) {
            objArr = o(objArr, n2, objArr.length * 2);
        }
        objArr[((int) (m() + n2)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final h.m.d<h.k>[] k(h.m.d<h.k>[] dVarArr) {
        Object[] objArr;
        q qVar;
        h.m.d<? super h.k> dVar;
        int length = dVarArr.length;
        if (this.f9050b != 0 && (objArr = this.a) != null) {
            int length2 = objArr.length;
            int i2 = 0;
            dVarArr = dVarArr;
            while (i2 < length2) {
                Object obj = objArr[i2];
                if (obj != null && (dVar = (qVar = (q) obj).f9036b) != null && q(qVar) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        h.o.c.j.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = dVar;
                    qVar.f9036b = null;
                    length++;
                }
                i2++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long l() {
        return m() + this.f9025j;
    }

    public final long m() {
        return Math.min(this.f9024i, this.f9023h);
    }

    public final int n() {
        return this.f9025j + this.f9026k;
    }

    public final Object[] o(Object[] objArr, int i2, int i3) {
        int i4 = 0;
        if (i3 > 0) {
            Object[] objArr2 = new Object[i3];
            this.f9022g = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m2 = m();
            if (i2 > 0) {
                while (true) {
                    int i5 = i4 + 1;
                    int i6 = (int) (i4 + m2);
                    objArr2[i6 & (i3 - 1)] = objArr[(objArr.length - 1) & i6];
                    if (i5 >= i2) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean p(T t) {
        if (this.f9050b == 0) {
            if (this.f9019d != 0) {
                j(t);
                int i2 = this.f9025j + 1;
                this.f9025j = i2;
                if (i2 > this.f9019d) {
                    i();
                }
                this.f9024i = m() + this.f9025j;
            }
            return true;
        }
        if (this.f9025j >= this.f9020e && this.f9024i <= this.f9023h) {
            int ordinal = this.f9021f.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        j(t);
        int i3 = this.f9025j + 1;
        this.f9025j = i3;
        if (i3 > this.f9020e) {
            i();
        }
        long m2 = m() + this.f9025j;
        long j2 = this.f9023h;
        if (((int) (m2 - j2)) > this.f9019d) {
            s(j2 + 1, this.f9024i, l(), this.f9026k + m() + this.f9025j);
        }
        return true;
    }

    public final long q(q qVar) {
        long j2 = qVar.a;
        if (j2 < l()) {
            return j2;
        }
        if (this.f9020e <= 0 && j2 <= m() && this.f9026k != 0) {
            return j2;
        }
        return -1L;
    }

    public final Object r(q qVar) {
        Object obj;
        h.m.d<h.k>[] dVarArr = i.a.h2.w.c.a;
        synchronized (this) {
            long q = q(qVar);
            if (q < 0) {
                obj = p.a;
            } else {
                long j2 = qVar.a;
                Object[] objArr = this.f9022g;
                h.o.c.j.c(objArr);
                Object obj2 = objArr[((int) q) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).f9028c;
                }
                qVar.a = q + 1;
                Object obj3 = obj2;
                dVarArr = t(j2);
                obj = obj3;
            }
        }
        int i2 = 0;
        int length = dVarArr.length;
        while (i2 < length) {
            h.m.d<h.k> dVar = dVarArr[i2];
            i2++;
            if (dVar != null) {
                dVar.resumeWith(h.k.a);
            }
        }
        return obj;
    }

    public final void s(long j2, long j3, long j4, long j5) {
        long min = Math.min(j3, j2);
        long m2 = m();
        if (m2 < min) {
            while (true) {
                long j6 = 1 + m2;
                Object[] objArr = this.f9022g;
                h.o.c.j.c(objArr);
                objArr[(objArr.length - 1) & ((int) m2)] = null;
                if (j6 >= min) {
                    break;
                }
                m2 = j6;
            }
        }
        this.f9023h = j2;
        this.f9024i = j3;
        this.f9025j = (int) (j4 - min);
        this.f9026k = (int) (j5 - j4);
    }

    public final h.m.d<h.k>[] t(long j2) {
        Object[] objArr;
        if (j2 > this.f9024i) {
            return i.a.h2.w.c.a;
        }
        long m2 = m();
        long j3 = this.f9025j + m2;
        long j4 = 1;
        if (this.f9020e == 0 && this.f9026k > 0) {
            j3++;
        }
        if (this.f9050b != 0 && (objArr = this.a) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j5 = ((q) obj).a;
                    if (j5 >= 0 && j5 < j3) {
                        j3 = j5;
                    }
                }
            }
        }
        if (j3 <= this.f9024i) {
            return i.a.h2.w.c.a;
        }
        long l2 = l();
        int min = this.f9050b > 0 ? Math.min(this.f9026k, this.f9020e - ((int) (l2 - j3))) : this.f9026k;
        h.m.d<h.k>[] dVarArr = i.a.h2.w.c.a;
        long j6 = this.f9026k + l2;
        if (min > 0) {
            dVarArr = new h.m.d[min];
            Object[] objArr2 = this.f9022g;
            h.o.c.j.c(objArr2);
            if (l2 < j6) {
                long j7 = l2;
                int i2 = 0;
                while (true) {
                    long j8 = l2 + j4;
                    int i3 = (int) l2;
                    Object obj2 = objArr2[(objArr2.length - 1) & i3];
                    i.a.i2.q qVar = p.a;
                    if (obj2 != qVar) {
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) obj2;
                        int i4 = i2 + 1;
                        dVarArr[i2] = aVar.f9029d;
                        objArr2[(objArr2.length - 1) & i3] = qVar;
                        Object obj3 = aVar.f9028c;
                        long j9 = j7;
                        objArr2[((int) j9) & (objArr2.length - 1)] = obj3;
                        l2 = j9 + 1;
                        if (i4 >= min) {
                            break;
                        }
                        i2 = i4;
                        j7 = l2;
                    }
                    if (j8 >= j6) {
                        l2 = j7;
                        break;
                    }
                    l2 = j8;
                    j4 = 1;
                }
            }
        }
        int i5 = (int) (l2 - m2);
        long j10 = this.f9050b == 0 ? l2 : j3;
        long max = Math.max(this.f9023h, l2 - Math.min(this.f9019d, i5));
        if (this.f9020e == 0 && max < j6) {
            Object[] objArr3 = this.f9022g;
            h.o.c.j.c(objArr3);
            if (h.o.c.j.a(objArr3[((int) max) & (objArr3.length - 1)], p.a)) {
                l2++;
                max++;
            }
        }
        s(max, j10, l2, j6);
        h();
        return (dVarArr.length == 0) ^ true ? k(dVarArr) : dVarArr;
    }
}
