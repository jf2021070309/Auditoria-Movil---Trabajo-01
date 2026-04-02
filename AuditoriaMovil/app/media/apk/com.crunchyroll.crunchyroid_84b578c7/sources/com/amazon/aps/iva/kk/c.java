package com.amazon.aps.iva.kk;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.qj.j;
import com.amazon.aps.iva.qj.k;
import com.amazon.aps.iva.qj.l;
import com.amazon.aps.iva.qj.m;
import com.amazon.aps.iva.qj.t;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import okhttp3.internal.http2.Http2;
/* compiled from: VideoMetaContent.kt */
/* loaded from: classes.dex */
public final class c {
    public final String A;
    public final List<String> B;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final m m;
    public final List<com.amazon.aps.iva.qj.a> n;
    public final String o;
    public final String p;
    public final j q;
    public final k r;
    public final long s;
    public final Object t;
    public final String u;
    public final List<l> v;
    public final String w;
    public final t x;
    public final List<String> y;
    public final String z;

    public c() {
        this(null, null, null, null, null, null, null, null, null, false, false, false, null, 0L, null, null, null, null, null, null, null, null, null, 268435455);
    }

    public static c a(c cVar, m mVar, String str, String str2, j jVar, k kVar, long j, int i) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z;
        boolean z2;
        boolean z3;
        m mVar2;
        List<com.amazon.aps.iva.qj.a> list;
        String str12;
        String str13;
        j jVar2;
        k kVar2;
        long j2;
        Object obj;
        String str14;
        List<l> list2;
        String str15;
        t tVar;
        List<String> list3;
        String str16;
        String str17;
        List<String> list4;
        if ((i & 1) != 0) {
            str3 = cVar.a;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = cVar.b;
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str5 = cVar.c;
        } else {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str6 = cVar.d;
        } else {
            str6 = null;
        }
        if ((i & 16) != 0) {
            str7 = cVar.e;
        } else {
            str7 = null;
        }
        if ((i & 32) != 0) {
            str8 = cVar.f;
        } else {
            str8 = null;
        }
        if ((i & 64) != 0) {
            str9 = cVar.g;
        } else {
            str9 = null;
        }
        if ((i & 128) != 0) {
            str10 = cVar.h;
        } else {
            str10 = null;
        }
        if ((i & 256) != 0) {
            str11 = cVar.i;
        } else {
            str11 = null;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            z = cVar.j;
        } else {
            z = false;
        }
        if ((i & 1024) != 0) {
            z2 = cVar.k;
        } else {
            z2 = false;
        }
        if ((i & 2048) != 0) {
            z3 = cVar.l;
        } else {
            z3 = false;
        }
        if ((i & 4096) != 0) {
            mVar2 = cVar.m;
        } else {
            mVar2 = mVar;
        }
        if ((i & 8192) != 0) {
            list = cVar.n;
        } else {
            list = null;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str12 = cVar.o;
        } else {
            str12 = str;
        }
        if ((32768 & i) != 0) {
            str13 = cVar.p;
        } else {
            str13 = str2;
        }
        if ((65536 & i) != 0) {
            jVar2 = cVar.q;
        } else {
            jVar2 = jVar;
        }
        if ((131072 & i) != 0) {
            kVar2 = cVar.r;
        } else {
            kVar2 = kVar;
        }
        if ((262144 & i) != 0) {
            j2 = cVar.s;
        } else {
            j2 = j;
        }
        if ((524288 & i) != 0) {
            obj = cVar.t;
        } else {
            obj = null;
        }
        if ((1048576 & i) != 0) {
            str14 = cVar.u;
        } else {
            str14 = null;
        }
        if ((2097152 & i) != 0) {
            list2 = cVar.v;
        } else {
            list2 = null;
        }
        if ((4194304 & i) != 0) {
            str15 = cVar.w;
        } else {
            str15 = null;
        }
        if ((8388608 & i) != 0) {
            tVar = cVar.x;
        } else {
            tVar = null;
        }
        if ((16777216 & i) != 0) {
            list3 = cVar.y;
        } else {
            list3 = null;
        }
        if ((33554432 & i) != 0) {
            str16 = cVar.z;
        } else {
            str16 = null;
        }
        if ((67108864 & i) != 0) {
            str17 = cVar.A;
        } else {
            str17 = null;
        }
        if ((i & 134217728) != 0) {
            list4 = cVar.B;
        } else {
            list4 = null;
        }
        cVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str3, "id");
        com.amazon.aps.iva.yb0.j.f(str4, "channelId");
        com.amazon.aps.iva.yb0.j.f(list, "thumbnails");
        return new c(str3, str4, str5, str6, str7, str8, str9, str10, str11, z, z2, z3, mVar2, list, str12, str13, jVar2, kVar2, j2, obj, str14, list2, str15, tVar, list3, str16, str17, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, cVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, cVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, cVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, cVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, cVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, cVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, cVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, cVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, cVar.i) && this.j == cVar.j && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && com.amazon.aps.iva.yb0.j.a(this.n, cVar.n) && com.amazon.aps.iva.yb0.j.a(this.o, cVar.o) && com.amazon.aps.iva.yb0.j.a(this.p, cVar.p) && this.q == cVar.q && this.r == cVar.r && this.s == cVar.s && com.amazon.aps.iva.yb0.j.a(this.t, cVar.t) && com.amazon.aps.iva.yb0.j.a(this.u, cVar.u) && com.amazon.aps.iva.yb0.j.a(this.v, cVar.v) && com.amazon.aps.iva.yb0.j.a(this.w, cVar.w) && com.amazon.aps.iva.yb0.j.a(this.x, cVar.x) && com.amazon.aps.iva.yb0.j.a(this.y, cVar.y) && com.amazon.aps.iva.yb0.j.a(this.z, cVar.z) && com.amazon.aps.iva.yb0.j.a(this.A, cVar.A) && com.amazon.aps.iva.yb0.j.a(this.B, cVar.B)) {
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
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.g;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.h;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.i;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        int i9 = 1;
        boolean z = this.j;
        int i10 = z;
        if (z != 0) {
            i10 = 1;
        }
        int i11 = (i8 + i10) * 31;
        boolean z2 = this.k;
        int i12 = z2;
        if (z2 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z3 = this.l;
        if (!z3) {
            i9 = z3 ? 1 : 0;
        }
        int i14 = (i13 + i9) * 31;
        m mVar = this.m;
        if (mVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = mVar.hashCode();
        }
        int a = defpackage.a.a(this.n, (i14 + hashCode8) * 31, 31);
        String str8 = this.o;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i15 = (a + hashCode9) * 31;
        String str9 = this.p;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i16 = (i15 + hashCode10) * 31;
        j jVar = this.q;
        if (jVar == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = jVar.hashCode();
        }
        int i17 = (i16 + hashCode11) * 31;
        k kVar = this.r;
        if (kVar == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = kVar.hashCode();
        }
        int a2 = i.a(this.s, (i17 + hashCode12) * 31, 31);
        Object obj = this.t;
        if (obj == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = obj.hashCode();
        }
        int i18 = (a2 + hashCode13) * 31;
        String str10 = this.u;
        if (str10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str10.hashCode();
        }
        int i19 = (i18 + hashCode14) * 31;
        List<l> list = this.v;
        if (list == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = list.hashCode();
        }
        int i20 = (i19 + hashCode15) * 31;
        String str11 = this.w;
        if (str11 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str11.hashCode();
        }
        int i21 = (i20 + hashCode16) * 31;
        t tVar = this.x;
        if (tVar == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = tVar.hashCode();
        }
        int i22 = (i21 + hashCode17) * 31;
        List<String> list2 = this.y;
        if (list2 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = list2.hashCode();
        }
        int i23 = (i22 + hashCode18) * 31;
        String str12 = this.z;
        if (str12 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str12.hashCode();
        }
        int i24 = (i23 + hashCode19) * 31;
        String str13 = this.A;
        if (str13 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str13.hashCode();
        }
        int i25 = (i24 + hashCode20) * 31;
        List<String> list3 = this.B;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return i25 + i;
    }

    public final String toString() {
        return "VideoMetaContent(id=" + this.a + ", channelId=" + this.b + ", title=" + this.c + ", episodeTitle=" + this.d + ", episodeNumber=" + this.e + ", seasonTitle=" + this.f + ", seasonNumber=" + this.g + ", parentId=" + this.h + ", resourceType=" + this.i + ", isPremiumOnly=" + this.j + ", isMature=" + this.k + ", isMatureBlocked=" + this.l + ", downloadState=" + this.m + ", thumbnails=" + this.n + ", bifUrl=" + this.o + ", streamUrl=" + this.p + ", streamProtocol=" + this.q + ", streamType=" + this.r + ", duration=" + this.s + ", tag=" + this.t + ", amazonA9params=" + this.u + ", audioVersions=" + this.v + ", audioLocale=" + this.w + ", skipEvents=" + this.x + ", maturityRatings=" + this.y + ", extendedMaturityRating=" + this.z + ", ratingSystem=" + this.A + ", contentDescriptors=" + this.B + ')';
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, m mVar, List<com.amazon.aps.iva.qj.a> list, String str10, String str11, j jVar, k kVar, long j, Object obj, String str12, List<l> list2, String str13, t tVar, List<String> list3, String str14, String str15, List<String> list4) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(str2, "channelId");
        com.amazon.aps.iva.yb0.j.f(list, "thumbnails");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = mVar;
        this.n = list;
        this.o = str10;
        this.p = str11;
        this.q = jVar;
        this.r = kVar;
        this.s = j;
        this.t = obj;
        this.u = str12;
        this.v = list2;
        this.w = str13;
        this.x = tVar;
        this.y = list3;
        this.z = str14;
        this.A = str15;
        this.B = list4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c(java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, boolean r43, boolean r44, boolean r45, java.util.List r46, long r47, java.lang.Object r49, java.lang.String r50, java.util.List r51, java.lang.String r52, com.amazon.aps.iva.qj.t r53, java.util.List r54, java.lang.String r55, java.lang.String r56, java.util.List r57, int r58) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.kk.c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.util.List, long, java.lang.Object, java.lang.String, java.util.List, java.lang.String, com.amazon.aps.iva.qj.t, java.util.List, java.lang.String, java.lang.String, java.util.List, int):void");
    }
}
