package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.o2.a;
import com.amazon.aps.iva.s1.u0;
import java.util.List;
/* compiled from: Box.kt */
/* loaded from: classes.dex */
public final class g implements com.amazon.aps.iva.s1.d0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ com.amazon.aps.iva.a1.a b;

    /* compiled from: Box.kt */
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

    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;
        public final /* synthetic */ com.amazon.aps.iva.s1.c0 i;
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;
        public final /* synthetic */ com.amazon.aps.iva.a1.a m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.s1.u0 u0Var, com.amazon.aps.iva.s1.c0 c0Var, com.amazon.aps.iva.s1.f0 f0Var, int i, int i2, com.amazon.aps.iva.a1.a aVar) {
            super(1);
            this.h = u0Var;
            this.i = c0Var;
            this.j = f0Var;
            this.k = i;
            this.l = i2;
            this.m = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            f.b(aVar2, this.h, this.i, this.j.getLayoutDirection(), this.k, this.l, this.m);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0[] h;
        public final /* synthetic */ List<com.amazon.aps.iva.s1.c0> i;
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 j;
        public final /* synthetic */ com.amazon.aps.iva.yb0.b0 k;
        public final /* synthetic */ com.amazon.aps.iva.yb0.b0 l;
        public final /* synthetic */ com.amazon.aps.iva.a1.a m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.s1.u0[] u0VarArr, List<? extends com.amazon.aps.iva.s1.c0> list, com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.yb0.b0 b0Var, com.amazon.aps.iva.yb0.b0 b0Var2, com.amazon.aps.iva.a1.a aVar) {
            super(1);
            this.h = u0VarArr;
            this.i = list;
            this.j = f0Var;
            this.k = b0Var;
            this.l = b0Var2;
            this.m = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            com.amazon.aps.iva.a1.a aVar3 = this.m;
            com.amazon.aps.iva.s1.u0[] u0VarArr = this.h;
            int length = u0VarArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                com.amazon.aps.iva.s1.u0 u0Var = u0VarArr[i2];
                com.amazon.aps.iva.yb0.j.d(u0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                f.b(aVar2, u0Var, this.i.get(i), this.j.getLayoutDirection(), this.k.b, this.l.b, aVar3);
                i2++;
                i++;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public g(com.amazon.aps.iva.a1.a aVar, boolean z) {
        this.a = z;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        long a2;
        int i;
        int i2;
        e eVar;
        boolean z;
        e eVar2;
        boolean z2;
        e eVar3;
        int j2;
        int i3;
        com.amazon.aps.iva.s1.u0 V;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$MeasurePolicy");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        boolean isEmpty = list.isEmpty();
        com.amazon.aps.iva.lb0.a0 a0Var = com.amazon.aps.iva.lb0.a0.b;
        if (isEmpty) {
            return f0Var.F0(com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.i(j), a0Var, a.h);
        }
        if (this.a) {
            a2 = j;
        } else {
            a2 = com.amazon.aps.iva.o2.a.a(j, 0, 0, 0, 0, 10);
        }
        boolean z3 = false;
        if (list.size() == 1) {
            com.amazon.aps.iva.s1.c0 c0Var = list.get(0);
            Object b2 = c0Var.b();
            if (b2 instanceof e) {
                eVar3 = (e) b2;
            } else {
                eVar3 = null;
            }
            if (eVar3 != null) {
                z3 = eVar3.p;
            }
            if (!z3) {
                V = c0Var.V(a2);
                j2 = Math.max(com.amazon.aps.iva.o2.a.j(j), V.b);
                i3 = Math.max(com.amazon.aps.iva.o2.a.i(j), V.c);
            } else {
                j2 = com.amazon.aps.iva.o2.a.j(j);
                i3 = com.amazon.aps.iva.o2.a.i(j);
                V = c0Var.V(a.C0554a.c(com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.i(j)));
            }
            int i4 = j2;
            int i5 = i3;
            return f0Var.F0(i4, i5, a0Var, new b(V, c0Var, f0Var, i4, i5, this.b));
        }
        com.amazon.aps.iva.s1.u0[] u0VarArr = new com.amazon.aps.iva.s1.u0[list.size()];
        com.amazon.aps.iva.yb0.b0 b0Var = new com.amazon.aps.iva.yb0.b0();
        b0Var.b = com.amazon.aps.iva.o2.a.j(j);
        com.amazon.aps.iva.yb0.b0 b0Var2 = new com.amazon.aps.iva.yb0.b0();
        b0Var2.b = com.amazon.aps.iva.o2.a.i(j);
        int size = list.size();
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            com.amazon.aps.iva.s1.c0 c0Var2 = list.get(i6);
            Object b3 = c0Var2.b();
            if (b3 instanceof e) {
                eVar2 = (e) b3;
            } else {
                eVar2 = null;
            }
            if (eVar2 != null) {
                z2 = eVar2.p;
            } else {
                z2 = false;
            }
            if (!z2) {
                com.amazon.aps.iva.s1.u0 V2 = c0Var2.V(a2);
                u0VarArr[i6] = V2;
                b0Var.b = Math.max(b0Var.b, V2.b);
                b0Var2.b = Math.max(b0Var2.b, V2.c);
            } else {
                z4 = true;
            }
        }
        if (z4) {
            int i7 = b0Var.b;
            if (i7 != Integer.MAX_VALUE) {
                i = i7;
            } else {
                i = 0;
            }
            int i8 = b0Var2.b;
            if (i8 != Integer.MAX_VALUE) {
                i2 = i8;
            } else {
                i2 = 0;
            }
            long a3 = com.amazon.aps.iva.o2.b.a(i, i7, i2, i8);
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                com.amazon.aps.iva.s1.c0 c0Var3 = list.get(i9);
                Object b4 = c0Var3.b();
                if (b4 instanceof e) {
                    eVar = (e) b4;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    z = eVar.p;
                } else {
                    z = false;
                }
                if (z) {
                    u0VarArr[i9] = c0Var3.V(a3);
                }
            }
        }
        return f0Var.F0(b0Var.b, b0Var2.b, a0Var, new c(u0VarArr, list, f0Var, b0Var, b0Var2, this.b));
    }
}
