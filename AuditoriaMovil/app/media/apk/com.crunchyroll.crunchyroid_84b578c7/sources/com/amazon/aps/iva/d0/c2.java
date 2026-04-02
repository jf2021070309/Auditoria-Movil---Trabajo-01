package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.s1.u0;
import java.util.List;
/* compiled from: Spacer.kt */
/* loaded from: classes.dex */
public final class c2 implements com.amazon.aps.iva.s1.d0 {
    public static final c2 a = new c2();

    /* compiled from: Spacer.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        int i;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        int i2 = 0;
        if (com.amazon.aps.iva.o2.a.f(j)) {
            i = com.amazon.aps.iva.o2.a.h(j);
        } else {
            i = 0;
        }
        if (com.amazon.aps.iva.o2.a.e(j)) {
            i2 = com.amazon.aps.iva.o2.a.g(j);
        }
        return f0Var.F0(i, i2, com.amazon.aps.iva.lb0.a0.b, a.h);
    }
}
