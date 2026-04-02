package com.amazon.aps.iva.r10;
/* compiled from: HistoryViewModel.kt */
/* loaded from: classes2.dex */
public final class q0 {
    public final int a;
    public final l b;

    public q0(int i, l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "item");
        this.a = i;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.a == q0Var.a && com.amazon.aps.iva.yb0.j.a(this.b, q0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SoftRemovedItem(index=" + this.a + ", item=" + this.b + ")";
    }
}
