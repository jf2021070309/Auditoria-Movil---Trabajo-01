package com.amazon.aps.iva.a0;
/* compiled from: Scroll.kt */
/* loaded from: classes.dex */
public final class c2 implements com.amazon.aps.iva.b0.t0 {
    public static final com.amazon.aps.iva.x0.n i = com.amazon.aps.iva.x0.m.a(a.h, b.h);
    public final com.amazon.aps.iva.o0.w1 a;
    public float e;
    public final com.amazon.aps.iva.o0.w1 b = com.amazon.aps.iva.e.w.J(0);
    public final com.amazon.aps.iva.c0.m c = new com.amazon.aps.iva.c0.m();
    public final com.amazon.aps.iva.o0.w1 d = com.amazon.aps.iva.e.w.J(Integer.MAX_VALUE);
    public final com.amazon.aps.iva.b0.f f = new com.amazon.aps.iva.b0.f(new e());
    public final com.amazon.aps.iva.o0.q0 g = com.amazon.aps.iva.cq.b.M(new d());
    public final com.amazon.aps.iva.o0.q0 h = com.amazon.aps.iva.cq.b.M(new c());

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.x0.o, c2, Integer> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Integer invoke(com.amazon.aps.iva.x0.o oVar, c2 c2Var) {
            c2 c2Var2 = c2Var;
            com.amazon.aps.iva.yb0.j.f(oVar, "$this$Saver");
            com.amazon.aps.iva.yb0.j.f(c2Var2, "it");
            return Integer.valueOf(c2Var2.a());
        }
    }

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, c2> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final c2 invoke(Integer num) {
            return new c2(num.intValue());
        }
    }

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            if (c2.this.a() > 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            c2 c2Var = c2.this;
            if (c2Var.a() < c2Var.d.t()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Float, Float> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Float invoke(Float f) {
            boolean z;
            float floatValue = f.floatValue();
            c2 c2Var = c2.this;
            float a = c2Var.a() + floatValue + c2Var.e;
            float i = com.amazon.aps.iva.aq.j.i(a, 0.0f, c2Var.d.t());
            if (a == i) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            float a2 = i - c2Var.a();
            int a3 = com.amazon.aps.iva.ob0.f.a(a2);
            c2Var.a.e(c2Var.a() + a3);
            c2Var.e = a2 - a3;
            if (z2) {
                floatValue = a2;
            }
            return Float.valueOf(floatValue);
        }
    }

    public c2(int i2) {
        this.a = com.amazon.aps.iva.e.w.J(i2);
    }

    public final int a() {
        return this.a.t();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean b() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean c() {
        return this.f.c();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final Object f(g1 g1Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.b0.n0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object f = this.f.f(g1Var, pVar, dVar);
        if (f == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return f;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final float g(float f) {
        return this.f.g(f);
    }
}
