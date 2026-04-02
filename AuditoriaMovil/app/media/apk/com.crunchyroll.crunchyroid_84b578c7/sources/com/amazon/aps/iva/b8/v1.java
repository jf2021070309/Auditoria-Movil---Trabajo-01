package com.amazon.aps.iva.b8;

import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.w;
import com.google.android.gms.cast.MediaStatus;
import com.google.common.collect.ImmutableList;
import java.util.List;
/* compiled from: PlayerWrapper.java */
/* loaded from: classes.dex */
public final class v1 extends com.amazon.aps.iva.q5.w {
    public int b;
    public ImmutableList<b> c;

    /* compiled from: PlayerWrapper.java */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.q5.r0 {
        public static final Object l = new Object();
        public final com.amazon.aps.iva.q5.b0 g;
        public final boolean h;
        public final boolean i;
        public final b0.f j;
        public final long k;

        public a(v1 v1Var) {
            b0.f fVar;
            this.g = v1Var.r();
            this.h = v1Var.H0();
            this.i = v1Var.Y();
            if (v1Var.W0()) {
                fVar = b0.f.g;
            } else {
                fVar = null;
            }
            this.j = fVar;
            this.k = com.amazon.aps.iva.t5.g0.Q(v1Var.o0());
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int c(Object obj) {
            if (l.equals(obj)) {
                return 0;
            }
            return -1;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final r0.b h(int i, r0.b bVar, boolean z) {
            Object obj = l;
            bVar.k(obj, obj, this.k, 0L);
            return bVar;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int j() {
            return 1;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final Object n(int i) {
            return l;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final r0.d p(int i, r0.d dVar, long j) {
            dVar.c(l, this.g, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.h, this.i, this.j, 0L, this.k, 0, 0, 0L);
            return dVar;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int q() {
            return 1;
        }
    }

    public v1(com.amazon.aps.iva.q5.l0 l0Var) {
        super(l0Var);
        this.b = -1;
        this.c = ImmutableList.of();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void A(int i) {
        f1();
        this.a.A(i);
    }

    @Override // com.amazon.aps.iva.q5.w, com.amazon.aps.iva.q5.l0
    public final void A0(int i, com.amazon.aps.iva.q5.b0 b0Var) {
        f1();
        super.A0(i, b0Var);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void B(SurfaceView surfaceView) {
        f1();
        this.a.B(surfaceView);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void B0(int i) {
        f1();
        this.a.B0(i);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void C(int i, int i2, List<com.amazon.aps.iva.q5.b0> list) {
        f1();
        this.a.C(i, i2, list);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long C0() {
        f1();
        return this.a.C0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void D(com.amazon.aps.iva.q5.u0 u0Var) {
        f1();
        this.a.D(u0Var);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void E(int i) {
        f1();
        this.a.E(i);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long E0() {
        f1();
        return this.a.E0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int F() {
        f1();
        return this.a.F();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void F0(int i, List<com.amazon.aps.iva.q5.b0> list) {
        f1();
        this.a.F0(i, list);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void G(int i, int i2) {
        f1();
        this.a.G(i, i2);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long G0() {
        f1();
        return this.a.G0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean H0() {
        f1();
        return this.a.H0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void I(com.amazon.aps.iva.q5.d0 d0Var) {
        f1();
        this.a.I(d0Var);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.d0 I0() {
        f1();
        return this.a.I0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void J() {
        f1();
        this.a.J();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean J0() {
        f1();
        return this.a.J0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.j0 K() {
        f1();
        return this.a.K();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int K0() {
        f1();
        return this.a.K0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void L(boolean z) {
        f1();
        this.a.L(z);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void L0(SurfaceView surfaceView) {
        f1();
        this.a.L0(surfaceView);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void M0(int i, int i2) {
        f1();
        this.a.M0(i, i2);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void N() {
        f1();
        this.a.N();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void N0(int i, int i2, int i3) {
        f1();
        this.a.N0(i, i2, i3);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void O0(List<com.amazon.aps.iva.q5.b0> list) {
        f1();
        this.a.O0(list);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void P(int i) {
        f1();
        this.a.P(i);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean P0() {
        f1();
        return this.a.P0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.v0 Q() {
        f1();
        return this.a.Q();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean Q0() {
        f1();
        return this.a.Q0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean R() {
        f1();
        return this.a.R();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long R0() {
        f1();
        return this.a.R0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.s5.b S() {
        f1();
        return this.a.S();
    }

    @Override // com.amazon.aps.iva.q5.l0
    @Deprecated
    public final void S0(int i) {
        f1();
        this.a.S0(i);
    }

    @Override // com.amazon.aps.iva.q5.w, com.amazon.aps.iva.q5.l0
    public final void T(int i, com.amazon.aps.iva.q5.b0 b0Var) {
        f1();
        super.T(i, b0Var);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void T0() {
        f1();
        this.a.T0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int U() {
        f1();
        return this.a.U();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.d0 U0() {
        f1();
        return this.a.U0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean V(int i) {
        f1();
        return this.a.V(i);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long V0() {
        f1();
        return this.a.V0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean W0() {
        f1();
        return this.a.W0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    @Deprecated
    public final void X(boolean z) {
        f1();
        this.a.X(z);
    }

    public final PlaybackStateCompat X0() {
        long j;
        float f;
        long j2;
        long j3 = 0;
        if (this.b != -1) {
            PlaybackStateCompat.d dVar = new PlaybackStateCompat.d();
            dVar.h(0.0f, 7, -1L, SystemClock.elapsedRealtime());
            dVar.c(0L);
            dVar.e(0L);
            int i = this.b;
            com.amazon.aps.iva.cq.b.z(null);
            dVar.f(i, null);
            com.amazon.aps.iva.cq.b.z(null);
            dVar.g(null);
            return dVar.b();
        }
        com.amazon.aps.iva.q5.j0 K = K();
        int d = q1.d(K, h(), k0());
        l0.a j0 = j0();
        long j4 = 128;
        for (int i2 = 0; i2 < j0.c(); i2++) {
            int b = j0.b(i2);
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 31) {
                            switch (b) {
                                case 5:
                                    j2 = 256;
                                    continue;
                                case 6:
                                case 7:
                                    j2 = 16;
                                    continue;
                                case 8:
                                case 9:
                                    j2 = 32;
                                    continue;
                                case 10:
                                    j2 = MediaStatus.COMMAND_EDIT_TRACKS;
                                    continue;
                                case 11:
                                    j2 = 8;
                                    continue;
                                case 12:
                                    j2 = 64;
                                    continue;
                                case 13:
                                    j2 = 4194304;
                                    continue;
                                case 14:
                                    j2 = 2621440;
                                    continue;
                                case 15:
                                    j2 = MediaStatus.COMMAND_STREAM_TRANSFER;
                                    continue;
                                default:
                                    j2 = 0;
                                    continue;
                            }
                        } else {
                            j2 = 240640;
                        }
                    } else {
                        j2 = 1;
                    }
                } else {
                    j2 = 16384;
                }
            } else {
                j2 = 518;
            }
            j4 |= j2;
        }
        long j5 = -1;
        if (V(17)) {
            j = q1.e(K0());
        } else {
            j = -1;
        }
        float f2 = e().b;
        if (J0()) {
            f = f2;
        } else {
            f = 0.0f;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("EXO_SPEED", f2);
        com.amazon.aps.iva.q5.b0 b1 = b1();
        if (b1 != null) {
            String str = b1.b;
            if (!"".equals(str)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str);
            }
        }
        boolean V = V(16);
        if (V) {
            j5 = a();
        }
        long j6 = j5;
        if (V) {
            j3 = G0();
        }
        PlaybackStateCompat.d dVar2 = new PlaybackStateCompat.d();
        dVar2.h(f, d, j6, SystemClock.elapsedRealtime());
        dVar2.c(j4);
        dVar2.d(j);
        dVar2.e(j3);
        dVar2.g(bundle);
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            b bVar = this.c.get(i3);
            x1 x1Var = bVar.b;
            if (x1Var != null && x1Var.b == 0) {
                PlaybackStateCompat.CustomAction.b bVar2 = new PlaybackStateCompat.CustomAction.b(bVar.e, bVar.d, x1Var.c);
                bVar2.b(x1Var.d);
                dVar2.a(bVar2.a());
            }
        }
        if (K != null) {
            String message = K.getMessage();
            int i4 = com.amazon.aps.iva.t5.g0.a;
            dVar2.f(0, message);
        }
        return dVar2.b();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean Y() {
        f1();
        return this.a.Y();
    }

    public final r1 Y0() {
        com.amazon.aps.iva.q5.d0 d0Var;
        float f;
        com.amazon.aps.iva.q5.f fVar;
        com.amazon.aps.iva.s5.b bVar;
        int i;
        com.amazon.aps.iva.q5.v0 v0Var;
        com.amazon.aps.iva.q5.j0 K = K();
        z1 a1 = a1();
        l0.d Z0 = Z0();
        l0.d Z02 = Z0();
        com.amazon.aps.iva.q5.k0 e = e();
        int n = n();
        boolean Q0 = Q0();
        com.amazon.aps.iva.q5.y0 s0 = s0();
        com.amazon.aps.iva.q5.r0 c1 = c1();
        if (V(18)) {
            d0Var = I0();
        } else {
            d0Var = com.amazon.aps.iva.q5.d0.J;
        }
        com.amazon.aps.iva.q5.d0 d0Var2 = d0Var;
        if (V(22)) {
            f = getVolume();
        } else {
            f = 0.0f;
        }
        float f2 = f;
        if (V(21)) {
            fVar = u0();
        } else {
            fVar = com.amazon.aps.iva.q5.f.h;
        }
        com.amazon.aps.iva.q5.f fVar2 = fVar;
        if (V(28)) {
            bVar = S();
        } else {
            bVar = com.amazon.aps.iva.s5.b.d;
        }
        com.amazon.aps.iva.s5.b bVar2 = bVar;
        com.amazon.aps.iva.q5.q v0 = v0();
        if (V(23)) {
            i = g0();
        } else {
            i = 0;
        }
        int i2 = i;
        boolean e1 = e1();
        boolean k0 = k0();
        int Z = Z();
        int h = h();
        boolean J0 = J0();
        boolean isLoading = isLoading();
        com.amazon.aps.iva.q5.d0 d1 = d1();
        long V0 = V0();
        long C0 = C0();
        long n0 = n0();
        if (V(30)) {
            v0Var = Q();
        } else {
            v0Var = com.amazon.aps.iva.q5.v0.c;
        }
        return new r1(K, 0, a1, Z0, Z02, 0, e, n, Q0, s0, c1, 0, d0Var2, f2, fVar2, bVar2, v0, i2, e1, k0, 1, Z, h, J0, isLoading, d1, V0, C0, n0, v0Var, i());
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int Z() {
        f1();
        return this.a.Z();
    }

    public final l0.d Z0() {
        int i;
        com.amazon.aps.iva.q5.b0 b0Var;
        int i2;
        long j;
        int i3;
        int i4;
        boolean V = V(16);
        boolean V2 = V(17);
        if (V2) {
            i = K0();
        } else {
            i = 0;
        }
        if (V) {
            b0Var = r();
        } else {
            b0Var = null;
        }
        if (V2) {
            i2 = p0();
        } else {
            i2 = 0;
        }
        long j2 = 0;
        if (V) {
            j = a();
        } else {
            j = 0;
        }
        if (V) {
            j2 = E0();
        }
        long j3 = j2;
        if (V) {
            i3 = U();
        } else {
            i3 = -1;
        }
        if (V) {
            i4 = z0();
        } else {
            i4 = -1;
        }
        return new l0.d(null, i, b0Var, null, i2, j, j3, i3, i4);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long a() {
        f1();
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.r0 a0() {
        f1();
        return this.a.a0();
    }

    public final z1 a1() {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean V = V(16);
        l0.d Z0 = Z0();
        int i = 0;
        if (V && o()) {
            z = true;
        } else {
            z = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = -9223372036854775807L;
        if (V) {
            j = getDuration();
        } else {
            j = -9223372036854775807L;
        }
        if (V) {
            j2 = G0();
        } else {
            j2 = 0;
        }
        if (V) {
            i = s();
        }
        int i2 = i;
        if (V) {
            j3 = p();
        } else {
            j3 = 0;
        }
        if (V) {
            j4 = h0();
        } else {
            j4 = -9223372036854775807L;
        }
        if (V) {
            j6 = o0();
        }
        long j7 = j6;
        if (V) {
            j5 = R0();
        } else {
            j5 = 0;
        }
        return new z1(Z0, z, elapsedRealtime, j, j2, i2, j3, j4, j7, j5);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void b() {
        f1();
        this.a.b();
    }

    public final com.amazon.aps.iva.q5.b0 b1() {
        if (V(16)) {
            return r();
        }
        return null;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void c(long j) {
        f1();
        this.a.c(j);
    }

    public final com.amazon.aps.iva.q5.r0 c1() {
        if (V(17)) {
            return a0();
        }
        if (V(16)) {
            return new a(this);
        }
        return com.amazon.aps.iva.q5.r0.b;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void d() {
        f1();
        this.a.d();
    }

    @Override // com.amazon.aps.iva.q5.l0
    @Deprecated
    public final void d0() {
        f1();
        this.a.d0();
    }

    public final com.amazon.aps.iva.q5.d0 d1() {
        if (V(18)) {
            return U0();
        }
        return com.amazon.aps.iva.q5.d0.J;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.k0 e() {
        f1();
        return this.a.e();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void e0() {
        f1();
        this.a.e0();
    }

    public final boolean e1() {
        if (V(23) && P0()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void f(com.amazon.aps.iva.q5.k0 k0Var) {
        f1();
        this.a.f(k0Var);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void f0(TextureView textureView) {
        f1();
        this.a.f0(textureView);
    }

    public final void f1() {
        boolean z;
        if (Looper.myLooper() == c0()) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void g() {
        f1();
        this.a.g();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int g0() {
        f1();
        return this.a.g0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long getDuration() {
        f1();
        return this.a.getDuration();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final float getVolume() {
        f1();
        return this.a.getVolume();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int h() {
        f1();
        return this.a.h();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long h0() {
        f1();
        return this.a.h0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.u0 i() {
        f1();
        return this.a.i();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void i0(int i, long j) {
        f1();
        this.a.i0(i, j);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean isLoading() {
        f1();
        return this.a.isLoading();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void j(float f) {
        f1();
        this.a.j(f);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final l0.a j0() {
        f1();
        return this.a.j0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void k(float f) {
        f1();
        this.a.k(f);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean k0() {
        f1();
        return this.a.k0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void l(int i) {
        f1();
        this.a.l(i);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void l0(boolean z) {
        f1();
        this.a.l0(z);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void m(Surface surface) {
        f1();
        this.a.m(surface);
    }

    @Override // com.amazon.aps.iva.q5.w, com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.b0 m0(int i) {
        f1();
        return super.m0(i);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int n() {
        f1();
        return this.a.n();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long n0() {
        f1();
        return this.a.n0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean o() {
        f1();
        return this.a.o();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long o0() {
        f1();
        return this.a.o0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final long p() {
        f1();
        return this.a.p();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int p0() {
        f1();
        return this.a.p0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void pause() {
        f1();
        this.a.pause();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void q() {
        f1();
        this.a.q();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void q0(com.amazon.aps.iva.q5.b0 b0Var) {
        f1();
        this.a.q0(b0Var);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.b0 r() {
        f1();
        return this.a.r();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void r0(TextureView textureView) {
        f1();
        this.a.r0(textureView);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void release() {
        f1();
        this.a.release();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int s() {
        f1();
        return this.a.s();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.y0 s0() {
        f1();
        return this.a.s0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void stop() {
        f1();
        this.a.stop();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void t(com.amazon.aps.iva.q5.b0 b0Var, long j) {
        f1();
        this.a.t(b0Var, j);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void t0(l0.c cVar) {
        f1();
        this.a.t0(new w.a(this, cVar));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void u(l0.c cVar) {
        f1();
        this.a.u(new w.a(this, cVar));
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.f u0() {
        f1();
        return this.a.u0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void v() {
        f1();
        this.a.v();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final com.amazon.aps.iva.q5.q v0() {
        f1();
        return this.a.v0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void w() {
        f1();
        this.a.w();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void w0(int i, int i2) {
        f1();
        this.a.w0(i, i2);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void x(int i, boolean z) {
        f1();
        this.a.x(i, z);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final boolean x0() {
        f1();
        return this.a.x0();
    }

    @Override // com.amazon.aps.iva.q5.l0
    @Deprecated
    public final void y() {
        f1();
        this.a.y();
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void y0(int i, long j, ImmutableList immutableList) {
        f1();
        this.a.y0(i, j, immutableList);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final void z(ImmutableList immutableList) {
        f1();
        this.a.z(immutableList);
    }

    @Override // com.amazon.aps.iva.q5.l0
    public final int z0() {
        f1();
        return this.a.z0();
    }
}
