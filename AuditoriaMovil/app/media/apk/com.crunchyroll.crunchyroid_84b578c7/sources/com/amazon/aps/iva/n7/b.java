package com.amazon.aps.iva.n7;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.q;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.e0;
/* compiled from: IndexSeeker.java */
/* loaded from: classes.dex */
public final class b implements e {
    public final long a;
    public final q b;
    public final q c;
    public long d;

    public b(long j, long j2, long j3) {
        this.d = j;
        this.a = j3;
        q qVar = new q();
        this.b = qVar;
        q qVar2 = new q();
        this.c = qVar2;
        qVar.a(0L);
        qVar2.a(j2);
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long a(long j) {
        return this.b.b(g0.c(this.c, j));
    }

    public final boolean b(long j) {
        q qVar = this.b;
        if (j - qVar.b(qVar.a - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final d0.a d(long j) {
        q qVar = this.b;
        int c = g0.c(qVar, j);
        long b = qVar.b(c);
        q qVar2 = this.c;
        e0 e0Var = new e0(b, qVar2.b(c));
        if (b != j && c != qVar.a - 1) {
            int i = c + 1;
            return new d0.a(e0Var, new e0(qVar.b(i), qVar2.b(i)));
        }
        return new d0.a(e0Var, e0Var);
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long e() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final boolean f() {
        return true;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final long i() {
        return this.d;
    }
}
