package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.d0.q;
import com.amazon.aps.iva.s1.u0;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: FlowLayout.kt */
/* loaded from: classes.dex */
public final class x implements com.amazon.aps.iva.s1.d0 {
    public final com.amazon.aps.iva.yb0.l a;
    public final com.amazon.aps.iva.yb0.l b;
    public final com.amazon.aps.iva.yb0.l c;
    public final /* synthetic */ d1 d;
    public final /* synthetic */ com.amazon.aps.iva.xb0.s<Integer, int[], com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.c, int[], com.amazon.aps.iva.kb0.q> e;
    public final /* synthetic */ float f;
    public final /* synthetic */ z1 g;
    public final /* synthetic */ q h;
    public final /* synthetic */ int i = Integer.MAX_VALUE;
    public final /* synthetic */ float j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.s<Integer, int[], com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.c, int[], com.amazon.aps.iva.kb0.q> k;

    /* compiled from: FlowLayout.kt */
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

    /* compiled from: FlowLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ h0 h;
        public final /* synthetic */ t1 i;
        public final /* synthetic */ int[] j;
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h0 h0Var, t1 t1Var, int[] iArr, com.amazon.aps.iva.s1.f0 f0Var) {
            super(1);
            this.h = h0Var;
            this.i = t1Var;
            this.j = iArr;
            this.k = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            com.amazon.aps.iva.p0.f<s1> fVar = this.h.c;
            int i = fVar.d;
            if (i > 0) {
                s1[] s1VarArr = fVar.b;
                int i2 = 0;
                do {
                    int i3 = this.j[i2];
                    com.amazon.aps.iva.o2.l layoutDirection = this.k.getLayoutDirection();
                    this.i.d(aVar2, s1VarArr[i2], i3, layoutDirection);
                    i2++;
                } while (i2 < i);
                return com.amazon.aps.iva.kb0.q.a;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public x(float f, float f2, q.e eVar, d1 d1Var, z1 z1Var, c0 c0Var, d0 d0Var) {
        com.amazon.aps.iva.yb0.l lVar;
        com.amazon.aps.iva.yb0.l lVar2;
        com.amazon.aps.iva.yb0.l lVar3;
        this.d = d1Var;
        this.e = c0Var;
        this.f = f;
        this.g = z1Var;
        this.h = eVar;
        this.j = f2;
        this.k = d0Var;
        d1 d1Var2 = d1.Horizontal;
        if (d1Var == d1Var2) {
            lVar = v.h;
        } else {
            lVar = w.h;
        }
        this.a = lVar;
        if (d1Var == d1Var2) {
            lVar2 = y.h;
        } else {
            lVar2 = z.h;
        }
        this.b = lVar2;
        if (d1Var == d1Var2) {
            lVar3 = a0.h;
        } else {
            lVar3 = b0.h;
        }
        this.c = lVar3;
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int a(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        d1 d1Var = d1.Horizontal;
        d1 d1Var2 = this.d;
        float f = this.j;
        float f2 = this.f;
        if (d1Var2 == d1Var) {
            return h(i, oVar.f0(f2), oVar.f0(f), list);
        }
        return f(i, oVar.f0(f2), oVar.f0(f), list);
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int b(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        d1 d1Var = d1.Horizontal;
        d1 d1Var2 = this.d;
        float f = this.j;
        float f2 = this.f;
        if (d1Var2 == d1Var) {
            return f(i, oVar.f0(f2), oVar.f0(f), list);
        }
        return h(i, oVar.f0(f2), oVar.f0(f), list);
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int c(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        d1 d1Var = d1.Horizontal;
        d1 d1Var2 = this.d;
        float f = this.f;
        if (d1Var2 == d1Var) {
            return f(i, oVar.f0(f), oVar.f0(this.j), list);
        }
        return g(i, oVar.f0(f), list);
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 f0Var, List<? extends com.amazon.aps.iva.s1.c0> list, long j) {
        Integer num;
        com.amazon.aps.iva.p0.f fVar;
        Integer num2;
        Integer num3;
        int i;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        boolean isEmpty = list.isEmpty();
        com.amazon.aps.iva.lb0.a0 a0Var = com.amazon.aps.iva.lb0.a0.b;
        if (isEmpty) {
            return f0Var.F0(0, 0, a0Var, a.h);
        }
        t1 t1Var = new t1(this.d, this.e, this.f, this.g, this.h, list, new com.amazon.aps.iva.s1.u0[list.size()]);
        d1 d1Var = this.d;
        long p = defpackage.i.p(j, d1Var);
        com.amazon.aps.iva.p0.f fVar2 = new com.amazon.aps.iva.p0.f(new s1[16]);
        int h = com.amazon.aps.iva.o2.a.h(p);
        int j2 = com.amazon.aps.iva.o2.a.j(p);
        int ceil = (int) Math.ceil(f0Var.P0(t1Var.c));
        long a2 = com.amazon.aps.iva.o2.b.a(j2, h, 0, com.amazon.aps.iva.o2.a.g(p));
        List<com.amazon.aps.iva.s1.c0> list2 = t1Var.f;
        com.amazon.aps.iva.s1.c0 c0Var = (com.amazon.aps.iva.s1.c0) com.amazon.aps.iva.lb0.x.w0(0, list2);
        com.amazon.aps.iva.s1.u0[] u0VarArr = t1Var.g;
        if (c0Var != null) {
            num = Integer.valueOf(g0.b(c0Var, a2, d1Var, new u(u0VarArr)));
        } else {
            num = null;
        }
        Integer[] numArr = new Integer[list2.size()];
        Integer num4 = num;
        int size = list2.size();
        int i2 = h;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = j2;
        while (i3 < size) {
            com.amazon.aps.iva.yb0.j.c(num4);
            int intValue = num4.intValue();
            int i8 = size;
            int i9 = i4 + intValue;
            i2 -= intValue;
            long j3 = p;
            int i10 = i3 + 1;
            com.amazon.aps.iva.s1.c0 c0Var2 = (com.amazon.aps.iva.s1.c0) com.amazon.aps.iva.lb0.x.w0(i10, list2);
            if (c0Var2 != null) {
                fVar = fVar2;
                num2 = Integer.valueOf(g0.b(c0Var2, a2, d1Var, new t(u0VarArr, i3)) + ceil);
            } else {
                fVar = fVar2;
                num2 = null;
            }
            if (i10 < list2.size() && i10 - i5 < this.i) {
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                if (i2 - i >= 0) {
                    i4 = i9;
                    size = i8;
                    fVar2 = fVar;
                    num4 = num2;
                    i3 = i10;
                    p = j3;
                }
            }
            int min = Math.min(Math.max(i7, i9), h);
            numArr[i6] = Integer.valueOf(i10);
            i6++;
            if (num2 != null) {
                num3 = Integer.valueOf(num2.intValue() - ceil);
            } else {
                num3 = null;
            }
            i2 = h;
            num2 = num3;
            i5 = i10;
            i4 = 0;
            i7 = min;
            size = i8;
            fVar2 = fVar;
            num4 = num2;
            i3 = i10;
            p = j3;
        }
        long j4 = p;
        com.amazon.aps.iva.p0.f fVar3 = fVar2;
        int i11 = 0;
        long H = defpackage.i.H(defpackage.i.q(a2, i7, 0, 14), d1Var);
        Integer num5 = (Integer) com.amazon.aps.iva.lb0.o.S(numArr, 0);
        int i12 = 0;
        int i13 = 0;
        int i14 = i7;
        int i15 = 0;
        while (num5 != null) {
            s1 c = t1Var.c(f0Var, H, i15, num5.intValue());
            i12 += c.a;
            i14 = Math.max(i14, c.b);
            fVar3.b(c);
            i15 = num5.intValue();
            i13++;
            num5 = (Integer) com.amazon.aps.iva.lb0.o.S(numArr, i13);
            i11 = i11;
            H = H;
            t1Var = t1Var;
        }
        t1 t1Var2 = t1Var;
        h0 h0Var = new h0(Math.max(i14, com.amazon.aps.iva.o2.a.j(j4)), Math.max(i12, com.amazon.aps.iva.o2.a.i(j4)), fVar3);
        int i16 = fVar3.d;
        int[] iArr = new int[i16];
        while (i11 < i16) {
            iArr[i11] = ((s1) fVar3.b[i11]).a;
            i11++;
        }
        int[] iArr2 = new int[i16];
        int f0 = ((fVar3.d - 1) * f0Var.f0(this.j)) + h0Var.b;
        this.k.V0(Integer.valueOf(f0), iArr, f0Var.getLayoutDirection(), f0Var, iArr2);
        d1 d1Var2 = d1.Horizontal;
        int i17 = h0Var.a;
        if (d1Var == d1Var2) {
            f0 = i17;
            i17 = f0;
        }
        return f0Var.F0(com.amazon.aps.iva.o2.b.f(f0, j), com.amazon.aps.iva.o2.b.e(i17, j), a0Var, new b(h0Var, t1Var2, iArr2, f0Var));
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int e(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        d1 d1Var = d1.Horizontal;
        d1 d1Var2 = this.d;
        float f = this.f;
        if (d1Var2 == d1Var) {
            return g(i, oVar.f0(f), list);
        }
        return f(i, oVar.f0(f), oVar.f0(this.j), list);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.yb0.l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.yb0.l] */
    public final int f(int i, int i2, int i3, List list) {
        return g0.a(list, this.c, this.b, i, i2, i3, this.i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.yb0.l] */
    public final int g(int i, int i2, List list) {
        ?? r0 = this.a;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            int intValue = ((Number) r0.invoke((com.amazon.aps.iva.s1.l) list.get(i3), Integer.valueOf(i3), Integer.valueOf(i))).intValue() + i2;
            int i7 = i3 + 1;
            if (i7 - i5 != this.i && i7 != list.size()) {
                i6 += intValue;
            } else {
                i4 = Math.max(i4, (i6 + intValue) - i2);
                i6 = 0;
                i5 = i3;
            }
            i3 = i7;
        }
        return i4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.yb0.l] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.yb0.l] */
    public final int h(int i, int i2, int i3, List list) {
        boolean z;
        boolean z2;
        ?? r2 = this.c;
        ?? r3 = this.b;
        int i4 = this.i;
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            iArr2[i6] = 0;
        }
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            com.amazon.aps.iva.s1.l lVar = (com.amazon.aps.iva.s1.l) list.get(i7);
            int intValue = ((Number) r2.invoke(lVar, Integer.valueOf(i7), Integer.valueOf(i))).intValue();
            iArr[i7] = intValue;
            iArr2[i7] = ((Number) r3.invoke(lVar, Integer.valueOf(i7), Integer.valueOf(intValue))).intValue();
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += iArr[i9];
        }
        if (size2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i10 = iArr2[0];
            com.amazon.aps.iva.ec0.i it = new com.amazon.aps.iva.ec0.j(1, size2 - 1).iterator();
            while (it.d) {
                int i11 = iArr2[it.b()];
                if (i10 < i11) {
                    i10 = i11;
                }
            }
            if (size == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                int i12 = iArr[0];
                com.amazon.aps.iva.ec0.i it2 = new com.amazon.aps.iva.ec0.j(1, size - 1).iterator();
                while (it2.d) {
                    int i13 = iArr[it2.b()];
                    if (i12 < i13) {
                        i12 = i13;
                    }
                }
                int i14 = i8;
                int i15 = i12;
                while (i15 < i8 && i10 != i) {
                    i14 = (i15 + i8) / 2;
                    i10 = g0.a(list, new e0(iArr), new f0(iArr2), i14, i2, i3, i4);
                    if (i10 == i) {
                        break;
                    } else if (i10 > i) {
                        i15 = i14 + 1;
                    } else {
                        i8 = i14 - 1;
                    }
                }
                return i14;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }
}
