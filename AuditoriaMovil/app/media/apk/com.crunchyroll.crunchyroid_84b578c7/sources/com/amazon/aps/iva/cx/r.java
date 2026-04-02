package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
/* compiled from: TermsOfServiceConfigImpl.kt */
/* loaded from: classes2.dex */
public final class r implements com.amazon.aps.iva.mh.l {
    @SerializedName("last_updated_date")
    private final String a;

    @Override // com.amazon.aps.iva.mh.l
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && com.amazon.aps.iva.yb0.j.a(this.a, ((r) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return defpackage.e.e("TermsOfServiceConfigImpl(lastUpdatedDate=", this.a, ")");
    }
}
