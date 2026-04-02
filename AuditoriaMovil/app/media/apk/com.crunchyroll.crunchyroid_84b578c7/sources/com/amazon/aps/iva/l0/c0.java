package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.i2.p0;
import com.amazon.aps.iva.j0.g1;
import com.amazon.aps.iva.j0.p2;
import com.amazon.aps.iva.j0.q2;
import com.amazon.aps.iva.j0.s2;
import com.amazon.aps.iva.j0.u2;
import com.amazon.aps.iva.l0.k;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.v1.b1;
import com.amazon.aps.iva.v1.k2;
import com.amazon.aps.iva.v1.m2;
/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes.dex */
public final class c0 {
    public final s2 a;
    public com.amazon.aps.iva.i2.q b;
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> c;
    public p2 d;
    public final y1 e;
    public p0 f;
    public b1 g;
    public k2 h;
    public com.amazon.aps.iva.l1.a i;
    public com.amazon.aps.iva.d1.r j;
    public final y1 k;
    public long l;
    public Integer m;
    public long n;
    public final y1 o;
    public final y1 p;
    public com.amazon.aps.iva.i2.e0 q;
    public final g r;

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public a(c0 c0Var) {
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.i2.e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            c0 c0Var = c0.this;
            c0Var.d(true);
            c0Var.k();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            c0 c0Var = c0.this;
            c0Var.f();
            c0Var.k();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            c0 c0Var = c0.this;
            c0Var.l();
            c0Var.k();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            c0 c0Var = c0.this;
            com.amazon.aps.iva.i2.e0 e = c0.e(c0Var.j().a, com.amazon.aps.iva.ab.x.f(0, c0Var.j().a.b.length()));
            c0Var.c.invoke(e);
            c0Var.q = com.amazon.aps.iva.i2.e0.a(c0Var.q, null, e.b, 5);
            p2 p2Var = c0Var.d;
            if (p2Var != null) {
                p2Var.k = true;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public c0() {
        this(null);
    }

    public static final void a(c0 c0Var, com.amazon.aps.iva.e1.c cVar) {
        c0Var.p.setValue(cVar);
    }

    public static final void b(c0 c0Var, com.amazon.aps.iva.j0.h0 h0Var) {
        c0Var.o.setValue(h0Var);
    }

    public static final void c(c0 c0Var, com.amazon.aps.iva.i2.e0 e0Var, int i, int i2, boolean z, k kVar) {
        com.amazon.aps.iva.c2.y yVar;
        long f2;
        q2 c2;
        com.amazon.aps.iva.i2.q qVar = c0Var.b;
        long j = e0Var.b;
        int i3 = com.amazon.aps.iva.c2.z.c;
        int b2 = qVar.b((int) (j >> 32));
        com.amazon.aps.iva.i2.q qVar2 = c0Var.b;
        long j2 = e0Var.b;
        long f3 = com.amazon.aps.iva.ab.x.f(b2, qVar2.b(com.amazon.aps.iva.c2.z.c(j2)));
        p2 p2Var = c0Var.d;
        com.amazon.aps.iva.c2.z zVar = null;
        if (p2Var != null && (c2 = p2Var.c()) != null) {
            yVar = c2.a;
        } else {
            yVar = null;
        }
        if (!com.amazon.aps.iva.c2.z.b(f3)) {
            zVar = new com.amazon.aps.iva.c2.z(f3);
        }
        com.amazon.aps.iva.c2.z zVar2 = zVar;
        com.amazon.aps.iva.yb0.j.f(kVar, "adjustment");
        if (yVar != null) {
            f2 = com.amazon.aps.iva.ab.x.f(i, i2);
            if (zVar2 != null || !com.amazon.aps.iva.yb0.j.a(kVar, k.a.a)) {
                f2 = kVar.a(yVar, f2, z, zVar2);
            }
        } else {
            f2 = com.amazon.aps.iva.ab.x.f(0, 0);
        }
        long f4 = com.amazon.aps.iva.ab.x.f(c0Var.b.a((int) (f2 >> 32)), c0Var.b.a(com.amazon.aps.iva.c2.z.c(f2)));
        if (!com.amazon.aps.iva.c2.z.a(f4, j2)) {
            com.amazon.aps.iva.l1.a aVar = c0Var.i;
            if (aVar != null) {
                aVar.a();
            }
            c0Var.c.invoke(e(e0Var.a, f4));
            p2 p2Var2 = c0Var.d;
            if (p2Var2 != null) {
                p2Var2.l.setValue(Boolean.valueOf(d0.b(c0Var, true)));
            }
            p2 p2Var3 = c0Var.d;
            if (p2Var3 != null) {
                p2Var3.m.setValue(Boolean.valueOf(d0.b(c0Var, false)));
            }
        }
    }

    public static com.amazon.aps.iva.i2.e0 e(com.amazon.aps.iva.c2.b bVar, long j) {
        return new com.amazon.aps.iva.i2.e0(bVar, j, (com.amazon.aps.iva.c2.z) null);
    }

    public final void d(boolean z) {
        if (com.amazon.aps.iva.c2.z.b(j().b)) {
            return;
        }
        b1 b1Var = this.g;
        if (b1Var != null) {
            b1Var.a(com.amazon.aps.iva.ab.x.P(j()));
        }
        if (!z) {
            return;
        }
        int d2 = com.amazon.aps.iva.c2.z.d(j().b);
        this.c.invoke(e(j().a, com.amazon.aps.iva.ab.x.f(d2, d2)));
        m(com.amazon.aps.iva.j0.i0.None);
    }

    public final void f() {
        if (com.amazon.aps.iva.c2.z.b(j().b)) {
            return;
        }
        b1 b1Var = this.g;
        if (b1Var != null) {
            b1Var.a(com.amazon.aps.iva.ab.x.P(j()));
        }
        com.amazon.aps.iva.c2.b b2 = com.amazon.aps.iva.ab.x.R(j(), j().a.b.length()).b(com.amazon.aps.iva.ab.x.Q(j(), j().a.b.length()));
        int e2 = com.amazon.aps.iva.c2.z.e(j().b);
        this.c.invoke(e(b2, com.amazon.aps.iva.ab.x.f(e2, e2)));
        m(com.amazon.aps.iva.j0.i0.None);
        s2 s2Var = this.a;
        if (s2Var != null) {
            s2Var.f = true;
        }
    }

    public final void g(com.amazon.aps.iva.e1.c cVar) {
        com.amazon.aps.iva.j0.i0 i0Var;
        q2 q2Var;
        int d2;
        boolean z = true;
        if (!com.amazon.aps.iva.c2.z.b(j().b)) {
            p2 p2Var = this.d;
            if (p2Var != null) {
                q2Var = p2Var.c();
            } else {
                q2Var = null;
            }
            if (cVar != null && q2Var != null) {
                d2 = this.b.a(q2Var.b(cVar.a, true));
            } else {
                d2 = com.amazon.aps.iva.c2.z.d(j().b);
            }
            this.c.invoke(com.amazon.aps.iva.i2.e0.a(j(), null, com.amazon.aps.iva.ab.x.f(d2, d2), 5));
        }
        if (cVar != null) {
            if (j().a.b.length() <= 0) {
                z = false;
            }
            if (z) {
                i0Var = com.amazon.aps.iva.j0.i0.Cursor;
                m(i0Var);
                k();
            }
        }
        i0Var = com.amazon.aps.iva.j0.i0.None;
        m(i0Var);
        k();
    }

    public final void h() {
        com.amazon.aps.iva.d1.r rVar;
        p2 p2Var = this.d;
        boolean z = false;
        if (p2Var != null && !p2Var.b()) {
            z = true;
        }
        if (z && (rVar = this.j) != null) {
            rVar.a();
        }
        this.q = j();
        p2 p2Var2 = this.d;
        if (p2Var2 != null) {
            p2Var2.k = true;
        }
        m(com.amazon.aps.iva.j0.i0.Selection);
    }

    public final long i(boolean z) {
        int c2;
        q2 q2Var;
        com.amazon.aps.iva.i2.e0 j = j();
        if (z) {
            long j2 = j.b;
            int i = com.amazon.aps.iva.c2.z.c;
            c2 = (int) (j2 >> 32);
        } else {
            c2 = com.amazon.aps.iva.c2.z.c(j.b);
        }
        p2 p2Var = this.d;
        if (p2Var != null) {
            q2Var = p2Var.c();
        } else {
            q2Var = null;
        }
        com.amazon.aps.iva.yb0.j.c(q2Var);
        int b2 = this.b.b(c2);
        boolean f2 = com.amazon.aps.iva.c2.z.f(j().b);
        com.amazon.aps.iva.c2.y yVar = q2Var.a;
        com.amazon.aps.iva.yb0.j.f(yVar, "textLayoutResult");
        return com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.e.w.A(yVar, b2, z, f2), yVar.e(yVar.g(b2)));
    }

    public final com.amazon.aps.iva.i2.e0 j() {
        return (com.amazon.aps.iva.i2.e0) this.e.getValue();
    }

    public final void k() {
        m2 m2Var;
        k2 k2Var;
        k2 k2Var2 = this.h;
        if (k2Var2 != null) {
            m2Var = k2Var2.getStatus();
        } else {
            m2Var = null;
        }
        if (m2Var == m2.Shown && (k2Var = this.h) != null) {
            k2Var.hide();
        }
    }

    public final void l() {
        com.amazon.aps.iva.c2.b text;
        b1 b1Var = this.g;
        if (b1Var != null && (text = b1Var.getText()) != null) {
            com.amazon.aps.iva.c2.b b2 = com.amazon.aps.iva.ab.x.R(j(), j().a.b.length()).b(text).b(com.amazon.aps.iva.ab.x.Q(j(), j().a.b.length()));
            int length = text.length() + com.amazon.aps.iva.c2.z.e(j().b);
            this.c.invoke(e(b2, com.amazon.aps.iva.ab.x.f(length, length)));
            m(com.amazon.aps.iva.j0.i0.None);
            s2 s2Var = this.a;
            if (s2Var != null) {
                s2Var.f = true;
            }
        }
    }

    public final void m(com.amazon.aps.iva.j0.i0 i0Var) {
        p2 p2Var = this.d;
        if (p2Var != null) {
            com.amazon.aps.iva.yb0.j.f(i0Var, "<set-?>");
            p2Var.j.setValue(i0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l0.c0.n():void");
    }

    public c0(s2 s2Var) {
        this.a = s2Var;
        this.b = u2.a;
        this.c = b.h;
        this.e = com.amazon.aps.iva.cq.b.c0(new com.amazon.aps.iva.i2.e0((String) null, 0L, 7));
        p0.a.getClass();
        this.f = p0.a.C0351a.b;
        this.k = com.amazon.aps.iva.cq.b.c0(Boolean.TRUE);
        long j = com.amazon.aps.iva.e1.c.b;
        this.l = j;
        this.n = j;
        this.o = com.amazon.aps.iva.cq.b.c0(null);
        this.p = com.amazon.aps.iva.cq.b.c0(null);
        this.q = new com.amazon.aps.iva.i2.e0((String) null, 0L, 7);
        this.r = new g();
        new a(this);
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class g implements g1 {
        public g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
        @Override // com.amazon.aps.iva.j0.g1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r10) {
            /*
                r9 = this;
                com.amazon.aps.iva.l0.c0 r6 = com.amazon.aps.iva.l0.c0.this
                com.amazon.aps.iva.o0.y1 r0 = r6.o
                java.lang.Object r0 = r0.getValue()
                com.amazon.aps.iva.j0.h0 r0 = (com.amazon.aps.iva.j0.h0) r0
                if (r0 == 0) goto Ld
                return
            Ld:
                com.amazon.aps.iva.j0.h0 r0 = com.amazon.aps.iva.j0.h0.SelectionEnd
                com.amazon.aps.iva.o0.y1 r1 = r6.o
                r1.setValue(r0)
                r6.k()
                com.amazon.aps.iva.j0.p2 r0 = r6.d
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L54
                com.amazon.aps.iva.j0.q2 r0 = r0.c()
                if (r0 == 0) goto L54
                long r3 = r0.a(r10)
                long r3 = r0.c(r3)
                float r5 = com.amazon.aps.iva.e1.c.d(r3)
                com.amazon.aps.iva.c2.y r0 = r0.a
                int r5 = r0.h(r5)
                float r7 = com.amazon.aps.iva.e1.c.c(r3)
                float r8 = r0.i(r5)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 < 0) goto L4f
                float r3 = com.amazon.aps.iva.e1.c.c(r3)
                float r0 = r0.j(r5)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto L4f
                r0 = r1
                goto L50
            L4f:
                r0 = r2
            L50:
                if (r0 != r1) goto L54
                r0 = r1
                goto L55
            L54:
                r0 = r2
            L55:
                if (r0 != 0) goto La4
                com.amazon.aps.iva.j0.p2 r0 = r6.d
                if (r0 == 0) goto La4
                com.amazon.aps.iva.j0.q2 r0 = r0.c()
                if (r0 == 0) goto La4
                com.amazon.aps.iva.i2.q r1 = r6.b
                float r10 = com.amazon.aps.iva.e1.c.d(r10)
                r11 = 0
                long r10 = com.amazon.aps.iva.e1.d.d(r11, r10)
                long r10 = r0.a(r10)
                long r10 = r0.c(r10)
                float r10 = com.amazon.aps.iva.e1.c.d(r10)
                com.amazon.aps.iva.c2.y r11 = r0.a
                int r10 = r11.h(r10)
                int r10 = r11.f(r10, r2)
                int r10 = r1.a(r10)
                com.amazon.aps.iva.l1.a r11 = r6.i
                if (r11 == 0) goto L8d
                r11.a()
            L8d:
                com.amazon.aps.iva.i2.e0 r11 = r6.j()
                com.amazon.aps.iva.c2.b r11 = r11.a
                long r0 = com.amazon.aps.iva.ab.x.f(r10, r10)
                com.amazon.aps.iva.i2.e0 r10 = com.amazon.aps.iva.l0.c0.e(r11, r0)
                r6.h()
                com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> r11 = r6.c
                r11.invoke(r10)
                return
            La4:
                com.amazon.aps.iva.i2.e0 r0 = r6.j()
                com.amazon.aps.iva.c2.b r0 = r0.a
                java.lang.String r0 = r0.b
                int r0 = r0.length()
                if (r0 != 0) goto Lb3
                r2 = r1
            Lb3:
                if (r2 == 0) goto Lb6
                return
            Lb6:
                r6.h()
                com.amazon.aps.iva.j0.p2 r0 = r6.d
                if (r0 == 0) goto Lda
                com.amazon.aps.iva.j0.q2 r0 = r0.c()
                if (r0 == 0) goto Lda
                int r7 = r0.b(r10, r1)
                com.amazon.aps.iva.i2.e0 r1 = r6.j()
                r4 = 0
                com.amazon.aps.iva.l0.k$a$e r5 = com.amazon.aps.iva.l0.k.a.b
                r0 = r6
                r2 = r7
                r3 = r7
                com.amazon.aps.iva.l0.c0.c(r0, r1, r2, r3, r4, r5)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
                r6.m = r0
            Lda:
                r6.l = r10
                com.amazon.aps.iva.e1.c r0 = new com.amazon.aps.iva.e1.c
                r0.<init>(r10)
                com.amazon.aps.iva.o0.y1 r10 = r6.p
                r10.setValue(r0)
                long r10 = com.amazon.aps.iva.e1.c.b
                r6.n = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l0.c0.g.b(long):void");
        }

        @Override // com.amazon.aps.iva.j0.g1
        public final void d(long j) {
            boolean z;
            q2 c;
            int b;
            c0 c0Var = c0.this;
            if (c0Var.j().a.b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            c0Var.n = com.amazon.aps.iva.e1.c.f(c0Var.n, j);
            p2 p2Var = c0Var.d;
            if (p2Var != null && (c = p2Var.c()) != null) {
                com.amazon.aps.iva.e1.c cVar = new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.c.f(c0Var.l, c0Var.n));
                y1 y1Var = c0Var.p;
                y1Var.setValue(cVar);
                Integer num = c0Var.m;
                if (num != null) {
                    b = num.intValue();
                } else {
                    b = c.b(c0Var.l, false);
                }
                int i = b;
                com.amazon.aps.iva.e1.c cVar2 = (com.amazon.aps.iva.e1.c) y1Var.getValue();
                com.amazon.aps.iva.yb0.j.c(cVar2);
                c0.c(c0Var, c0Var.j(), i, c.b(cVar2.a, false), false, k.a.b);
            }
            p2 p2Var2 = c0Var.d;
            if (p2Var2 != null) {
                p2Var2.k = false;
            }
        }

        @Override // com.amazon.aps.iva.j0.g1
        public final void onStop() {
            m2 m2Var;
            c0 c0Var = c0.this;
            c0.b(c0Var, null);
            c0.a(c0Var, null);
            p2 p2Var = c0Var.d;
            if (p2Var != null) {
                p2Var.k = true;
            }
            k2 k2Var = c0Var.h;
            if (k2Var != null) {
                m2Var = k2Var.getStatus();
            } else {
                m2Var = null;
            }
            if (m2Var == m2.Hidden) {
                c0Var.n();
            }
            c0Var.m = null;
        }

        @Override // com.amazon.aps.iva.j0.g1
        public final void a() {
        }

        @Override // com.amazon.aps.iva.j0.g1
        public final void c() {
        }

        @Override // com.amazon.aps.iva.j0.g1
        public final void onCancel() {
        }
    }
}
