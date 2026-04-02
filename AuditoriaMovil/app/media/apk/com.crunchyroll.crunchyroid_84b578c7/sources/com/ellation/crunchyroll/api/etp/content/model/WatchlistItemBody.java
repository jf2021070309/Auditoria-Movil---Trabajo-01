package com.ellation.crunchyroll.api.etp.content.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: WatchlistItemBody.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistItemBody;", "", "contentId", "", "(Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchlistItemBody {
    public static final int $stable = 0;
    @SerializedName("content_id")
    private final String contentId;

    public WatchlistItemBody(String str) {
        j.f(str, "contentId");
        this.contentId = str;
    }

    public static /* synthetic */ WatchlistItemBody copy$default(WatchlistItemBody watchlistItemBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchlistItemBody.contentId;
        }
        return watchlistItemBody.copy(str);
    }

    public final String component1() {
        return this.contentId;
    }

    public final WatchlistItemBody copy(String str) {
        j.f(str, "contentId");
        return new WatchlistItemBody(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WatchlistItemBody) && j.a(this.contentId, ((WatchlistItemBody) obj).contentId)) {
            return true;
        }
        return false;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public int hashCode() {
        return this.contentId.hashCode();
    }

    public String toString() {
        return e.e("WatchlistItemBody(contentId=", this.contentId, ")");
    }
}
