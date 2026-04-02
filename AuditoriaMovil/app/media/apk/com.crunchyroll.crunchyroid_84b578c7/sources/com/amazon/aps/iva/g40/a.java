package com.amazon.aps.iva.g40;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Date;
/* compiled from: PremiumMembershipInfo.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;
    public final Date c;
    public final boolean d;

    public a(String str, String str2, Date date, boolean z) {
        j.f(str, "sku");
        j.f(str2, FirebaseAnalytics.Param.PRICE);
        j.f(date, "billingDate");
        this.a = str;
        this.b = str2;
        this.c = date;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && this.d == aVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumMembershipInfo(sku=");
        sb.append(this.a);
        sb.append(", price=");
        sb.append(this.b);
        sb.append(", billingDate=");
        sb.append(this.c);
        sb.append(", isAutoRenewable=");
        return com.amazon.aps.iva.e4.e.c(sb, this.d, ")");
    }
}
