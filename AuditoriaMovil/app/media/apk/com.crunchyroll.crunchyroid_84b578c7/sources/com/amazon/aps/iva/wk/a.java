package com.amazon.aps.iva.wk;

import com.amazon.aps.iva.b8.i;
/* compiled from: AdsTimelineDataProvider.kt */
/* loaded from: classes2.dex */
public final class a {
    public final long a;
    public final long b;
    public final boolean c;

    public a(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = i.a(this.b, Long.hashCode(this.a) * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsTimelineData(durationMs=");
        sb.append(this.a);
        sb.append(", currentPosition=");
        sb.append(this.b);
        sb.append(", isAdPlaying=");
        return com.amazon.aps.iva.e4.e.c(sb, this.c, ")");
    }
}
