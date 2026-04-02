package com.amazon.aps.iva.h50;

import com.amazon.aps.iva.b50.f0;
import com.amazon.aps.iva.jf0.a0;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
/* compiled from: EtpWatchlistInteractor.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a0<com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ b i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f0.c cVar, b bVar, String str) {
        super(1);
        this.h = cVar;
        this.i = bVar;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(a0<com.amazon.aps.iva.kb0.q> a0Var) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "it");
        this.h.invoke();
        this.i.d.b(new com.amazon.aps.iva.b60.j(this.j, WatchlistStatus.NOT_IN_WATCHLIST));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
