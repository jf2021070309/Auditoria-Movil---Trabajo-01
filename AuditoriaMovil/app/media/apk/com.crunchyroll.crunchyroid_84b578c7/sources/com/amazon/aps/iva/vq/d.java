package com.amazon.aps.iva.vq;
/* compiled from: Time.kt */
/* loaded from: classes2.dex */
public final class d {
    public final long a;
    public final long b;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Time(timestamp=");
        sb.append(this.a);
        sb.append(", nanoTime=");
        return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
    }

    public d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public /* synthetic */ d(int i) {
        this(System.currentTimeMillis(), System.nanoTime());
    }
}
