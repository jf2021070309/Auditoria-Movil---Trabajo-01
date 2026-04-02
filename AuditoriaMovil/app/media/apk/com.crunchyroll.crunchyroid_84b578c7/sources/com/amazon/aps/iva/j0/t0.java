package com.amazon.aps.iva.j0;
/* compiled from: KeyboardActions.kt */
/* loaded from: classes.dex */
public final class t0 {
    public static final t0 g = new t0(null);
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> a;
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> b;
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> d;
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> e;
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f;

    public t0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, t0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, t0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, t0Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, t0Var.d) && com.amazon.aps.iva.yb0.j.a(this.e, t0Var.e) && com.amazon.aps.iva.yb0.j.a(this.f, t0Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar = this.a;
        if (lVar != null) {
            i = lVar.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2 = this.b;
        if (lVar2 != null) {
            i2 = lVar2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar3 = this.c;
        if (lVar3 != null) {
            i3 = lVar3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar4 = this.d;
        if (lVar4 != null) {
            i4 = lVar4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar5 = this.e;
        if (lVar5 != null) {
            i5 = lVar5.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar6 = this.f;
        if (lVar6 != null) {
            i6 = lVar6.hashCode();
        }
        return i11 + i6;
    }

    public t0(Object obj) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
