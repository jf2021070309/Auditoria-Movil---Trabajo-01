package com.amazon.aps.iva.q5;

import android.os.Bundle;
import com.google.common.base.Objects;
/* compiled from: StarRating.java */
/* loaded from: classes.dex */
public final class o0 extends n0 {
    public static final String f = com.amazon.aps.iva.t5.g0.L(1);
    public static final String g = com.amazon.aps.iva.t5.g0.L(2);
    public static final e h = new e(3);
    public final int d;
    public final float e;

    public o0(int i) {
        com.amazon.aps.iva.cq.b.v(i > 0, "maxStars must be a positive integer");
        this.d = i;
        this.e = -1.0f;
    }

    @Override // com.amazon.aps.iva.q5.n0
    public final boolean a() {
        if (this.e != -1.0f) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.d != o0Var.d || this.e != o0Var.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.d), Float.valueOf(this.e));
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(n0.b, 2);
        bundle.putInt(f, this.d);
        bundle.putFloat(g, this.e);
        return bundle;
    }

    public o0(int i, float f2) {
        boolean z = true;
        com.amazon.aps.iva.cq.b.v(i > 0, "maxStars must be a positive integer");
        com.amazon.aps.iva.cq.b.v((f2 < 0.0f || f2 > ((float) i)) ? false : z, "starRating is out of range [0, maxStars]");
        this.d = i;
        this.e = f2;
    }
}
