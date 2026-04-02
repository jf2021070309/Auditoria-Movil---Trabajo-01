package com.amazon.aps.iva.o6;

import android.util.SparseArray;
import com.amazon.aps.iva.g6.d;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.g6.f;
import com.amazon.aps.iva.o6.f0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.x6.f0;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: SampleQueue.java */
/* loaded from: classes.dex */
public class g0 implements com.amazon.aps.iva.x6.f0 {
    public com.amazon.aps.iva.q5.v A;
    public com.amazon.aps.iva.q5.v B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final f0 a;
    public final com.amazon.aps.iva.g6.f d;
    public final e.a e;
    public c f;
    public com.amazon.aps.iva.q5.v g;
    public com.amazon.aps.iva.g6.d h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final a b = new a();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public f0.a[] o = new f0.a[1000];
    public final n0<b> c = new n0<>(new com.amazon.aps.iva.q5.z(6));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    /* compiled from: SampleQueue.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public long b;
        public f0.a c;
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final com.amazon.aps.iva.q5.v a;
        public final f.b b;

        public b(com.amazon.aps.iva.q5.v vVar, f.b bVar) {
            this.a = vVar;
            this.b = bVar;
        }
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    public g0(com.amazon.aps.iva.t6.b bVar, com.amazon.aps.iva.g6.f fVar, e.a aVar) {
        this.d = fVar;
        this.e = aVar;
        this.a = new f0(bVar);
    }

    @Override // com.amazon.aps.iva.x6.f0
    public final void c(com.amazon.aps.iva.q5.v vVar) {
        boolean z;
        SparseArray<b> sparseArray;
        SparseArray<b> sparseArray2;
        com.amazon.aps.iva.q5.v m = m(vVar);
        boolean z2 = false;
        this.z = false;
        this.A = vVar;
        synchronized (this) {
            this.y = false;
            if (!com.amazon.aps.iva.t5.g0.a(m, this.B)) {
                if (this.c.b.size() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (this.c.b.valueAt(sparseArray.size() - 1).a.equals(m)) {
                        this.B = this.c.b.valueAt(sparseArray2.size() - 1).a;
                        com.amazon.aps.iva.q5.v vVar2 = this.B;
                        this.D = com.amazon.aps.iva.q5.g0.a(vVar2.m, vVar2.j);
                        this.E = false;
                        z2 = true;
                    }
                }
                this.B = m;
                com.amazon.aps.iva.q5.v vVar22 = this.B;
                this.D = com.amazon.aps.iva.q5.g0.a(vVar22.m, vVar22.j);
                this.E = false;
                z2 = true;
            }
        }
        c cVar = this.f;
        if (cVar != null && z2) {
            cVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0125, code lost:
        if (r16.c.b.valueAt(r0.size() - 1).a.equals(r16.B) == false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    @Override // com.amazon.aps.iva.x6.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(long r17, int r19, int r20, int r21, com.amazon.aps.iva.x6.f0.a r22) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o6.g0.d(long, int, int, int, com.amazon.aps.iva.x6.f0$a):void");
    }

    @Override // com.amazon.aps.iva.x6.f0
    public final int e(com.amazon.aps.iva.q5.o oVar, int i, boolean z) throws IOException {
        f0 f0Var = this.a;
        int c2 = f0Var.c(i);
        f0.a aVar = f0Var.f;
        com.amazon.aps.iva.t6.a aVar2 = aVar.c;
        int l = oVar.l(aVar2.a, ((int) (f0Var.g - aVar.a)) + aVar2.b, c2);
        if (l == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = f0Var.g + l;
        f0Var.g = j;
        f0.a aVar3 = f0Var.f;
        if (j == aVar3.b) {
            f0Var.f = aVar3.d;
            return l;
        }
        return l;
    }

    @Override // com.amazon.aps.iva.x6.f0
    public final void f(int i, com.amazon.aps.iva.t5.v vVar) {
        while (true) {
            f0 f0Var = this.a;
            if (i > 0) {
                int c2 = f0Var.c(i);
                f0.a aVar = f0Var.f;
                com.amazon.aps.iva.t6.a aVar2 = aVar.c;
                vVar.d(((int) (f0Var.g - aVar.a)) + aVar2.b, aVar2.a, c2);
                i -= c2;
                long j = f0Var.g + c2;
                f0Var.g = j;
                f0.a aVar3 = f0Var.f;
                if (j == aVar3.b) {
                    f0Var.f = aVar3.d;
                }
            } else {
                f0Var.getClass();
                return;
            }
        }
    }

    public final long g(int i) {
        int i2;
        this.u = Math.max(this.u, n(i));
        this.p -= i;
        int i3 = this.q + i;
        this.q = i3;
        int i4 = this.r + i;
        this.r = i4;
        int i5 = this.i;
        if (i4 >= i5) {
            this.r = i4 - i5;
        }
        int i6 = this.s - i;
        this.s = i6;
        int i7 = 0;
        if (i6 < 0) {
            this.s = 0;
        }
        while (true) {
            n0<b> n0Var = this.c;
            SparseArray<b> sparseArray = n0Var.b;
            if (i7 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i7 + 1;
            if (i3 < sparseArray.keyAt(i8)) {
                break;
            }
            n0Var.c.a(sparseArray.valueAt(i7));
            sparseArray.removeAt(i7);
            int i9 = n0Var.a;
            if (i9 > 0) {
                n0Var.a = i9 - 1;
            }
            i7 = i8;
        }
        if (this.p == 0) {
            int i10 = this.r;
            if (i10 == 0) {
                i10 = this.i;
            }
            return this.k[i10 - 1] + this.l[i2];
        }
        return this.k[this.r];
    }

    public final void h(boolean z, boolean z2, long j) {
        long j2;
        int i;
        f0 f0Var = this.a;
        synchronized (this) {
            int i2 = this.p;
            if (i2 != 0) {
                long[] jArr = this.n;
                int i3 = this.r;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.s) != i2) {
                        i2 = i + 1;
                    }
                    int l = l(i3, i2, j, z);
                    if (l != -1) {
                        j2 = g(l);
                    } else {
                        j2 = -1;
                    }
                }
            }
            j2 = -1;
        }
        f0Var.b(j2);
    }

    public final void i() {
        long g;
        f0 f0Var = this.a;
        synchronized (this) {
            int i = this.p;
            if (i == 0) {
                g = -1;
            } else {
                g = g(i);
            }
        }
        f0Var.b(g);
    }

    public final long j(int i) {
        boolean z;
        int o;
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z2 = false;
        if (i4 >= 0 && i4 <= i3 - this.s) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, n(i5));
        if (i4 == 0 && this.w) {
            z2 = true;
        }
        this.w = z2;
        n0<b> n0Var = this.c;
        SparseArray<b> sparseArray = n0Var.b;
        int i6 = -1;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            n0Var.c.a(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i6 = Math.min(n0Var.a, sparseArray.size() - 1);
        }
        n0Var.a = i6;
        int i7 = this.p;
        if (i7 != 0) {
            return this.k[o(i7 - 1)] + this.l[o];
        }
        return 0L;
    }

    public final void k(int i) {
        boolean z;
        long j = j(i);
        f0 f0Var = this.a;
        if (j <= f0Var.g) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        f0Var.g = j;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i3 = f0Var.b;
        if (i2 != 0) {
            f0.a aVar = f0Var.d;
            if (j != aVar.a) {
                while (f0Var.g > aVar.b) {
                    aVar = aVar.d;
                }
                f0.a aVar2 = aVar.d;
                aVar2.getClass();
                f0Var.a(aVar2);
                f0.a aVar3 = new f0.a(aVar.b, i3);
                aVar.d = aVar3;
                if (f0Var.g == aVar.b) {
                    aVar = aVar3;
                }
                f0Var.f = aVar;
                if (f0Var.e == aVar2) {
                    f0Var.e = aVar3;
                    return;
                }
                return;
            }
        }
        f0Var.a(f0Var.d);
        f0.a aVar4 = new f0.a(f0Var.g, i3);
        f0Var.d = aVar4;
        f0Var.e = aVar4;
        f0Var.f = aVar4;
    }

    public final int l(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 <= j) {
                if (!z || (this.m[i] & 1) != 0) {
                    if (j2 == j) {
                        return i4;
                    }
                    i3 = i4;
                }
                i++;
                if (i == this.i) {
                    i = 0;
                }
            } else {
                return i3;
            }
        }
        return i3;
    }

    public com.amazon.aps.iva.q5.v m(com.amazon.aps.iva.q5.v vVar) {
        if (this.F != 0 && vVar.q != Long.MAX_VALUE) {
            v.a a2 = vVar.a();
            a2.o = vVar.q + this.F;
            return a2.a();
        }
        return vVar;
    }

    public final long n(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int o = o(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[o]);
            if ((this.m[o] & 1) != 0) {
                break;
            }
            o--;
            if (o == -1) {
                o = this.i - 1;
            }
        }
        return j;
    }

    public final int o(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        if (i2 >= i3) {
            return i2 - i3;
        }
        return i2;
    }

    public final synchronized int p(long j, boolean z) {
        boolean z2;
        int o = o(this.s);
        int i = this.s;
        int i2 = this.p;
        if (i != i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && j >= this.n[o]) {
            if (j > this.v && z) {
                return i2 - i;
            }
            int l = l(o, i2 - i, j, true);
            if (l == -1) {
                return 0;
            }
            return l;
        }
        return 0;
    }

    public final synchronized com.amazon.aps.iva.q5.v q() {
        com.amazon.aps.iva.q5.v vVar;
        if (this.y) {
            vVar = null;
        } else {
            vVar = this.B;
        }
        return vVar;
    }

    public final synchronized boolean r(boolean z) {
        boolean z2;
        com.amazon.aps.iva.q5.v vVar;
        int i = this.s;
        boolean z3 = true;
        if (i != this.p) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!z && !this.w && ((vVar = this.B) == null || vVar == this.g)) {
                z3 = false;
            }
            return z3;
        } else if (this.c.a(this.q + i).a != this.g) {
            return true;
        } else {
            return s(o(this.s));
        }
    }

    public final boolean s(int i) {
        com.amazon.aps.iva.g6.d dVar = this.h;
        if (dVar != null && dVar.getState() != 4 && ((this.m[i] & Ints.MAX_POWER_OF_TWO) != 0 || !this.h.b())) {
            return false;
        }
        return true;
    }

    public final void t() throws IOException {
        com.amazon.aps.iva.g6.d dVar = this.h;
        if (dVar != null && dVar.getState() == 1) {
            d.a error = this.h.getError();
            error.getClass();
            throw error;
        }
    }

    public final void u(com.amazon.aps.iva.q5.v vVar, com.amazon.aps.iva.u1.g0 g0Var) {
        boolean z;
        com.amazon.aps.iva.q5.r rVar;
        com.amazon.aps.iva.q5.v vVar2;
        com.amazon.aps.iva.q5.v vVar3 = this.g;
        if (vVar3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            rVar = null;
        } else {
            rVar = vVar3.p;
        }
        this.g = vVar;
        com.amazon.aps.iva.q5.r rVar2 = vVar.p;
        com.amazon.aps.iva.g6.f fVar = this.d;
        if (fVar != null) {
            int c2 = fVar.c(vVar);
            v.a a2 = vVar.a();
            a2.F = c2;
            vVar2 = a2.a();
        } else {
            vVar2 = vVar;
        }
        g0Var.c = vVar2;
        g0Var.b = this.h;
        if (fVar == null) {
            return;
        }
        if (!z && com.amazon.aps.iva.t5.g0.a(rVar, rVar2)) {
            return;
        }
        com.amazon.aps.iva.g6.d dVar = this.h;
        e.a aVar = this.e;
        com.amazon.aps.iva.g6.d b2 = fVar.b(aVar, vVar);
        this.h = b2;
        g0Var.b = b2;
        if (dVar != null) {
            dVar.e(aVar);
        }
    }

    public final int v(com.amazon.aps.iva.u1.g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4 = false;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a aVar = this.b;
        synchronized (this) {
            fVar.e = false;
            int i3 = this.s;
            if (i3 != this.p) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if (!z && !this.w) {
                    com.amazon.aps.iva.q5.v vVar = this.B;
                    if (vVar != null && (z2 || vVar != this.g)) {
                        u(vVar, g0Var);
                        i2 = -5;
                    } else {
                        i2 = -3;
                    }
                }
                fVar.b = 4;
                i2 = -4;
            } else {
                com.amazon.aps.iva.q5.v vVar2 = this.c.a(this.q + i3).a;
                if (!z2 && vVar2 == this.g) {
                    int o = o(this.s);
                    if (!s(o)) {
                        fVar.e = true;
                        i2 = -3;
                    } else {
                        fVar.b = this.m[o];
                        if (this.s == this.p - 1 && (z || this.w)) {
                            fVar.h(536870912);
                        }
                        long j = this.n[o];
                        fVar.f = j;
                        if (j < this.t) {
                            fVar.h(Integer.MIN_VALUE);
                        }
                        aVar.a = this.l[o];
                        aVar.b = this.k[o];
                        aVar.c = this.o[o];
                        i2 = -4;
                    }
                }
                u(vVar2, g0Var);
                i2 = -5;
            }
        }
        if (i2 == -4 && !fVar.i(4)) {
            if ((i & 1) != 0) {
                z4 = true;
            }
            if ((i & 4) == 0) {
                if (z4) {
                    f0 f0Var = this.a;
                    f0.f(f0Var.e, fVar, this.b, f0Var.c);
                } else {
                    f0 f0Var2 = this.a;
                    f0Var2.e = f0.f(f0Var2.e, fVar, this.b, f0Var2.c);
                }
            }
            if (!z4) {
                this.s++;
            }
        }
        return i2;
    }

    public final void w(boolean z) {
        boolean z2;
        n0<b> n0Var;
        SparseArray<b> sparseArray;
        f0 f0Var = this.a;
        f0Var.a(f0Var.d);
        f0.a aVar = f0Var.d;
        int i = 0;
        if (aVar.c == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.C(z2);
        aVar.a = 0L;
        aVar.b = f0Var.b + 0;
        f0.a aVar2 = f0Var.d;
        f0Var.e = aVar2;
        f0Var.f = aVar2;
        f0Var.g = 0L;
        ((com.amazon.aps.iva.t6.f) f0Var.a).a();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        while (true) {
            n0Var = this.c;
            sparseArray = n0Var.b;
            if (i >= sparseArray.size()) {
                break;
            }
            n0Var.c.a(sparseArray.valueAt(i));
            i++;
        }
        n0Var.a = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }

    public final synchronized boolean x(long j, boolean z) {
        boolean z2;
        synchronized (this) {
            this.s = 0;
            f0 f0Var = this.a;
            f0Var.e = f0Var.d;
        }
        int o = o(0);
        int i = this.s;
        int i2 = this.p;
        if (i != i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && j >= this.n[o] && (j <= this.v || z)) {
            int l = l(o, i2 - i, j, true);
            if (l == -1) {
                return false;
            }
            this.t = j;
            this.s += l;
            return true;
        }
        return false;
    }

    public final synchronized void y(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    com.amazon.aps.iva.cq.b.t(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        com.amazon.aps.iva.cq.b.t(z);
        this.s += i;
    }
}
