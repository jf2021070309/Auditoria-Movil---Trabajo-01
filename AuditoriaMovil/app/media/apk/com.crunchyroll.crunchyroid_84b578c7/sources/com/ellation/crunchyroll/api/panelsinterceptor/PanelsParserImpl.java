package com.ellation.crunchyroll.api.panelsinterceptor;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: PanelsParser.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/panelsinterceptor/PanelsParserImpl;", "Lcom/ellation/crunchyroll/api/panelsinterceptor/PanelsParser;", "Lcom/google/gson/JsonElement;", "", "Lcom/google/gson/JsonObject;", "result", "Lcom/amazon/aps/iva/kb0/q;", "extractPanels", "jsonTree", "", "getPanels", "", "isPanel", "(Lcom/google/gson/JsonElement;)Z", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PanelsParserImpl implements PanelsParser {
    public static final int $stable = 0;

    private final void extractPanels(JsonElement jsonElement, List<JsonObject> list) {
        if (jsonElement.isJsonObject()) {
            if (isPanel(jsonElement)) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                j.e(asJsonObject, "asJsonObject");
                list.add(asJsonObject);
            }
            Set<Map.Entry<String, JsonElement>> entrySet = jsonElement.getAsJsonObject().entrySet();
            j.e(entrySet, "asJsonObject.entrySet()");
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                j.e(value, "it.value");
                extractPanels((JsonElement) value, list);
            }
        } else if (jsonElement.isJsonArray()) {
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            j.e(asJsonArray, "asJsonArray");
            for (JsonElement jsonElement2 : asJsonArray) {
                j.e(jsonElement2, "it");
                extractPanels(jsonElement2, list);
            }
        }
    }

    private final boolean isPanel(JsonElement jsonElement) {
        String str;
        JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("__class__");
        if (jsonElement2 != null) {
            str = jsonElement2.getAsString();
        } else {
            str = null;
        }
        if (!j.a(str, "panel") && !jsonElement.getAsJsonObject().has("series_metadata") && !jsonElement.getAsJsonObject().has("movie_listing_metadata") && !jsonElement.getAsJsonObject().has("movie_metadata") && !jsonElement.getAsJsonObject().has("episode_metadata")) {
            return false;
        }
        return true;
    }

    @Override // com.ellation.crunchyroll.api.panelsinterceptor.PanelsParser
    public List<JsonObject> getPanels(JsonElement jsonElement) {
        j.f(jsonElement, "jsonTree");
        ArrayList arrayList = new ArrayList();
        extractPanels(jsonElement, arrayList);
        return arrayList;
    }
}
