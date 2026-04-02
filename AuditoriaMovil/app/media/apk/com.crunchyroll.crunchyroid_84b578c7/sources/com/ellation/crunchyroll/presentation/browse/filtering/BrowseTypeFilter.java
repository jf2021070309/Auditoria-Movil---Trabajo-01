package com.ellation.crunchyroll.presentation.browse.filtering;

import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: BrowseFilterOption.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseFilterOption;", "Default", "MoviesOnly", "SeriesOnly", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter$Default;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter$MoviesOnly;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter$SeriesOnly;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class BrowseTypeFilter extends BrowseFilterOption {

    /* compiled from: BrowseFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter$Default;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Default extends BrowseTypeFilter {
        public static final Default d = new Default();

        private Default() {
            super(null, R.string.browse_filter_all);
        }
    }

    /* compiled from: BrowseFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter$MoviesOnly;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class MoviesOnly extends BrowseTypeFilter {
        public static final MoviesOnly d = new MoviesOnly();

        private MoviesOnly() {
            super("movie_listing", R.string.browse_filter_movies_only);
        }
    }

    /* compiled from: BrowseFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter$SeriesOnly;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseTypeFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SeriesOnly extends BrowseTypeFilter {
        public static final SeriesOnly d = new SeriesOnly();

        private SeriesOnly() {
            super("series", R.string.browse_filter_series_only);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BrowseTypeFilter(java.lang.String r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.presentation.browse.filtering.BrowseTypeFilter.<init>(java.lang.String, int):void");
    }
}
