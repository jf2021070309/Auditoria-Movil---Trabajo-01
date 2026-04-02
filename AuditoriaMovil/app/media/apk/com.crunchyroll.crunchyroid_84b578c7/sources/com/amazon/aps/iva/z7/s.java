package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.z7.e0;
/* compiled from: PassthroughSectionPayloadReader.java */
/* loaded from: classes.dex */
public final class s implements y {
    public com.amazon.aps.iva.q5.v a;
    public com.amazon.aps.iva.t5.b0 b;
    public com.amazon.aps.iva.x6.f0 c;

    public s(String str) {
        v.a aVar = new v.a();
        aVar.k = str;
        this.a = new com.amazon.aps.iva.q5.v(aVar);
    }

    @Override // com.amazon.aps.iva.z7.y
    public final void a(com.amazon.aps.iva.t5.v vVar) {
        long c;
        long j;
        long j2;
        com.amazon.aps.iva.cq.b.D(this.b);
        int i = g0.a;
        com.amazon.aps.iva.t5.b0 b0Var = this.b;
        synchronized (b0Var) {
            long j3 = b0Var.c;
            if (j3 != -9223372036854775807L) {
                c = j3 + b0Var.b;
            } else {
                c = b0Var.c();
            }
            j = c;
        }
        com.amazon.aps.iva.t5.b0 b0Var2 = this.b;
        synchronized (b0Var2) {
            j2 = b0Var2.b;
        }
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            com.amazon.aps.iva.q5.v vVar2 = this.a;
            if (j2 != vVar2.q) {
                v.a aVar = new v.a(vVar2);
                aVar.o = j2;
                com.amazon.aps.iva.q5.v vVar3 = new com.amazon.aps.iva.q5.v(aVar);
                this.a = vVar3;
                this.c.c(vVar3);
            }
            int i2 = vVar.c - vVar.b;
            this.c.a(i2, vVar);
            this.c.d(j, 1, i2, 0, null);
        }
    }

    @Override // com.amazon.aps.iva.z7.y
    public final void c(com.amazon.aps.iva.t5.b0 b0Var, com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        this.b = b0Var;
        dVar.a();
        dVar.b();
        com.amazon.aps.iva.x6.f0 r = pVar.r(dVar.d, 5);
        this.c = r;
        r.c(this.a);
    }
}
