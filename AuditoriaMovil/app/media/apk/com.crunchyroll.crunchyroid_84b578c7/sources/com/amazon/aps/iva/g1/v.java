package com.amazon.aps.iva.g1;
/* compiled from: TransferParameters.kt */
/* loaded from: classes.dex */
public final class v {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public /* synthetic */ v(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Double.compare(this.a, vVar.a) == 0 && Double.compare(this.b, vVar.b) == 0 && Double.compare(this.c, vVar.c) == 0 && Double.compare(this.d, vVar.d) == 0 && Double.compare(this.e, vVar.e) == 0 && Double.compare(this.f, vVar.f) == 0 && Double.compare(this.g, vVar.g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.b);
        int hashCode2 = Double.hashCode(this.c);
        int hashCode3 = Double.hashCode(this.d);
        int hashCode4 = Double.hashCode(this.e);
        int hashCode5 = Double.hashCode(this.f);
        return Double.hashCode(this.g) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if ((r2 == 0.0d) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
        if ((r2 == 0.0d) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g1.v.<init>(double, double, double, double, double, double, double):void");
    }
}
