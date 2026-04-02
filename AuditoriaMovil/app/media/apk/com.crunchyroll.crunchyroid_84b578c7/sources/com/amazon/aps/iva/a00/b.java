package com.amazon.aps.iva.a00;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.mn.m;
import com.amazon.aps.iva.mn.n;
import com.amazon.aps.iva.yb0.e;
import com.crunchyroll.crunchyroid.R;
import java.util.List;
import java.util.Map;
/* compiled from: BrowseSortOption.kt */
/* loaded from: classes2.dex */
public enum b implements m {
    Popularity(R.string.browse_sorting_popularity_title, R.string.browse_sorting_popularity_criteria, null, "popularity", 4, null),
    Alphabetical(R.string.browse_sorting_alphabetical_title, 0, null, "alphabetical", 6, null),
    NewlyAdded(R.string.browse_sorting_newest_title, R.string.browse_sorting_newest_criteria, null, "newly_added", 4, null);
    
    public static final a Companion = new a();
    private final int criteria;
    private final List<n> orderOptions;
    private final int title;
    private final Map<String, String> urlParams;

    /* compiled from: BrowseSortOption.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    b(int i, int i2, List list, String str) {
        this.title = i;
        this.criteria = i2;
        this.orderOptions = list;
        this.urlParams = str != null ? k.x(new j("sort_by", str)) : a0.b;
    }

    @Override // com.amazon.aps.iva.mn.f
    public int getCriteria() {
        return this.criteria;
    }

    @Override // com.amazon.aps.iva.p70.c
    public Integer getDescription() {
        return null;
    }

    @Override // com.amazon.aps.iva.mn.m
    public List<n> getOrderOptions() {
        return this.orderOptions;
    }

    @Override // com.amazon.aps.iva.p70.c
    public int getTitle() {
        return this.title;
    }

    @Override // com.amazon.aps.iva.mn.l
    public Map<String, String> getUrlParams() {
        return this.urlParams;
    }

    @Override // java.lang.Enum
    public String toString() {
        return b.class.getSimpleName();
    }

    /* synthetic */ b(int i, int i2, List list, String str, int i3, e eVar) {
        this(i, (i3 & 2) != 0 ? i : i2, (i3 & 4) != 0 ? z.b : list, (i3 & 8) != 0 ? null : str);
    }
}
