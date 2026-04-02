package com.ellation.analytics.internal;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AnalyticsFlattenDeserializer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/analytics/internal/AnalyticsFlattenDeserializer;", "Lcom/google/gson/JsonDeserializer;", "", "", "", "<init>", "()V", "analytics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AnalyticsFlattenDeserializer implements JsonDeserializer<Map<String, ? extends Object>> {
    public static LinkedHashMap a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Object valueOf;
        j.f(jsonElement, "json");
        j.f(type, "typeOfT");
        j.f(jsonDeserializationContext, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jsonElement.isJsonObject()) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                j.e(entry, "json.asJsonObject.entrySet()");
                String key = entry.getKey();
                JsonElement value = entry.getValue();
                if (value.isJsonPrimitive()) {
                    j.e(key, "key");
                    JsonPrimitive asJsonPrimitive = value.getAsJsonPrimitive();
                    j.e(asJsonPrimitive, "value.asJsonPrimitive");
                    if (asJsonPrimitive.isString()) {
                        valueOf = asJsonPrimitive.getAsString();
                    } else if (asJsonPrimitive.isNumber()) {
                        valueOf = Float.valueOf(asJsonPrimitive.getAsFloat());
                    } else if (asJsonPrimitive.isBoolean()) {
                        valueOf = Boolean.valueOf(asJsonPrimitive.getAsBoolean());
                    } else {
                        throw new IllegalArgumentException("JsonPrimitive is not a String, Number or Boolean");
                    }
                    linkedHashMap.put(key, valueOf);
                } else if (value.isJsonArray()) {
                    j.e(key, "key");
                    JsonArray<JsonElement> asJsonArray = value.getAsJsonArray();
                    j.e(asJsonArray, "value.asJsonArray");
                    ArrayList arrayList = new ArrayList(r.Y(asJsonArray));
                    for (JsonElement jsonElement2 : asJsonArray) {
                        arrayList.add(jsonElement2.getAsString());
                    }
                    linkedHashMap.put(key, arrayList);
                } else {
                    linkedHashMap.putAll(a(value, type, jsonDeserializationContext));
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.google.gson.JsonDeserializer
    public final /* bridge */ /* synthetic */ Map<String, ? extends Object> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return a(jsonElement, type, jsonDeserializationContext);
    }
}
