package com.amazon.aps.iva.b8;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
/* compiled from: PlayerInfo.java */
/* loaded from: classes.dex */
public final class r1 implements com.amazon.aps.iva.q5.k {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final r1 G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String k0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final com.amazon.aps.iva.q5.d0 A;
    public final long B;
    public final long C;
    public final long D;
    public final com.amazon.aps.iva.q5.v0 E;
    public final com.amazon.aps.iva.q5.u0 F;
    public final com.amazon.aps.iva.q5.j0 b;
    public final int c;
    public final z1 d;
    public final l0.d e;
    public final l0.d f;
    public final int g;
    public final com.amazon.aps.iva.q5.k0 h;
    public final int i;
    public final boolean j;
    public final com.amazon.aps.iva.q5.r0 k;
    public final int l;
    public final com.amazon.aps.iva.q5.y0 m;
    public final com.amazon.aps.iva.q5.d0 n;
    public final float o;
    public final com.amazon.aps.iva.q5.f p;
    public final com.amazon.aps.iva.s5.b q;
    public final com.amazon.aps.iva.q5.q r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final int z;

    /* compiled from: PlayerInfo.java */
    /* loaded from: classes.dex */
    public static class a {
        public final long A;
        public final long B;
        public final long C;
        public com.amazon.aps.iva.q5.v0 D;
        public com.amazon.aps.iva.q5.u0 E;
        public com.amazon.aps.iva.q5.j0 a;
        public int b;
        public z1 c;
        public l0.d d;
        public l0.d e;
        public int f;
        public com.amazon.aps.iva.q5.k0 g;
        public int h;
        public boolean i;
        public com.amazon.aps.iva.q5.r0 j;
        public int k;
        public com.amazon.aps.iva.q5.y0 l;
        public com.amazon.aps.iva.q5.d0 m;
        public float n;
        public com.amazon.aps.iva.q5.f o;
        public com.amazon.aps.iva.s5.b p;
        public com.amazon.aps.iva.q5.q q;
        public int r;
        public boolean s;
        public boolean t;
        public int u;
        public boolean v;
        public boolean w;
        public int x;
        public int y;
        public com.amazon.aps.iva.q5.d0 z;

        public a(r1 r1Var) {
            this.a = r1Var.b;
            this.b = r1Var.c;
            this.c = r1Var.d;
            this.d = r1Var.e;
            this.e = r1Var.f;
            this.f = r1Var.g;
            this.g = r1Var.h;
            this.h = r1Var.i;
            this.i = r1Var.j;
            this.j = r1Var.k;
            this.k = r1Var.l;
            this.l = r1Var.m;
            this.m = r1Var.n;
            this.n = r1Var.o;
            this.o = r1Var.p;
            this.p = r1Var.q;
            this.q = r1Var.r;
            this.r = r1Var.s;
            this.s = r1Var.t;
            this.t = r1Var.u;
            this.u = r1Var.v;
            this.v = r1Var.w;
            this.w = r1Var.x;
            this.x = r1Var.y;
            this.y = r1Var.z;
            this.z = r1Var.A;
            this.A = r1Var.B;
            this.B = r1Var.C;
            this.C = r1Var.D;
            this.D = r1Var.E;
            this.E = r1Var.F;
        }

        public final r1 a() {
            boolean z;
            if (!this.j.r() && this.c.b.c >= this.j.q()) {
                z = false;
            } else {
                z = true;
            }
            com.amazon.aps.iva.cq.b.C(z);
            return new r1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.l, this.j, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
        }
    }

    /* compiled from: PlayerInfo.java */
    /* loaded from: classes.dex */
    public static class b implements com.amazon.aps.iva.q5.k {
        public static final String d = com.amazon.aps.iva.t5.g0.L(0);
        public static final String e = com.amazon.aps.iva.t5.g0.L(1);
        public final boolean b;
        public final boolean c;

        public b(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(d, this.b);
            bundle.putBoolean(e, this.c);
            return bundle;
        }
    }

