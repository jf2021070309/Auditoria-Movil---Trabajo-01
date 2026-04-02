package com.amazon.aps.iva.tp;

import com.amazon.aps.iva.a0.r;
import com.google.android.gms.cast.MediaError;
/* compiled from: FilePersistenceConfig.kt */
/* loaded from: classes2.dex */
public final class n {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;

    public n() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a == nVar.a && this.b == nVar.b && this.c == nVar.c && this.d == nVar.d && this.e == nVar.e && this.f == nVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + com.amazon.aps.iva.b8.i.a(this.e, r.a(this.d, com.amazon.aps.iva.b8.i.a(this.c, com.amazon.aps.iva.b8.i.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePersistenceConfig(recentDelayMs=");
        sb.append(this.a);
        sb.append(", maxBatchSize=");
        sb.append(this.b);
        sb.append(", maxItemSize=");
        sb.append(this.c);
        sb.append(", maxItemsPerBatch=");
        sb.append(this.d);
        sb.append(", oldFileThreshold=");
        sb.append(this.e);
        sb.append(", maxDiskSpace=");
        return com.amazon.aps.iva.c.b.b(sb, this.f, ")");
    }

    public n(int i) {
        this.a = 5000L;
        this.b = 4194304L;
        this.c = 524288L;
        this.d = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
        this.e = 64800000L;
        this.f = 536870912L;
    }
}
