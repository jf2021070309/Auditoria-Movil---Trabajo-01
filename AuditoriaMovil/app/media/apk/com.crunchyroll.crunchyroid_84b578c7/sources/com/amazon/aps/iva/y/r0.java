package com.amazon.aps.iva.y;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public abstract class r0 {
    public static final s0 a = new s0(new k1(null, null, null, null, 15));

    public abstract k1 a();

    public final s0 b(s0 s0Var) {
        k1 k1Var = ((s0) this).b;
        x0 x0Var = k1Var.a;
        k1 k1Var2 = s0Var.b;
        if (x0Var == null) {
            x0Var = k1Var2.a;
        }
        f1 f1Var = k1Var.b;
        if (f1Var == null) {
            f1Var = k1Var2.b;
        }
        a0 a0Var = k1Var.c;
        if (a0Var == null) {
            a0Var = k1Var2.c;
        }
        b1 b1Var = k1Var.d;
        if (b1Var == null) {
            b1Var = k1Var2.d;
        }
        return new s0(new k1(x0Var, f1Var, a0Var, b1Var));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r0) && com.amazon.aps.iva.yb0.j.a(((r0) obj).a(), a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (com.amazon.aps.iva.yb0.j.a(this, a)) {
            return "EnterTransition.None";
        }
        k1 a2 = a();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        x0 x0Var = a2.a;
        String str4 = null;
        if (x0Var != null) {
            str = x0Var.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        f1 f1Var = a2.b;
        if (f1Var != null) {
            str2 = f1Var.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        a0 a0Var = a2.c;
        if (a0Var != null) {
            str3 = a0Var.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        b1 b1Var = a2.d;
        if (b1Var != null) {
            str4 = b1Var.toString();
        }
        sb.append(str4);
        return sb.toString();
    }
}
