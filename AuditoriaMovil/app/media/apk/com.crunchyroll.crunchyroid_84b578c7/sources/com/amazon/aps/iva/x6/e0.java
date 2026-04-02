package com.amazon.aps.iva.x6;
/* compiled from: SeekPoint.java */
/* loaded from: classes.dex */
public final class e0 {
    public static final e0 c = new e0(0, 0);
    public final long a;
    public final long b;

    public e0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.a == e0Var.a && this.b == e0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return com.amazon.aps.iva.c.b.b(sb, this.b, "]");
    }
}
