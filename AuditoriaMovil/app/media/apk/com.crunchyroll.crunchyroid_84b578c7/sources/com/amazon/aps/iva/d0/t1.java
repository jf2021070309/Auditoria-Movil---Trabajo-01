package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.s1.u0;
import java.util.List;
/* compiled from: RowColumnMeasurementHelper.kt */
/* loaded from: classes.dex */
public final class t1 {
    public final d1 a;
    public final com.amazon.aps.iva.xb0.s<Integer, int[], com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.c, int[], com.amazon.aps.iva.kb0.q> b;
    public final float c;
    public final z1 d;
    public final q e;
    public final List<com.amazon.aps.iva.s1.c0> f;
    public final com.amazon.aps.iva.s1.u0[] g;
    public final u1[] h;

    public t1(d1 d1Var, com.amazon.aps.iva.xb0.s sVar, float f, z1 z1Var, q qVar, List list, com.amazon.aps.iva.s1.u0[] u0VarArr) {
        com.amazon.aps.iva.yb0.j.f(d1Var, "orientation");
        com.amazon.aps.iva.yb0.j.f(sVar, "arrangement");
        com.amazon.aps.iva.yb0.j.f(z1Var, "crossAxisSize");
        com.amazon.aps.iva.yb0.j.f(qVar, "crossAxisAlignment");
        com.amazon.aps.iva.yb0.j.f(list, "measurables");
        this.a = d1Var;
        this.b = sVar;
        this.c = f;
        this.d = z1Var;
        this.e = qVar;
        this.f = list;
        this.g = u0VarArr;
        int size = list.size();
        u1[] u1VarArr = new u1[size];
        for (int i = 0; i < size; i++) {
            u1VarArr[i] = com.amazon.aps.iva.b50.w.l(this.f.get(i));
        }
        this.h = u1VarArr;
    }

    public final int a(com.amazon.aps.iva.s1.u0 u0Var) {
        if (this.a == d1.Horizontal) {
            return u0Var.c;
        }
        return u0Var.b;
    }

    public final int b(com.amazon.aps.iva.s1.u0 u0Var) {
        com.amazon.aps.iva.yb0.j.f(u0Var, "<this>");
        if (this.a == d1.Horizontal) {
            return u0Var.b;
        }
        return u0Var.c;
    }

