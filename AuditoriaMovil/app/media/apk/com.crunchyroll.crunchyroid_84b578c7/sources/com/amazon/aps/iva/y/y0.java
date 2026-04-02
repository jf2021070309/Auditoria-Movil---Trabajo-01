package com.amazon.aps.iva.y;
/* compiled from: FlingCalculator.kt */
/* loaded from: classes.dex */
public final class y0 {
    public final float a;
    public final com.amazon.aps.iva.o2.c b;
    public final float c;

    /* compiled from: FlingCalculator.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final float a;
        public final float b;
        public final long c;

        public a(float f, float f2, long j) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + com.amazon.aps.iva.e4.t0.b(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
        }
    }

    public y0(float f, com.amazon.aps.iva.o2.c cVar) {
        this.a = f;
        this.b = cVar;
        float density = cVar.getDensity();
        float f2 = z0.a;
        this.c = density * 386.0878f * 160.0f * 0.84f;
    }

    public final a a(float f) {
        double b = b(f);
        double d = z0.a;
        double d2 = d - 1.0d;
        return new a(f, (float) (Math.exp((d / d2) * b) * this.a * this.c), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = com.amazon.aps.iva.y.a.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.c));
    }
}
