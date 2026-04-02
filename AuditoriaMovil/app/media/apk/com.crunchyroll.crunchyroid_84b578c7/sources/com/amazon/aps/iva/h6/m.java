package com.amazon.aps.iva.h6;

import android.net.Uri;
import android.util.SparseArray;
import com.amazon.aps.iva.a6.s1;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.h6.o;
import com.amazon.aps.iva.j6.d;
import com.amazon.aps.iva.j6.e;
import com.amazon.aps.iva.j6.i;
import com.amazon.aps.iva.o0.d2;
import com.amazon.aps.iva.o6.h0;
import com.amazon.aps.iva.o6.i0;
import com.amazon.aps.iva.o6.o0;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.y;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: HlsMediaPeriod.java */
/* loaded from: classes.dex */
public final class m implements u, i.a {
    public d2 A;
    public final i b;
    public final com.amazon.aps.iva.j6.i c;
    public final h d;
    public final y e;
    public final com.amazon.aps.iva.g6.f f;
    public final e.a g;
    public final com.amazon.aps.iva.t6.j h;
    public final z.a i;
    public final com.amazon.aps.iva.t6.b j;
    public final IdentityHashMap<h0, Integer> k;
    public final r l;
    public final com.amazon.aps.iva.o6.h m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final p1 q;
    public final a r = new a();
    public final long s;
    public u.a t;
    public int u;
    public o0 v;
    public o[] w;
    public o[] x;
    public int[][] y;
    public int z;

    /* compiled from: HlsMediaPeriod.java */
    /* loaded from: classes.dex */
    public class a implements o.a {
        public a() {
        }

        @Override // com.amazon.aps.iva.o6.i0.a
        public final void a(o oVar) {
            m mVar = m.this;
            mVar.t.a(mVar);
        }

        public final void b() {
            o[] oVarArr;
            o[] oVarArr2;
            m mVar = m.this;
            int i = mVar.u - 1;
            mVar.u = i;
            if (i > 0) {
                return;
            }
            int i2 = 0;
            for (o oVar : mVar.w) {
                oVar.g();
                i2 += oVar.J.b;
            }
            s0[] s0VarArr = new s0[i2];
            int i3 = 0;
            for (o oVar2 : mVar.w) {
                oVar2.g();
                int i4 = oVar2.J.b;
                int i5 = 0;
                while (i5 < i4) {
                    oVar2.g();
                    s0VarArr[i3] = oVar2.J.a(i5);
                    i5++;
                    i3++;
                }
            }
            mVar.v = new o0(s0VarArr);
            mVar.t.d(mVar);
        }
    }

    public m(i iVar, com.amazon.aps.iva.j6.i iVar2, h hVar, y yVar, com.amazon.aps.iva.g6.f fVar, e.a aVar, com.amazon.aps.iva.t6.j jVar, z.a aVar2, com.amazon.aps.iva.t6.b bVar, com.amazon.aps.iva.o6.h hVar2, boolean z, int i, boolean z2, p1 p1Var, long j) {
        this.b = iVar;
        this.c = iVar2;
        this.d = hVar;
        this.e = yVar;
        this.f = fVar;
        this.g = aVar;
        this.h = jVar;
        this.i = aVar2;
        this.j = bVar;
        this.m = hVar2;
        this.n = z;
        this.o = i;
        this.p = z2;
        this.q = p1Var;
        this.s = j;
        hVar2.getClass();
        this.A = new d2(new i0[0]);
        this.k = new IdentityHashMap<>();
        this.l = new r(0);
        this.w = new o[0];
        this.x = new o[0];
        this.y = new int[0];
    }

