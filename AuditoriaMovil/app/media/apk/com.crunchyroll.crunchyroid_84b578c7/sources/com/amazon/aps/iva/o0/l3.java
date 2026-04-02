package com.amazon.aps.iva.o0;
/* compiled from: SnapshotFlow.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {64, 65}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l3 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<e2<Object>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ob0.g j;
    public final /* synthetic */ com.amazon.aps.iva.ve0.f<Object> k;

    /* compiled from: SnapshotFlow.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<Object> {
        public final /* synthetic */ e2<Object> b;

        public a(e2<Object> e2Var) {
            this.b = e2Var;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(Object obj, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            this.b.setValue(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SnapshotFlow.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {66}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.ve0.f<Object> i;
        public final /* synthetic */ e2<Object> j;

        /* compiled from: SnapshotFlow.kt */
        /* loaded from: classes.dex */
        public static final class a implements com.amazon.aps.iva.ve0.g<Object> {
            public final /* synthetic */ e2<Object> b;

            public a(e2<Object> e2Var) {
                this.b = e2Var;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final Object a(Object obj, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                this.b.setValue(obj);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.ve0.f<Object> fVar, e2<Object> e2Var, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.i = fVar;
            this.j = e2Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                a aVar2 = new a(this.j);
                this.h = 1;
                if (this.i.c(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.amazon.aps.iva.ob0.g gVar, com.amazon.aps.iva.ve0.f<Object> fVar, com.amazon.aps.iva.ob0.d<? super l3> dVar) {
        super(2, dVar);
        this.j = gVar;
        this.k = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        l3 l3Var = new l3(this.j, this.k, dVar);
        l3Var.i = obj;
        return l3Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(e2<Object> e2Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((l3) create(e2Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.amazon.aps.iva.ab.x.i0(obj);
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            e2 e2Var = (e2) this.i;
            com.amazon.aps.iva.ob0.h hVar = com.amazon.aps.iva.ob0.h.b;
            com.amazon.aps.iva.ob0.g gVar = this.j;
            boolean a2 = com.amazon.aps.iva.yb0.j.a(gVar, hVar);
            com.amazon.aps.iva.ve0.f<Object> fVar = this.k;
            if (a2) {
                a aVar2 = new a(e2Var);
                this.h = 1;
                if (fVar.c(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                b bVar = new b(fVar, e2Var, null);
                this.h = 2;
                if (com.amazon.aps.iva.se0.i.g(this, gVar, bVar) == aVar) {
                    return aVar;
                }
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
