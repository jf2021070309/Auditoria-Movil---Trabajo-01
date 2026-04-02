package com.amazon.aps.iva.ks;
/* compiled from: ContentMediaProperty.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.is.a {
    private final String channelName;
    private final String episodeNumber;
    private final String episodeTitle;
    private final String externalMediaId;
    private final String extraTitle;
    private final String mediaId;
    private final String mediaTitle;
    private final com.amazon.aps.iva.js.p mediaType;
    private final String seasonTitle;

    public e(String str, com.amazon.aps.iva.js.p pVar, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        str = (i & 1) != 0 ? "" : str;
        str5 = (i & 32) != 0 ? "" : str5;
        str6 = (i & 64) != 0 ? "" : str6;
        str7 = (i & 128) != 0 ? "" : str7;
        String str8 = (i & 256) == 0 ? null : "";
        com.amazon.aps.iva.yb0.j.f(str, "channelName");
        com.amazon.aps.iva.yb0.j.f(pVar, "mediaType");
        this.channelName = str;
        this.mediaType = pVar;
        this.mediaId = str2;
        this.externalMediaId = str3;
        this.mediaTitle = str4;
        this.seasonTitle = str5;
        this.episodeTitle = str6;
        this.episodeNumber = str7;
        this.extraTitle = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.channelName, eVar.channelName) && this.mediaType == eVar.mediaType && com.amazon.aps.iva.yb0.j.a(this.mediaId, eVar.mediaId) && com.amazon.aps.iva.yb0.j.a(this.externalMediaId, eVar.externalMediaId) && com.amazon.aps.iva.yb0.j.a(this.mediaTitle, eVar.mediaTitle) && com.amazon.aps.iva.yb0.j.a(this.seasonTitle, eVar.seasonTitle) && com.amazon.aps.iva.yb0.j.a(this.episodeTitle, eVar.episodeTitle) && com.amazon.aps.iva.yb0.j.a(this.episodeNumber, eVar.episodeNumber) && com.amazon.aps.iva.yb0.j.a(this.extraTitle, eVar.extraTitle)) {
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
        int hashCode6;
        int hashCode7 = (this.mediaType.hashCode() + (this.channelName.hashCode() * 31)) * 31;
        String str = this.mediaId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode7 + hashCode) * 31;
        String str2 = this.externalMediaId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.mediaTitle;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.seasonTitle;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.episodeTitle;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.episodeNumber;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.extraTitle;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        String str = this.channelName;
        com.amazon.aps.iva.js.p pVar = this.mediaType;
        String str2 = this.mediaId;
        String str3 = this.externalMediaId;
        String str4 = this.mediaTitle;
        String str5 = this.seasonTitle;
        String str6 = this.episodeTitle;
        String str7 = this.episodeNumber;
        String str8 = this.extraTitle;
        StringBuilder sb = new StringBuilder("ContentMediaProperty(channelName=");
        sb.append(str);
        sb.append(", mediaType=");
        sb.append(pVar);
        sb.append(", mediaId=");
        com.amazon.aps.iva.m80.a.c(sb, str2, ", externalMediaId=", str3, ", mediaTitle=");
        com.amazon.aps.iva.m80.a.c(sb, str4, ", seasonTitle=", str5, ", episodeTitle=");
        com.amazon.aps.iva.m80.a.c(sb, str6, ", episodeNumber=", str7, ", extraTitle=");
        return defpackage.b.c(sb, str8, ")");
    }
}
