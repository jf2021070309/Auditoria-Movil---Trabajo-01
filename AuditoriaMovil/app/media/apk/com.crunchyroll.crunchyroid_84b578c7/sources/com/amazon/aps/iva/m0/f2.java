package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class f2 {
    public final com.amazon.aps.iva.z.j<Float> a;
    public final boolean b;
    public final k<g2> c;
    public com.amazon.aps.iva.o2.c d;

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Float, Float> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Float invoke(Float f) {
            f.floatValue();
            return Float.valueOf(f2.a(f2.this).P0(j1.a));
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Float invoke() {
            return Float.valueOf(f2.a(f2.this).P0(j1.b));
        }
    }

    public f2(g2 g2Var, com.amazon.aps.iva.z.j<Float> jVar, boolean z, com.amazon.aps.iva.xb0.l<? super g2, Boolean> lVar) {
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(g2Var, "initialValue");
        com.amazon.aps.iva.yb0.j.f(jVar, "animationSpec");
        com.amazon.aps.iva.yb0.j.f(lVar, "confirmStateChange");
        this.a = jVar;
        this.b = z;
        this.c = new k<>(g2Var, new a(), new b(), jVar, lVar);
        if (z) {
            if (g2Var != g2.HalfExpanded) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
    }

    public static final com.amazon.aps.iva.o2.c a(f2 f2Var) {
        com.amazon.aps.iva.o2.c cVar = f2Var.d;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(("The density on ModalBottomSheetState (" + f2Var + ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?").toString());
    }

    public static Object b(f2 f2Var, g2 g2Var, com.amazon.aps.iva.ob0.d dVar) {
        Object b2 = j.b(f2Var.c.k.d(), f2Var.c, g2Var, dVar);
        if (b2 != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        return b2;
    }

    public final Object c(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object b2 = b(this, g2.Hidden, dVar);
        if (b2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return b2;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
