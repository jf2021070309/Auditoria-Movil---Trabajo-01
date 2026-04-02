package com.amazon.aps.iva.h6;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.h6.g;
import com.amazon.aps.iva.h6.m;
import com.amazon.aps.iva.o6.g0;
import com.amazon.aps.iva.o6.i0;
import com.amazon.aps.iva.o6.o0;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q.e1;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.t6.k;
import com.amazon.aps.iva.w5.w;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.f0;
import com.google.common.collect.Iterables;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: HlsSampleStreamWrapper.java */
/* loaded from: classes.dex */
public final class o implements k.a<com.amazon.aps.iva.q6.e>, k.e, i0, com.amazon.aps.iva.x6.p, g0.c {
    public static final Set<Integer> Z = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public b A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public v G;
    public v H;
    public boolean I;
    public o0 J;
    public Set<s0> K;
    public int[] L;
    public int M;
    public boolean N;
    public boolean[] O;
    public boolean[] P;
    public long Q;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public long W;
    public com.amazon.aps.iva.q5.r X;
    public k Y;
    public final String b;
    public final int c;
    public final a d;
    public final g e;
    public final com.amazon.aps.iva.t6.b f;
    public final v g;
    public final com.amazon.aps.iva.g6.f h;
    public final e.a i;
    public final com.amazon.aps.iva.t6.j j;
    public final z.a l;
    public final int m;
    public final ArrayList<k> o;
    public final List<k> p;
    public final e1 q;
    public final com.amazon.aps.iva.e.d r;
    public final Handler s;
    public final ArrayList<n> t;
    public final Map<String, com.amazon.aps.iva.q5.r> u;
    public com.amazon.aps.iva.q6.e v;
    public c[] w;
    public final HashSet y;
    public final SparseIntArray z;
    public final com.amazon.aps.iva.t6.k k = new com.amazon.aps.iva.t6.k("Loader:HlsSampleStreamWrapper");
    public final g.b n = new g.b();
    public int[] x = new int[0];

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: classes.dex */
    public interface a extends i0.a<o> {
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: classes.dex */
    public static class b implements f0 {
        public static final v g;
        public static final v h;
        public final com.amazon.aps.iva.f7.b a = new com.amazon.aps.iva.f7.b();
        public final f0 b;
        public final v c;
        public v d;
        public byte[] e;
        public int f;

        static {
            v.a aVar = new v.a();
            aVar.k = "application/id3";
            g = aVar.a();
            v.a aVar2 = new v.a();
            aVar2.k = "application/x-emsg";
            h = aVar2.a();
        }

