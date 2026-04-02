package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_19do;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
class c {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> a;

    private static float a(Context context, String str, String str2, float f) {
        SharedPreferences c = c(context, str);
        return c == null ? f : c.getFloat(str2, f);
    }

    private static int a(Context context, String str, String str2, int i) {
        SharedPreferences c = c(context, str);
        return c == null ? i : c.getInt(str2, i);
    }

    private static long a(Context context, String str, String str2, long j) {
        SharedPreferences c = c(context, str);
        return c == null ? j : c.getLong(str2, j);
    }

    private static Object a(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = a;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(b(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context, String str, String str2, String str3) {
        Object a2 = a(str, str2);
        if (a2 != null) {
            return a2 + "";
        }
        Object b = b(context, str, str2, str3);
        a(str, str2, b);
        return b + "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str) {
        SharedPreferences.Editor edit = c(context, str).edit();
        edit.clear();
        edit.apply();
        a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void a(Context context, String str, String str2, T t) {
        synchronized (c.class) {
            SharedPreferences c = c(context, str);
            if (c != null && !t.equals(a(str, str2))) {
                SharedPreferences.Editor edit = c.edit();
                if (t instanceof Boolean) {
                    edit.putBoolean(str2, ((Boolean) t).booleanValue());
                }
                if (t instanceof String) {
                    edit.putString(str2, (String) t);
                }
                if (t instanceof Integer) {
                    edit.putInt(str2, ((Integer) t).intValue());
                }
                if (t instanceof Long) {
                    edit.putLong(str2, ((Long) t).longValue());
                }
                if (t instanceof Float) {
                    edit.putFloat(str2, ((Float) t).floatValue());
                }
                edit.apply();
                a(str, str2, t);
            }
        }
    }

    private static void a(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = a;
        if (softReference == null || softReference.get() == null || (map = a.get().get(b(str))) == null) {
            return;
        }
        map.clear();
    }

    private static void a(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = a;
        if (softReference == null || softReference.get() == null) {
            a = new SoftReference<>(new ConcurrentHashMap());
        }
        String b = b(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = a.get();
        if (concurrentHashMap.get(b) == null) {
            concurrentHashMap.put(b, new HashMap());
        }
        concurrentHashMap.get(b).put(str2, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, String str, String str2) {
        SharedPreferences c = c(context, str);
        return c != null && c.contains(str2);
    }

    private static boolean a(Context context, String str, String str2, boolean z) {
        SharedPreferences c = c(context, str);
        return c == null ? z : c.getBoolean(str2, z);
    }

    private static Object b(Context context, String str, String str2, String str3) {
        String b = b(str);
        if (a(context, b, str2)) {
            if (!str3.equalsIgnoreCase("string")) {
                if (str3.equalsIgnoreCase("boolean")) {
                    return Boolean.valueOf(a(context, b, str2, false));
                }
                if (str3.equalsIgnoreCase("int")) {
                    return Integer.valueOf(a(context, b, str2, 0));
                }
                if (str3.equalsIgnoreCase("long")) {
                    return Long.valueOf(a(context, b, str2, 0L));
                }
                if (str3.equalsIgnoreCase("float")) {
                    return Float.valueOf(a(context, b, str2, 0.0f));
                }
                if (!str3.equalsIgnoreCase("string_set")) {
                    return null;
                }
            }
            return c(context, b, str2, null);
        }
        return null;
    }

    private static String b(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, ?> b(Context context, String str) {
        return c(context, str).getAll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, String str, String str2) {
        Map<String, Object> map;
        try {
            SharedPreferences c = c(context, str);
            if (c == null) {
                return;
            }
            SharedPreferences.Editor edit = c.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = a;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            String b = b(str);
            if (TextUtils.isEmpty(b) || (map = a.get().get(b)) == null || map.size() == 0) {
                return;
            }
            map.remove(str2);
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference2 = a;
            if (softReference2 == null || softReference2.get() == null) {
                return;
            }
            a.get().put(b, map);
        } catch (Throwable th) {
        }
    }

    private static SharedPreferences c(Context context, String str) {
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(b(str), 0);
    }

    private static String c(Context context, String str, String str2, String str3) {
        SharedPreferences c = c(context, str);
        return c == null ? str3 : c.getString(str2, str3);
    }
}
