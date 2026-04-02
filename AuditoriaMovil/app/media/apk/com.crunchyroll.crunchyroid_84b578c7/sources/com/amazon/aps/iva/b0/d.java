package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.z.n1;
/* compiled from: Scrollable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {603}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super Float>, Object> {
    public com.amazon.aps.iva.yb0.a0 h;
    public int i;
    public final /* synthetic */ float j;
    public final /* synthetic */ e k;
    public final /* synthetic */ n0 l;

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.z.i<Float, com.amazon.aps.iva.z.m>, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.yb0.a0 h;
        public final /* synthetic */ n0 i;
        public final /* synthetic */ com.amazon.aps.iva.yb0.a0 j;
        public final /* synthetic */ e k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.yb0.a0 a0Var, n0 n0Var, com.amazon.aps.iva.yb0.a0 a0Var2, e eVar) {
            super(1);
            this.h = a0Var;
            this.i = n0Var;
            this.j = a0Var2;
            this.k = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.z.i<Float, com.amazon.aps.iva.z.m> iVar) {
            com.amazon.aps.iva.z.i<Float, com.amazon.aps.iva.z.m> iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "$this$animateDecay");
            float floatValue = iVar2.a().floatValue();
            com.amazon.aps.iva.yb0.a0 a0Var = this.h;
            float f = floatValue - a0Var.b;
            float a = this.i.a(f);
            a0Var.b = iVar2.a().floatValue();
            this.j.b = iVar2.a.b().invoke(iVar2.f).floatValue();
            if (Math.abs(f - a) > 0.5f) {
                iVar2.i.setValue(Boolean.FALSE);
                iVar2.d.invoke();
            }
            this.k.getClass();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f, e eVar, n0 n0Var, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.j = f;
        this.k = eVar;
        this.l = n0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new d(this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super Float> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        float f;
        com.amazon.aps.iva.yb0.a0 a0Var;
        Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        if (i != 0) {
            if (i == 1) {
                a0Var = this.h;
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            f = this.j;
            if (Math.abs(f) > 1.0f) {
                com.amazon.aps.iva.yb0.a0 a0Var2 = new com.amazon.aps.iva.yb0.a0();
                a0Var2.b = f;
                com.amazon.aps.iva.yb0.a0 a0Var3 = new com.amazon.aps.iva.yb0.a0();
                com.amazon.aps.iva.z.l lVar = new com.amazon.aps.iva.z.l(n1.a, Float.valueOf(0.0f), new com.amazon.aps.iva.z.m(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                e eVar = this.k;
                com.amazon.aps.iva.z.u<Float> uVar = eVar.a;
                a aVar = new a(a0Var3, this.l, a0Var2, eVar);
                this.h = a0Var2;
                this.i = 1;
                Object b = com.amazon.aps.iva.z.w0.b(lVar, new com.amazon.aps.iva.z.t(uVar, lVar.b, lVar.getValue(), lVar.d), Long.MIN_VALUE, aVar, this);
                if (b != obj2) {
                    b = com.amazon.aps.iva.kb0.q.a;
                }
                if (b == obj2) {
                    return obj2;
                }
                a0Var = a0Var2;
            }
            return new Float(f);
        }
        f = a0Var.b;
        return new Float(f);
    }
}
