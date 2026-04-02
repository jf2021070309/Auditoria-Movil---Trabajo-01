package com.amazon.aps.iva.h50;

import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
/* compiled from: WatchlistItemTogglePresenterImpl.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends WatchlistStatus>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends WatchlistStatus> gVar) {
        com.amazon.aps.iva.ez.g<? extends WatchlistStatus> gVar2 = gVar;
        v vVar = this.h;
        gVar2.c(new i(vVar));
        gVar2.e(new j(vVar));
        gVar2.b(new k(vVar));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
