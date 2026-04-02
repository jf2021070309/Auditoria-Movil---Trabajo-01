package com.amazon.aps.iva.z;
/* compiled from: ComplexDouble.kt */
/* loaded from: classes.dex */
public final class r {
    public double a;
    public double b;

    public r(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Double.compare(this.a, rVar.a) == 0 && Double.compare(this.b, rVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}
