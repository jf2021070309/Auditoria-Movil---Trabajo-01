package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.i;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class b3 {
    public final z2 a;
    public int[] b;
    public Object[] c;
    public ArrayList<c> d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final com.amazon.aps.iva.e0.f o;
    public final com.amazon.aps.iva.e0.f p;
    public final com.amazon.aps.iva.e0.f q;
    public int r;
    public int s;
    public boolean t;
    public d2 u;

    /* compiled from: SlotTable.kt */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.util.List a(com.amazon.aps.iva.o0.b3 r21, int r22, com.amazon.aps.iva.o0.b3 r23, boolean r24, boolean r25, boolean r26) {
            /*
                Method dump skipped, instructions count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.b3.a.a(com.amazon.aps.iva.o0.b3, int, com.amazon.aps.iva.o0.b3, boolean, boolean, boolean):java.util.List");
        }
    }

    static {
        new a();
    }

    public b3(z2 z2Var) {
        com.amazon.aps.iva.yb0.j.f(z2Var, "table");
        this.a = z2Var;
        int[] iArr = z2Var.b;
        this.b = iArr;
        Object[] objArr = z2Var.d;
        this.c = objArr;
        this.d = z2Var.i;
        int i = z2Var.c;
        this.e = i;
        this.f = (iArr.length / 5) - i;
        this.g = i;
        int i2 = z2Var.e;
        this.j = i2;
        this.k = objArr.length - i2;
        this.l = i;
        this.o = new com.amazon.aps.iva.e0.f();
        this.p = new com.amazon.aps.iva.e0.f();
        this.q = new com.amazon.aps.iva.e0.f();
        this.s = -1;
    }

    public static void t(b3 b3Var) {
        int i = b3Var.s;
        int n = b3Var.n(i);
        int[] iArr = b3Var.b;
        boolean z = true;
        int i2 = (n * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            z = false;
        }
        if (!z) {
            iArr[i2] = i3 | 134217728;
            if (!com.amazon.aps.iva.ab.x.g(n, iArr)) {
                b3Var.O(b3Var.z(i));
            }
        }
    }

    public final int A(int i, int[] iArr) {
        int i2 = iArr[(n(i) * 5) + 2];
        if (i2 <= -2) {
            return m() + i2 + 2;
        }
        return i2;
    }

    public final void B() {
        boolean z;
        boolean z2;
        boolean z3;
        d2 d2Var = this.u;
        if (d2Var != null) {
            while (!((List) d2Var.b).isEmpty()) {
                int g = d2Var.g();
                int n = n(g);
                int i = g + 1;
                int o = o(g) + g;
                while (true) {
                    z = false;
                    if (i < o) {
                        if ((this.b[(n(i) * 5) + 1] & 201326592) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z2 = true;
                            break;
                        }
                        i += o(i);
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (com.amazon.aps.iva.ab.x.g(n, this.b) != z2) {
                    z = true;
                }
                if (z) {
                    int[] iArr = this.b;
                    int i2 = (n * 5) + 1;
                    if (z2) {
                        iArr[i2] = iArr[i2] | 67108864;
                    } else {
                        iArr[i2] = iArr[i2] & (-67108865);
                    }
                    int z4 = z(g);
                    if (z4 >= 0) {
                        d2Var.a(z4);
                    }
                }
            }
        }
    }

    public final boolean C() {
        boolean z;
        if (this.m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.r;
            int i2 = this.h;
            int G = G();
            d2 d2Var = this.u;
            if (d2Var != null) {
                while (true) {
                    Object obj = d2Var.b;
                    if (!(!((List) obj).isEmpty()) || ((Number) com.amazon.aps.iva.lb0.x.t0((List) obj)).intValue() < i) {
                        break;
                    }
                    d2Var.g();
                }
            }
            boolean D = D(i, this.r - i);
            E(i2, this.h - i2, i - 1);
            this.r = i;
            this.h = i2;
            this.n -= G;
            return D;
        }
        e0.c("Cannot remove group while inserting".toString());
        throw null;
    }

    public final boolean D(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i2 <= 0) {
            return false;
        }
        ArrayList<c> arrayList = this.d;
        v(i);
        if (!arrayList.isEmpty()) {
            int i3 = i2 + i;
            int n = com.amazon.aps.iva.ab.x.n(this.d, i3, (this.b.length / 5) - this.f);
            if (n >= this.d.size()) {
                n--;
            }
            int i4 = n + 1;
            int i5 = 0;
            while (n >= 0) {
                c cVar = this.d.get(n);
                com.amazon.aps.iva.yb0.j.e(cVar, "anchors[index]");
                c cVar2 = cVar;
                int c = c(cVar2);
                if (c < i) {
                    break;
                }
                if (c < i3) {
                    cVar2.a = Integer.MIN_VALUE;
                    if (i5 == 0) {
                        i5 = n + 1;
                    }
                    i4 = n;
                }
                n--;
            }
            if (i4 < i5) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.d.subList(i4, i5).clear();
            }
        } else {
            z = false;
        }
        this.e = i;
        this.f += i2;
        int i6 = this.l;
        if (i6 > i) {
            this.l = Math.max(i, i6 - i2);
        }
        int i7 = this.g;
        if (i7 >= this.e) {
            this.g = i7 - i2;
        }
        int i8 = this.s;
        if (i8 >= 0) {
            if (com.amazon.aps.iva.ab.x.g(n(i8), this.b)) {
                z2 = true;
            }
        }
        if (z2) {
            O(this.s);
        }
        return z;
    }

    public final void E(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            w(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            com.amazon.aps.iva.lb0.m.J(i, i5, this.c);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final Object F(int i, Object obj) {
        int J = J(n(this.r), this.b);
        boolean z = true;
        int i2 = J + i;
        if ((i2 < J || i2 >= g(n(this.r + 1), this.b)) ? false : false) {
            int h = h(i2);
            Object[] objArr = this.c;
            Object obj2 = objArr[h];
            objArr[h] = obj;
            return obj2;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Write to an invalid slot index ", i, " for group ");
        d.append(this.r);
        e0.c(d.toString().toString());
        throw null;
    }

    public final int G() {
        int n = n(this.r);
        int k = com.amazon.aps.iva.ab.x.k(n, this.b) + this.r;
        this.r = k;
        this.h = g(n(k), this.b);
        if (com.amazon.aps.iva.ab.x.m(n, this.b)) {
            return 1;
        }
        return com.amazon.aps.iva.ab.x.p(n, this.b);
    }

    public final void H() {
        int i = this.g;
        this.r = i;
        this.h = g(n(i), this.b);
    }

    public final Object I(int i, int i2) {
        int J = J(n(i), this.b);
        boolean z = true;
        int i3 = i2 + J;
        if (!((J > i3 || i3 >= g(n(i + 1), this.b)) ? false : false)) {
            return i.a.a;
        }
        return this.c[h(i3)];
    }

    public final int J(int i, int[] iArr) {
        if (i >= this.b.length / 5) {
            return this.c.length - this.k;
        }
        int q = com.amazon.aps.iva.ab.x.q(i, iArr);
        int i2 = this.k;
        int length = this.c.length;
        if (q < 0) {
            return (length - i2) + q + 1;
        }
        return q;
    }

    public final void K() {
        boolean z;
        if (this.m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i.a.C0550a c0550a = i.a.a;
            L(c0550a, 0, c0550a, false);
            return;
        }
        e0.c("Key must be supplied when inserting".toString());
        throw null;
    }

    public final void L(Object obj, int i, Object obj2, boolean z) {
        Object[] objArr;
        int k;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        if (this.m > 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        this.q.e(this.n);
        i.a.C0550a c0550a = i.a.a;
        if (objArr != null) {
            q(1);
            int i7 = this.r;
            int n = n(i7);
            if (obj != c0550a) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (z || obj2 == c0550a) {
                i6 = 0;
            }
            int[] iArr = this.b;
            int i8 = this.s;
            int i9 = this.h;
            if (z) {
                i3 = Ints.MAX_POWER_OF_TWO;
            } else {
                i3 = 0;
            }
            if (i2 != 0) {
                i4 = 536870912;
            } else {
                i4 = 0;
            }
            if (i6 != 0) {
                i5 = 268435456;
            } else {
                i5 = 0;
            }
            int i10 = n * 5;
            iArr[i10 + 0] = i;
            iArr[i10 + 1] = i3 | i4 | i5;
            iArr[i10 + 2] = i8;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = i9;
            this.i = i9;
            int i11 = (z ? 1 : 0) + i2 + i6;
            if (i11 > 0) {
                r(i11, i7);
                Object[] objArr2 = this.c;
                int i12 = this.h;
                if (z) {
                    objArr2[i12] = obj2;
                    i12++;
                }
                if (i2 != 0) {
                    objArr2[i12] = obj;
                    i12++;
                }
                if (i6 != 0) {
                    objArr2[i12] = obj2;
                    i12++;
                }
                this.h = i12;
            }
            this.n = 0;
            k = i7 + 1;
            this.s = i7;
            this.r = k;
        } else {
            this.o.e(this.s);
            this.p.e(((this.b.length / 5) - this.f) - this.g);
            int i13 = this.r;
            int n2 = n(i13);
            if (!com.amazon.aps.iva.yb0.j.a(obj2, c0550a)) {
                if (z) {
                    P(this.r, obj2);
                } else {
                    N(obj2);
                }
            }
            this.h = J(n2, this.b);
            this.i = g(n(this.r + 1), this.b);
            this.n = com.amazon.aps.iva.ab.x.p(n2, this.b);
            this.s = i13;
            this.r = i13 + 1;
            k = i13 + com.amazon.aps.iva.ab.x.k(n2, this.b);
        }
        this.g = k;
    }

    public final void M(Object obj) {
        boolean z;
        if (this.m > 0) {
            r(1, this.s);
        }
        Object[] objArr = this.c;
        int i = this.h;
        this.h = i + 1;
        Object obj2 = objArr[h(i)];
        int i2 = this.h;
        if (i2 <= this.i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.c[h(i2 - 1)] = obj;
        } else {
            e0.c("Writing to an invalid slot".toString());
            throw null;
        }
    }

    public final void N(Object obj) {
        int n = n(this.r);
        if (com.amazon.aps.iva.ab.x.l(n, this.b)) {
            this.c[h(d(n, this.b))] = obj;
        } else {
            e0.c("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    public final void O(int i) {
        if (i >= 0) {
            d2 d2Var = this.u;
            if (d2Var == null) {
                d2Var = new d2();
                this.u = d2Var;
            }
            d2Var.a(i);
        }
    }

    public final void P(int i, Object obj) {
        boolean z;
        int n = n(i);
        int[] iArr = this.b;
        if (n < iArr.length && com.amazon.aps.iva.ab.x.m(n, iArr)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.c[h(g(n, this.b))] = obj;
            return;
        }
        e0.c(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw null;
    }

    public final void a(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.m <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i == 0) {
                    return;
                }
                int i2 = this.r + i;
                if (i2 < this.s || i2 > this.g) {
                    z3 = false;
                }
                if (z3) {
                    this.r = i2;
                    int g = g(n(i2), this.b);
                    this.h = g;
                    this.i = g;
                    return;
                }
                e0.c(("Cannot seek outside the current group (" + this.s + '-' + this.g + ')').toString());
                throw null;
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        e0.c("Cannot seek backwards".toString());
        throw null;
    }

    public final c b(int i) {
        ArrayList<c> arrayList = this.d;
        int f0 = com.amazon.aps.iva.ab.x.f0(arrayList, i, m());
        if (f0 < 0) {
            if (i > this.e) {
                i = -(m() - i);
            }
            c cVar = new c(i);
            arrayList.add(-(f0 + 1), cVar);
            return cVar;
        }
        c cVar2 = arrayList.get(f0);
        com.amazon.aps.iva.yb0.j.e(cVar2, "get(location)");
        return cVar2;
    }

    public final int c(c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "anchor");
        int i = cVar.a;
        if (i < 0) {
            return i + m();
        }
        return i;
    }

    public final int d(int i, int[] iArr) {
        return com.amazon.aps.iva.ab.x.F(iArr[(i * 5) + 1] >> 29) + g(i, iArr);
    }

    public final void e() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            this.p.e(((this.b.length / 5) - this.f) - this.g);
        }
    }

    public final void f() {
        boolean z = true;
        this.t = true;
        if (this.o.a != 0) {
            z = false;
        }
        if (z) {
            v(m());
            w(this.c.length - this.k, this.e);
            int i = this.j;
            com.amazon.aps.iva.lb0.m.J(i, this.k + i, this.c);
            B();
        }
        int[] iArr = this.b;
        int i2 = this.e;
        Object[] objArr = this.c;
        int i3 = this.j;
        ArrayList<c> arrayList = this.d;
        z2 z2Var = this.a;
        z2Var.getClass();
        com.amazon.aps.iva.yb0.j.f(iArr, "groups");
        com.amazon.aps.iva.yb0.j.f(objArr, "slots");
        com.amazon.aps.iva.yb0.j.f(arrayList, "anchors");
        if (z2Var.g) {
            z2Var.g = false;
            z2Var.b = iArr;
            z2Var.c = i2;
            z2Var.d = objArr;
            z2Var.e = i3;
            z2Var.i = arrayList;
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final int g(int i, int[] iArr) {
        if (i >= this.b.length / 5) {
            return this.c.length - this.k;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = this.k;
        int length = this.c.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    public final int h(int i) {
        if (i >= this.j) {
            return i + this.k;
        }
        return i;
    }

    public final void i() {
        boolean z;
        int i;
        int i2 = 1;
        int i3 = 0;
        if (this.m > 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.r;
        int i5 = this.g;
        int i6 = this.s;
        int n = n(i6);
        int i7 = this.n;
        int i8 = i4 - i6;
        boolean m = com.amazon.aps.iva.ab.x.m(n, this.b);
        com.amazon.aps.iva.e0.f fVar = this.q;
        if (z) {
            com.amazon.aps.iva.ab.x.r(n, i8, this.b);
            com.amazon.aps.iva.ab.x.s(n, i7, this.b);
            int d = fVar.d();
            if (!m) {
                i2 = i7;
            }
            this.n = d + i2;
            this.s = A(i6, this.b);
            return;
        }
        if (i4 != i5) {
            i2 = 0;
        }
        if (i2 != 0) {
            int k = com.amazon.aps.iva.ab.x.k(n, this.b);
            int p = com.amazon.aps.iva.ab.x.p(n, this.b);
            com.amazon.aps.iva.ab.x.r(n, i8, this.b);
            com.amazon.aps.iva.ab.x.s(n, i7, this.b);
            int d2 = this.o.d();
            this.g = ((this.b.length / 5) - this.f) - this.p.d();
            this.s = d2;
            int A = A(i6, this.b);
            int d3 = fVar.d();
            this.n = d3;
            if (A == d2) {
                if (!m) {
                    i3 = i7 - p;
                }
                this.n = d3 + i3;
                return;
            }
            int i9 = i8 - k;
            if (m) {
                i = 0;
            } else {
                i = i7 - p;
            }
            if (i9 != 0 || i != 0) {
                while (A != 0 && A != d2 && (i != 0 || i9 != 0)) {
                    int n2 = n(A);
                    if (i9 != 0) {
                        com.amazon.aps.iva.ab.x.r(n2, com.amazon.aps.iva.ab.x.k(n2, this.b) + i9, this.b);
                    }
                    if (i != 0) {
                        int[] iArr = this.b;
                        com.amazon.aps.iva.ab.x.s(n2, com.amazon.aps.iva.ab.x.p(n2, iArr) + i, iArr);
                    }
                    if (com.amazon.aps.iva.ab.x.m(n2, this.b)) {
                        i = 0;
                    }
                    A = A(A, this.b);
                }
            }
            this.n += i;
            return;
        }
        e0.c("Expected to be at the end of a group".toString());
        throw null;
    }

    public final void j() {
        boolean z;
        int i = this.m;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.m = i2;
            if (i2 == 0) {
                if (this.q.a != this.o.a) {
                    z2 = false;
                }
                if (z2) {
                    this.g = ((this.b.length / 5) - this.f) - this.p.d();
                    return;
                } else {
                    e0.c("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void k(int i) {
        boolean z;
        boolean z2 = true;
        if (this.m <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.s;
            if (i2 != i) {
                if (i < i2 || i >= this.g) {
                    z2 = false;
                }
                if (z2) {
                    int i3 = this.r;
                    int i4 = this.h;
                    int i5 = this.i;
                    this.r = i;
                    K();
                    this.r = i3;
                    this.h = i4;
                    this.i = i5;
                    return;
                }
                e0.c(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw null;
            }
            return;
        }
        e0.c("Cannot call ensureStarted() while inserting".toString());
        throw null;
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.e) {
            i = -((m() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(n(i3) * 5) + 2] = i;
            int k = com.amazon.aps.iva.ab.x.k(n(i3), this.b) + i3;
            l(i3, k, i3 + 1);
            i3 = k;
        }
    }

    public final int m() {
        return (this.b.length / 5) - this.f;
    }

    public final int n(int i) {
        if (i >= this.e) {
            return i + this.f;
        }
        return i;
    }

    public final int o(int i) {
        return com.amazon.aps.iva.ab.x.k(n(i), this.b);
    }

    public final boolean p(int i, int i2) {
        int i3;
        int length;
        int o;
        if (i2 == this.s) {
            length = this.g;
        } else {
            com.amazon.aps.iva.e0.f fVar = this.o;
            int i4 = fVar.a;
            if (i4 > 0) {
                i3 = ((int[]) fVar.b)[i4 - 1];
            } else {
                i3 = 0;
            }
            if (i2 > i3) {
                o = o(i2);
            } else {
                int i5 = 0;
                while (true) {
                    if (i5 < i4) {
                        if (((int[]) fVar.b)[i5] == i2) {
                            break;
                        }
                        i5++;
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                if (i5 < 0) {
                    o = o(i2);
                } else {
                    length = ((this.b.length / 5) - this.f) - ((int[]) this.p.b)[i5];
                }
            }
            length = o + i2;
        }
        if (i <= i2 || i >= length) {
            return false;
        }
        return true;
    }

    public final void q(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.r;
            v(i3);
            int i4 = this.e;
            int i5 = this.f;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                com.amazon.aps.iva.lb0.m.C(0, 0, iArr, iArr2, i4 * 5);
                com.amazon.aps.iva.lb0.m.C((i4 + i8) * 5, (i5 + i4) * 5, iArr, iArr2, length * 5);
                this.b = iArr2;
                i5 = i8;
            }
            int i9 = this.g;
            if (i9 >= i4) {
                this.g = i9 + i;
            }
            int i10 = i4 + i;
            this.e = i10;
            this.f = i5 - i;
            if (i6 > 0) {
                i2 = g(n(i3 + i), this.b);
            } else {
                i2 = 0;
            }
            if (this.l >= i4) {
                i7 = this.j;
            }
            int i11 = this.k;
            int length2 = this.c.length;
            if (i2 > i7) {
                i2 = -(((length2 - i11) - i2) + 1);
            }
            for (int i12 = i4; i12 < i10; i12++) {
                this.b[(i12 * 5) + 4] = i2;
            }
            int i13 = this.l;
            if (i13 >= i4) {
                this.l = i13 + i;
            }
        }
    }

    public final void r(int i, int i2) {
        if (i > 0) {
            w(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                com.amazon.aps.iva.lb0.m.F(objArr, 0, objArr2, 0, i3);
                com.amazon.aps.iva.lb0.m.F(objArr, i3 + i7, objArr2, i4 + i3, length);
                this.c = objArr2;
                i4 = i7;
            }
            int i8 = this.i;
            if (i8 >= i3) {
                this.i = i8 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public final boolean s(int i) {
        return com.amazon.aps.iva.ab.x.m(n(i), this.b);
    }

    public final String toString() {
        return "SlotWriter(current = " + this.r + " end=" + this.g + " size = " + m() + " gap=" + this.e + '-' + (this.e + this.f) + ')';
    }

    public final void u(z2 z2Var, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(z2Var, "table");
        if (this.m > 0) {
            z = true;
        } else {
            z = false;
        }
        e0.f(z);
        if (i == 0 && this.r == 0 && this.a.c == 0) {
            int k = com.amazon.aps.iva.ab.x.k(i, z2Var.b);
            int i2 = z2Var.c;
            if (k == i2) {
                int[] iArr = this.b;
                Object[] objArr = this.c;
                ArrayList<c> arrayList = this.d;
                int[] iArr2 = z2Var.b;
                Object[] objArr2 = z2Var.d;
                int i3 = z2Var.e;
                this.b = iArr2;
                this.c = objArr2;
                this.d = z2Var.i;
                this.e = i2;
                this.f = (iArr2.length / 5) - i2;
                this.j = i3;
                this.k = objArr2.length - i3;
                this.l = i2;
                com.amazon.aps.iva.yb0.j.f(iArr, "groups");
                com.amazon.aps.iva.yb0.j.f(objArr, "slots");
                com.amazon.aps.iva.yb0.j.f(arrayList, "anchors");
                z2Var.b = iArr;
                z2Var.c = 0;
                z2Var.d = objArr;
                z2Var.e = 0;
                z2Var.i = arrayList;
                return;
            }
        }
        b3 j = z2Var.j();
        try {
            a.a(j, i, this, true, true, false);
        } finally {
            j.f();
        }
    }

    public final void v(int i) {
        int m;
        int i2;
        int i3 = this.f;
        int i4 = this.e;
        if (i4 != i) {
            boolean z = true;
            if (!this.d.isEmpty()) {
                int length = (this.b.length / 5) - this.f;
                if (i4 < i) {
                    for (int n = com.amazon.aps.iva.ab.x.n(this.d, i4, length); n < this.d.size(); n++) {
                        c cVar = this.d.get(n);
                        com.amazon.aps.iva.yb0.j.e(cVar, "anchors[index]");
                        c cVar2 = cVar;
                        int i5 = cVar2.a;
                        if (i5 >= 0 || (i2 = i5 + length) >= i) {
                            break;
                        }
                        cVar2.a = i2;
                    }
                } else {
                    for (int n2 = com.amazon.aps.iva.ab.x.n(this.d, i, length); n2 < this.d.size(); n2++) {
                        c cVar3 = this.d.get(n2);
                        com.amazon.aps.iva.yb0.j.e(cVar3, "anchors[index]");
                        c cVar4 = cVar3;
                        int i6 = cVar4.a;
                        if (i6 < 0) {
                            break;
                        }
                        cVar4.a = -(length - i6);
                    }
                }
            }
            if (i3 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i3 * 5;
                int i9 = i4 * 5;
                if (i < i4) {
                    com.amazon.aps.iva.lb0.m.C(i8 + i7, i7, iArr, iArr, i9);
                } else {
                    com.amazon.aps.iva.lb0.m.C(i9, i9 + i8, iArr, iArr, i7 + i8);
                }
            }
            if (i < i4) {
                i4 = i + i3;
            }
            int length2 = this.b.length / 5;
            if (i4 >= length2) {
                z = false;
            }
            e0.f(z);
            while (i4 < length2) {
                int i10 = (i4 * 5) + 2;
                int i11 = this.b[i10];
                if (i11 > -2) {
                    m = i11;
                } else {
                    m = m() + i11 + 2;
                }
                if (m >= i) {
                    m = -((m() - m) + 2);
                }
                if (m != i11) {
                    this.b[i10] = m;
                }
                i4++;
                if (i4 == i) {
                    i4 += i3;
                }
            }
        }
        this.e = i;
    }

    public final void w(int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                com.amazon.aps.iva.lb0.m.F(objArr, i + i3, objArr, i, i4);
            } else {
                com.amazon.aps.iva.lb0.m.F(objArr, i4, objArr, i4 + i3, i + i3);
            }
        }
        int min = Math.min(i2 + 1, m());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int n = n(min);
                int n2 = n(i5);
                int i6 = this.e;
                while (n < n2) {
                    int h = com.amazon.aps.iva.ab.x.h(n, this.b);
                    if (h >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        this.b[(n * 5) + 4] = -((length - h) + 1);
                        n++;
                        if (n == i6) {
                            n += this.f;
                        }
                    } else {
                        e0.c("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                }
            } else {
                int n3 = n(i5);
                int n4 = n(min);
                while (n3 < n4) {
                    int h2 = com.amazon.aps.iva.ab.x.h(n3, this.b);
                    if (h2 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.b[(n3 * 5) + 4] = h2 + length + 1;
                        n3++;
                        if (n3 == this.e) {
                            n3 += this.f;
                        }
                    } else {
                        e0.c("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                }
            }
            this.l = min;
        }
        this.j = i;
    }

    public final List x(c cVar, b3 b3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int p;
        boolean z5;
        com.amazon.aps.iva.yb0.j.f(cVar, "anchor");
        boolean z6 = true;
        if (b3Var.m > 0) {
            z = true;
        } else {
            z = false;
        }
        e0.f(z);
        if (this.m == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        e0.f(z2);
        if (cVar.a != Integer.MIN_VALUE) {
            z3 = true;
        } else {
            z3 = false;
        }
        e0.f(z3);
        int c = c(cVar) + 1;
        int i = this.r;
        if (i <= c && c < this.g) {
            z4 = true;
        } else {
            z4 = false;
        }
        e0.f(z4);
        int z7 = z(c);
        int o = o(c);
        if (s(c)) {
            p = 1;
        } else {
            p = com.amazon.aps.iva.ab.x.p(n(c), this.b);
        }
        List a2 = a.a(this, c, b3Var, false, false, true);
        O(z7);
        if (p > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        while (z7 >= i) {
            int n = n(z7);
            int[] iArr = this.b;
            com.amazon.aps.iva.ab.x.r(n, com.amazon.aps.iva.ab.x.k(n, iArr) - o, iArr);
            if (z5) {
                if (com.amazon.aps.iva.ab.x.m(n, this.b)) {
                    z5 = false;
                } else {
                    int[] iArr2 = this.b;
                    com.amazon.aps.iva.ab.x.s(n, com.amazon.aps.iva.ab.x.p(n, iArr2) - p, iArr2);
                }
            }
            z7 = z(z7);
        }
        if (z5) {
            if (this.n < p) {
                z6 = false;
            }
            e0.f(z6);
            this.n -= p;
        }
        return a2;
    }

    public final Object y(int i) {
        int n = n(i);
        if (com.amazon.aps.iva.ab.x.m(n, this.b)) {
            return this.c[h(g(n, this.b))];
        }
        return null;
    }

    public final int z(int i) {
        return A(i, this.b);
    }
}
