package com.vungle.publisher;

import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class ra {
    public static Boolean a(JSONObject jSONObject, String str) {
        boolean optBoolean = jSONObject.optBoolean(str, false);
        if (!optBoolean) {
            boolean optBoolean2 = jSONObject.optBoolean(str, true);
            if (optBoolean2) {
                return null;
            }
            return Boolean.valueOf(optBoolean2);
        }
        return Boolean.valueOf(optBoolean);
    }

    public static Double b(JSONObject jSONObject, String str) {
        double optDouble = jSONObject.optDouble(str);
        if (optDouble == Double.NaN) {
            double optDouble2 = jSONObject.optDouble(str, -1.0d);
            if (optDouble2 == -1.0d) {
                return null;
            }
            return Double.valueOf(optDouble2);
        }
        return Double.valueOf(optDouble);
    }

    public static Float c(JSONObject jSONObject, String str) {
        Double b = b(jSONObject, str);
        if (b == null) {
            return null;
        }
        return Float.valueOf(b.floatValue());
    }

    public static Integer d(JSONObject jSONObject, String str) {
        int optInt = jSONObject.optInt(str, -1);
        if (optInt == -1) {
            int optInt2 = jSONObject.optInt(str, -2);
            if (optInt2 == -2) {
                return null;
            }
            return Integer.valueOf(optInt2);
        }
        return Integer.valueOf(optInt);
    }

    public static Long e(JSONObject jSONObject, String str) {
        long optLong = jSONObject.optLong(str, -1L);
        if (optLong == -1) {
            long optLong2 = jSONObject.optLong(str, -2L);
            if (optLong2 == -2) {
                return null;
            }
            return Long.valueOf(optLong2);
        }
        return Long.valueOf(optLong);
    }

    public static String f(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public static String[] g(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = optJSONArray.optString(i, null);
            }
            return strArr;
        }
        return null;
    }

    public static List<String> h(JSONObject jSONObject, String str) {
        String[] g = g(jSONObject, str);
        if (g == null) {
            return null;
        }
        return Arrays.asList(g);
    }

    public static <T extends vs> JSONArray a(T... tArr) {
        JSONArray jSONArray = null;
        if (tArr != null) {
            jSONArray = new JSONArray();
            for (T t : tArr) {
                jSONArray.put(a(t));
            }
        }
        return jSONArray;
    }

    public static JSONObject a(vs vsVar) {
        if (vsVar == null) {
            return null;
        }
        return vsVar.b();
    }
}
