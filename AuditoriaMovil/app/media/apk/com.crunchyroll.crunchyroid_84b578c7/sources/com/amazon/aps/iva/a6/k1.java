package com.amazon.aps.iva.a6;

import android.os.SystemClock;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.r0;
import com.google.common.collect.ImmutableList;
import java.util.List;
/* compiled from: PlaybackInfo.java */
/* loaded from: classes.dex */
public final class k1 {
    public static final v.b t = new v.b(new Object());
    public final com.amazon.aps.iva.q5.r0 a;
    public final v.b b;
    public final long c;
    public final long d;
    public final int e;
    public final l f;
    public final boolean g;
    public final com.amazon.aps.iva.o6.o0 h;
    public final com.amazon.aps.iva.s6.x i;
    public final List<com.amazon.aps.iva.q5.f0> j;
    public final v.b k;
    public final boolean l;
    public final int m;
    public final com.amazon.aps.iva.q5.k0 n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public k1(com.amazon.aps.iva.q5.r0 r0Var, v.b bVar, long j, long j2, int i, l lVar, boolean z, com.amazon.aps.iva.o6.o0 o0Var, com.amazon.aps.iva.s6.x xVar, List<com.amazon.aps.iva.q5.f0> list, v.b bVar2, boolean z2, int i2, com.amazon.aps.iva.q5.k0 k0Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = r0Var;
        this.b = bVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = lVar;
        this.g = z;
        this.h = o0Var;
        this.i = xVar;
        this.j = list;
        this.k = bVar2;
        this.l = z2;
        this.m = i2;
        this.n = k0Var;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.o = z3;
    }

    public static k1 i(com.amazon.aps.iva.s6.x xVar) {
        r0.a aVar = com.amazon.aps.iva.q5.r0.b;
        v.b bVar = t;
        return new k1(aVar, bVar, -9223372036854775807L, 0L, 1, null, false, com.amazon.aps.iva.o6.o0.e, xVar, ImmutableList.of(), bVar, false, 0, com.amazon.aps.iva.q5.k0.e, 0L, 0L, 0L, 0L, false);
    }

    public final k1 a() {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, j(), SystemClock.elapsedRealtime(), this.o);
    }

    public final k1 b(v.b bVar) {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, bVar, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final k1 c(v.b bVar, long j, long j2, long j3, long j4, com.amazon.aps.iva.o6.o0 o0Var, com.amazon.aps.iva.s6.x xVar, List<com.amazon.aps.iva.q5.f0> list) {
        return new k1(this.a, bVar, j2, j3, this.e, this.f, this.g, o0Var, xVar, list, this.k, this.l, this.m, this.n, this.p, j4, j, SystemClock.elapsedRealtime(), this.o);
    }

    public final k1 d(int i, boolean z) {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final k1 e(l lVar) {
        return new k1(this.a, this.b, this.c, this.d, this.e, lVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final k1 f(com.amazon.aps.iva.q5.k0 k0Var) {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, k0Var, this.p, this.q, this.r, this.s, this.o);
    }

    public final k1 g(int i) {
        return new k1(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final k1 h(com.amazon.aps.iva.q5.r0 r0Var) {
        return new k1(r0Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final long j() {
        long j;
        long j2;
        if (!k()) {
            return this.r;
        }
        do {
            j = this.s;
            j2 = this.r;
        } while (j != this.s);
        return com.amazon.aps.iva.t5.g0.Q(com.amazon.aps.iva.t5.g0.e0(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.n.b));
    }

    public final boolean k() {
        if (this.e == 3 && this.l && this.m == 0) {
            return true;
        }
        return false;
    }
}
