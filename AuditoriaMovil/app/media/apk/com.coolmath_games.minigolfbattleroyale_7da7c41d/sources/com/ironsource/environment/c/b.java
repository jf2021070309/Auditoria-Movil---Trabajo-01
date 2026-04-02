package com.ironsource.environment.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class b {
    static {
        new b();
    }

    public static HashMap<String, Object> a(ConcurrentHashMap<String, Object> concurrentHashMap) {
        Object b;
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                b = b((JSONObject) entry.getValue());
            } else if (entry.getValue() instanceof JSONArray) {
                b = a((JSONArray) entry.getValue());
            } else if (entry.getValue() instanceof Map) {
                b = a((Map) entry.getValue());
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap.put(entry.getKey(), b);
        }
        return hashMap;
    }

    private static Map<String, Object> a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, map.get(str));
        }
        return hashMap;
    }

    private static JSONArray a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) opt));
                }
            }
        }
        return jSONObject;
    }

    private static JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }
}
