package com.amazon.aps.iva.o6;

import android.os.SystemClock;
import com.amazon.aps.iva.a6.s1;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.p6.b;
import java.io.IOException;
/* compiled from: MaskingMediaPeriod.java */
/* loaded from: classes.dex */
public final class r implements u, u.a {
    public final v.b b;
    public final long c;
    public final com.amazon.aps.iva.t6.b d;
    public v e;
    public u f;
    public u.a g;
    public a h;
    public boolean i;
    public long j = -9223372036854775807L;

    /* compiled from: MaskingMediaPeriod.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public r(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        this.b = bVar;
        this.d = bVar2;
        this.c = j;
    }

    @Override // com.amazon.aps.iva.o6.i0.a
    public final void a(u uVar) {
        u.a aVar = this.g;
        int i = com.amazon.aps.iva.t5.g0.a;
        aVar.a(this);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long b(long j, s1 s1Var) {
        u uVar = this.f;
        int i = com.amazon.aps.iva.t5.g0.a;
        return uVar.b(j, s1Var);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        u uVar = this.f;
        int i = com.amazon.aps.iva.t5.g0.a;
        return uVar.c();
    }

    @Override // com.amazon.aps.iva.o6.u.a
    public final void d(u uVar) {
        u.a aVar = this.g;
        int i = com.amazon.aps.iva.t5.g0.a;
        aVar.d(this);
        a aVar2 = this.h;
        if (aVar2 != null) {
            b.c cVar = (b.c) aVar2;
            com.amazon.aps.iva.p6.b.this.r.post(new com.amazon.aps.iva.x2.u(4, cVar, this.b));
        }
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long e(long j) {
        u uVar = this.f;
        int i = com.amazon.aps.iva.t5.g0.a;
        return uVar.e(j);
    }

    public final void g(v.b bVar) {
        long j = this.j;
        if (j == -9223372036854775807L) {
            j = this.c;
        }
        v vVar = this.e;
        vVar.getClass();
        u h = vVar.h(bVar, this.d, j);
        this.f = h;
        if (this.g != null) {
            h.k(this, j);
        }
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long h(com.amazon.aps.iva.s6.r[] rVarArr, boolean[] zArr, h0[] h0VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.j;
        if (j3 != -9223372036854775807L && j == this.c) {
            this.j = -9223372036854775807L;
            j2 = j3;
        } else {
            j2 = j;
        }
        u uVar = this.f;
        int i = com.amazon.aps.iva.t5.g0.a;
        return uVar.h(rVarArr, zArr, h0VarArr, zArr2, j2);
    }

    public final void i() {
        if (this.f != null) {
            v vVar = this.e;
            vVar.getClass();
            vVar.c(this.f);
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        u uVar = this.f;
        if (uVar != null && uVar.isLoading()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long j() {
        u uVar = this.f;
        int i = com.amazon.aps.iva.t5.g0.a;
        return uVar.j();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void k(u.a aVar, long j) {
        this.g = aVar;
        u uVar = this.f;
        if (uVar != null) {
            long j2 = this.j;
            if (j2 == -9223372036854775807L) {
                j2 = this.c;
            }
            uVar.k(this, j2);
        }
    }

    public final void l(v vVar) {
        boolean z;
        if (this.e == null) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        this.e = vVar;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void n() throws IOException {
        try {
            u uVar = this.f;
            if (uVar != null) {
                uVar.n();
            } else {
                v vVar = this.e;
                if (vVar != null) {
                    vVar.j();
                }
            }
        } catch (IOException e) {
            a aVar = this.h;
            if (aVar != null) {
                if (!this.i) {
                    this.i = true;
                    b.c cVar = (b.c) aVar;
                    v.b bVar = com.amazon.aps.iva.p6.b.x;
                    com.amazon.aps.iva.p6.b bVar2 = com.amazon.aps.iva.p6.b.this;
                    v.b bVar3 = this.b;
                    bVar2.o(bVar3).j(new q(q.a(), new com.amazon.aps.iva.w5.i(cVar.a), SystemClock.elapsedRealtime()), 6, new b.a(e), true);
                    bVar2.r.post(new com.amazon.aps.iva.n4.h(cVar, 3, bVar3, e));
                    return;
                }
                return;
            }
            throw e;
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean p(long j) {
        u uVar = this.f;
        if (uVar != null && uVar.p(j)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final o0 q() {
        u uVar = this.f;
        int i = com.amazon.aps.iva.t5.g0.a;
        return uVar.q();
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        u uVar = this.f;
        int i = com.amazon.aps.iva.t5.g0.a;
        return uVar.s();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void t(long j, boolean z) {
        u uVar = this.f;
        int i = com.amazon.aps.iva.t5.g0.a;
        uVar.t(j, z);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
        u uVar = this.f;
        int i = com.amazon.aps.iva.t5.g0.a;
        uVar.v(j);
    }
}
