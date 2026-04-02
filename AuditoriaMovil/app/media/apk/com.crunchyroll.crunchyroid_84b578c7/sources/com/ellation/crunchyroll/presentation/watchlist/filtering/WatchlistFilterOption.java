package com.ellation.crunchyroll.presentation.watchlist.filtering;

import com.amazon.aps.iva.mn.b;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: WatchlistFilterOption.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/WatchlistFilterOption;", "Lcom/amazon/aps/iva/mn/b;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/FavoritesFilter;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class WatchlistFilterOption implements b {
    public final int b;
    public final Map<String, String> c;

    public WatchlistFilterOption(int i, Map map) {
        this.b = i;
        this.c = map;
    }

    @Override // com.amazon.aps.iva.p70.c
    public final Integer getDescription() {
        return null;
    }

    @Override // com.amazon.aps.iva.p70.c
    public final int getTitle() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.mn.l
    public final Map<String, String> getUrlParams() {
        return this.c;
    }
}
