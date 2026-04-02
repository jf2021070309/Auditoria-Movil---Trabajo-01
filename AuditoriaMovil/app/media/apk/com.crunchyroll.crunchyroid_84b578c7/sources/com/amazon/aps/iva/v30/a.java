package com.amazon.aps.iva.v30;

import com.ellation.crunchyroll.model.search.SearchItemsContainerType;
import java.io.Serializable;
/* compiled from: SearchDetailData.kt */
/* loaded from: classes2.dex */
public final class a implements Serializable {
    public final String b;
    public final SearchItemsContainerType c;

    public a(String str, SearchItemsContainerType searchItemsContainerType) {
        com.amazon.aps.iva.yb0.j.f(str, "searchText");
        com.amazon.aps.iva.yb0.j.f(searchItemsContainerType, "searchType");
        this.b = str;
        this.c = searchItemsContainerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && this.c == aVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SearchDetailData(searchText=" + this.b + ", searchType=" + this.c + ")";
    }
}
