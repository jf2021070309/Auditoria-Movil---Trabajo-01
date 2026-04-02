package com.ellation.crunchyroll.presentation.watchlist.filtering;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.a0;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: WatchlistFilterOption.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/WatchlistFilterOption;", "Default", "DubbedOnly", "SubtitledOnly", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter$Default;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter$DubbedOnly;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter$SubtitledOnly;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class SubDubFilter extends WatchlistFilterOption {

    /* compiled from: WatchlistFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter$Default;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Default extends SubDubFilter {
        public static final Default d = new Default();

        private Default() {
            super(0);
        }
    }

    /* compiled from: WatchlistFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter$DubbedOnly;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DubbedOnly extends SubDubFilter {
        public static final DubbedOnly d = new DubbedOnly();

        private DubbedOnly() {
            super(R.string.watchlist_filter_dubbed_only, k.x(new j("is_dubbed", "true")));
        }
    }

    /* compiled from: WatchlistFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter$SubtitledOnly;", "Lcom/ellation/crunchyroll/presentation/watchlist/filtering/SubDubFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SubtitledOnly extends SubDubFilter {
        public static final SubtitledOnly d = new SubtitledOnly();

        private SubtitledOnly() {
            super(R.string.watchlist_filter_subtitled_only, k.x(new j("is_subbed", "true")));
        }
    }

    public SubDubFilter() {
        throw null;
    }

    public SubDubFilter(int i) {
        super(R.string.watchlist_filter_all, a0.b);
    }
}
