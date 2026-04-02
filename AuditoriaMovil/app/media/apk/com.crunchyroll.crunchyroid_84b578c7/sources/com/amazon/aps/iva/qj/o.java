package com.amazon.aps.iva.qj;

import com.amazon.aps.iva.o0.t1;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import okhttp3.internal.http2.Http2;
/* compiled from: VideoMetadataContent.kt */
/* loaded from: classes.dex */
public final class o {
    public final String A;
    public final String B;
    public final List<l> C;
    public final t D;
    public final List<String> E;
    public final String F;
    public final String G;
    public final List<String> H;
    public final d I;
    public final String J;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Boolean n;
    public final Boolean o;
    public final List<String> p;
    public final String q;
    public final String r;
    public final long s;
    public final long t;
    public final Long u;
    public final List<a> v;
    public final String w;
    public final Boolean x;
    public final Object y;
    public final String z;

    public o() {
        this(null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, -1, 15);
    }

    public static o a(o oVar, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, long j, long j2, Long l, Boolean bool, String str10, d dVar, int i, int i2) {
        String str11 = (i & 1) != 0 ? oVar.a : str;
        String str12 = (i & 2) != 0 ? oVar.b : null;
        String str13 = (i & 4) != 0 ? oVar.c : str2;
        String str14 = (i & 8) != 0 ? oVar.d : str3;
        String str15 = (i & 16) != 0 ? oVar.e : str4;
        String str16 = (i & 32) != 0 ? oVar.f : str5;
        String str17 = (i & 64) != 0 ? oVar.g : null;
        String str18 = (i & 128) != 0 ? oVar.h : str6;
        Integer num2 = (i & 256) != 0 ? oVar.i : num;
        String str19 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? oVar.j : str7;
        boolean z = (i & 1024) != 0 ? oVar.k : false;
        boolean z2 = (i & 2048) != 0 ? oVar.l : false;
        boolean z3 = (i & 4096) != 0 ? oVar.m : false;
        Boolean bool2 = (i & 8192) != 0 ? oVar.n : null;
        Boolean bool3 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? oVar.o : null;
        List<String> list = (32768 & i) != 0 ? oVar.p : null;
        String str20 = (65536 & i) != 0 ? oVar.q : str8;
        boolean z4 = z2;
        String str21 = (i & 131072) != 0 ? oVar.r : str9;
        Integer num3 = num2;
        String str22 = str19;
        long j3 = (i & 262144) != 0 ? oVar.s : j;
        long j4 = (524288 & i) != 0 ? oVar.t : j2;
        Long l2 = (1048576 & i) != 0 ? oVar.u : l;
        List<a> list2 = (2097152 & i) != 0 ? oVar.v : null;
        String str23 = (4194304 & i) != 0 ? oVar.w : null;
        Boolean bool4 = (8388608 & i) != 0 ? oVar.x : bool;
        Object obj = (16777216 & i) != 0 ? oVar.y : null;
        String str24 = (33554432 & i) != 0 ? oVar.z : null;
        String str25 = (67108864 & i) != 0 ? oVar.A : str10;
        String str26 = (134217728 & i) != 0 ? oVar.B : null;
        List<l> list3 = (268435456 & i) != 0 ? oVar.C : null;
        t tVar = (536870912 & i) != 0 ? oVar.D : null;
        List<String> list4 = (1073741824 & i) != 0 ? oVar.E : null;
        String str27 = (i & Integer.MIN_VALUE) != 0 ? oVar.F : null;
        String str28 = (i2 & 1) != 0 ? oVar.G : null;
        List<String> list5 = (i2 & 2) != 0 ? oVar.H : null;
        d dVar2 = (i2 & 4) != 0 ? oVar.I : dVar;
        String str29 = (i2 & 8) != 0 ? oVar.J : null;
        oVar.getClass();
        com.amazon.aps.iva.yb0.j.f(list, "subtitleLocales");
        com.amazon.aps.iva.yb0.j.f(str20, "preferredSubtitleLanguage");
        com.amazon.aps.iva.yb0.j.f(str21, "preferredAudioLanguage");
        com.amazon.aps.iva.yb0.j.f(list2, "thumbnails");
        com.amazon.aps.iva.yb0.j.f(dVar2, "playbackSource");
        return new o(str11, str12, str13, str14, str15, str16, str17, str18, num3, str22, z, z4, z3, bool2, bool3, list, str20, str21, j3, j4, l2, list2, str23, bool4, obj, str24, str25, str26, list3, tVar, list4, str27, str28, list5, dVar2, str29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, oVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, oVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, oVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, oVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, oVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, oVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, oVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, oVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, oVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, oVar.j) && this.k == oVar.k && this.l == oVar.l && this.m == oVar.m && com.amazon.aps.iva.yb0.j.a(this.n, oVar.n) && com.amazon.aps.iva.yb0.j.a(this.o, oVar.o) && com.amazon.aps.iva.yb0.j.a(this.p, oVar.p) && com.amazon.aps.iva.yb0.j.a(this.q, oVar.q) && com.amazon.aps.iva.yb0.j.a(this.r, oVar.r) && this.s == oVar.s && this.t == oVar.t && com.amazon.aps.iva.yb0.j.a(this.u, oVar.u) && com.amazon.aps.iva.yb0.j.a(this.v, oVar.v) && com.amazon.aps.iva.yb0.j.a(this.w, oVar.w) && com.amazon.aps.iva.yb0.j.a(this.x, oVar.x) && com.amazon.aps.iva.yb0.j.a(this.y, oVar.y) && com.amazon.aps.iva.yb0.j.a(this.z, oVar.z) && com.amazon.aps.iva.yb0.j.a(this.A, oVar.A) && com.amazon.aps.iva.yb0.j.a(this.B, oVar.B) && com.amazon.aps.iva.yb0.j.a(this.C, oVar.C) && com.amazon.aps.iva.yb0.j.a(this.D, oVar.D) && com.amazon.aps.iva.yb0.j.a(this.E, oVar.E) && com.amazon.aps.iva.yb0.j.a(this.F, oVar.F) && com.amazon.aps.iva.yb0.j.a(this.G, oVar.G) && com.amazon.aps.iva.yb0.j.a(this.H, oVar.H) && this.I == oVar.I && com.amazon.aps.iva.yb0.j.a(this.J, oVar.J)) {
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
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.h;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Integer num = this.i;
        if (num == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str9 = this.j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        int i12 = 1;
        boolean z = this.k;
        int i13 = z;
        if (z != 0) {
            i13 = 1;
        }
        int i14 = (i11 + i13) * 31;
        boolean z2 = this.l;
        int i15 = z2;
        if (z2 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z3 = this.m;
        if (!z3) {
            i12 = z3 ? 1 : 0;
        }
        int i17 = (i16 + i12) * 31;
        Boolean bool = this.n;
        if (bool == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool.hashCode();
        }
        int i18 = (i17 + hashCode11) * 31;
        Boolean bool2 = this.o;
        if (bool2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool2.hashCode();
        }
        int a = com.amazon.aps.iva.b8.i.a(this.t, com.amazon.aps.iva.b8.i.a(this.s, com.amazon.aps.iva.c80.a.b(this.r, com.amazon.aps.iva.c80.a.b(this.q, defpackage.a.a(this.p, (i18 + hashCode12) * 31, 31), 31), 31), 31), 31);
        Long l = this.u;
        if (l == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l.hashCode();
        }
        int a2 = defpackage.a.a(this.v, (a + hashCode13) * 31, 31);
        String str10 = this.w;
        if (str10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str10.hashCode();
        }
        int i19 = (a2 + hashCode14) * 31;
        Boolean bool3 = this.x;
        if (bool3 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = bool3.hashCode();
        }
        int i20 = (i19 + hashCode15) * 31;
        Object obj = this.y;
        if (obj == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = obj.hashCode();
        }
        int i21 = (i20 + hashCode16) * 31;
        String str11 = this.z;
        if (str11 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str11.hashCode();
        }
        int i22 = (i21 + hashCode17) * 31;
        String str12 = this.A;
        if (str12 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str12.hashCode();
        }
        int i23 = (i22 + hashCode18) * 31;
        String str13 = this.B;
        if (str13 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str13.hashCode();
        }
        int i24 = (i23 + hashCode19) * 31;
        List<l> list = this.C;
        if (list == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = list.hashCode();
        }
        int i25 = (i24 + hashCode20) * 31;
        t tVar = this.D;
        if (tVar == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = tVar.hashCode();
        }
        int i26 = (i25 + hashCode21) * 31;
        List<String> list2 = this.E;
        if (list2 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = list2.hashCode();
        }
        int i27 = (i26 + hashCode22) * 31;
        String str14 = this.F;
        if (str14 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str14.hashCode();
        }
        int i28 = (i27 + hashCode23) * 31;
        String str15 = this.G;
        if (str15 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = str15.hashCode();
        }
        int i29 = (i28 + hashCode24) * 31;
        List<String> list3 = this.H;
        if (list3 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = list3.hashCode();
        }
        int hashCode26 = (this.I.hashCode() + ((i29 + hashCode25) * 31)) * 31;
        String str16 = this.J;
        if (str16 != null) {
            i = str16.hashCode();
        }
        return hashCode26 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMetadataContent(id=");
        sb.append(this.a);
        sb.append(", channelId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", resourceType=");
        sb.append(this.d);
        sb.append(", episodeTitle=");
        sb.append(this.e);
        sb.append(", episodeNumber=");
        sb.append(this.f);
        sb.append(", parentId=");
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
        sb.append(", preferredSubtitleLanguage=");
        sb.append(this.q);
        sb.append(", preferredAudioLanguage=");
        sb.append(this.r);
        sb.append(", initialStartTime=");
        sb.append(this.s);
        sb.append(", initialClickTime=");
        sb.append(this.t);
        sb.append(", durationMs=");
        sb.append(this.u);
        sb.append(", thumbnails=");
        sb.append(this.v);
        sb.append(", sessionStartType=");
        sb.append(this.w);
        sb.append(", mediaAdSupported=");
        sb.append(this.x);
        sb.append(", tag=");
        sb.append(this.y);
        sb.append(", amazonA9params=");
        sb.append(this.z);
        sb.append(", audioLocale=");
        sb.append(this.A);
        sb.append(", subtitleLocale=");
        sb.append(this.B);
        sb.append(", audioVersions=");
        sb.append(this.C);
        sb.append(", skipEvents=");
        sb.append(this.D);
        sb.append(", maturityRatings=");
        sb.append(this.E);
        sb.append(", extendedMaturityRating=");
        sb.append(this.F);
        sb.append(", ratingSystem=");
        sb.append(this.G);
        sb.append(", contentDescriptors=");
        sb.append(this.H);
        sb.append(", playbackSource=");
        sb.append(this.I);
        sb.append(", streamLink=");
        return t1.b(sb, this.J, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ o(java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.Integer r52, java.lang.String r53, boolean r54, boolean r55, boolean r56, java.lang.Boolean r57, java.lang.Boolean r58, java.util.List r59, long r60, long r62, java.lang.Long r64, java.util.List r65, java.lang.String r66, java.lang.Object r67, java.lang.String r68, java.util.ArrayList r69, com.amazon.aps.iva.qj.t r70, java.util.List r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qj.o.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, boolean, boolean, boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, long, long, java.lang.Long, java.util.List, java.lang.String, java.lang.Object, java.lang.String, java.util.ArrayList, com.amazon.aps.iva.qj.t, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    public o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, boolean z, boolean z2, boolean z3, Boolean bool, Boolean bool2, List<String> list, String str10, String str11, long j, long j2, Long l, List<a> list2, String str12, Boolean bool3, Object obj, String str13, String str14, String str15, List<l> list3, t tVar, List<String> list4, String str16, String str17, List<String> list5, d dVar, String str18) {
        com.amazon.aps.iva.yb0.j.f(list, "subtitleLocales");
        com.amazon.aps.iva.yb0.j.f(str10, "preferredSubtitleLanguage");
        com.amazon.aps.iva.yb0.j.f(str11, "preferredAudioLanguage");
        com.amazon.aps.iva.yb0.j.f(list2, "thumbnails");
        com.amazon.aps.iva.yb0.j.f(dVar, "playbackSource");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = num;
        this.j = str9;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = bool;
        this.o = bool2;
        this.p = list;
        this.q = str10;
        this.r = str11;
        this.s = j;
        this.t = j2;
        this.u = l;
        this.v = list2;
        this.w = str12;
        this.x = bool3;
        this.y = obj;
        this.z = str13;
        this.A = str14;
        this.B = str15;
        this.C = list3;
        this.D = tVar;
        this.E = list4;
        this.F = str16;
        this.G = str17;
        this.H = list5;
        this.I = dVar;
        this.J = str18;
    }
}
