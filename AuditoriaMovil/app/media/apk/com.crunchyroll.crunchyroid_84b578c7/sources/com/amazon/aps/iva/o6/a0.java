package com.amazon.aps.iva.o6;

import com.amazon.aps.iva.a6.s1;
import com.amazon.aps.iva.o0.d2;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.q5.s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
/* compiled from: MergingMediaPeriod.java */
/* loaded from: classes.dex */
public final class a0 implements u, u.a {
    public final u[] b;
    public final IdentityHashMap<h0, Integer> c;
    public final h d;
    public final ArrayList<u> e = new ArrayList<>();
    public final HashMap<s0, s0> f = new HashMap<>();
    public u.a g;
    public o0 h;
    public u[] i;
    public d2 j;

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.s6.r {
        public final com.amazon.aps.iva.s6.r a;
        public final s0 b;

        public a(com.amazon.aps.iva.s6.r rVar, s0 s0Var) {
            this.a = rVar;
            this.b = s0Var;
        }

        @Override // com.amazon.aps.iva.s6.r
        public final void a() {
            this.a.a();
        }

        @Override // com.amazon.aps.iva.s6.r
        public final boolean b(int i, long j) {
            return this.a.b(i, j);
        }

        @Override // com.amazon.aps.iva.s6.r
        public final int c() {
            return this.a.c();
        }

        @Override // com.amazon.aps.iva.s6.u
        public final int d(com.amazon.aps.iva.q5.v vVar) {
            return this.a.d(vVar);
        }

        @Override // com.amazon.aps.iva.s6.u
        public final com.amazon.aps.iva.q5.v e(int i) {
            return this.a.e(i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.s6.u
        public final int f(int i) {
            return this.a.f(i);
        }

        @Override // com.amazon.aps.iva.s6.r
        public final void g(long j, long j2, long j3, List<? extends com.amazon.aps.iva.q6.m> list, com.amazon.aps.iva.q6.n[] nVarArr) {
            this.a.g(j, j2, j3, list, nVarArr);
        }

        @Override // com.amazon.aps.iva.s6.r
        public final boolean h(int i, long j) {
            return this.a.h(i, j);
        }

        public final int hashCode() {
            return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
        }

        @Override // com.amazon.aps.iva.s6.r
        public final void i(float f) {
            this.a.i(f);
        }

        @Override // com.amazon.aps.iva.s6.r
        public final Object j() {
            return this.a.j();
        }

        @Override // com.amazon.aps.iva.s6.r
        public final void k() {
            this.a.k();
        }

        @Override // com.amazon.aps.iva.s6.u
        public final int l(int i) {
            return this.a.l(i);
        }

        @Override // com.amazon.aps.iva.s6.u
        public final int length() {
            return this.a.length();
        }

        @Override // com.amazon.aps.iva.s6.u
        public final s0 m() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.s6.r
        public final void n(boolean z) {
            this.a.n(z);
        }

        @Override // com.amazon.aps.iva.s6.r
        public final void o() {
            this.a.o();
        }

        @Override // com.amazon.aps.iva.s6.r
        public final boolean p(long j, com.amazon.aps.iva.q6.e eVar, List<? extends com.amazon.aps.iva.q6.m> list) {
            return this.a.p(j, eVar, list);
        }

        @Override // com.amazon.aps.iva.s6.r
        public final int q() {
            return this.a.q();
        }

        @Override // com.amazon.aps.iva.s6.r
        public final com.amazon.aps.iva.q5.v r() {
            return this.a.r();
        }

        @Override // com.amazon.aps.iva.s6.r
        public final int s() {
            return this.a.s();
        }

        @Override // com.amazon.aps.iva.s6.r
        public final void t() {
            this.a.t();
        }

        @Override // com.amazon.aps.iva.s6.r
        public final int u(List list, long j) {
            return this.a.u(list, j);
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class b implements u, u.a {
        public final u b;
        public final long c;
        public u.a d;

        public b(u uVar, long j) {
            this.b = uVar;
            this.c = j;
        }

        @Override // com.amazon.aps.iva.o6.i0.a
        public final void a(u uVar) {
            u.a aVar = this.d;
            aVar.getClass();
            aVar.a(this);
        }

        @Override // com.amazon.aps.iva.o6.u
        public final long b(long j, s1 s1Var) {
            long j2 = this.c;
            return this.b.b(j - j2, s1Var) + j2;
        }

        @Override // com.amazon.aps.iva.o6.i0
        public final long c() {
            long c = this.b.c();
            if (c == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.c + c;
        }

        @Override // com.amazon.aps.iva.o6.u.a
        public final void d(u uVar) {
            u.a aVar = this.d;
            aVar.getClass();
            aVar.d(this);
        }

        @Override // com.amazon.aps.iva.o6.u
        public final long e(long j) {
            long j2 = this.c;
            return this.b.e(j - j2) + j2;
        }

        @Override // com.amazon.aps.iva.o6.u
        public final List f(ArrayList arrayList) {
            return this.b.f(arrayList);
        }

        @Override // com.amazon.aps.iva.o6.u
        public final long h(com.amazon.aps.iva.s6.r[] rVarArr, boolean[] zArr, h0[] h0VarArr, boolean[] zArr2, long j) {
            h0[] h0VarArr2 = new h0[h0VarArr.length];
            int i = 0;
            while (true) {
                h0 h0Var = null;
                if (i >= h0VarArr.length) {
                    break;
                }
                c cVar = (c) h0VarArr[i];
                if (cVar != null) {
                    h0Var = cVar.b;
                }
                h0VarArr2[i] = h0Var;
                i++;
            }
            u uVar = this.b;
            long j2 = this.c;
            long h = uVar.h(rVarArr, zArr, h0VarArr2, zArr2, j - j2);
            for (int i2 = 0; i2 < h0VarArr.length; i2++) {
                h0 h0Var2 = h0VarArr2[i2];
                if (h0Var2 == null) {
                    h0VarArr[i2] = null;
                } else {
                    h0 h0Var3 = h0VarArr[i2];
                    if (h0Var3 == null || ((c) h0Var3).b != h0Var2) {
                        h0VarArr[i2] = new c(h0Var2, j2);
                    }
                }
            }
            return h + j2;
        }

        @Override // com.amazon.aps.iva.o6.i0
        public final boolean isLoading() {
            return this.b.isLoading();
        }

        @Override // com.amazon.aps.iva.o6.u
        public final long j() {
            long j = this.b.j();
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.c + j;
        }

        @Override // com.amazon.aps.iva.o6.u
        public final void k(u.a aVar, long j) {
            this.d = aVar;
            this.b.k(this, j - this.c);
        }

        @Override // com.amazon.aps.iva.o6.u
        public final void n() throws IOException {
            this.b.n();
        }

        @Override // com.amazon.aps.iva.o6.i0
        public final boolean p(long j) {
            return this.b.p(j - this.c);
        }

        @Override // com.amazon.aps.iva.o6.u
        public final o0 q() {
            return this.b.q();
        }

        @Override // com.amazon.aps.iva.o6.i0
        public final long s() {
            long s = this.b.s();
            if (s == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.c + s;
        }

        @Override // com.amazon.aps.iva.o6.u
        public final void t(long j, boolean z) {
            this.b.t(j - this.c, z);
        }

        @Override // com.amazon.aps.iva.o6.i0
        public final void v(long j) {
            this.b.v(j - this.c);
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class c implements h0 {
        public final h0 b;
        public final long c;

        public c(h0 h0Var, long j) {
            this.b = h0Var;
            this.c = j;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final void a() throws IOException {
            this.b.a();
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final boolean g() {
            return this.b.g();
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int m(com.amazon.aps.iva.u1.g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i) {
            int m = this.b.m(g0Var, fVar, i);
            if (m == -4) {
                fVar.f = Math.max(0L, fVar.f + this.c);
            }
            return m;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int o(long j) {
            return this.b.o(j - this.c);
        }
    }

    public a0(h hVar, long[] jArr, u... uVarArr) {
        this.d = hVar;
        this.b = uVarArr;
        hVar.getClass();
        this.j = new d2(new i0[0]);
        this.c = new IdentityHashMap<>();
        this.i = new u[0];
        for (int i = 0; i < uVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = new b(uVarArr[i], j);
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.i0.a
    public final void a(u uVar) {
        u.a aVar = this.g;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long b(long j, s1 s1Var) {
        u uVar;
        u[] uVarArr = this.i;
        if (uVarArr.length > 0) {
            uVar = uVarArr[0];
        } else {
            uVar = this.b[0];
        }
        return uVar.b(j, s1Var);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        return this.j.c();
    }

    @Override // com.amazon.aps.iva.o6.u.a
    public final void d(u uVar) {
        ArrayList<u> arrayList = this.e;
        arrayList.remove(uVar);
        if (!arrayList.isEmpty()) {
            return;
        }
        u[] uVarArr = this.b;
        int i = 0;
        for (u uVar2 : uVarArr) {
            i += uVar2.q().b;
        }
        s0[] s0VarArr = new s0[i];
        int i2 = 0;
        for (int i3 = 0; i3 < uVarArr.length; i3++) {
            o0 q = uVarArr[i3].q();
            int i4 = q.b;
            int i5 = 0;
            while (i5 < i4) {
                s0 a2 = q.a(i5);
                s0 a3 = a2.a(i3 + ":" + a2.c);
                this.f.put(a3, a2);
                s0VarArr[i2] = a3;
                i5++;
                i2++;
            }
        }
        this.h = new o0(s0VarArr);
        u.a aVar = this.g;
        aVar.getClass();
        aVar.d(this);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long e(long j) {
        long e = this.i[0].e(j);
        int i = 1;
        while (true) {
            u[] uVarArr = this.i;
            if (i < uVarArr.length) {
                if (uVarArr[i].e(e) == e) {
                    i++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return e;
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long h(com.amazon.aps.iva.s6.r[] rVarArr, boolean[] zArr, h0[] h0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap<h0, Integer> identityHashMap;
        h0 h0Var;
        ArrayList arrayList;
        Integer num;
        int intValue;
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            h0 h0Var2 = h0VarArr[i2];
            if (h0Var2 == null) {
                num = null;
            } else {
                num = identityHashMap.get(h0Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i2] = intValue;
            com.amazon.aps.iva.s6.r rVar = rVarArr[i2];
            if (rVar != null) {
                String str = rVar.m().c;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        h0[] h0VarArr2 = new h0[length2];
        h0[] h0VarArr3 = new h0[rVarArr.length];
        com.amazon.aps.iva.s6.r[] rVarArr2 = new com.amazon.aps.iva.s6.r[rVarArr.length];
        u[] uVarArr = this.b;
        ArrayList arrayList2 = new ArrayList(uVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < uVarArr.length) {
            int i4 = i;
            while (i4 < rVarArr.length) {
                if (iArr[i4] == i3) {
                    h0Var = h0VarArr[i4];
                } else {
                    h0Var = null;
                }
                h0VarArr3[i4] = h0Var;
                if (iArr2[i4] == i3) {
                    com.amazon.aps.iva.s6.r rVar2 = rVarArr[i4];
                    rVar2.getClass();
                    arrayList = arrayList2;
                    s0 s0Var = this.f.get(rVar2.m());
                    s0Var.getClass();
                    rVarArr2[i4] = new a(rVar2, s0Var);
                } else {
                    arrayList = arrayList2;
                    rVarArr2[i4] = null;
                }
                i4++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i5 = i3;
            u[] uVarArr2 = uVarArr;
            com.amazon.aps.iva.s6.r[] rVarArr3 = rVarArr2;
            long h = uVarArr[i3].h(rVarArr2, zArr, h0VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = h;
            } else if (h != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < rVarArr.length; i6++) {
                boolean z2 = true;
                if (iArr2[i6] == i5) {
                    h0 h0Var3 = h0VarArr3[i6];
                    h0Var3.getClass();
                    h0VarArr2[i6] = h0VarArr3[i6];
                    identityHashMap.put(h0Var3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    if (h0VarArr3[i6] != null) {
                        z2 = false;
                    }
                    com.amazon.aps.iva.cq.b.C(z2);
                }
            }
            if (z) {
                arrayList3.add(uVarArr2[i5]);
            }
            i3 = i5 + 1;
            arrayList2 = arrayList3;
            uVarArr = uVarArr2;
            rVarArr2 = rVarArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(h0VarArr2, i7, h0VarArr, i7, length2);
        u[] uVarArr3 = (u[]) arrayList2.toArray(new u[i7]);
        this.i = uVarArr3;
        this.d.getClass();
        this.j = new d2(uVarArr3);
        return j2;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        return this.j.isLoading();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long j() {
        u[] uVarArr;
        u[] uVarArr2;
        long j = -9223372036854775807L;
        for (u uVar : this.i) {
            long j2 = uVar.j();
            if (j2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (u uVar2 : this.i) {
                        if (uVar2 == uVar) {
                            break;
                        } else if (uVar2.e(j2) != j2) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = j2;
                } else if (j2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && uVar.e(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void k(u.a aVar, long j) {
        this.g = aVar;
        ArrayList<u> arrayList = this.e;
        u[] uVarArr = this.b;
        Collections.addAll(arrayList, uVarArr);
        for (u uVar : uVarArr) {
            uVar.k(this, j);
        }
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void n() throws IOException {
        for (u uVar : this.b) {
            uVar.n();
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean p(long j) {
        ArrayList<u> arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).p(j);
            }
            return false;
        }
        return this.j.p(j);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final o0 q() {
        o0 o0Var = this.h;
        o0Var.getClass();
        return o0Var;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        return this.j.s();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void t(long j, boolean z) {
        for (u uVar : this.i) {
            uVar.t(j, z);
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
        this.j.v(j);
    }
}
