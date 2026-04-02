package com.ellation.crunchyroll.presentation.watchlist;

import com.amazon.aps.iva.b50.v;
import com.amazon.aps.iva.b60.i;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistItem;
import java.util.List;
/* compiled from: WatchlistItemsLoader.kt */
/* loaded from: classes2.dex */
public interface f extends i {

    /* compiled from: WatchlistItemsLoader.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static v a;
    }

    Object getWatchlistItems(com.amazon.aps.iva.ob0.d<? super List<WatchlistItem>> dVar);

    void invalidate();
}
