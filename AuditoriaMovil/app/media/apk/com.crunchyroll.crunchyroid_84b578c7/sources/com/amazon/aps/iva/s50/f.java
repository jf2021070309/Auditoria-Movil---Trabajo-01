package com.amazon.aps.iva.s50;
/* compiled from: ShowRatingUiModel.kt */
/* loaded from: classes2.dex */
public final class f {
    public final float a;
    public final long b;
    public final float c;

    public f(float f, float f2, long j) {
        this.a = f;
        this.b = j;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Float.compare(this.a, fVar.a) == 0 && this.b == fVar.b && Float.compare(this.c, fVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + com.amazon.aps.iva.b8.i.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "ShowRatingUiModel(ratingAverage=" + this.a + ", totalRatesCount=" + this.b + ", userRating=" + this.c + ")";
    }
}
