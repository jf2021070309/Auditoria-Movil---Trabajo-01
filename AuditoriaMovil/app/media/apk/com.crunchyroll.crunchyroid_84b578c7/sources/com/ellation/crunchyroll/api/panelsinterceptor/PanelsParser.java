package com.ellation.crunchyroll.api.panelsinterceptor;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PanelsParser.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/panelsinterceptor/PanelsParser;", "", "getPanels", "", "Lcom/google/gson/JsonObject;", "jsonTree", "Lcom/google/gson/JsonElement;", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PanelsParser {
    List<JsonObject> getPanels(JsonElement jsonElement);
}
