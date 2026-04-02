package com.amazon.aps.iva.er;
/* compiled from: VitalInfo.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final e e = new e(0, Double.MAX_VALUE, -1.7976931348623157E308d, 0.0d);
    public final int a;
    public final double b;
    public final double c;
    public final double d;

    public e(int i, double d, double d2, double d3) {
        this.a = i;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a == eVar.a && com.amazon.aps.iva.yb0.j.a(Double.valueOf(this.b), Double.valueOf(eVar.b)) && com.amazon.aps.iva.yb0.j.a(Double.valueOf(this.c), Double.valueOf(eVar.c)) && com.amazon.aps.iva.yb0.j.a(Double.valueOf(this.d), Double.valueOf(eVar.d))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.b);
        int hashCode2 = Double.hashCode(this.c);
        return Double.hashCode(this.d) + ((hashCode2 + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VitalInfo(sampleCount=" + this.a + ", minValue=" + this.b + ", maxValue=" + this.c + ", meanValue=" + this.d + ")";
    }
}
