package com.facebook.ads.internal.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import java.util.UUID;
/* loaded from: classes2.dex */
public class h extends g {
    public static final b a = new b(0, "token_id", "TEXT PRIMARY KEY");
    public static final b b = new b(1, "token", "TEXT");
    public static final b[] c = {a, b};
    private static final String d = h.class.getSimpleName();
    private static final String e = a("tokens", c);
    private static final String f = a("tokens", c, b);
    private static final String g = "DELETE FROM tokens WHERE NOT EXISTS (SELECT 1 FROM events WHERE tokens." + a.b + " = " + com.umeng.analytics.pro.d.ar + "." + c.b.b + ")";

    public h(d dVar) {
        super(dVar);
    }

    @Override // com.facebook.ads.internal.e.g
    public String a() {
        return "tokens";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        Cursor cursor;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid token.");
        }
        try {
            cursor = f().rawQuery(f, new String[]{str});
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            String string = cursor.moveToNext() ? cursor.getString(a.a) : null;
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(a.b, string);
                contentValues.put(b.b, str);
                f().insertOrThrow("tokens", null, contentValues);
                if (cursor != null) {
                    cursor.close();
                }
            } else if (cursor != null) {
                cursor.close();
            }
            return string;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.internal.e.g
    public b[] b() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cursor c() {
        return f().rawQuery(e, null);
    }

    public void d() {
        try {
            f().execSQL(g);
        } catch (SQLException e2) {
        }
    }
}
