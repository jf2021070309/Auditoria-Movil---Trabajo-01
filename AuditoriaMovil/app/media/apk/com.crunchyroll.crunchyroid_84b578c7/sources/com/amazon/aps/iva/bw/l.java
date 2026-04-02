package com.amazon.aps.iva.bw;
/* compiled from: LicenseExpiration.kt */
/* loaded from: classes2.dex */
public final class l {
    public final long a;
    public final long b;

    public l(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.a && this.b == lVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LicenseExpiration(remainingSecAfterDownload=");
        sb.append(this.a);
        sb.append(", remainingSecAfterPlayback=");
        return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
    }
}
