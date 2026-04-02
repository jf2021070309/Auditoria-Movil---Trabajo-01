package com.amazon.aps.iva.z;
/* compiled from: FloatAnimationSpec.kt */
/* loaded from: classes.dex */
public final class c0 implements a0 {
    public final float a;
    public final t0 b;

    public c0() {
        this(0.0f, 0.0f, 7);
    }

    @Override // com.amazon.aps.iva.z.a0
    public final float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // com.amazon.aps.iva.z.a0
    public final float c(long j, float f, float f2, float f3) {
        t0 t0Var = this.b;
        t0Var.a = f2;
        return Float.intBitsToFloat((int) (t0Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // com.amazon.aps.iva.z.a0
    public final float d(long j, float f, float f2, float f3) {
        t0 t0Var = this.b;
        t0Var.a = f2;
        return Float.intBitsToFloat((int) (t0Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // com.amazon.aps.iva.z.a0
    public final long e(float f, float f2, float f3) {
        boolean z;
        double log;
        boolean z2;
        boolean z3;
        int i;
        long j;
        boolean z4;
        boolean z5;
        double d;
        double d2;
        boolean z6;
        t0 t0Var = this.b;
        double d3 = t0Var.b;
        float f4 = t0Var.g;
        float f5 = this.a;
        double d4 = (float) (d3 * d3);
        double d5 = f4;
        double d6 = f3 / f5;
        double d7 = (f - f2) / f5;
        double d8 = 1.0f;
        double sqrt = d5 * 2.0d * Math.sqrt(d4);
        double d9 = (sqrt * sqrt) - (d4 * 4.0d);
        double d10 = -sqrt;
        r m = defpackage.i.m(d9);
        m.a = (m.a + d10) * 0.5d;
        m.b *= 0.5d;
        r m2 = defpackage.i.m(d9);
        double d11 = -1;
        m2.a = ((m2.a * d11) + d10) * 0.5d;
        m2.b = m2.b * d11 * 0.5d;
        int i2 = (d7 > 0.0d ? 1 : (d7 == 0.0d ? 0 : -1));
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (d6 == 0.0d) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                j = 0;
                return j * 1000000;
            }
        }
        if (i2 < 0) {
            d6 = -d6;
        }
        double abs = Math.abs(d7);
        double d12 = Double.MAX_VALUE;
        if (d5 > 1.0d) {
            double d13 = m.a;
            double d14 = m2.a;
            double d15 = (d13 * abs) - d6;
            double d16 = d13 - d14;
            double d17 = d15 / d16;
            double d18 = abs - d17;
            double log2 = Math.log(Math.abs(d8 / d18)) / d13;
            double log3 = Math.log(Math.abs(d8 / d17)) / d14;
            if (!Double.isInfinite(log2) && !Double.isNaN(log2)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                log2 = log3;
            } else {
                if (!Double.isInfinite(log3) && !Double.isNaN(log3)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!(!z5)) {
                    log2 = Math.max(log2, log3);
                }
            }
            double d19 = d18 * d13;
            double d20 = log2;
            double log4 = Math.log(d19 / ((-d17) * d14)) / (d14 - d13);
            if (!Double.isNaN(log4) && log4 > 0.0d) {
                if (log4 > 0.0d) {
                    if ((-((Math.exp(log4 * d14) * d17) + (Math.exp(d13 * log4) * d18))) < d8) {
                        if (d17 > 0.0d && d18 < 0.0d) {
                            log = 0.0d;
                        } else {
                            log = d20;
                        }
                        d = d14;
                        d2 = -d8;
                    }
                }
                d2 = d8;
                d = d14;
                log = Math.log((-((d17 * d) * d)) / (d19 * d13)) / d16;
            } else {
                d = d14;
                d2 = -d8;
                log = d20;
            }
            double d21 = d17 * d;
            if (Math.abs((Math.exp(d * log) * d21) + (Math.exp(d13 * log) * d19)) >= 1.0E-4d) {
                int i3 = 0;
                while (d12 > 0.001d && i3 < 100) {
                    i3++;
                    double d22 = d13 * log;
                    double d23 = d * log;
                    double exp = log - ((((Math.exp(d23) * d17) + (Math.exp(d22) * d18)) + d2) / ((Math.exp(d23) * d21) + (Math.exp(d22) * d19)));
                    double abs2 = Math.abs(log - exp);
                    log = exp;
                    d12 = abs2;
                }
            }
        } else if (d5 < 1.0d) {
            double d24 = m.a;
            double d25 = (d6 - (d24 * abs)) / m.b;
            log = Math.log(d8 / Math.sqrt((d25 * d25) + (abs * abs))) / d24;
        } else {
            double d26 = m.a;
            double d27 = d26 * abs;
            double d28 = d6 - d27;
            log = Math.log(Math.abs(d8 / abs)) / d26;
            double log5 = Math.log(Math.abs(d8 / d28));
            double d29 = log5;
            for (int i4 = 0; i4 < 6; i4++) {
                d29 = log5 - Math.log(Math.abs(d29 / d26));
            }
            double d30 = d29 / d26;
            if (!Double.isInfinite(log) && !Double.isNaN(log)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                log = d30;
            } else {
                if (!Double.isInfinite(d30) && !Double.isNaN(d30)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!(!z3)) {
                    log = Math.max(log, d30);
                }
            }
            double d31 = (-(d27 + d28)) / (d26 * d28);
            double d32 = d26 * d31;
            double d33 = d8;
            double exp2 = (Math.exp(d32) * d28 * d31) + (Math.exp(d32) * abs);
            if (!Double.isNaN(d31) && d31 > 0.0d) {
                if (d31 > 0.0d && (-exp2) < d33) {
                    if (d28 < 0.0d && abs > 0.0d) {
                        log = 0.0d;
                    }
                } else {
                    log = (-(2.0d / d26)) - (abs / d28);
                    i = 0;
                    while (d12 > 0.001d && i < 100) {
                        i++;
                        double d34 = d26 * log;
                        double exp3 = log - (((Math.exp(d34) * ((d28 * log) + abs)) + d33) / (Math.exp(d34) * (((1 + d34) * d28) + d27)));
                        d12 = Math.abs(log - exp3);
                        log = exp3;
                    }
                }
            }
            d33 = -d33;
            i = 0;
            while (d12 > 0.001d) {
                i++;
                double d342 = d26 * log;
                double exp32 = log - (((Math.exp(d342) * ((d28 * log) + abs)) + d33) / (Math.exp(d342) * (((1 + d342) * d28) + d27)));
                d12 = Math.abs(log - exp32);
                log = exp32;
            }
        }
        j = (long) (log * 1000.0d);
        return j * 1000000;
    }

    public c0(float f, float f2, float f3) {
        this.a = f3;
        t0 t0Var = new t0();
        if (f >= 0.0f) {
            t0Var.g = f;
            t0Var.c = false;
            double d = t0Var.b;
            if (((float) (d * d)) > 0.0f) {
                t0Var.b = Math.sqrt(f2);
                t0Var.c = false;
                this.b = t0Var;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public /* synthetic */ c0(float f, float f2, int i) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : 0.0f);
    }
}
