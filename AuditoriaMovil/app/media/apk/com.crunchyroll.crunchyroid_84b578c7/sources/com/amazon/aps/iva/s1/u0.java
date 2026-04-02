package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.s1.v0;
/* compiled from: Placeable.kt */
/* loaded from: classes.dex */
public abstract class u0 implements g0 {
    public int b;
    public int c;
    public long d = com.amazon.aps.iva.o2.k.a(0, 0);
    public long e = v0.b;
    public long f;

    /* compiled from: Placeable.kt */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static final C0692a a = new C0692a(0);
        public static com.amazon.aps.iva.o2.l b = com.amazon.aps.iva.o2.l.Ltr;
        public static int c;
        public static q d;

        /* compiled from: Placeable.kt */
        /* renamed from: com.amazon.aps.iva.s1.u0$a$a */
        /* loaded from: classes.dex */
        public static final class C0692a extends a {
            public C0692a(int i) {
            }

            public static final boolean l(C0692a c0692a, com.amazon.aps.iva.u1.e0 e0Var) {
                c0692a.getClass();
                boolean z = false;
                if (e0Var == null) {
                    a.d = null;
                    return false;
                }
                boolean z2 = e0Var.h;
                com.amazon.aps.iva.u1.e0 Q0 = e0Var.Q0();
                if (Q0 != null && Q0.h) {
                    z = true;
                }
                if (z) {
                    e0Var.h = true;
                }
                androidx.compose.ui.node.f fVar = e0Var.H0().A;
                if (!e0Var.h && !e0Var.g) {
                    a.d = e0Var.D0();
                } else {
                    a.d = null;
                }
                return z2;
            }

            @Override // com.amazon.aps.iva.s1.u0.a
            public final com.amazon.aps.iva.o2.l a() {
                return a.b;
            }

            @Override // com.amazon.aps.iva.s1.u0.a
            public final int b() {
                return a.c;
            }
        }

