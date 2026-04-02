package com.amazon.aps.iva.q2;
/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes.dex */
public final class q {
    public final boolean a;
    public final boolean b;
    public final a0 c;
    public final boolean d;
    public final boolean e;

    public q(boolean z, boolean z2, a0 a0Var, boolean z3, boolean z4) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "securePolicy");
        this.a = z;
        this.b = z2;
        this.c = a0Var;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == qVar.a && this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.e == qVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = com.amazon.aps.iva.a0.r.b(this.b, Boolean.hashCode(this.a) * 31, 31);
        return Boolean.hashCode(this.e) + com.amazon.aps.iva.a0.r.b(this.d, (this.c.hashCode() + b) * 31, 31);
    }

    public q() {
        this(true, true, a0.Inherit, true, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(int r7) {
        /*
            r6 = this;
            r1 = 1
            r2 = 1
            com.amazon.aps.iva.q2.a0 r3 = com.amazon.aps.iva.q2.a0.Inherit
            java.lang.String r7 = "securePolicy"
            com.amazon.aps.iva.yb0.j.f(r3, r7)
            r4 = 1
            r5 = 1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q2.q.<init>(int):void");
    }
}
