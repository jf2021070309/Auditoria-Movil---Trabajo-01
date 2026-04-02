package com.amazon.aps.iva.o6;

import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.r0;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ClippingMediaSource.java */
/* loaded from: classes.dex */
public final class e extends q0 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList<d> q;
    public final r0.d r;
    public a s;
    public b t;
    public long u;
    public long v;

    /* compiled from: ClippingMediaSource.java */
    /* loaded from: classes.dex */
    public static final class a extends o {
        public final long h;
        public final long i;
        public final long j;
        public final boolean k;

        public a(r0 r0Var, long j, long j2) throws b {
            super(r0Var);
            long max;
            long j3;
            boolean z = false;
            if (r0Var.j() == 1) {
                r0.d o = r0Var.o(0, new r0.d());
                long max2 = Math.max(0L, j);
                if (!o.m && max2 != 0 && !o.i) {
                    throw new b(1);
                }
                if (j2 == Long.MIN_VALUE) {
                    max = o.o;
                } else {
                    max = Math.max(0L, j2);
                }
                long j4 = o.o;
                if (j4 != -9223372036854775807L) {
                    max = max > j4 ? j4 : max;
                    if (max2 > max) {
                        throw new b(2);
                    }
                }
                this.h = max2;
                this.i = max;
                int i = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
                if (i == 0) {
                    j3 = -9223372036854775807L;
                } else {
                    j3 = max - max2;
                }
                this.j = j3;
                if (o.j && (i == 0 || (j4 != -9223372036854775807L && max == j4))) {
                    z = true;
                }
                this.k = z;
                return;
            }
            throw new b(0);
        }

        @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
        public final r0.b h(int i, r0.b bVar, boolean z) {
            long j;
            this.g.h(0, bVar, z);
            long j2 = bVar.f - this.h;
            long j3 = this.j;
            if (j3 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j3 - j2;
            }
            bVar.k(bVar.b, bVar.c, j, j2);
            return bVar;
        }

        @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
        public final r0.d p(int i, r0.d dVar, long j) {
            this.g.p(0, dVar, 0L);
            long j2 = dVar.r;
            long j3 = this.h;
            dVar.r = j2 + j3;
            dVar.o = this.j;
            dVar.j = this.k;
            long j4 = dVar.n;
            if (j4 != -9223372036854775807L) {
                long max = Math.max(j4, j3);
                dVar.n = max;
                long j5 = this.i;
                if (j5 != -9223372036854775807L) {
                    max = Math.min(max, j5);
                }
                dVar.n = max - j3;
            }
            long e0 = com.amazon.aps.iva.t5.g0.e0(j3);
            long j6 = dVar.f;
            if (j6 != -9223372036854775807L) {
                dVar.f = j6 + e0;
            }
            long j7 = dVar.g;
            if (j7 != -9223372036854775807L) {
                dVar.g = j7 + e0;
            }
            return dVar;
        }
    }

    /* compiled from: ClippingMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L11
                r0 = 1
                if (r2 == r0) goto Le
                r0 = 2
                if (r2 == r0) goto Lb
                java.lang.String r2 = "unknown"
                goto L13
            Lb:
                java.lang.String r2 = "start exceeds end"
                goto L13
            Le:
                java.lang.String r2 = "not seekable to start"
                goto L13
            L11:
                java.lang.String r2 = "invalid period count"
            L13:
                java.lang.String r0 = "Illegal clipping: "
                java.lang.String r2 = r0.concat(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o6.e.b.<init>(int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v vVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(vVar);
        boolean z4;
        vVar.getClass();
        if (j >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        com.amazon.aps.iva.cq.b.t(z4);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList<>();
        this.r = new r0.d();
    }

    @Override // com.amazon.aps.iva.o6.q0
    public final void A(r0 r0Var) {
        if (this.t != null) {
            return;
        }
        C(r0Var);
    }

    public final void C(r0 r0Var) {
        long j;
        long j2;
        long j3;
        r0.d dVar = this.r;
        r0Var.o(0, dVar);
        long j4 = dVar.r;
        a aVar = this.s;
        long j5 = this.m;
        long j6 = Long.MIN_VALUE;
        ArrayList<d> arrayList = this.q;
        if (aVar != null && !arrayList.isEmpty() && !this.o) {
            long j7 = this.u - j4;
            if (j5 != Long.MIN_VALUE) {
                j6 = this.v - j4;
            }
            j3 = j6;
            j2 = j7;
        } else {
            boolean z = this.p;
            long j8 = this.l;
            if (z) {
                long j9 = dVar.n;
                j8 += j9;
                j = j9 + j5;
            } else {
                j = j5;
            }
            this.u = j4 + j8;
            if (j5 != Long.MIN_VALUE) {
                j6 = j4 + j;
            }
            this.v = j6;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d dVar2 = arrayList.get(i);
                long j10 = this.u;
                long j11 = this.v;
                dVar2.f = j10;
                dVar2.g = j11;
            }
            j2 = j8;
            j3 = j;
        }
        try {
            a aVar2 = new a(r0Var, j2, j3);
            this.s = aVar2;
            s(aVar2);
        } catch (b e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).h = this.t;
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void c(u uVar) {
        ArrayList<d> arrayList = this.q;
        com.amazon.aps.iva.cq.b.C(arrayList.remove(uVar));
        this.k.c(((d) uVar).b);
        if (arrayList.isEmpty() && !this.o) {
            a aVar = this.s;
            aVar.getClass();
            C(aVar.g);
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public final u h(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        d dVar = new d(this.k.h(bVar, bVar2, j), this.n, this.u, this.v);
        this.q.add(dVar);
        return dVar;
    }

    @Override // com.amazon.aps.iva.o6.g, com.amazon.aps.iva.o6.v
    public final void j() throws IOException {
        b bVar = this.t;
        if (bVar == null) {
            super.j();
            return;
        }
        throw bVar;
    }

    @Override // com.amazon.aps.iva.o6.g, com.amazon.aps.iva.o6.a
    public final void t() {
        super.t();
        this.t = null;
        this.s = null;
    }
}
