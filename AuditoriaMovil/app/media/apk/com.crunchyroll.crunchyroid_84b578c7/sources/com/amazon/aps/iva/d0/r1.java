package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.s1.u0;
import java.util.List;
/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class r1 implements com.amazon.aps.iva.s1.d0 {
    public final /* synthetic */ d1 a;
    public final /* synthetic */ com.amazon.aps.iva.xb0.s<Integer, int[], com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.c, int[], com.amazon.aps.iva.kb0.q> b;
    public final /* synthetic */ float c;
    public final /* synthetic */ z1 d;
    public final /* synthetic */ q e;

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ t1 h;
        public final /* synthetic */ s1 i;
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t1 t1Var, s1 s1Var, com.amazon.aps.iva.s1.f0 f0Var) {
            super(1);
            this.h = t1Var;
            this.i = s1Var;
            this.j = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            com.amazon.aps.iva.o2.l layoutDirection = this.j.getLayoutDirection();
            this.h.d(aVar2, this.i, 0, layoutDirection);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r1(d1 d1Var, com.amazon.aps.iva.xb0.s<? super Integer, ? super int[], ? super com.amazon.aps.iva.o2.l, ? super com.amazon.aps.iva.o2.c, ? super int[], com.amazon.aps.iva.kb0.q> sVar, float f, z1 z1Var, q qVar) {
        this.a = d1Var;
        this.b = sVar;
        this.c = f;
        this.d = z1Var;
        this.e = qVar;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int a(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.xb0.q qVar;
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        if (this.a == d1.Horizontal) {
            qVar = m0.a;
        } else {
            qVar = m0.b;
        }
        return ((Number) qVar.invoke(list, Integer.valueOf(i), Integer.valueOf(oVar.f0(this.c)))).intValue();
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int b(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.xb0.q qVar;
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        if (this.a == d1.Horizontal) {
            qVar = m0.c;
        } else {
            qVar = m0.d;
        }
        return ((Number) qVar.invoke(list, Integer.valueOf(i), Integer.valueOf(oVar.f0(this.c)))).intValue();
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int c(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.xb0.q qVar;
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        if (this.a == d1.Horizontal) {
            qVar = m0.g;
        } else {
            qVar = m0.h;
        }
        return ((Number) qVar.invoke(list, Integer.valueOf(i), Integer.valueOf(oVar.f0(this.c)))).intValue();
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        t1 t1Var = new t1(this.a, this.b, this.c, this.d, this.e, list, new com.amazon.aps.iva.s1.u0[list.size()]);
        s1 c = t1Var.c(f0Var, j, 0, list.size());
        d1 d1Var = d1.Horizontal;
        d1 d1Var2 = this.a;
        int i = c.b;
        int i2 = c.a;
        if (d1Var2 != d1Var) {
            i2 = i;
            i = i2;
        }
        return f0Var.F0(i, i2, com.amazon.aps.iva.lb0.a0.b, new a(t1Var, c, f0Var));
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int e(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.xb0.q qVar;
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        if (this.a == d1.Horizontal) {
            qVar = m0.e;
        } else {
            qVar = m0.f;
        }
        return ((Number) qVar.invoke(list, Integer.valueOf(i), Integer.valueOf(oVar.f0(this.c)))).intValue();
    }
}
