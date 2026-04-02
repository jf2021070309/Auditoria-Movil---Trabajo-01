package com.ellation.crunchyroll.api.panelsinterceptor;

import com.amazon.aps.iva.ob0.h;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.presentation.watchlist.f;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WatchlistStatusLoader.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/api/panelsinterceptor/WatchlistStatusLoaderImpl;", "Lcom/ellation/crunchyroll/api/panelsinterceptor/WatchlistStatusLoader;", "Lcom/google/gson/JsonObject;", "Lcom/ellation/crunchyroll/api/etp/content/model/WatchlistStatus;", "watchlistStatus", "Lcom/amazon/aps/iva/kb0/q;", "setWatchlistStatus", "", "jsonPanels", "addInWatchlistStatusTo", "Lcom/ellation/crunchyroll/presentation/watchlist/f;", "watchlistItemsLoader", "Lcom/ellation/crunchyroll/presentation/watchlist/f;", "", "kotlin.jvm.PlatformType", "getPanelId", "(Lcom/google/gson/JsonObject;)Ljava/lang/String;", "panelId", "getContainerId", "containerId", "<init>", "(Lcom/ellation/crunchyroll/presentation/watchlist/f;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WatchlistStatusLoaderImpl implements WatchlistStatusLoader {
    public static final int $stable = 8;
    private final f watchlistItemsLoader;

    public WatchlistStatusLoaderImpl(f fVar) {
        j.f(fVar, "watchlistItemsLoader");
        this.watchlistItemsLoader = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getContainerId(JsonObject jsonObject) {
        JsonObject jsonObject2;
        JsonObject jsonObject3;
        JsonElement jsonElement;
        JsonElement jsonElement2 = jsonObject.get("episode_metadata");
        if (jsonElement2 instanceof JsonObject) {
            jsonObject2 = (JsonObject) jsonElement2;
        } else {
            jsonObject2 = null;
        }
        if (jsonObject2 == null || (jsonElement = jsonObject2.get("series_id")) == null) {
            JsonElement jsonElement3 = jsonObject.get("movie_metadata");
            if (jsonElement3 instanceof JsonObject) {
                jsonObject3 = (JsonObject) jsonElement3;
            } else {
                jsonObject3 = null;
            }
            if (jsonObject3 != null) {
                jsonElement = jsonObject3.get("movie_listing_id");
            } else {
                jsonElement = null;
            }
        }
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPanelId(JsonObject jsonObject) {
        return jsonObject.get("id").getAsString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWatchlistStatus(JsonObject jsonObject, WatchlistStatus watchlistStatus) {
        jsonObject.addProperty("watchlist_status", watchlistStatus.toString());
    }

    @Override // com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoader
    public void addInWatchlistStatusTo(List<JsonObject> list) {
        j.f(list, "jsonPanels");
        i.e(h.b, new WatchlistStatusLoaderImpl$addInWatchlistStatusTo$1(this, list, null));
    }
}
