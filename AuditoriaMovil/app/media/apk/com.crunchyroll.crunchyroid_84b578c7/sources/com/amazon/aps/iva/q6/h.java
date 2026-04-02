package com.amazon.aps.iva.q6;

import androidx.media3.exoplayer.dash.d;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.g0;
import com.amazon.aps.iva.o6.h0;
import com.amazon.aps.iva.o6.i0;
import com.amazon.aps.iva.o6.q;
import com.amazon.aps.iva.o6.t;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q6.i;
import com.amazon.aps.iva.t6.k;
import com.amazon.aps.iva.w5.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ChunkSampleStream.java */
/* loaded from: classes.dex */
public final class h<T extends i> implements h0, i0, k.a<e>, k.e {
    public final int b;
    public final int[] c;
    public final v[] d;
    public final boolean[] e;
    public final T f;
    public final i0.a<h<T>> g;
    public final z.a h;
    public final com.amazon.aps.iva.t6.j i;
    public final com.amazon.aps.iva.t6.k j = new com.amazon.aps.iva.t6.k("ChunkSampleStream");
    public final g k = new g();
    public final ArrayList<com.amazon.aps.iva.q6.a> l;
    public final List<com.amazon.aps.iva.q6.a> m;
    public final g0 n;
    public final g0[] o;
    public final c p;
    public e q;
    public v r;
    public b<T> s;
    public long t;
    public long u;
    public int v;
    public com.amazon.aps.iva.q6.a w;
    public boolean x;

    /* compiled from: ChunkSampleStream.java */
    /* loaded from: classes.dex */
    public interface b<T extends i> {
    }

    public h(int i, int[] iArr, v[] vVarArr, androidx.media3.exoplayer.dash.a aVar, i0.a aVar2, com.amazon.aps.iva.t6.b bVar, long j, com.amazon.aps.iva.g6.f fVar, e.a aVar3, com.amazon.aps.iva.t6.j jVar, z.a aVar4) {
        this.b = i;
        this.c = iArr;
        this.d = vVarArr;
        this.f = aVar;
        this.g = aVar2;
        this.h = aVar4;
        this.i = jVar;
        ArrayList<com.amazon.aps.iva.q6.a> arrayList = new ArrayList<>();
        this.l = arrayList;
        this.m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.o = new g0[length];
        this.e = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        g0[] g0VarArr = new g0[i2];
        fVar.getClass();
        aVar3.getClass();
        g0 g0Var = new g0(bVar, fVar, aVar3);
        this.n = g0Var;
        int i3 = 0;
        iArr2[0] = i;
        g0VarArr[0] = g0Var;
        while (i3 < length) {
            g0 g0Var2 = new g0(bVar, null, null);
            this.o[i3] = g0Var2;
            int i4 = i3 + 1;
            g0VarArr[i4] = g0Var2;
            iArr2[i4] = this.c[i3];
            i3 = i4;
        }
        this.p = new c(iArr2, g0VarArr);
        this.t = j;
        this.u = j;
    }

