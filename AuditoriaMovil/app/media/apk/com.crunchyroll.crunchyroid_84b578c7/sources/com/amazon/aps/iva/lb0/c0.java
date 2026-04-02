package com.amazon.aps.iva.lb0;
/* compiled from: IndexedValue.kt */
/* loaded from: classes4.dex */
public final class c0<T> {
    public final int a;
    public final T b;

    public c0(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.a == c0Var.a && com.amazon.aps.iva.yb0.j.a(this.b, c0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        T t = this.b;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.a);
        sb.append(", value=");
        return defpackage.b.b(sb, this.b, ')');
    }
}
