package com.amazon.aps.iva.qj;

import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.o0.t1;
import com.google.android.gms.ads.AdRequest;
/* compiled from: VideoSessionComplete.kt */
/* loaded from: classes.dex */
public final class p {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final String h;
    public final String i;
    public final float j;
    public final String k;
    public final String l;
    public final String m;

    public p() {
        this(0);
    }

    public static p a(p pVar, long j, long j2, long j3, long j4, int i, long j5, String str, String str2, float f, String str3, String str4, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        int i3;
        long j11;
        String str5;
        String str6;
        float f2;
        String str7;
        String str8;
        String str9;
        if ((i2 & 1) != 0) {
            j6 = pVar.a;
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = pVar.b;
        } else {
            j7 = 0;
        }
        long j12 = j7;
        if ((i2 & 4) != 0) {
            j8 = pVar.c;
        } else {
            j8 = j2;
        }
        if ((i2 & 8) != 0) {
            j9 = pVar.d;
        } else {
            j9 = j3;
        }
        if ((i2 & 16) != 0) {
            j10 = pVar.e;
        } else {
            j10 = j4;
        }
        if ((i2 & 32) != 0) {
            i3 = pVar.f;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            j11 = pVar.g;
        } else {
            j11 = j5;
        }
        if ((i2 & 128) != 0) {
            str5 = pVar.h;
        } else {
            str5 = str;
        }
        if ((i2 & 256) != 0) {
            str6 = pVar.i;
        } else {
            str6 = str2;
        }
        if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            f2 = pVar.j;
        } else {
            f2 = f;
        }
        if ((i2 & 1024) != 0) {
            str7 = pVar.k;
        } else {
            str7 = str3;
        }
        int i4 = i3;
        if ((i2 & 2048) != 0) {
            str8 = pVar.l;
        } else {
            str8 = str4;
        }
        if ((i2 & 4096) != 0) {
            str9 = pVar.m;
        } else {
            str9 = null;
        }
        pVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str5, "cdnAffinity");
        com.amazon.aps.iva.yb0.j.f(str6, "cdnInitialManifestUrl");
        com.amazon.aps.iva.yb0.j.f(str7, "sessionStartType");
        com.amazon.aps.iva.yb0.j.f(str8, "streamType");
        com.amazon.aps.iva.yb0.j.f(str9, "videoSessionType");
        return new p(j6, j12, j8, j9, j10, i4, j11, str5, str6, f2, str7, str8, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a == pVar.a && this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.e == pVar.e && this.f == pVar.f && this.g == pVar.g && com.amazon.aps.iva.yb0.j.a(this.h, pVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, pVar.i) && com.amazon.aps.iva.yb0.j.a(Float.valueOf(this.j), Float.valueOf(pVar.j)) && com.amazon.aps.iva.yb0.j.a(this.k, pVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, pVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, pVar.m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode() + com.amazon.aps.iva.c80.a.b(this.l, com.amazon.aps.iva.c80.a.b(this.k, t0.b(this.j, com.amazon.aps.iva.c80.a.b(this.i, com.amazon.aps.iva.c80.a.b(this.h, com.amazon.aps.iva.b8.i.a(this.g, com.amazon.aps.iva.a0.r.a(this.f, com.amazon.aps.iva.b8.i.a(this.e, com.amazon.aps.iva.b8.i.a(this.d, com.amazon.aps.iva.b8.i.a(this.c, com.amazon.aps.iva.b8.i.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSessionComplete(initialStartupTime=");
        sb.append(this.a);
        sb.append(", ppAdStreamLoadTime=");
        sb.append(this.b);
        sb.append(", ppManifestRequestTime=");
        sb.append(this.c);
        sb.append(", ppTimeFromClickToVideoStart=");
        sb.append(this.d);
        sb.append(", ppInitialBufferTime=");
        sb.append(this.e);
        sb.append(", playbackStallCount=");
        sb.append(this.f);
        sb.append(", playbackStallDuration=");
        sb.append(this.g);
        sb.append(", cdnAffinity=");
        sb.append(this.h);
        sb.append(", cdnInitialManifestUrl=");
        sb.append(this.i);
        sb.append(", playbackReportedTotalBitrateAvg=");
        sb.append(this.j);
        sb.append(", sessionStartType=");
        sb.append(this.k);
        sb.append(", streamType=");
        sb.append(this.l);
        sb.append(", videoSessionType=");
        return t1.b(sb, this.m, ')');
    }

    public p(long j, long j2, long j3, long j4, long j5, int i, long j6, String str, String str2, float f, String str3, String str4, String str5) {
        com.amazon.aps.iva.yb0.j.f(str, "cdnAffinity");
        com.amazon.aps.iva.yb0.j.f(str2, "cdnInitialManifestUrl");
        com.amazon.aps.iva.yb0.j.f(str3, "sessionStartType");
        com.amazon.aps.iva.yb0.j.f(str4, "streamType");
        com.amazon.aps.iva.yb0.j.f(str5, "videoSessionType");
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = i;
        this.g = j6;
        this.h = str;
        this.i = str2;
        this.j = f;
        this.k = str3;
        this.l = str4;
        this.m = str5;
    }

    public /* synthetic */ p(int i) {
        this(0L, 0L, 0L, 0L, 0L, 0, 0L, "", "", 0.0f, "", j.DASH.name(), q.ONLINE.name());
    }
}
