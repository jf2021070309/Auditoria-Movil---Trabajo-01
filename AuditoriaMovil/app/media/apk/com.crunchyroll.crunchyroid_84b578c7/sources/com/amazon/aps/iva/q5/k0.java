package com.amazon.aps.iva.q5;

import android.os.Bundle;
/* compiled from: PlaybackParameters.java */
/* loaded from: classes.dex */
public final class k0 implements k {
    public static final k0 e = new k0(1.0f, 1.0f);
    public static final String f = com.amazon.aps.iva.t5.g0.L(0);
    public static final String g = com.amazon.aps.iva.t5.g0.L(1);
    public static final p h = new p(2);
    public final float b;
    public final float c;
    public final int d;

    public k0(float f2, float f3) {
        boolean z;
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        com.amazon.aps.iva.cq.b.t(f3 > 0.0f);
        this.b = f2;
        this.c = f3;
        this.d = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.b == k0Var.b && this.c == k0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((Float.floatToRawIntBits(this.b) + 527) * 31);
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f, this.b);
        bundle.putFloat(g, this.c);
        return bundle;
    }

    public final String toString() {
        return com.amazon.aps.iva.t5.g0.o("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(this.c));
    }
}
