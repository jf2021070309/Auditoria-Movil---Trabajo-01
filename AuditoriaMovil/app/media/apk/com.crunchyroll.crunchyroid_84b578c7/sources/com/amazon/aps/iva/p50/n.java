package com.amazon.aps.iva.p50;

import com.amazon.aps.iva.e4.t0;
import java.util.List;
/* compiled from: ShowRatingDialogUiModel.kt */
/* loaded from: classes2.dex */
public final class n {
    public final List<Integer> a;
    public final float b;
    public final int c;
    public final int d;

    public n(float f, List list, int i, int i2) {
        this.a = list;
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, nVar.a) && Float.compare(this.b, nVar.b) == 0 && this.c == nVar.c && this.d == nVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + com.amazon.aps.iva.a0.r.a(this.c, t0.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ShowRatingDialogUiModel(starsPercentage=" + this.a + ", ratingAverage=" + this.b + ", totalRatesCount=" + this.c + ", userRating=" + this.d + ")";
    }
}
