package com.amazon.aps.iva.ve;
/* compiled from: BillingStateMonitor.kt */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final long b;

    public f(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, fVar.a) && this.b == fVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "CancellationCompleteState(sku=" + this.a + ", timeLeft=" + this.b + ")";
    }
}