    public final s1 c(com.amazon.aps.iva.s1.f0 f0Var, long j, int i, int i2) {
        List<com.amazon.aps.iva.s1.c0> list;
        u1[] u1VarArr;
        com.amazon.aps.iva.s1.u0[] u0VarArr;
        int j2;
        float f;
        int k;
        long j3;
        List<com.amazon.aps.iva.s1.c0> list2;
        u1[] u1VarArr2;
        boolean z;
        int i3;
        int i4;
        long j4;
        int i5;
        int max;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        com.amazon.aps.iva.yb0.j.f(f0Var, "measureScope");
        d1 d1Var = this.a;
        long p = defpackage.i.p(j, d1Var);
        long f0 = f0Var.f0(this.c);
        int i10 = i9 - i;
        float f2 = 0.0f;
        int i11 = i;
        float f3 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        long j5 = 0;
        while (true) {
            list = this.f;
            u1VarArr = this.h;
            u0VarArr = this.g;
            if (i11 >= i9) {
                break;
            }
            com.amazon.aps.iva.s1.c0 c0Var = list.get(i11);
            float m = com.amazon.aps.iva.b50.w.m(u1VarArr[i11]);
            if (m > f2) {
                f3 += m;
                i13++;
                i7 = i10;
            } else {
                int h = com.amazon.aps.iva.o2.a.h(p);
                com.amazon.aps.iva.s1.u0 u0Var = u0VarArr[i11];
                if (u0Var == null) {
                    if (h == Integer.MAX_VALUE) {
                        i8 = Integer.MAX_VALUE;
                    } else {
                        long j6 = h - j5;
                        if (j6 < 0) {
                            j6 = 0;
                        }
                        i8 = (int) j6;
                    }
                    i7 = i10;
                    u0Var = c0Var.V(defpackage.i.H(defpackage.i.q(p, 0, i8, 8), d1Var));
                } else {
                    i7 = i10;
                }
                com.amazon.aps.iva.s1.u0 u0Var2 = u0Var;
                int i15 = (int) f0;
                long b = (h - j5) - b(u0Var2);
                if (b < 0) {
                    b = 0;
                }
                i14 = Math.min(i15, (int) b);
                j5 += b(u0Var2) + i14;
                i12 = Math.max(i12, a(u0Var2));
                u0VarArr[i11] = u0Var2;
            }
            i11++;
            i9 = i2;
            i10 = i7;
            f2 = 0.0f;
        }
        int i16 = i10;
        if (i13 == 0) {
            j5 -= i14;
            k = 0;
        } else {
            int i17 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            if (i17 > 0 && com.amazon.aps.iva.o2.a.h(p) != Integer.MAX_VALUE) {
                j2 = com.amazon.aps.iva.o2.a.h(p);
            } else {
                j2 = com.amazon.aps.iva.o2.a.j(p);
            }
            long j7 = f0 * (i13 - 1);
            long j8 = (j2 - j5) - j7;
            if (j8 < 0) {
                j8 = 0;
            }
            if (i17 > 0) {
                f = ((float) j8) / f3;
            } else {
                f = 0.0f;
            }
            com.amazon.aps.iva.ec0.i it = com.amazon.aps.iva.aq.j.T(i, i2).iterator();
            int i18 = 0;
            while (it.d) {
                i18 += com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.b50.w.m(u1VarArr[it.b()]) * f);
            }
            long j9 = j8 - i18;
            int i19 = i;
            int i20 = i2;
            i12 = i12;
            int i21 = 0;
            while (i19 < i20) {
                if (u0VarArr[i19] == null) {
                    list2 = list;
                    com.amazon.aps.iva.s1.c0 c0Var2 = list.get(i19);
                    u1 u1Var = u1VarArr[i19];
                    float m2 = com.amazon.aps.iva.b50.w.m(u1Var);
                    boolean z2 = true;
                    if (m2 > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i22 = (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1));
                        j3 = j7;
                        if (i22 < 0) {
                            u1VarArr2 = u1VarArr;
                            i3 = -1;
                        } else if (i22 > 0) {
                            u1VarArr2 = u1VarArr;
                            i3 = 1;
                        } else {
                            u1VarArr2 = u1VarArr;
                            i3 = 0;
                        }
                        j9 -= i3;
                        int max2 = Math.max(0, com.amazon.aps.iva.ob0.f.a(m2 * f) + i3);
                        if (u1Var != null) {
                            z2 = u1Var.b;
                        }
                        if (z2 && max2 != Integer.MAX_VALUE) {
                            i4 = max2;
                        } else {
                            i4 = 0;
                        }
                        com.amazon.aps.iva.s1.u0 V = c0Var2.V(defpackage.i.H(com.amazon.aps.iva.o2.b.a(i4, max2, 0, com.amazon.aps.iva.o2.a.g(p)), d1Var));
                        int b2 = b(V) + i21;
                        i12 = Math.max(i12, a(V));
                        u0VarArr[i19] = V;
                        i21 = b2;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    j3 = j7;
                    list2 = list;
                    u1VarArr2 = u1VarArr;
                }
                i19++;
                i20 = i2;
                list = list2;
                u1VarArr = u1VarArr2;
                j7 = j3;
            }
            k = (int) com.amazon.aps.iva.aq.j.k(i21 + j7, com.amazon.aps.iva.o2.a.h(p) - j5);
        }
        long j10 = j5 + k;
        if (j10 < 0) {
            j4 = 0;
        } else {
            j4 = j10;
        }
        int max3 = Math.max((int) j4, com.amazon.aps.iva.o2.a.j(p));
        if (com.amazon.aps.iva.o2.a.g(p) != Integer.MAX_VALUE && this.d == z1.Expand) {
            max = com.amazon.aps.iva.o2.a.g(p);
            i6 = i16;
            i5 = 0;
        } else {
            i5 = 0;
            max = Math.max(i12, Math.max(com.amazon.aps.iva.o2.a.i(p), 0));
            i6 = i16;
        }
        int[] iArr = new int[i6];
        for (int i23 = i5; i23 < i6; i23++) {
            iArr[i23] = i5;
        }
        int[] iArr2 = new int[i6];
        while (i5 < i6) {
            com.amazon.aps.iva.s1.u0 u0Var3 = u0VarArr[i5 + i];
            com.amazon.aps.iva.yb0.j.c(u0Var3);
            iArr2[i5] = b(u0Var3);
            i5++;
        }
        this.b.V0(Integer.valueOf(max3), iArr2, f0Var.getLayoutDirection(), f0Var, iArr);
        return new s1(max, max3, i, i2, iArr);
    }

    public final void d(u0.a aVar, s1 s1Var, int i, com.amazon.aps.iva.o2.l lVar) {
        u1 u1Var;
        q qVar;
        com.amazon.aps.iva.o2.l lVar2;
        com.amazon.aps.iva.yb0.j.f(aVar, "placeableScope");
        com.amazon.aps.iva.yb0.j.f(s1Var, "measureResult");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        int i2 = s1Var.c;
        for (int i3 = i2; i3 < s1Var.d; i3++) {
            com.amazon.aps.iva.s1.u0 u0Var = this.g[i3];
            com.amazon.aps.iva.yb0.j.c(u0Var);
            Object b = this.f.get(i3).b();
            if (b instanceof u1) {
                u1Var = (u1) b;
            } else {
                u1Var = null;
            }
            if (u1Var == null || (qVar = u1Var.c) == null) {
                qVar = this.e;
            }
            int a = s1Var.a - a(u0Var);
            d1 d1Var = d1.Horizontal;
            d1 d1Var2 = this.a;
            if (d1Var2 == d1Var) {
                lVar2 = com.amazon.aps.iva.o2.l.Ltr;
            } else {
                lVar2 = lVar;
            }
            int a2 = qVar.a(a, lVar2, u0Var) + i;
            int[] iArr = s1Var.e;
            if (d1Var2 == d1Var) {
                u0.a.c(u0Var, iArr[i3 - i2], a2, 0.0f);
            } else {
                u0.a.c(u0Var, a2, iArr[i3 - i2], 0.0f);
            }
        }
    }
}
