package com.ellation.crunchyroll.api.etp.content.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: WatchlistItem.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistItem;", "", "id", "", "isFavorite", "", "(Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchlistItem {
    public static final int $stable = 0;
    @SerializedName("id")
    private final String id;
    @SerializedName("is_favorite")
    private final boolean isFavorite;

    public WatchlistItem(String str, boolean z) {
        j.f(str, "id");
        this.id = str;
        this.isFavorite = z;
    }

    public static /* synthetic */ WatchlistItem copy$default(WatchlistItem watchlistItem, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchlistItem.id;
        }
        if ((i & 2) != 0) {
            z = watchlistItem.isFavorite;
        }
        return watchlistItem.copy(str, z);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component2() {
        return this.isFavorite;
    }

    public final WatchlistItem copy(String str, boolean z) {
        j.f(str, "id");
        return new WatchlistItem(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchlistItem)) {
            return false;
        }
        WatchlistItem watchlistItem = (WatchlistItem) obj;
        if (j.a(this.id, watchlistItem.id) && this.isFavorite == watchlistItem.isFavorite) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        boolean z = this.isFavorite;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public String toString() {
        String str = this.id;
        boolean z = this.isFavorite;
        return "WatchlistItem(id=" + str + ", isFavorite=" + z + ")";
    }
}
