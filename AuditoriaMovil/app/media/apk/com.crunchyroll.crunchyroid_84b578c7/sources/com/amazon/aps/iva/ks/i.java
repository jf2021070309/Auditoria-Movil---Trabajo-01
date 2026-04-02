package com.amazon.aps.iva.ks;
/* compiled from: FeedProperty.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.is.a {
    private final String feedId;
    private final String feedTitle;
    private final com.amazon.aps.iva.js.k feedType;

    public i(com.amazon.aps.iva.js.k kVar, String str, String str2) {
        this.feedType = kVar;
        this.feedId = str;
        this.feedTitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.feedType == iVar.feedType && com.amazon.aps.iva.yb0.j.a(this.feedId, iVar.feedId) && com.amazon.aps.iva.yb0.j.a(this.feedTitle, iVar.feedTitle)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        com.amazon.aps.iva.js.k kVar = this.feedType;
        int i = 0;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.feedId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.feedTitle;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        com.amazon.aps.iva.js.k kVar = this.feedType;
        String str = this.feedId;
        String str2 = this.feedTitle;
        StringBuilder sb = new StringBuilder("FeedProperty(feedType=");
        sb.append(kVar);
        sb.append(", feedId=");
        sb.append(str);
        sb.append(", feedTitle=");
        return defpackage.b.c(sb, str2, ")");
    }
}
