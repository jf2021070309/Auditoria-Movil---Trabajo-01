package com.amazon.aps.iva.ms;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
/* compiled from: AppConfigMerger.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final JsonObject a(JsonObject jsonObject, JsonObject jsonObject2, boolean z) {
        Boolean bool;
        boolean z2;
        j.f(jsonObject, "<this>");
        j.f(jsonObject2, "remote");
        for (Map.Entry<String, JsonElement> entry : jsonObject2.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value.isJsonObject()) {
                JsonElement jsonElement = jsonObject.get(key);
                if (jsonElement instanceof JsonObject) {
                    JsonObject jsonObject3 = (JsonObject) jsonElement;
                    JsonElement jsonElement2 = jsonObject3.get("remote_configurable");
                    if (jsonElement2 != null) {
                        bool = Boolean.valueOf(jsonElement2.getAsBoolean());
                    } else {
                        bool = null;
                    }
                    if (z && bool != null && j.a(bool, Boolean.FALSE)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        JsonObject asJsonObject = value.getAsJsonObject();
                        j.e(asJsonObject, "value.asJsonObject");
                        value = a(jsonObject3, asJsonObject, z);
                    } else {
                        value = jsonElement;
                    }
                }
            }
            jsonObject.remove(key);
            jsonObject.add(key, value);
        }
        return jsonObject;
    }
}
