package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.e4.t0;
import java.util.List;
/* compiled from: ImageVector.kt */
/* loaded from: classes.dex */
public final class v extends p {
    public final String b;
    public final List<f> c;
    public final int d;
    public final com.amazon.aps.iva.f1.s e;
    public final float f;
    public final com.amazon.aps.iva.f1.s g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;

    public v(String str, List list, int i, com.amazon.aps.iva.f1.s sVar, float f, com.amazon.aps.iva.f1.s sVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.b = str;
        this.c = list;
        this.d = i;
        this.e = sVar;
        this.f = f;
        this.g = sVar2;
        this.h = f2;
        this.i = f3;
        this.j = i2;
        this.k = i3;
        this.l = f4;
        this.m = f5;
        this.n = f6;
        this.o = f7;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (!com.amazon.aps.iva.yb0.j.a(this.b, vVar.b) || !com.amazon.aps.iva.yb0.j.a(this.e, vVar.e)) {
            return false;
        }
        if (this.f == vVar.f) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !com.amazon.aps.iva.yb0.j.a(this.g, vVar.g)) {
            return false;
        }
        if (this.h == vVar.h) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.i == vVar.i) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.j == vVar.j) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.k == vVar.k) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.l == vVar.l) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.m == vVar.m) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        if (this.n == vVar.n) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        if (this.o == vVar.o) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        if (this.d == vVar.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && com.amazon.aps.iva.yb0.j.a(this.c, vVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int a = defpackage.a.a(this.c, this.b.hashCode() * 31, 31);
        int i2 = 0;
        com.amazon.aps.iva.f1.s sVar = this.e;
        if (sVar != null) {
            i = sVar.hashCode();
        } else {
            i = 0;
        }
        int b = t0.b(this.f, (a + i) * 31, 31);
        com.amazon.aps.iva.f1.s sVar2 = this.g;
        if (sVar2 != null) {
            i2 = sVar2.hashCode();
        }
        return Integer.hashCode(this.d) + t0.b(this.o, t0.b(this.n, t0.b(this.m, t0.b(this.l, com.amazon.aps.iva.a0.r.a(this.k, com.amazon.aps.iva.a0.r.a(this.j, t0.b(this.i, t0.b(this.h, (b + i2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
