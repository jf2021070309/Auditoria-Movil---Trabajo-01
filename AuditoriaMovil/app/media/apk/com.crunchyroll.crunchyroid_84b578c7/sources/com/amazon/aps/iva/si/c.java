package com.amazon.aps.iva.si;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.d4.d;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: ObjectDataStore.kt */
@e(c = "com.crunchyroll.mvvm.datastore.ObjectDataStoreImpl$write$2", f = "ObjectDataStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends i implements p<com.amazon.aps.iva.d4.a, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ b<Serializable> i;
    public final /* synthetic */ Serializable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b<Serializable> bVar, Serializable serializable, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.i = bVar;
        this.j = serializable;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.i, this.j, dVar);
        cVar.h = obj;
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.d4.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(aVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.d4.a aVar2 = (com.amazon.aps.iva.d4.a) this.h;
        d.a<?> n0 = com.amazon.aps.iva.cq.b.n0(this.i.c.invoke());
        String json = d.a.toJson(this.j);
        j.e(json, "gson.toJson(item)");
        aVar2.getClass();
        aVar2.h(n0, json);
        return q.a;
    }
}
