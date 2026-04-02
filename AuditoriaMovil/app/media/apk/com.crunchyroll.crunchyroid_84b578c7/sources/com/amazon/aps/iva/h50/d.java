package com.amazon.aps.iva.h50;

import com.amazon.aps.iva.jf0.a0;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: EtpWatchlistInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.toggle.EtpWatchlistInteractorImpl$removeFromWatchlistAsync$1", f = "EtpWatchlistInteractor.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super a0<com.amazon.aps.iva.kb0.q>>, Object> {
    public int h;
    public final /* synthetic */ b i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(1, dVar);
        this.i = bVar;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new d(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<? super a0<com.amazon.aps.iva.kb0.q>> dVar) {
        return ((d) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            EtpContentService etpContentService = this.i.b;
            this.h = 1;
            obj = etpContentService.deleteWatchlistItem(this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        a0 a0Var = (a0) obj;
        if (a0Var.a()) {
            return a0Var;
        }
        throw new com.amazon.aps.iva.jf0.i(a0Var);
    }
}
