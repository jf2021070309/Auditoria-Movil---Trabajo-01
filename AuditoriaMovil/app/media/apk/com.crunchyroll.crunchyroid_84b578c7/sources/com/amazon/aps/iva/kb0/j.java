package com.amazon.aps.iva.kb0;

import java.io.Serializable;
/* compiled from: Tuples.kt */
/* loaded from: classes4.dex */
public final class j<A, B> implements Serializable {
    public final A b;
    public final B c;

    public j(A a, B b) {
        this.b = a;
        this.c = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, jVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, jVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        A a = this.b;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = hashCode * 31;
        B b = this.c;
        if (b != null) {
            i = b.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.b);
        sb.append(", ");
        return defpackage.b.b(sb, this.c, ')');
    }
}
