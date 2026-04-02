package com.amazon.aps.iva.q5;

import android.os.Bundle;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.amazon.aps.iva.q5.u;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Player.java */
/* loaded from: classes.dex */
public interface l0 {

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public static final class a implements k {
        public static final a c;
        public static final String d;
        public final u b;

        /* compiled from: Player.java */
        /* renamed from: com.amazon.aps.iva.q5.l0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0636a {
            public static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};
            public final u.a a = new u.a();

            @CanIgnoreReturnValue
            public final void a(int i, boolean z) {
                u.a aVar = this.a;
                if (z) {
                    aVar.a(i);
                } else {
                    aVar.getClass();
                }
            }
        }

        static {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            com.amazon.aps.iva.cq.b.C(!false);
            c = new a(new u(sparseBooleanArray));
            d = com.amazon.aps.iva.t5.g0.L(0);
            new com.amazon.aps.iva.g1.e(3);
        }

        public a(u uVar) {
            this.b = uVar;
        }

        public final boolean a(int i) {
            return this.b.a.get(i);
        }

        public final int b(int i) {
            return this.b.b(i);
        }

        public final int c() {
            return this.b.c();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.b.equals(((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            int i = 0;
            while (true) {
                u uVar = this.b;
                if (i < uVar.c()) {
                    arrayList.add(Integer.valueOf(uVar.b(i)));
                    i++;
                } else {
                    bundle.putIntegerArrayList(d, arrayList);
                    return bundle;
                }
            }
        }
    }

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final u a;

        public b(u uVar) {
            this.a = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public static final class d implements k {
        public static final String k = com.amazon.aps.iva.t5.g0.L(0);
        public static final String l = com.amazon.aps.iva.t5.g0.L(1);
        public static final String m = com.amazon.aps.iva.t5.g0.L(2);
        public static final String n = com.amazon.aps.iva.t5.g0.L(3);
        public static final String o = com.amazon.aps.iva.t5.g0.L(4);
        public static final String p = com.amazon.aps.iva.t5.g0.L(5);
        public static final String q = com.amazon.aps.iva.t5.g0.L(6);
        public static final com.amazon.aps.iva.g1.f r = new com.amazon.aps.iva.g1.f(3);
        public final Object b;
        public final int c;
        public final b0 d;
        public final Object e;
        public final int f;
        public final long g;
        public final long h;
        public final int i;
        public final int j;

        public d(Object obj, int i, b0 b0Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.b = obj;
            this.c = i;
            this.d = b0Var;
            this.e = obj2;
            this.f = i2;
            this.g = j;
            this.h = j2;
            this.i = i3;
            this.j = i4;
        }

        public final Bundle a(boolean z, boolean z2) {
            int i;
            long j;
            int i2;
            Bundle bundle = new Bundle();
            int i3 = 0;
            if (z2) {
                i = this.c;
            } else {
                i = 0;
            }
            bundle.putInt(k, i);
            b0 b0Var = this.d;
            if (b0Var != null && z) {
                bundle.putBundle(l, b0Var.toBundle());
            }
            if (z2) {
                i3 = this.f;
            }
            bundle.putInt(m, i3);
            long j2 = 0;
            if (z) {
                j = this.g;
            } else {
                j = 0;
            }
            bundle.putLong(n, j);
            if (z) {
                j2 = this.h;
            }
            bundle.putLong(o, j2);
            int i4 = -1;
            if (z) {
                i2 = this.i;
            } else {
                i2 = -1;
            }
            bundle.putInt(p, i2);
            if (z) {
                i4 = this.j;
            }
            bundle.putInt(q, i4);
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.c == dVar.c && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j && Objects.equal(this.b, dVar.b) && Objects.equal(this.e, dVar.e) && Objects.equal(this.d, dVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j));
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            return a(true, true);
        }
    }

    void A(int i);

    void A0(int i, b0 b0Var);

    void B(SurfaceView surfaceView);

    void B0(int i);

    void C(int i, int i2, List<b0> list);

    long C0();

    void D(u0 u0Var);

    void E(int i);

    long E0();

    int F();

    void F0(int i, List<b0> list);

    void G(int i, int i2);

    long G0();

    @Deprecated
    int H();

    boolean H0();

    void I(d0 d0Var);

    d0 I0();

    void J();

    boolean J0();

    j0 K();

    int K0();

    void L(boolean z);

    void L0(SurfaceView surfaceView);

    Object M();

    void M0(int i, int i2);

    void N();

    void N0(int i, int i2, int i3);

    void O0(List<b0> list);

    void P(int i);

    boolean P0();

    v0 Q();

    boolean Q0();

    boolean R();

    long R0();

    com.amazon.aps.iva.s5.b S();

    @Deprecated
    void S0(int i);

    void T(int i, b0 b0Var);

    void T0();

    int U();

    d0 U0();

    boolean V(int i);

    long V0();

    boolean W0();

    @Deprecated
    void X(boolean z);

    boolean Y();

    int Z();

    long a();

    r0 a0();

    void b();

    void c(long j);

    Looper c0();

    void d();

    @Deprecated
    void d0();

    k0 e();

    void e0();

    void f(k0 k0Var);

    void f0(TextureView textureView);

    void g();

    int g0();

    long getDuration();

    float getVolume();

    int h();

    long h0();

    u0 i();

    void i0(int i, long j);

    boolean isLoading();

    void j(float f);

    a j0();

    void k(float f);

    boolean k0();

    void l(int i);

    void l0(boolean z);

    void m(Surface surface);

    b0 m0(int i);

    int n();

    long n0();

    boolean o();

    long o0();

    long p();

    int p0();

    void pause();

    void q();

    void q0(b0 b0Var);

    b0 r();

    void r0(TextureView textureView);

    void release();

    int s();

    y0 s0();

    void stop();

    void t(b0 b0Var, long j);

    void t0(c cVar);

    void u(c cVar);

    f u0();

    void v();

    q v0();

    void w();

    void w0(int i, int i2);

    void x(int i, boolean z);

    boolean x0();

    @Deprecated
    void y();

    void y0(int i, long j, ImmutableList immutableList);

    void z(ImmutableList immutableList);

    int z0();

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public interface c {
        default void V() {
        }

        default void B(y0 y0Var) {
        }

        default void C(int i) {
        }

        @Deprecated
        default void D(boolean z) {
        }

        default void E(d0 d0Var) {
        }

        default void J(int i) {
        }

        default void M(boolean z) {
        }

        default void P(com.amazon.aps.iva.a6.l lVar) {
        }

        @Deprecated
        default void W(List<com.amazon.aps.iva.s5.a> list) {
        }

        default void Z(com.amazon.aps.iva.a6.l lVar) {
        }

        default void b(v0 v0Var) {
        }

        @Deprecated
        default void b0(int i) {
        }

        default void c0(u0 u0Var) {
        }

        default void d0(boolean z) {
        }

        default void e(f fVar) {
        }

        default void e0(q qVar) {
        }

        default void g(com.amazon.aps.iva.s5.b bVar) {
        }

        default void h(boolean z) {
        }

        default void h0(float f) {
        }

        default void i0(k0 k0Var) {
        }

        default void o0(a aVar) {
        }

        default void p(d0 d0Var) {
        }

        default void s0(boolean z) {
        }

        default void t(f0 f0Var) {
        }

        default void w(int i) {
        }

        default void O(l0 l0Var, b bVar) {
        }

        default void X(int i, int i2) {
        }

        default void g0(int i, boolean z) {
        }

        default void l0(int i, b0 b0Var) {
        }

        @Deprecated
        default void m0(int i, boolean z) {
        }

        default void q0(r0 r0Var, int i) {
        }

        default void H(int i, d dVar, d dVar2) {
        }
    }
}
