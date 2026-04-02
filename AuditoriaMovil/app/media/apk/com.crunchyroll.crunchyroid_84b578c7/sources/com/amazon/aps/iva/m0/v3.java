package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.s1.u0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: TextField.kt */
/* loaded from: classes.dex */
public final class v3 implements com.amazon.aps.iva.s1.d0 {
    public final boolean a;
    public final float b;
    public final com.amazon.aps.iva.d0.o1 c;

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 m;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 n;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 o;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 p;
        public final /* synthetic */ v3 q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.u0 u0Var, int i, int i2, int i3, int i4, com.amazon.aps.iva.s1.u0 u0Var2, com.amazon.aps.iva.s1.u0 u0Var3, com.amazon.aps.iva.s1.u0 u0Var4, com.amazon.aps.iva.s1.u0 u0Var5, v3 v3Var, int i5, int i6, com.amazon.aps.iva.s1.f0 f0Var) {
            super(1);
            this.h = u0Var;
            this.i = i;
            this.j = i2;
            this.k = i3;
            this.l = i4;
            this.m = u0Var2;
            this.n = u0Var3;
            this.o = u0Var4;
            this.p = u0Var5;
            this.q = v3Var;
            this.r = i5;
            this.s = i6;
            this.t = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            int i;
            int a;
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            com.amazon.aps.iva.s1.u0 u0Var = this.m;
            com.amazon.aps.iva.s1.f0 f0Var = this.t;
            com.amazon.aps.iva.s1.u0 u0Var2 = this.p;
            com.amazon.aps.iva.s1.u0 u0Var3 = this.o;
            com.amazon.aps.iva.s1.u0 u0Var4 = this.n;
            int i2 = this.l;
            int i3 = this.k;
            v3 v3Var = this.q;
            com.amazon.aps.iva.s1.u0 u0Var5 = this.h;
            if (u0Var5 != null) {
                int i4 = this.i - this.j;
                if (i4 < 0) {
                    i4 = 0;
                }
                boolean z = v3Var.a;
                int i5 = this.s + this.r;
                float density = f0Var.getDensity();
                float f = r3.a;
                if (u0Var3 != null) {
                    u0.a.g(aVar2, u0Var3, 0, com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i2 - u0Var3.c) / 2.0f)));
                }
                if (u0Var2 != null) {
                    u0.a.g(aVar2, u0Var2, i3 - u0Var2.b, com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i2 - u0Var2.c) / 2.0f)));
                }
                if (z) {
                    a = com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i2 - u0Var5.c) / 2.0f));
                } else {
                    a = com.amazon.aps.iva.ob0.f.a(j3.b * density);
                }
                u0.a.g(aVar2, u0Var5, j3.e(u0Var3), a - com.amazon.aps.iva.ob0.f.a((a - i4) * v3Var.b));
                u0.a.g(aVar2, u0Var, j3.e(u0Var3), i5);
                if (u0Var4 != null) {
                    u0.a.g(aVar2, u0Var4, j3.e(u0Var3), i5);
                }
            } else {
                boolean z2 = v3Var.a;
                float density2 = f0Var.getDensity();
                float f2 = r3.a;
                int a2 = com.amazon.aps.iva.ob0.f.a(v3Var.c.d() * density2);
                if (u0Var3 != null) {
                    u0.a.g(aVar2, u0Var3, 0, com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i2 - u0Var3.c) / 2.0f)));
                }
                if (u0Var2 != null) {
                    u0.a.g(aVar2, u0Var2, i3 - u0Var2.b, com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i2 - u0Var2.c) / 2.0f)));
                }
                if (z2) {
                    i = com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i2 - u0Var.c) / 2.0f));
                } else {
                    i = a2;
                }
                u0.a.g(aVar2, u0Var, j3.e(u0Var3), i);
                if (u0Var4 != null) {
                    if (z2) {
                        a2 = com.amazon.aps.iva.ob0.f.a((1 + 0.0f) * ((i2 - u0Var4.c) / 2.0f));
                    }
                    u0.a.g(aVar2, u0Var4, j3.e(u0Var3), a2);
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public v3(boolean z, float f, com.amazon.aps.iva.d0.o1 o1Var) {
        com.amazon.aps.iva.yb0.j.f(o1Var, "paddingValues");
        this.a = z;
        this.b = f;
        this.c = o1Var;
    }

    public static int g(List list, int i, com.amazon.aps.iva.xb0.p pVar) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
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
                int i5 = 0;
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
                }
                long j = j3.a;
                float f = r3.a;
                return Math.max(Math.max(intValue, Math.max(i2, i5)) + i4 + i3, com.amazon.aps.iva.o2.a.j(j));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int a(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        return g(list, i, x3.h);
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int b(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        return f(oVar, list, i, w3.h);
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int c(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        return f(oVar, list, i, t3.h);
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        Object obj;
        com.amazon.aps.iva.s1.u0 u0Var;
        Object obj2;
        com.amazon.aps.iva.s1.u0 u0Var2;
        com.amazon.aps.iva.s1.u0 u0Var3;
        Object obj3;
        com.amazon.aps.iva.s1.u0 u0Var4;
        int i;
        int i2;
        Object obj4;
        com.amazon.aps.iva.s1.u0 u0Var5;
        boolean z;
        v3 v3Var = this;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        com.amazon.aps.iva.d0.o1 o1Var = v3Var.c;
        int f0 = f0Var.f0(o1Var.d());
        int f02 = f0Var.f0(o1Var.a());
        int f03 = f0Var.f0(r3.c);
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
            u0Var2 = u0Var;
            u0Var3 = c0Var2.V(com.amazon.aps.iva.o2.b.h(-e, a2, 0));
        } else {
            u0Var2 = u0Var;
            u0Var3 = null;
        }
        int e2 = j3.e(u0Var3) + e;
        int i3 = -f02;
        int i4 = -e2;
        long h = com.amazon.aps.iva.o2.b.h(i4, a2, i3);
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
            u0Var4 = c0Var3.V(h);
        } else {
            u0Var4 = null;
        }
        if (u0Var4 != null) {
            i = u0Var4.e(com.amazon.aps.iva.s1.b.b);
            if (i == Integer.MIN_VALUE) {
                i = u0Var4.c;
            }
        } else {
            i = 0;
        }
        int max = Math.max(i, f0);
        if (u0Var4 != null) {
            i2 = (i3 - f03) - max;
        } else {
            i2 = (-f0) - f02;
        }
        long h2 = com.amazon.aps.iva.o2.b.h(i4, com.amazon.aps.iva.o2.a.a(j, 0, 0, 0, 0, 11), i2);
        for (com.amazon.aps.iva.s1.c0 c0Var4 : list2) {
            if (com.amazon.aps.iva.yb0.j.a(androidx.compose.ui.layout.a.a(c0Var4), "TextField")) {
                com.amazon.aps.iva.s1.u0 V = c0Var4.V(h2);
                long a3 = com.amazon.aps.iva.o2.a.a(h2, 0, 0, 0, 0, 14);
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
                    u0Var5 = c0Var5.V(a3);
                } else {
                    u0Var5 = null;
                }
                int max2 = Math.max(Math.max(V.b, Math.max(j3.e(u0Var4), j3.e(u0Var5))) + j3.e(u0Var2) + j3.e(u0Var3), com.amazon.aps.iva.o2.a.j(j));
                int i5 = V.c;
                if (u0Var4 != null) {
                    z = true;
                } else {
                    z = false;
                }
                int c = r3.c(i5, z, max, j3.d(u0Var2), j3.d(u0Var3), j3.d(u0Var5), j, f0Var.getDensity(), v3Var.c);
                return f0Var.F0(max2, c, com.amazon.aps.iva.lb0.a0.b, new a(u0Var4, f0, i, max2, c, V, u0Var5, u0Var2, u0Var3, this, max, f03, f0Var));
            }
            v3Var = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int e(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        return g(list, i, u3.h);
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
        boolean z;
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
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                return r3.c(intValue, z, i2, i4, i3, i5, j3.a, oVar.getDensity(), this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