    public final int A(int i, int i2) {
        ArrayList<com.amazon.aps.iva.q6.a> arrayList;
        do {
            i2++;
            arrayList = this.l;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (arrayList.get(i2).e(0) <= i);
        return i2 - 1;
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final void a() throws IOException {
        com.amazon.aps.iva.t6.k kVar = this.j;
        kVar.a();
        this.n.t();
        if (!kVar.d()) {
            this.f.a();
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        if (y()) {
            return this.t;
        }
        if (this.x) {
            return Long.MIN_VALUE;
        }
        return w().h;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    @Override // com.amazon.aps.iva.t6.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.t6.k.b d(com.amazon.aps.iva.q6.e r29, long r30, long r32, java.io.IOException r34, int r35) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            com.amazon.aps.iva.q6.e r1 = (com.amazon.aps.iva.q6.e) r1
            com.amazon.aps.iva.w5.w r2 = r1.i
            long r8 = r2.b
            boolean r2 = r1 instanceof com.amazon.aps.iva.q6.a
            java.util.ArrayList<com.amazon.aps.iva.q6.a> r10 = r0.l
            int r3 = r10.size()
            int r11 = r3 + (-1)
            r3 = 0
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r12 = 1
            r13 = 0
            if (r3 == 0) goto L27
            if (r2 == 0) goto L27
            boolean r3 = r0.x(r11)
            if (r3 != 0) goto L25
            goto L27
        L25:
            r14 = r13
            goto L28
        L27:
            r14 = r12
        L28:
            com.amazon.aps.iva.o6.q r15 = new com.amazon.aps.iva.o6.q
            long r4 = r1.a
            com.amazon.aps.iva.w5.w r3 = r1.i
            android.net.Uri r6 = r3.c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r3.d
            r3 = r15
            r3.<init>(r4, r6, r7, r8)
            long r3 = r1.g
            com.amazon.aps.iva.t5.g0.e0(r3)
            long r3 = r1.h
            com.amazon.aps.iva.t5.g0.e0(r3)
            com.amazon.aps.iva.t6.j$c r3 = new com.amazon.aps.iva.t6.j$c
            r4 = r34
            r5 = r35
            r3.<init>(r15, r4, r5)
            T extends com.amazon.aps.iva.q6.i r5 = r0.f
            com.amazon.aps.iva.t6.j r6 = r0.i
            boolean r5 = r5.c(r1, r14, r3, r6)
            if (r5 == 0) goto L73
            if (r14 == 0) goto L70
            if (r2 == 0) goto L6d
            com.amazon.aps.iva.q6.a r2 = r0.r(r11)
            if (r2 != r1) goto L5f
            r2 = r12
            goto L60
        L5f:
            r2 = r13
        L60:
            com.amazon.aps.iva.cq.b.C(r2)
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L6d
            long r8 = r0.u
            r0.t = r8
        L6d:
            com.amazon.aps.iva.t6.k$b r2 = com.amazon.aps.iva.t6.k.e
            goto L74
        L70:
            com.amazon.aps.iva.t5.p.g()
        L73:
            r2 = 0
        L74:
            if (r2 != 0) goto L8c
            long r2 = r6.c(r3)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 == 0) goto L8a
            com.amazon.aps.iva.t6.k$b r5 = new com.amazon.aps.iva.t6.k$b
            r5.<init>(r13, r2)
            r2 = r5
            goto L8c
        L8a:
            com.amazon.aps.iva.t6.k$b r2 = com.amazon.aps.iva.t6.k.f
        L8c:
            boolean r3 = r2.a()
            r3 = r3 ^ r12
            com.amazon.aps.iva.o6.z$a r5 = r0.h
            int r8 = r1.c
            int r9 = r0.b
            com.amazon.aps.iva.q5.v r10 = r1.d
            int r11 = r1.e
            java.lang.Object r12 = r1.f
            long r13 = r1.g
            r17 = r8
            long r7 = r1.h
            r1 = r15
            r15 = r5
            r16 = r1
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r24 = r7
            r26 = r34
            r27 = r3
            r15.i(r16, r17, r18, r19, r20, r21, r22, r24, r26, r27)
            if (r3 == 0) goto Lc7
            r1 = 0
            r0.q = r1
            r6.getClass()
            com.amazon.aps.iva.o6.i0$a<com.amazon.aps.iva.q6.h<T extends com.amazon.aps.iva.q6.i>> r1 = r0.g
            r1.a(r0)
        Lc7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q6.h.d(com.amazon.aps.iva.t6.k$d, long, long, java.io.IOException, int):com.amazon.aps.iva.t6.k$b");
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final boolean g() {
        if (!y() && this.n.r(this.x)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void i(e eVar, long j, long j2, boolean z) {
        e eVar2 = eVar;
        this.q = null;
        this.w = null;
        long j3 = eVar2.a;
        w wVar = eVar2.i;
        q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
        this.i.getClass();
        this.h.d(qVar, eVar2.c, this.b, eVar2.d, eVar2.e, eVar2.f, eVar2.g, eVar2.h);
        if (!z) {
            if (y()) {
                this.n.w(false);
                for (g0 g0Var : this.o) {
                    g0Var.w(false);
                }
            } else if (eVar2 instanceof com.amazon.aps.iva.q6.a) {
                ArrayList<com.amazon.aps.iva.q6.a> arrayList = this.l;
                r(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.t = this.u;
                }
            }
            this.g.a(this);
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        return this.j.d();
    }

    @Override // com.amazon.aps.iva.t6.k.e
    public final void l() {
        g0[] g0VarArr;
        g0 g0Var = this.n;
        g0Var.w(true);
        com.amazon.aps.iva.g6.d dVar = g0Var.h;
        if (dVar != null) {
            dVar.e(g0Var.e);
            g0Var.h = null;
            g0Var.g = null;
        }
        for (g0 g0Var2 : this.o) {
            g0Var2.w(true);
            com.amazon.aps.iva.g6.d dVar2 = g0Var2.h;
            if (dVar2 != null) {
                dVar2.e(g0Var2.e);
                g0Var2.h = null;
                g0Var2.g = null;
            }
        }
        this.f.release();
        b<T> bVar = this.s;
        if (bVar != null) {
            androidx.media3.exoplayer.dash.b bVar2 = (androidx.media3.exoplayer.dash.b) bVar;
            synchronized (bVar2) {
                d.c remove = bVar2.o.remove(this);
                if (remove != null) {
                    g0 g0Var3 = remove.a;
                    g0Var3.w(true);
                    com.amazon.aps.iva.g6.d dVar3 = g0Var3.h;
                    if (dVar3 != null) {
                        dVar3.e(g0Var3.e);
                        g0Var3.h = null;
                        g0Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final int m(com.amazon.aps.iva.u1.g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i) {
        if (y()) {
            return -3;
        }
        com.amazon.aps.iva.q6.a aVar = this.w;
        g0 g0Var2 = this.n;
        if (aVar != null && aVar.e(0) <= g0Var2.q + g0Var2.s) {
            return -3;
        }
        z();
        return g0Var2.v(g0Var, fVar, i, this.x);
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final int o(long j) {
        if (y()) {
            return 0;
        }
        g0 g0Var = this.n;
        int p = g0Var.p(j, this.x);
        com.amazon.aps.iva.q6.a aVar = this.w;
        if (aVar != null) {
            p = Math.min(p, aVar.e(0) - (g0Var.q + g0Var.s));
        }
        g0Var.y(p);
        z();
        return p;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean p(long j) {
        long j2;
        List<com.amazon.aps.iva.q6.a> list;
        if (!this.x) {
            com.amazon.aps.iva.t6.k kVar = this.j;
            if (!kVar.d() && !kVar.c()) {
                boolean y = y();
                if (y) {
                    list = Collections.emptyList();
                    j2 = this.t;
                } else {
                    j2 = w().h;
                    list = this.m;
                }
                this.f.h(j, j2, list, this.k);
                g gVar = this.k;
                boolean z = gVar.b;
                e eVar = gVar.a;
                gVar.a = null;
                gVar.b = false;
                if (z) {
                    this.t = -9223372036854775807L;
                    this.x = true;
                    return true;
                } else if (eVar == null) {
                    return false;
                } else {
                    this.q = eVar;
                    boolean z2 = eVar instanceof com.amazon.aps.iva.q6.a;
                    c cVar = this.p;
                    if (z2) {
                        com.amazon.aps.iva.q6.a aVar = (com.amazon.aps.iva.q6.a) eVar;
                        if (y) {
                            long j3 = this.t;
                            if (aVar.g != j3) {
                                this.n.t = j3;
                                for (g0 g0Var : this.o) {
                                    g0Var.t = this.t;
                                }
                            }
                            this.t = -9223372036854775807L;
                        }
                        aVar.m = cVar;
                        g0[] g0VarArr = cVar.b;
                        int[] iArr = new int[g0VarArr.length];
                        for (int i = 0; i < g0VarArr.length; i++) {
                            g0 g0Var2 = g0VarArr[i];
                            iArr[i] = g0Var2.q + g0Var2.p;
                        }
                        aVar.n = iArr;
                        this.l.add(aVar);
                    } else if (eVar instanceof l) {
                        ((l) eVar).k = cVar;
                    }
                    this.h.m(new q(eVar.a, eVar.b, kVar.f(eVar, this, this.i.a(eVar.c))), eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.g, eVar.h);
                    return true;
                }
            }
        }
        return false;
    }

    public final com.amazon.aps.iva.q6.a r(int i) {
        ArrayList<com.amazon.aps.iva.q6.a> arrayList = this.l;
        com.amazon.aps.iva.q6.a aVar = arrayList.get(i);
        com.amazon.aps.iva.t5.g0.V(i, arrayList.size(), arrayList);
        this.v = Math.max(this.v, arrayList.size());
        int i2 = 0;
        this.n.k(aVar.e(0));
        while (true) {
            g0[] g0VarArr = this.o;
            if (i2 < g0VarArr.length) {
                g0 g0Var = g0VarArr[i2];
                i2++;
                g0Var.k(aVar.e(i2));
            } else {
                return aVar;
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        long j;
        if (this.x) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.t;
        }
        long j2 = this.u;
        com.amazon.aps.iva.q6.a w = w();
        if (!w.d()) {
            ArrayList<com.amazon.aps.iva.q6.a> arrayList = this.l;
            if (arrayList.size() > 1) {
                w = arrayList.get(arrayList.size() - 2);
            } else {
                w = null;
            }
        }
        if (w != null) {
            j2 = Math.max(j2, w.h);
        }
        g0 g0Var = this.n;
        synchronized (g0Var) {
            j = g0Var.v;
        }
        return Math.max(j2, j);
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void u(e eVar, long j, long j2) {
        e eVar2 = eVar;
        this.q = null;
        this.f.e(eVar2);
        long j3 = eVar2.a;
        w wVar = eVar2.i;
        q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
        this.i.getClass();
        this.h.g(qVar, eVar2.c, this.b, eVar2.d, eVar2.e, eVar2.f, eVar2.g, eVar2.h);
        this.g.a(this);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
        com.amazon.aps.iva.t6.k kVar = this.j;
        if (!kVar.c() && !y()) {
            boolean d = kVar.d();
            ArrayList<com.amazon.aps.iva.q6.a> arrayList = this.l;
            List<com.amazon.aps.iva.q6.a> list = this.m;
            T t = this.f;
            if (d) {
                e eVar = this.q;
                eVar.getClass();
                boolean z = eVar instanceof com.amazon.aps.iva.q6.a;
                if ((!z || !x(arrayList.size() - 1)) && t.f(j, eVar, list)) {
                    kVar.b();
                    if (z) {
                        this.w = (com.amazon.aps.iva.q6.a) eVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int d2 = t.d(list, j);
            if (d2 < arrayList.size()) {
                com.amazon.aps.iva.cq.b.C(!kVar.d());
                int size = arrayList.size();
                while (true) {
                    if (d2 < size) {
                        if (!x(d2)) {
                            break;
                        }
                        d2++;
                    } else {
                        d2 = -1;
                        break;
                    }
                }
                if (d2 != -1) {
                    long j2 = w().h;
                    com.amazon.aps.iva.q6.a r = r(d2);
                    if (arrayList.isEmpty()) {
                        this.t = this.u;
                    }
                    this.x = false;
                    int i = this.b;
                    z.a aVar = this.h;
                    aVar.getClass();
                    aVar.o(new t(1, i, null, 3, null, com.amazon.aps.iva.t5.g0.e0(r.g), com.amazon.aps.iva.t5.g0.e0(j2)));
                }
            }
        }
    }

    public final com.amazon.aps.iva.q6.a w() {
        ArrayList<com.amazon.aps.iva.q6.a> arrayList = this.l;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean x(int i) {
        g0 g0Var;
        com.amazon.aps.iva.q6.a aVar = this.l.get(i);
        g0 g0Var2 = this.n;
        if (g0Var2.q + g0Var2.s > aVar.e(0)) {
            return true;
        }
        int i2 = 0;
        do {
            g0[] g0VarArr = this.o;
            if (i2 >= g0VarArr.length) {
                return false;
            }
            g0Var = g0VarArr[i2];
            i2++;
        } while (g0Var.q + g0Var.s <= aVar.e(i2));
        return true;
    }

    public final boolean y() {
        if (this.t != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        g0 g0Var = this.n;
        int A = A(g0Var.q + g0Var.s, this.v - 1);
        while (true) {
            int i = this.v;
            if (i <= A) {
                this.v = i + 1;
                com.amazon.aps.iva.q6.a aVar = this.l.get(i);
                v vVar = aVar.d;
                if (!vVar.equals(this.r)) {
                    this.h.a(this.b, vVar, aVar.e, aVar.f, aVar.g);
                }
                this.r = vVar;
            } else {
                return;
            }
        }
    }

    /* compiled from: ChunkSampleStream.java */
    /* loaded from: classes.dex */
    public final class a implements h0 {
        public final h<T> b;
        public final g0 c;
        public final int d;
        public boolean e;

        public a(h<T> hVar, g0 g0Var, int i) {
            this.b = hVar;
            this.c = g0Var;
            this.d = i;
        }

        public final void b() {
            if (!this.e) {
                h hVar = h.this;
                z.a aVar = hVar.h;
                int[] iArr = hVar.c;
                int i = this.d;
                aVar.a(iArr[i], hVar.d[i], 0, null, hVar.u);
                this.e = true;
            }
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final boolean g() {
            h hVar = h.this;
            if (!hVar.y() && this.c.r(hVar.x)) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int m(com.amazon.aps.iva.u1.g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i) {
            h hVar = h.this;
            if (hVar.y()) {
                return -3;
            }
            com.amazon.aps.iva.q6.a aVar = hVar.w;
            g0 g0Var2 = this.c;
            if (aVar != null && aVar.e(this.d + 1) <= g0Var2.q + g0Var2.s) {
                return -3;
            }
            b();
            return g0Var2.v(g0Var, fVar, i, hVar.x);
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int o(long j) {
            h hVar = h.this;
            if (hVar.y()) {
                return 0;
            }
            boolean z = hVar.x;
            g0 g0Var = this.c;
            int p = g0Var.p(j, z);
            com.amazon.aps.iva.q6.a aVar = hVar.w;
            if (aVar != null) {
                p = Math.min(p, aVar.e(this.d + 1) - (g0Var.q + g0Var.s));
            }
            g0Var.y(p);
            if (p > 0) {
                b();
            }
            return p;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final void a() {
        }
    }
}
