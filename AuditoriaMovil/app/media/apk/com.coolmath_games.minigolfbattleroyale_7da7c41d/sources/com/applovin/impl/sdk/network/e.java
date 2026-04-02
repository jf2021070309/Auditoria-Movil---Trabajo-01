package com.applovin.impl.sdk.network;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {
    private static final Object a = new Object();

    private static JSONObject a(String str, Context context) {
        JSONObject b = b(context);
        if (b == null) {
            b = new JSONObject();
        }
        if (!b.has(str)) {
            try {
                b.put(str, new JSONObject());
            } catch (JSONException unused) {
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (a) {
            String urlStringWithoutQueryParameters = Utils.urlStringWithoutQueryParameters(str);
            JSONObject a2 = a(urlStringWithoutQueryParameters, context);
            String num = Integer.toString(i);
            JSONObject optJSONObject = a2.optJSONObject(urlStringWithoutQueryParameters);
            try {
                optJSONObject.put(num, optJSONObject.optInt(num) + 1);
            } catch (JSONException unused) {
            }
            try {
                a2.put(urlStringWithoutQueryParameters, optJSONObject);
            } catch (JSONException unused2) {
            }
            a(a2, context);
        }
    }

    public static void a(Context context) {
        synchronized (a) {
            com.applovin.impl.sdk.c.e.a((com.applovin.impl.sdk.c.d) com.applovin.impl.sdk.c.d.q, context);
        }
    }

    private static void a(JSONObject jSONObject, Context context) {
        com.applovin.impl.sdk.c.e.a(com.applovin.impl.sdk.c.d.q, jSONObject.toString(), context);
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject;
        synchronized (a) {
            try {
                try {
                    jSONObject = new JSONObject((String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.q, JsonUtils.EMPTY_JSON, context));
                } catch (JSONException unused) {
                    return new JSONObject();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }
}
