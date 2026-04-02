package com.amazon.aps.iva.o6;

import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.r0;
/* compiled from: MaskingMediaSource.java */
/* loaded from: classes.dex */
public final class s extends q0 {
    public final boolean l;
    public final r0.d m;
    public final r0.b n;
    public a o;
    public r p;
    public boolean q;
    public boolean r;
    public boolean s;

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes.dex */
    public static final class a extends o {
        public static final Object j = new Object();
        public final Object h;
        public final Object i;

        public a(r0 r0Var, Object obj, Object obj2) {
            super(r0Var);
            this.h = obj;
            this.i = obj2;
        }

        @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
        public final int c(Object obj) {
            Object obj2;
            if (j.equals(obj) && (obj2 = this.i) != null) {
                obj = obj2;
            }
            return this.g.c(obj);
        }

        @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
        public final r0.b h(int i, r0.b bVar, boolean z) {
            this.g.h(i, bVar, z);
            if (com.amazon.aps.iva.t5.g0.a(bVar.c, this.i) && z) {
                bVar.c = j;
            }
            return bVar;
        }

        @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
        public final Object n(int i) {
            Object n = this.g.n(i);
            if (com.amazon.aps.iva.t5.g0.a(n, this.i)) {
                return j;
            }
            return n;
        }

