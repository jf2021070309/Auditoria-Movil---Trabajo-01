package com.amazon.aps.iva.da;

import com.amazon.aps.iva.a0.g1;
import com.amazon.aps.iva.a0.i1;
import com.amazon.aps.iva.a0.j1;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.o0.q0;
import com.amazon.aps.iva.o0.y1;
/* compiled from: LottieAnimatable.kt */
/* loaded from: classes.dex */
public final class f implements com.amazon.aps.iva.da.b {
    public final y1 b;
    public final y1 c;
    public final y1 d;
    public final y1 e;
    public final y1 f;
    public final y1 g;
    public final y1 h;
    public final q0 i;
    public final y1 j;
    public final y1 k;
    public final y1 l;
    public final y1 m;
    public final q0 n;
    public final i1 o;

    /* compiled from: LottieAnimatable.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Float invoke() {
            f fVar = f.this;
            float f = 0.0f;
            if (fVar.u() != null) {
                if (fVar.o() < 0.0f) {
                    j v = fVar.v();
                    if (v != null) {
                        f = v.b();
                    }
                } else {
                    j v2 = fVar.v();
                    f = v2 == null ? 1.0f : v2.a();
                }
            }
            return Float.valueOf(f);
        }
    }

    /* compiled from: LottieAnimatable.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Float invoke() {
            float o;
            f fVar = f.this;
            if (((Boolean) fVar.e.getValue()).booleanValue() && fVar.s() % 2 == 0) {
                o = -fVar.o();
            } else {
                o = fVar.o();
            }
            return Float.valueOf(o);
        }
    }

    /* compiled from: LottieAnimatable.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            f fVar = f.this;
            boolean z2 = false;
            if (fVar.s() == ((Number) fVar.d.getValue()).intValue()) {
                if (fVar.a() == fVar.k()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* compiled from: LottieAnimatable.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ com.amazon.aps.iva.z9.h i;
        public final /* synthetic */ float j;
        public final /* synthetic */ int k;
        public final /* synthetic */ boolean l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.z9.h hVar, float f, int i, boolean z, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(1, dVar);
            this.i = hVar;
            this.j = f;
            this.k = i;
            this.l = z;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(this.i, this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((d) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            f fVar = f.this;
            fVar.j.setValue(this.i);
            fVar.p(this.j);
            fVar.n(this.k);
            f.g(fVar, false);
            if (this.l) {
                fVar.m.setValue(Long.MIN_VALUE);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public f() {
        Boolean bool = Boolean.FALSE;
        this.b = com.amazon.aps.iva.cq.b.c0(bool);
        this.c = com.amazon.aps.iva.cq.b.c0(1);
        this.d = com.amazon.aps.iva.cq.b.c0(1);
        this.e = com.amazon.aps.iva.cq.b.c0(bool);
        this.f = com.amazon.aps.iva.cq.b.c0(null);
        this.g = com.amazon.aps.iva.cq.b.c0(Float.valueOf(1.0f));
        this.h = com.amazon.aps.iva.cq.b.c0(bool);
        this.i = com.amazon.aps.iva.cq.b.M(new b());
        this.j = com.amazon.aps.iva.cq.b.c0(null);
        Float valueOf = Float.valueOf(0.0f);
        this.k = com.amazon.aps.iva.cq.b.c0(valueOf);
        this.l = com.amazon.aps.iva.cq.b.c0(valueOf);
        this.m = com.amazon.aps.iva.cq.b.c0(Long.MIN_VALUE);
        this.n = com.amazon.aps.iva.cq.b.M(new a());
        com.amazon.aps.iva.cq.b.M(new c());
        this.o = new i1();
    }

    public static final boolean f(f fVar, int i, long j) {
        long longValue;
        float b2;
        float a2;
        float floatValue;
        float f;
        com.amazon.aps.iva.z9.h u = fVar.u();
        if (u == null) {
            return true;
        }
        y1 y1Var = fVar.m;
        if (((Number) y1Var.getValue()).longValue() == Long.MIN_VALUE) {
            longValue = 0;
        } else {
            longValue = j - ((Number) y1Var.getValue()).longValue();
        }
        y1Var.setValue(Long.valueOf(j));
        j v = fVar.v();
        if (v == null) {
            b2 = 0.0f;
        } else {
            b2 = v.b();
        }
        j v2 = fVar.v();
        if (v2 == null) {
            a2 = 1.0f;
        } else {
            a2 = v2.a();
        }
        float b3 = ((float) (longValue / 1000000)) / u.b();
        q0 q0Var = fVar.i;
        float floatValue2 = ((Number) q0Var.getValue()).floatValue() * b3;
        int i2 = (((Number) q0Var.getValue()).floatValue() > 0.0f ? 1 : (((Number) q0Var.getValue()).floatValue() == 0.0f ? 0 : -1));
        y1 y1Var2 = fVar.k;
        if (i2 < 0) {
            floatValue = b2 - (((Number) y1Var2.getValue()).floatValue() + floatValue2);
        } else {
            floatValue = (((Number) y1Var2.getValue()).floatValue() + floatValue2) - a2;
        }
        if (floatValue < 0.0f) {
            fVar.p(com.amazon.aps.iva.aq.j.i(((Number) y1Var2.getValue()).floatValue(), b2, a2) + floatValue2);
            return true;
        }
        float f2 = a2 - b2;
        int i3 = ((int) (floatValue / f2)) + 1;
        if (fVar.s() + i3 > i) {
            fVar.p(fVar.k());
            fVar.n(i);
            return false;
        }
        fVar.n(fVar.s() + i3);
        float f3 = floatValue - ((i3 - 1) * f2);
        if (((Number) q0Var.getValue()).floatValue() < 0.0f) {
            f = a2 - f3;
        } else {
            f = b2 + f3;
        }
        fVar.p(f);
        return true;
    }

    public static final void g(f fVar, boolean z) {
        fVar.b.setValue(Boolean.valueOf(z));
    }

    @Override // com.amazon.aps.iva.da.h
    public final float a() {
        return ((Number) this.l.getValue()).floatValue();
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final Float getValue() {
        return Float.valueOf(a());
    }

    @Override // com.amazon.aps.iva.da.b
    public final Object h(com.amazon.aps.iva.z9.h hVar, float f, int i, boolean z, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        d dVar2 = new d(hVar, f, i, z, null);
        g1 g1Var = g1.Default;
        i1 i1Var = this.o;
        i1Var.getClass();
        Object p = z.p(new j1(g1Var, i1Var, dVar2, null), dVar);
        if (p == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final float k() {
        return ((Number) this.n.getValue()).floatValue();
    }

    public final void n(int i) {
        this.c.setValue(Integer.valueOf(i));
    }

    @Override // com.amazon.aps.iva.da.h
    public final float o() {
        return ((Number) this.g.getValue()).floatValue();
    }

    public final void p(float f) {
        com.amazon.aps.iva.z9.h u;
        this.k.setValue(Float.valueOf(f));
        if (((Boolean) this.h.getValue()).booleanValue() && (u = u()) != null) {
            f -= f % (1 / u.m);
        }
        this.l.setValue(Float.valueOf(f));
    }

    @Override // com.amazon.aps.iva.da.b
    public final Object r(com.amazon.aps.iva.z9.h hVar, int i, int i2, boolean z, float f, j jVar, float f2, boolean z2, i iVar, boolean z3, com.amazon.aps.iva.ob0.d dVar) {
        com.amazon.aps.iva.da.c cVar = new com.amazon.aps.iva.da.c(this, i, i2, z, f, jVar, hVar, f2, z3, z2, iVar, null);
        g1 g1Var = g1.Default;
        i1 i1Var = this.o;
        i1Var.getClass();
        Object p = z.p(new j1(g1Var, i1Var, cVar, null), dVar);
        if (p == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.da.h
    public final int s() {
        return ((Number) this.c.getValue()).intValue();
    }

    @Override // com.amazon.aps.iva.da.h
    public final com.amazon.aps.iva.z9.h u() {
        return (com.amazon.aps.iva.z9.h) this.j.getValue();
    }

    @Override // com.amazon.aps.iva.da.h
    public final j v() {
        return (j) this.f.getValue();
    }
}
