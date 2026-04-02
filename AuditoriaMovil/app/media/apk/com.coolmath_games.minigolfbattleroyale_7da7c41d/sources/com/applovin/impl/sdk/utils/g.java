package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    private static final int[] a = {7, 4, 2, 1, 11};
    private static final int[] b = {5, 6, 10, 3, 9, 8, 14};
    private static final int[] c = {15, 12, 13};
    private static final int[] d = {20};

    public static String a(InputStream inputStream, com.applovin.impl.sdk.k kVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) kVar.a(com.applovin.impl.sdk.c.b.cZ)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String a(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(com.applovin.impl.sdk.c.b.aQ), str, kVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 != null) {
            if (kVar != null) {
                return str + str2;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No endpoint specified");
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    public static void a(int i, com.applovin.impl.sdk.k kVar) {
        com.applovin.impl.sdk.c.c I = kVar.I();
        if (i == 401) {
            I.a(com.applovin.impl.sdk.c.b.W, "");
            I.a(com.applovin.impl.sdk.c.b.Y, "");
            I.a();
            r.i("AppLovinSdk", "SDK key \"" + kVar.x() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
        } else if (i == 418) {
            I.a((com.applovin.impl.sdk.c.b<?>) com.applovin.impl.sdk.c.b.V, (Object) true);
            I.a();
        } else {
            if (i < 400 || i >= 500) {
                if (i != -1 || !((Boolean) kVar.a(com.applovin.impl.sdk.c.b.X)).booleanValue()) {
                    return;
                }
            } else if (!((Boolean) kVar.a(com.applovin.impl.sdk.c.b.X)).booleanValue()) {
                return;
            }
            kVar.k();
        }
    }

    public static void a(JSONObject jSONObject, boolean z, com.applovin.impl.sdk.k kVar) {
        kVar.af().a(jSONObject, z);
    }

    public static boolean a() {
        return a((String) null);
    }

    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") != null) {
            NetworkInfo b2 = b(context);
            if (b2 != null) {
                return b2.isConnected();
            }
            return false;
        }
        return true;
    }

    public static boolean a(String str) {
        if (f.e()) {
            return (!f.f() || TextUtils.isEmpty(str)) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return true;
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static String b(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(com.applovin.impl.sdk.c.b.aR), str, kVar);
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            kVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.y, (com.applovin.impl.sdk.c.d<String>) string);
            kVar.z().c("ConnectionUtils", "Updated persisted data");
        }
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        try {
            if (jSONObject.has("settings")) {
                com.applovin.impl.sdk.c.c I = kVar.I();
                if (jSONObject.isNull("settings")) {
                    return;
                }
                I.a(jSONObject.getJSONObject("settings"));
                I.a();
            }
        } catch (JSONException e) {
            kVar.z().b("ConnectionUtils", "Unable to parse settings out of API response", e);
        }
    }

    public static Map<String, String> e(com.applovin.impl.sdk.k kVar) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = (String) kVar.a(com.applovin.impl.sdk.c.b.Y);
        if (!StringUtils.isValidString(str2)) {
            if (!((Boolean) kVar.a(com.applovin.impl.sdk.c.b.en)).booleanValue()) {
                str2 = kVar.x();
                str = "api_key";
            }
            hashMap.putAll(Utils.stringifyObjectMap(kVar.T().h()));
            return hashMap;
        }
        str = "device_token";
        hashMap.put(str, str2);
        hashMap.putAll(Utils.stringifyObjectMap(kVar.T().h()));
        return hashMap;
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(kVar.J()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    com.applovin.impl.sdk.c.e.a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }

    public static String f(com.applovin.impl.sdk.k kVar) {
        NetworkInfo b2 = b(kVar.J());
        if (b2 != null) {
            int type = b2.getType();
            int subtype = b2.getSubtype();
            return type == 1 ? "wifi" : type == 0 ? a(subtype, a) ? "2g" : a(subtype, b) ? "3g" : a(subtype, c) ? "4g" : a(subtype, d) ? "5g" : "mobile" : "unknown";
        }
        return "unknown";
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "zones", null);
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        kVar.Z().a(jSONArray);
    }

    public static String g(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(com.applovin.impl.sdk.c.b.aO), ((Boolean) kVar.a(com.applovin.impl.sdk.c.b.dh)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    public static void g(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "zones", null);
        if (jSONArray != null) {
            kVar.Z().b(jSONArray);
        }
    }

    public static String h(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(com.applovin.impl.sdk.c.b.aP), ((Boolean) kVar.a(com.applovin.impl.sdk.c.b.dh)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    public static void h(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            kVar.w().updateVariables(jSONObject2);
        }
    }

    public static String i(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(com.applovin.impl.sdk.c.b.aU), "1.0/variable_config", kVar);
    }

    public static String j(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(com.applovin.impl.sdk.c.b.aV), "1.0/variable_config", kVar);
    }
}
