package com.amazon.aps.iva.ns;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: JsonObjectExtensions.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final LinkedHashMap a(JsonObject jsonObject, String str) {
        boolean z;
        String str2;
        j.f(jsonObject, "<this>");
        j.f(str, "parent");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<Map.Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
        j.e(entrySet, "this.entrySet()");
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            Object key = entry.getKey();
            if (z) {
                str2 = (String) key;
            } else {
                str2 = str + "." + key;
            }
            if (jsonElement instanceof JsonObject) {
                j.e(str2, "keyWithPrefix");
                linkedHashMap.putAll(a((JsonObject) jsonElement, str2));
            } else {
                j.e(str2, "keyWithPrefix");
                String asString = jsonElement.getAsString();
                j.e(asString, "value.asString");
                linkedHashMap.put(str2, asString);
            }
        }
        return linkedHashMap;
    }
}
