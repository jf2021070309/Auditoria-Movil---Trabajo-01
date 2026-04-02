package com.amazon.aps.iva.q2;
/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class z {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final a0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public z(boolean z, boolean z2, boolean z3, a0 a0Var, boolean z4, boolean z5, boolean z6) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "securePolicy");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = a0Var;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.a == zVar.a && this.b == zVar.b && this.c == zVar.c && this.d == zVar.d && this.e == zVar.e && this.f == zVar.f && this.g == zVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.b;
        int b = com.amazon.aps.iva.a0.r.b(this.c, com.amazon.aps.iva.a0.r.b(z, com.amazon.aps.iva.a0.r.b(this.a, Boolean.hashCode(z) * 31, 31), 31), 31);
        return Boolean.hashCode(this.g) + com.amazon.aps.iva.a0.r.b(this.f, com.amazon.aps.iva.a0.r.b(this.e, (this.d.hashCode() + b) * 31, 31), 31);
    }

    public z() {
        this(false, true, true, a0.Inherit, true, true, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(boolean r9, int r10) {
        /*
            r8 = this;
            r1 = 0
            r0 = r10 & 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L9
            r4 = r3
            goto La
        L9:
            r4 = r2
        La:
            r0 = r10 & 4
            if (r0 == 0) goto L10
            r5 = r3
            goto L11
        L10:
            r5 = r2
        L11:
            r0 = r10 & 8
            if (r0 == 0) goto L18
            com.amazon.aps.iva.q2.a0 r0 = com.amazon.aps.iva.q2.a0.Inherit
            goto L19
        L18:
            r0 = 0
        L19:
            r6 = r0
            r0 = r10 & 16
            if (r0 == 0) goto L1f
            r9 = r3
        L1f:
            r10 = r10 & 32
            if (r10 == 0) goto L25
            r10 = r3
            goto L26
        L25:
            r10 = r2
        L26:
            java.lang.String r0 = "securePolicy"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            r7 = 0
            r0 = r8
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q2.z.<init>(boolean, int):void");
    }
}
