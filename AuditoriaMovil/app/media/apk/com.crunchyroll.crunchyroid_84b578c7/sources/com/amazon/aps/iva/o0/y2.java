package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.i;
import java.util.ArrayList;
/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class y2 {
    public final z2 a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public y2(z2 z2Var) {
        com.amazon.aps.iva.yb0.j.f(z2Var, "table");
        this.a = z2Var;
        this.b = z2Var.b;
        int i = z2Var.c;
        this.c = i;
        this.d = z2Var.d;
        this.e = z2Var.e;
        this.h = i;
        this.i = -1;
    }

    public final c a(int i) {
        ArrayList<c> arrayList = this.a.i;
        int f0 = com.amazon.aps.iva.ab.x.f0(arrayList, i, this.c);
        if (f0 < 0) {
            c cVar = new c(i);
            arrayList.add(-(f0 + 1), cVar);
            return cVar;
        }
        c cVar2 = arrayList.get(f0);
        com.amazon.aps.iva.yb0.j.e(cVar2, "get(location)");
        return cVar2;
    }

    public final Object b(int i, int[] iArr) {
        int F;
        if (com.amazon.aps.iva.ab.x.l(i, iArr)) {
            int i2 = i * 5;
            if (i2 >= iArr.length) {
                F = iArr.length;
            } else {
                F = com.amazon.aps.iva.ab.x.F(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
            }
            return this.d[F];
        }
        return i.a.a;
    }

    public final void c() {
        boolean z = true;
        this.f = true;
        z2 z2Var = this.a;
        z2Var.getClass();
        int i = z2Var.f;
        if (i <= 0) {
            z = false;
        }
        if (z) {
            z2Var.f = i - 1;
        } else {
            e0.c("Unexpected reader close()".toString());
            throw null;
        }
    }

    public final void d() {
        boolean z;
        int i;
        if (this.j == 0) {
            if (this.g == this.h) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int[] iArr = this.b;
                int i2 = iArr[(this.i * 5) + 2];
                this.i = i2;
                if (i2 < 0) {
                    i = this.c;
                } else {
                    i = i2 + iArr[(i2 * 5) + 3];
                }
                this.h = i;
                return;
            }
            e0.c("endGroup() not called at the end of a group".toString());
            throw null;
        }
    }

    public final Object e() {
        int i = this.g;
        if (i < this.h) {
            return b(i, this.b);
        }
        return 0;
    }

    public final int f() {
        int i = this.g;
        if (i < this.h) {
            return this.b[i * 5];
        }
        return 0;
    }

    public final Object g(int i, int i2) {
        int i3;
        int[] iArr = this.b;
        int q = com.amazon.aps.iva.ab.x.q(i, iArr);
        int i4 = i + 1;
        if (i4 < this.c) {
            i3 = iArr[(i4 * 5) + 4];
        } else {
            i3 = this.e;
        }
        int i5 = q + i2;
        if (i5 < i3) {
            return this.d[i5];
        }
        return i.a.a;
    }

    public final int h(int i) {
        return com.amazon.aps.iva.ab.x.k(i, this.b);
    }

    public final boolean i(int i) {
        return com.amazon.aps.iva.ab.x.m(i, this.b);
    }

    public final Object j(int i) {
        int[] iArr = this.b;
        if (com.amazon.aps.iva.ab.x.m(i, iArr)) {
            if (com.amazon.aps.iva.ab.x.m(i, iArr)) {
                return this.d[iArr[(i * 5) + 4]];
            }
            return i.a.a;
        }
        return null;
    }

    public final int k(int i) {
        return com.amazon.aps.iva.ab.x.p(i, this.b);
    }

    public final Object l(int i, int[] iArr) {
        boolean z;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.d[com.amazon.aps.iva.ab.x.F(i3 >> 30) + iArr[i2 + 4]];
        }
        return null;
    }

    public final int m(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void n(int i) {
        boolean z;
        int i2;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.g = i;
            int[] iArr = this.b;
            int i3 = this.c;
            if (i < i3) {
                i2 = iArr[(i * 5) + 2];
            } else {
                i2 = -1;
            }
            this.i = i2;
            if (i2 < 0) {
                this.h = i3;
            } else {
                this.h = com.amazon.aps.iva.ab.x.k(i2, iArr) + i2;
            }
            this.k = 0;
            this.l = 0;
            return;
        }
        e0.c("Cannot reposition while in an empty region".toString());
        throw null;
    }

    public final int o() {
        boolean z;
        int i = 1;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.g;
            int[] iArr = this.b;
            if (!com.amazon.aps.iva.ab.x.m(i2, iArr)) {
                i = com.amazon.aps.iva.ab.x.p(this.g, iArr);
            }
            int i3 = this.g;
            this.g = iArr[(i3 * 5) + 3] + i3;
            return i;
        }
        e0.c("Cannot skip while in an empty region".toString());
        throw null;
    }

    public final void p() {
        boolean z;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.g = this.h;
        } else {
            e0.c("Cannot skip the enclosing group while in an empty region".toString());
            throw null;
        }
    }

    public final void q() {
        boolean z;
        int i;
        if (this.j <= 0) {
            int i2 = this.g;
            int[] iArr = this.b;
            if (iArr[(i2 * 5) + 2] == this.i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.i = i2;
                this.h = iArr[(i2 * 5) + 3] + i2;
                int i3 = i2 + 1;
                this.g = i3;
                this.k = com.amazon.aps.iva.ab.x.q(i2, iArr);
                if (i2 >= this.c - 1) {
                    i = this.e;
                } else {
                    i = iArr[(i3 * 5) + 4];
                }
                this.l = i;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return com.amazon.aps.iva.d0.b2.b(sb, this.h, ')');
    }
}
