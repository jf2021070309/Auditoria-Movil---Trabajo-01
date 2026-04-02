package com.amazon.aps.iva.o0;
/* compiled from: OpaqueKey.kt */
/* loaded from: classes.dex */
public final class u1 {
    public final String a;

    public u1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u1) && com.amazon.aps.iva.yb0.j.a(this.a, ((u1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return t1.b(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
