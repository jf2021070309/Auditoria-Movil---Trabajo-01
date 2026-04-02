package com.ellation.crunchyroll.presentation.watchlist.filtering;

import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: WatchlistFilterOption.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/WatchlistFilterOption;", "Default", "MoviesOnly", "SeriesOnly", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter$Default;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter$MoviesOnly;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter$SeriesOnly;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class VideoTypeFilter extends WatchlistFilterOption {

    /* compiled from: WatchlistFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter$Default;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Default extends VideoTypeFilter {
        public static final Default d = new Default();

        private Default() {
            super(null, R.string.watchlist_filter_all);
        }
    }

    /* compiled from: WatchlistFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter$MoviesOnly;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class MoviesOnly extends VideoTypeFilter {
        public static final MoviesOnly d = new MoviesOnly();

        private MoviesOnly() {
            super("movie_listing", R.string.watchlist_filter_movies_only);
        }
    }

    /* compiled from: WatchlistFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter$SeriesOnly;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/VideoTypeFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SeriesOnly extends VideoTypeFilter {
        public static final SeriesOnly d = new SeriesOnly();

        private SeriesOnly() {
            super("series", R.string.watchlist_filter_series_only);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoTypeFilter(java.lang.String r3, int r4) {
        /*
            r2 = this;
            if (r3 == 0) goto Le
            com.amazon.aps.iva.kb0.j r0 = new com.amazon.aps.iva.kb0.j
            java.lang.String r1 = "type"
            r0.<init>(r1, r3)
            java.util.Map r3 = com.amazon.aps.iva.aq.k.x(r0)
            goto L10
        Le:
            com.amazon.aps.iva.lb0.a0 r3 = com.amazon.aps.iva.lb0.a0.b
        L10:
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.presentation.watchlist.filtering.VideoTypeFilter.<init>(java.lang.String, int):void");
    }
}