    static {
        z1 z1Var = z1.m;
        l0.d dVar = z1.l;
        com.amazon.aps.iva.q5.k0 k0Var = com.amazon.aps.iva.q5.k0.e;
        com.amazon.aps.iva.q5.y0 y0Var = com.amazon.aps.iva.q5.y0.f;
        r0.a aVar = com.amazon.aps.iva.q5.r0.b;
        com.amazon.aps.iva.q5.d0 d0Var = com.amazon.aps.iva.q5.d0.J;
        G = new r1(null, 0, z1Var, dVar, dVar, 0, k0Var, 0, false, y0Var, aVar, 0, d0Var, 1.0f, com.amazon.aps.iva.q5.f.h, com.amazon.aps.iva.s5.b.d, com.amazon.aps.iva.q5.q.f, 0, false, false, 1, 0, 1, false, false, d0Var, 0L, 0L, 0L, com.amazon.aps.iva.q5.v0.c, com.amazon.aps.iva.q5.u0.B);
        H = com.amazon.aps.iva.t5.g0.L(1);
        I = com.amazon.aps.iva.t5.g0.L(2);
        J = com.amazon.aps.iva.t5.g0.L(3);
        K = com.amazon.aps.iva.t5.g0.L(4);
        L = com.amazon.aps.iva.t5.g0.L(5);
        M = com.amazon.aps.iva.t5.g0.L(6);
        N = com.amazon.aps.iva.t5.g0.L(7);
        O = com.amazon.aps.iva.t5.g0.L(8);
        P = com.amazon.aps.iva.t5.g0.L(9);
        Q = com.amazon.aps.iva.t5.g0.L(10);
        R = com.amazon.aps.iva.t5.g0.L(11);
        S = com.amazon.aps.iva.t5.g0.L(12);
        T = com.amazon.aps.iva.t5.g0.L(13);
        U = com.amazon.aps.iva.t5.g0.L(14);
        V = com.amazon.aps.iva.t5.g0.L(15);
        W = com.amazon.aps.iva.t5.g0.L(16);
        X = com.amazon.aps.iva.t5.g0.L(17);
        Y = com.amazon.aps.iva.t5.g0.L(18);
        Z = com.amazon.aps.iva.t5.g0.L(19);
        k0 = com.amazon.aps.iva.t5.g0.L(20);
        v0 = com.amazon.aps.iva.t5.g0.L(21);
        w0 = com.amazon.aps.iva.t5.g0.L(22);
        x0 = com.amazon.aps.iva.t5.g0.L(23);
        y0 = com.amazon.aps.iva.t5.g0.L(24);
        z0 = com.amazon.aps.iva.t5.g0.L(25);
        A0 = com.amazon.aps.iva.t5.g0.L(26);
        B0 = com.amazon.aps.iva.t5.g0.L(27);
        C0 = com.amazon.aps.iva.t5.g0.L(28);
        D0 = com.amazon.aps.iva.t5.g0.L(29);
        E0 = com.amazon.aps.iva.t5.g0.L(30);
        F0 = com.amazon.aps.iva.t5.g0.L(31);
        new com.amazon.aps.iva.q5.m(11);
    }

    public r1(com.amazon.aps.iva.q5.j0 j0Var, int i, z1 z1Var, l0.d dVar, l0.d dVar2, int i2, com.amazon.aps.iva.q5.k0 k0Var, int i3, boolean z, com.amazon.aps.iva.q5.y0 y0Var, com.amazon.aps.iva.q5.r0 r0Var, int i4, com.amazon.aps.iva.q5.d0 d0Var, float f, com.amazon.aps.iva.q5.f fVar, com.amazon.aps.iva.s5.b bVar, com.amazon.aps.iva.q5.q qVar, int i5, boolean z2, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, com.amazon.aps.iva.q5.d0 d0Var2, long j, long j2, long j3, com.amazon.aps.iva.q5.v0 v0Var, com.amazon.aps.iva.q5.u0 u0Var) {
        this.b = j0Var;
        this.c = i;
        this.d = z1Var;
        this.e = dVar;
        this.f = dVar2;
        this.g = i2;
        this.h = k0Var;
        this.i = i3;
        this.j = z;
        this.m = y0Var;
        this.k = r0Var;
        this.l = i4;
        this.n = d0Var;
        this.o = f;
        this.p = fVar;
        this.q = bVar;
        this.r = qVar;
        this.s = i5;
        this.t = z2;
        this.u = z3;
        this.v = i6;
        this.y = i7;
        this.z = i8;
        this.w = z4;
        this.x = z5;
        this.A = d0Var2;
        this.B = j;
        this.C = j2;
        this.D = j3;
        this.E = v0Var;
        this.F = u0Var;
    }