        @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
        public final r0.d p(int i, r0.d dVar, long j2) {
            this.g.p(i, dVar, j2);
            if (com.amazon.aps.iva.t5.g0.a(dVar.b, this.h)) {
                dVar.b = r0.d.s;
            }
            return dVar;
        }
    }

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b extends r0 {
        public final com.amazon.aps.iva.q5.b0 g;

        public b(com.amazon.aps.iva.q5.b0 b0Var) {
            this.g = b0Var;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int c(Object obj) {
            if (obj == a.j) {
                return 0;
            }
            return -1;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final r0.b h(int i, r0.b bVar, boolean z) {
            Integer num;
            Object obj = null;
            if (z) {
                num = 0;
            } else {
                num = null;
            }
            if (z) {
                obj = a.j;
            }
            bVar.j(num, obj, 0, -9223372036854775807L, 0L, com.amazon.aps.iva.q5.c.h, true);
            return bVar;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int j() {
            return 1;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final Object n(int i) {
            return a.j;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final r0.d p(int i, r0.d dVar, long j) {
            dVar.c(r0.d.s, this.g, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.m = true;
            return dVar;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int q() {
            return 1;
        }
    }

    public s(v vVar, boolean z) {
        super(vVar);
        boolean z2;
        if (z && vVar.k()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new r0.d();
        this.n = new r0.b();
        r0 l = vVar.l();
        if (l != null) {
            this.o = new a(l, null, null);
            this.s = true;
            return;
        }
        this.o = new a(new b(vVar.b()), r0.d.s, a.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.o6.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(com.amazon.aps.iva.q5.r0 r15) {
        /*
            r14 = this;
            boolean r0 = r14.r
            if (r0 == 0) goto L1c
            com.amazon.aps.iva.o6.s$a r0 = r14.o
            com.amazon.aps.iva.o6.s$a r1 = new com.amazon.aps.iva.o6.s$a
            java.lang.Object r2 = r0.h
            java.lang.Object r0 = r0.i
            r1.<init>(r15, r2, r0)
            r14.o = r1
            com.amazon.aps.iva.o6.r r15 = r14.p
            if (r15 == 0) goto Lbb
            long r0 = r15.j
            r14.D(r0)
            goto Lbb
        L1c:
            boolean r0 = r15.r()
            if (r0 == 0) goto L40
            boolean r0 = r14.s
            if (r0 == 0) goto L32
            com.amazon.aps.iva.o6.s$a r0 = r14.o
            com.amazon.aps.iva.o6.s$a r1 = new com.amazon.aps.iva.o6.s$a
            java.lang.Object r2 = r0.h
            java.lang.Object r0 = r0.i
            r1.<init>(r15, r2, r0)
            goto L3c
        L32:
            java.lang.Object r0 = com.amazon.aps.iva.q5.r0.d.s
            java.lang.Object r1 = com.amazon.aps.iva.o6.s.a.j
            com.amazon.aps.iva.o6.s$a r2 = new com.amazon.aps.iva.o6.s$a
            r2.<init>(r15, r0, r1)
            r1 = r2
        L3c:
            r14.o = r1
            goto Lbb
        L40:
            r0 = 0
            com.amazon.aps.iva.q5.r0$d r1 = r14.m
            r15.o(r0, r1)
            long r2 = r1.n
            java.lang.Object r4 = r1.b
            com.amazon.aps.iva.o6.r r5 = r14.p
            if (r5 == 0) goto L6c
            com.amazon.aps.iva.o6.s$a r6 = r14.o
            com.amazon.aps.iva.o6.v$b r7 = r5.b
            java.lang.Object r7 = r7.a
            com.amazon.aps.iva.q5.r0$b r8 = r14.n
            r6.i(r7, r8)
            long r6 = r8.f
            long r8 = r5.c
            long r6 = r6 + r8
            com.amazon.aps.iva.o6.s$a r5 = r14.o
            com.amazon.aps.iva.q5.r0$d r0 = r5.o(r0, r1)
            long r0 = r0.n
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L6c
            r12 = r6
            goto L6d
        L6c:
            r12 = r2
        L6d:
            com.amazon.aps.iva.q5.r0$d r9 = r14.m
            com.amazon.aps.iva.q5.r0$b r10 = r14.n
            r11 = 0
            r8 = r15
            android.util.Pair r0 = r8.k(r9, r10, r11, r12)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r14.s
            if (r0 == 0) goto L91
            com.amazon.aps.iva.o6.s$a r0 = r14.o
            com.amazon.aps.iva.o6.s$a r1 = new com.amazon.aps.iva.o6.s$a
            java.lang.Object r4 = r0.h
            java.lang.Object r0 = r0.i
            r1.<init>(r15, r4, r0)
            goto L97
        L91:
            com.amazon.aps.iva.o6.s$a r0 = new com.amazon.aps.iva.o6.s$a
            r0.<init>(r15, r4, r1)
            r1 = r0
        L97:
            r14.o = r1
            com.amazon.aps.iva.o6.r r15 = r14.p
            if (r15 == 0) goto Lbb
            r14.D(r2)
            com.amazon.aps.iva.o6.v$b r15 = r15.b
            java.lang.Object r0 = r15.a
            com.amazon.aps.iva.o6.s$a r1 = r14.o
            java.lang.Object r1 = r1.i
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = com.amazon.aps.iva.o6.s.a.j
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lb6
            com.amazon.aps.iva.o6.s$a r0 = r14.o
            java.lang.Object r0 = r0.i
        Lb6:
            com.amazon.aps.iva.o6.v$b r15 = r15.b(r0)
            goto Lbc
        Lbb:
            r15 = 0
        Lbc:
            r0 = 1
            r14.s = r0
            r14.r = r0
            com.amazon.aps.iva.o6.s$a r0 = r14.o
            r14.s(r0)
            if (r15 == 0) goto Ld0
            com.amazon.aps.iva.o6.r r0 = r14.p
            r0.getClass()
            r0.g(r15)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o6.s.A(com.amazon.aps.iva.q5.r0):void");
    }

    @Override // com.amazon.aps.iva.o6.q0
    public final void B() {
        if (!this.l) {
            this.q = true;
            y(null, this.k);
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    /* renamed from: C */
    public final r h(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        r rVar = new r(bVar, bVar2, j);
        v vVar = this.k;
        rVar.l(vVar);
        if (this.r) {
            Object obj = this.o.i;
            Object obj2 = bVar.a;
            if (obj != null && obj2.equals(a.j)) {
                obj2 = this.o.i;
            }
            rVar.g(bVar.b(obj2));
        } else {
            this.p = rVar;
            if (!this.q) {
                this.q = true;
                y(null, vVar);
            }
        }
        return rVar;
    }

    public final void D(long j) {
        r rVar = this.p;
        int c = this.o.c(rVar.b.a);
        if (c == -1) {
            return;
        }
        a aVar = this.o;
        r0.b bVar = this.n;
        aVar.h(c, bVar, false);
        long j2 = bVar.e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        rVar.j = j;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void c(u uVar) {
        ((r) uVar).i();
        if (uVar == this.p) {
            this.p = null;
        }
    }

    @Override // com.amazon.aps.iva.o6.g, com.amazon.aps.iva.o6.a
    public final void t() {
        this.r = false;
        this.q = false;
        super.t();
    }

    @Override // com.amazon.aps.iva.o6.q0
    public final v.b z(v.b bVar) {
        Object obj = bVar.a;
        Object obj2 = this.o.i;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.j;
        }
        return bVar.b(obj);
    }

    @Override // com.amazon.aps.iva.o6.g, com.amazon.aps.iva.o6.v
    public final void j() {
    }
}
