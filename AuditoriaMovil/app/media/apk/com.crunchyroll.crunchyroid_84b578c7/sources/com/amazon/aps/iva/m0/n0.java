package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: RadioButton.kt */
/* loaded from: classes.dex */
public final class n0 implements w2 {
    public final long a;
    public final long b;
    public final long c;

    public n0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // com.amazon.aps.iva.m0.w2
    public final com.amazon.aps.iva.o0.p3 a(boolean z, boolean z2, com.amazon.aps.iva.o0.i iVar) {
        long j;
        com.amazon.aps.iva.o0.p3 h0;
        iVar.s(1243421834);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        if (!z) {
            j = this.c;
        } else if (!z2) {
            j = this.b;
        } else {
            j = this.a;
        }
        if (z) {
            iVar.s(-1052799107);
            h0 = com.amazon.aps.iva.y.c1.a(j, com.amazon.aps.iva.z.k.d(100, 0, null, 6), iVar);
            iVar.G();
        } else {
            iVar.s(-1052799002);
            h0 = com.amazon.aps.iva.cq.b.h0(new com.amazon.aps.iva.f1.x(j), iVar);
            iVar.G();
        }
        iVar.G();
        return h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (com.amazon.aps.iva.f1.x.c(this.a, n0Var.a) && com.amazon.aps.iva.f1.x.c(this.b, n0Var.b) && com.amazon.aps.iva.f1.x.c(this.c, n0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = com.amazon.aps.iva.f1.x.h;
        return Long.hashCode(this.c) + com.amazon.aps.iva.b8.i.a(this.b, Long.hashCode(this.a) * 31, 31);
    }
}
