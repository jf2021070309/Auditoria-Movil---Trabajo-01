package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h {
    private static final int[] a = {7, 4, 2, 1, 11};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f4303b = {5, 6, 10, 3, 9, 8, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f4304c = {15, 12, 13};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f4305d = {20};

    public static String a(InputStream inputStream, com.applovin.impl.sdk.m mVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) mVar.a(com.applovin.impl.sdk.c.b.cZ)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String a(String str, com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aZ), str, mVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.m mVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 != null) {
            if (mVar != null) {
                return e.a.d.a.a.k(str, str2);
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No endpoint specified");
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    public static void a(int i2, com.applovin.impl.sdk.m mVar) {
        if (i2 == 401) {
            StringBuilder y = e.a.d.a.a.y("SDK key \"");
            y.append(mVar.z());
            y.append("\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            v.i("AppLovinSdk", y.toString());
        } else if (i2 == 418) {
            mVar.K().a(com.applovin.impl.sdk.c.b.ac, Boolean.TRUE);
            mVar.K().a();
        } else {
            if (i2 < 400 || i2 >= 500) {
                if (i2 != -1 || !((Boolean) mVar.a(com.applovin.impl.sdk.c.b.ae)).booleanValue()) {
                    return;
                }
            } else if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.ae)).booleanValue()) {
                return;
            }
            mVar.k();
        }
    }

    public static void a(JSONObject jSONObject, boolean z, com.applovin.impl.sdk.m mVar) {
        mVar.ag().a(jSONObject, z);
    }

    public static boolean a() {
        return a((String) null);
    }

    private static boolean a(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i3 == i2) {
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
        if (g.e()) {
            return (!g.f() || TextUtils.isEmpty(str)) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
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

    public static String b(String str, com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.ba), str, mVar);
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            mVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.A, (com.applovin.impl.sdk.c.d<String>) string);
            mVar.B().c("ConnectionUtils", "Updated persisted data");
        }
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        try {
            if (jSONObject.has("settings")) {
                com.applovin.impl.sdk.c.c K = mVar.K();
                if (jSONObject.isNull("settings")) {
                    return;
                }
                K.a(jSONObject.getJSONObject("settings"));
                K.a();
            }
        } catch (JSONException e2) {
            mVar.B().b("ConnectionUtils", "Unable to parse settings out of API response", e2);
        }
    }

    public static Map<String, String> e(com.applovin.impl.sdk.m mVar) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = (String) mVar.a(com.applovin.impl.sdk.c.b.af);
        if (!StringUtils.isValidString(str2)) {
            if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.et)).booleanValue()) {
                str2 = mVar.z();
                str = "api_key";
            }
            hashMap.putAll(Utils.stringifyObjectMap(mVar.V().i()));
            return hashMap;
        }
        str = "device_token";
        hashMap.put(str, str2);
        hashMap.putAll(Utils.stringifyObjectMap(mVar.V().i()));
        return hashMap;
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(mVar.L()).edit();
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

    public static String f(com.applovin.impl.sdk.m mVar) {
        NetworkInfo b2 = b(mVar.L());
        if (b2 != null) {
            int type = b2.getType();
            int subtype = b2.getSubtype();
            return type == 1 ? "wifi" : type == 0 ? a(subtype, a) ? "2g" : a(subtype, f4303b) ? "3g" : a(subtype, f4304c) ? "4g" : a(subtype, f4305d) ? "5g" : "mobile" : "unknown";
        }
        return "unknown";
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            mVar.y().updateVariables(jSONObject2);
        }
    }

    public static String g(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aX), ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.dh)).booleanValue() ? "5.0/ad" : "4.0/ad", mVar);
    }

    public static String h(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aY), ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.dh)).booleanValue() ? "5.0/ad" : "4.0/ad", mVar);
    }

    public static String i(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aX), "4.0/ad", mVar);
    }

    public static String j(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aY), "4.0/ad", mVar);
    }

    public static String k(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.bd), "1.0/variable_config", mVar);
    }

    public static String l(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.be), "1.0/variable_config", mVar);
    }
}
