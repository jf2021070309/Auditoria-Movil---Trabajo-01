package com.amazon.aps.iva.j0;
/* compiled from: TextFieldScroll.kt */
/* loaded from: classes.dex */
public final class i2 implements com.amazon.aps.iva.b0.t0 {
    public final /* synthetic */ com.amazon.aps.iva.b0.t0 a;
    public final com.amazon.aps.iva.o0.q0 b;
    public final com.amazon.aps.iva.o0.q0 c;

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public final /* synthetic */ k2 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k2 k2Var) {
            super(0);
            this.h = k2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            if (this.h.a() > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public final /* synthetic */ k2 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k2 k2Var) {
            super(0);
            this.h = k2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            k2 k2Var = this.h;
            if (k2Var.a() < k2Var.b.d()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public i2(com.amazon.aps.iva.b0.t0 t0Var, k2 k2Var) {
        this.a = t0Var;
        this.b = com.amazon.aps.iva.cq.b.M(new b(k2Var));
        this.c = com.amazon.aps.iva.cq.b.M(new a(k2Var));
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean c() {
        return this.a.c();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final boolean d() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final Object f(com.amazon.aps.iva.a0.g1 g1Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.b0.n0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return this.a.f(g1Var, pVar, dVar);
    }

    @Override // com.amazon.aps.iva.b0.t0
    public final float g(float f) {
        return this.a.g(f);
    }
}
