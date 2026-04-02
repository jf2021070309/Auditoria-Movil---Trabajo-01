package com.amazon.aps.iva.mk;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MuxVideoData.kt */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;

    public c(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7) {
        j.f(str, "videoId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b) && j.a(this.c, cVar.c) && j.a(this.d, cVar.d) && this.e == cVar.e && j.a(this.f, cVar.f) && j.a(this.g, cVar.g) && j.a(this.h, cVar.h)) {
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
        int hashCode6 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int a = i.a(this.e, (i3 + hashCode3) * 31, 31);
        String str4 = this.f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (a + hashCode4) * 31;
        String str5 = this.g;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str6 = this.h;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MuxVideoData(videoId=");
        sb.append(this.a);
        sb.append(", videoTitle=");
        sb.append(this.b);
        sb.append(", videoSeries=");
        sb.append(this.c);
        sb.append(", videoSourceUrl=");
        sb.append(this.d);
        sb.append(", videoDuration=");
        sb.append(this.e);
        sb.append(", videoContentType=");
        sb.append(this.f);
        sb.append(", videoStreamType=");
        sb.append(this.g);
        sb.append(", audioLocale=");
        return t1.b(sb, this.h, ')');
    }
}
