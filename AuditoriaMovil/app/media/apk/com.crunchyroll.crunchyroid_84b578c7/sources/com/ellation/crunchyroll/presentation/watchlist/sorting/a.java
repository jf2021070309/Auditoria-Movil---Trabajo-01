package com.ellation.crunchyroll.presentation.watchlist.sorting;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.mn.m;
import com.amazon.aps.iva.mn.n;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.watchlist.sorting.WatchlistSortOrder;
import java.util.List;
import java.util.Map;
/* compiled from: WatchlistSortOption.kt */
/* loaded from: classes2.dex */
public abstract class a implements m {
    public final int b;
    public final int c;
    public final List<n> d;
    public final Map<String, String> e;

    /* compiled from: WatchlistSortOption.kt */
    /* renamed from: com.ellation.crunchyroll.presentation.watchlist.sorting.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0974a extends a {
        public static final C0974a f = new C0974a();

        public C0974a() {
            super(R.string.watchlist_sorting_alphabetical_title, R.string.watchlist_sorting_alphabetical_description, f1.K(new WatchlistSortOrder.Ascending(R.string.watchlist_sorting_order_a_to_z), new WatchlistSortOrder.Descending(R.string.watchlist_sorting_order_z_to_a)), "alphabetical");
        }
    }

    /* compiled from: WatchlistSortOption.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public static final b f = new b();

        public b() {
            super(R.string.watchlist_sorting_date_added_title, R.string.watchlist_sorting_date_added_description, f1.K(new WatchlistSortOrder.Descending(R.string.watchlist_sorting_order_newest), new WatchlistSortOrder.Ascending(R.string.watchlist_sorting_order_oldest)), "date_added");
        }
    }

    /* compiled from: WatchlistSortOption.kt */
    /* loaded from: classes2.dex */
    public static final class c extends a {
        public static final c f = new c();

        public c() {
            super(R.string.watchlist_sorting_date_updated_title, R.string.watchlist_sorting_date_updated_description, f1.K(new WatchlistSortOrder.Descending(R.string.watchlist_sorting_order_newest), new WatchlistSortOrder.Ascending(R.string.watchlist_sorting_order_oldest)), "date_updated");
        }
    }

    /* compiled from: WatchlistSortOption.kt */
    /* loaded from: classes2.dex */
    public static final class d extends a {
        public static final d f = new d();

        public d() {
            super(R.string.watchlist_sorting_date_watched_title, R.string.watchlist_sorting_date_watched_description, f1.K(new WatchlistSortOrder.Descending(R.string.watchlist_sorting_order_newest), new WatchlistSortOrder.Ascending(R.string.watchlist_sorting_order_oldest)), "date_watched");
        }
    }

    /* compiled from: WatchlistSortOption.kt */
    /* loaded from: classes2.dex */
    public static final class e extends a {
        public static final e f = new e();

        public e() {
            super(R.string.watchlist_sorting_recent_activity_title, R.string.watchlist_sorting_recent_activity_description, z.b, null);
        }
    }

    public a(int i, int i2, List list, String str) {
        Map<String, String> map;
        this.b = i;
        this.c = i2;
        this.d = list;
        if (str != null) {
            map = k.x(new j("sort_by", str));
        } else {
            map = a0.b;
        }
        this.e = map;
    }

    @Override // com.amazon.aps.iva.mn.f
    public final int getCriteria() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.p70.c
    public final Integer getDescription() {
        return Integer.valueOf(this.c);
    }

    @Override // com.amazon.aps.iva.mn.m
    public final List<n> getOrderOptions() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.p70.c
    public final int getTitle() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.mn.l
    public final Map<String, String> getUrlParams() {
        return this.e;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
