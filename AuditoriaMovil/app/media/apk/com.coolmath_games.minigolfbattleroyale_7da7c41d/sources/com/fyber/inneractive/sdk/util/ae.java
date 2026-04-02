package com.fyber.inneractive.sdk.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ae {

    /* loaded from: classes.dex */
    public interface a {
        JSONObject c();
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof a) {
                    jSONObject.putOpt(str, ((a) obj).c());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static JSONObject a(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static JSONArray a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONArray(str);
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }
}
