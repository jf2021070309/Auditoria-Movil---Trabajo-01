package com.amazon.aps.iva.o6;

import com.amazon.aps.iva.a6.s1;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.t6.k;
import com.amazon.aps.iva.w5.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: SingleSampleMediaPeriod.java */
/* loaded from: classes.dex */
public final class l0 implements u, k.a<b> {
    public final com.amazon.aps.iva.w5.i b;
    public final f.a c;
    public final com.amazon.aps.iva.w5.y d;
    public final com.amazon.aps.iva.t6.j e;
    public final z.a f;
    public final o0 g;
    public final long i;
    public final com.amazon.aps.iva.q5.v k;
    public final boolean l;
    public boolean m;
    public byte[] n;
    public int o;
    public final ArrayList<a> h = new ArrayList<>();
    public final com.amazon.aps.iva.t6.k j = new com.amazon.aps.iva.t6.k("SingleSampleMediaPeriod");

    /* compiled from: SingleSampleMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class a implements h0 {
        public int b;
        public boolean c;

        public a() {
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final void a() throws IOException {
            l0 l0Var = l0.this;
            if (!l0Var.l) {
                l0Var.j.a();
            }
        }

        public final void b() {
            if (!this.c) {
                l0 l0Var = l0.this;
                l0Var.f.a(com.amazon.aps.iva.q5.g0.i(l0Var.k.m), l0Var.k, 0, null, 0L);
                this.c = true;
            }
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final boolean g() {
            return l0.this.m;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int m(com.amazon.aps.iva.u1.g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i) {
            b();
            l0 l0Var = l0.this;
            boolean z = l0Var.m;
            if (z && l0Var.n == null) {
                this.b = 2;
            }
            int i2 = this.b;
            if (i2 == 2) {
                fVar.h(4);
                return -4;
            } else if ((i & 2) == 0 && i2 != 0) {
                if (!z) {
                    return -3;
                }
                l0Var.n.getClass();
                fVar.h(1);
                fVar.f = 0L;
                if ((i & 4) == 0) {
                    fVar.m(l0Var.o);
                    fVar.d.put(l0Var.n, 0, l0Var.o);
                }
                if ((i & 1) == 0) {
                    this.b = 2;
                }
                return -4;
            } else {
                g0Var.c = l0Var.k;
                this.b = 1;
                return -5;
            }
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int o(long j) {
            b();
            if (j > 0 && this.b != 2) {
                this.b = 2;
                return 1;
            }
            return 0;
        }
    }

    public l0(com.amazon.aps.iva.w5.i iVar, f.a aVar, com.amazon.aps.iva.w5.y yVar, com.amazon.aps.iva.q5.v vVar, long j, com.amazon.aps.iva.t6.j jVar, z.a aVar2, boolean z) {
        this.b = iVar;
        this.c = aVar;
        this.d = yVar;
        this.k = vVar;
        this.i = j;
        this.e = jVar;
        this.f = aVar2;
        this.l = z;
        this.g = new o0(new s0("", vVar));
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        if (!this.m && !this.j.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final k.b d(b bVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        k.b bVar2;
        b bVar3 = bVar;
        com.amazon.aps.iva.w5.w wVar = bVar3.c;
        q qVar = new q(bVar3.a, wVar.c, wVar.d, wVar.b);
        com.amazon.aps.iva.t5.g0.e0(this.i);
        j.c cVar = new j.c(qVar, iOException, i);
        com.amazon.aps.iva.t6.j jVar = this.e;
        long c = jVar.c(cVar);
        int i2 = (c > (-9223372036854775807L) ? 1 : (c == (-9223372036854775807L) ? 0 : -1));
        if (i2 != 0 && i < jVar.a(1)) {
            z = false;
        } else {
            z = true;
        }
        if (this.l && z) {
            com.amazon.aps.iva.t5.p.h("Loading failed, treating as end-of-stream.", iOException);
            this.m = true;
            bVar2 = com.amazon.aps.iva.t6.k.e;
        } else if (i2 != 0) {
            bVar2 = new k.b(0, c);
        } else {
            bVar2 = com.amazon.aps.iva.t6.k.f;
        }
        k.b bVar4 = bVar2;
        this.f.i(qVar, 1, -1, this.k, 0, null, 0L, this.i, iOException, !bVar4.a());
        return bVar4;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long e(long j) {
        int i = 0;
        while (true) {
            ArrayList<a> arrayList = this.h;
            if (i < arrayList.size()) {
                a aVar = arrayList.get(i);
                if (aVar.b == 2) {
                    aVar.b = 1;
                }
                i++;
            } else {
                return j;
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long h(com.amazon.aps.iva.s6.r[] rVarArr, boolean[] zArr, h0[] h0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < rVarArr.length; i++) {
            h0 h0Var = h0VarArr[i];
            ArrayList<a> arrayList = this.h;
            if (h0Var != null && (rVarArr[i] == null || !zArr[i])) {
                arrayList.remove(h0Var);
                h0VarArr[i] = null;
            }
            if (h0VarArr[i] == null && rVarArr[i] != null) {
                a aVar = new a();
                arrayList.add(aVar);
                h0VarArr[i] = aVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void i(b bVar, long j, long j2, boolean z) {
        b bVar2 = bVar;
        com.amazon.aps.iva.w5.w wVar = bVar2.c;
        q qVar = new q(bVar2.a, wVar.c, wVar.d, wVar.b);
        this.e.getClass();
        this.f.d(qVar, 1, -1, null, 0, null, 0L, this.i);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        return this.j.d();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long j() {
        return -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void k(u.a aVar, long j) {
        aVar.d(this);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean p(long j) {
        if (!this.m) {
            com.amazon.aps.iva.t6.k kVar = this.j;
            if (!kVar.d() && !kVar.c()) {
                com.amazon.aps.iva.w5.f a2 = this.c.a();
                com.amazon.aps.iva.w5.y yVar = this.d;
                if (yVar != null) {
                    a2.j(yVar);
                }
                b bVar = new b(a2, this.b);
                this.f.m(new q(bVar.a, this.b, kVar.f(bVar, this, this.e.a(1))), 1, -1, this.k, 0, null, 0L, this.i);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final o0 q() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        if (this.m) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void u(b bVar, long j, long j2) {
        b bVar2 = bVar;
        this.o = (int) bVar2.c.b;
        byte[] bArr = bVar2.d;
        bArr.getClass();
        this.n = bArr;
        this.m = true;
        long j3 = bVar2.a;
        com.amazon.aps.iva.w5.w wVar = bVar2.c;
        q qVar = new q(j3, wVar.c, wVar.d, this.o);
        this.e.getClass();
        this.f.g(qVar, 1, -1, this.k, 0, null, 0L, this.i);
    }

    /* compiled from: SingleSampleMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class b implements k.d {
        public final long a = q.a();
        public final com.amazon.aps.iva.w5.i b;
        public final com.amazon.aps.iva.w5.w c;
        public byte[] d;

        public b(com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar) {
            this.b = iVar;
            this.c = new com.amazon.aps.iva.w5.w(fVar);
        }

        @Override // com.amazon.aps.iva.t6.k.d
        public final void a() throws IOException {
            com.amazon.aps.iva.w5.w wVar = this.c;
            wVar.b = 0L;
            try {
                wVar.b(this.b);
                int i = 0;
                while (i != -1) {
                    int i2 = (int) wVar.b;
                    byte[] bArr = this.d;
                    if (bArr == null) {
                        this.d = new byte[1024];
                    } else if (i2 == bArr.length) {
                        this.d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.d;
                    i = wVar.l(bArr2, i2, bArr2.length - i2);
                }
            } finally {
                com.amazon.aps.iva.n1.c.g(wVar);
            }
        }

        @Override // com.amazon.aps.iva.t6.k.d
        public final void b() {
        }
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void n() {
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long b(long j, s1 s1Var) {
        return j;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void t(long j, boolean z) {
    }
}
