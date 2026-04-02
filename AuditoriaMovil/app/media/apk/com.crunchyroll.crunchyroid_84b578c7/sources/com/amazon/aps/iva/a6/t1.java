package com.amazon.aps.iva.a6;
/* compiled from: StandaloneMediaClock.java */
/* loaded from: classes.dex */
public final class t1 implements u0 {
    public final com.amazon.aps.iva.t5.d b;
    public boolean c;
    public long d;
    public long e;
    public com.amazon.aps.iva.q5.k0 f = com.amazon.aps.iva.q5.k0.e;

    public t1(com.amazon.aps.iva.t5.y yVar) {
        this.b = yVar;
    }

    public final void a(long j) {
        this.d = j;
        if (this.c) {
            this.e = this.b.elapsedRealtime();
        }
    }

    @Override // com.amazon.aps.iva.a6.u0
    public final com.amazon.aps.iva.q5.k0 e() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.a6.u0
    public final void f(com.amazon.aps.iva.q5.k0 k0Var) {
        if (this.c) {
            a(t());
        }
        this.f = k0Var;
    }

    @Override // com.amazon.aps.iva.a6.u0
    public final long t() {
        long j;
        long j2 = this.d;
        if (this.c) {
            long elapsedRealtime = this.b.elapsedRealtime() - this.e;
            com.amazon.aps.iva.q5.k0 k0Var = this.f;
            if (k0Var.b == 1.0f) {
                j = com.amazon.aps.iva.t5.g0.Q(elapsedRealtime);
            } else {
                j = elapsedRealtime * k0Var.d;
            }
            return j2 + j;
        }
        return j2;
    }
}
