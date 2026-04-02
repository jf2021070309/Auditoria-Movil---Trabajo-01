package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import com.amazon.aps.iva.a6.s1;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.e6.j;
import com.amazon.aps.iva.g1.n;
import com.amazon.aps.iva.q6.e;
import com.amazon.aps.iva.q6.m;
import com.amazon.aps.iva.s6.r;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t6.l;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.w5.y;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DefaultDashChunkSource.java */
/* loaded from: classes.dex */
public final class c implements androidx.media3.exoplayer.dash.a {
    public final l a;
    public final com.amazon.aps.iva.d6.b b;
    public final int[] c;
    public final int d;
    public final f e;
    public final long f;
    public final d.c g;
    public final b[] h;
    public r i;
    public com.amazon.aps.iva.e6.c j;
    public int k;
    public com.amazon.aps.iva.o6.b l;
    public boolean m;

    /* compiled from: DefaultDashChunkSource.java */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0036a {
        public final f.a a;

        public a(f.a aVar) {
            this.a = aVar;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0036a
        public final c a(l lVar, com.amazon.aps.iva.e6.c cVar, com.amazon.aps.iva.d6.b bVar, int i, int[] iArr, r rVar, int i2, long j, boolean z, ArrayList arrayList, d.c cVar2, y yVar, p1 p1Var) {
            f a = this.a.a();
            if (yVar != null) {
                a.j(yVar);
            }
            return new c(lVar, cVar, bVar, i, iArr, rVar, i2, a, j, z, arrayList, cVar2, p1Var);
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final com.amazon.aps.iva.q6.f a;
        public final j b;
        public final com.amazon.aps.iva.e6.b c;
        public final com.amazon.aps.iva.d6.d d;
        public final long e;
        public final long f;

        public b(long j, j jVar, com.amazon.aps.iva.e6.b bVar, com.amazon.aps.iva.q6.f fVar, long j2, com.amazon.aps.iva.d6.d dVar) {
            this.e = j;
            this.b = jVar;
            this.c = bVar;
            this.f = j2;
            this.a = fVar;
            this.d = dVar;
        }

        public final b a(long j, j jVar) throws com.amazon.aps.iva.o6.b {
            long f;
            long f2;
            com.amazon.aps.iva.d6.d i = this.b.i();
            com.amazon.aps.iva.d6.d i2 = jVar.i();
            if (i == null) {
                return new b(j, jVar, this.c, this.a, this.f, i);
            }
            if (!i.j()) {
                return new b(j, jVar, this.c, this.a, this.f, i2);
            }
            long g = i.g(j);
            if (g == 0) {
                return new b(j, jVar, this.c, this.a, this.f, i2);
            }
            long k = i.k();
            long a = i.a(k);
            long j2 = (g + k) - 1;
            long a2 = i.a(j2);
            long k2 = i2.k();
            long a3 = i2.a(k2);
            int i3 = ((i.b(j2, j) + a2) > a3 ? 1 : ((i.b(j2, j) + a2) == a3 ? 0 : -1));
            long j3 = this.f;
            if (i3 == 0) {
                f = j2 + 1;
            } else if (i3 >= 0) {
                if (a3 < a) {
                    f2 = j3 - (i2.f(a, j) - k);
                    return new b(j, jVar, this.c, this.a, f2, i2);
                }
                f = i.f(a3, j);
            } else {
                throw new com.amazon.aps.iva.o6.b();
            }
            f2 = (f - k2) + j3;
            return new b(j, jVar, this.c, this.a, f2, i2);
        }

        public final long b(long j) {
            com.amazon.aps.iva.d6.d dVar = this.d;
            long j2 = this.e;
            return (dVar.l(j2, j) + (dVar.c(j2, j) + this.f)) - 1;
        }

        public final long c(long j) {
            return this.d.b(j - this.f, this.e) + d(j);
        }

        public final long d(long j) {
            return this.d.a(j - this.f);
        }

        public final boolean e(long j, long j2) {
            if (this.d.j() || j2 == -9223372036854775807L || c(j) <= j2) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    /* renamed from: androidx.media3.exoplayer.dash.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0037c extends com.amazon.aps.iva.q6.b {
        public final b e;

        public C0037c(b bVar, long j, long j2) {
            super(j, j2);
            this.e = bVar;
        }

        @Override // com.amazon.aps.iva.q6.n
        public final long a() {
            c();
            return this.e.d(this.d);
        }

        @Override // com.amazon.aps.iva.q6.n
        public final long b() {
            c();
            return this.e.c(this.d);
        }
    }

    public c(l lVar, com.amazon.aps.iva.e6.c cVar, com.amazon.aps.iva.d6.b bVar, int i, int[] iArr, r rVar, int i2, f fVar, long j, boolean z, ArrayList arrayList, d.c cVar2, p1 p1Var) {
        n nVar = com.amazon.aps.iva.q6.d.k;
        this.a = lVar;
        this.j = cVar;
        this.b = bVar;
        this.c = iArr;
        this.i = rVar;
        this.d = i2;
        this.e = fVar;
        this.k = i;
        this.f = j;
        this.g = cVar2;
        long e = cVar.e(i);
        ArrayList<j> k = k();
        this.h = new b[rVar.length()];
        int i3 = 0;
        while (i3 < this.h.length) {
            j jVar = k.get(rVar.f(i3));
            com.amazon.aps.iva.e6.b d = bVar.d(jVar.c);
            b[] bVarArr = this.h;
            if (d == null) {
                d = jVar.c.get(0);
            }
            int i4 = i3;
            bVarArr[i4] = new b(e, jVar, d, nVar.g(i2, jVar.b, z, arrayList, cVar2), 0L, jVar.i());
            i3 = i4 + 1;
        }
    }

    @Override // com.amazon.aps.iva.q6.i
    public final void a() throws IOException {
        com.amazon.aps.iva.o6.b bVar = this.l;
        if (bVar == null) {
            this.a.a();
            return;
        }
        throw bVar;
    }

    @Override // com.amazon.aps.iva.q6.i
    public final long b(long j, s1 s1Var) {
        b[] bVarArr;
        long j2;
        for (b bVar : this.h) {
            com.amazon.aps.iva.d6.d dVar = bVar.d;
            if (dVar != null) {
                long j3 = bVar.e;
                long g = dVar.g(j3);
                if (g != 0) {
                    com.amazon.aps.iva.d6.d dVar2 = bVar.d;
                    long f = dVar2.f(j, j3);
                    long j4 = bVar.f;
                    long j5 = f + j4;
                    long d = bVar.d(j5);
                    if (d < j && (g == -1 || j5 < ((dVar2.k() + j4) + g) - 1)) {
                        j2 = bVar.d(j5 + 1);
                    } else {
                        j2 = d;
                    }
                    return s1Var.a(j, d, j2);
                }
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[RETURN] */
    @Override // com.amazon.aps.iva.q6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.amazon.aps.iva.q6.e r12, boolean r13, com.amazon.aps.iva.t6.j.c r14, com.amazon.aps.iva.t6.j r15) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.c.c(com.amazon.aps.iva.q6.e, boolean, com.amazon.aps.iva.t6.j$c, com.amazon.aps.iva.t6.j):boolean");
    }

    @Override // com.amazon.aps.iva.q6.i
    public final int d(List list, long j) {
        if (this.l == null && this.i.length() >= 2) {
            return this.i.u(list, j);
        }
        return list.size();
    }

    @Override // com.amazon.aps.iva.q6.i
    public final void e(e eVar) {
        g gVar;
        if (eVar instanceof com.amazon.aps.iva.q6.l) {
            int d = this.i.d(((com.amazon.aps.iva.q6.l) eVar).d);
            b[] bVarArr = this.h;
            b bVar = bVarArr[d];
            if (bVar.d == null) {
                com.amazon.aps.iva.q6.f fVar = bVar.a;
                d0 d0Var = ((com.amazon.aps.iva.q6.d) fVar).i;
                if (d0Var instanceof g) {
                    gVar = (g) d0Var;
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    j jVar = bVar.b;
                    bVarArr[d] = new b(bVar.e, jVar, bVar.c, fVar, bVar.f, new com.amazon.aps.iva.d6.f(gVar, jVar.d));
                }
            }
        }
        d.c cVar = this.g;
        if (cVar != null) {
            long j = cVar.d;
            if (j == -9223372036854775807L || eVar.h > j) {
                cVar.d = eVar.h;
            }
            d.this.h = true;
        }
    }

    @Override // com.amazon.aps.iva.q6.i
    public final boolean f(long j, e eVar, List<? extends m> list) {
        if (this.l != null) {
            return false;
        }
        return this.i.p(j, eVar, list);
    }

    @Override // androidx.media3.exoplayer.dash.a
    public final void g(r rVar) {
        this.i = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020c  */
    @Override // com.amazon.aps.iva.q6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r56, long r58, java.util.List<? extends com.amazon.aps.iva.q6.m> r60, com.amazon.aps.iva.q6.g r61) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.c.h(long, long, java.util.List, com.amazon.aps.iva.q6.g):void");
    }

    @Override // androidx.media3.exoplayer.dash.a
    public final void i(com.amazon.aps.iva.e6.c cVar, int i) {
        b[] bVarArr = this.h;
        try {
            this.j = cVar;
            this.k = i;
            long e = cVar.e(i);
            ArrayList<j> k = k();
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                bVarArr[i2] = bVarArr[i2].a(e, k.get(this.i.f(i2)));
            }
        } catch (com.amazon.aps.iva.o6.b e2) {
            this.l = e2;
        }
    }

    public final long j(long j) {
        com.amazon.aps.iva.e6.c cVar = this.j;
        long j2 = cVar.a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - g0.Q(j2 + cVar.b(this.k).b);
    }

    public final ArrayList<j> k() {
        List<com.amazon.aps.iva.e6.a> list = this.j.b(this.k).c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i : this.c) {
            arrayList.addAll(list.get(i).c);
        }
        return arrayList;
    }

    public final b l(int i) {
        b[] bVarArr = this.h;
        b bVar = bVarArr[i];
        com.amazon.aps.iva.e6.b d = this.b.d(bVar.b.c);
        if (d != null && !d.equals(bVar.c)) {
            b bVar2 = new b(bVar.e, bVar.b, d, bVar.a, bVar.f, bVar.d);
            bVarArr[i] = bVar2;
            return bVar2;
        }
        return bVar;
    }

    @Override // com.amazon.aps.iva.q6.i
    public final void release() {
        for (b bVar : this.h) {
            com.amazon.aps.iva.q6.f fVar = bVar.a;
            if (fVar != null) {
                ((com.amazon.aps.iva.q6.d) fVar).b.release();
            }
        }
    }
}
