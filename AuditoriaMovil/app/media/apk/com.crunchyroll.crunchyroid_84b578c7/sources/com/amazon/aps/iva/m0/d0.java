package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: Colors.kt */
/* loaded from: classes.dex */
public final class d0 {
    public static final com.amazon.aps.iva.o0.q3 a = com.amazon.aps.iva.o0.l0.c(a.h);

    /* compiled from: Colors.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<c0> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final c0 invoke() {
            com.amazon.aps.iva.o0.q3 q3Var = d0.a;
            long e = defpackage.i.e(4284612846L);
            long e2 = defpackage.i.e(4281794739L);
            long e3 = defpackage.i.e(4278442694L);
            long e4 = defpackage.i.e(4278290310L);
            long j = com.amazon.aps.iva.f1.x.c;
            long e5 = defpackage.i.e(4289724448L);
            long j2 = com.amazon.aps.iva.f1.x.b;
            return new c0(e, e2, e3, e4, j, j, e5, j, j2, j2, j2, j, true);
        }
    }

    public static final long a(c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "$this$contentColorFor");
        if (com.amazon.aps.iva.f1.x.c(j, c0Var.f())) {
            return c0Var.c();
        }
        if (com.amazon.aps.iva.f1.x.c(j, ((com.amazon.aps.iva.f1.x) c0Var.b.getValue()).a)) {
            return c0Var.c();
        }
        if (com.amazon.aps.iva.f1.x.c(j, c0Var.g())) {
            return c0Var.d();
        }
        if (com.amazon.aps.iva.f1.x.c(j, ((com.amazon.aps.iva.f1.x) c0Var.d.getValue()).a)) {
            return c0Var.d();
        }
        if (com.amazon.aps.iva.f1.x.c(j, c0Var.a())) {
            return ((com.amazon.aps.iva.f1.x) c0Var.j.getValue()).a;
        }
        if (com.amazon.aps.iva.f1.x.c(j, c0Var.h())) {
            return c0Var.e();
        }
        if (com.amazon.aps.iva.f1.x.c(j, c0Var.b())) {
            return ((com.amazon.aps.iva.f1.x) c0Var.l.getValue()).a;
        }
        return com.amazon.aps.iva.f1.x.g;
    }

    public static final long b(long j, com.amazon.aps.iva.o0.i iVar) {
        boolean z;
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        long a2 = a((c0) iVar.i(a), j);
        if (a2 != com.amazon.aps.iva.f1.x.g) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return ((com.amazon.aps.iva.f1.x) iVar.i(f0.a)).a;
        }
        return a2;
    }
}
