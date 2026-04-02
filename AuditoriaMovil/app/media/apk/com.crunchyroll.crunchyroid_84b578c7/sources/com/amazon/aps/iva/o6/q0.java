package com.amazon.aps.iva.o6;

import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.r0;
/* compiled from: WrappingMediaSource.java */
/* loaded from: classes.dex */
public abstract class q0 extends g<Void> {
    public final v k;

    public q0(v vVar) {
        this.k = vVar;
    }

    public abstract void A(r0 r0Var);

    public void B() {
        y(null, this.k);
    }

    @Override // com.amazon.aps.iva.o6.v
    public final com.amazon.aps.iva.q5.b0 b() {
        return this.k.b();
    }

    @Override // com.amazon.aps.iva.o6.v
    public final boolean k() {
        return this.k.k();
    }

    @Override // com.amazon.aps.iva.o6.v
    public final r0 l() {
        return this.k.l();
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void r(com.amazon.aps.iva.w5.y yVar) {
        this.j = yVar;
        this.i = com.amazon.aps.iva.t5.g0.m(null);
        B();
    }

    @Override // com.amazon.aps.iva.o6.g
    public final v.b u(Void r1, v.b bVar) {
        return z(bVar);
    }

    @Override // com.amazon.aps.iva.o6.g
    public final long v(long j, Object obj) {
        Void r3 = (Void) obj;
        return j;
    }

    @Override // com.amazon.aps.iva.o6.g
    public final int w(int i, Object obj) {
        Void r2 = (Void) obj;
        return i;
    }

    @Override // com.amazon.aps.iva.o6.g
    public final void x(Void r1, v vVar, r0 r0Var) {
        A(r0Var);
    }

    public v.b z(v.b bVar) {
        return bVar;
    }
}
