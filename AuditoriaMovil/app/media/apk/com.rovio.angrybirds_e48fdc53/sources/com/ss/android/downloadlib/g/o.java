package com.ss.android.downloadlib.g;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class o {
    private static volatile o ge;
    private SQLiteDatabase dr;

    public static o dr() {
        if (ge == null) {
            synchronized (o.class) {
                if (ge == null) {
                    ge = new o();
                }
            }
        }
        return ge;
    }

    private o() {
        try {
            this.dr = new ge(wb.getContext()).getWritableDatabase();
        } catch (Throwable th) {
            com.ss.android.downloadlib.q.o.dr().dr(th, "ClickEventHelper");
        }
    }

    public boolean ge() {
        return DownloadSetting.obtainGlobal().optInt("click_event_switch", 0) == 1;
    }

    public boolean o() {
        return DownloadSetting.obtainGlobal().optInt("click_event_switch", 0) == 2;
    }

    public void dr(long j, String str) {
        String optString;
        SQLiteDatabase sQLiteDatabase = this.dr;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || j <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            optString = new JSONObject(str).optString("req_id");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("ad_id", Long.valueOf(j));
        contentValues.put("req_id", optString);
        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
        this.dr.insert("click_event", null, contentValues);
        o(j, str);
    }

    public boolean ge(long j, String str) {
        SQLiteDatabase sQLiteDatabase = this.dr;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || j <= 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                String optString = new JSONObject(str).optString("req_id");
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                cursor = this.dr.query("click_event", ge.dr, "time > ? AND ad_id = ? AND req_id = ?", new String[]{String.valueOf(System.currentTimeMillis() - 1209600000), String.valueOf(j), optString}, null, null, null, null);
                boolean z = cursor.getCount() > 0;
                if (cursor != null) {
                    cursor.close();
                }
                return z;
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private void o(long j, String str) {
        SQLiteDatabase sQLiteDatabase = this.dr;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || j <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String optString = new JSONObject(str).optString("req_id");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            this.dr.delete("click_event", "time < ? AND ad_id = ? AND req_id = ?", new String[]{String.valueOf(System.currentTimeMillis() - 1209600000), String.valueOf(j), optString});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
