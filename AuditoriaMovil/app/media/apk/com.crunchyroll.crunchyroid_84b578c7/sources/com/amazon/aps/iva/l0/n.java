package com.amazon.aps.iva.l0;
/* compiled from: SelectionHandles.kt */
/* loaded from: classes.dex */
public final class n {
    public final com.amazon.aps.iva.j0.h0 a;
    public final long b;

    public n(com.amazon.aps.iva.j0.h0 h0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "handle");
        this.a = h0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a == nVar.a && com.amazon.aps.iva.e1.c.a(this.b, nVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = com.amazon.aps.iva.e1.c.e;
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) com.amazon.aps.iva.e1.c.h(this.b)) + ')';
    }
}
