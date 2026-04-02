package com.amazon.aps.iva.kj;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.api.etp.playback.model.SkipEvents;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: PlayerVideoMetadata.kt */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final t e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public final List<String> p;
    public final Long q;
    public final List<Image> r;
    public final String s;
    public final Object t;
    public final long u;
    public final SkipEvents v;
    public final List<PlayableAssetVersion> w;
    public final String x;
    public final String y;

    public e() {
        throw null;
    }

    public e(String str, String str2, String str3, String str4, t tVar, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Long l, List list, String str10, Object obj, long j, SkipEvents skipEvents, List list2, String str11, String str12, int i) {
        Boolean bool6;
        z zVar;
        Boolean bool7;
        z zVar2;
        Boolean bool8;
        z zVar3;
        String str13 = (i & 2) != 0 ? "" : str2;
        String str14 = (i & 4) != 0 ? null : str3;
        String str15 = (i & 8) == 0 ? str4 : "";
        String str16 = (i & 32) != 0 ? null : str5;
        String str17 = (i & 64) != 0 ? null : str6;
        String str18 = (i & 128) != 0 ? null : str7;
        String str19 = (i & 256) != 0 ? null : str8;
        String str20 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : str9;
        Boolean bool9 = (i & 1024) != 0 ? null : bool;
        Boolean bool10 = (i & 2048) != 0 ? null : bool2;
        Boolean bool11 = (i & 4096) != 0 ? null : bool3;
        Boolean bool12 = (i & 8192) != 0 ? null : bool4;
        Boolean bool13 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool5;
        int i2 = i & 32768;
        z zVar4 = z.b;
        if (i2 != 0) {
            bool6 = bool13;
            zVar = zVar4;
        } else {
            bool6 = bool13;
            zVar = null;
        }
        Long l2 = (i & Cast.MAX_MESSAGE_LENGTH) != 0 ? null : l;
        if ((i & 131072) != 0) {
            bool7 = bool11;
            zVar2 = zVar4;
        } else {
            bool7 = bool11;
            zVar2 = list;
        }
        String str21 = (i & 262144) != 0 ? null : str10;
        Object obj2 = (i & 524288) != 0 ? null : obj;
        long j2 = (i & 1048576) != 0 ? 0L : j;
        SkipEvents skipEvents2 = (i & 2097152) != 0 ? null : skipEvents;
        if ((i & 4194304) != 0) {
            bool8 = bool10;
            zVar3 = zVar4;
        } else {
            bool8 = bool10;
            zVar3 = list2;
        }
        String str22 = (i & 8388608) != 0 ? null : str11;
        String str23 = (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str12;
        j.f(str, "id");
        j.f(str13, "channelId");
        j.f(tVar, "resourceType");
        j.f(zVar, "subtitleLocales");
        j.f(zVar2, "thumbnails");
        j.f(zVar3, "versions");
        this.a = str;
        this.b = str13;
        this.c = str14;
        this.d = str15;
        this.e = tVar;
        this.f = str16;
        this.g = str17;
        this.h = str18;
        this.i = str19;
        this.j = str20;
        this.k = bool9;
        this.l = bool8;
        this.m = bool7;
        this.n = bool12;
        this.o = bool6;
        this.p = zVar;
        this.q = l2;
        this.r = zVar2;
        this.s = str21;
        this.t = obj2;
        this.u = j2;
        this.v = skipEvents2;
        this.w = zVar3;
        this.x = str22;
        this.y = str23;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && j.a(this.b, eVar.b) && j.a(this.c, eVar.c) && j.a(this.d, eVar.d) && this.e == eVar.e && j.a(this.f, eVar.f) && j.a(this.g, eVar.g) && j.a(this.h, eVar.h) && j.a(this.i, eVar.i) && j.a(this.j, eVar.j) && j.a(this.k, eVar.k) && j.a(this.l, eVar.l) && j.a(this.m, eVar.m) && j.a(this.n, eVar.n) && j.a(this.o, eVar.o) && j.a(this.p, eVar.p) && j.a(this.q, eVar.q) && j.a(this.r, eVar.r) && j.a(this.s, eVar.s) && j.a(this.t, eVar.t) && this.u == eVar.u && j.a(this.v, eVar.v) && j.a(this.w, eVar.w) && j.a(this.x, eVar.x) && j.a(this.y, eVar.y)) {
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
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a = l1.a(this.e, (i2 + hashCode2) * 31, 31);
        String str3 = this.f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (a + hashCode3) * 31;
        String str4 = this.g;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.h;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str6 = this.i;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str7 = this.j;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Boolean bool = this.k;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        Boolean bool2 = this.l;
        if (bool2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool2.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        Boolean bool3 = this.m;
        if (bool3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool3.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        Boolean bool4 = this.n;
        if (bool4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool4.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        Boolean bool5 = this.o;
        if (bool5 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool5.hashCode();
        }
        int a2 = defpackage.a.a(this.p, (i11 + hashCode12) * 31, 31);
        Long l = this.q;
        if (l == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l.hashCode();
        }
        int a3 = defpackage.a.a(this.r, (a2 + hashCode13) * 31, 31);
        String str8 = this.s;
        if (str8 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str8.hashCode();
        }
        int i12 = (a3 + hashCode14) * 31;
        Object obj = this.t;
        if (obj == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = obj.hashCode();
        }
        int a4 = i.a(this.u, (i12 + hashCode15) * 31, 31);
        SkipEvents skipEvents = this.v;
        if (skipEvents == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = skipEvents.hashCode();
        }
        int a5 = defpackage.a.a(this.w, (a4 + hashCode16) * 31, 31);
        String str9 = this.x;
        if (str9 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str9.hashCode();
        }
        int i13 = (a5 + hashCode17) * 31;
        String str10 = this.y;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return i13 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerVideoMetadata(id=");
        sb.append(this.a);
        sb.append(", channelId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", parentId=");
        sb.append(this.d);
        sb.append(", resourceType=");
        sb.append(this.e);
        sb.append(", episodeTitle=");
        sb.append(this.f);
        sb.append(", episodeNumber=");
        sb.append(this.g);
        sb.append(", seasonTitle=");
        sb.append(this.h);
        sb.append(", seasonNumber=");
        sb.append(this.i);
        sb.append(", seriesTitle=");
        sb.append(this.j);
        sb.append(", isPremiumOnly=");
        sb.append(this.k);
        sb.append(", isMature=");
        sb.append(this.l);
        sb.append(", isMatureBlocked=");
        sb.append(this.m);
        sb.append(", isSubbed=");
        sb.append(this.n);
        sb.append(", isDubbed=");
        sb.append(this.o);
        sb.append(", subtitleLocales=");
        sb.append(this.p);
        sb.append(", durationMs=");
        sb.append(this.q);
        sb.append(", thumbnails=");
        sb.append(this.r);
        sb.append(", audioLocale=");
        sb.append(this.s);
        sb.append(", tag=");
        sb.append(this.t);
        sb.append(", screenStartTime=");
        sb.append(this.u);
        sb.append(", skipEvents=");
        sb.append(this.v);
        sb.append(", versions=");
        sb.append(this.w);
        sb.append(", extendedMaturityRating=");
        sb.append(this.x);
        sb.append(", ratingSystem=");
        return defpackage.b.c(sb, this.y, ")");
    }
}
