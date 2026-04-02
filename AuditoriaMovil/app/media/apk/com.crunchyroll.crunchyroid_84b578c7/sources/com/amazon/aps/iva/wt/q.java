package com.amazon.aps.iva.wt;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModelImpl;
import java.io.IOException;
/* compiled from: CommentActionViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModelImpl$updateActionState$1", f = "CommentActionViewModel.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ CommentActionViewModelImpl i;
    public final /* synthetic */ com.amazon.aps.iva.du.a j;
    public final /* synthetic */ x k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CommentActionViewModelImpl commentActionViewModelImpl, com.amazon.aps.iva.du.a aVar, x xVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        super(2, dVar);
        this.i = commentActionViewModelImpl;
        this.j = aVar;
        this.k = xVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new q(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((q) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        x xVar = this.k;
        com.amazon.aps.iva.du.a aVar2 = this.j;
        CommentActionViewModelImpl commentActionViewModelImpl = this.i;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                String str = xVar.b;
                this.h = 1;
                if (CommentActionViewModelImpl.N8(commentActionViewModelImpl, aVar2, str, this) == aVar) {
                    return aVar;
                }
            }
            commentActionViewModelImpl.g.k(new com.amazon.aps.iva.ez.d<>(new g.c(CommentActionViewModelImpl.P8(new n(aVar2, xVar)), null)));
        } catch (IOException e) {
            commentActionViewModelImpl.g.k(new com.amazon.aps.iva.ez.d<>(new g.a(new n(aVar2, xVar), e)));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
