package com.amazon.aps.iva.q2;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.f0;
import com.amazon.aps.iva.s1.u0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class m implements d0 {
    public static final m a = new m();

    /* compiled from: AndroidPopup.android.kt */
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

    /* compiled from: AndroidPopup.android.kt */
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
            u0.a.g(aVar2, this.h, 0, 0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
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
            int B = f1.B(list);
            if (B >= 0) {
                int i = 0;
                while (true) {
                    u0.a.g(aVar2, list.get(i), 0, 0);
                    if (i == B) {
                        break;
                    }
                    i++;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final e0 d(f0 f0Var, List<? extends c0> list, long j) {
        int i;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$Layout");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        int size = list.size();
        com.amazon.aps.iva.lb0.a0 a0Var = com.amazon.aps.iva.lb0.a0.b;
        int i2 = 0;
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList.add(list.get(i3).V(j));
                }
                int B = f1.B(arrayList);
                if (B >= 0) {
                    int i4 = 0;
                    i = 0;
                    while (true) {
                        u0 u0Var = (u0) arrayList.get(i2);
                        i4 = Math.max(i4, u0Var.b);
                        i = Math.max(i, u0Var.c);
                        if (i2 == B) {
                            break;
                        }
                        i2++;
                    }
                    i2 = i4;
                } else {
                    i = 0;
                }
                return f0Var.F0(i2, i, a0Var, new c(arrayList));
            }
            u0 V = list.get(0).V(j);
            return f0Var.F0(V.b, V.c, a0Var, new b(V));
        }
        return f0Var.F0(0, 0, a0Var, a.h);
    }
}
