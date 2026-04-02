package com.amazon.aps.iva.hw;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: KalturaDownloadItem.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;
    public final c c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;

    public a(String str, String str2, c cVar, long j, long j2, String str3, String str4) {
        j.f(cVar, "state");
        this.a = str;
        this.b = str2;
        this.c = cVar;
        this.d = j;
        this.e = j2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && j.a(this.f, aVar.f) && j.a(this.g, aVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        int a = i.a(this.e, i.a(this.d, (this.c.hashCode() + b) * 31, 31), 31);
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.g.hashCode() + ((a + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KalturaDownloadItem(itemId=");
        sb.append(this.a);
        sb.append(", contentURL=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", estimatedSizeBytes=");
        sb.append(this.d);
        sb.append(", downloadedSizeBytes=");
        sb.append(this.e);
        sb.append(", playbackPath=");
        sb.append(this.f);
        sb.append(", dataDir=");
        return defpackage.b.c(sb, this.g, ")");
    }
}
