package com.ellation.crunchyroll.api.etp.content.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: WatchHistoryMetadata.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/WatchHistoryMetadata;", "", "_nextPage", "", "(Ljava/lang/String;)V", "nextPage", "getNextPage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchHistoryMetadata {
    public static final int $stable = 0;
    @SerializedName("next_page")
    private final String _nextPage;

    public WatchHistoryMetadata() {
        this(null, 1, null);
    }

    private final String component1() {
        return this._nextPage;
    }

    public static /* synthetic */ WatchHistoryMetadata copy$default(WatchHistoryMetadata watchHistoryMetadata, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchHistoryMetadata._nextPage;
        }
        return watchHistoryMetadata.copy(str);
    }

    public final WatchHistoryMetadata copy(String str) {
        return new WatchHistoryMetadata(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WatchHistoryMetadata) && j.a(this._nextPage, ((WatchHistoryMetadata) obj)._nextPage)) {
            return true;
        }
        return false;
    }

    public final String getNextPage() {
        boolean z;
        String str = this._nextPage;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = null;
        }
        return str;
    }

    public int hashCode() {
        String str = this._nextPage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return e.e("WatchHistoryMetadata(_nextPage=", this._nextPage, ")");
    }

    public WatchHistoryMetadata(String str) {
        this._nextPage = str;
    }

    public /* synthetic */ WatchHistoryMetadata(String str, int i, e eVar) {
        this((i & 1) != 0 ? null : str);
    }
}
