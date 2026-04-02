package com.amazon.aps.iva.mn;

import com.amazon.aps.iva.lb0.z;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.watchlist.filtering.FavoritesFilter;
import java.util.List;
/* compiled from: FilterOption.kt */
/* loaded from: classes2.dex */
public final class a implements c {
    public final int a;
    public final b b;
    public final List<b> c;

    public a() {
        throw null;
    }

    public a(FavoritesFilter.FavoritesOnly favoritesOnly) {
        z zVar = z.b;
        com.amazon.aps.iva.yb0.j.f(favoritesOnly, "selectedOption");
        this.a = R.string.watchlist_filter_favorites_title;
        this.b = favoritesOnly;
        this.c = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.mn.c
    public final List<b> getOptions() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.mn.c
    public final int getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterCheckBoxGroup(title=");
        sb.append(this.a);
        sb.append(", selectedOption=");
        sb.append(this.b);
        sb.append(", options=");
        return com.amazon.aps.iva.oa.a.b(sb, this.c, ")");
    }
}
