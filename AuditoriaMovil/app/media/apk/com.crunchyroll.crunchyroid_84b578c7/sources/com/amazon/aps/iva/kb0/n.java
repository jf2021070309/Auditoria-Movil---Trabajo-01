package com.amazon.aps.iva.kb0;

import java.io.Serializable;
/* compiled from: Tuples.kt */
/* loaded from: classes4.dex */
public final class n<A, B, C> implements Serializable {
    public final A b;
    public final B c;
    public final C d;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Object obj, Serializable serializable, Object obj2) {
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, nVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, nVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, nVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        A a = this.b;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = hashCode * 31;
        B b = this.c;
        if (b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C c = this.d;
        if (c != null) {
            i = c.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return defpackage.b.b(sb, this.d, ')');
    }
}
