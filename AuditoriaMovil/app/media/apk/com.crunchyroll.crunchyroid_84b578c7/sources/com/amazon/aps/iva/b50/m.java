package com.amazon.aps.iva.b50;

import com.amazon.aps.iva.f50.b;
import com.ellation.crunchyroll.presentation.watchlist.a;
/* compiled from: WatchlistFragment.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.ellation.crunchyroll.presentation.watchlist.a h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.ellation.crunchyroll.presentation.watchlist.a aVar, b.C0241b c0241b) {
        super(0);
        this.h = aVar;
        this.i = c0241b;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        a.C0973a c0973a = com.ellation.crunchyroll.presentation.watchlist.a.w;
        com.ellation.crunchyroll.presentation.watchlist.a aVar = this.h;
        com.amazon.aps.iva.c50.b bVar = (com.amazon.aps.iva.c50.b) aVar.t.getValue();
        bVar.registerAdapterDataObserver(new com.amazon.aps.iva.xw.c(bVar, new l(aVar.ei())));
        this.i.invoke();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
