package com.amazon.aps.iva.q5;

import android.os.Bundle;
/* compiled from: VideoSize.java */
/* loaded from: classes.dex */
public final class y0 implements k {
    public static final y0 f = new y0(1.0f, 0, 0, 0);
    public static final String g = com.amazon.aps.iva.t5.g0.L(0);
    public static final String h = com.amazon.aps.iva.t5.g0.L(1);
    public static final String i = com.amazon.aps.iva.t5.g0.L(2);
    public static final String j = com.amazon.aps.iva.t5.g0.L(3);
    public static final z k = new z(3);
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public y0(float f2, int i2, int i3, int i4) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.b == y0Var.b && this.c == y0Var.c && this.d == y0Var.d && this.e == y0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.e) + ((((((217 + this.b) * 31) + this.c) * 31) + this.d) * 31);
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(g, this.b);
        bundle.putInt(h, this.c);
        bundle.putInt(i, this.d);
        bundle.putFloat(j, this.e);
        return bundle;
    }
}
