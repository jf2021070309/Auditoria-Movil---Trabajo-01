package com.amazon.aps.iva.q5;

import com.amazon.aps.iva.q5.r0;
import com.google.common.collect.ImmutableList;
import java.util.List;
/* compiled from: BasePlayer.java */
/* loaded from: classes.dex */
public abstract class i implements l0 {
    public final r0.d a = new r0.d();

    @Override // com.amazon.aps.iva.q5.l0
    public final void A0(int i, b0 b0Var) {
        ((com.amazon.aps.iva.a6.m0) this).F0(i, ImmutableList.of(b0Var));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void B0(int i) {
        a1(i, 10);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void E(int i) {
        ((com.amazon.aps.iva.a6.m0) this).G(i, i + 1);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int F() {
        return ((com.amazon.aps.iva.a6.m0) this).a0().q();
    }

    @Override // com.amazon.aps.iva.q5.l0
    @Deprecated
    public final int H() {
        return ((com.amazon.aps.iva.a6.m0) this).K0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean H0() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        r0 a0 = m0Var.a0();
        if (!a0.r() && a0.o(m0Var.K0(), this.a).i) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void J() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        if (!m0Var.a0().r() && !m0Var.o()) {
            boolean x0 = x0();
            if (W0() && !H0()) {
                if (x0) {
                    c1(7);
                    return;
                }
                return;
            }
            if (x0) {
                long a = m0Var.a();
                m0Var.n0();
                if (a <= 3000) {
                    c1(7);
                    return;
                }
            }
            Z0(m0Var.K0(), 0L, false);
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean J0() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        if (m0Var.h() == 3 && m0Var.k0() && m0Var.Z() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final Object M() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        r0 a0 = m0Var.a0();
        if (a0.r()) {
            return null;
        }
        return a0.o(m0Var.K0(), this.a).e;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void M0(int i, int i2) {
        if (i != i2) {
            ((com.amazon.aps.iva.a6.m0) this).N0(i, i + 1, i2);
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void N() {
        int X0 = X0();
        if (X0 != -1) {
            com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
            if (X0 == m0Var.K0()) {
                Z0(m0Var.K0(), -9223372036854775807L, true);
            } else {
                a1(X0, 8);
            }
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void O0(List<b0> list) {
        ((com.amazon.aps.iva.a6.m0) this).F0(Integer.MAX_VALUE, list);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean R() {
        if (X0() != -1) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void T(int i, b0 b0Var) {
        ((com.amazon.aps.iva.a6.m0) this).C(i, i + 1, ImmutableList.of(b0Var));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void T0() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        m0Var.G1();
        b1(11, -m0Var.u);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean V(int i) {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        m0Var.G1();
        return m0Var.M.a(i);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean W0() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        r0 a0 = m0Var.a0();
        if (!a0.r() && a0.o(m0Var.K0(), this.a).b()) {
            return true;
        }
        return false;
    }

    public final int X0() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        r0 a0 = m0Var.a0();
        if (a0.r()) {
            return -1;
        }
        int K0 = m0Var.K0();
        m0Var.G1();
        int i = m0Var.E;
        if (i == 1) {
            i = 0;
        }
        m0Var.G1();
        return a0.f(K0, i, m0Var.F);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean Y() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        r0 a0 = m0Var.a0();
        if (!a0.r() && a0.o(m0Var.K0(), this.a).j) {
            return true;
        }
        return false;
    }

    public final int Y0() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        r0 a0 = m0Var.a0();
        if (a0.r()) {
            return -1;
        }
        int K0 = m0Var.K0();
        m0Var.G1();
        int i = m0Var.E;
        if (i == 1) {
            i = 0;
        }
        m0Var.G1();
        return a0.m(K0, i, m0Var.F);
    }

    public abstract void Z0(int i, long j, boolean z);

    public final void a1(int i, int i2) {
        Z0(i, -9223372036854775807L, false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void b() {
        ((com.amazon.aps.iva.a6.m0) this).L(true);
    }

    public final void b1(int i, long j) {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        long a = m0Var.a() + j;
        long duration = m0Var.getDuration();
        if (duration != -9223372036854775807L) {
            a = Math.min(a, duration);
        }
        Z0(m0Var.K0(), Math.max(a, 0L), false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void c(long j) {
        Z0(((com.amazon.aps.iva.a6.m0) this).K0(), j, false);
    }

    public final void c1(int i) {
        int Y0 = Y0();
        if (Y0 == -1) {
            return;
        }
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        if (Y0 == m0Var.K0()) {
            Z0(m0Var.K0(), -9223372036854775807L, true);
        } else {
            a1(Y0, i);
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void d() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        m0Var.G1();
        b1(12, m0Var.v);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void e0() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        if (!m0Var.a0().r() && !m0Var.o()) {
            if (R()) {
                int X0 = X0();
                if (X0 != -1) {
                    if (X0 == m0Var.K0()) {
                        Z0(m0Var.K0(), -9223372036854775807L, true);
                    } else {
                        a1(X0, 9);
                    }
                }
            } else if (W0() && Y()) {
                a1(m0Var.K0(), 9);
            }
        }
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long h0() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        r0 a0 = m0Var.a0();
        if (a0.r()) {
            return -9223372036854775807L;
        }
        int K0 = m0Var.K0();
        r0.d dVar = this.a;
        if (a0.o(K0, dVar).g == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (com.amazon.aps.iva.t5.g0.y(dVar.h) - dVar.g) - m0Var.E0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void i0(int i, long j) {
        Z0(i, j, false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void k(float f) {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        m0Var.f(new k0(f, m0Var.e().c));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final b0 m0(int i) {
        return ((com.amazon.aps.iva.a6.m0) this).a0().o(i, this.a).d;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long o0() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        r0 a0 = m0Var.a0();
        if (a0.r()) {
            return -9223372036854775807L;
        }
        return a0.o(m0Var.K0(), this.a).a();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void pause() {
        ((com.amazon.aps.iva.a6.m0) this).L(false);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void q() {
        ((com.amazon.aps.iva.a6.m0) this).G(0, Integer.MAX_VALUE);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void q0(b0 b0Var) {
        ((com.amazon.aps.iva.a6.m0) this).z(ImmutableList.of(b0Var));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final b0 r() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        r0 a0 = m0Var.a0();
        if (a0.r()) {
            return null;
        }
        return a0.o(m0Var.K0(), this.a).d;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int s() {
        com.amazon.aps.iva.a6.m0 m0Var = (com.amazon.aps.iva.a6.m0) this;
        long G0 = m0Var.G0();
        long duration = m0Var.getDuration();
        if (G0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return com.amazon.aps.iva.t5.g0.i((int) ((G0 * 100) / duration), 0, 100);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void t(b0 b0Var, long j) {
        ((com.amazon.aps.iva.a6.m0) this).y0(0, j, ImmutableList.of(b0Var));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void v() {
        c1(6);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void w() {
        a1(((com.amazon.aps.iva.a6.m0) this).K0(), 4);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean x0() {
        if (Y0() != -1) {
            return true;
        }
        return false;
    }
}
