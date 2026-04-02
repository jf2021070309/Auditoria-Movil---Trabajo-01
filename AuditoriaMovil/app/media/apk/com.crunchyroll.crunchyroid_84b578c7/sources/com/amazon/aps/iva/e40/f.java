package com.amazon.aps.iva.e40;

import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: PremiumMembershipInfoUiModel.kt */
/* loaded from: classes2.dex */
public final class f {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public f(int i, String str, String str2, String str3, String str4, String str5) {
        com.amazon.aps.iva.yb0.j.f(str3, FirebaseAnalytics.Param.PRICE);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a == fVar.a && com.amazon.aps.iva.yb0.j.a(this.b, fVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, fVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, fVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, fVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, fVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumMembershipInfoUiModel(himeImageDrawableResId=");
        sb.append(this.a);
        sb.append(", subscriptionName=");
        sb.append(this.b);
        sb.append(", renewalInfo=");
        sb.append(this.c);
        sb.append(", price=");
        sb.append(this.d);
        sb.append(", dateTitle=");
        sb.append(this.e);
        sb.append(", date=");
        return defpackage.b.c(sb, this.f, ")");
    }
}
