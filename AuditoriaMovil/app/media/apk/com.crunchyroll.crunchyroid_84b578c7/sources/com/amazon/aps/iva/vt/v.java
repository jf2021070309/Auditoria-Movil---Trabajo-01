package com.amazon.aps.iva.vt;

import com.amazon.aps.iva.se0.g0;
/* compiled from: CommentsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.CommentsViewModelImpl$postErrorLoadingState$1$1", f = "CommentsViewModel.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> lVar, com.amazon.aps.iva.ob0.d<? super v> dVar) {
        super(2, dVar);
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new v(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((v) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            if (this.i.invoke(this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
