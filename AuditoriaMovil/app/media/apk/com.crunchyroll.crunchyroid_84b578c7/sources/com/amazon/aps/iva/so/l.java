package com.amazon.aps.iva.so;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import java.util.List;
/* compiled from: WatchScreenAssetsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.assets.WatchScreenAssetsViewModelImpl$assets$2", f = "WatchScreenAssetsViewModel.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.vo.c, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.wo.g>>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ n j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, com.amazon.aps.iva.ob0.d<? super l> dVar) {
        super(2, dVar);
        this.j = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        l lVar = new l(this.j, dVar);
        lVar.i = obj;
        return lVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.vo.c cVar, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.wo.g>> dVar) {
        return ((l) create(cVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            com.amazon.aps.iva.uo.f fVar = this.j.c;
            this.h = 1;
            obj = fVar.a((com.amazon.aps.iva.vo.c) this.i, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
