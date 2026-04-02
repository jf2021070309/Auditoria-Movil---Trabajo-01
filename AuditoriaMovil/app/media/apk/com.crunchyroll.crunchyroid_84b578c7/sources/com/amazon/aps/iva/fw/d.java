package com.amazon.aps.iva.fw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: KalturaUnfinishedDownloadsCleaner.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.kaltura.KalturaUnfinishedDownloadsCleaner$removeAllIncompleteDownloads$1", f = "KalturaUnfinishedDownloadsCleaner.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new d(this.h, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        e eVar = this.h;
        for (com.amazon.aps.iva.hw.a aVar2 : eVar.b.b(com.amazon.aps.iva.lb0.x.G0(o.b0(com.amazon.aps.iva.hw.c.values()), com.amazon.aps.iva.hw.c.COMPLETED))) {
            eVar.b.c(aVar2.a);
        }
        return q.a;
    }
}
