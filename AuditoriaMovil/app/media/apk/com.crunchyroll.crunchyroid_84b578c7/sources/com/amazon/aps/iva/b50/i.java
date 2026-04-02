package com.amazon.aps.iva.b50;

import com.amazon.aps.iva.ee0.f1;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.watchlist.filtering.FavoritesFilter;
import com.ellation.crunchyroll.presentation.watchlist.filtering.SubDubFilter;
import com.ellation.crunchyroll.presentation.watchlist.filtering.VideoTypeFilter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WatchlistFilters.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.mn.e {
    public static final List<com.amazon.aps.iva.mn.c> e;
    public static final i f;
    public final FavoritesFilter a;
    public final VideoTypeFilter b;
    public final SubDubFilter c;
    public final List<com.amazon.aps.iva.mn.b> d;

    static {
        VideoTypeFilter.Default r5 = VideoTypeFilter.Default.d;
        VideoTypeFilter[] videoTypeFilterArr = {r5, VideoTypeFilter.SeriesOnly.d, VideoTypeFilter.MoviesOnly.d};
        SubDubFilter.Default r4 = SubDubFilter.Default.d;
        e = f1.K(new com.amazon.aps.iva.mn.a(FavoritesFilter.FavoritesOnly.d), new com.amazon.aps.iva.mn.d(R.string.watchlist_filter_series_and_movies_title, f1.K(videoTypeFilterArr)), new com.amazon.aps.iva.mn.d(R.string.watchlist_filter_subtitled_dubbed_title, f1.K(r4, SubDubFilter.SubtitledOnly.d, SubDubFilter.DubbedOnly.d)));
        f = new i(FavoritesFilter.Default.d, r5, r4);
    }

    public i(FavoritesFilter favoritesFilter, VideoTypeFilter videoTypeFilter, SubDubFilter subDubFilter) {
        com.amazon.aps.iva.yb0.j.f(favoritesFilter, "favoritesOnly");
        com.amazon.aps.iva.yb0.j.f(videoTypeFilter, "videoTypeFilter");
        com.amazon.aps.iva.yb0.j.f(subDubFilter, "subDubFilter");
        this.a = favoritesFilter;
        this.b = videoTypeFilter;
        this.c = subDubFilter;
        this.d = f1.K(favoritesFilter, videoTypeFilter, subDubFilter);
    }

    public static i d(i iVar, FavoritesFilter favoritesFilter, VideoTypeFilter videoTypeFilter, SubDubFilter subDubFilter, int i) {
        if ((i & 1) != 0) {
            favoritesFilter = iVar.a;
        }
        if ((i & 2) != 0) {
            videoTypeFilter = iVar.b;
        }
        if ((i & 4) != 0) {
            subDubFilter = iVar.c;
        }
        iVar.getClass();
        com.amazon.aps.iva.yb0.j.f(favoritesFilter, "favoritesOnly");
        com.amazon.aps.iva.yb0.j.f(videoTypeFilter, "videoTypeFilter");
        com.amazon.aps.iva.yb0.j.f(subDubFilter, "subDubFilter");
        return new i(favoritesFilter, videoTypeFilter, subDubFilter);
    }

    @Override // com.amazon.aps.iva.mn.e
    public final com.amazon.aps.iva.mn.e a(com.amazon.aps.iva.mn.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "filter");
        boolean z = bVar instanceof FavoritesFilter;
        i iVar = f;
        if (z) {
            return d(this, iVar.a, null, null, 6);
        }
        if (bVar instanceof VideoTypeFilter) {
            return d(this, null, iVar.b, null, 5);
        }
        if (bVar instanceof SubDubFilter) {
            return d(this, null, null, iVar.c, 3);
        }
        String simpleName = i.class.getSimpleName();
        throw new IllegalArgumentException("Provided " + bVar + " is not supported in " + simpleName);
    }

    @Override // com.amazon.aps.iva.mn.e
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        i iVar = f;
        FavoritesFilter favoritesFilter = iVar.a;
        FavoritesFilter favoritesFilter2 = this.a;
        if (!com.amazon.aps.iva.yb0.j.a(favoritesFilter2, favoritesFilter)) {
            arrayList.add(favoritesFilter2);
        }
        VideoTypeFilter videoTypeFilter = this.b;
        if (!com.amazon.aps.iva.yb0.j.a(videoTypeFilter, iVar.b)) {
            arrayList.add(videoTypeFilter);
        }
        SubDubFilter subDubFilter = this.c;
        if (!com.amazon.aps.iva.yb0.j.a(subDubFilter, iVar.c)) {
            arrayList.add(subDubFilter);
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.mn.e
    public final com.amazon.aps.iva.mn.e c(com.amazon.aps.iva.mn.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "filter");
        if (bVar instanceof FavoritesFilter) {
            return d(this, (FavoritesFilter) bVar, null, null, 6);
        }
        if (bVar instanceof VideoTypeFilter) {
            return d(this, null, (VideoTypeFilter) bVar, null, 5);
        }
        if (bVar instanceof SubDubFilter) {
            return d(this, null, null, (SubDubFilter) bVar, 3);
        }
        String simpleName = i.class.getSimpleName();
        throw new IllegalArgumentException("Provided " + bVar + " is not supported in " + simpleName);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, iVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, iVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, iVar.c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.mn.e
    public final List<com.amazon.aps.iva.mn.b> getAll() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WatchlistFilters(favoritesOnly=" + this.a + ", videoTypeFilter=" + this.b + ", subDubFilter=" + this.c + ")";
    }
}
