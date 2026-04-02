package com.amazon.aps.iva.rs;

import java.io.Serializable;
/* compiled from: BillingPurchase.kt */
/* loaded from: classes2.dex */
public final class p implements Serializable {
    public final String b;
    public final String c;
    public final String d;

    public p(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, pVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, pVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, pVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BillingPurchase(sku=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", purchaseToken=");
        return defpackage.b.c(sb, this.d, ")");
    }
}
