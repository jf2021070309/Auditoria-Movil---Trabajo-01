package com.amazon.aps.iva.l0;
/* compiled from: TextSelectionColors.kt */
/* loaded from: classes.dex */
public final class k0 {
    public final long a;
    public final long b;

    public k0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (com.amazon.aps.iva.f1.x.c(this.a, k0Var.a) && com.amazon.aps.iva.f1.x.c(this.b, k0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = com.amazon.aps.iva.f1.x.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) com.amazon.aps.iva.f1.x.i(this.a)) + ", selectionBackgroundColor=" + ((Object) com.amazon.aps.iva.f1.x.i(this.b)) + ')';
    }
}
