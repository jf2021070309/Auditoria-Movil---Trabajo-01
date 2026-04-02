package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.ee0.f1;
import java.util.ArrayList;
/* compiled from: TextLayoutResult.kt */
/* loaded from: classes.dex */
public final class y {
    public final x a;
    public final f b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public y(x xVar, f fVar, long j) {
        float e;
        com.amazon.aps.iva.yb0.j.f(fVar, "multiParagraph");
        this.a = xVar;
        this.b = fVar;
        this.c = j;
        ArrayList arrayList = fVar.h;
        float f = 0.0f;
        if (arrayList.isEmpty()) {
            e = 0.0f;
        } else {
            e = ((i) arrayList.get(0)).a.e();
        }
        this.d = e;
        if (!arrayList.isEmpty()) {
            i iVar = (i) com.amazon.aps.iva.lb0.x.D0(arrayList);
            f = iVar.f + iVar.a.o();
        }
        this.e = f;
        this.f = fVar.g;
    }

    public final com.amazon.aps.iva.n2.g a(int i) {
        int r;
        f fVar = this.b;
        fVar.c(i);
        int length = fVar.a.a.length();
        ArrayList arrayList = fVar.h;
        if (i == length) {
            r = f1.B(arrayList);
        } else {
            r = com.amazon.aps.iva.ff0.b.r(i, arrayList);
        }
        i iVar = (i) arrayList.get(r);
        return iVar.a.q(iVar.b(i));
    }

