package com.amazon.aps.iva.cx;

import com.amazon.aps.iva.vw.a;
import com.google.gson.annotations.SerializedName;
/* compiled from: BillingNotificationsConfigImpl.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.me.j {
    @SerializedName("is_in_grace_home_cta_enabled")
    private final boolean b;
    @SerializedName("is_in_grace_notification_enabled")
    private final boolean c;
    @SerializedName("is_in_grace_final_notification_enabled")
    private final boolean d;
    @SerializedName("is_on_hold_notification_enabled")
    private final boolean e;
    @SerializedName("is_renew_notification_enabled")
    private final boolean f;
    @SerializedName("experiment_name")
    private final String g;
    @SerializedName("experiment_id")
    private final String h;
    @SerializedName("variation_name")
    private final String i;
    @SerializedName("variation_id")
    private final String j;

    @Override // com.amazon.aps.iva.me.j
    public final boolean B() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String L() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String M() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.me.j
    public final boolean V() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.me.j
    public final boolean Z() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.me.j
    public final boolean a0() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && com.amazon.aps.iva.yb0.j.a(this.g, dVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, dVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, dVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, dVar.j)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final int hashCode() {
        boolean z = this.b;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r2 = this.c;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        ?? r22 = this.d;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        ?? r23 = this.e;
        int i7 = r23;
        if (r23 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z2 = this.f;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return this.j.hashCode() + com.amazon.aps.iva.c80.a.b(this.i, com.amazon.aps.iva.c80.a.b(this.h, com.amazon.aps.iva.c80.a.b(this.g, (i8 + i) * 31, 31), 31), 31);
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String j0() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String l0() {
        return this.i;
    }

    public final String toString() {
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = this.f;
        String str = this.g;
        String str2 = this.h;
        String str3 = this.i;
        String str4 = this.j;
        StringBuilder sb = new StringBuilder("BillingNotificationsConfigImpl(isInGraceHomeCtaEnabled=");
        sb.append(z);
        sb.append(", isInGraceNotificationEnabled=");
        sb.append(z2);
        sb.append(", isInGraceFinalNotificationEnabled=");
        sb.append(z3);
        sb.append(", isInOnHoldNotificationEnabled=");
        sb.append(z4);
        sb.append(", isInRenewNotificationEnabled=");
        sb.append(z5);
        sb.append(", experimentName=");
        sb.append(str);
        sb.append(", experimentId=");
        com.amazon.aps.iva.m80.a.c(sb, str2, ", variationName=", str3, ", variationId=");
        return defpackage.b.c(sb, str4, ")");
    }

    @Override // com.amazon.aps.iva.me.j
    public final boolean x() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final com.amazon.aps.iva.ks.g y() {
        return a.C0810a.a(this);
    }
}
