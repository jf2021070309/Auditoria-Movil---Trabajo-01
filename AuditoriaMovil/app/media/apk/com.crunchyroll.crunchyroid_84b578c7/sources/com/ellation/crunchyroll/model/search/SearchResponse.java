package com.ellation.crunchyroll.model.search;

import com.amazon.aps.iva.oa.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SearchResponse.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005HÆ\u0003J?\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/model/search/SearchResponse;", "", "total", "", "panelsContainers", "", "Lcom/ellation/crunchyroll/model/search/SearchItemsContainer;", "Lcom/ellation/crunchyroll/model/Panel;", "musicItemsContainers", "Lcom/ellation/crunchyroll/model/music/MusicAsset;", "(ILjava/util/List;Ljava/util/List;)V", "getMusicItemsContainers", "()Ljava/util/List;", "getPanelsContainers", "getTotal", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SearchResponse {
    public static final int $stable = 8;
    private final List<SearchItemsContainer<MusicAsset>> musicItemsContainers;
    private final List<SearchItemsContainer<Panel>> panelsContainers;
    @SerializedName("total")
    private final int total;

    public SearchResponse(int i, List<SearchItemsContainer<Panel>> list, List<SearchItemsContainer<MusicAsset>> list2) {
        j.f(list, "panelsContainers");
        j.f(list2, "musicItemsContainers");
        this.total = i;
        this.panelsContainers = list;
        this.musicItemsContainers = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResponse copy$default(SearchResponse searchResponse, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = searchResponse.total;
        }
        if ((i2 & 2) != 0) {
            list = searchResponse.panelsContainers;
        }
        if ((i2 & 4) != 0) {
            list2 = searchResponse.musicItemsContainers;
        }
        return searchResponse.copy(i, list, list2);
    }

    public final int component1() {
        return this.total;
    }

    public final List<SearchItemsContainer<Panel>> component2() {
        return this.panelsContainers;
    }

    public final List<SearchItemsContainer<MusicAsset>> component3() {
        return this.musicItemsContainers;
    }

    public final SearchResponse copy(int i, List<SearchItemsContainer<Panel>> list, List<SearchItemsContainer<MusicAsset>> list2) {
        j.f(list, "panelsContainers");
        j.f(list2, "musicItemsContainers");
        return new SearchResponse(i, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResponse)) {
            return false;
        }
        SearchResponse searchResponse = (SearchResponse) obj;
        if (this.total == searchResponse.total && j.a(this.panelsContainers, searchResponse.panelsContainers) && j.a(this.musicItemsContainers, searchResponse.musicItemsContainers)) {
            return true;
        }
        return false;
    }

    public final List<SearchItemsContainer<MusicAsset>> getMusicItemsContainers() {
        return this.musicItemsContainers;
    }

    public final List<SearchItemsContainer<Panel>> getPanelsContainers() {
        return this.panelsContainers;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return this.musicItemsContainers.hashCode() + a.a(this.panelsContainers, Integer.hashCode(this.total) * 31, 31);
    }

    public String toString() {
        int i = this.total;
        List<SearchItemsContainer<Panel>> list = this.panelsContainers;
        List<SearchItemsContainer<MusicAsset>> list2 = this.musicItemsContainers;
        StringBuilder sb = new StringBuilder("SearchResponse(total=");
        sb.append(i);
        sb.append(", panelsContainers=");
        sb.append(list);
        sb.append(", musicItemsContainers=");
        return a.b(sb, list2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SearchResponse(int r2, java.util.List r3, java.util.List r4, int r5, com.amazon.aps.iva.yb0.e r6) {
        /*
            r1 = this;
            r6 = r5 & 2
            com.amazon.aps.iva.lb0.z r0 = com.amazon.aps.iva.lb0.z.b
            if (r6 == 0) goto L7
            r3 = r0
        L7:
            r5 = r5 & 4
            if (r5 == 0) goto Lc
            r4 = r0
        Lc:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.model.search.SearchResponse.<init>(int, java.util.List, java.util.List, int, com.amazon.aps.iva.yb0.e):void");
    }
}
