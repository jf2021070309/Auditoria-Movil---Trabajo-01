package com.amazon.aps.iva.bu;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
/* compiled from: CommentsDataSourceDelegate.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.list.datasource.CommentsDataSourceDelegateImpl$loadComments$2$1", f = "CommentsDataSourceDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public g(com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(1, dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return new g(dVar).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        return q.a;
    }
}
