package com.amazon.aps.iva.tz;

import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.browse.filtering.BrowseSubDubFilter;
import com.ellation.crunchyroll.presentation.browse.filtering.BrowseTypeFilter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BrowseFilters.kt */
/* loaded from: classes2.dex */
public final class q0 implements com.amazon.aps.iva.mn.e {
    public static final List<com.amazon.aps.iva.mn.d> d;
    public static final q0 e;
    public final BrowseTypeFilter a;
    public final BrowseSubDubFilter b;
    public final List<com.amazon.aps.iva.mn.b> c;

    static {
        BrowseTypeFilter.Default r3 = BrowseTypeFilter.Default.d;
        com.amazon.aps.iva.mn.d dVar = new com.amazon.aps.iva.mn.d(R.string.browse_filter_type_title, com.amazon.aps.iva.ee0.f1.K(r3, BrowseTypeFilter.SeriesOnly.d, BrowseTypeFilter.MoviesOnly.d));
        BrowseSubDubFilter.Default r5 = BrowseSubDubFilter.Default.d;
        d = com.amazon.aps.iva.ee0.f1.K(dVar, new com.amazon.aps.iva.mn.d(R.string.browse_filter_subtitled_dubbed_title, com.amazon.aps.iva.ee0.f1.K(r5, BrowseSubDubFilter.SubtitledOnly.d, BrowseSubDubFilter.DubbedOnly.d)));
        e = new q0(r3, r5);
    }

    public q0(BrowseTypeFilter browseTypeFilter, BrowseSubDubFilter browseSubDubFilter) {
        com.amazon.aps.iva.yb0.j.f(browseTypeFilter, "browseTypeFilter");
        com.amazon.aps.iva.yb0.j.f(browseSubDubFilter, "subDubFilter");
        this.a = browseTypeFilter;
        this.b = browseSubDubFilter;
        this.c = com.amazon.aps.iva.ee0.f1.K(browseTypeFilter, browseSubDubFilter);
    }

    public static q0 d(q0 q0Var, BrowseTypeFilter browseTypeFilter, BrowseSubDubFilter browseSubDubFilter, int i) {
        if ((i & 1) != 0) {
            browseTypeFilter = q0Var.a;
        }
        if ((i & 2) != 0) {
            browseSubDubFilter = q0Var.b;
        }
        q0Var.getClass();
        com.amazon.aps.iva.yb0.j.f(browseTypeFilter, "browseTypeFilter");
        com.amazon.aps.iva.yb0.j.f(browseSubDubFilter, "subDubFilter");
        return new q0(browseTypeFilter, browseSubDubFilter);
    }

    @Override // com.amazon.aps.iva.mn.e
    public final com.amazon.aps.iva.mn.e a(com.amazon.aps.iva.mn.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "filter");
        boolean z = bVar instanceof BrowseTypeFilter;
        q0 q0Var = e;
        if (z) {
            return d(this, q0Var.a, null, 2);
        }
        if (bVar instanceof BrowseSubDubFilter) {
            return d(this, null, q0Var.b, 1);
        }
        String simpleName = q0.class.getSimpleName();
        throw new IllegalArgumentException("Provided " + bVar + " is not supported in " + simpleName);
    }

    @Override // com.amazon.aps.iva.mn.e
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        q0 q0Var = e;
        BrowseTypeFilter browseTypeFilter = q0Var.a;
        BrowseTypeFilter browseTypeFilter2 = this.a;
        if (!com.amazon.aps.iva.yb0.j.a(browseTypeFilter2, browseTypeFilter)) {
            arrayList.add(browseTypeFilter2);
        }
        BrowseSubDubFilter browseSubDubFilter = this.b;
        if (!com.amazon.aps.iva.yb0.j.a(browseSubDubFilter, q0Var.b)) {
            arrayList.add(browseSubDubFilter);
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.mn.e
    public final com.amazon.aps.iva.mn.e c(com.amazon.aps.iva.mn.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "filter");
        if (bVar instanceof BrowseTypeFilter) {
            return d(this, (BrowseTypeFilter) bVar, null, 2);
        }
        if (bVar instanceof BrowseSubDubFilter) {
            return d(this, null, (BrowseSubDubFilter) bVar, 1);
        }
        String simpleName = q0.class.getSimpleName();
        throw new IllegalArgumentException("Provided " + bVar + " is not supported in " + simpleName);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, q0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, q0Var.b)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.mn.e
    public final List<com.amazon.aps.iva.mn.b> getAll() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrowseFilters(browseTypeFilter=" + this.a + ", subDubFilter=" + this.b + ")";
    }
}
