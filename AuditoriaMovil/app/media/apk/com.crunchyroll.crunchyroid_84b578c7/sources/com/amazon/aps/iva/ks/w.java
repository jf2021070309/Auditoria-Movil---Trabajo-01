package com.amazon.aps.iva.ks;
/* compiled from: VideoMediaProperty.kt */
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.is.a {
    private final String channelName;
    private final String concatenatedTitle;
    private final String episodeNumber;
    private final String episodeTitle;
    private final String externalMediaId;
    private final String extraTitle;
    private final boolean mediaAdSupported;
    private final String mediaAudioLanguage;
    private final String mediaClosedCaptionLanguage;
    private final Integer mediaDuration;
    private final String mediaId;
    private final String mediaSubtitleLanguage;
    private final String mediaTitle;
    private final com.amazon.aps.iva.js.p mediaType;
    private final String seasonTitle;
    private final String topLevelExternalMediaId;
    private final String topLevelMediaId;

    public /* synthetic */ w(String str, com.amazon.aps.iva.js.p pVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, boolean z) {
        this(str, pVar, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, num, z, null);
    }

    public static w b(w wVar, String str, String str2, boolean z, String str3) {
        String str4 = wVar.channelName;
        com.amazon.aps.iva.js.p pVar = wVar.mediaType;
        String str5 = wVar.externalMediaId;
        String str6 = wVar.mediaId;
        String str7 = wVar.topLevelExternalMediaId;
        String str8 = wVar.topLevelMediaId;
        String str9 = wVar.concatenatedTitle;
        String str10 = wVar.mediaTitle;
        String str11 = wVar.seasonTitle;
        String str12 = wVar.episodeTitle;
        String str13 = wVar.episodeNumber;
        String str14 = wVar.extraTitle;
        Integer num = wVar.mediaDuration;
        wVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str4, "channelName");
        com.amazon.aps.iva.yb0.j.f(pVar, "mediaType");
        com.amazon.aps.iva.yb0.j.f(str9, "concatenatedTitle");
        com.amazon.aps.iva.yb0.j.f(str10, "mediaTitle");
        return new w(str4, pVar, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str, str2, num, z, str3);
    }

    public final com.amazon.aps.iva.js.p c() {
        return this.mediaType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.channelName, wVar.channelName) && this.mediaType == wVar.mediaType && com.amazon.aps.iva.yb0.j.a(this.externalMediaId, wVar.externalMediaId) && com.amazon.aps.iva.yb0.j.a(this.mediaId, wVar.mediaId) && com.amazon.aps.iva.yb0.j.a(this.topLevelExternalMediaId, wVar.topLevelExternalMediaId) && com.amazon.aps.iva.yb0.j.a(this.topLevelMediaId, wVar.topLevelMediaId) && com.amazon.aps.iva.yb0.j.a(this.concatenatedTitle, wVar.concatenatedTitle) && com.amazon.aps.iva.yb0.j.a(this.mediaTitle, wVar.mediaTitle) && com.amazon.aps.iva.yb0.j.a(this.seasonTitle, wVar.seasonTitle) && com.amazon.aps.iva.yb0.j.a(this.episodeTitle, wVar.episodeTitle) && com.amazon.aps.iva.yb0.j.a(this.episodeNumber, wVar.episodeNumber) && com.amazon.aps.iva.yb0.j.a(this.extraTitle, wVar.extraTitle) && com.amazon.aps.iva.yb0.j.a(this.mediaSubtitleLanguage, wVar.mediaSubtitleLanguage) && com.amazon.aps.iva.yb0.j.a(this.mediaAudioLanguage, wVar.mediaAudioLanguage) && com.amazon.aps.iva.yb0.j.a(this.mediaDuration, wVar.mediaDuration) && this.mediaAdSupported == wVar.mediaAdSupported && com.amazon.aps.iva.yb0.j.a(this.mediaClosedCaptionLanguage, wVar.mediaClosedCaptionLanguage)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = (this.mediaType.hashCode() + (this.channelName.hashCode() * 31)) * 31;
        String str = this.externalMediaId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode12 + hashCode) * 31;
        String str2 = this.mediaId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.topLevelExternalMediaId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.topLevelMediaId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int b = com.amazon.aps.iva.c80.a.b(this.mediaTitle, com.amazon.aps.iva.c80.a.b(this.concatenatedTitle, (i4 + hashCode4) * 31, 31), 31);
        String str5 = this.seasonTitle;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (b + hashCode5) * 31;
        String str6 = this.episodeTitle;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str7 = this.episodeNumber;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str8 = this.extraTitle;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        String str9 = this.mediaSubtitleLanguage;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str10 = this.mediaAudioLanguage;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        Integer num = this.mediaDuration;
        if (num == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        boolean z = this.mediaAdSupported;
        int i12 = z;
        if (z != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        String str11 = this.mediaClosedCaptionLanguage;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return i13 + i;
    }

    public final String toString() {
        String str = this.channelName;
        com.amazon.aps.iva.js.p pVar = this.mediaType;
        String str2 = this.externalMediaId;
        String str3 = this.mediaId;
        String str4 = this.topLevelExternalMediaId;
        String str5 = this.topLevelMediaId;
        String str6 = this.concatenatedTitle;
        String str7 = this.mediaTitle;
        String str8 = this.seasonTitle;
        String str9 = this.episodeTitle;
        String str10 = this.episodeNumber;
        String str11 = this.extraTitle;
        String str12 = this.mediaSubtitleLanguage;
        String str13 = this.mediaAudioLanguage;
        Integer num = this.mediaDuration;
        boolean z = this.mediaAdSupported;
        String str14 = this.mediaClosedCaptionLanguage;
        StringBuilder sb = new StringBuilder("VideoMediaProperty(channelName=");
        sb.append(str);
        sb.append(", mediaType=");
        sb.append(pVar);
        sb.append(", externalMediaId=");
        com.amazon.aps.iva.m80.a.c(sb, str2, ", mediaId=", str3, ", topLevelExternalMediaId=");
        com.amazon.aps.iva.m80.a.c(sb, str4, ", topLevelMediaId=", str5, ", concatenatedTitle=");
        com.amazon.aps.iva.m80.a.c(sb, str6, ", mediaTitle=", str7, ", seasonTitle=");
        com.amazon.aps.iva.m80.a.c(sb, str8, ", episodeTitle=", str9, ", episodeNumber=");
        com.amazon.aps.iva.m80.a.c(sb, str10, ", extraTitle=", str11, ", mediaSubtitleLanguage=");
        com.amazon.aps.iva.m80.a.c(sb, str12, ", mediaAudioLanguage=", str13, ", mediaDuration=");
        sb.append(num);
        sb.append(", mediaAdSupported=");
        sb.append(z);
        sb.append(", mediaClosedCaptionLanguage=");
        return defpackage.b.c(sb, str14, ")");
    }

    public w(String str, com.amazon.aps.iva.js.p pVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, boolean z, String str14) {
        com.amazon.aps.iva.yb0.j.f(str, "channelName");
        com.amazon.aps.iva.yb0.j.f(pVar, "mediaType");
        com.amazon.aps.iva.yb0.j.f(str6, "concatenatedTitle");
        com.amazon.aps.iva.yb0.j.f(str7, "mediaTitle");
        this.channelName = str;
        this.mediaType = pVar;
        this.externalMediaId = str2;
        this.mediaId = str3;
        this.topLevelExternalMediaId = str4;
        this.topLevelMediaId = str5;
        this.concatenatedTitle = str6;
        this.mediaTitle = str7;
        this.seasonTitle = str8;
        this.episodeTitle = str9;
        this.episodeNumber = str10;
        this.extraTitle = str11;
        this.mediaSubtitleLanguage = str12;
        this.mediaAudioLanguage = str13;
        this.mediaDuration = num;
        this.mediaAdSupported = z;
        this.mediaClosedCaptionLanguage = str14;
    }
}
