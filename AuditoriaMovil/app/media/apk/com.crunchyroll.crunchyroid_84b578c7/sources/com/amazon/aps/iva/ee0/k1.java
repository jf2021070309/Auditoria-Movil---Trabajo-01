package com.amazon.aps.iva.ee0;
/* compiled from: TypeProjectionBase.java */
/* loaded from: classes4.dex */
public abstract class k1 implements j1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (b() == j1Var.b() && c() == j1Var.c() && getType().equals(j1Var.getType())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = c().hashCode();
        if (s1.q(getType())) {
            return (hashCode2 * 31) + 19;
        }
        int i = hashCode2 * 31;
        if (b()) {
            hashCode = 17;
        } else {
            hashCode = getType().hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        if (b()) {
            return "*";
        }
        if (c() == v1.INVARIANT) {
            return getType().toString();
        }
        return c() + " " + getType();
    }
}
