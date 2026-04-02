package com.amazon.aps.iva.cx;

import com.amazon.aps.iva.vw.a;
import com.google.gson.annotations.SerializedName;
/* compiled from: IntroductoryOfferConfigImpl.kt */
/* loaded from: classes2.dex */
public final class j implements com.amazon.aps.iva.vw.a {
    @SerializedName("is_enabled")
    private final boolean b;
    @SerializedName("experiment_name")
    private final String c;
    @SerializedName("experiment_id")
    private final String d;
    @SerializedName("variation_name")
    private final String e;
    @SerializedName("variation_id")
    private final String f;

    @Override // com.amazon.aps.iva.vw.a
    public final String L() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String M() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.b == jVar.b && com.amazon.aps.iva.yb0.j.a(this.c, jVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, jVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, jVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, jVar.f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.b;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.f.hashCode() + com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, r0 * 31, 31), 31), 31);
    }

    public final boolean isEnabled() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String j0() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String l0() {
        return this.e;
    }

    public final String toString() {
        boolean z = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        StringBuilder sb = new StringBuilder("IntroductoryOfferConfigImpl(isEnabled=");
        sb.append(z);
        sb.append(", experimentName=");
        sb.append(str);
        sb.append(", experimentId=");
        com.amazon.aps.iva.m80.a.c(sb, str2, ", variationName=", str3, ", variationId=");
        return defpackage.b.c(sb, str4, ")");
    }

    @Override // com.amazon.aps.iva.vw.a
    public final com.amazon.aps.iva.ks.g y() {
        return a.C0810a.a(this);
    }
}
