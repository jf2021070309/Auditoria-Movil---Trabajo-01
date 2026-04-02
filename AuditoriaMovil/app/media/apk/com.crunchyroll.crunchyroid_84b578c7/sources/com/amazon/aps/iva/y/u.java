package com.amazon.aps.iva.y;

import com.amazon.aps.iva.s1.u0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AnimatedVisibility.kt */
/* loaded from: classes.dex */
public final class u implements com.amazon.aps.iva.s1.d0 {
    public final z a;

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<com.amazon.aps.iva.s1.u0> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.h = arrayList;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            List<com.amazon.aps.iva.s1.u0> list = this.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                u0.a.c(list.get(i), 0, 0, 0.0f);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public u(z zVar) {
        com.amazon.aps.iva.yb0.j.f(zVar, "scope");
        this.a = zVar;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int a(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        Integer num = (Integer) com.amazon.aps.iva.ne0.s.d0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(list), new w(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int b(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        Integer num = (Integer) com.amazon.aps.iva.ne0.s.d0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(list), new v(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int c(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        Integer num = (Integer) com.amazon.aps.iva.ne0.s.d0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(list), new s(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        Object obj;
        int i;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        List<? extends com.amazon.aps.iva.s1.c0> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (com.amazon.aps.iva.s1.c0 c0Var : list2) {
            arrayList.add(c0Var.V(j));
        }
        int i2 = 1;
        Object obj2 = null;
        int i3 = 0;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i4 = ((com.amazon.aps.iva.s1.u0) obj).b;
            int B = com.amazon.aps.iva.ee0.f1.B(arrayList);
            if (1 <= B) {
                int i5 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i5);
                    int i6 = ((com.amazon.aps.iva.s1.u0) obj3).b;
                    if (i4 < i6) {
                        obj = obj3;
                        i4 = i6;
                    }
                    if (i5 == B) {
                        break;
                    }
                    i5++;
                }
            }
        }
        com.amazon.aps.iva.s1.u0 u0Var = (com.amazon.aps.iva.s1.u0) obj;
        if (u0Var != null) {
            i = u0Var.b;
        } else {
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i7 = ((com.amazon.aps.iva.s1.u0) obj2).c;
            int B2 = com.amazon.aps.iva.ee0.f1.B(arrayList);
            if (1 <= B2) {
                while (true) {
                    Object obj4 = arrayList.get(i2);
                    int i8 = ((com.amazon.aps.iva.s1.u0) obj4).c;
                    if (i7 < i8) {
                        obj2 = obj4;
                        i7 = i8;
                    }
                    if (i2 == B2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        com.amazon.aps.iva.s1.u0 u0Var2 = (com.amazon.aps.iva.s1.u0) obj2;
        if (u0Var2 != null) {
            i3 = u0Var2.c;
        }
        this.a.a.setValue(new com.amazon.aps.iva.o2.j(com.amazon.aps.iva.o2.k.a(i, i3)));
        return f0Var.F0(i, i3, com.amazon.aps.iva.lb0.a0.b, new a(arrayList));
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int e(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        Integer num = (Integer) com.amazon.aps.iva.ne0.s.d0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(list), new t(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
