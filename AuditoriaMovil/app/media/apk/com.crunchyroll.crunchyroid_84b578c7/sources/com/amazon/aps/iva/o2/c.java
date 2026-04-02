package com.amazon.aps.iva.o2;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.ee0.f1;
/* compiled from: Density.kt */
/* loaded from: classes.dex */
public interface c {
    default float I0(int i) {
        return i / getDensity();
    }

    float O0();

    default float P0(float f) {
        return getDensity() * f;
    }

    default int T0(long j) {
        return com.amazon.aps.iva.ob0.f.a(l0(j));
    }

    default long b1(long j) {
        boolean z;
        int i = g.d;
        if (j != g.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return r.d(P0(g.c(j)), P0(g.b(j)));
        }
        int i2 = com.amazon.aps.iva.e1.g.d;
        return com.amazon.aps.iva.e1.g.c;
    }

    default int f0(float f) {
        float P0 = P0(f);
        if (Float.isInfinite(P0)) {
            return Integer.MAX_VALUE;
        }
        return com.amazon.aps.iva.ob0.f.a(P0);
    }

    float getDensity();

    default long j(long j) {
        boolean z;
        if (j != com.amazon.aps.iva.e1.g.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f1.f(x(com.amazon.aps.iva.e1.g.d(j)), x(com.amazon.aps.iva.e1.g.b(j)));
        }
        return g.c;
    }

    default float l0(long j) {
        if (n.a(m.b(j), 4294967296L)) {
            return getDensity() * O0() * m.c(j);
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    default float x(float f) {
        return f / getDensity();
    }
}
