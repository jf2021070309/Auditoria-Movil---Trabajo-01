package com.fyber.inneractive.sdk.config.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class o implements n {
    JSONObject a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final String b(String str) {
        if (this.a.has(str)) {
            try {
                return this.a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final Integer c(String str) {
        if (this.a.has(str)) {
            try {
                return Integer.valueOf(this.a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final Boolean d(String str) {
        if (this.a.has(str)) {
            try {
                return Boolean.valueOf(this.a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final Double e(String str) {
        return Double.valueOf(this.a.optDouble(str, 0.0d));
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final String a(String str, String str2) {
        return this.a.optString(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final int a(String str, int i) {
        return this.a.optInt(str, i);
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final boolean a(String str, boolean z) {
        return this.a.optBoolean(str, z);
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final double a(String str, double d) {
        return this.a.optDouble(str, d);
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public final String toString() {
        JSONObject jSONObject = this.a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }
}