        public b(f0 f0Var, int i) {
            this.b = f0Var;
            if (i != 1) {
                if (i == 3) {
                    this.c = h;
                } else {
                    throw new IllegalArgumentException(c0.a("Unknown metadataType: ", i));
                }
            } else {
                this.c = g;
            }
            this.e = new byte[0];
            this.f = 0;
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final void c(v vVar) {
            this.d = vVar;
            this.b.c(this.c);
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final void d(long j, int i, int i2, int i3, f0.a aVar) {
            this.d.getClass();
            int i4 = this.f - i3;
            com.amazon.aps.iva.t5.v vVar = new com.amazon.aps.iva.t5.v(Arrays.copyOfRange(this.e, i4 - i2, i4));
            byte[] bArr = this.e;
            boolean z = false;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.f = i3;
            String str = this.d.m;
            v vVar2 = this.c;
            if (!com.amazon.aps.iva.t5.g0.a(str, vVar2.m)) {
                if ("application/x-emsg".equals(this.d.m)) {
                    this.a.getClass();
                    com.amazon.aps.iva.f7.a s = com.amazon.aps.iva.f7.b.s(vVar);
                    v k = s.k();
                    String str2 = vVar2.m;
                    if (k != null && com.amazon.aps.iva.t5.g0.a(str2, k.m)) {
                        z = true;
                    }
                    if (!z) {
                        String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", str2, s.k());
                        com.amazon.aps.iva.t5.p.g();
                        return;
                    }
                    byte[] B = s.B();
                    B.getClass();
                    vVar = new com.amazon.aps.iva.t5.v(B);
                } else {
                    String str3 = this.d.m;
                    com.amazon.aps.iva.t5.p.g();
                    return;
                }
            }
            int i5 = vVar.c - vVar.b;
            this.b.a(i5, vVar);
            this.b.d(j, i, i5, i3, aVar);
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final int e(com.amazon.aps.iva.q5.o oVar, int i, boolean z) throws IOException {
            int i2 = this.f + i;
            byte[] bArr = this.e;
            if (bArr.length < i2) {
                this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
            }
            int l = oVar.l(this.e, this.f, i);
            if (l == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f += l;
            return l;
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final void f(int i, com.amazon.aps.iva.t5.v vVar) {
            int i2 = this.f + i;
            byte[] bArr = this.e;
            if (bArr.length < i2) {
                this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
            }
            vVar.d(this.f, this.e, i);
            this.f += i;
        }
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: classes.dex */
    public static final class c extends g0 {
        public final Map<String, com.amazon.aps.iva.q5.r> H;
        public com.amazon.aps.iva.q5.r I;

        public c() {
            throw null;
        }

        public c(com.amazon.aps.iva.t6.b bVar, com.amazon.aps.iva.g6.f fVar, e.a aVar, Map map) {
            super(bVar, fVar, aVar);
            this.H = map;
        }

        @Override // com.amazon.aps.iva.o6.g0, com.amazon.aps.iva.x6.f0
        public final void d(long j, int i, int i2, int i3, f0.a aVar) {
            super.d(j, i, i2, i3, aVar);
        }

        @Override // com.amazon.aps.iva.o6.g0
        public final v m(v vVar) {
            com.amazon.aps.iva.q5.r rVar;
            com.amazon.aps.iva.q5.r rVar2 = this.I;
            if (rVar2 == null) {
                rVar2 = vVar.p;
            }
            if (rVar2 != null && (rVar = this.H.get(rVar2.d)) != null) {
                rVar2 = rVar;
            }
            com.amazon.aps.iva.q5.f0 f0Var = vVar.k;
            com.amazon.aps.iva.q5.f0 f0Var2 = null;
            if (f0Var != null) {
                f0.b[] bVarArr = f0Var.b;
                int length = bVarArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        f0.b bVar = bVarArr[i];
                        if ((bVar instanceof com.amazon.aps.iva.i7.k) && "com.apple.streaming.transportStreamTimestamp".equals(((com.amazon.aps.iva.i7.k) bVar).c)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    if (length != 1) {
                        f0.b[] bVarArr2 = new f0.b[length - 1];
                        for (int i2 = 0; i2 < length; i2++) {
                            if (i2 != i) {
                                bVarArr2[i2 < i ? i2 : i2 - 1] = bVarArr[i2];
                            }
                        }
                        f0Var2 = new com.amazon.aps.iva.q5.f0(bVarArr2);
                    }
                }
                if (rVar2 == vVar.p || f0Var != vVar.k) {
                    v.a a = vVar.a();
                    a.n = rVar2;
                    a.i = f0Var;
                    vVar = a.a();
                }
                return super.m(vVar);
            }
            f0Var = f0Var2;
            if (rVar2 == vVar.p) {
            }
            v.a a2 = vVar.a();
            a2.n = rVar2;
            a2.i = f0Var;
            vVar = a2.a();
            return super.m(vVar);
        }
    }

    public o(String str, int i, m.a aVar, g gVar, Map map, com.amazon.aps.iva.t6.b bVar, long j, v vVar, com.amazon.aps.iva.g6.f fVar, e.a aVar2, com.amazon.aps.iva.t6.j jVar, z.a aVar3, int i2) {
        this.b = str;
        this.c = i;
        this.d = aVar;
        this.e = gVar;
        this.u = map;
        this.f = bVar;
        this.g = vVar;
        this.h = fVar;
        this.i = aVar2;
        this.j = jVar;
        this.l = aVar3;
        this.m = i2;
        Set<Integer> set = Z;
        this.y = new HashSet(set.size());
        this.z = new SparseIntArray(set.size());
        this.w = new c[0];
        this.P = new boolean[0];
        this.O = new boolean[0];
        ArrayList<k> arrayList = new ArrayList<>();
        this.o = arrayList;
        this.p = Collections.unmodifiableList(arrayList);
        this.t = new ArrayList<>();
        this.q = new e1(this, 2);
        this.r = new com.amazon.aps.iva.e.d(this, 6);
        this.s = com.amazon.aps.iva.t5.g0.m(null);
        this.Q = j;
        this.R = j;
    }

    public static int B(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        return 0;
    }

    public static com.amazon.aps.iva.x6.m w(int i, int i2) {
        com.amazon.aps.iva.t5.p.g();
        return new com.amazon.aps.iva.x6.m();
    }

    public static v y(v vVar, v vVar2, boolean z) {
        String str;
        String str2;
        int i;
        int i2;
        if (vVar == null) {
            return vVar2;
        }
        String str3 = vVar2.m;
        int i3 = com.amazon.aps.iva.q5.g0.i(str3);
        String str4 = vVar.j;
        if (com.amazon.aps.iva.t5.g0.r(i3, str4) == 1) {
            str2 = com.amazon.aps.iva.t5.g0.s(i3, str4);
            str = com.amazon.aps.iva.q5.g0.e(str2);
        } else {
            String c2 = com.amazon.aps.iva.q5.g0.c(str4, str3);
            str = str3;
            str2 = c2;
        }
        v.a aVar = new v.a(vVar2);
        aVar.a = vVar.b;
        aVar.b = vVar.c;
        aVar.c = vVar.d;
        aVar.d = vVar.e;
        aVar.e = vVar.f;
        if (z) {
            i = vVar.g;
        } else {
            i = -1;
        }
        aVar.f = i;
        if (z) {
            i2 = vVar.h;
        } else {
            i2 = -1;
        }
        aVar.g = i2;
        aVar.h = str2;
        if (i3 == 2) {
            aVar.p = vVar.r;
            aVar.q = vVar.s;
            aVar.r = vVar.t;
        }
        if (str != null) {
            aVar.k = str;
        }
        int i4 = vVar.z;
        if (i4 != -1 && i3 == 1) {
            aVar.x = i4;
        }
        com.amazon.aps.iva.q5.f0 f0Var = vVar.k;
        if (f0Var != null) {
            com.amazon.aps.iva.q5.f0 f0Var2 = vVar2.k;
            if (f0Var2 != null) {
                f0Var = f0Var2.a(f0Var.b);
            }
            aVar.i = f0Var;
        }
        return new v(aVar);
    }

    public final k A() {
        ArrayList<k> arrayList = this.o;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean C() {
        if (this.R != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        int i;
        v y;
        boolean z;
        if (!this.I && this.L == null && this.D) {
            int i2 = 0;
            for (c cVar : this.w) {
                if (cVar.q() == null) {
                    return;
                }
            }
            o0 o0Var = this.J;
            if (o0Var != null) {
                int i3 = o0Var.b;
                int[] iArr = new int[i3];
                this.L = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        c[] cVarArr = this.w;
                        if (i5 < cVarArr.length) {
                            v q = cVarArr[i5].q();
                            com.amazon.aps.iva.cq.b.D(q);
                            v vVar = this.J.a(i4).e[0];
                            String str = vVar.m;
                            String str2 = q.m;
                            int i6 = com.amazon.aps.iva.q5.g0.i(str2);
                            if (i6 == 3 ? com.amazon.aps.iva.t5.g0.a(str2, str) && ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || q.E == vVar.E) : i6 == com.amazon.aps.iva.q5.g0.i(str)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                this.L[i4] = i5;
                                break;
                            }
                            i5++;
                        }
                    }
                }
                Iterator<n> it = this.t.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                return;
            }
            int length = this.w.length;
            int i7 = -1;
            int i8 = 0;
            int i9 = -2;
            while (true) {
                int i10 = 2;
                if (i8 >= length) {
                    break;
                }
                v q2 = this.w[i8].q();
                com.amazon.aps.iva.cq.b.D(q2);
                String str3 = q2.m;
                if (!com.amazon.aps.iva.q5.g0.m(str3)) {
                    if (com.amazon.aps.iva.q5.g0.k(str3)) {
                        i10 = 1;
                    } else if (com.amazon.aps.iva.q5.g0.l(str3)) {
                        i10 = 3;
                    } else {
                        i10 = -2;
                    }
                }
                if (B(i10) > B(i9)) {
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && i7 != -1) {
                    i7 = -1;
                }
                i8++;
            }
            s0 s0Var = this.e.h;
            int i11 = s0Var.b;
            this.M = -1;
            this.L = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                this.L[i12] = i12;
            }
            s0[] s0VarArr = new s0[length];
            int i13 = 0;
            while (i2 < length) {
                v q3 = this.w[i2].q();
                com.amazon.aps.iva.cq.b.D(q3);
                v vVar2 = this.g;
                String str4 = this.b;
                if (i2 == i7) {
                    v[] vVarArr = new v[i11];
                    for (int i14 = i13; i14 < i11; i14++) {
                        v vVar3 = s0Var.e[i14];
                        if (i9 == 1 && vVar2 != null) {
                            vVar3 = vVar3.g(vVar2);
                        }
                        if (i11 == 1) {
                            y = q3.g(vVar3);
                        } else {
                            y = y(vVar3, q3, true);
                        }
                        vVarArr[i14] = y;
                    }
                    s0VarArr[i2] = new s0(str4, vVarArr);
                    this.M = i2;
                    i = 0;
                } else {
                    vVar2 = (i9 == 2 && com.amazon.aps.iva.q5.g0.k(q3.m)) ? null : null;
                    StringBuilder b2 = x.b(str4, ":muxed:");
                    b2.append(i2 < i7 ? i2 : i2 - 1);
                    s0VarArr[i2] = new s0(b2.toString(), y(vVar2, q3, false));
                    i = 0;
                }
                i2++;
                i13 = i;
            }
            this.J = x(s0VarArr);
            boolean z2 = i13;
            if (this.K == null) {
                z2 = 1;
            }
            com.amazon.aps.iva.cq.b.C(z2);
            this.K = Collections.emptySet();
            this.E = true;
            ((m.a) this.d).b();
        }
    }

    public final void E() throws IOException {
        this.k.a();
        g gVar = this.e;
        com.amazon.aps.iva.o6.b bVar = gVar.o;
        if (bVar == null) {
            Uri uri = gVar.p;
            if (uri != null && gVar.t) {
                gVar.g.b(uri);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void F(s0[] s0VarArr, int... iArr) {
        this.J = x(s0VarArr);
        this.K = new HashSet();
        for (int i : iArr) {
            this.K.add(this.J.a(i));
        }
        this.M = 0;
        Handler handler = this.s;
        a aVar = this.d;
        Objects.requireNonNull(aVar);
        handler.post(new com.amazon.aps.iva.e.k(aVar, 2));
        this.E = true;
    }

    public final void G() {
        for (c cVar : this.w) {
            cVar.w(this.S);
        }
        this.S = false;
    }

    public final boolean H(long j, boolean z) {
        boolean z2;
        this.Q = j;
        if (C()) {
            this.R = j;
            return true;
        }
        if (this.D && !z) {
            int length = this.w.length;
            for (int i = 0; i < length; i++) {
                if (!this.w[i].x(j, false) && (this.P[i] || !this.N)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.R = j;
        this.U = false;
        this.o.clear();
        com.amazon.aps.iva.t6.k kVar = this.k;
        if (kVar.d()) {
            if (this.D) {
                for (c cVar : this.w) {
                    cVar.i();
                }
            }
            kVar.b();
        } else {
            kVar.c = null;
            G();
        }
        return true;
    }

    @Override // com.amazon.aps.iva.o6.g0.c
    public final void a() {
        this.s.post(this.q);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        if (C()) {
            return this.R;
        }
        if (this.U) {
            return Long.MIN_VALUE;
        }
        return A().h;
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final k.b d(com.amazon.aps.iva.q6.e eVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        k.b bVar;
        int i2;
        com.amazon.aps.iva.q6.e eVar2 = eVar;
        boolean z2 = eVar2 instanceof k;
        if (z2 && !((k) eVar2).L && (iOException instanceof com.amazon.aps.iva.w5.r) && ((i2 = ((com.amazon.aps.iva.w5.r) iOException).f) == 410 || i2 == 404)) {
            return com.amazon.aps.iva.t6.k.d;
        }
        long j3 = eVar2.i.b;
        long j4 = eVar2.a;
        w wVar = eVar2.i;
        com.amazon.aps.iva.o6.q qVar = new com.amazon.aps.iva.o6.q(j4, wVar.c, wVar.d, j3);
        com.amazon.aps.iva.t5.g0.e0(eVar2.g);
        com.amazon.aps.iva.t5.g0.e0(eVar2.h);
        j.c cVar = new j.c(qVar, iOException, i);
        g gVar = this.e;
        j.a a2 = com.amazon.aps.iva.s6.v.a(gVar.r);
        com.amazon.aps.iva.t6.j jVar = this.j;
        j.b b2 = jVar.b(a2, cVar);
        boolean z3 = false;
        if (b2 != null && b2.a == 2) {
            com.amazon.aps.iva.s6.r rVar = gVar.r;
            z = rVar.h(rVar.l(gVar.h.b(eVar2.d)), b2.b);
        } else {
            z = false;
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList<k> arrayList = this.o;
                if (arrayList.remove(arrayList.size() - 1) == eVar2) {
                    z3 = true;
                }
                com.amazon.aps.iva.cq.b.C(z3);
                if (arrayList.isEmpty()) {
                    this.R = this.Q;
                } else {
                    ((k) Iterables.getLast(arrayList)).K = true;
                }
            }
            bVar = com.amazon.aps.iva.t6.k.e;
        } else {
            long c2 = jVar.c(cVar);
            if (c2 != -9223372036854775807L) {
                bVar = new k.b(0, c2);
            } else {
                bVar = com.amazon.aps.iva.t6.k.f;
            }
        }
        k.b bVar2 = bVar;
        boolean z4 = !bVar2.a();
        this.l.i(qVar, eVar2.c, this.c, eVar2.d, eVar2.e, eVar2.f, eVar2.g, eVar2.h, iOException, z4);
        if (z4) {
            this.v = null;
        }
        if (z) {
            if (!this.E) {
                p(this.Q);
            } else {
                ((m.a) this.d).a(this);
            }
        }
        return bVar2;
    }

    public final void g() {
        com.amazon.aps.iva.cq.b.C(this.E);
        this.J.getClass();
        this.K.getClass();
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void i(com.amazon.aps.iva.q6.e eVar, long j, long j2, boolean z) {
        com.amazon.aps.iva.q6.e eVar2 = eVar;
        this.v = null;
        long j3 = eVar2.a;
        w wVar = eVar2.i;
        com.amazon.aps.iva.o6.q qVar = new com.amazon.aps.iva.o6.q(j3, wVar.c, wVar.d, wVar.b);
        this.j.getClass();
        this.l.d(qVar, eVar2.c, this.c, eVar2.d, eVar2.e, eVar2.f, eVar2.g, eVar2.h);
        if (!z) {
            if (C() || this.F == 0) {
                G();
            }
            if (this.F > 0) {
                ((m.a) this.d).a(this);
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        return this.k.d();
    }

    @Override // com.amazon.aps.iva.t6.k.e
    public final void l() {
        c[] cVarArr;
        for (c cVar : this.w) {
            cVar.w(true);
            com.amazon.aps.iva.g6.d dVar = cVar.h;
            if (dVar != null) {
                dVar.e(cVar.e);
                cVar.h = null;
                cVar.g = null;
            }
        }
    }

    @Override // com.amazon.aps.iva.x6.p
    public final void o() {
        this.V = true;
        this.s.post(this.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0220  */
    @Override // com.amazon.aps.iva.o6.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(long r62) {
        /*
            Method dump skipped, instructions count: 1395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h6.o.p(long):boolean");
    }

    @Override // com.amazon.aps.iva.x6.p
    public final com.amazon.aps.iva.x6.f0 r(int i, int i2) {
        c cVar;
        k kVar;
        Integer valueOf = Integer.valueOf(i2);
        Set<Integer> set = Z;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.y;
        SparseIntArray sparseIntArray = this.z;
        boolean z = false;
        if (contains) {
            com.amazon.aps.iva.cq.b.t(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.x[i3] = i;
                }
                if (this.x[i3] == i) {
                    cVar = this.w[i3];
                } else {
                    cVar = w(i, i2);
                }
            }
            cVar = null;
        } else {
            int i4 = 0;
            while (true) {
                com.amazon.aps.iva.x6.f0[] f0VarArr = this.w;
                if (i4 >= f0VarArr.length) {
                    break;
                } else if (this.x[i4] == i) {
                    cVar = f0VarArr[i4];
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (cVar == null) {
            if (this.V) {
                return w(i, i2);
            }
            int length = this.w.length;
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            c cVar2 = new c(this.f, this.h, this.i, this.u);
            cVar2.t = this.Q;
            if (z) {
                cVar2.I = this.X;
                cVar2.z = true;
            }
            long j = this.W;
            if (cVar2.F != j) {
                cVar2.F = j;
                cVar2.z = true;
            }
            if (this.Y != null) {
                cVar2.C = kVar.k;
            }
            cVar2.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.x, i5);
            this.x = copyOf;
            copyOf[length] = i;
            c[] cVarArr = this.w;
            int i6 = com.amazon.aps.iva.t5.g0.a;
            Object[] copyOf2 = Arrays.copyOf(cVarArr, cVarArr.length + 1);
            copyOf2[cVarArr.length] = cVar2;
            this.w = (c[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.P, i5);
            this.P = copyOf3;
            copyOf3[length] = z;
            this.N |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (B(i2) > B(this.B)) {
                this.C = length;
                this.B = i2;
            }
            this.O = Arrays.copyOf(this.O, i5);
            cVar = cVar2;
        }
        if (i2 == 5) {
            if (this.A == null) {
                this.A = new b(cVar, this.m);
            }
            return this.A;
        }
        return cVar;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        c[] cVarArr;
        long j;
        if (this.U) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.R;
        }
        long j2 = this.Q;
        k A = A();
        if (!A.I) {
            ArrayList<k> arrayList = this.o;
            if (arrayList.size() > 1) {
                A = arrayList.get(arrayList.size() - 2);
            } else {
                A = null;
            }
        }
        if (A != null) {
            j2 = Math.max(j2, A.h);
        }
        if (this.D) {
            for (c cVar : this.w) {
                synchronized (cVar) {
                    j = cVar.v;
                }
                j2 = Math.max(j2, j);
            }
        }
        return j2;
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void u(com.amazon.aps.iva.q6.e eVar, long j, long j2) {
        com.amazon.aps.iva.q6.e eVar2 = eVar;
        this.v = null;
        g gVar = this.e;
        gVar.getClass();
        if (eVar2 instanceof g.a) {
            g.a aVar = (g.a) eVar2;
            gVar.n = aVar.j;
            Uri uri = aVar.b.a;
            byte[] bArr = aVar.l;
            bArr.getClass();
            f fVar = gVar.j;
            fVar.getClass();
            uri.getClass();
            fVar.a.put(uri, bArr);
        }
        long j3 = eVar2.a;
        w wVar = eVar2.i;
        com.amazon.aps.iva.o6.q qVar = new com.amazon.aps.iva.o6.q(j3, wVar.c, wVar.d, wVar.b);
        this.j.getClass();
        this.l.g(qVar, eVar2.c, this.c, eVar2.d, eVar2.e, eVar2.f, eVar2.g, eVar2.h);
        if (!this.E) {
            p(this.Q);
        } else {
            ((m.a) this.d).a(this);
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
        int size;
        boolean p;
        com.amazon.aps.iva.t6.k kVar = this.k;
        if (!kVar.c() && !C()) {
            boolean d = kVar.d();
            g gVar = this.e;
            List<k> list = this.p;
            if (d) {
                this.v.getClass();
                com.amazon.aps.iva.q6.e eVar = this.v;
                if (gVar.o != null) {
                    p = false;
                } else {
                    p = gVar.r.p(j, eVar, list);
                }
                if (p) {
                    kVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0) {
                int i = size2 - 1;
                if (gVar.b(list.get(i)) != 2) {
                    break;
                }
                size2 = i;
            }
            if (size2 < list.size()) {
                z(size2);
            }
            if (gVar.o == null && gVar.r.length() >= 2) {
                size = gVar.r.u(list, j);
            } else {
                size = list.size();
            }
            if (size < this.o.size()) {
                z(size);
            }
        }
    }

    public final o0 x(s0[] s0VarArr) {
        for (int i = 0; i < s0VarArr.length; i++) {
            s0 s0Var = s0VarArr[i];
            v[] vVarArr = new v[s0Var.b];
            for (int i2 = 0; i2 < s0Var.b; i2++) {
                v vVar = s0Var.e[i2];
                int c2 = this.h.c(vVar);
                v.a a2 = vVar.a();
                a2.F = c2;
                vVarArr[i2] = a2.a();
            }
            s0VarArr[i] = new s0(s0Var.c, vVarArr);
        }
        return new o0(s0VarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(int r19) {
        /*
            r18 = this;
            r0 = r18
            com.amazon.aps.iva.t6.k r1 = r0.k
            boolean r1 = r1.d()
            r2 = 1
            r1 = r1 ^ r2
            com.amazon.aps.iva.cq.b.C(r1)
            r1 = r19
        Lf:
            java.util.ArrayList<com.amazon.aps.iva.h6.k> r3 = r0.o
            int r4 = r3.size()
            r5 = -1
            r6 = 0
            if (r1 >= r4) goto L55
            r4 = r1
        L1a:
            int r7 = r3.size()
            if (r4 >= r7) goto L2e
            java.lang.Object r7 = r3.get(r4)
            com.amazon.aps.iva.h6.k r7 = (com.amazon.aps.iva.h6.k) r7
            boolean r7 = r7.n
            if (r7 == 0) goto L2b
            goto L49
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            java.lang.Object r4 = r3.get(r1)
            com.amazon.aps.iva.h6.k r4 = (com.amazon.aps.iva.h6.k) r4
            r7 = r6
        L35:
            com.amazon.aps.iva.h6.o$c[] r8 = r0.w
            int r8 = r8.length
            if (r7 >= r8) goto L4e
            int r8 = r4.g(r7)
            com.amazon.aps.iva.h6.o$c[] r9 = r0.w
            r9 = r9[r7]
            int r10 = r9.q
            int r9 = r9.s
            int r10 = r10 + r9
            if (r10 <= r8) goto L4b
        L49:
            r4 = r6
            goto L4f
        L4b:
            int r7 = r7 + 1
            goto L35
        L4e:
            r4 = r2
        L4f:
            if (r4 == 0) goto L52
            goto L56
        L52:
            int r1 = r1 + 1
            goto Lf
        L55:
            r1 = r5
        L56:
            if (r1 != r5) goto L59
            return
        L59:
            com.amazon.aps.iva.h6.k r4 = r18.A()
            long r4 = r4.h
            java.lang.Object r7 = r3.get(r1)
            com.amazon.aps.iva.h6.k r7 = (com.amazon.aps.iva.h6.k) r7
            int r8 = r3.size()
            com.amazon.aps.iva.t5.g0.V(r1, r8, r3)
            r1 = r6
        L6d:
            com.amazon.aps.iva.h6.o$c[] r8 = r0.w
            int r8 = r8.length
            if (r1 >= r8) goto L80
            int r8 = r7.g(r1)
            com.amazon.aps.iva.h6.o$c[] r9 = r0.w
            r9 = r9[r1]
            r9.k(r8)
            int r1 = r1 + 1
            goto L6d
        L80:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L8b
            long r1 = r0.Q
            r0.R = r1
            goto L93
        L8b:
            java.lang.Object r1 = com.google.common.collect.Iterables.getLast(r3)
            com.amazon.aps.iva.h6.k r1 = (com.amazon.aps.iva.h6.k) r1
            r1.K = r2
        L93:
            r0.U = r6
            int r10 = r0.B
            long r1 = r7.g
            com.amazon.aps.iva.o6.z$a r3 = r0.l
            r3.getClass()
            com.amazon.aps.iva.o6.t r6 = new com.amazon.aps.iva.o6.t
            r9 = 1
            r11 = 0
            r12 = 3
            r13 = 0
            long r14 = com.amazon.aps.iva.t5.g0.e0(r1)
            long r16 = com.amazon.aps.iva.t5.g0.e0(r4)
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r16)
            r3.o(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h6.o.z(int):void");
    }

    @Override // com.amazon.aps.iva.x6.p
    public final void m(d0 d0Var) {
    }
}
