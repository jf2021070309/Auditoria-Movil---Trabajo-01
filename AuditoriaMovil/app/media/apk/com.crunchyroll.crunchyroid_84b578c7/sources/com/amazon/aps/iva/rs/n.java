package com.amazon.aps.iva.rs;

import java.io.Serializable;
/* compiled from: BillingProduct.kt */
/* loaded from: classes2.dex */
public final class n implements Serializable {
    public final String b;
    public final long c;
    public final String d;
    public final com.amazon.aps.iva.ss.b e;
    public final int f;

    public n(String str, long j, String str2, com.amazon.aps.iva.ss.b bVar, int i) {
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = bVar;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, nVar.b) && this.c == nVar.c && com.amazon.aps.iva.yb0.j.a(this.d, nVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, nVar.e) && this.f == nVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.b8.i.a(this.c, this.b.hashCode() * 31, 31), 31);
        return Integer.hashCode(this.f) + ((this.e.hashCode() + b) * 31);
    }

    public final String toString() {
        return "BillingPricingPhase(price=" + this.b + ", priceMicros=" + this.c + ", priceCurrencyCode=" + this.d + ", period=" + this.e + ", billingCycles=" + this.f + ")";
    }
}
