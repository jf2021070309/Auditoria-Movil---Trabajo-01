package com.amazon.aps.iva.xq;
/* compiled from: ExternalResourceTimings.kt */
/* loaded from: classes2.dex */
public final class q {
    public final long a;
    public final long b;

    public q(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == qVar.a && this.b == qVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timing(startTime=");
        sb.append(this.a);
        sb.append(", duration=");
        return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
    }
}
