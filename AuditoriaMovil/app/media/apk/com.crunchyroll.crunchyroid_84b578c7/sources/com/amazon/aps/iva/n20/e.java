package com.amazon.aps.iva.n20;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: UpsellTierUiModel.kt */
/* loaded from: classes2.dex */
public final class e {
    public final String a;
    public final long b;
    public final int c;
    public final com.amazon.aps.iva.c30.a d;
    public final String e;

    public e(String str, long j, int i, com.amazon.aps.iva.c30.a aVar) {
        j.f(str, FirebaseAnalytics.Param.PRICE);
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = aVar;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && j.a(this.d, eVar.d) && j.a(this.e, eVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + r.a(this.c, i.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpsellTierPricingPhase(price=");
        sb.append(this.a);
        sb.append(", priceMicros=");
        sb.append(this.b);
        sb.append(", billingCycles=");
        sb.append(this.c);
        sb.append(", billingPeriod=");
        sb.append(this.d);
        sb.append(", offerName=");
        return defpackage.b.c(sb, this.e, ")");
    }
}
