package com.amazon.aps.iva.wq;

import com.amazon.aps.iva.b8.i;
/* compiled from: ResourceTiming.kt */
/* loaded from: classes2.dex */
public final class a {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public a() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + i.a(this.i, i.a(this.h, i.a(this.g, i.a(this.f, i.a(this.e, i.a(this.d, i.a(this.c, i.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceTiming(dnsStart=");
        sb.append(this.a);
        sb.append(", dnsDuration=");
        sb.append(this.b);
        sb.append(", connectStart=");
        sb.append(this.c);
        sb.append(", connectDuration=");
        sb.append(this.d);
        sb.append(", sslStart=");
        sb.append(this.e);
        sb.append(", sslDuration=");
        sb.append(this.f);
        sb.append(", firstByteStart=");
        sb.append(this.g);
        sb.append(", firstByteDuration=");
        sb.append(this.h);
        sb.append(", downloadStart=");
        sb.append(this.i);
        sb.append(", downloadDuration=");
        return com.amazon.aps.iva.c.b.b(sb, this.j, ")");
    }

    public a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }
}
