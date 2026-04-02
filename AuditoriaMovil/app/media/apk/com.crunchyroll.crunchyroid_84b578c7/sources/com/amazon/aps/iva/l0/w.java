package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.s1.u0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SimpleLayout.kt */
/* loaded from: classes.dex */
public final class w implements com.amazon.aps.iva.s1.d0 {
    public static final w a = new w();

    /* compiled from: SimpleLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<u0> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.h = arrayList;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            List<u0> list = this.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                u0.a.c(list.get(i), 0, 0, 0.0f);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$Layout");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).V(j));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i2 = 0; i2 < size2; i2++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((u0) arrayList.get(i2)).b));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((u0) arrayList.get(i3)).c));
        }
        return f0Var.F0(intValue, num.intValue(), com.amazon.aps.iva.lb0.a0.b, new a(arrayList));
    }
}
