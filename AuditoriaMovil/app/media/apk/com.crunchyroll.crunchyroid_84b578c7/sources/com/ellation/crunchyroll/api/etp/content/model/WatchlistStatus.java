package com.ellation.crunchyroll.api.etp.content.model;

import kotlin.Metadata;
/* compiled from: WatchlistStatus.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistStatus;", "", "status", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "IN_WATCHLIST", "NOT_IN_WATCHLIST", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum WatchlistStatus {
    IN_WATCHLIST("in_watchlist"),
    NOT_IN_WATCHLIST("not_in_watchlist");
    
    private final String status;

    WatchlistStatus(String str) {
        this.status = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.status;
    }
}
