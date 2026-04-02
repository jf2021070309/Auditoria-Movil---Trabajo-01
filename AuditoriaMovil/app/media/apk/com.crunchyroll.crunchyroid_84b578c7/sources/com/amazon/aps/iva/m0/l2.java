package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.s1.u0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: OutlinedTextField.kt */
/* loaded from: classes.dex */
public final class l2 implements com.amazon.aps.iva.s1.d0 {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.g, com.amazon.aps.iva.kb0.q> a;
    public final boolean b;
    public final float c;
    public final com.amazon.aps.iva.d0.o1 d;

    /* compiled from: OutlinedTextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int h;
        public final /* synthetic */ int i;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 j;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 k;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 l;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 m;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 n;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 o;
        public final /* synthetic */ l2 p;
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, com.amazon.aps.iva.s1.u0 u0Var, com.amazon.aps.iva.s1.u0 u0Var2, com.amazon.aps.iva.s1.u0 u0Var3, com.amazon.aps.iva.s1.u0 u0Var4, com.amazon.aps.iva.s1.u0 u0Var5, com.amazon.aps.iva.s1.u0 u0Var6, l2 l2Var, com.amazon.aps.iva.s1.f0 f0Var) {
            super(1);
            this.h = i;
            this.i = i2;
            this.j = u0Var;
            this.k = u0Var2;
            this.l = u0Var3;
            this.m = u0Var4;
            this.n = u0Var5;
            this.o = u0Var6;
            this.p = l2Var;
            this.q = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            int i;
            int i2;
            float e;
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            l2 l2Var = this.p;
            float f = l2Var.c;
            com.amazon.aps.iva.s1.f0 f0Var = this.q;
            float density = f0Var.getDensity();
            com.amazon.aps.iva.o2.l layoutDirection = f0Var.getLayoutDirection();
            float f2 = h2.a;
            com.amazon.aps.iva.d0.o1 o1Var = l2Var.d;
            int a = com.amazon.aps.iva.ob0.f.a(o1Var.d() * density);
            int a2 = com.amazon.aps.iva.ob0.f.a(androidx.compose.foundation.layout.d.c(o1Var, layoutDirection) * density);
            float f3 = j3.c * density;
            int i3 = this.h;
            com.amazon.aps.iva.s1.u0 u0Var = this.j;
            if (u0Var != null) {
                u0.a.g(aVar2, u0Var, 0, com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i3 - u0Var.c) / 2.0f)));
            }
            com.amazon.aps.iva.s1.u0 u0Var2 = this.k;
            if (u0Var2 != null) {
                u0.a.g(aVar2, u0Var2, this.i - u0Var2.b, com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i3 - u0Var2.c) / 2.0f)));
            }
            boolean z = l2Var.b;
            com.amazon.aps.iva.s1.u0 u0Var3 = this.m;
            if (u0Var3 != null) {
                if (z) {
                    i2 = com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i3 - u0Var3.c) / 2.0f));
                } else {
                    i2 = a;
                }
                int Z = com.amazon.aps.iva.cq.b.Z(i2, -(u0Var3.c / 2), f);
                if (u0Var == null) {
                    e = 0.0f;
                } else {
                    e = (1 - f) * (j3.e(u0Var) - f3);
                }
                u0.a.g(aVar2, u0Var3, com.amazon.aps.iva.ob0.f.a(e) + a2, Z);
            }
            com.amazon.aps.iva.s1.u0 u0Var4 = this.l;
            if (z) {
                i = com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i3 - u0Var4.c) / 2.0f));
            } else {
                i = a;
            }
            u0.a.g(aVar2, u0Var4, j3.e(u0Var), Math.max(i, j3.d(u0Var3) / 2));
            com.amazon.aps.iva.s1.u0 u0Var5 = this.n;
            if (u0Var5 != null) {
                if (z) {
                    a = com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i3 - u0Var5.c) / 2.0f));
                }
                u0.a.g(aVar2, u0Var5, j3.e(u0Var), Math.max(a, j3.d(u0Var3) / 2));
            }
            u0.a.e(this.o, com.amazon.aps.iva.o2.h.b, 0.0f);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l2(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.g, com.amazon.aps.iva.kb0.q> lVar, boolean z, float f, com.amazon.aps.iva.d0.o1 o1Var) {
        com.amazon.aps.iva.yb0.j.f(lVar, "onLabelMeasured");
        com.amazon.aps.iva.yb0.j.f(o1Var, "paddingValues");
        this.a = lVar;
        this.b = z;
        this.c = f;
        this.d = o1Var;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int a(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        return g(oVar, list, i, n2.h);
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int b(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        return f(oVar, list, i, m2.h);
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int c(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        return f(oVar, list, i, j2.h);
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        Object obj;
        com.amazon.aps.iva.s1.u0 u0Var;
        Object obj2;
        com.amazon.aps.iva.s1.u0 u0Var2;
        Object obj3;
        com.amazon.aps.iva.s1.u0 u0Var3;
        Object obj4;
        com.amazon.aps.iva.s1.u0 u0Var4;
        int i;
        int i2;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        com.amazon.aps.iva.d0.o1 o1Var = this.d;
        int f0 = f0Var.f0(o1Var.a());
        long a2 = com.amazon.aps.iva.o2.a.a(j, 0, 0, 0, 0, 10);
        List<? extends com.amazon.aps.iva.s1.c0> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (com.amazon.aps.iva.yb0.j.a(androidx.compose.ui.layout.a.a((com.amazon.aps.iva.s1.c0) obj), "Leading")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.amazon.aps.iva.s1.c0 c0Var = (com.amazon.aps.iva.s1.c0) obj;
        if (c0Var != null) {
            u0Var = c0Var.V(a2);
        } else {
            u0Var = null;
        }
        int e = j3.e(u0Var) + 0;
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (com.amazon.aps.iva.yb0.j.a(androidx.compose.ui.layout.a.a((com.amazon.aps.iva.s1.c0) obj2), "Trailing")) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        com.amazon.aps.iva.s1.c0 c0Var2 = (com.amazon.aps.iva.s1.c0) obj2;
        if (c0Var2 != null) {
            u0Var2 = c0Var2.V(com.amazon.aps.iva.o2.b.h(-e, a2, 0));
        } else {
            u0Var2 = null;
        }
        int e2 = j3.e(u0Var2) + e;
        int f02 = f0Var.f0(o1Var.c(f0Var.getLayoutDirection())) + f0Var.f0(o1Var.b(f0Var.getLayoutDirection()));
        int i3 = -e2;
        int i4 = -f0;
        long h = com.amazon.aps.iva.o2.b.h(com.amazon.aps.iva.cq.b.Z(i3 - f02, -f02, this.c), a2, i4);
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (com.amazon.aps.iva.yb0.j.a(androidx.compose.ui.layout.a.a((com.amazon.aps.iva.s1.c0) obj3), "Label")) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        com.amazon.aps.iva.s1.c0 c0Var3 = (com.amazon.aps.iva.s1.c0) obj3;
        if (c0Var3 != null) {
            u0Var3 = c0Var3.V(h);
        } else {
            u0Var3 = null;
        }
        if (u0Var3 != null) {
            this.a.invoke(new com.amazon.aps.iva.e1.g(com.amazon.aps.iva.ab.r.d(u0Var3.b, u0Var3.c)));
        }
        long a3 = com.amazon.aps.iva.o2.a.a(com.amazon.aps.iva.o2.b.h(i3, j, i4 - Math.max(j3.d(u0Var3) / 2, f0Var.f0(o1Var.d()))), 0, 0, 0, 0, 11);
        for (com.amazon.aps.iva.s1.c0 c0Var4 : list2) {
            if (com.amazon.aps.iva.yb0.j.a(androidx.compose.ui.layout.a.a(c0Var4), "TextField")) {
                com.amazon.aps.iva.s1.u0 V = c0Var4.V(a3);
                long a4 = com.amazon.aps.iva.o2.a.a(a3, 0, 0, 0, 0, 14);
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj4 = it4.next();
                        if (com.amazon.aps.iva.yb0.j.a(androidx.compose.ui.layout.a.a((com.amazon.aps.iva.s1.c0) obj4), "Hint")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                com.amazon.aps.iva.s1.c0 c0Var5 = (com.amazon.aps.iva.s1.c0) obj4;
                if (c0Var5 != null) {
                    u0Var4 = c0Var5.V(a4);
                } else {
                    u0Var4 = null;
                }
                int c = h2.c(j3.e(u0Var), j3.e(u0Var2), V.b, j3.e(u0Var3), j3.e(u0Var4), this.c, j, f0Var.getDensity(), this.d);
                int b = h2.b(j3.d(u0Var), j3.d(u0Var2), V.c, j3.d(u0Var3), j3.d(u0Var4), this.c, j, f0Var.getDensity(), this.d);
                for (com.amazon.aps.iva.s1.c0 c0Var6 : list2) {
                    if (com.amazon.aps.iva.yb0.j.a(androidx.compose.ui.layout.a.a(c0Var6), "border")) {
                        if (c != Integer.MAX_VALUE) {
                            i = c;
                        } else {
                            i = 0;
                        }
                        if (b != Integer.MAX_VALUE) {
                            i2 = b;
                        } else {
                            i2 = 0;
                        }
                        return f0Var.F0(c, b, com.amazon.aps.iva.lb0.a0.b, new a(b, c, u0Var, u0Var2, V, u0Var3, u0Var4, c0Var6.V(com.amazon.aps.iva.o2.b.a(i, c, i2, b)), this, f0Var));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int e(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        return g(oVar, list, i, k2.h);
    }

    public final int f(androidx.compose.ui.node.o oVar, List list, int i, com.amazon.aps.iva.xb0.p pVar) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        int i5;
        List list2 = list;
        for (Object obj5 : list2) {
            if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) obj5), "TextField")) {
                int intValue = ((Number) pVar.invoke(obj5, Integer.valueOf(i))).intValue();
                Iterator it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                com.amazon.aps.iva.s1.l lVar = (com.amazon.aps.iva.s1.l) obj2;
                if (lVar != null) {
                    i2 = ((Number) pVar.invoke(lVar, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                com.amazon.aps.iva.s1.l lVar2 = (com.amazon.aps.iva.s1.l) obj3;
                if (lVar2 != null) {
                    i3 = ((Number) pVar.invoke(lVar2, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                Iterator it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                com.amazon.aps.iva.s1.l lVar3 = (com.amazon.aps.iva.s1.l) obj4;
                if (lVar3 != null) {
                    i4 = ((Number) pVar.invoke(lVar3, Integer.valueOf(i))).intValue();
                } else {
                    i4 = 0;
                }
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                com.amazon.aps.iva.s1.l lVar4 = (com.amazon.aps.iva.s1.l) obj;
                if (lVar4 != null) {
                    i5 = ((Number) pVar.invoke(lVar4, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                return h2.b(i4, i3, intValue, i2, i5, this.c, j3.a, oVar.getDensity(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int g(androidx.compose.ui.node.o oVar, List list, int i, com.amazon.aps.iva.xb0.p pVar) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        int i5;
        List list2 = list;
        for (Object obj5 : list2) {
            if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) obj5), "TextField")) {
                int intValue = ((Number) pVar.invoke(obj5, Integer.valueOf(i))).intValue();
                Iterator it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                com.amazon.aps.iva.s1.l lVar = (com.amazon.aps.iva.s1.l) obj2;
                if (lVar != null) {
                    i2 = ((Number) pVar.invoke(lVar, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                com.amazon.aps.iva.s1.l lVar2 = (com.amazon.aps.iva.s1.l) obj3;
                if (lVar2 != null) {
                    i3 = ((Number) pVar.invoke(lVar2, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                Iterator it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                com.amazon.aps.iva.s1.l lVar3 = (com.amazon.aps.iva.s1.l) obj4;
                if (lVar3 != null) {
                    i4 = ((Number) pVar.invoke(lVar3, Integer.valueOf(i))).intValue();
                } else {
                    i4 = 0;
                }
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (com.amazon.aps.iva.yb0.j.a(j3.c((com.amazon.aps.iva.s1.l) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                com.amazon.aps.iva.s1.l lVar4 = (com.amazon.aps.iva.s1.l) obj;
                if (lVar4 != null) {
                    i5 = ((Number) pVar.invoke(lVar4, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                return h2.c(i4, i3, intValue, i2, i5, this.c, j3.a, oVar.getDensity(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
