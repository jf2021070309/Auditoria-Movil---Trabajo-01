package com.amazon.aps.iva.q5;

import android.os.Bundle;
import com.google.common.base.Objects;
/* compiled from: ThumbRating.java */
/* loaded from: classes.dex */
public final class q0 extends n0 {
    public static final String f = com.amazon.aps.iva.t5.g0.L(1);
    public static final String g = com.amazon.aps.iva.t5.g0.L(2);
    public static final com.amazon.aps.iva.g1.n h = new com.amazon.aps.iva.g1.n(2);
    public final boolean d;
    public final boolean e;

    public q0() {
        this.d = false;
        this.e = false;
    }

    @Override // com.amazon.aps.iva.q5.n0
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.e != q0Var.e || this.d != q0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(n0.b, 3);
        bundle.putBoolean(f, this.d);
        bundle.putBoolean(g, this.e);
        return bundle;
    }

    public q0(boolean z) {
        this.d = true;
        this.e = z;
    }
}
