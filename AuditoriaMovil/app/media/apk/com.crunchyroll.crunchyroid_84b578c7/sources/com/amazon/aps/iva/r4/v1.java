package com.amazon.aps.iva.r4;
/* compiled from: LayoutSelection.kt */
/* loaded from: classes.dex */
public final class v1 {
    public final c1 a;
    public final boolean b;
    public final boolean c;

    public v1(c1 c1Var, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(c1Var, "type");
        this.a = c1Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        if (this.a == v1Var.a && this.b == v1Var.b && this.c == v1Var.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 1;
        boolean z = this.b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.a);
        sb.append(", expandWidth=");
        sb.append(this.b);
        sb.append(", expandHeight=");
        return defpackage.a.b(sb, this.c, ')');
    }
}
