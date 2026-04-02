package com.amazon.aps.iva.h50;

import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xw.f0;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.model.UpdateWatchlistItemFavoriteStatusBody;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: EtpWatchlistInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.toggle.EtpWatchlistInteractorImpl$updateWatchlistItemFavoriteStatus$1", f = "EtpWatchlistInteractor.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ b k;
    public final /* synthetic */ Panel l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar, b bVar, Panel panel, boolean z, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.j = lVar;
        this.k = bVar;
        this.l = panel;
        this.m = z;
        this.n = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        f fVar = new f(this.j, this.k, this.l, this.m, this.n, dVar);
        fVar.i = obj;
        return fVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        boolean z;
        a0 a0Var;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        boolean z2 = this.m;
        Panel panel = this.l;
        b bVar = this.k;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0 g0Var = (g0) this.i;
                EtpContentService etpContentService = bVar.b;
                String a = f0.a(panel);
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                UpdateWatchlistItemFavoriteStatusBody updateWatchlistItemFavoriteStatusBody = new UpdateWatchlistItemFavoriteStatusBody(z);
                this.h = 1;
                obj = etpContentService.updateWatchlistItemFavoriteStatus(a, updateWatchlistItemFavoriteStatusBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            a0Var = (a0) obj;
        } catch (Throwable th) {
            H = com.amazon.aps.iva.ab.x.H(th);
        }
        if (a0Var.a()) {
            H = com.amazon.aps.iva.kb0.q.a;
            if (!(H instanceof k.a)) {
                com.amazon.aps.iva.kb0.q qVar = (com.amazon.aps.iva.kb0.q) H;
                if (z2) {
                    bVar.c.e(panel);
                } else {
                    bVar.c.h(panel);
                }
                this.n.invoke();
            }
            Throwable a2 = com.amazon.aps.iva.kb0.k.a(H);
            if (a2 != null) {
                this.j.invoke(a2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
        throw new com.amazon.aps.iva.jf0.i(a0Var);
    }
}
