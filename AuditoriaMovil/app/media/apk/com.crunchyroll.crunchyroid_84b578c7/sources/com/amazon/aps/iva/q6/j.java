package com.amazon.aps.iva.q6;

import com.amazon.aps.iva.o6.g0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.w5.w;
import java.io.IOException;
/* compiled from: ContainerMediaChunk.java */
/* loaded from: classes.dex */
public final class j extends a {
    public final int o;
    public final long p;
    public final f q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public j(com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar, v vVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, f fVar2) {
        super(fVar, iVar, vVar, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = fVar2;
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void a() throws IOException {
        boolean z;
        boolean z2;
        g0[] g0VarArr;
        long j;
        if (this.r == 0) {
            c cVar = this.m;
            com.amazon.aps.iva.cq.b.D(cVar);
            long j2 = this.p;
            for (g0 g0Var : cVar.b) {
                if (g0Var.F != j2) {
                    g0Var.F = j2;
                    g0Var.z = true;
                }
            }
            f fVar = this.q;
            long j3 = this.k;
            long j4 = -9223372036854775807L;
            if (j3 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j3 - this.p;
            }
            long j5 = this.l;
            if (j5 != -9223372036854775807L) {
                j4 = j5 - this.p;
            }
            ((d) fVar).a(cVar, j, j4);
        }
        try {
            com.amazon.aps.iva.w5.i a = this.b.a(this.r);
            w wVar = this.i;
            com.amazon.aps.iva.x6.i iVar = new com.amazon.aps.iva.x6.i(wVar, a.f, wVar.b(a));
            while (!this.s) {
                int h = ((d) this.q).b.h(iVar, d.l);
                if (h != 1) {
                    z = true;
                } else {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.C(z);
                if (h == 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (!z2) {
                    break;
                }
            }
            this.r = iVar.d - this.b.f;
            com.amazon.aps.iva.n1.c.g(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            com.amazon.aps.iva.n1.c.g(this.i);
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void b() {
        this.s = true;
    }

    @Override // com.amazon.aps.iva.q6.m
    public final long c() {
        return this.j + this.o;
    }

    @Override // com.amazon.aps.iva.q6.m
    public final boolean d() {
        return this.t;
    }
}
