package com.amazon.aps.iva.a6;
/* compiled from: DefaultMediaClock.java */
/* loaded from: classes.dex */
public final class j implements u0 {
    public final t1 b;
    public final a c;
    public o1 d;
    public u0 e;
    public boolean f = true;
    public boolean g;

    /* compiled from: DefaultMediaClock.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public j(a aVar, com.amazon.aps.iva.t5.y yVar) {
        this.c = aVar;
        this.b = new t1(yVar);
    }

    @Override // com.amazon.aps.iva.a6.u0
    public final com.amazon.aps.iva.q5.k0 e() {
        u0 u0Var = this.e;
        if (u0Var != null) {
            return u0Var.e();
        }
        return this.b.f;
    }

    @Override // com.amazon.aps.iva.a6.u0
    public final void f(com.amazon.aps.iva.q5.k0 k0Var) {
        u0 u0Var = this.e;
        if (u0Var != null) {
            u0Var.f(k0Var);
            k0Var = this.e.e();
        }
        this.b.f(k0Var);
    }

    @Override // com.amazon.aps.iva.a6.u0
    public final long t() {
        if (this.f) {
            return this.b.t();
        }
        u0 u0Var = this.e;
        u0Var.getClass();
        return u0Var.t();
    }
}