        public static void c(u0 u0Var, int i, int i2, float f) {
            com.amazon.aps.iva.yb0.j.f(u0Var, "<this>");
            long e = com.amazon.aps.iva.e.w.e(i, i2);
            long j = u0Var.f;
            u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (e >> 32)) + ((int) (j >> 32)), com.amazon.aps.iva.o2.h.b(j) + com.amazon.aps.iva.o2.h.b(e)), f, null);
        }

        public static /* synthetic */ void d(a aVar, u0 u0Var, int i, int i2) {
            aVar.getClass();
            c(u0Var, i, i2, 0.0f);
        }

        public static void e(u0 u0Var, long j, float f) {
            com.amazon.aps.iva.yb0.j.f(u0Var, "$this$place");
            long j2 = u0Var.f;
            u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (j >> 32)) + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + com.amazon.aps.iva.o2.h.b(j)), f, null);
        }

        public static /* synthetic */ void f(a aVar, u0 u0Var, long j) {
            aVar.getClass();
            e(u0Var, j, 0.0f);
        }

        public static void g(a aVar, u0 u0Var, int i, int i2) {
            aVar.getClass();
            com.amazon.aps.iva.yb0.j.f(u0Var, "<this>");
            long e = com.amazon.aps.iva.e.w.e(i, i2);
            if (aVar.a() != com.amazon.aps.iva.o2.l.Ltr && aVar.b() != 0) {
                long e2 = com.amazon.aps.iva.e.w.e((aVar.b() - u0Var.b) - ((int) (e >> 32)), com.amazon.aps.iva.o2.h.b(e));
                long j = u0Var.f;
                u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (e2 >> 32)) + ((int) (j >> 32)), com.amazon.aps.iva.o2.h.b(j) + com.amazon.aps.iva.o2.h.b(e2)), 0.0f, null);
                return;
            }
            long j2 = u0Var.f;
            u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (e >> 32)) + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + com.amazon.aps.iva.o2.h.b(e)), 0.0f, null);
        }

        public static void h(a aVar, u0 u0Var, int i, int i2) {
            v0.a aVar2 = v0.a;
            aVar.getClass();
            com.amazon.aps.iva.yb0.j.f(u0Var, "<this>");
            com.amazon.aps.iva.yb0.j.f(aVar2, "layerBlock");
            long e = com.amazon.aps.iva.e.w.e(i, i2);
            if (aVar.a() != com.amazon.aps.iva.o2.l.Ltr && aVar.b() != 0) {
                long e2 = com.amazon.aps.iva.e.w.e((aVar.b() - u0Var.b) - ((int) (e >> 32)), com.amazon.aps.iva.o2.h.b(e));
                long j = u0Var.f;
                u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (e2 >> 32)) + ((int) (j >> 32)), com.amazon.aps.iva.o2.h.b(j) + com.amazon.aps.iva.o2.h.b(e2)), 0.0f, aVar2);
                return;
            }
            long j2 = u0Var.f;
            u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (e >> 32)) + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + com.amazon.aps.iva.o2.h.b(e)), 0.0f, aVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void i(a aVar, u0 u0Var, int i, int i2, com.amazon.aps.iva.xb0.l lVar, int i3) {
            if ((i3 & 8) != 0) {
                lVar = v0.a;
            }
            aVar.getClass();
            com.amazon.aps.iva.yb0.j.f(u0Var, "<this>");
            com.amazon.aps.iva.yb0.j.f(lVar, "layerBlock");
            long e = com.amazon.aps.iva.e.w.e(i, i2);
            long j = u0Var.f;
            u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (e >> 32)) + ((int) (j >> 32)), com.amazon.aps.iva.o2.h.b(j) + com.amazon.aps.iva.o2.h.b(e)), 0.0f, lVar);
        }

        public static void j(u0 u0Var, long j, float f, com.amazon.aps.iva.xb0.l lVar) {
            com.amazon.aps.iva.yb0.j.f(u0Var, "$this$placeWithLayer");
            com.amazon.aps.iva.yb0.j.f(lVar, "layerBlock");
            long j2 = u0Var.f;
            u0Var.r0(com.amazon.aps.iva.e.w.e(((int) (j >> 32)) + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + com.amazon.aps.iva.o2.h.b(j)), f, lVar);
        }

        public static /* synthetic */ void k(a aVar, u0 u0Var, long j) {
            v0.a aVar2 = v0.a;
            aVar.getClass();
            j(u0Var, j, 0.0f, aVar2);
        }

        public abstract com.amazon.aps.iva.o2.l a();

        public abstract int b();
    }

    public u0() {
        int i = com.amazon.aps.iva.o2.h.c;
        this.f = com.amazon.aps.iva.o2.h.b;
    }

    public int k0() {
        return com.amazon.aps.iva.o2.j.b(this.d);
    }

    public int o0() {
        return (int) (this.d >> 32);
    }

    public final void p0() {
        this.b = com.amazon.aps.iva.aq.j.j((int) (this.d >> 32), com.amazon.aps.iva.o2.a.j(this.e), com.amazon.aps.iva.o2.a.h(this.e));
        int j = com.amazon.aps.iva.aq.j.j(com.amazon.aps.iva.o2.j.b(this.d), com.amazon.aps.iva.o2.a.i(this.e), com.amazon.aps.iva.o2.a.g(this.e));
        this.c = j;
        int i = this.b;
        long j2 = this.d;
        this.f = com.amazon.aps.iva.e.w.e((i - ((int) (j2 >> 32))) / 2, (j - com.amazon.aps.iva.o2.j.b(j2)) / 2);
    }

    public abstract void r0(long j, float f, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.f1.g0, com.amazon.aps.iva.kb0.q> lVar);

    public final void s0(long j) {
        if (!com.amazon.aps.iva.o2.j.a(this.d, j)) {
            this.d = j;
            p0();
        }
    }

    public final void w0(long j) {
        if (!com.amazon.aps.iva.o2.a.b(this.e, j)) {
            this.e = j;
            p0();
        }
    }
}
