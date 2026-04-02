package com.ellation.crunchyroll.api.etp.content.model;

import com.google.android.gms.cast.tv.cac.UserActionContext;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: WatchHistoryParentType.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/WatchHistoryParentType;", "", "Ljava/io/Serializable;", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", UserActionContext.SERIES, "MOVIE_LISTING", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum WatchHistoryParentType implements Serializable {
    SERIES("series"),
    MOVIE_LISTING("movie_listing");
    
    private final String type;

    WatchHistoryParentType(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
