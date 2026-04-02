package com.amazon.aps.iva.s1;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.s1.x;
import java.util.List;
import java.util.Map;
/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class y extends e.AbstractC0017e {
    public final /* synthetic */ x b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<f1, com.amazon.aps.iva.o2.a, e0> c;

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class a implements e0 {
        public final /* synthetic */ e0 a;
        public final /* synthetic */ x b;
        public final /* synthetic */ int c;

        public a(e0 e0Var, x xVar, int i) {
            this.a = e0Var;
            this.b = xVar;
            this.c = i;
        }

        @Override // com.amazon.aps.iva.s1.e0
        public final Map<com.amazon.aps.iva.s1.a, Integer> c() {
            return this.a.c();
        }

        @Override // com.amazon.aps.iva.s1.e0
        public final void d() {
            x xVar = this.b;
            xVar.d = this.c;
            this.a.d();
            xVar.a(xVar.d);
        }

        @Override // com.amazon.aps.iva.s1.e0
        public final int getHeight() {
            return this.a.getHeight();
        }

        @Override // com.amazon.aps.iva.s1.e0
        public final int getWidth() {
            return this.a.getWidth();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(x xVar, com.amazon.aps.iva.xb0.p<? super f1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar, String str) {
        super(str);
        this.b = xVar;
        this.c = pVar;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final e0 d(f0 f0Var, List<? extends c0> list, long j) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        x xVar = this.b;
        x.c cVar = xVar.g;
        com.amazon.aps.iva.o2.l layoutDirection = f0Var.getLayoutDirection();
        cVar.getClass();
        com.amazon.aps.iva.yb0.j.f(layoutDirection, "<set-?>");
        cVar.b = layoutDirection;
        xVar.g.c = f0Var.getDensity();
        xVar.g.d = f0Var.O0();
        androidx.compose.ui.node.e eVar = xVar.a;
        e.d dVar = eVar.A.b;
        if ((dVar == e.d.Measuring || dVar == e.d.LayingOut) && eVar.d != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return xVar.i.invoke(xVar.h, new com.amazon.aps.iva.o2.a(j));
        }
        xVar.d = 0;
        xVar.h.getClass();
        e0 invoke = this.c.invoke(xVar.g, new com.amazon.aps.iva.o2.a(j));
        int i = xVar.d;
        x.a aVar = xVar.h;
        invoke.getWidth();
        invoke.getHeight();
        aVar.getClass();
        return new a(invoke, xVar, i);
    }
}