    public static v i(v vVar, v vVar2, boolean z) {
        String s;
        f0 f0Var;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        int i4;
        int i5 = -1;
        if (vVar2 != null) {
            s = vVar2.j;
            f0Var = vVar2.k;
            i2 = vVar2.z;
            i = vVar2.e;
            i3 = vVar2.f;
            str = vVar2.d;
            str2 = vVar2.c;
        } else {
            s = g0.s(1, vVar.j);
            f0Var = vVar.k;
            if (z) {
                i2 = vVar.z;
                i = vVar.e;
                i3 = vVar.f;
                str = vVar.d;
                str2 = vVar.c;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
        }
        String e = com.amazon.aps.iva.q5.g0.e(s);
        if (z) {
            i4 = vVar.g;
        } else {
            i4 = -1;
        }
        if (z) {
            i5 = vVar.h;
        }
        v.a aVar = new v.a();
        aVar.a = vVar.b;
        aVar.b = str2;
        aVar.j = vVar.l;
        aVar.k = e;
        aVar.h = s;
        aVar.i = f0Var;
        aVar.f = i4;
        aVar.g = i5;
        aVar.x = i2;
        aVar.d = i;
        aVar.e = i3;
        aVar.c = str;
        return aVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0050 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.j6.i.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.net.Uri r17, com.amazon.aps.iva.t6.j.c r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.amazon.aps.iva.h6.o[] r2 = r0.w
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L8e
            r8 = r2[r6]
            com.amazon.aps.iva.h6.g r9 = r8.e
            android.net.Uri[] r10 = r9.e
            boolean r10 = com.amazon.aps.iva.t5.g0.k(r10, r1)
            if (r10 != 0) goto L1b
            r13 = r18
            goto L86
        L1b:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3a
            com.amazon.aps.iva.s6.r r12 = r9.r
            com.amazon.aps.iva.t6.j$a r12 = com.amazon.aps.iva.s6.v.a(r12)
            com.amazon.aps.iva.t6.j r8 = r8.j
            r13 = r18
            com.amazon.aps.iva.t6.j$b r8 = r8.b(r12, r13)
            if (r8 == 0) goto L3c
            int r12 = r8.a
            r14 = 2
            if (r12 != r14) goto L3c
            long r14 = r8.b
            goto L3d
        L3a:
            r13 = r18
        L3c:
            r14 = r10
        L3d:
            r8 = 0
        L3e:
            android.net.Uri[] r12 = r9.e
            int r4 = r12.length
            r5 = -1
            if (r8 >= r4) goto L50
            r4 = r12[r8]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L4d
            goto L51
        L4d:
            int r8 = r8 + 1
            goto L3e
        L50:
            r8 = r5
        L51:
            if (r8 != r5) goto L54
            goto L7f
        L54:
            com.amazon.aps.iva.s6.r r4 = r9.r
            int r4 = r4.l(r8)
            if (r4 != r5) goto L5d
            goto L7f
        L5d:
            boolean r5 = r9.t
            android.net.Uri r8 = r9.p
            boolean r8 = r1.equals(r8)
            r5 = r5 | r8
            r9.t = r5
            int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r5 == 0) goto L7f
            com.amazon.aps.iva.s6.r r5 = r9.r
            boolean r4 = r5.h(r4, r14)
            if (r4 == 0) goto L7d
            com.amazon.aps.iva.j6.i r4 = r9.g
            boolean r4 = r4.k(r1, r14)
            if (r4 == 0) goto L7d
            goto L7f
        L7d:
            r4 = 0
            goto L80
        L7f:
            r4 = 1
        L80:
            if (r4 == 0) goto L88
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 == 0) goto L88
        L86:
            r4 = 1
            goto L89
        L88:
            r4 = 0
        L89:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L8e:
            com.amazon.aps.iva.o6.u$a r1 = r0.t
            r1.a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h6.m.a(android.net.Uri, com.amazon.aps.iva.t6.j$c, boolean):boolean");
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long b(long j, s1 s1Var) {
        boolean z;
        com.amazon.aps.iva.j6.d dVar;
        long j2;
        o[] oVarArr = this.x;
        int length = oVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            o oVar = oVarArr[i];
            if (oVar.B == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g gVar = oVar.e;
                int c = gVar.r.c();
                Uri[] uriArr = gVar.e;
                int length2 = uriArr.length;
                com.amazon.aps.iva.j6.i iVar = gVar.g;
                if (c < length2 && c != -1) {
                    dVar = iVar.m(uriArr[gVar.r.q()], true);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    ImmutableList immutableList = dVar.r;
                    if (!immutableList.isEmpty() && dVar.c) {
                        long c2 = dVar.h - iVar.c();
                        long j3 = j - c2;
                        int d = g0.d(immutableList, Long.valueOf(j3), true);
                        long j4 = ((d.c) immutableList.get(d)).f;
                        if (d != immutableList.size() - 1) {
                            j2 = ((d.c) immutableList.get(d + 1)).f;
                        } else {
                            j2 = j4;
                        }
                        return s1Var.a(j3, j4, j2) + c2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        return this.A.c();
    }

    @Override // com.amazon.aps.iva.j6.i.a
    public final void d() {
        o[] oVarArr;
        for (o oVar : this.w) {
            ArrayList<k> arrayList = oVar.o;
            if (!arrayList.isEmpty()) {
                k kVar = (k) Iterables.getLast(arrayList);
                int b = oVar.e.b(kVar);
                if (b == 1) {
                    kVar.L = true;
                } else if (b == 2 && !oVar.U) {
                    com.amazon.aps.iva.t6.k kVar2 = oVar.k;
                    if (kVar2.d()) {
                        kVar2.b();
                    }
                }
            }
        }
        this.t.a(this);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long e(long j) {
        o[] oVarArr = this.x;
        if (oVarArr.length > 0) {
            boolean H = oVarArr[0].H(j, false);
            int i = 1;
            while (true) {
                o[] oVarArr2 = this.x;
                if (i >= oVarArr2.length) {
                    break;
                }
                oVarArr2[i].H(j, H);
                i++;
            }
            if (H) {
                ((SparseArray) this.l.b).clear();
            }
        }
        return j;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final List f(ArrayList arrayList) {
        int[] iArr;
        o0 o0Var;
        int i;
        int i2;
        int i3;
        m mVar = this;
        com.amazon.aps.iva.j6.e e = mVar.c.e();
        e.getClass();
        List<e.b> list = e.e;
        int i4 = !list.isEmpty();
        int length = mVar.w.length - e.h.size();
        int i5 = 0;
        if (i4 != 0) {
            o oVar = mVar.w[0];
            iArr = mVar.y[0];
            oVar.g();
            o0Var = oVar.J;
            i = oVar.M;
        } else {
            iArr = new int[0];
            o0Var = o0.e;
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            com.amazon.aps.iva.s6.r rVar = (com.amazon.aps.iva.s6.r) it.next();
            s0 m = rVar.m();
            int b = o0Var.b(m);
            if (b != -1) {
                if (b == i) {
                    for (int i6 = i5; i6 < rVar.length(); i6++) {
                        arrayList2.add(new p0(i5, i5, iArr[rVar.f(i6)]));
                    }
                    i2 = i4;
                    z2 = true;
                } else {
                    i2 = i4;
                    z = true;
                }
            } else {
                int i7 = i4;
                while (true) {
                    o[] oVarArr = mVar.w;
                    if (i7 >= oVarArr.length) {
                        break;
                    }
                    o oVar2 = oVarArr[i7];
                    oVar2.g();
                    if (oVar2.J.b(m) != -1) {
                        if (i7 < length) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        int[] iArr2 = mVar.y[i7];
                        int i8 = 0;
                        while (i8 < rVar.length()) {
                            arrayList2.add(new p0(0, i3, iArr2[rVar.f(i8)]));
                            i8++;
                            i4 = i4;
                        }
                    } else {
                        i7++;
                        mVar = this;
                    }
                }
                i2 = i4;
            }
            mVar = this;
            i4 = i2;
            i5 = 0;
        }
        if (z && !z2) {
            int i9 = iArr[0];
            int i10 = list.get(i9).b.i;
            for (int i11 = 1; i11 < iArr.length; i11++) {
                int i12 = list.get(iArr[i11]).b.i;
                if (i12 < i10) {
                    i9 = iArr[i11];
                    i10 = i12;
                }
            }
            arrayList2.add(new p0(0, 0, i9));
        }
        return arrayList2;
    }

    public final o g(String str, int i, Uri[] uriArr, v[] vVarArr, v vVar, List<v> list, Map<String, com.amazon.aps.iva.q5.r> map, long j) {
        return new o(str, i, this.r, new g(this.b, this.c, uriArr, vVarArr, this.d, this.e, this.l, this.s, list, this.q), map, this.j, j, vVar, this.f, this.g, this.h, this.i, this.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025a  */
    @Override // com.amazon.aps.iva.o6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(com.amazon.aps.iva.s6.r[] r37, boolean[] r38, com.amazon.aps.iva.o6.h0[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h6.m.h(com.amazon.aps.iva.s6.r[], boolean[], com.amazon.aps.iva.o6.h0[], boolean[], long):long");
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        return this.A.isLoading();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long j() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0232  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.HashMap] */
    @Override // com.amazon.aps.iva.o6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.amazon.aps.iva.o6.u.a r25, long r26) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h6.m.k(com.amazon.aps.iva.o6.u$a, long):void");
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void n() throws IOException {
        o[] oVarArr;
        for (o oVar : this.w) {
            oVar.E();
            if (oVar.U && !oVar.E) {
                throw com.amazon.aps.iva.q5.h0.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean p(long j) {
        o[] oVarArr;
        if (this.v == null) {
            for (o oVar : this.w) {
                if (!oVar.E) {
                    oVar.p(oVar.Q);
                }
            }
            return false;
        }
        return this.A.p(j);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final o0 q() {
        o0 o0Var = this.v;
        o0Var.getClass();
        return o0Var;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        return this.A.s();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void t(long j, boolean z) {
        o[] oVarArr;
        for (o oVar : this.x) {
            if (oVar.D && !oVar.C()) {
                int length = oVar.w.length;
                for (int i = 0; i < length; i++) {
                    oVar.w[i].h(z, oVar.O[i], j);
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
        this.A.v(j);
    }
}
