package com.ellation.crunchyroll.presentation.watchlist.sorting;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.mn.n;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: WatchlistSortOrder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/sorting/WatchlistSortOrder;", "Lcom/amazon/aps/iva/mn/n;", "Ascending", "Descending", "Lcom/ellation/crunchyroll/presentation/watchlist/sorting/WatchlistSortOrder$Ascending;", "Lcom/ellation/crunchyroll/presentation/watchlist/sorting/WatchlistSortOrder$Descending;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class WatchlistSortOrder implements n {
    public final int b;
    public final Map<String, String> c;

    /* compiled from: WatchlistSortOrder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/sorting/WatchlistSortOrder$Ascending;", "Lcom/ellation/crunchyroll/presentation/watchlist/sorting/WatchlistSortOrder;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Ascending extends WatchlistSortOrder {
        public Ascending(int i) {
            super("asc", i);
        }
    }

    /* compiled from: WatchlistSortOrder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/sorting/WatchlistSortOrder$Descending;", "Lcom/ellation/crunchyroll/presentation/watchlist/sorting/WatchlistSortOrder;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Descending extends WatchlistSortOrder {
        public Descending(int i) {
            super("desc", i);
        }
    }

    public WatchlistSortOrder(String str, int i) {
        this.b = i;
        this.c = k.x(new j("order", str));
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(cls2, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.watchlist.sorting.WatchlistSortOrder");
        WatchlistSortOrder watchlistSortOrder = (WatchlistSortOrder) obj;
        if (this.b == watchlistSortOrder.b && com.amazon.aps.iva.yb0.j.a(this.c, watchlistSortOrder.c)) {
            return true;
        }
        return false;
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

    public final int hashCode() {
        return this.c.hashCode() + (this.b * 31);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
