package com.amazon.aps.iva.b8;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Objects;
/* compiled from: CommandButton.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.q5.k {
    public static final String h = com.amazon.aps.iva.t5.g0.L(0);
    public static final String i = com.amazon.aps.iva.t5.g0.L(1);
    public static final String j = com.amazon.aps.iva.t5.g0.L(2);
    public static final String k = com.amazon.aps.iva.t5.g0.L(3);
    public static final String l = com.amazon.aps.iva.t5.g0.L(4);
    public static final String m = com.amazon.aps.iva.t5.g0.L(5);
    public final x1 b;
    public final int c;
    public final int d;
    public final CharSequence e;
    public final Bundle f;
    public final boolean g;

    static {
        new com.amazon.aps.iva.q5.p(5);
    }

    public b(x1 x1Var, int i2, int i3, CharSequence charSequence, Bundle bundle, boolean z) {
        this.b = x1Var;
        this.c = i2;
        this.d = i3;
        this.e = charSequence;
        this.f = new Bundle(bundle);
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equal(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && TextUtils.equals(this.e, bVar.e) && this.g == bVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, Boolean.valueOf(this.g));
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        x1 x1Var = this.b;
        if (x1Var != null) {
            bundle.putBundle(h, x1Var.toBundle());
        }
        bundle.putInt(i, this.c);
        bundle.putInt(j, this.d);
        bundle.putCharSequence(k, this.e);
        bundle.putBundle(l, this.f);
        bundle.putBoolean(m, this.g);
        return bundle;
    }
}
