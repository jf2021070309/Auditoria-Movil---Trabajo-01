package com.amazon.aps.iva.h1;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.f1.i0;
import com.amazon.aps.iva.f1.k;
import com.amazon.aps.iva.f1.l0;
import com.amazon.aps.iva.f1.m;
import com.amazon.aps.iva.f1.m0;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.o2.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CanvasDrawScope.kt */
/* loaded from: classes.dex */
public final class a implements e {
    public final C0315a b = new C0315a();
    public final b c = new b();
    public k d;
    public k e;

    /* compiled from: CanvasDrawScope.kt */
    /* renamed from: com.amazon.aps.iva.h1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0315a {
        public com.amazon.aps.iva.o2.c a;
        public l b;
        public u c;
        public long d;

        public C0315a() {
            com.amazon.aps.iva.o2.d dVar = r.c;
            l lVar = l.Ltr;
            g gVar = new g();
            long j = com.amazon.aps.iva.e1.g.b;
            j.f(lVar, "layoutDirection");
            this.a = dVar;
            this.b = lVar;
            this.c = gVar;
            this.d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0315a)) {
                return false;
            }
            C0315a c0315a = (C0315a) obj;
            if (j.a(this.a, c0315a.a) && this.b == c0315a.b && j.a(this.c, c0315a.c) && com.amazon.aps.iva.e1.g.a(this.d, c0315a.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            long j = this.d;
            int i = com.amazon.aps.iva.e1.g.d;
            return Long.hashCode(j) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) com.amazon.aps.iva.e1.g.f(this.d)) + ')';
        }
    }

    /* compiled from: CanvasDrawScope.kt */
    /* loaded from: classes.dex */
    public static final class b implements d {
        public final com.amazon.aps.iva.h1.b a = new com.amazon.aps.iva.h1.b(this);

        public b() {
        }

        @Override // com.amazon.aps.iva.h1.d
        public final u a() {
            return a.this.b.c;
        }

        @Override // com.amazon.aps.iva.h1.d
        public final void b(long j) {
            a.this.b.d = j;
        }

        @Override // com.amazon.aps.iva.h1.d
        public final long h() {
            return a.this.b.d;
        }
    }

    public static l0 b(a aVar, long j, f fVar, float f, y yVar, int i) {
        boolean z;
        l0 i2 = aVar.i(fVar);
        long e = e(j, f);
        k kVar = (k) i2;
        if (!x.c(kVar.b(), e)) {
            kVar.f(e);
        }
        if (kVar.c != null) {
            kVar.j(null);
        }
        if (!j.a(kVar.d, yVar)) {
            kVar.l(yVar);
        }
        boolean z2 = false;
        if (kVar.b == i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            kVar.c(i);
        }
        if (kVar.m() == 1) {
            z2 = true;
        }
        if (!z2) {
            kVar.e(1);
        }
        return i2;
    }

