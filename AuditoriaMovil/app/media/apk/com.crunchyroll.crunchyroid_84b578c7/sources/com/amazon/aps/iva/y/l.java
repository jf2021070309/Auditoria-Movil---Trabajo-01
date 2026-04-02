package com.amazon.aps.iva.y;

import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.y.r;
import java.util.List;
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class l implements com.amazon.aps.iva.s1.d0 {
    public final r<?> a;

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0[] h;
        public final /* synthetic */ l i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.u0[] u0VarArr, l lVar, int i, int i2) {
            super(1);
            this.h = u0VarArr;
            this.i = lVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.s1.u0[] u0VarArr;
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            for (com.amazon.aps.iva.s1.u0 u0Var : this.h) {
                if (u0Var != null) {
                    long a = this.i.a.b.a(com.amazon.aps.iva.o2.k.a(u0Var.b, u0Var.c), com.amazon.aps.iva.o2.k.a(this.j, this.k), com.amazon.aps.iva.o2.l.Ltr);
                    u0.a.c(u0Var, (int) (a >> 32), com.amazon.aps.iva.o2.h.b(a), 0.0f);
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public l(r<?> rVar) {
        this.a = rVar;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int a(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        Integer num = (Integer) com.amazon.aps.iva.ne0.s.d0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(list), new n(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int b(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        Integer num = (Integer) com.amazon.aps.iva.ne0.s.d0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(list), new m(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int c(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        Integer num = (Integer) com.amazon.aps.iva.ne0.s.d0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(list), new j(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        com.amazon.aps.iva.s1.u0 u0Var;
        Object[] objArr;
        com.amazon.aps.iva.s1.u0 u0Var2;
        int i;
        int i2;
        int i3;
        Object[] objArr2;
        int i4;
        int i5;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        int size = list.size();
        com.amazon.aps.iva.s1.u0[] u0VarArr = new com.amazon.aps.iva.s1.u0[size];
        int size2 = list.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            boolean z = true;
            u0Var = null;
            r.a aVar = null;
            if (i7 >= size2) {
                break;
            }
            com.amazon.aps.iva.s1.c0 c0Var = list.get(i7);
            Object b = c0Var.b();
            if (b instanceof r.a) {
                aVar = (r.a) b;
            }
            if ((aVar == null || !aVar.c) ? false : false) {
                u0VarArr[i7] = c0Var.V(j);
            }
            i7++;
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            com.amazon.aps.iva.s1.c0 c0Var2 = list.get(i8);
            if (u0VarArr[i8] == null) {
                u0VarArr[i8] = c0Var2.V(j);
            }
        }
        if (size == 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (objArr != null) {
            u0Var2 = null;
        } else {
            u0Var2 = u0VarArr[0];
            int i9 = size - 1;
            if (i9 != 0) {
                if (u0Var2 != null) {
                    i = u0Var2.b;
                } else {
                    i = 0;
                }
                com.amazon.aps.iva.ec0.i it = new com.amazon.aps.iva.ec0.j(1, i9).iterator();
                while (it.d) {
                    com.amazon.aps.iva.s1.u0 u0Var3 = u0VarArr[it.b()];
                    if (u0Var3 != null) {
                        i2 = u0Var3.b;
                    } else {
                        i2 = 0;
                    }
                    if (i < i2) {
                        u0Var2 = u0Var3;
                        i = i2;
                    }
                }
            }
        }
        if (u0Var2 != null) {
            i3 = u0Var2.b;
        } else {
            i3 = 0;
        }
        if (size == 0) {
            objArr2 = 1;
        } else {
            objArr2 = null;
        }
        if (objArr2 == null) {
            u0Var = u0VarArr[0];
            int i10 = size - 1;
            if (i10 != 0) {
                if (u0Var != null) {
                    i4 = u0Var.c;
                } else {
                    i4 = 0;
                }
                com.amazon.aps.iva.ec0.i it2 = new com.amazon.aps.iva.ec0.j(1, i10).iterator();
                while (it2.d) {
                    com.amazon.aps.iva.s1.u0 u0Var4 = u0VarArr[it2.b()];
                    if (u0Var4 != null) {
                        i5 = u0Var4.c;
                    } else {
                        i5 = 0;
                    }
                    if (i4 < i5) {
                        u0Var = u0Var4;
                        i4 = i5;
                    }
                }
            }
        }
        if (u0Var != null) {
            i6 = u0Var.c;
        }
        this.a.c.setValue(new com.amazon.aps.iva.o2.j(com.amazon.aps.iva.o2.k.a(i3, i6)));
        return f0Var.F0(i3, i6, com.amazon.aps.iva.lb0.a0.b, new a(u0VarArr, this, i3, i6));
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int e(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        Integer num = (Integer) com.amazon.aps.iva.ne0.s.d0(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(list), new k(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
