package com.amazon.aps.iva.y;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class k1 {
    public final x0 a;
    public final f1 b;
    public final a0 c;
    public final b1 d;

    public k1() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, k1Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, k1Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, k1Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, k1Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        x0 x0Var = this.a;
        if (x0Var == null) {
            hashCode = 0;
        } else {
            hashCode = x0Var.hashCode();
        }
        int i2 = hashCode * 31;
        f1 f1Var = this.b;
        if (f1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f1Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        a0 a0Var = this.c;
        if (a0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = a0Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        b1 b1Var = this.d;
        if (b1Var != null) {
            i = b1Var.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ')';
    }

    public k1(x0 x0Var, f1 f1Var, a0 a0Var, b1 b1Var) {
        this.a = x0Var;
        this.b = f1Var;
        this.c = a0Var;
        this.d = b1Var;
    }

    public /* synthetic */ k1(x0 x0Var, f1 f1Var, a0 a0Var, b1 b1Var, int i) {
        this((i & 1) != 0 ? null : x0Var, (i & 2) != 0 ? null : f1Var, (i & 4) != 0 ? null : a0Var, (i & 8) != 0 ? null : b1Var);
    }
}
