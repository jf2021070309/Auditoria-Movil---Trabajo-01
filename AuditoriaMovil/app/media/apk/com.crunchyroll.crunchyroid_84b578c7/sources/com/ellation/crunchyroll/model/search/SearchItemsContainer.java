package com.ellation.crunchyroll.model.search;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oa.a;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SearchItemsContainer.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\bHÂ\u0003J9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/model/search/SearchItemsContainer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "type", "Lcom/ellation/crunchyroll/model/search/SearchItemsContainerType;", "totalCount", "", "_items", "", "(Lcom/ellation/crunchyroll/model/search/SearchItemsContainerType;ILjava/util/List;)V", FirebaseAnalytics.Param.ITEMS, "getItems", "()Ljava/util/List;", "getTotalCount", "()I", "getType", "()Lcom/ellation/crunchyroll/model/search/SearchItemsContainerType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SearchItemsContainer<T> {
    public static final int $stable = 8;
    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<T> _items;
    @SerializedName("count")
    private final int totalCount;
    @SerializedName("type")
    private final SearchItemsContainerType type;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchItemsContainer(SearchItemsContainerType searchItemsContainerType, int i, List<? extends T> list) {
        this.type = searchItemsContainerType;
        this.totalCount = i;
        this._items = list;
    }

    private final List<T> component3() {
        return this._items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchItemsContainer copy$default(SearchItemsContainer searchItemsContainer, SearchItemsContainerType searchItemsContainerType, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            searchItemsContainerType = searchItemsContainer.type;
        }
        if ((i2 & 2) != 0) {
            i = searchItemsContainer.totalCount;
        }
        if ((i2 & 4) != 0) {
            list = searchItemsContainer._items;
        }
        return searchItemsContainer.copy(searchItemsContainerType, i, list);
    }

    public final SearchItemsContainerType component1() {
        return this.type;
    }

    public final int component2() {
        return this.totalCount;
    }

    public final SearchItemsContainer<T> copy(SearchItemsContainerType searchItemsContainerType, int i, List<? extends T> list) {
        return new SearchItemsContainer<>(searchItemsContainerType, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchItemsContainer)) {
            return false;
        }
        SearchItemsContainer searchItemsContainer = (SearchItemsContainer) obj;
        if (this.type == searchItemsContainer.type && this.totalCount == searchItemsContainer.totalCount && j.a(this._items, searchItemsContainer._items)) {
            return true;
        }
        return false;
    }

    public final List<T> getItems() {
        List<T> list = this._items;
        if (list != null) {
            return x.r0(list);
        }
        return z.b;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final SearchItemsContainerType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        SearchItemsContainerType searchItemsContainerType = this.type;
        int i = 0;
        if (searchItemsContainerType == null) {
            hashCode = 0;
        } else {
            hashCode = searchItemsContainerType.hashCode();
        }
        int a = r.a(this.totalCount, hashCode * 31, 31);
        List<T> list = this._items;
        if (list != null) {
            i = list.hashCode();
        }
        return a + i;
    }

    public String toString() {
        SearchItemsContainerType searchItemsContainerType = this.type;
        int i = this.totalCount;
        List<T> list = this._items;
        StringBuilder sb = new StringBuilder("SearchItemsContainer(type=");
        sb.append(searchItemsContainerType);
        sb.append(", totalCount=");
        sb.append(i);
        sb.append(", _items=");
        return a.b(sb, list, ")");
    }
}
