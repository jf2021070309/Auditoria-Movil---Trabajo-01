package com.amazon.aps.iva.q5;

import android.os.Bundle;
import com.google.common.base.Objects;
/* compiled from: PercentageRating.java */
/* loaded from: classes.dex */
public final class i0 extends n0 {
    public static final String e = com.amazon.aps.iva.t5.g0.L(1);
    public static final a0 f = new a0(1);
    public final float d;

    public i0() {
        this.d = -1.0f;
    }

    @Override // com.amazon.aps.iva.q5.n0
    public final boolean a() {
        if (this.d != -1.0f) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        if (this.d != ((i0) obj).d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Float.valueOf(this.d));
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(n0.b, 1);
        bundle.putFloat(e, this.d);
        return bundle;
    }

    public i0(float f2) {
        com.amazon.aps.iva.cq.b.v(f2 >= 0.0f && f2 <= 100.0f, "percent must be in the range of [0, 100]");
        this.d = f2;
    }
}
