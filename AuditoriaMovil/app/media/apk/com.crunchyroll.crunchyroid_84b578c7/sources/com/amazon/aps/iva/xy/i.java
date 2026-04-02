package com.amazon.aps.iva.xy;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: FlowExtensions.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.flow.FlowExtensionsKt$observe$4", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.ez.g<Object>, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ p<Throwable, Object, q> i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, q> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2, p pVar) {
        super(2, dVar);
        this.i = pVar;
        this.j = lVar;
        this.k = lVar2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        i iVar = new i(dVar, this.j, this.k, this.i);
        iVar.h = obj;
        return iVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ez.g<Object> gVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((i) create(gVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.h;
        if (gVar instanceof g.a) {
            g.a aVar2 = (g.a) gVar;
            this.i.invoke(aVar2.a, aVar2.b);
        } else if (gVar instanceof g.b) {
            this.j.invoke(((g.b) gVar).a);
        } else if (gVar instanceof g.c) {
            this.k.invoke(((g.c) gVar).a);
        }
        return q.a;
    }
}
