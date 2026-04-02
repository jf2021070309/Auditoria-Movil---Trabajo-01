package com.amazon.aps.iva.k20;

import java.io.Serializable;
/* compiled from: CancellationRescueInput.kt */
/* loaded from: classes2.dex */
public final class k implements Serializable {
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public k(String str, String str2, String str3, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        com.amazon.aps.iva.yb0.j.f(str2, "activeSubscriptionTitle");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, kVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, kVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, kVar.d) && this.e == kVar.e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31);
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (b + hashCode) * 31;
        boolean z = this.e;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellationRescueInput(activeSubscriptionSku=");
        sb.append(this.b);
        sb.append(", activeSubscriptionTitle=");
        sb.append(this.c);
        sb.append(", fanTierTitle=");
        sb.append(this.d);
        sb.append(", hasStoreDiscount=");
        return com.amazon.aps.iva.e4.e.c(sb, this.e, ")");
    }
}
