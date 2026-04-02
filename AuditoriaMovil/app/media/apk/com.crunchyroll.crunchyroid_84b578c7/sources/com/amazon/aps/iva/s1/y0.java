package com.amazon.aps.iva.s1;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.s1.u0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RootMeasurePolicy.kt */
/* loaded from: classes.dex */
public final class y0 extends e.AbstractC0017e {
    public static final y0 b = new y0();

    /* compiled from: RootMeasurePolicy.kt */
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

    /* compiled from: RootMeasurePolicy.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ u0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u0 u0Var) {
            super(1);
            this.h = u0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            u0.a.h(aVar2, this.h, 0, 0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<u0> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.h = arrayList;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            List<u0> list = this.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                u0.a.h(aVar2, list.get(i), 0, 0);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public y0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final e0 d(f0 f0Var, List<? extends c0> list, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        boolean isEmpty = list.isEmpty();
        com.amazon.aps.iva.lb0.a0 a0Var = com.amazon.aps.iva.lb0.a0.b;
        if (isEmpty) {
            return f0Var.F0(com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.i(j), a0Var, a.h);
        }
        if (list.size() == 1) {
            u0 V = list.get(0).V(j);
            return f0Var.F0(com.amazon.aps.iva.o2.b.f(V.b, j), com.amazon.aps.iva.o2.b.e(V.c, j), a0Var, new b(V));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).V(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            u0 u0Var = (u0) arrayList.get(i4);
            i2 = Math.max(u0Var.b, i2);
            i3 = Math.max(u0Var.c, i3);
        }
        return f0Var.F0(com.amazon.aps.iva.o2.b.f(i2, j), com.amazon.aps.iva.o2.b.e(i3, j), a0Var, new c(arrayList));
    }
}
