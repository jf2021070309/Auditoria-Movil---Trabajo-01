package com.amazon.aps.iva.s1;
/* compiled from: ContentScale.kt */
/* loaded from: classes.dex */
public final class h implements f {
    public final float a = 1.0f;

    @Override // com.amazon.aps.iva.s1.f
    public final long a(long j, long j2) {
        float f = this.a;
        return com.amazon.aps.iva.ab.r.c(f, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && Float.compare(this.a, ((h) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return com.amazon.aps.iva.q.c0.b(new StringBuilder("FixedScale(value="), this.a, ')');
    }
}
