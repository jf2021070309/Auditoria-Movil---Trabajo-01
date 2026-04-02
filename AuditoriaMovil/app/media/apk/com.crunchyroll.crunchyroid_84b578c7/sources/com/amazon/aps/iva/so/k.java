package com.amazon.aps.iva.so;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import java.util.List;
/* compiled from: WatchScreenAssetsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.assets.WatchScreenAssetsViewModelImpl$assets$1", f = "WatchScreenAssetsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.vo.c, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.wo.g>>, Object> {
    public final /* synthetic */ n h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, com.amazon.aps.iva.ob0.d<? super k> dVar) {
        super(2, dVar);
        this.h = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new k(this.h, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.vo.c cVar, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.wo.g>> dVar) {
        return ((k) create(cVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        return this.h.c.b();
    }
}
