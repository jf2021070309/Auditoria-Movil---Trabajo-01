package com.amazon.aps.iva.q5;

import android.os.Bundle;
import com.google.common.base.Objects;
/* compiled from: HeartRating.java */
/* loaded from: classes.dex */
public final class x extends n0 {
    public static final String f = com.amazon.aps.iva.t5.g0.L(1);
    public static final String g = com.amazon.aps.iva.t5.g0.L(2);
    public static final e h = new e(1);
    public final boolean d;
    public final boolean e;

    public x() {
        this.d = false;
        this.e = false;
    }

    @Override // com.amazon.aps.iva.q5.n0
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.e != xVar.e || this.d != xVar.d) {
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
        bundle.putInt(n0.b, 0);
        bundle.putBoolean(f, this.d);
        bundle.putBoolean(g, this.e);
        return bundle;
    }

    public x(boolean z) {
        this.d = true;
        this.e = z;
    }
}