    public final com.amazon.aps.iva.e1.e b(int i) {
        boolean z;
        f fVar = this.b;
        g gVar = fVar.a;
        if (i >= 0 && i < gVar.a.b.length()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList arrayList = fVar.h;
            i iVar = (i) arrayList.get(com.amazon.aps.iva.ff0.b.r(i, arrayList));
            return iVar.a(iVar.a.s(iVar.b(i)));
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("offset(", i, ") is out of bounds [0, ");
        d.append(gVar.a.length());
        d.append(')');
        throw new IllegalArgumentException(d.toString().toString());
    }

    public final com.amazon.aps.iva.e1.e c(int i) {
        int r;
        f fVar = this.b;
        fVar.c(i);
        int length = fVar.a.a.length();
        ArrayList arrayList = fVar.h;
        if (i == length) {
            r = f1.B(arrayList);
        } else {
            r = com.amazon.aps.iva.ff0.b.r(i, arrayList);
        }
        i iVar = (i) arrayList.get(r);
        return iVar.a(iVar.a.c(iVar.b(i)));
    }

    public final boolean d() {
        boolean z;
        boolean z2;
        long j = this.c;
        f fVar = this.b;
        if (((int) (j >> 32)) < fVar.d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (!fVar.c && com.amazon.aps.iva.o2.j.b(j) >= fVar.e) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public final float e(int i) {
        f fVar = this.b;
        fVar.d(i);
        ArrayList arrayList = fVar.h;
        i iVar = (i) arrayList.get(com.amazon.aps.iva.ff0.b.s(i, arrayList));
        return iVar.a.r(i - iVar.d) + iVar.f;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!com.amazon.aps.iva.yb0.j.a(this.a, yVar.a) || !com.amazon.aps.iva.yb0.j.a(this.b, yVar.b) || !com.amazon.aps.iva.o2.j.a(this.c, yVar.c)) {
            return false;
        }
        if (this.d == yVar.d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.e == yVar.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && com.amazon.aps.iva.yb0.j.a(this.f, yVar.f)) {
            return true;
        }
        return false;
    }

    public final int f(int i, boolean z) {
        f fVar = this.b;
        fVar.d(i);
        ArrayList arrayList = fVar.h;
        i iVar = (i) arrayList.get(com.amazon.aps.iva.ff0.b.s(i, arrayList));
        return iVar.a.h(i - iVar.d, z) + iVar.b;
    }

    public final int g(int i) {
        int r;
        f fVar = this.b;
        int length = fVar.a.a.length();
        ArrayList arrayList = fVar.h;
        if (i >= length) {
            r = f1.B(arrayList);
        } else if (i < 0) {
            r = 0;
        } else {
            r = com.amazon.aps.iva.ff0.b.r(i, arrayList);
        }
        i iVar = (i) arrayList.get(r);
        return iVar.a.p(iVar.b(i)) + iVar.d;
    }

    public final int h(float f) {
        int t;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        f fVar = this.b;
        ArrayList arrayList = fVar.h;
        if (i <= 0) {
            t = 0;
        } else if (f >= fVar.e) {
            t = f1.B(arrayList);
        } else {
            t = com.amazon.aps.iva.ff0.b.t(arrayList, f);
        }
        i iVar = (i) arrayList.get(t);
        int i2 = iVar.c;
        int i3 = iVar.b;
        if (i2 - i3 == 0) {
            return Math.max(0, i3 - 1);
        }
        return iVar.a.j(f - iVar.f) + iVar.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.f.hashCode() + t0.b(this.e, t0.b(this.d, com.amazon.aps.iva.b8.i.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final float i(int i) {
        f fVar = this.b;
        fVar.d(i);
        ArrayList arrayList = fVar.h;
        i iVar = (i) arrayList.get(com.amazon.aps.iva.ff0.b.s(i, arrayList));
        return iVar.a.m(i - iVar.d);
    }

    public final float j(int i) {
        f fVar = this.b;
        fVar.d(i);
        ArrayList arrayList = fVar.h;
        i iVar = (i) arrayList.get(com.amazon.aps.iva.ff0.b.s(i, arrayList));
        return iVar.a.i(i - iVar.d);
    }

    public final int k(int i) {
        f fVar = this.b;
        fVar.d(i);
        ArrayList arrayList = fVar.h;
        i iVar = (i) arrayList.get(com.amazon.aps.iva.ff0.b.s(i, arrayList));
        return iVar.a.g(i - iVar.d) + iVar.b;
    }

    public final float l(int i) {
        f fVar = this.b;
        fVar.d(i);
        ArrayList arrayList = fVar.h;
        i iVar = (i) arrayList.get(com.amazon.aps.iva.ff0.b.s(i, arrayList));
        return iVar.a.b(i - iVar.d) + iVar.f;
    }

    public final int m(long j) {
        int t;
        f fVar = this.b;
        fVar.getClass();
        int i = (com.amazon.aps.iva.e1.c.d(j) > 0.0f ? 1 : (com.amazon.aps.iva.e1.c.d(j) == 0.0f ? 0 : -1));
        ArrayList arrayList = fVar.h;
        if (i <= 0) {
            t = 0;
        } else if (com.amazon.aps.iva.e1.c.d(j) >= fVar.e) {
            t = f1.B(arrayList);
        } else {
            t = com.amazon.aps.iva.ff0.b.t(arrayList, com.amazon.aps.iva.e1.c.d(j));
        }
        i iVar = (i) arrayList.get(t);
        int i2 = iVar.c;
        int i3 = iVar.b;
        if (i2 - i3 == 0) {
            return Math.max(0, i3 - 1);
        }
        return iVar.a.f(com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j) - iVar.f)) + i3;
    }

    public final com.amazon.aps.iva.n2.g n(int i) {
        int r;
        f fVar = this.b;
        fVar.c(i);
        int length = fVar.a.a.length();
        ArrayList arrayList = fVar.h;
        if (i == length) {
            r = f1.B(arrayList);
        } else {
            r = com.amazon.aps.iva.ff0.b.r(i, arrayList);
        }
        i iVar = (i) arrayList.get(r);
        return iVar.a.a(iVar.b(i));
    }

    public final long o(int i) {
        int r;
        f fVar = this.b;
        fVar.c(i);
        int length = fVar.a.a.length();
        ArrayList arrayList = fVar.h;
        if (i == length) {
            r = f1.B(arrayList);
        } else {
            r = com.amazon.aps.iva.ff0.b.r(i, arrayList);
        }
        i iVar = (i) arrayList.get(r);
        long d = iVar.a.d(iVar.b(i));
        int i2 = z.c;
        int i3 = iVar.b;
        return com.amazon.aps.iva.ab.x.f(((int) (d >> 32)) + i3, z.c(d) + i3);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) com.amazon.aps.iva.o2.j.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
