package com.amazon.aps.iva.sd0;
/* compiled from: ClassLiteralValue.kt */
/* loaded from: classes4.dex */
public final class f {
    public final com.amazon.aps.iva.nd0.b a;
    public final int b;

    public f(com.amazon.aps.iva.nd0.b bVar, int i) {
        this.a = bVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, fVar.a) && this.b == fVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
