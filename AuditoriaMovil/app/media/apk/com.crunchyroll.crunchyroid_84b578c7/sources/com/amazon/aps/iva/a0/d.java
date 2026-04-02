package com.amazon.aps.iva.a0;

import android.os.Build;
import com.amazon.aps.iva.a1.f;
/* compiled from: AndroidOverscroll.kt */
/* loaded from: classes.dex */
public final class d {
    public static final com.amazon.aps.iva.a1.f a;

    /* compiled from: AndroidOverscroll.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.s1.f0, com.amazon.aps.iva.s1.c0, com.amazon.aps.iva.o2.a, com.amazon.aps.iva.s1.e0> {
        public static final a h = new a();

        public a() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.s1.e0 invoke(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, com.amazon.aps.iva.o2.a aVar) {
            com.amazon.aps.iva.s1.f0 f0Var2 = f0Var;
            com.amazon.aps.iva.s1.c0 c0Var2 = c0Var;
            long j = aVar.a;
            com.amazon.aps.iva.yb0.j.f(f0Var2, "$this$layout");
            com.amazon.aps.iva.yb0.j.f(c0Var2, "measurable");
            com.amazon.aps.iva.s1.u0 V = c0Var2.V(j);
            int f0 = f0Var2.f0(x.a * 2);
            return f0Var2.F0(V.o0() - f0, V.k0() - f0, com.amazon.aps.iva.lb0.a0.b, new c(V, f0));
        }
    }

    /* compiled from: AndroidOverscroll.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.s1.f0, com.amazon.aps.iva.s1.c0, com.amazon.aps.iva.o2.a, com.amazon.aps.iva.s1.e0> {
        public static final b h = new b();

        public b() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.s1.e0 invoke(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, com.amazon.aps.iva.o2.a aVar) {
            com.amazon.aps.iva.s1.f0 f0Var2 = f0Var;
            com.amazon.aps.iva.s1.c0 c0Var2 = c0Var;
            long j = aVar.a;
            com.amazon.aps.iva.yb0.j.f(f0Var2, "$this$layout");
            com.amazon.aps.iva.yb0.j.f(c0Var2, "measurable");
            com.amazon.aps.iva.s1.u0 V = c0Var2.V(j);
            int f0 = f0Var2.f0(x.a * 2);
            return f0Var2.F0(V.b + f0, V.c + f0, com.amazon.aps.iva.lb0.a0.b, new e(V, f0));
        }
    }

    static {
        com.amazon.aps.iva.a1.f fVar;
        if (Build.VERSION.SDK_INT >= 31) {
            int i = com.amazon.aps.iva.a1.f.a;
            fVar = androidx.compose.ui.layout.b.a(androidx.compose.ui.layout.b.a(f.a.c, a.h), b.h);
        } else {
            int i2 = com.amazon.aps.iva.a1.f.a;
            fVar = f.a.c;
        }
        a = fVar;
    }
}
