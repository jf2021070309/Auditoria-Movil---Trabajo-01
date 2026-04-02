package com.amazon.aps.iva.bl;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: PlayerTimelineDataProvider.kt */
/* loaded from: classes2.dex */
public final class h {
    public final long a;
    public final long b;
    public final float c;
    public final boolean d;
    public final List<Long> e;

    public h(long j, long j2, float f, boolean z, List<Long> list) {
        j.f(list, "adCuePoints");
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = z;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && this.b == hVar.b && Float.compare(this.c, hVar.c) == 0 && this.d == hVar.d && j.a(this.e, hVar.e)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b = t0.b(this.c, i.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.e.hashCode() + ((b + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineData(durationMs=");
        sb.append(this.a);
        sb.append(", bufferedPositionMs=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", isAdPlaying=");
        sb.append(this.d);
        sb.append(", adCuePoints=");
        return com.amazon.aps.iva.oa.a.b(sb, this.e, ")");
    }
}
