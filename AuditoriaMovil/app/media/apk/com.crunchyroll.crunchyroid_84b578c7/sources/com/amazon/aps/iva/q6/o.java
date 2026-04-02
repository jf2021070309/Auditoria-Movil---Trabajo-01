package com.amazon.aps.iva.q6;

import com.amazon.aps.iva.o6.g0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.w5.w;
import com.amazon.aps.iva.x6.f0;
import java.io.IOException;
/* compiled from: SingleSampleMediaChunk.java */
/* loaded from: classes.dex */
public final class o extends a {
    public final int o;
    public final v p;
    public long q;
    public boolean r;

    public o(com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar, v vVar, int i, Object obj, long j, long j2, long j3, int i2, v vVar2) {
        super(fVar, iVar, vVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = vVar2;
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void a() throws IOException {
        g0[] g0VarArr;
        w wVar = this.i;
        c cVar = this.m;
        com.amazon.aps.iva.cq.b.D(cVar);
        for (g0 g0Var : cVar.b) {
            if (g0Var.F != 0) {
                g0Var.F = 0L;
                g0Var.z = true;
            }
        }
        f0 a = cVar.a(this.o);
        a.c(this.p);
        try {
            long b = wVar.b(this.b.a(this.q));
            if (b != -1) {
                b += this.q;
            }
            com.amazon.aps.iva.x6.i iVar = new com.amazon.aps.iva.x6.i(this.i, this.q, b);
            for (int i = 0; i != -1; i = a.b(iVar, Integer.MAX_VALUE, true)) {
                this.q += i;
            }
            a.d(this.g, 1, (int) this.q, 0, null);
            com.amazon.aps.iva.n1.c.g(wVar);
            this.r = true;
        } catch (Throwable th) {
            com.amazon.aps.iva.n1.c.g(wVar);
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.q6.m
    public final boolean d() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void b() {
    }
}
