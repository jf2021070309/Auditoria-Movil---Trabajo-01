package com.ellation.crunchyroll.api.panelsinterceptor;

import com.google.gson.JsonObject;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WatchlistStatusLoader.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/panelsinterceptor/WatchlistStatusLoader;", "", "", "Lcom/google/gson/JsonObject;", "jsonPanels", "Lcom/amazon/aps/iva/kb0/q;", "addInWatchlistStatusTo", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface WatchlistStatusLoader {
    void addInWatchlistStatusTo(List<JsonObject> list);
}
