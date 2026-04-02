package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i {
    private final Map<String, String> b = new HashMap();
    final Map<String, h> a = new HashMap();

    public final String a(String str, String str2) {
        return this.b.containsKey(str) ? this.b.get(str) : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i iVar = (i) obj;
            if (this.b.equals(iVar.b) && this.a.equals(iVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public static void a(JSONObject jSONObject, i iVar) {
        JSONArray names = jSONObject.names();
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i, null);
            String optString2 = jSONObject.optString(optString, null);
            if (optString != null && optString2 != null) {
                iVar.b.put(optString, optString2);
            }
        }
    }

    public final int a(String str, int i, int i2) {
        try {
            i = Integer.parseInt(a(str, Integer.toString(i)));
        } catch (Throwable unused) {
        }
        return i < i2 ? i2 : i;
    }

    public final boolean a(String str, boolean z) {
        try {
            return Boolean.parseBoolean(a(str, Boolean.toString(z)));
        } catch (Throwable unused) {
            return z;
        }
    }

    public static void b(JSONObject jSONObject, i iVar) {
        if (jSONObject != null) {
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String optString = names.optString(i, null);
                JSONObject optJSONObject = jSONObject.optJSONObject(optString);
                if (optString != null && optJSONObject != null) {
                    iVar.a.put(optString, new h(optJSONObject));
                }
            }
        }
    }

    public final h a(String str) {
        if (this.a.containsKey(str)) {
            return this.a.get(str);
        }
        return new h();
    }

    public final g b(String str) {
        h a = a(IAConfigManager.k());
        return a.a.containsKey(str) ? a.a.get(str) : new g();
    }
}
