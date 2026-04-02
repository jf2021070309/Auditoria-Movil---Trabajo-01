package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_19do;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes.dex */
public class b {
    public static float a(String str, String str2, float f) {
        String type;
        if (a()) {
            try {
                ContentResolver c = c();
                return (c == null || (type = c.getType(Uri.parse(b("float", str2, str)))) == null || type.equals("null")) ? f : Float.parseFloat(type);
            } catch (Throwable th) {
                return f;
            }
        }
        return f;
    }

    public static int a(String str, String str2, int i) {
        String type;
        if (a()) {
            try {
                ContentResolver c = c();
                return (c == null || (type = c.getType(Uri.parse(b("int", str2, str)))) == null || type.equals("null")) ? i : Integer.parseInt(type);
            } catch (Throwable th) {
                return i;
            }
        }
        return i;
    }

    public static long a(String str, String str2, long j) {
        String type;
        if (a()) {
            try {
                ContentResolver c = c();
                return (c == null || (type = c.getType(Uri.parse(b("long", str2, str)))) == null || type.equals("null")) ? j : Long.parseLong(type);
            } catch (Throwable th) {
                return j;
            }
        }
        return j;
    }

    public static String a(String str, String str2, String str3) {
        String type;
        if (a()) {
            try {
                ContentResolver c = c();
                return (c == null || (type = c.getType(Uri.parse(b("string", str2, str)))) == null) ? str3 : !type.equals("null") ? type : str3;
            } catch (Throwable th) {
                return str3;
            }
        }
        return str3;
    }

    public static void a(String str) {
        if (a()) {
            try {
                ContentResolver c = c();
                if (c != null) {
                    c.delete(Uri.parse(d() + "clean" + c(str)), null, null);
                }
            } catch (Throwable th) {
            }
        }
    }

    public static void a(String str, String str2) {
        if (a()) {
            try {
                ContentResolver c = c();
                if (c != null) {
                    c.delete(Uri.parse(b("long", str2, str)), null, null);
                }
            } catch (Throwable th) {
            }
        }
    }

    public static void a(String str, String str2, Boolean bool) {
        synchronized (b.class) {
            if (a()) {
                try {
                    ContentResolver c = c();
                    if (c != null) {
                        Uri parse = Uri.parse(b("boolean", str2, str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", bool);
                        c.update(parse, contentValues, null, null);
                    }
                } catch (Throwable th) {
                }
            }
        }
    }

    public static void a(String str, String str2, Float f) {
        synchronized (b.class) {
            if (a()) {
                try {
                    ContentResolver c = c();
                    if (c != null) {
                        Uri parse = Uri.parse(b("float", str2, str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", f);
                        c.update(parse, contentValues, null, null);
                    }
                } catch (Throwable th) {
                }
            }
        }
    }

    public static void a(String str, String str2, Integer num) {
        synchronized (b.class) {
            if (a()) {
                try {
                    ContentResolver c = c();
                    if (c != null) {
                        Uri parse = Uri.parse(b("int", str2, str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", num);
                        c.update(parse, contentValues, null, null);
                    }
                } catch (Throwable th) {
                }
            }
        }
    }

    public static void a(String str, String str2, Long l) {
        synchronized (b.class) {
            if (a()) {
                try {
                    ContentResolver c = c();
                    if (c != null) {
                        Uri parse = Uri.parse(b("long", str2, str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", l);
                        c.update(parse, contentValues, null, null);
                    }
                } catch (Throwable th) {
                }
            }
        }
    }

    private static boolean a() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.c.a() != null;
    }

    public static boolean a(String str, String str2, boolean z) {
        String type;
        if (a()) {
            try {
                ContentResolver c = c();
                return (c == null || (type = c.getType(Uri.parse(b("boolean", str2, str)))) == null || type.equals("null")) ? z : Boolean.parseBoolean(type);
            } catch (Throwable th) {
                return z;
            }
        }
        return z;
    }

    public static Context b() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.c.a();
    }

    private static String b(String str, String str2, String str3) {
        return d() + str + "/" + str2 + c(str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.HashSet, java.util.Set] */
    public static Map<String, ?> b(String str) {
        Cursor cursor;
        String str2;
        if (!a()) {
            return null;
        }
        try {
            ContentResolver c = c();
            if (c != null) {
                cursor = c.query(Uri.parse(d() + "get_all" + c(str)), null, null, null, null);
                try {
                    HashMap hashMap = new HashMap();
                    if (cursor == null || !cursor.moveToFirst()) {
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return hashMap;
                    }
                    int columnIndex = cursor.getColumnIndex("cursor_name");
                    int columnIndex2 = cursor.getColumnIndex("cursor_type");
                    int columnIndex3 = cursor.getColumnIndex("cursor_value");
                    do {
                        String string = cursor.getString(columnIndex);
                        String string2 = cursor.getString(columnIndex2);
                        if (string2.equalsIgnoreCase("string")) {
                            String string3 = cursor.getString(columnIndex3);
                            boolean contains = string3.contains("__COMMA__");
                            str2 = string3;
                            if (contains) {
                                boolean matches = string3.matches("\\[.*\\]");
                                str2 = string3;
                                if (matches) {
                                    String[] split = string3.substring(1, string3.length() - 1).split(", ");
                                    ?? hashSet = new HashSet();
                                    for (String str3 : split) {
                                        hashSet.add(str3.replace("__COMMA__", ", "));
                                    }
                                    str2 = hashSet;
                                }
                            }
                        } else {
                            if (!string2.equalsIgnoreCase("boolean")) {
                                if (string2.equalsIgnoreCase("int")) {
                                    str2 = Integer.valueOf(cursor.getInt(columnIndex3));
                                } else if (string2.equalsIgnoreCase("long")) {
                                    str2 = Long.valueOf(cursor.getLong(columnIndex3));
                                } else if (string2.equalsIgnoreCase("float")) {
                                    str2 = Float.valueOf(cursor.getFloat(columnIndex3));
                                } else if (!string2.equalsIgnoreCase("string_set")) {
                                    str2 = null;
                                }
                            }
                            str2 = cursor.getString(columnIndex3);
                        }
                        hashMap.put(string, str2);
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return hashMap;
                } catch (Throwable th) {
                    if (cursor == null || cursor.isClosed()) {
                        return null;
                    }
                    cursor.close();
                    return null;
                }
            }
            return null;
        } catch (Throwable th2) {
            cursor = null;
        }
    }

    private static ContentResolver c() {
        try {
            if (a()) {
                return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.c.a().getContentResolver();
            }
        } catch (Throwable th) {
        }
        return null;
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=" + str;
    }

    public static void c(String str, String str2, String str3) {
        synchronized (b.class) {
            if (a()) {
                try {
                    ContentResolver c = c();
                    if (c != null) {
                        Uri parse = Uri.parse(b("string", str2, str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", str3);
                        c.update(parse, contentValues, null, null);
                    }
                } catch (Throwable th) {
                }
            }
        }
    }

    private static String d() {
        return e.b + "/t_sp/";
    }
}
