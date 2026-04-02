package com.amazon.aps.iva.o0;

import java.util.ArrayList;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i) {
        super(3);
        this.h = i;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(d<?> dVar, b3 b3Var, u2 u2Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        b3 b3Var2 = b3Var;
        com.amazon.aps.iva.d90.a.c(dVar, "<anonymous parameter 0>", b3Var2, "slots", u2Var, "<anonymous parameter 2>");
        if (b3Var2.m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = this.h;
            if (i3 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i3 != 0) {
                    int i4 = b3Var2.r;
                    int i5 = b3Var2.s;
                    int i6 = b3Var2.g;
                    int i7 = i4;
                    while (i3 > 0) {
                        i7 += com.amazon.aps.iva.ab.x.k(b3Var2.n(i7), b3Var2.b);
                        if (i7 <= i6) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            e0.c("Parameter offset is out of bounds".toString());
                            throw null;
                        }
                        i3--;
                    }
                    int k = com.amazon.aps.iva.ab.x.k(b3Var2.n(i7), b3Var2.b);
                    int i8 = b3Var2.h;
                    int g = b3Var2.g(b3Var2.n(i7), b3Var2.b);
                    int i9 = i7 + k;
                    int g2 = b3Var2.g(b3Var2.n(i9), b3Var2.b);
                    int i10 = g2 - g;
                    b3Var2.r(i10, Math.max(b3Var2.r - 1, 0));
                    b3Var2.q(k);
                    int[] iArr = b3Var2.b;
                    int n = b3Var2.n(i9) * 5;
                    com.amazon.aps.iva.lb0.m.C(b3Var2.n(i4) * 5, n, iArr, iArr, (k * 5) + n);
                    if (i10 > 0) {
                        Object[] objArr = b3Var2.c;
                        com.amazon.aps.iva.lb0.m.F(objArr, i8, objArr, b3Var2.h(g + i10), b3Var2.h(g2 + i10));
                    }
                    int i11 = g + i10;
                    int i12 = i11 - i8;
                    int i13 = b3Var2.j;
                    int i14 = b3Var2.k;
                    int length = b3Var2.c.length;
                    int i15 = b3Var2.l;
                    int i16 = i4 + k;
                    int i17 = i4;
                    while (i17 < i16) {
                        int n2 = b3Var2.n(i17);
                        int i18 = i13;
                        int g3 = b3Var2.g(n2, iArr) - i12;
                        if (i15 < n2) {
                            i = i12;
                            i2 = 0;
                        } else {
                            i = i12;
                            i2 = i18;
                        }
                        if (g3 > i2) {
                            g3 = -(((length - i14) - g3) + 1);
                        }
                        int i19 = b3Var2.j;
                        int i20 = i14;
                        int i21 = b3Var2.k;
                        int i22 = length;
                        int length2 = b3Var2.c.length;
                        if (g3 > i19) {
                            g3 = -(((length2 - i21) - g3) + 1);
                        }
                        iArr[(n2 * 5) + 4] = g3;
                        i17++;
                        i13 = i18;
                        i12 = i;
                        length = i22;
                        i14 = i20;
                    }
                    int i23 = k + i9;
                    int m = b3Var2.m();
                    int n3 = com.amazon.aps.iva.ab.x.n(b3Var2.d, i9, m);
                    ArrayList arrayList = new ArrayList();
                    if (n3 >= 0) {
                        while (n3 < b3Var2.d.size()) {
                            c cVar = b3Var2.d.get(n3);
                            com.amazon.aps.iva.yb0.j.e(cVar, "anchors[index]");
                            c cVar2 = cVar;
                            int c = b3Var2.c(cVar2);
                            if (c < i9 || c >= i23) {
                                break;
                            }
                            arrayList.add(cVar2);
                            b3Var2.d.remove(n3);
                        }
                    }
                    int i24 = i4 - i9;
                    int size = arrayList.size();
                    for (int i25 = 0; i25 < size; i25++) {
                        c cVar3 = (c) arrayList.get(i25);
                        int c2 = b3Var2.c(cVar3) + i24;
                        if (c2 >= b3Var2.e) {
                            cVar3.a = -(m - c2);
                        } else {
                            cVar3.a = c2;
                        }
                        b3Var2.d.add(com.amazon.aps.iva.ab.x.n(b3Var2.d, c2, m), cVar3);
                    }
                    if (!b3Var2.D(i9, k)) {
                        b3Var2.l(i5, b3Var2.g, i4);
                        if (i10 > 0) {
                            b3Var2.E(i11, i10, i9 - 1);
                        }
                    } else {
                        e0.c("Unexpectedly removed anchors".toString());
                        throw null;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
            e0.c("Parameter offset is out of bounds".toString());
            throw null;
        }
        e0.c("Cannot move a group while inserting".toString());
        throw null;
    }
}
