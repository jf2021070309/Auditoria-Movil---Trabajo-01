package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class g0 implements w {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public g0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // com.amazon.aps.iva.m0.w
    public final com.amazon.aps.iva.o0.q1 a(boolean z, com.amazon.aps.iva.o0.i iVar) {
        long j;
        iVar.s(-655254499);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        if (z) {
            j = this.a;
        } else {
            j = this.c;
        }
        com.amazon.aps.iva.o0.q1 h0 = com.amazon.aps.iva.cq.b.h0(new com.amazon.aps.iva.f1.x(j), iVar);
        iVar.G();
        return h0;
    }

    @Override // com.amazon.aps.iva.m0.w
    public final com.amazon.aps.iva.o0.q1 b(boolean z, com.amazon.aps.iva.o0.i iVar) {
        long j;
        iVar.s(-2133647540);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        if (z) {
            j = this.b;
        } else {
            j = this.d;
        }
        com.amazon.aps.iva.o0.q1 h0 = com.amazon.aps.iva.cq.b.h0(new com.amazon.aps.iva.f1.x(j), iVar);
        iVar.G();
        return h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (com.amazon.aps.iva.f1.x.c(this.a, g0Var.a) && com.amazon.aps.iva.f1.x.c(this.b, g0Var.b) && com.amazon.aps.iva.f1.x.c(this.c, g0Var.c) && com.amazon.aps.iva.f1.x.c(this.d, g0Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = com.amazon.aps.iva.f1.x.h;
        return Long.hashCode(this.d) + com.amazon.aps.iva.b8.i.a(this.c, com.amazon.aps.iva.b8.i.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
