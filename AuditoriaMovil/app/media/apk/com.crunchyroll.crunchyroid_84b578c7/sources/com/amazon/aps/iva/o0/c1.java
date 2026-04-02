package com.amazon.aps.iva.o0;
/* compiled from: JoinedKey.kt */
/* loaded from: classes.dex */
public final class c1 {
    public final Object a;
    public final Object b;

    public c1(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, c1Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, c1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.a;
        int i2 = 0;
        if (obj instanceof Enum) {
            i = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.b;
        if (obj2 instanceof Enum) {
            i2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i2 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.a);
        sb.append(", right=");
        return defpackage.b.b(sb, this.b, ')');
    }
}
