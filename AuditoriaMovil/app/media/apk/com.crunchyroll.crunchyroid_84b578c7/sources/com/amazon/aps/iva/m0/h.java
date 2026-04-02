package com.amazon.aps.iva.m0;

import java.util.Map;
/* compiled from: AnchoredDraggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {586}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<f, Map<Object, ? extends Float>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ f i;
    public /* synthetic */ Map j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ k<Object> l;
    public final /* synthetic */ float m;

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Float, Float, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ com.amazon.aps.iva.yb0.a0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, com.amazon.aps.iva.yb0.a0 a0Var) {
            super(2);
            this.h = fVar;
            this.i = a0Var;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Float f, Float f2) {
            float floatValue = f.floatValue();
            this.h.a(floatValue, f2.floatValue());
            this.i.b = floatValue;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(float f, k kVar, Object obj, com.amazon.aps.iva.ob0.d dVar) {
        super(3, dVar);
        this.k = obj;
        this.l = kVar;
        this.m = f;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(f fVar, Map<Object, ? extends Float> map, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object obj = this.k;
        k<Object> kVar = this.l;
        h hVar = new h(this.m, kVar, obj, dVar);
        hVar.i = fVar;
        hVar.j = map;
        return hVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        float d;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            f fVar = this.i;
            Float f = (Float) this.j.get(this.k);
            if (f != null) {
                com.amazon.aps.iva.yb0.a0 a0Var = new com.amazon.aps.iva.yb0.a0();
                k<Object> kVar = this.l;
                if (Float.isNaN(kVar.d())) {
                    d = 0.0f;
                } else {
                    d = kVar.d();
                }
                float f2 = d;
                a0Var.b = f2;
                float floatValue = f.floatValue();
                float f3 = this.m;
                com.amazon.aps.iva.z.j<Float> jVar = kVar.c;
                a aVar2 = new a(fVar, a0Var);
                this.i = null;
                this.h = 1;
                if (com.amazon.aps.iva.z.w0.a(f2, floatValue, f3, jVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
