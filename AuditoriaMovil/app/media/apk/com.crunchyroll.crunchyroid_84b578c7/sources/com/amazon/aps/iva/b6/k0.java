package com.amazon.aps.iva.b6;

import android.os.Looper;
import android.util.SparseArray;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.t5.o;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: DefaultAnalyticsCollector.java */
/* loaded from: classes.dex */
public final class k0 implements com.amazon.aps.iva.b6.a {
    public final com.amazon.aps.iva.t5.d b;
    public final r0.b c;
    public final r0.d d;
    public final a e;
    public final SparseArray<b.a> f;
    public com.amazon.aps.iva.t5.o<b> g;
    public com.amazon.aps.iva.q5.l0 h;
    public com.amazon.aps.iva.t5.l i;
    public boolean j;

    /* compiled from: DefaultAnalyticsCollector.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final r0.b a;
        public ImmutableList<v.b> b = ImmutableList.of();
        public ImmutableMap<v.b, com.amazon.aps.iva.q5.r0> c = ImmutableMap.of();
        public v.b d;
        public v.b e;
        public v.b f;

        public a(r0.b bVar) {
            this.a = bVar;
        }

        public static v.b b(com.amazon.aps.iva.q5.l0 l0Var, ImmutableList<v.b> immutableList, v.b bVar, r0.b bVar2) {
            Object n;
            int i;
            com.amazon.aps.iva.q5.r0 a0 = l0Var.a0();
            int p0 = l0Var.p0();
            if (a0.r()) {
                n = null;
            } else {
                n = a0.n(p0);
            }
            if (!l0Var.o() && !a0.r()) {
                i = a0.g(p0, bVar2).c(com.amazon.aps.iva.t5.g0.Q(l0Var.a()) - bVar2.g());
            } else {
                i = -1;
            }
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                v.b bVar3 = immutableList.get(i2);
                if (c(bVar3, n, l0Var.o(), l0Var.U(), l0Var.z0(), i)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null) {
                if (c(bVar, n, l0Var.o(), l0Var.U(), l0Var.z0(), i)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean c(v.b bVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!bVar.a.equals(obj)) {
                return false;
            }
            int i4 = bVar.b;
            if ((!z || i4 != i || bVar.c != i2) && (z || i4 != -1 || bVar.e != i3)) {
                return false;
            }
            return true;
        }

        public final void a(ImmutableMap.Builder<v.b, com.amazon.aps.iva.q5.r0> builder, v.b bVar, com.amazon.aps.iva.q5.r0 r0Var) {
            if (bVar == null) {
                return;
            }
            if (r0Var.c(bVar.a) != -1) {
                builder.put(bVar, r0Var);
                return;
            }
            com.amazon.aps.iva.q5.r0 r0Var2 = this.c.get(bVar);
            if (r0Var2 != null) {
                builder.put(bVar, r0Var2);
            }
        }

        public final void d(com.amazon.aps.iva.q5.r0 r0Var) {
            ImmutableMap.Builder<v.b, com.amazon.aps.iva.q5.r0> builder = ImmutableMap.builder();
            if (this.b.isEmpty()) {
                a(builder, this.e, r0Var);
                if (!Objects.equal(this.f, this.e)) {
                    a(builder, this.f, r0Var);
                }
                if (!Objects.equal(this.d, this.e) && !Objects.equal(this.d, this.f)) {
                    a(builder, this.d, r0Var);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    a(builder, this.b.get(i), r0Var);
                }
                if (!this.b.contains(this.d)) {
                    a(builder, this.d, r0Var);
                }
            }
            this.c = builder.buildOrThrow();
        }
    }

    public k0(com.amazon.aps.iva.t5.d dVar) {
        dVar.getClass();
        this.b = dVar;
        int i = com.amazon.aps.iva.t5.g0.a;
        Looper myLooper = Looper.myLooper();
        this.g = new com.amazon.aps.iva.t5.o<>(myLooper == null ? Looper.getMainLooper() : myLooper, dVar, new com.amazon.aps.iva.q5.e(6));
        r0.b bVar = new r0.b();
        this.c = bVar;
        this.d = new r0.d();
        this.e = new a(bVar);
        this.f = new SparseArray<>();
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void A(int i, long j, long j2) {
        b.a x0 = x0();
        y0(x0, 1011, new a0(x0, i, j, j2, 0));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void B(com.amazon.aps.iva.q5.y0 y0Var) {
        b.a x0 = x0();
        y0(x0, 25, new h0(3, x0, y0Var));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void C(int i) {
        b.a t0 = t0();
        y0(t0, 6, new com.amazon.aps.iva.a6.h0(i, 1, t0));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void E(com.amazon.aps.iva.q5.d0 d0Var) {
        b.a t0 = t0();
        y0(t0, 14, new f(3, t0, d0Var));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void F(b bVar) {
        bVar.getClass();
        com.amazon.aps.iva.t5.o<b> oVar = this.g;
        oVar.getClass();
        synchronized (oVar.g) {
            if (!oVar.h) {
                oVar.d.add(new o.c<>(bVar));
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.z
    public final void G(int i, v.b bVar, final com.amazon.aps.iva.o6.q qVar, final com.amazon.aps.iva.o6.t tVar) {
        final b.a w0 = w0(i, bVar);
        y0(w0, 1000, new o.a() { // from class: com.amazon.aps.iva.b6.y
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).C(b.a.this, qVar, tVar);
            }
        });
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void H(final int i, final l0.d dVar, final l0.d dVar2) {
        if (i == 1) {
            this.j = false;
        }
        com.amazon.aps.iva.q5.l0 l0Var = this.h;
        l0Var.getClass();
        a aVar = this.e;
        aVar.d = a.b(l0Var, aVar.b, aVar.e, aVar.a);
        final b.a t0 = t0();
        y0(t0, 11, new o.a() { // from class: com.amazon.aps.iva.b6.h
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                bVar.e(i, dVar, dVar2, t0);
            }
        });
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void I(int i, v.b bVar) {
        b.a w0 = w0(i, bVar);
        y0(w0, 1026, new com.amazon.aps.iva.g1.o(w0, 4));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void J(int i) {
        b.a t0 = t0();
        y0(t0, 4, new u(t0, i));
    }

    @Override // com.amazon.aps.iva.t6.d.a
    public final void K(int i, long j, long j2) {
        v.b bVar;
        a aVar = this.e;
        if (aVar.b.isEmpty()) {
            bVar = null;
        } else {
            bVar = (v.b) Iterables.getLast(aVar.b);
        }
        b.a u0 = u0(bVar);
        y0(u0, 1006, new a0(u0, i, j, j2, 1));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void L() {
        if (!this.j) {
            b.a t0 = t0();
            this.j = true;
            y0(t0, -1, new z(t0, 0));
        }
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void M(final boolean z) {
        final b.a t0 = t0();
        y0(t0, 9, new o.a() { // from class: com.amazon.aps.iva.b6.t
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).S(b.a.this, z);
            }
        });
    }

    @Override // com.amazon.aps.iva.o6.z
    public final void N(int i, v.b bVar, com.amazon.aps.iva.o6.t tVar) {
        b.a w0 = w0(i, bVar);
        y0(w0, WebSocketProtocol.CLOSE_NO_STATUS_CODE, new h0(0, w0, tVar));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void P(com.amazon.aps.iva.a6.l lVar) {
        b.a t0;
        com.amazon.aps.iva.q5.e0 e0Var;
        if ((lVar instanceof com.amazon.aps.iva.a6.l) && (e0Var = lVar.o) != null) {
            t0 = u0(new v.b(e0Var));
        } else {
            t0 = t0();
        }
        y0(t0, 10, new h0(2, t0, lVar));
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void Q(int i, v.b bVar) {
        b.a w0 = w0(i, bVar);
        y0(w0, 1025, new com.amazon.aps.iva.g1.q(w0, 3));
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void R(int i, v.b bVar, final int i2) {
        final b.a w0 = w0(i, bVar);
        y0(w0, 1022, new o.a() { // from class: com.amazon.aps.iva.b6.e
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                b bVar2 = (b) obj;
                bVar2.getClass();
                bVar2.L(b.a.this, i2);
            }
        });
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void S(int i, v.b bVar, Exception exc) {
        b.a w0 = w0(i, bVar);
        y0(w0, 1024, new f0(w0, exc, 0));
    }

    @Override // com.amazon.aps.iva.o6.z
    public final void T(int i, v.b bVar, final com.amazon.aps.iva.o6.q qVar, final com.amazon.aps.iva.o6.t tVar) {
        final b.a w0 = w0(i, bVar);
        y0(w0, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, new o.a() { // from class: com.amazon.aps.iva.b6.w
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).G(b.a.this, qVar, tVar);
            }
        });
    }

    @Override // com.amazon.aps.iva.o6.z
    public final void U(int i, v.b bVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar) {
        b.a w0 = w0(i, bVar);
        y0(w0, 1002, new o(w0, qVar, tVar));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void W(List<com.amazon.aps.iva.s5.a> list) {
        b.a t0 = t0();
        y0(t0, 27, new f(1, t0, list));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void X(int i, int i2) {
        b.a x0 = x0();
        y0(x0, 24, new com.amazon.aps.iva.b8.b1(i, i2, x0));
    }

    @Override // com.amazon.aps.iva.o6.z
    public final void Y(int i, v.b bVar, com.amazon.aps.iva.o6.t tVar) {
        b.a w0 = w0(i, bVar);
        y0(w0, 1004, new g0(1, w0, tVar));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void Z(com.amazon.aps.iva.a6.l lVar) {
        b.a t0;
        com.amazon.aps.iva.q5.e0 e0Var;
        if ((lVar instanceof com.amazon.aps.iva.a6.l) && (e0Var = lVar.o) != null) {
            t0 = u0(new v.b(e0Var));
        } else {
            t0 = t0();
        }
        y0(t0, 10, new p(t0, lVar));
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void a0(int i, v.b bVar) {
        b.a w0 = w0(i, bVar);
        y0(w0, 1027, new j0(w0, 0));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void b(com.amazon.aps.iva.q5.v0 v0Var) {
        b.a t0 = t0();
        y0(t0, 2, new j(0, t0, v0Var));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void c(String str) {
        b.a x0 = x0();
        y0(x0, 1019, new com.amazon.aps.iva.n4.e(1, x0, str));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void c0(com.amazon.aps.iva.q5.u0 u0Var) {
        b.a t0 = t0();
        y0(t0, 19, new d(3, t0, u0Var));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void d(String str) {
        b.a x0 = x0();
        y0(x0, 1012, new g0(0, x0, str));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void d0(final boolean z) {
        final b.a t0 = t0();
        y0(t0, 3, new o.a() { // from class: com.amazon.aps.iva.b6.e0
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                bVar.g(b.a.this, z);
            }
        });
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void e(com.amazon.aps.iva.q5.f fVar) {
        b.a x0 = x0();
        y0(x0, 20, new i(1, x0, fVar));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void e0(com.amazon.aps.iva.q5.q qVar) {
        b.a t0 = t0();
        y0(t0, 29, new d(1, t0, qVar));
    }

    @Override // com.amazon.aps.iva.g6.e
    public final void f0(int i, v.b bVar) {
        b.a w0 = w0(i, bVar);
        y0(w0, 1023, new j0(w0, 1));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void g(com.amazon.aps.iva.s5.b bVar) {
        b.a t0 = t0();
        y0(t0, 27, new g(1, t0, bVar));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void g0(final int i, final boolean z) {
        final b.a t0 = t0();
        y0(t0, 5, new o.a() { // from class: com.amazon.aps.iva.b6.r
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).i(i, t0, z);
            }
        });
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void h(boolean z) {
        b.a x0 = x0();
        y0(x0, 23, new d0(x0, z));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void h0(final float f) {
        final b.a x0 = x0();
        y0(x0, 22, new o.a() { // from class: com.amazon.aps.iva.b6.b0
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).Q(b.a.this, f);
            }
        });
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void i(Exception exc) {
        b.a x0 = x0();
        y0(x0, 1014, new g(0, x0, exc));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void i0(com.amazon.aps.iva.q5.k0 k0Var) {
        b.a t0 = t0();
        y0(t0, 12, new d(0, t0, k0Var));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void j(long j) {
        b.a x0 = x0();
        y0(x0, 1010, new x(x0, j));
    }

    @Override // com.amazon.aps.iva.o6.z
    public final void j0(int i, v.b bVar, final com.amazon.aps.iva.o6.q qVar, final com.amazon.aps.iva.o6.t tVar, final IOException iOException, final boolean z) {
        final b.a w0 = w0(i, bVar);
        y0(w0, 1003, new o.a(qVar, tVar, iOException, z) { // from class: com.amazon.aps.iva.b6.n
            public final /* synthetic */ com.amazon.aps.iva.o6.q c;
            public final /* synthetic */ com.amazon.aps.iva.o6.t d;
            public final /* synthetic */ IOException e;

            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).s(b.a.this, this.c, this.d, this.e);
            }
        });
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void k(com.amazon.aps.iva.q5.v vVar, com.amazon.aps.iva.a6.g gVar) {
        b.a x0 = x0();
        y0(x0, 1009, new i0(x0, vVar, gVar, 1));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void k0(b bVar) {
        this.g.d(bVar);
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void l(Exception exc) {
        b.a x0 = x0();
        y0(x0, 1030, new f(0, x0, exc));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void l0(final int i, final com.amazon.aps.iva.q5.b0 b0Var) {
        final b.a t0 = t0();
        y0(t0, 1, new o.a() { // from class: com.amazon.aps.iva.b6.v
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).n(b.a.this, b0Var, i);
            }
        });
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void m(final long j, final Object obj) {
        final b.a x0 = x0();
        y0(x0, 26, new o.a(obj, j) { // from class: com.amazon.aps.iva.b6.c0
            public final /* synthetic */ Object c;

            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj2) {
                ((b) obj2).m(b.a.this, this.c);
            }
        });
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void m0(int i, boolean z) {
        b.a t0 = t0();
        y0(t0, -1, new com.amazon.aps.iva.ab.f(i, t0, z));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void n(com.amazon.aps.iva.a6.f fVar) {
        b.a x0 = x0();
        y0(x0, 1007, new f(2, x0, fVar));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void n0(com.amazon.aps.iva.q5.l0 l0Var, Looper looper) {
        boolean z;
        if (this.h != null && !this.e.b.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        com.amazon.aps.iva.cq.b.C(z);
        this.h = l0Var;
        this.i = this.b.b(looper, null);
        com.amazon.aps.iva.t5.o<b> oVar = this.g;
        this.g = new com.amazon.aps.iva.t5.o<>(oVar.d, looper, oVar.a, new h0(1, this, l0Var), oVar.i);
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void o(final long j, final long j2, final String str) {
        final b.a x0 = x0();
        y0(x0, 1008, new o.a(str, j2, j) { // from class: com.amazon.aps.iva.b6.q
            public final /* synthetic */ String c;

            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).o(b.a.this, this.c);
            }
        });
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void o0(l0.a aVar) {
        b.a t0 = t0();
        y0(t0, 13, new i(0, t0, aVar));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void p(com.amazon.aps.iva.q5.d0 d0Var) {
        b.a t0 = t0();
        y0(t0, 15, new j(1, t0, d0Var));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void q(int i, long j) {
        b.a u0 = u0(this.e.e);
        y0(u0, 1021, new c(i, j, u0));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void q0(com.amazon.aps.iva.q5.r0 r0Var, int i) {
        com.amazon.aps.iva.q5.l0 l0Var = this.h;
        l0Var.getClass();
        a aVar = this.e;
        aVar.d = a.b(l0Var, aVar.b, aVar.e, aVar.a);
        aVar.d(l0Var.a0());
        b.a t0 = t0();
        y0(t0, 0, new l(t0, i));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void r(com.amazon.aps.iva.a6.f fVar) {
        b.a u0 = u0(this.e.e);
        y0(u0, 1020, new g0(3, u0, fVar));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void r0(ImmutableList immutableList, v.b bVar) {
        com.amazon.aps.iva.q5.l0 l0Var = this.h;
        l0Var.getClass();
        a aVar = this.e;
        aVar.getClass();
        aVar.b = ImmutableList.copyOf((Collection) immutableList);
        if (!immutableList.isEmpty()) {
            aVar.e = (v.b) immutableList.get(0);
            bVar.getClass();
            aVar.f = bVar;
        }
        if (aVar.d == null) {
            aVar.d = a.b(l0Var, aVar.b, aVar.e, aVar.a);
        }
        aVar.d(l0Var.a0());
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void release() {
        com.amazon.aps.iva.t5.l lVar = this.i;
        com.amazon.aps.iva.cq.b.D(lVar);
        lVar.i(new com.amazon.aps.iva.e.k(this, 1));
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void s(com.amazon.aps.iva.a6.f fVar) {
        b.a x0 = x0();
        y0(x0, 1015, new d(2, x0, fVar));
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void s0(final boolean z) {
        final b.a t0 = t0();
        y0(t0, 7, new o.a() { // from class: com.amazon.aps.iva.b6.s
            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, z);
            }
        });
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void t(com.amazon.aps.iva.q5.f0 f0Var) {
        b.a t0 = t0();
        y0(t0, 28, new g0(2, t0, f0Var));
    }

    public final b.a t0() {
        return u0(this.e.d);
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void u(final int i, final long j) {
        final b.a u0 = u0(this.e.e);
        y0(u0, 1018, new o.a(i, j, u0) { // from class: com.amazon.aps.iva.b6.m
            public final /* synthetic */ b.a b;
            public final /* synthetic */ int c;

            {
                this.b = u0;
            }

            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).c(this.c, this.b);
            }
        });
    }

    public final b.a u0(v.b bVar) {
        com.amazon.aps.iva.q5.r0 r0Var;
        boolean z;
        this.h.getClass();
        if (bVar == null) {
            r0Var = null;
        } else {
            r0Var = this.e.c.get(bVar);
        }
        if (bVar != null && r0Var != null) {
            return v0(r0Var, r0Var.i(bVar.a, this.c).d, bVar);
        }
        int K0 = this.h.K0();
        com.amazon.aps.iva.q5.r0 a0 = this.h.a0();
        if (K0 < a0.q()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            a0 = com.amazon.aps.iva.q5.r0.b;
        }
        return v0(a0, K0, null);
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void v(com.amazon.aps.iva.a6.f fVar) {
        b.a u0 = u0(this.e.e);
        y0(u0, 1013, new com.amazon.aps.iva.n4.e(2, u0, fVar));
    }

    public final b.a v0(com.amazon.aps.iva.q5.r0 r0Var, int i, v.b bVar) {
        v.b bVar2;
        boolean z;
        long e0;
        if (r0Var.r()) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        long elapsedRealtime = this.b.elapsedRealtime();
        boolean z2 = true;
        if (r0Var.equals(this.h.a0()) && i == this.h.K0()) {
            z = true;
        } else {
            z = false;
        }
        if (bVar2 != null && bVar2.a()) {
            if (!z || this.h.U() != bVar2.b || this.h.z0() != bVar2.c) {
                z2 = false;
            }
            if (z2) {
                e0 = this.h.a();
            }
            e0 = 0;
        } else if (z) {
            e0 = this.h.E0();
        } else {
            if (!r0Var.r()) {
                e0 = com.amazon.aps.iva.t5.g0.e0(r0Var.o(i, this.d).n);
            }
            e0 = 0;
        }
        return new b.a(elapsedRealtime, r0Var, i, bVar2, e0, this.h.a0(), this.h.K0(), this.e.d, this.h.a(), this.h.p());
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void w(int i) {
        b.a t0 = t0();
        y0(t0, 8, new com.amazon.aps.iva.a6.c0(i, 1, t0));
    }

    public final b.a w0(int i, v.b bVar) {
        this.h.getClass();
        boolean z = true;
        if (bVar != null) {
            if (this.e.c.get(bVar) == null) {
                z = false;
            }
            if (z) {
                return u0(bVar);
            }
            return v0(com.amazon.aps.iva.q5.r0.b, i, bVar);
        }
        com.amazon.aps.iva.q5.r0 a0 = this.h.a0();
        if (i >= a0.q()) {
            z = false;
        }
        if (!z) {
            a0 = com.amazon.aps.iva.q5.r0.b;
        }
        return v0(a0, i, null);
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void x(com.amazon.aps.iva.q5.v vVar, com.amazon.aps.iva.a6.g gVar) {
        b.a x0 = x0();
        y0(x0, 1017, new i0(x0, vVar, gVar, 0));
    }

    public final b.a x0() {
        return u0(this.e.f);
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void y(Exception exc) {
        b.a x0 = x0();
        y0(x0, 1029, new f0(x0, exc, 1));
    }

    public final void y0(b.a aVar, int i, o.a<b> aVar2) {
        this.f.put(i, aVar);
        this.g.e(i, aVar2);
    }

    @Override // com.amazon.aps.iva.b6.a
    public final void z(final long j, final long j2, final String str) {
        final b.a x0 = x0();
        y0(x0, 1016, new o.a(str, j2, j) { // from class: com.amazon.aps.iva.b6.k
            public final /* synthetic */ String c;

            @Override // com.amazon.aps.iva.t5.o.a
            public final void invoke(Object obj) {
                ((b) obj).N(b.a.this, this.c);
            }
        });
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void V() {
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void D(boolean z) {
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void b0(int i) {
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void O(com.amazon.aps.iva.q5.l0 l0Var, l0.b bVar) {
    }
}
