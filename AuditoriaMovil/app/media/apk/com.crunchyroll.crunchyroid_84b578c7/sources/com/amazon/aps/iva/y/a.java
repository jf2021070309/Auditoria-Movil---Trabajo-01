package com.amazon.aps.iva.y;
/* compiled from: SplineBasedDecay.kt */
/* loaded from: classes.dex */
public final class a {
    public static final float[] a;

    /* compiled from: SplineBasedDecay.kt */
    /* renamed from: com.amazon.aps.iva.y.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0873a {
        public final float a;
        public final float b;

        public C0873a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0873a)) {
                return false;
            }
            C0873a c0873a = (C0873a) obj;
            if (Float.compare(this.a, c0873a.a) == 0 && Float.compare(this.b, c0873a.b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.a);
            sb.append(", velocityCoefficient=");
            return com.amazon.aps.iva.q.c0.b(sb, this.b, ')');
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        a = fArr;
        float[] fArr2 = new float[101];
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f11 = i / 100;
            float f12 = 1.0f;
            while (true) {
                f = ((f12 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f13 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                if (Math.abs(f13 - f11) < 1.0E-5d) {
                    break;
                } else if (f13 > f11) {
                    f12 = f;
                } else {
                    f9 = f;
                }
            }
            float f14 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f15 = 1.0f;
            while (true) {
                f5 = ((f15 - f10) / 2.0f) + f10;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f16 = (((f6 * f14) + f5) * f7) + f8;
                if (Math.abs(f16 - f11) >= 1.0E-5d) {
                    if (f16 > f11) {
                        f15 = f5;
                    } else {
                        f10 = f5;
                    }
                    f14 = 0.5f;
                }
            }
            fArr2[i] = (((f5 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public static C0873a a(float f) {
        float f2;
        float f3;
        float f4 = 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = a;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = com.amazon.aps.iva.e4.t0.a(f, f5, f3, f7);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new C0873a(f2, f3);
    }
}