    public final r1 a(com.amazon.aps.iva.q5.v0 v0Var) {
        a aVar = new a(this);
        aVar.D = v0Var;
        return aVar.a();
    }

    public final r1 b(com.amazon.aps.iva.q5.u0 u0Var) {
        a aVar = new a(this);
        aVar.E = u0Var;
        return aVar.a();
    }

    public final Bundle c(l0.a aVar, boolean z, boolean z2) {
        int i;
        Bundle bundle = new Bundle();
        boolean a2 = aVar.a(16);
        boolean a3 = aVar.a(17);
        com.amazon.aps.iva.q5.j0 j0Var = this.b;
        if (j0Var != null) {
            bundle.putBundle(Y, j0Var.toBundle());
        }
        bundle.putInt(k0, this.c);
        z1 z1Var = this.d;
        bundle.putBundle(Z, z1Var.a(a2, a3));
        bundle.putBundle(v0, this.e.a(a2, a3));
        bundle.putBundle(w0, this.f.a(a2, a3));
        bundle.putInt(x0, this.g);
        bundle.putBundle(H, this.h.toBundle());
        bundle.putInt(I, this.i);
        bundle.putBoolean(J, this.j);
        String str = K;
        com.amazon.aps.iva.q5.r0 r0Var = this.k;
        if (!z && a3) {
            bundle.putBundle(str, r0Var.toBundle());
        } else if (!a3 && a2 && !r0Var.r()) {
            r0.d p = r0Var.p(z1Var.b.c, new r0.d(), 0L);
            ArrayList arrayList = new ArrayList();
            r0.b bVar = new r0.b();
            int i2 = p.p;
            while (true) {
                i = p.q;
                if (i2 > i) {
                    break;
                }
                r0Var.h(i2, bVar, false);
                bVar.d = 0;
                arrayList.add(bVar.toBundle());
                i2++;
            }
            p.q = i - p.p;
            p.p = 0;
            Bundle bundle2 = p.toBundle();
            Bundle bundle3 = new Bundle();
            com.amazon.aps.iva.e.z.M(bundle3, com.amazon.aps.iva.q5.r0.c, new com.amazon.aps.iva.q5.j(ImmutableList.of(bundle2)));
            com.amazon.aps.iva.e.z.M(bundle3, com.amazon.aps.iva.q5.r0.d, new com.amazon.aps.iva.q5.j(arrayList));
            bundle3.putIntArray(com.amazon.aps.iva.q5.r0.e, new int[]{0});
            bundle.putBundle(str, bundle3);
        }
        bundle.putInt(F0, this.l);
        bundle.putBundle(L, this.m.toBundle());
        if (aVar.a(18)) {
            bundle.putBundle(M, this.n.toBundle());
        }
        if (aVar.a(22)) {
            bundle.putFloat(N, this.o);
        }
        if (aVar.a(21)) {
            bundle.putBundle(O, this.p.toBundle());
        }
        if (aVar.a(28)) {
            bundle.putBundle(y0, this.q.toBundle());
        }
        bundle.putBundle(P, this.r.toBundle());
        if (aVar.a(23)) {
            bundle.putInt(Q, this.s);
            bundle.putBoolean(R, this.t);
        }
        bundle.putBoolean(S, this.u);
        bundle.putInt(U, this.y);
        bundle.putInt(V, this.z);
        bundle.putBoolean(W, this.w);
        bundle.putBoolean(X, this.x);
        if (aVar.a(18)) {
            bundle.putBundle(z0, this.A.toBundle());
        }
        bundle.putLong(A0, this.B);
        bundle.putLong(B0, this.C);
        bundle.putLong(C0, this.D);
        if (!z2 && aVar.a(30)) {
            bundle.putBundle(E0, this.E.toBundle());
        }
        bundle.putBundle(D0, this.F.toBundle());
        return bundle;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        int[] iArr;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : l0.a.C0636a.b) {
            com.amazon.aps.iva.cq.b.C(!false);
            sparseBooleanArray.append(i, true);
        }
        com.amazon.aps.iva.cq.b.C(!false);
        return c(new l0.a(new com.amazon.aps.iva.q5.u(sparseBooleanArray)), false, false);
    }
}
