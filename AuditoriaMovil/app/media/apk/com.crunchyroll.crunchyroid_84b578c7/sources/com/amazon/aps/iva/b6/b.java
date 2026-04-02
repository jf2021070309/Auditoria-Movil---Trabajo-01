package com.amazon.aps.iva.b6;

import android.util.SparseArray;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.l0;
import com.google.common.base.Objects;
import java.io.IOException;
/* compiled from: AnalyticsListener.java */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: AnalyticsListener.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final com.amazon.aps.iva.q5.r0 b;
        public final int c;
        public final v.b d;
        public final long e;
        public final com.amazon.aps.iva.q5.r0 f;
        public final int g;
        public final v.b h;
        public final long i;
        public final long j;

        public a(long j, com.amazon.aps.iva.q5.r0 r0Var, int i, v.b bVar, long j2, com.amazon.aps.iva.q5.r0 r0Var2, int i2, v.b bVar2, long j3, long j4) {
            this.a = j;
            this.b = r0Var;
            this.c = i;
            this.d = bVar;
            this.e = j2;
            this.f = r0Var2;
            this.g = i2;
            this.h = bVar2;
            this.i = j3;
            this.j = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && Objects.equal(this.b, aVar.b) && Objects.equal(this.d, aVar.d) && Objects.equal(this.f, aVar.f) && Objects.equal(this.h, aVar.h)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    /* compiled from: AnalyticsListener.java */
    /* renamed from: com.amazon.aps.iva.b6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0132b {
        public final com.amazon.aps.iva.q5.u a;
        public final SparseArray<a> b;

        public C0132b(com.amazon.aps.iva.q5.u uVar, SparseArray<a> sparseArray) {
            this.a = uVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(uVar.c());
            for (int i = 0; i < uVar.c(); i++) {
                int b = uVar.b(i);
                a aVar = sparseArray.get(b);
                aVar.getClass();
                sparseArray2.append(b, aVar);
            }
            this.b = sparseArray2;
        }

        public final boolean a(int i) {
            return this.a.a.get(i);
        }
    }

    default void B(a aVar) {
    }

    default void E(a aVar) {
    }

    default void J(a aVar) {
    }

    default void P(a aVar) {
    }

    default void R(a aVar) {
    }

    default void j(a aVar) {
    }

    default void k(a aVar) {
    }

    default void A(a aVar, com.amazon.aps.iva.q5.v vVar) {
    }

    default void D(a aVar, com.amazon.aps.iva.q5.f fVar) {
    }

    default void F(a aVar, com.amazon.aps.iva.o6.t tVar) {
    }

    default void H(a aVar, int i) {
    }

    default void I(a aVar, String str) {
    }

    default void K(a aVar, com.amazon.aps.iva.a6.f fVar) {
    }

    default void L(a aVar, int i) {
    }

    default void M(a aVar, com.amazon.aps.iva.q5.d0 d0Var) {
    }

    @Deprecated
    default void N(a aVar, String str) {
    }

    default void O(a aVar, int i) {
    }

    default void Q(a aVar, float f) {
    }

    default void S(a aVar, boolean z) {
    }

    default void T(a aVar, com.amazon.aps.iva.q5.j0 j0Var) {
    }

    default void a(a aVar, boolean z) {
    }

    default void b(a aVar, com.amazon.aps.iva.q5.y0 y0Var) {
    }

    default void c(int i, a aVar) {
    }

    default void d(a aVar, Exception exc) {
    }

    default void f(a aVar, boolean z) {
    }

    default void g(a aVar, boolean z) {
    }

    default void h(a aVar, com.amazon.aps.iva.q5.v0 v0Var) {
    }

    default void l(a aVar, com.amazon.aps.iva.q5.k0 k0Var) {
    }

    default void m(a aVar, Object obj) {
    }

    @Deprecated
    default void o(a aVar, String str) {
    }

    default void p(a aVar, int i) {
    }

    default void r(a aVar, com.amazon.aps.iva.o6.t tVar) {
    }

    default void t(com.amazon.aps.iva.q5.l0 l0Var, C0132b c0132b) {
    }

    default void u(a aVar, int i) {
    }

    default void v(a aVar, com.amazon.aps.iva.q5.v vVar) {
    }

    default void w(a aVar, com.amazon.aps.iva.q5.f0 f0Var) {
    }

    default void y(a aVar, String str) {
    }

    default void C(a aVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
    }

    default void G(a aVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
    }

    default void i(int i, a aVar, boolean z) {
    }

    default void n(a aVar, com.amazon.aps.iva.q5.b0 b0Var, int i) {
    }

    default void q(a aVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
    }

    default void x(a aVar, int i, int i2) {
    }

    default void z(a aVar, int i, long j) {
    }

    default void U(a aVar, int i, long j, long j2) {
    }

    default void e(int i, l0.d dVar, l0.d dVar2, a aVar) {
    }

    default void s(a aVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar, IOException iOException) {
    }
}
