package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.s1.u0;
import java.util.List;
/* compiled from: BasicText.kt */
/* loaded from: classes.dex */
public final class f0 implements com.amazon.aps.iva.s1.d0 {
    public static final f0 a = new f0();
    public static final a b = a.h;

    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$null");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        return f0Var.F0(com.amazon.aps.iva.o2.a.h(j), com.amazon.aps.iva.o2.a.g(j), com.amazon.aps.iva.lb0.a0.b, b);
    }
}
