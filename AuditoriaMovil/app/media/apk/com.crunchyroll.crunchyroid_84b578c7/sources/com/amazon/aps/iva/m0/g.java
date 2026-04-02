package com.amazon.aps.iva.m0;
/* compiled from: AnchoredDraggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.se0.g0, Float, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ com.amazon.aps.iva.se0.g0 h;
    public /* synthetic */ float i;
    public final /* synthetic */ k<Object> j;

    /* compiled from: AnchoredDraggable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ k<Object> i;
        public final /* synthetic */ float j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k<Object> kVar, float f, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = kVar;
            this.j = f;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
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
                this.h = 1;
                if (this.i.g(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k<Object> kVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(3, dVar);
        this.j = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, Float f, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        float floatValue = f.floatValue();
        g gVar = new g(this.j, dVar);
        gVar.h = g0Var;
        gVar.i = floatValue;
        return gVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        com.amazon.aps.iva.se0.i.d(this.h, null, null, new a(this.j, this.i, null), 3);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
