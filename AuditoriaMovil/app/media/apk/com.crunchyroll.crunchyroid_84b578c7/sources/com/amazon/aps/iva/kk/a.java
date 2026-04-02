package com.amazon.aps.iva.kk;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: PlayerAdConfiguration.kt */
/* loaded from: classes.dex */
public final class a {
    public final int A;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final Boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final int o;
    public final String p;
    public final String q;
    public final int r;
    public final String s;
    public final int t;
    public final int u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final int z;

    public a() {
        this(false, false, null, null, null, null, null, 134217727);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && this.f == aVar.f && j.a(this.g, aVar.g) && j.a(this.h, aVar.h) && j.a(this.i, aVar.i) && j.a(this.j, aVar.j) && this.k == aVar.k && this.l == aVar.l && j.a(this.m, aVar.m) && j.a(this.n, aVar.n) && this.o == aVar.o && j.a(this.p, aVar.p) && j.a(this.q, aVar.q) && this.r == aVar.r && j.a(this.s, aVar.s) && this.t == aVar.t && this.u == aVar.u && j.a(this.v, aVar.v) && j.a(this.w, aVar.w) && j.a(this.x, aVar.x) && j.a(this.y, aVar.y) && this.z == aVar.z && this.A == aVar.A) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        int i = 1;
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = r1 * 31;
        ?? r2 = this.b;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        ?? r22 = this.c;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int b = com.amazon.aps.iva.c80.a.b(this.d, (i4 + i5) * 31, 31);
        Boolean bool = this.e;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i6 = (b + hashCode) * 31;
        ?? r23 = this.f;
        int i7 = r23;
        if (r23 != 0) {
            i7 = 1;
        }
        int b2 = com.amazon.aps.iva.c80.a.b(this.j, com.amazon.aps.iva.c80.a.b(this.i, com.amazon.aps.iva.c80.a.b(this.h, com.amazon.aps.iva.c80.a.b(this.g, (i6 + i7) * 31, 31), 31), 31), 31);
        ?? r24 = this.k;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (b2 + i8) * 31;
        boolean z2 = this.l;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return Integer.hashCode(this.A) + r.a(this.z, com.amazon.aps.iva.c80.a.b(this.y, com.amazon.aps.iva.c80.a.b(this.x, com.amazon.aps.iva.c80.a.b(this.w, com.amazon.aps.iva.c80.a.b(this.v, r.a(this.u, r.a(this.t, com.amazon.aps.iva.c80.a.b(this.s, r.a(this.r, com.amazon.aps.iva.c80.a.b(this.q, com.amazon.aps.iva.c80.a.b(this.p, r.a(this.o, com.amazon.aps.iva.c80.a.b(this.n, com.amazon.aps.iva.c80.a.b(this.m, (i9 + i) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerAdConfiguration(enableTruex=");
        sb.append(this.a);
        sb.append(", enableMuxMonitoring=");
        sb.append(this.b);
        sb.append(", enableTruexRateLimiter=");
        sb.append(this.c);
        sb.append(", adId=");
        sb.append(this.d);
        sb.append(", isLimitedAdTrackingEnabled=");
        sb.append(this.e);
        sb.append(", isAmazon=");
        sb.append(this.f);
        sb.append(", idType=");
        sb.append(this.g);
        sb.append(", iuType=");
        sb.append(this.h);
        sb.append(", userId=");
        sb.append(this.i);
        sb.append(", packageName=");
        sb.append(this.j);
        sb.append(", hideDefaultControls=");
        sb.append(this.k);
        sb.append(", enableInteractiveAds=");
        sb.append(this.l);
        sb.append(", adHost=");
        sb.append(this.m);
        sb.append(", env=");
        sb.append(this.n);
        sb.append(", unviewedPositionStart=");
        sb.append(this.o);
        sb.append(", impl=");
        sb.append(this.p);
        sb.append(", videoAdType=");
        sb.append(this.q);
        sb.append(", adManagerSchemaIndicator=");
        sb.append(this.r);
        sb.append(", output=");
        sb.append(this.s);
        sb.append(", adRule=");
        sb.append(this.t);
        sb.append(", tagForChildDirected=");
        sb.append(this.u);
        sb.append(", size=");
        sb.append(this.v);
        sb.append(", contentSourceId=");
        sb.append(this.w);
        sb.append(", appName=");
        sb.append(this.x);
        sb.append(", descriptionUrl=");
        sb.append(this.y);
        sb.append(", videoPlayMute=");
        sb.append(this.z);
        sb.append(", videoPlaylistInred=");
        return b2.b(sb, this.A, ')');
    }

    public a(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, int i) {
        int i2;
        String str6;
        boolean z3;
        String str7;
        boolean z4;
        String str8;
        boolean z5;
        String str9;
        boolean z6 = (i & 1) != 0 ? false : z;
        boolean z7 = (i & 2) != 0;
        boolean z8 = (i & 4) != 0 ? true : z2;
        String str10 = (i & 8) != 0 ? "" : str;
        String str11 = (i & 64) != 0 ? "" : str2;
        String str12 = (i & 128) != 0 ? "" : str3;
        String str13 = (i & 256) != 0 ? "" : str4;
        String str14 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? str5 : "";
        boolean z9 = (i & 1024) != 0;
        String str15 = (i & 4096) != 0 ? "https://pubads.g.doubleclick.net/gampad/ads?" : null;
        String str16 = (i & 8192) != 0 ? "vp" : null;
        int i3 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 1 : 0;
        String str17 = (i & 32768) != 0 ? "s" : null;
        String str18 = (i & Cast.MAX_MESSAGE_LENGTH) != 0 ? "linear" : null;
        int i4 = (i & 131072) != 0 ? 1 : 0;
        if ((i & 262144) != 0) {
            i2 = i3;
            str6 = "vmap";
        } else {
            i2 = i3;
            str6 = null;
        }
        int i5 = (i & 524288) != 0 ? 1 : 0;
        if ((i & 2097152) != 0) {
            z3 = z9;
            str7 = "640x360%7C848x480%7C1280x720%7C1920x1080";
        } else {
            z3 = z9;
            str7 = null;
        }
        if ((i & 4194304) != 0) {
            z4 = z8;
            str8 = "2630330";
        } else {
            z4 = z8;
            str8 = null;
        }
        if ((i & 8388608) != 0) {
            z5 = z7;
            str9 = "Crunchyroll";
        } else {
            z5 = z7;
            str9 = null;
        }
        String str19 = (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? "https%3A%2F%2Fwww.crunchyroll.com%2Fabout%2Findex.html" : null;
        int i6 = (i & 67108864) != 0 ? 1 : 0;
        j.f(str10, "adId");
        j.f(str11, "idType");
        j.f(str12, "iuType");
        j.f(str13, "userId");
        j.f(str14, "packageName");
        j.f(str15, "adHost");
        j.f(str16, "env");
        j.f(str17, "impl");
        j.f(str18, "videoAdType");
        j.f(str6, "output");
        j.f(str7, "size");
        j.f(str8, "contentSourceId");
        j.f(str9, "appName");
        j.f(str19, "descriptionUrl");
        this.a = z6;
        this.b = z5;
        this.c = z4;
        this.d = str10;
        this.e = null;
        this.f = false;
        this.g = str11;
        this.h = str12;
        this.i = str13;
        this.j = str14;
        this.k = z3;
        this.l = false;
        this.m = str15;
        this.n = str16;
        this.o = i2;
        this.p = str17;
        this.q = str18;
        this.r = i4;
        this.s = str6;
        this.t = i5;
        this.u = 0;
        this.v = str7;
        this.w = str8;
        this.x = str9;
        this.y = str19;
        this.z = 0;
        this.A = i6;
    }
}
