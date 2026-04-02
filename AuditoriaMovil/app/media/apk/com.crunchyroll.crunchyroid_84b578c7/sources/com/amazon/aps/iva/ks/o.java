package com.amazon.aps.iva.ks;
/* compiled from: PreviousMediaProperty.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.is.a {
    private final String previousExternalMediaId;
    private final String previousMediaId;
    private final String previousMediaTitle;
    private final com.amazon.aps.iva.js.p previousMediaType;
    private final String previousChannelName = "";
    private final String previousTopLevelMediaId = null;
    private final String previousTopLevelExternalMediaId = null;

    public o(com.amazon.aps.iva.js.p pVar, String str, String str2, String str3) {
        this.previousMediaType = pVar;
        this.previousMediaId = str;
        this.previousExternalMediaId = str2;
        this.previousMediaTitle = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.previousChannelName, oVar.previousChannelName) && this.previousMediaType == oVar.previousMediaType && com.amazon.aps.iva.yb0.j.a(this.previousMediaId, oVar.previousMediaId) && com.amazon.aps.iva.yb0.j.a(this.previousExternalMediaId, oVar.previousExternalMediaId) && com.amazon.aps.iva.yb0.j.a(this.previousTopLevelMediaId, oVar.previousTopLevelMediaId) && com.amazon.aps.iva.yb0.j.a(this.previousTopLevelExternalMediaId, oVar.previousTopLevelExternalMediaId) && com.amazon.aps.iva.yb0.j.a(this.previousMediaTitle, oVar.previousMediaTitle)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.previousChannelName.hashCode() * 31;
        com.amazon.aps.iva.js.p pVar = this.previousMediaType;
        int i = 0;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str = this.previousMediaId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.previousExternalMediaId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.previousTopLevelMediaId;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.previousTopLevelExternalMediaId;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this.previousMediaTitle;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        String str = this.previousChannelName;
        com.amazon.aps.iva.js.p pVar = this.previousMediaType;
        String str2 = this.previousMediaId;
        String str3 = this.previousExternalMediaId;
        String str4 = this.previousTopLevelMediaId;
        String str5 = this.previousTopLevelExternalMediaId;
        String str6 = this.previousMediaTitle;
        StringBuilder sb = new StringBuilder("PreviousMediaProperty(previousChannelName=");
        sb.append(str);
        sb.append(", previousMediaType=");
        sb.append(pVar);
        sb.append(", previousMediaId=");
        com.amazon.aps.iva.m80.a.c(sb, str2, ", previousExternalMediaId=", str3, ", previousTopLevelMediaId=");
        com.amazon.aps.iva.m80.a.c(sb, str4, ", previousTopLevelExternalMediaId=", str5, ", previousMediaTitle=");
        return defpackage.b.c(sb, str6, ")");
    }
}
