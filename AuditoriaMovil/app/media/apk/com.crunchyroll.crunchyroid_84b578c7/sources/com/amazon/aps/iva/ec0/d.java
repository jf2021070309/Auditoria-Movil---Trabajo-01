package com.amazon.aps.iva.ec0;
/* compiled from: Ranges.kt */
/* loaded from: classes4.dex */
public final class d implements f<Double> {
    public final double b = 1.0d;
    public final double c = 240.0d;

    @Override // com.amazon.aps.iva.ec0.f
    public final boolean b(Double d, Double d2) {
        if (d.doubleValue() <= d2.doubleValue()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final Comparable d() {
        return Double.valueOf(this.b);
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final Comparable e() {
        return Double.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof d)) {
            return false;
        }
        if (!isEmpty() || !((d) obj).isEmpty()) {
            d dVar = (d) obj;
            if (this.b == dVar.b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.c == dVar.c) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.b) * 31) + Double.hashCode(this.c);
    }

    @Override // com.amazon.aps.iva.ec0.g
    public final boolean isEmpty() {
        if (this.b > this.c) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
