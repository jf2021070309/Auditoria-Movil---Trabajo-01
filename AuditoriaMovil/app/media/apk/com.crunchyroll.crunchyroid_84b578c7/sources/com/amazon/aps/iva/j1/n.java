package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.e4.t0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
/* compiled from: ImageVector.kt */
/* loaded from: classes.dex */
public final class n extends p implements Iterable<p>, com.amazon.aps.iva.zb0.a {
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final List<f> j;
    public final List<p> k;

    /* compiled from: ImageVector.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<p>, com.amazon.aps.iva.zb0.a {
        public final Iterator<p> b;

        public a(n nVar) {
            this.b = nVar.k.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final p next() {
            return this.b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends f> list, List<? extends p> list2) {
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(list, "clipPathData");
        com.amazon.aps.iva.yb0.j.f(list2, "children");
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = list;
        this.k = list2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!com.amazon.aps.iva.yb0.j.a(this.b, nVar.b)) {
            return false;
        }
        if (this.c == nVar.c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.d == nVar.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.e == nVar.e) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f == nVar.f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.g == nVar.g) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.h == nVar.h) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.i == nVar.i) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && com.amazon.aps.iva.yb0.j.a(this.j, nVar.j) && com.amazon.aps.iva.yb0.j.a(this.k, nVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() + defpackage.a.a(this.j, t0.b(this.i, t0.b(this.h, t0.b(this.g, t0.b(this.f, t0.b(this.e, t0.b(this.d, t0.b(this.c, this.b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<p> iterator() {
        return new a(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n() {
        /*
            r11 = this;
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r8 = 0
            com.amazon.aps.iva.lb0.z r10 = com.amazon.aps.iva.lb0.z.b
            int r0 = com.amazon.aps.iva.j1.o.a
            r0 = r11
            r9 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j1.n.<init>():void");
    }
}
