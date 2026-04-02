package com.amazon.aps.iva.b50;

import com.ellation.crunchyroll.presentation.watchlist.WatchlistRecyclerView;
/* compiled from: WatchlistFragment.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class l extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
    public l(WatchlistRecyclerView watchlistRecyclerView) {
        super(1, watchlistRecyclerView, WatchlistRecyclerView.class, "smoothScrollToPosition", "smoothScrollToPosition(I)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
        ((WatchlistRecyclerView) this.receiver).smoothScrollToPosition(num.intValue());
        return com.amazon.aps.iva.kb0.q.a;
    }
}
