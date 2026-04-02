package com.ellation.crunchyroll.model.search;

import com.amazon.aps.iva.yb0.e;
import com.google.android.gms.cast.tv.cac.UserActionContext;
import kotlin.Metadata;
/* compiled from: SearchItemsContainerType.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/model/search/SearchItemsContainerType;", "", "key", "", "maximumItems", "", "shouldDisplayViewAll", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Z)V", "getKey", "()Ljava/lang/String;", "getMaximumItems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShouldDisplayViewAll", "()Z", "toString", "TOP_RESULTS", UserActionContext.SERIES, "MOVIE_LISTINGS", "EPISODES", "MUSIC", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SearchItemsContainerType {
    TOP_RESULTS("top_results", 3, false),
    SERIES("series", null, false, 6, null),
    MOVIE_LISTINGS("movie_listing", null, false, 6, null),
    EPISODES("episode", null, false, 6, null),
    MUSIC("music", null, false, 6, null);
    
    private final String key;
    private final Integer maximumItems;
    private final boolean shouldDisplayViewAll;

    SearchItemsContainerType(String str, Integer num, boolean z) {
        this.key = str;
        this.maximumItems = num;
        this.shouldDisplayViewAll = z;
    }

    public final String getKey() {
        return this.key;
    }

    public final Integer getMaximumItems() {
        return this.maximumItems;
    }

    public final boolean getShouldDisplayViewAll() {
        return this.shouldDisplayViewAll;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.key;
    }

    /* synthetic */ SearchItemsContainerType(String str, Integer num, boolean z, int i, e eVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? true : z);
    }
}
