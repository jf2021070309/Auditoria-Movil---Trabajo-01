package com.amazon.aps.iva.ve0;
/* compiled from: Merge.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {214, 214}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class q extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<g<Object>, Object, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ g i;
    public /* synthetic */ Object j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<Object, com.amazon.aps.iva.ob0.d<Object>, Object> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(com.amazon.aps.iva.xb0.p<Object, ? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        super(3, dVar);
        this.k = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(g<Object> gVar, Object obj, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        q qVar = new q(this.k, dVar);
        qVar.i = gVar;
        qVar.j = obj;
        return qVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            Object obj2 = this.j;
            this.i = gVar;
            this.h = 1;
            obj = this.k.invoke(obj2, this);
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
