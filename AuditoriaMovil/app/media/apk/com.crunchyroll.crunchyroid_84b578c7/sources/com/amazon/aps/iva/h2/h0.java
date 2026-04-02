package com.amazon.aps.iva.h2;

import com.amazon.aps.iva.e4.l1;
/* compiled from: Font.kt */
/* loaded from: classes.dex */
public final class h0 implements j {
    public final int a;
    public final y b;
    public final int c;
    public final x d;
    public final int e;

    public h0(int i, y yVar, int i2, x xVar, int i3) {
        this.a = i;
        this.b = yVar;
        this.c = i2;
        this.d = xVar;
        this.e = i3;
    }

    @Override // com.amazon.aps.iva.h2.j
    public final int a() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.h2.j
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.a != h0Var.a) {
            return false;
        }
        if (!com.amazon.aps.iva.yb0.j.a(this.b, h0Var.b)) {
            return false;
        }
        if (this.c == h0Var.c) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !com.amazon.aps.iva.yb0.j.a(this.d, h0Var.d)) {
            return false;
        }
        if (this.e == h0Var.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.h2.j
    public final y getWeight() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.amazon.aps.iva.a0.r.a(this.e, com.amazon.aps.iva.a0.r.a(this.c, ((this.a * 31) + this.b.b) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) t.a(this.c)) + ", loadingStrategy=" + ((Object) l1.J(this.e)) + ')';
    }
}
