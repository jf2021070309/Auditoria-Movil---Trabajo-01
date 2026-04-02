package com.amazon.aps.iva.b50;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.f50.b;
import com.ellation.crunchyroll.presentation.watchlist.a;
/* compiled from: WatchlistFragment.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.ellation.crunchyroll.presentation.watchlist.a h;
    public final /* synthetic */ com.amazon.aps.iva.yb0.d0<RecyclerView.u> i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.ellation.crunchyroll.presentation.watchlist.a aVar, com.amazon.aps.iva.yb0.d0 d0Var, b.a aVar2) {
        super(0);
        this.h = aVar;
        this.i = d0Var;
        this.j = aVar2;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        RecyclerView.u uVar;
        com.ellation.crunchyroll.presentation.watchlist.a aVar = this.h;
        if (aVar.getView() != null && (uVar = this.i.b) != null) {
            a.C0973a c0973a = com.ellation.crunchyroll.presentation.watchlist.a.w;
            aVar.ei().removeOnScrollListener(uVar);
        }
        this.j.invoke();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
