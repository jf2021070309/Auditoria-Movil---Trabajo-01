package com.adcolony.sdk;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class as {
    as() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a() {
        return new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            au.h.b(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONArray b() {
        return new JSONArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONArray b(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            au.h.b(e.toString());
            return new JSONArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException e) {
            au.h.b(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.get(str);
        } catch (JSONException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(JSONArray jSONArray, int i) {
        try {
            return jSONArray.get(i);
        } catch (JSONException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getString(i);
        } catch (JSONException e) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException e) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getInt(str);
        } catch (JSONException e) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(JSONObject jSONObject, String str, int i) {
        try {
            return jSONObject.getInt(str);
        } catch (JSONException e) {
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double e(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getDouble(str);
        } catch (JSONException e) {
            return PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject f(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException e) {
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject d(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException e) {
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONArray g(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONArray(str);
        } catch (JSONException e) {
            return new JSONArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
            return true;
        } catch (JSONException e) {
            au.h.a("JSON error in ADCJSON put_string(): ").b(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
            return true;
        } catch (JSONException e) {
            au.h.a("JSON error in ADCJSON put_integer(): ").b(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
            return true;
        } catch (JSONException e) {
            au.h.a("JSON error in ADCJSON put_integer(): ").b(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.put(str, z);
            return true;
        } catch (JSONException e) {
            au.h.a("JSON error in ADCJSON put_boolean(): ").b(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(JSONObject jSONObject, String str, JSONArray jSONArray) {
        try {
            jSONObject.put(str, jSONArray);
            return true;
        } catch (JSONException e) {
            au.h.a("JSON error in ADCJSON put_array(): ").b(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
            return true;
        } catch (JSONException e) {
            au.h.a("JSON error in ADCJSON put_object(): ").b(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(JSONObject jSONObject, String str, double d) {
        try {
            jSONObject.put(str, d);
            return true;
        } catch (JSONException e) {
            au.h.a("JSON error in ADCJSON put_double(): ").b(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(JSONArray jSONArray, String str) {
        jSONArray.put(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(JSONArray jSONArray, Object obj) {
        jSONArray.put(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(JSONObject jSONObject, String str) {
        try {
            a.a().g().a(str, jSONObject.toString(), false);
            return true;
        } catch (IOException e) {
            au.h.a("IOException in ADCJSON's save_object: ").b(e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject c(String str) {
        try {
            return a(a.a().g().a(str, false).toString());
        } catch (IOException e) {
            au.h.a("IOException in ADCJSON's load_object: ").b(e.toString());
            return a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] a(JSONArray jSONArray) {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = c(jSONArray, i);
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONArray a(String[] strArr) {
        JSONArray b = b();
        for (String str : strArr) {
            a(b, str);
        }
        return b;
    }

    static boolean b(JSONArray jSONArray, String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (c(jSONArray, i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(JSONObject jSONObject, String str) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            if (str.equals(keys.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONArray a(JSONArray jSONArray, String[] strArr, boolean z) {
        for (String str : strArr) {
            if (!z || !b(jSONArray, str)) {
                a(jSONArray, str);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }
}
