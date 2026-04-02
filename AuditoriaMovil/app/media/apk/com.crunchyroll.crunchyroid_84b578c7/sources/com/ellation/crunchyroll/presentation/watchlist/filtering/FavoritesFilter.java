package com.ellation.crunchyroll.presentation.watchlist.filtering;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: WatchlistFilterOption.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/FavoritesFilter;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/WatchlistFilterOption;", "Default", "FavoritesOnly", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/FavoritesFilter$Default;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/FavoritesFilter$FavoritesOnly;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class FavoritesFilter extends WatchlistFilterOption {

    /* compiled from: WatchlistFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/FavoritesFilter$Default;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/FavoritesFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Default extends FavoritesFilter {
        public static final Default d = new Default();

        private Default() {
            super(false);
        }
    }

    /* compiled from: WatchlistFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/FavoritesFilter$FavoritesOnly;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/FavoritesFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FavoritesOnly extends FavoritesFilter {
        public static final FavoritesOnly d = new FavoritesOnly();

        private FavoritesOnly() {
            super(true);
        }
    }

    public FavoritesFilter(boolean z) {
        super(R.string.watchlist_filter_favorites_only, k.x(new j("is_favorite", String.valueOf(z))));
    }
}
