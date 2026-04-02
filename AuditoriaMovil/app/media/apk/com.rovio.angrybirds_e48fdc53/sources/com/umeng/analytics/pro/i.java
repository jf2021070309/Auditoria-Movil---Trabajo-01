package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.umeng.analytics.pro.e;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: UMStoreManager.java */
/* loaded from: classes3.dex */
public class i {
    public static final int a = 2049;
    public static final int b = 2050;
    private static final int c = 1000;
    private static Context d = null;
    private static String e = null;
    private static final String f = "umeng+";
    private static final String g = "ek__id";
    private static final String h = "ek_key";
    private List<String> i;
    private List<Integer> j;
    private String k;
    private List<String> l;

    /* compiled from: UMStoreManager.java */
    /* loaded from: classes3.dex */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UMStoreManager.java */
    /* loaded from: classes3.dex */
    public static class b {
        private static final i a = new i();

        private b() {
        }
    }

    private i() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
        this.l = new ArrayList();
    }

    public static i a(Context context) {
        i iVar = b.a;
        if (d == null && context != null) {
            d = context.getApplicationContext();
            iVar.k();
        }
        return iVar;
    }

    private void k() {
        synchronized (this) {
            l();
            this.i.clear();
            this.l.clear();
            this.j.clear();
        }
    }

    private Cursor a(String str, SQLiteDatabase sQLiteDatabase, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (sQLiteDatabase != null) {
            try {
                if (!sQLiteDatabase.isOpen()) {
                    return null;
                }
                return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
            } catch (Throwable th) {
                return null;
            }
        }
        return null;
    }

    public void a() {
        this.i.clear();
    }

    public void b() {
        this.l.clear();
    }

    public boolean c() {
        return this.l.isEmpty();
    }

    public void a(JSONArray jSONArray) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a2 = g.a(d).a();
            try {
                try {
                    a2.beginTransaction();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            ContentValues contentValues = new ContentValues();
                            String optString = jSONObject.optString("__i");
                            if (TextUtils.isEmpty(optString) || GMNetworkPlatformConst.AD_NETWORK_NO_PRICE.equals(optString)) {
                                optString = u.a().b();
                                if (TextUtils.isEmpty(optString)) {
                                    optString = GMNetworkPlatformConst.AD_NETWORK_NO_PRICE;
                                }
                            }
                            contentValues.put("__i", optString);
                            contentValues.put("__e", jSONObject.optString("id"));
                            contentValues.put("__t", Integer.valueOf(jSONObject.optInt("__t")));
                            contentValues.put("__av", UMUtils.getAppVersionName(d));
                            contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                            jSONObject.remove("__i");
                            jSONObject.remove("__t");
                            contentValues.put("__s", c(jSONObject.toString()));
                            a2.insert(e.b.a, null, contentValues);
                        } catch (Exception e2) {
                        }
                    }
                    a2.setTransactionSuccessful();
                    if (a2 != null) {
                        try {
                            a2.endTransaction();
                        } catch (Throwable th) {
                        }
                    }
                } catch (SQLiteDatabaseCorruptException e3) {
                    sQLiteDatabase = a2;
                    try {
                        h.a(d);
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable th2) {
                            }
                        }
                    } finally {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable th3) {
                            }
                        }
                        g.a(d).b();
                    }
                }
            } catch (Throwable th4) {
                sQLiteDatabase = a2;
            }
        } catch (SQLiteDatabaseCorruptException e4) {
        } catch (Throwable th5) {
        }
    }

    public boolean a(String str, String str2, int i) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a2 = g.a(d).a();
            try {
                a2.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("__i", str);
                String c2 = c(str2);
                if (!TextUtils.isEmpty(c2)) {
                    contentValues.put("__a", c2);
                    contentValues.put("__t", Integer.valueOf(i));
                    contentValues.put("__av", UMUtils.getAppVersionName(d));
                    contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                    a2.insert(e.a.a, null, contentValues);
                }
                a2.setTransactionSuccessful();
                if (a2 != null) {
                    try {
                        a2.endTransaction();
                    } catch (Throwable th) {
                    }
                }
            } catch (SQLiteDatabaseCorruptException e2) {
                sQLiteDatabase = a2;
                try {
                    h.a(d);
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th2) {
                        }
                    }
                    return false;
                } finally {
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th3) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (Throwable th4) {
                sQLiteDatabase = a2;
                return false;
            }
        } catch (SQLiteDatabaseCorruptException e3) {
        } catch (Throwable th5) {
        }
        return false;
    }

    public void d() {
        String c2;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = g.a(d).a();
            sQLiteDatabase.beginTransaction();
            c2 = u.a().c();
        } catch (SQLiteDatabaseCorruptException e2) {
            try {
                h.a(d);
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                    }
                }
            } finally {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                    }
                }
                g.a(d).b();
            }
        } catch (Throwable th3) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th4) {
                }
            }
        }
        if (TextUtils.isEmpty(c2)) {
            return;
        }
        String[] strArr = {"", GMNetworkPlatformConst.AD_NETWORK_NO_PRICE};
        for (int i = 0; i < 2; i++) {
            sQLiteDatabase.execSQL("update __et set __i=\"" + c2 + "\" where __i=\"" + strArr[i] + "\"");
        }
        sQLiteDatabase.setTransactionSuccessful();
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable th5) {
            }
        }
        g.a(d).b();
    }

    public boolean a(String str, JSONObject jSONObject, a aVar) {
        if (jSONObject == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a2 = g.a(d).a();
            try {
                a2.beginTransaction();
                if (aVar == a.BEGIN) {
                    long longValue = ((Long) jSONObject.opt("__e")).longValue();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("__ii", str);
                    contentValues.put("__e", String.valueOf(longValue));
                    contentValues.put("__av", UMUtils.getAppVersionName(d));
                    contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                    a2.insert(e.d.a, null, contentValues);
                } else if (aVar == a.INSTANTSESSIONBEGIN) {
                    b(str, jSONObject, a2);
                } else if (aVar == a.END) {
                    a(str, jSONObject, a2);
                } else if (aVar == a.PAGE) {
                    a(str, jSONObject, a2, "__a");
                } else if (aVar == a.AUTOPAGE) {
                    a(str, jSONObject, a2, e.d.a.c);
                } else if (aVar == a.NEWSESSION) {
                    c(str, jSONObject, a2);
                }
                a2.setTransactionSuccessful();
                if (a2 != null) {
                    try {
                        a2.endTransaction();
                    } catch (Throwable th) {
                    }
                }
            } catch (SQLiteDatabaseCorruptException e2) {
                sQLiteDatabase = a2;
                try {
                    h.a(d);
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th2) {
                        }
                    }
                    return false;
                } finally {
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th3) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (Throwable th4) {
                sQLiteDatabase = a2;
                return false;
            }
        } catch (SQLiteDatabaseCorruptException e3) {
        } catch (Throwable th5) {
        }
        return false;
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        String str2;
        try {
            long longValue = ((Long) jSONObject.opt(e.d.a.g)).longValue();
            long j = 0;
            Object opt = jSONObject.opt(e.d.a.h);
            if (opt != null && (opt instanceof Long)) {
                j = ((Long) opt).longValue();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str3 = "";
            if (optJSONObject == null || optJSONObject.length() <= 0) {
                str2 = "";
            } else {
                str2 = c(optJSONObject.toString());
            }
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str3 = c(optJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + longValue + "\", " + e.d.a.h + "=\"" + j + "\", __sp=\"" + str2 + "\", __pp=\"" + str3 + "\" where __ii=\"" + str + "\"");
        } catch (Throwable th) {
        }
    }

    private void b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        String str2;
        try {
            long longValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str3 = "";
            if (optJSONObject == null || optJSONObject.length() <= 0) {
                str2 = "";
            } else {
                str2 = c(optJSONObject.toString());
            }
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str3 = c(optJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(longValue));
            contentValues.put("__sp", str2);
            contentValues.put("__pp", str3);
            contentValues.put("__av", UMGlobalContext.getInstance(d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(d));
            sQLiteDatabase.insert(e.c.a, null, contentValues);
        } catch (Throwable th) {
        }
    }

    public long a(String str) {
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor = null;
        long j = 0;
        try {
            sQLiteDatabase = g.a(d).a();
            try {
                sQLiteDatabase.beginTransaction();
                cursor = a(e.d.a, sQLiteDatabase, new String[]{e.d.a.g}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursor != null) {
                    cursor.moveToFirst();
                    j = cursor.getLong(cursor.getColumnIndex(e.d.a.g));
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception e2) {
                    }
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Exception e3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception e4) {
                    }
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
                g.a(d).b();
                return j;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception e5) {
                        g.a(d).b();
                        throw th;
                    }
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
                g.a(d).b();
                throw th;
            }
        } catch (Exception e6) {
            sQLiteDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
        }
        g.a(d).b();
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.lang.String r20, org.json.JSONObject r21, android.database.sqlite.SQLiteDatabase r22) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.c(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Cursor cursor = null;
        r15 = null;
        String str3 = null;
        try {
            if ("__a".equals(str2)) {
                JSONArray optJSONArray = jSONObject.optJSONArray("__a");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    jSONArray = optJSONArray;
                }
                return;
            } else if (!e.d.a.c.equals(str2)) {
                jSONArray = null;
            } else {
                JSONArray optJSONArray2 = jSONObject.optJSONArray(e.d.a.c);
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    jSONArray = optJSONArray2;
                }
                return;
            }
            JSONArray jSONArray3 = jSONArray;
            Cursor a2 = a(e.d.a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
            if (a2 != null) {
                while (a2.moveToNext()) {
                    try {
                        str3 = d(a2.getString(a2.getColumnIndex(str2)));
                    } catch (Throwable th) {
                        cursor = a2;
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    }
                }
            }
            JSONArray jSONArray4 = new JSONArray();
            if (TextUtils.isEmpty(str3)) {
                jSONArray2 = jSONArray4;
            } else {
                jSONArray2 = new JSONArray(str3);
            }
            if (jSONArray2.length() <= 1000) {
                int i = 0;
                while (i < jSONArray3.length()) {
                    JSONArray jSONArray5 = jSONArray3;
                    try {
                        JSONObject jSONObject2 = jSONArray5.getJSONObject(i);
                        if (jSONObject2 != null) {
                            jSONArray2.put(jSONObject2);
                        }
                    } catch (JSONException e2) {
                    }
                    i++;
                    jSONArray3 = jSONArray5;
                }
                String c2 = c(jSONArray2.toString());
                if (!TextUtils.isEmpty(c2)) {
                    sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + c2 + "\" where __ii=\"" + str + "\"");
                }
                if (a2 != null) {
                    a2.close();
                }
            } else if (a2 == null) {
            } else {
                a2.close();
            }
        } catch (Throwable th2) {
        }
    }

    public boolean e() {
        return this.i.isEmpty();
    }

    public JSONObject a(boolean z) {
        a();
        this.j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            a(jSONObject, z);
            b(jSONObject, (String) null);
            a(jSONObject, (String) null);
        } else {
            String a2 = a(jSONObject, z);
            if (!TextUtils.isEmpty(a2)) {
                b(jSONObject, a2);
                a(jSONObject, a2);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    public JSONObject f() {
        SQLiteDatabase sQLiteDatabase;
        JSONObject jSONObject;
        Cursor cursor = null;
        r3 = null;
        r3 = null;
        r3 = null;
        JSONObject jSONObject2 = null;
        r3 = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.l.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabase = g.a(d).a();
            try {
                sQLiteDatabase.beginTransaction();
                Cursor a2 = a(e.c.a, sQLiteDatabase, null, "__ii=? ", new String[]{this.l.get(0)}, null, null, null, null);
                if (a2 != null) {
                    try {
                        if (a2.moveToNext()) {
                            jSONObject = new JSONObject();
                            try {
                                String string = a2.getString(a2.getColumnIndex("__av"));
                                String string2 = a2.getString(a2.getColumnIndex("__vc"));
                                jSONObject.put("__av", string);
                                jSONObject.put("__vc", string2);
                                jSONObject2 = jSONObject;
                            } catch (SQLiteDatabaseCorruptException e2) {
                                cursor2 = a2;
                                try {
                                    h.a(d);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        try {
                                            sQLiteDatabase.endTransaction();
                                        } catch (Throwable th) {
                                        }
                                    }
                                    g.a(d).b();
                                    return jSONObject;
                                } catch (Throwable th2) {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        try {
                                            sQLiteDatabase.endTransaction();
                                        } catch (Throwable th3) {
                                        }
                                    }
                                    g.a(d).b();
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                cursor = a2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    try {
                                        sQLiteDatabase.endTransaction();
                                    } catch (Throwable th5) {
                                    }
                                }
                                g.a(d).b();
                                return jSONObject;
                            }
                        }
                    } catch (SQLiteDatabaseCorruptException e3) {
                        jSONObject = jSONObject2;
                    } catch (Throwable th6) {
                        jSONObject = jSONObject2;
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (a2 != null) {
                    a2.close();
                }
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th7) {
                    }
                }
                g.a(d).b();
                return jSONObject2;
            } catch (SQLiteDatabaseCorruptException e4) {
                jSONObject = null;
            } catch (Throwable th8) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException e5) {
            sQLiteDatabase = null;
            jSONObject = null;
        } catch (Throwable th9) {
            sQLiteDatabase = null;
            jSONObject = null;
        }
    }

    public JSONObject b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, z);
        return jSONObject;
    }

    private void a(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabase = g.a(d).a();
                try {
                    sQLiteDatabase.beginTransaction();
                    cursor = !TextUtils.isEmpty(str) ? a(e.b.a, sQLiteDatabase, null, "__i=? ", new String[]{str}, null, null, null, null) : a(e.b.a, sQLiteDatabase, null, null, null, null, null, null, null);
                    if (cursor != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        String b2 = u.a().b();
                        while (cursor.moveToNext()) {
                            int i = cursor.getInt(cursor.getColumnIndex("__t"));
                            String string = cursor.getString(cursor.getColumnIndex("__i"));
                            String string2 = cursor.getString(cursor.getColumnIndex("__s"));
                            if (TextUtils.isEmpty(string) || GMNetworkPlatformConst.AD_NETWORK_NO_PRICE.equals(string)) {
                                if (!TextUtils.isEmpty(b2)) {
                                    string = b2;
                                }
                            }
                            this.j.add(Integer.valueOf(cursor.getInt(0)));
                            if (i != 2049) {
                                if (i == 2050 && !TextUtils.isEmpty(string2)) {
                                    JSONObject jSONObject4 = new JSONObject(d(string2));
                                    JSONArray optJSONArray = jSONObject3.has(string) ? jSONObject3.optJSONArray(string) : new JSONArray();
                                    optJSONArray.put(jSONObject4);
                                    jSONObject3.put(string, optJSONArray);
                                }
                            } else if (!TextUtils.isEmpty(string2)) {
                                JSONObject jSONObject5 = new JSONObject(d(string2));
                                JSONArray optJSONArray2 = jSONObject2.has(string) ? jSONObject2.optJSONArray(string) : new JSONArray();
                                optJSONArray2.put(jSONObject5);
                                jSONObject2.put(string, optJSONArray2);
                            }
                        }
                        if (jSONObject2.length() > 0) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                JSONObject jSONObject6 = new JSONObject();
                                String next = keys.next();
                                jSONObject6.put(next, new JSONArray(jSONObject2.optString(next)));
                                if (jSONObject6.length() > 0) {
                                    jSONArray.put(jSONObject6);
                                }
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put("ekv", jSONArray);
                            }
                        }
                        if (jSONObject3.length() > 0) {
                            JSONArray jSONArray2 = new JSONArray();
                            Iterator<String> keys2 = jSONObject3.keys();
                            while (keys2.hasNext()) {
                                JSONObject jSONObject7 = new JSONObject();
                                String next2 = keys2.next();
                                jSONObject7.put(next2, new JSONArray(jSONObject3.optString(next2)));
                                if (jSONObject7.length() > 0) {
                                    jSONArray2.put(jSONObject7);
                                }
                            }
                            if (jSONArray2.length() > 0) {
                                jSONObject.put(d.T, jSONArray2);
                            }
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th) {
                        }
                    }
                } catch (SQLiteDatabaseCorruptException e2) {
                    h.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th2) {
                        }
                    }
                    g.a(d).b();
                } catch (Throwable th3) {
                    h.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th4) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (Throwable th5) {
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th6) {
                    }
                }
                g.a(d).b();
                throw th5;
            }
        } catch (SQLiteDatabaseCorruptException e3) {
            sQLiteDatabase = null;
        } catch (Throwable th7) {
            sQLiteDatabase = null;
        }
        g.a(d).b();
    }

    private void b(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabase = g.a(d).a();
                try {
                    sQLiteDatabase.beginTransaction();
                    cursor = !TextUtils.isEmpty(str) ? a(e.a.a, sQLiteDatabase, null, "__i=? ", new String[]{str}, null, null, null, null) : a(e.a.a, sQLiteDatabase, null, null, null, null, null, null, null);
                    if (cursor != null) {
                        JSONArray jSONArray = new JSONArray();
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(cursor.getColumnIndex("__a"));
                            if (!TextUtils.isEmpty(string)) {
                                jSONArray.put(new JSONObject(d(string)));
                            }
                        }
                        if (jSONArray.length() > 0) {
                            jSONObject.put("error", jSONArray);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th) {
                        }
                    }
                } catch (SQLiteDatabaseCorruptException e2) {
                    h.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th2) {
                        }
                    }
                    g.a(d).b();
                } catch (Throwable th3) {
                    h.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th4) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (Throwable th5) {
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th6) {
                    }
                }
                g.a(d).b();
                throw th5;
            }
        } catch (SQLiteDatabaseCorruptException e3) {
            sQLiteDatabase = null;
        } catch (Throwable th7) {
            sQLiteDatabase = null;
        }
        g.a(d).b();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    public JSONObject g() {
        SQLiteDatabase sQLiteDatabase;
        JSONObject jSONObject;
        Cursor cursor = null;
        r3 = null;
        r3 = null;
        r3 = null;
        JSONObject jSONObject2 = null;
        r3 = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.i.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabase = g.a(d).a();
            try {
                sQLiteDatabase.beginTransaction();
                Cursor a2 = a(e.d.a, sQLiteDatabase, null, "__ii=? ", new String[]{this.i.get(0)}, null, null, null, null);
                if (a2 != null) {
                    try {
                        if (a2.moveToNext()) {
                            jSONObject = new JSONObject();
                            try {
                                String string = a2.getString(a2.getColumnIndex("__av"));
                                String string2 = a2.getString(a2.getColumnIndex("__vc"));
                                jSONObject.put("__av", string);
                                jSONObject.put("__vc", string2);
                                jSONObject2 = jSONObject;
                            } catch (SQLiteDatabaseCorruptException e2) {
                                cursor2 = a2;
                                try {
                                    h.a(d);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        try {
                                            sQLiteDatabase.endTransaction();
                                        } catch (Throwable th) {
                                        }
                                    }
                                    g.a(d).b();
                                    return jSONObject;
                                } catch (Throwable th2) {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        try {
                                            sQLiteDatabase.endTransaction();
                                        } catch (Throwable th3) {
                                        }
                                    }
                                    g.a(d).b();
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                cursor = a2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    try {
                                        sQLiteDatabase.endTransaction();
                                    } catch (Throwable th5) {
                                    }
                                }
                                g.a(d).b();
                                return jSONObject;
                            }
                        }
                    } catch (SQLiteDatabaseCorruptException e3) {
                        jSONObject = jSONObject2;
                    } catch (Throwable th6) {
                        jSONObject = jSONObject2;
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (a2 != null) {
                    a2.close();
                }
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th7) {
                    }
                }
                g.a(d).b();
                return jSONObject2;
            } catch (SQLiteDatabaseCorruptException e4) {
                jSONObject = null;
            } catch (Throwable th8) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException e5) {
            sQLiteDatabase = null;
            jSONObject = null;
        } catch (Throwable th9) {
            sQLiteDatabase = null;
            jSONObject = null;
        }
    }

    private JSONArray b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optLong("duration") > 0) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0254 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v0, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(org.json.JSONObject r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, org.json.JSONArray] */
    private String b(JSONObject jSONObject, boolean z) {
        String str;
        SQLiteDatabase sQLiteDatabase;
        ?? r0 = 0;
        r0 = null;
        r0 = null;
        r0 = null;
        String str2 = null;
        r0 = null;
        r0 = null;
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabase = g.a(d).a();
                try {
                    sQLiteDatabase.beginTransaction();
                    Cursor a2 = a(e.c.a, sQLiteDatabase, null, null, null, null, null, null, null);
                    if (a2 != null) {
                        try {
                            ?? jSONArray = new JSONArray();
                            while (a2.moveToNext()) {
                                JSONObject jSONObject2 = new JSONObject();
                                String string = a2.getString(a2.getColumnIndex("__e"));
                                str2 = a2.getString(a2.getColumnIndex("__ii"));
                                this.l.add(str2);
                                String string2 = a2.getString(a2.getColumnIndex("__sp"));
                                String string3 = a2.getString(a2.getColumnIndex("__pp"));
                                if (!TextUtils.isEmpty(string2)) {
                                    jSONObject2.put(d.au, new JSONObject(d(string2)));
                                }
                                if (!TextUtils.isEmpty(string3)) {
                                    jSONObject2.put(d.av, new JSONObject(d(string3)));
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    jSONObject2.put("id", str2);
                                    jSONObject2.put(d.p, string);
                                    if (jSONObject2.length() > 0) {
                                        jSONArray.put(jSONObject2);
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put(d.n, jSONArray);
                            }
                        } catch (SQLiteDatabaseCorruptException e2) {
                            str = str2;
                            cursor = a2;
                            h.a(d);
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Throwable th) {
                                }
                            }
                            g.a(d).b();
                            r0 = str;
                            return r0;
                        } catch (Throwable th2) {
                            str = str2;
                            cursor2 = a2;
                            h.a(d);
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Throwable th3) {
                                }
                            }
                            g.a(d).b();
                            r0 = str;
                            return r0;
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    if (a2 != null) {
                        a2.close();
                    }
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th4) {
                        }
                    }
                    g.a(d).b();
                    return str2;
                } catch (SQLiteDatabaseCorruptException e3) {
                    str = null;
                } catch (Throwable th5) {
                    str = null;
                }
            } catch (Throwable th6) {
                if (r0 != 0) {
                    r0.close();
                }
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th7) {
                    }
                }
                g.a(d).b();
                throw th6;
            }
        } catch (SQLiteDatabaseCorruptException e4) {
            str = null;
            sQLiteDatabase = null;
        } catch (Throwable th8) {
            str = null;
            sQLiteDatabase = null;
        }
    }

    public void a(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = g.a(d).a();
                sQLiteDatabase.beginTransaction();
                if (!z2) {
                    int size = this.l.size();
                    int i = 0;
                    if (size > 0) {
                        int i2 = 0;
                        while (i < size) {
                            String str = this.l.get(i);
                            if (str == null) {
                                i2 = 1;
                            }
                            sQLiteDatabase.execSQL("delete from __is where __ii=\"" + str + "\"");
                            i++;
                        }
                        i = i2;
                    }
                    if (i != 0) {
                        sQLiteDatabase.execSQL("delete from __is where __ii is null");
                    }
                } else if (z) {
                    sQLiteDatabase.execSQL("delete from __is");
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                    }
                }
            } catch (Throwable th2) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th3) {
                    }
                }
                g.a(d).b();
                throw th2;
            }
        } catch (SQLiteDatabaseCorruptException e2) {
            h.a(d);
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th4) {
                }
            }
            g.a(d).b();
        } catch (Throwable th5) {
            h.a(d);
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th6) {
                }
            }
            g.a(d).b();
        }
        g.a(d).b();
    }

    public void b(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = g.a(d).a();
            sQLiteDatabase.beginTransaction();
            if (z2) {
                if (z) {
                    sQLiteDatabase.execSQL("delete from __sd");
                }
            } else if (this.i.size() > 0) {
                for (int i = 0; i < this.i.size(); i++) {
                    sQLiteDatabase.execSQL("delete from __sd where __ii=\"" + this.i.get(i) + "\"");
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException e2) {
            try {
                h.a(d);
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                    }
                }
            } finally {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                    }
                }
                g.a(d).b();
            }
        } catch (Throwable th3) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th4) {
                }
            }
        }
    }

    public void h() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = g.a(d).a();
            sQLiteDatabase.beginTransaction();
            if (this.j.size() > 0) {
                for (int i = 0; i < this.j.size(); i++) {
                    sQLiteDatabase.execSQL("delete from __et where rowid=" + this.j.get(i));
                }
            }
            this.j.clear();
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException e2) {
            try {
                h.a(d);
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                    }
                }
            } finally {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                    }
                }
                g.a(d).b();
            }
        } catch (Throwable th3) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th4) {
                }
            }
        }
    }

    public void i() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = g.a(d).a();
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("delete from __er");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException e2) {
            try {
                h.a(d);
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                    }
                }
            } finally {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                    }
                }
                g.a(d).b();
            }
        } catch (Throwable th3) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th4) {
                }
            }
        }
    }

    public void j() {
        SQLiteDatabase sQLiteDatabase;
        if (!TextUtils.isEmpty(this.k)) {
            try {
                sQLiteDatabase = g.a(d).a();
                try {
                    sQLiteDatabase.beginTransaction();
                    sQLiteDatabase.execSQL("delete from __er where __i=\"" + this.k + "\"");
                    sQLiteDatabase.execSQL("delete from __et where __i=\"" + this.k + "\"");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLiteDatabaseCorruptException e2) {
                    try {
                        h.a(d);
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable th) {
                            }
                        }
                        this.k = null;
                    } finally {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable th2) {
                            }
                        }
                        g.a(d).b();
                    }
                } catch (Throwable th3) {
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th4) {
                        }
                    }
                    this.k = null;
                }
            } catch (SQLiteDatabaseCorruptException e3) {
                sQLiteDatabase = null;
            } catch (Throwable th5) {
                sQLiteDatabase = null;
            }
        }
        this.k = null;
    }

    public void a(boolean z, String str) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = g.a(d).a();
            sQLiteDatabase.beginTransaction();
            if (!TextUtils.isEmpty(str)) {
                sQLiteDatabase.execSQL("delete from __er where __i=\"" + str + "\"");
                sQLiteDatabase.execSQL("delete from __et where __i=\"" + str + "\"");
                this.j.clear();
                sQLiteDatabase.execSQL("delete from __sd where __ii=\"" + str + "\"");
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException e2) {
            try {
                h.a(d);
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                    }
                }
            } finally {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                    }
                }
                g.a(d).b();
            }
        } catch (Throwable th3) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th4) {
                }
            }
        }
    }

    public void b(String str) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = g.a(d).a();
            sQLiteDatabase.beginTransaction();
            if (!TextUtils.isEmpty(str)) {
                sQLiteDatabase.execSQL("delete from __is where __ii=\"" + str + "\"");
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteDatabaseCorruptException e2) {
            try {
                h.a(d);
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                    }
                }
            } finally {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                    }
                }
                g.a(d).b();
            }
        } catch (Throwable th3) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th4) {
                }
            }
        }
    }

    private void l() {
        try {
            if (TextUtils.isEmpty(e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(d, g);
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(d).getString(g, null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(d, g, multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String substring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < substring.length(); i++) {
                        char charAt = substring.charAt(i);
                        if (Character.isDigit(charAt)) {
                            if (Integer.parseInt(Character.toString(charAt)) == 0) {
                                sb.append(0);
                            } else {
                                sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                            }
                        } else {
                            sb.append(charAt);
                        }
                    }
                    e = sb.toString();
                }
                if (!TextUtils.isEmpty(e)) {
                    e += new StringBuilder(e).reverse().toString();
                    String multiProcessSP2 = UMUtils.getMultiProcessSP(d, h);
                    if (TextUtils.isEmpty(multiProcessSP2)) {
                        UMUtils.setMultiProcessSP(d, h, c(f));
                    } else if (!f.equals(d(multiProcessSP2))) {
                        b(true, false);
                        a(true, false);
                        h();
                        i();
                    }
                }
            }
        } catch (Throwable th) {
        }
    }

    public String c(String str) {
        try {
            if (!TextUtils.isEmpty(e)) {
                return Base64.encodeToString(DataHelper.encrypt(str.getBytes(), e.getBytes()), 0);
            }
            return str;
        } catch (Exception e2) {
            return null;
        }
    }

    public String d(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), e.getBytes()));
        } catch (Exception e2) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable th) {
                    return null;
                }
            }
            return null;
        }
    }
}
