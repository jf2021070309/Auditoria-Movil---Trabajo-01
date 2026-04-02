package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.v1.w1;
/* compiled from: OnRemeasuredModifier.kt */
/* loaded from: classes.dex */
public final class q0 extends w1 implements p0 {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.kb0.q> d;
    public long e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q0(com.amazon.aps.iva.xb0.l r3) {
        /*
            r2 = this;
            com.amazon.aps.iva.v1.t1$a r0 = com.amazon.aps.iva.v1.t1.a
            java.lang.String r1 = "inspectorInfo"
            com.amazon.aps.iva.yb0.j.f(r0, r1)
            r2.<init>(r0)
            r2.d = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            long r0 = com.amazon.aps.iva.o2.k.a(r3, r3)
            r2.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s1.q0.<init>(com.amazon.aps.iva.xb0.l):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        return com.amazon.aps.iva.yb0.j.a(this.d, ((q0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.amazon.aps.iva.s1.p0
    public final void i(long j) {
        if (!com.amazon.aps.iva.o2.j.a(this.e, j)) {
            this.d.invoke(new com.amazon.aps.iva.o2.j(j));
            this.e = j;
        }
    }
}
