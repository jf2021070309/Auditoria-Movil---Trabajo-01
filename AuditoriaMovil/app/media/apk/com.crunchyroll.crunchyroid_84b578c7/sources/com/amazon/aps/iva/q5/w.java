package com.amazon.aps.iva.q5;

import android.os.Looper;
import com.amazon.aps.iva.q5.l0;
import java.util.List;
/* compiled from: ForwardingPlayer.java */
/* loaded from: classes.dex */
public class w implements l0 {
    public final l0 a;

    /* compiled from: ForwardingPlayer.java */
    /* loaded from: classes.dex */
    public static final class a implements l0.c {
        public final w b;
        public final l0.c c;

        public a(w wVar, l0.c cVar) {
            this.b = wVar;
            this.c = cVar;
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void B(y0 y0Var) {
            this.c.B(y0Var);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void C(int i) {
            this.c.C(i);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void D(boolean z) {
            this.c.d0(z);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void E(d0 d0Var) {
            this.c.E(d0Var);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void H(int i, l0.d dVar, l0.d dVar2) {
            this.c.H(i, dVar, dVar2);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void J(int i) {
            this.c.J(i);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void M(boolean z) {
            this.c.M(z);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void O(l0 l0Var, l0.b bVar) {
            this.c.O(this.b, bVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void P(com.amazon.aps.iva.a6.l lVar) {
            this.c.P(lVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void V() {
            this.c.V();
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void W(List<com.amazon.aps.iva.s5.a> list) {
            this.c.W(list);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void X(int i, int i2) {
            this.c.X(i, i2);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void Z(com.amazon.aps.iva.a6.l lVar) {
            this.c.Z(lVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void b(v0 v0Var) {
            this.c.b(v0Var);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void b0(int i) {
            this.c.b0(i);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void c0(u0 u0Var) {
            this.c.c0(u0Var);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void d0(boolean z) {
            this.c.d0(z);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void e(f fVar) {
            this.c.e(fVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void e0(q qVar) {
            this.c.e0(qVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.b.equals(aVar.b)) {
                return false;
            }
            return this.c.equals(aVar.c);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void g(com.amazon.aps.iva.s5.b bVar) {
            this.c.g(bVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void g0(int i, boolean z) {
            this.c.g0(i, z);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void h(boolean z) {
            this.c.h(z);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void h0(float f) {
            this.c.h0(f);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void i0(k0 k0Var) {
            this.c.i0(k0Var);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void l0(int i, b0 b0Var) {
            this.c.l0(i, b0Var);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void m0(int i, boolean z) {
            this.c.m0(i, z);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void o0(l0.a aVar) {
            this.c.o0(aVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void p(d0 d0Var) {
            this.c.p(d0Var);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void q0(r0 r0Var, int i) {
            this.c.q0(r0Var, i);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void s0(boolean z) {
            this.c.s0(z);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void t(f0 f0Var) {
            this.c.t(f0Var);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void w(int i) {
            this.c.w(i);
        }
    }

    public w(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public void A0(int i, b0 b0Var) {
        this.a.A0(i, b0Var);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public void T(int i, b0 b0Var) {
        this.a.T(i, b0Var);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final Looper c0() {
        return this.a.c0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public b0 m0(int i) {
        return this.a.m0(i);
    }
}
