package com.kuaishou.weapon.p0;

import org.json.JSONArray;
/* loaded from: classes.dex */
public class di {
    private static final String a = "bGlidmErKw==";
    private static final String b = "WnBvc2VkQnJpZGdlLmphcg==";
    private static final String c = "bGlienBvc2VkX2FydC5zbw==";

    public static Integer a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    String str = new String(c.a(b.getBytes(), 2));
                    byte[] a2 = c.a(c.getBytes(), 2);
                    return (a2 == null || !a(jSONArray, str, new String(a2))) ? null : 1;
                }
                return null;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    private static boolean a(JSONArray jSONArray, String str) {
        try {
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (((String) jSONArray.get(i)).contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    private static boolean a(JSONArray jSONArray, String str, String str2) {
        try {
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    String str3 = (String) jSONArray.get(i);
                    if (str3.contains(str) || str3.contains(str2)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static Integer b(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    String str = new String(c.a(a.getBytes(), 2));
                    return (str.length() <= 1 || !a(jSONArray, str)) ? null : 1;
                }
                return null;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
