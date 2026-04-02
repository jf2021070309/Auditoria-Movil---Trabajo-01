package com.amazon.aps.iva.z;
/* compiled from: SpringSimulation.kt */
/* loaded from: classes.dex */
public final class t0 {
    public boolean c;
    public double d;
    public double e;
    public double f;
    public float a = 1.0f;
    public double b = Math.sqrt(50.0d);
    public float g = 1.0f;

    public final long a(float f, float f2, long j) {
        float f3;
        double cos;
        double d;
        boolean z;
        boolean z2 = false;
        if (!this.c) {
            if (this.a == Float.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                float f4 = this.g;
                double d2 = f4;
                double d3 = d2 * d2;
                if (f4 > 1.0f) {
                    double d4 = this.b;
                    double d5 = d3 - 1;
                    this.d = (Math.sqrt(d5) * d4) + ((-f4) * d4);
                    double d6 = this.b;
                    this.e = ((-this.g) * d6) - (Math.sqrt(d5) * d6);
                } else if (f4 >= 0.0f && f4 < 1.0f) {
                    this.f = Math.sqrt(1 - d3) * this.b;
                }
                this.c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f5 = f - this.a;
        double d7 = j / 1000.0d;
        float f6 = this.g;
        if (f6 > 1.0f) {
            double d8 = f5;
            double d9 = this.e;
            double d10 = f2;
            double d11 = this.d;
            double d12 = d8 - (((d9 * d8) - d10) / (d9 - d11));
            double d13 = ((d8 * d9) - d10) / (d9 - d11);
            d = (Math.exp(this.d * d7) * d13) + (Math.exp(d9 * d7) * d12);
            double d14 = this.e;
            double exp = Math.exp(d14 * d7) * d12 * d14;
            double d15 = this.d;
            cos = (Math.exp(d15 * d7) * d13 * d15) + exp;
        } else {
            if (f6 == 1.0f) {
                z2 = true;
            }
            if (z2) {
                double d16 = this.b;
                double d17 = f5;
                double d18 = (d16 * d17) + f2;
                double d19 = (d18 * d7) + d17;
                double exp2 = Math.exp((-d16) * d7) * d19;
                double exp3 = Math.exp((-this.b) * d7) * d19;
                double d20 = this.b;
                cos = (Math.exp((-d20) * d7) * d18) + (exp3 * (-d20));
                d = exp2;
            } else {
                double d21 = 1 / this.f;
                double d22 = this.b;
                double d23 = f5;
                double d24 = ((f6 * d22 * d23) + f2) * d21;
                double exp4 = Math.exp((-f6) * d22 * d7) * ((Math.sin(this.f * d7) * d24) + (Math.cos(this.f * d7) * d23));
                double d25 = this.b;
                double d26 = (-d25) * exp4 * this.g;
                double exp5 = Math.exp((-f3) * d25 * d7);
                double d27 = this.f;
                double d28 = this.f;
                cos = (((Math.cos(d28 * d7) * d24 * d28) + (Math.sin(d27 * d7) * (-d27) * d23)) * exp5) + d26;
                d = exp4;
            }
        }
        return (Float.floatToIntBits((float) cos) & 4294967295L) | (Float.floatToIntBits((float) (d + this.a)) << 32);
    }
}
