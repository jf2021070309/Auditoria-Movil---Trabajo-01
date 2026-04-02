package com.amazon.aps.iva.i5;
/* compiled from: CoroutineLiveData.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ d<Object> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
        super(2, dVar2);
        this.j = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.j, dVar);
        cVar.i = obj;
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        d<Object> dVar = this.j;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            t tVar = new t(dVar.a, ((com.amazon.aps.iva.se0.g0) this.i).getCoroutineContext());
            com.amazon.aps.iva.xb0.p<s<Object>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> pVar = dVar.b;
            this.h = 1;
            if (pVar.invoke(tVar, this) == aVar) {
                return aVar;
            }
        }
        dVar.e.invoke();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
