package com.amazon.aps.iva.q2;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.f0;
import com.amazon.aps.iva.s1.u0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes.dex */
public final class e implements d0 {
    public static final e a = new e();

    /* compiled from: AndroidDialog.android.kt */
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
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            List<u0> list = this.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                u0.a.g(aVar2, list.get(i), 0, 0);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // com.amazon.aps.iva.s1.d0
    public final e0 d(f0 f0Var, List<? extends c0> list, long j) {
        Object obj;
        int j2;
        int i;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$Layout");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list.get(i2).V(j));
        }
        int i3 = 1;
        u0 u0Var = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i4 = ((u0) obj).b;
            int B = f1.B(arrayList);
            if (1 <= B) {
                int i5 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i5);
                    int i6 = ((u0) obj2).b;
                    if (i4 < i6) {
                        obj = obj2;
                        i4 = i6;
                    }
                    if (i5 == B) {
                        break;
                    }
                    i5++;
                }
            }
        }
        u0 u0Var2 = (u0) obj;
        if (u0Var2 != null) {
            j2 = u0Var2.b;
        } else {
            j2 = com.amazon.aps.iva.o2.a.j(j);
        }
        if (!arrayList.isEmpty()) {
            Object obj3 = arrayList.get(0);
            int i7 = ((u0) obj3).c;
            int B2 = f1.B(arrayList);
            Object obj4 = obj3;
            if (1 <= B2) {
                while (true) {
                    Object obj5 = arrayList.get(i3);
                    int i8 = ((u0) obj5).c;
                    obj3 = obj4;
                    if (i7 < i8) {
                        obj3 = obj5;
                        i7 = i8;
                    }
                    if (i3 == B2) {
                        break;
                    }
                    i3++;
                    obj4 = obj3;
                }
            }
            u0Var = obj3;
        }
        u0 u0Var3 = u0Var;
        if (u0Var3 != null) {
            i = u0Var3.c;
        } else {
            i = com.amazon.aps.iva.o2.a.i(j);
        }
        return f0Var.F0(j2, i, com.amazon.aps.iva.lb0.a0.b, new a(arrayList));
    }
}
