package com.amazon.aps.iva.ks;
/* compiled from: ExternalReferrerProperty.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.is.a {
    private final String referrerId;
    private final String referrerLink;
    private final String referrerName;
    private final String referrerType;
    private final String referrerUrl;

    public h() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.referrerId, hVar.referrerId) && com.amazon.aps.iva.yb0.j.a(this.referrerLink, hVar.referrerLink) && com.amazon.aps.iva.yb0.j.a(this.referrerName, hVar.referrerName) && com.amazon.aps.iva.yb0.j.a(this.referrerType, hVar.referrerType) && com.amazon.aps.iva.yb0.j.a(this.referrerUrl, hVar.referrerUrl)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.referrerId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.referrerLink;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.referrerName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.referrerType;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.referrerUrl;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        String str = this.referrerId;
        String str2 = this.referrerLink;
        String str3 = this.referrerName;
        String str4 = this.referrerType;
        String str5 = this.referrerUrl;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("ExternalReferrerProperty(referrerId=", str, ", referrerLink=", str2, ", referrerName=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", referrerType=", str4, ", referrerUrl=");
        return defpackage.b.c(b, str5, ")");
    }

    public h(String str, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) != 0 ? "" : null;
        str2 = (i & 4) != 0 ? "" : str2;
        str3 = (i & 8) != 0 ? "" : str3;
        str4 = (i & 16) != 0 ? "" : str4;
        this.referrerId = str;
        this.referrerLink = str5;
        this.referrerName = str2;
        this.referrerType = str3;
        this.referrerUrl = str4;
    }
}
