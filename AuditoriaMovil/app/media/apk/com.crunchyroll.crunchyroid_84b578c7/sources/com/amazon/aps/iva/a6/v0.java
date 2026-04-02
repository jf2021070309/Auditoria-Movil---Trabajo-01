package com.amazon.aps.iva.a6;

import android.util.Pair;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.o6.v;
/* compiled from: MediaPeriodHolder.java */
/* loaded from: classes.dex */
public final class v0 {
    public final com.amazon.aps.iva.o6.u a;
    public final Object b;
    public final com.amazon.aps.iva.o6.h0[] c;
    public boolean d;
    public boolean e;
    public w0 f;
    public boolean g;
    public final boolean[] h;
    public final p1[] i;
    public final com.amazon.aps.iva.s6.w j;
    public final j1 k;
    public v0 l;
    public com.amazon.aps.iva.o6.o0 m;
    public com.amazon.aps.iva.s6.x n;
    public long o;

    public v0(p1[] p1VarArr, long j, com.amazon.aps.iva.s6.w wVar, com.amazon.aps.iva.t6.b bVar, j1 j1Var, w0 w0Var, com.amazon.aps.iva.s6.x xVar) {
        this.i = p1VarArr;
        this.o = j;
        this.j = wVar;
        this.k = j1Var;
        v.b bVar2 = w0Var.a;
        this.b = bVar2.a;
        this.f = w0Var;
        this.m = com.amazon.aps.iva.o6.o0.e;
        this.n = xVar;
        this.c = new com.amazon.aps.iva.o6.h0[p1VarArr.length];
        this.h = new boolean[p1VarArr.length];
        long j2 = w0Var.d;
        j1Var.getClass();
        int i = a.j;
        Pair pair = (Pair) bVar2.a;
        Object obj = pair.first;
        v.b b = bVar2.b(pair.second);
        j1.c cVar = (j1.c) j1Var.d.get(obj);
        cVar.getClass();
        j1Var.g.add(cVar);
        j1.b bVar3 = j1Var.f.get(cVar);
        if (bVar3 != null) {
            bVar3.a.m(bVar3.b);
        }
        cVar.c.add(b);
        com.amazon.aps.iva.o6.u h = cVar.a.h(b, bVar, w0Var.b);
        j1Var.c.put(h, cVar);
        j1Var.c();
        this.a = j2 != -9223372036854775807L ? new com.amazon.aps.iva.o6.d(h, true, 0L, j2) : h;
    }

    public final long a(com.amazon.aps.iva.s6.x xVar, long j, boolean z, boolean[] zArr) {
        p1[] p1VarArr;
        com.amazon.aps.iva.o6.h0[] h0VarArr;
        boolean z2;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= xVar.a) {
                break;
            }
            if (z || !xVar.a(this.n, i)) {
                z3 = false;
            }
            this.h[i] = z3;
            i++;
        }
        int i2 = 0;
        while (true) {
            p1VarArr = this.i;
            int length = p1VarArr.length;
            h0VarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (((e) p1VarArr[i2]).c == -2) {
                h0VarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.n = xVar;
        c();
        long h = this.a.h(xVar.c, this.h, this.c, zArr, j);
        for (int i3 = 0; i3 < p1VarArr.length; i3++) {
            if (((e) p1VarArr[i3]).c == -2 && this.n.b(i3)) {
                h0VarArr[i3] = new com.amazon.aps.iva.o6.n();
            }
        }
        this.e = false;
        for (int i4 = 0; i4 < h0VarArr.length; i4++) {
            if (h0VarArr[i4] != null) {
                com.amazon.aps.iva.cq.b.C(xVar.b(i4));
                if (((e) p1VarArr[i4]).c != -2) {
                    this.e = true;
                }
            } else {
                if (xVar.c[i4] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.amazon.aps.iva.cq.b.C(z2);
            }
        }
        return h;
    }

    public final void b() {
        boolean z;
        int i = 0;
        if (this.l == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        while (true) {
            com.amazon.aps.iva.s6.x xVar = this.n;
            if (i < xVar.a) {
                boolean b = xVar.b(i);
                com.amazon.aps.iva.s6.r rVar = this.n.c[i];
                if (b && rVar != null) {
                    rVar.a();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        boolean z;
        int i = 0;
        if (this.l == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        while (true) {
            com.amazon.aps.iva.s6.x xVar = this.n;
            if (i < xVar.a) {
                boolean b = xVar.b(i);
                com.amazon.aps.iva.s6.r rVar = this.n.c[i];
                if (b && rVar != null) {
                    rVar.o();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final long d() {
        long j;
        if (!this.d) {
            return this.f.b;
        }
        if (this.e) {
            j = this.a.s();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f.e;
        }
        return j;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    public final void f() {
        b();
        com.amazon.aps.iva.o6.u uVar = this.a;
        try {
            boolean z = uVar instanceof com.amazon.aps.iva.o6.d;
            j1 j1Var = this.k;
            if (z) {
                j1Var.f(((com.amazon.aps.iva.o6.d) uVar).b);
            } else {
                j1Var.f(uVar);
            }
        } catch (RuntimeException e) {
            com.amazon.aps.iva.t5.p.d("Period release failed.", e);
        }
    }

    public final com.amazon.aps.iva.s6.x g(float f, com.amazon.aps.iva.q5.r0 r0Var) throws l {
        com.amazon.aps.iva.s6.r[] rVarArr;
        com.amazon.aps.iva.s6.x S = this.j.S(this.i, this.m, this.f.a, r0Var);
        for (com.amazon.aps.iva.s6.r rVar : S.c) {
            if (rVar != null) {
                rVar.i(f);
            }
        }
        return S;
    }

    public final void h() {
        com.amazon.aps.iva.o6.u uVar = this.a;
        if (uVar instanceof com.amazon.aps.iva.o6.d) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            com.amazon.aps.iva.o6.d dVar = (com.amazon.aps.iva.o6.d) uVar;
            dVar.f = 0L;
            dVar.g = j;
        }
    }
}
