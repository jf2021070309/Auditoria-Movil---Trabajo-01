package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
/* compiled from: AppLegalLinksConfigImpl.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.mh.g {
    @SerializedName("privacy_policy")
    private final String a;
    @SerializedName("terms_of_service")
    private final String b;

    @Override // com.amazon.aps.iva.mh.g
    public final String a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.mh.g
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return com.amazon.aps.iva.e4.e.b("AppLegalLinksConfigImpl(privacyPolicy=", this.a, ", termsOfService=", this.b, ")");
    }
}
