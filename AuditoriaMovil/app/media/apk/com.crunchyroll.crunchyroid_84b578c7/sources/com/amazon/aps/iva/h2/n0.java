package com.amazon.aps.iva.h2;
/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes.dex */
public final class n0 {
    public final k a;
    public final y b;
    public final int c;
    public final int d;
    public final Object e;

    public n0(k kVar, y yVar, int i, int i2, Object obj) {
        com.amazon.aps.iva.yb0.j.f(yVar, "fontWeight");
        this.a = kVar;
        this.b = yVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (!com.amazon.aps.iva.yb0.j.a(this.a, n0Var.a) || !com.amazon.aps.iva.yb0.j.a(this.b, n0Var.b)) {
            return false;
        }
        if (this.c == n0Var.c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.d == n0Var.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && com.amazon.aps.iva.yb0.j.a(this.e, n0Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        k kVar = this.a;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        int a = com.amazon.aps.iva.a0.r.a(this.d, com.amazon.aps.iva.a0.r.a(this.c, ((hashCode * 31) + this.b.b) * 31, 31), 31);
        Object obj = this.e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        sb.append((Object) t.a(this.c));
        sb.append(", fontSynthesis=");
        sb.append((Object) u.a(this.d));
        sb.append(", resourceLoaderCacheKey=");
        return defpackage.b.b(sb, this.e, ')');
    }
}
