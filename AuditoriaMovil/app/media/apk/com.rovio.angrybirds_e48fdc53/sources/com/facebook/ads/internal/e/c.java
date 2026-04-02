package com.facebook.ads.internal.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.facebook.share.internal.ShareConstants;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c extends g {
    public static final b a = new b(0, "event_id", "TEXT PRIMARY KEY");
    public static final b b = new b(1, "token_id", "TEXT REFERENCES tokens ON UPDATE CASCADE ON DELETE RESTRICT");
    public static final b c = new b(2, "priority", "INTEGER");
    public static final b d = new b(3, "type", "TEXT");
    public static final b e = new b(4, "time", "REAL");
    public static final b f = new b(5, "session_time", "REAL");
    public static final b g = new b(6, "session_id", "TEXT");
    public static final b h = new b(7, ShareConstants.WEB_DIALOG_PARAM_DATA, "TEXT");
    public static final b i = new b(8, "attempt", "INTEGER");
    public static final b[] j = {a, b, c, d, e, f, g, h, i};
    private static final String l = a(com.umeng.analytics.pro.d.ar, j);

    public c(d dVar) {
        super(dVar);
    }

    @Override // com.facebook.ads.internal.e.g
    public String a() {
        return com.umeng.analytics.pro.d.ar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, int i2, String str2, double d2, double d3, String str3, Map<String, String> map) {
        String uuid = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        contentValues.put(a.b, uuid);
        contentValues.put(b.b, str);
        contentValues.put(c.b, Integer.valueOf(i2));
        contentValues.put(d.b, str2);
        contentValues.put(e.b, Double.valueOf(d2));
        contentValues.put(f.b, Double.valueOf(d3));
        contentValues.put(g.b, str3);
        contentValues.put(h.b, map != null ? new JSONObject(map).toString() : null);
        contentValues.put(i.b, (Integer) 0);
        f().insertOrThrow(com.umeng.analytics.pro.d.ar, null, contentValues);
        return uuid;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        return f().delete(com.umeng.analytics.pro.d.ar, new StringBuilder().append(a.b).append(" = ?").toString(), new String[]{str}) > 0;
    }

    @Override // com.facebook.ads.internal.e.g
    public b[] b() {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cursor c() {
        return f().rawQuery("SELECT count(*) FROM events", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cursor d() {
        return f().rawQuery(l, null);
    }
}