    public static long e(long j, float f) {
        boolean z;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return x.b(j, x.d(j) * f);
        }
        return j;
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void A0(s sVar, long j, long j2, float f, int i, com.amazon.aps.iva.cq.b bVar, float f2, y yVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        j.f(sVar, "brush");
        u uVar = this.b.c;
        l0 f3 = f();
        sVar.a(f2, h(), f3);
        k kVar = (k) f3;
        if (!j.a(kVar.d, yVar)) {
            kVar.l(yVar);
        }
        boolean z6 = false;
        if (kVar.b == i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            kVar.c(i2);
        }
        if (kVar.q() == f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            kVar.v(f);
        }
        if (kVar.p() == 4.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            kVar.u(4.0f);
        }
        if (kVar.n() == i) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            kVar.s(i);
        }
        if (kVar.o() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            kVar.t(0);
        }
        kVar.getClass();
        if (!j.a(null, bVar)) {
            kVar.r(bVar);
        }
        if (kVar.m() == 1) {
            z6 = true;
        }
        if (!z6) {
            kVar.e(1);
        }
        uVar.a(j, j2, f3);
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void B(s sVar, long j, long j2, float f, f fVar, y yVar, int i) {
        j.f(sVar, "brush");
        j.f(fVar, "style");
        this.b.c.v(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j), com.amazon.aps.iva.e1.g.d(j2) + com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.g.b(j2) + com.amazon.aps.iva.e1.c.d(j), c(sVar, fVar, f, yVar, i, 1));
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void B0(long j, float f, float f2, long j2, long j3, float f3, f fVar, y yVar, int i) {
        j.f(fVar, "style");
        this.b.c.p(com.amazon.aps.iva.e1.c.c(j2), com.amazon.aps.iva.e1.c.d(j2), com.amazon.aps.iva.e1.g.d(j3) + com.amazon.aps.iva.e1.c.c(j2), com.amazon.aps.iva.e1.g.b(j3) + com.amazon.aps.iva.e1.c.d(j2), f, f2, b(this, j, fVar, f3, yVar, i));
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void E0(s sVar, long j, long j2, long j3, float f, f fVar, y yVar, int i) {
        j.f(sVar, "brush");
        j.f(fVar, "style");
        this.b.c.t(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j), com.amazon.aps.iva.e1.c.c(j) + com.amazon.aps.iva.e1.g.d(j2), com.amazon.aps.iva.e1.c.d(j) + com.amazon.aps.iva.e1.g.b(j2), com.amazon.aps.iva.e1.a.b(j3), com.amazon.aps.iva.e1.a.c(j3), c(sVar, fVar, f, yVar, i, 1));
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void F(m0 m0Var, s sVar, float f, f fVar, y yVar, int i) {
        j.f(m0Var, "path");
        j.f(sVar, "brush");
        j.f(fVar, "style");
        this.b.c.m(m0Var, c(sVar, fVar, f, yVar, i, 1));
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float O0() {
        return this.b.a.O0();
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void Q(long j, long j2, long j3, long j4, f fVar, float f, y yVar, int i) {
        this.b.c.t(com.amazon.aps.iva.e1.c.c(j2), com.amazon.aps.iva.e1.c.d(j2), com.amazon.aps.iva.e1.g.d(j3) + com.amazon.aps.iva.e1.c.c(j2), com.amazon.aps.iva.e1.g.b(j3) + com.amazon.aps.iva.e1.c.d(j2), com.amazon.aps.iva.e1.a.b(j4), com.amazon.aps.iva.e1.a.c(j4), b(this, j, fVar, f, yVar, i));
    }

    @Override // com.amazon.aps.iva.h1.e
    public final b R0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void T(i0 i0Var, long j, float f, f fVar, y yVar, int i) {
        j.f(i0Var, "image");
        j.f(fVar, "style");
        this.b.c.k(i0Var, j, c(null, fVar, f, yVar, i, 1));
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void U0(long j, float f, long j2, float f2, f fVar, y yVar, int i) {
        j.f(fVar, "style");
        this.b.c.u(f, j2, b(this, j, fVar, f2, yVar, i));
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void X0(long j, long j2, long j3, float f, f fVar, y yVar, int i) {
        j.f(fVar, "style");
        this.b.c.v(com.amazon.aps.iva.e1.c.c(j2), com.amazon.aps.iva.e1.c.d(j2), com.amazon.aps.iva.e1.g.d(j3) + com.amazon.aps.iva.e1.c.c(j2), com.amazon.aps.iva.e1.g.b(j3) + com.amazon.aps.iva.e1.c.d(j2), b(this, j, fVar, f, yVar, i));
    }

    public final l0 c(s sVar, f fVar, float f, y yVar, int i, int i2) {
        boolean z;
        boolean z2;
        l0 i3 = i(fVar);
        boolean z3 = true;
        if (sVar != null) {
            sVar.a(f, h(), i3);
        } else {
            if (i3.a() == f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i3.g(f);
            }
        }
        if (!j.a(i3.d(), yVar)) {
            i3.l(yVar);
        }
        if (i3.h() == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i3.c(i);
        }
        if (i3.m() != i2) {
            z3 = false;
        }
        if (!z3) {
            i3.e(i2);
        }
        return i3;
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void c0(long j, long j2, long j3, float f, int i, com.amazon.aps.iva.cq.b bVar, float f2, y yVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        u uVar = this.b.c;
        l0 f3 = f();
        long e = e(j, f2);
        k kVar = (k) f3;
        if (!x.c(kVar.b(), e)) {
            kVar.f(e);
        }
        if (kVar.c != null) {
            kVar.j(null);
        }
        if (!j.a(kVar.d, yVar)) {
            kVar.l(yVar);
        }
        boolean z6 = false;
        if (kVar.b == i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            kVar.c(i2);
        }
        if (kVar.q() == f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            kVar.v(f);
        }
        if (kVar.p() == 4.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            kVar.u(4.0f);
        }
        if (kVar.n() == i) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            kVar.s(i);
        }
        if (kVar.o() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            kVar.t(0);
        }
        kVar.getClass();
        if (!j.a(null, bVar)) {
            kVar.r(bVar);
        }
        if (kVar.m() == 1) {
            z6 = true;
        }
        if (!z6) {
            kVar.e(1);
        }
        uVar.a(j2, j3, f3);
    }

    public final l0 f() {
        k kVar = this.e;
        if (kVar == null) {
            k a = com.amazon.aps.iva.f1.l.a();
            a.w(1);
            this.e = a;
            return a;
        }
        return kVar;
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float getDensity() {
        return this.b.a.getDensity();
    }

    @Override // com.amazon.aps.iva.h1.e
    public final l getLayoutDirection() {
        return this.b.b;
    }

    public final l0 i(f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (j.a(fVar, h.a)) {
            k kVar = this.d;
            if (kVar == null) {
                k a = com.amazon.aps.iva.f1.l.a();
                a.w(0);
                this.d = a;
                return a;
            }
            return kVar;
        } else if (fVar instanceof i) {
            l0 f = f();
            k kVar2 = (k) f;
            float q = kVar2.q();
            i iVar = (i) fVar;
            float f2 = iVar.a;
            if (q == f2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                kVar2.v(f2);
            }
            int n = kVar2.n();
            int i = iVar.c;
            if (n == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                kVar2.s(i);
            }
            float p = kVar2.p();
            float f3 = iVar.b;
            if (p == f3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                kVar2.u(f3);
            }
            int o = kVar2.o();
            int i2 = iVar.d;
            if (o == i2) {
                z4 = true;
            }
            if (!z4) {
                kVar2.t(i2);
            }
            kVar2.getClass();
            iVar.getClass();
            if (!j.a(null, null)) {
                kVar2.r(null);
            }
            return f;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void j0(m mVar, long j, float f, f fVar, y yVar, int i) {
        j.f(mVar, "path");
        j.f(fVar, "style");
        this.b.c.m(mVar, b(this, j, fVar, f, yVar, i));
    }

    @Override // com.amazon.aps.iva.h1.e
    public final void n0(i0 i0Var, long j, long j2, long j3, long j4, float f, f fVar, y yVar, int i, int i2) {
        j.f(i0Var, "image");
        j.f(fVar, "style");
        this.b.c.b(i0Var, j, j2, j3, j4, c(null, fVar, f, yVar, i, i2));
    }
}
