package com.amazon.aps.iva.ve0;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class b0 implements f<Object> {
    public final /* synthetic */ f[] b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.t c;

    /* compiled from: Zip.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<g<Object>, Object[], com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ g i;
        public /* synthetic */ Object[] j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.t k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.xb0.t tVar) {
            super(3, dVar);
            this.k = tVar;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(g<Object> gVar, Object[] objArr, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            a aVar = new a(dVar, this.k);
            aVar.i = gVar;
            aVar.j = objArr;
            return aVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = this.i;
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                gVar = this.i;
                Object[] objArr = this.j;
                com.amazon.aps.iva.xb0.t tVar = this.k;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                Object obj6 = objArr[4];
                this.i = gVar;
                this.h = 1;
                obj = tVar.S(obj2, obj3, obj4, obj5, obj6, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            this.i = null;
            this.h = 2;
            if (gVar.a(obj, this) == aVar) {
                return aVar;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public b0(f[] fVarArr, com.amazon.aps.iva.kl.m mVar) {
        this.b = fVarArr;
        this.c = mVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(g<? super Object> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object r = com.amazon.aps.iva.e.w.r(dVar, e0.h, new a(null, this.c), gVar, this.b);
        if (r == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return r;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
