package com.vungle.publisher;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.vungle.publisher.bw;
import com.vungle.publisher.log.Logger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class ci extends SQLiteOpenHelper {
    private static final String[] e = {com.umeng.analytics.pro.bg.aw, "placement", "ad_placement", "viewable", "archive_entry", "event_tracking", "ad_report", "ad_play", "ad_report_event", "event_tracking_http_log", "template_replacements", "errors"};
    @Inject
    qo a;
    @Inject
    qg b;
    @Inject
    com.vungle.publisher.env.n c;
    @Inject
    bw d;

    @Inject
    public ci(Context context) {
        super(context, "vungle", (SQLiteDatabase.CursorFactory) null, 23);
    }

    public void a() {
        c();
    }

    private void c() {
        this.d.a(cj.a(this), bw.b.databaseWrite);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void b() {
        Logger.d(Logger.DATABASE_TAG, "initializing database vungle");
        getWritableDatabase();
        Logger.d(Logger.DATABASE_TAG, "done initializing database vungle");
        this.b.a(new cm());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        HashSet hashSet = new HashSet(Arrays.asList(e));
        HashMap hashMap = new HashMap();
        Logger.d(Logger.DATABASE_TAG, "creating database: vungle");
        hashMap.put(com.umeng.analytics.pro.bg.aw, "CREATE TABLE ad (id STRING PRIMARY KEY, ad_token STRING, ad_token_hash STRING, advertising_app_vungle_id STRING, call_to_action_final_url STRING, call_to_action_url STRING, campaign_id STRING NOT NULL, status STRING NOT NULL, type STRING NOT NULL, delete_local_content_attempts INTEGER, expiration_timestamp_seconds INTEGER, parent_path STRING, prepare_retry_count INTEGER, received_timestamp_millis INTEGER, html_content STRING, requires_sideloading INTEGER, template_id STRING, insert_timestamp_millis INTEGER NOT NULL, update_timestamp_millis INTEGER NOT NULL, failed_timestamp_millis INTEGER NOT NULL, template_type STRING);");
        hashMap.put("placement", "CREATE TABLE placement (id STRING PRIMARY KEY, is_auto_cached INTEGER, is_incentivized INTEGER);");
        hashMap.put("ad_placement", "CREATE TABLE ad_placement (ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, placement_reference_id STRING NOT NULL REFERENCES placement(id) ON DELETE CASCADE ON UPDATE CASCADE,  PRIMARY KEY(ad_id, placement_reference_id));");
        hashMap.put("viewable", "CREATE TABLE viewable (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, type STRING NOT NULL, ad_type STRING NOT NULL, url STRING NOT NULL, status STRING NOT NULL, size INTEGER, extension STRING, name STRING, width INTEGER, height INTEGER, show_close_delay_incentivized_seconds INTEGER, show_close_delay_interstitial_seconds INTEGER, show_countdown_delay_seconds INTEGER, cta_clickable_percent REAL, enable_cta_delay_seconds INTEGER, is_cta_enabled INTEGER, is_cta_shown_on_touch INTEGER, show_cta_delay_seconds INTEGER, checksum STRING);");
        hashMap.put("archive_entry", "CREATE TABLE archive_entry (id INTEGER PRIMARY KEY AUTOINCREMENT, viewable_id INTEGER NOT NULL REFERENCES viewable(id) ON DELETE CASCADE ON UPDATE CASCADE, relative_path STRING NOT NULL, size INTEGER, CONSTRAINT archive_entry_viewable_id_path_uk UNIQUE (id, relative_path));");
        hashMap.put("event_tracking", "CREATE TABLE event_tracking (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, event INTEGER NOT NULL, url STRING NOT NULL);");
        hashMap.put("ad_report", "CREATE TABLE ad_report (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, incentivized_publisher_app_user_id STRING, is_incentivized INTEGER NOT NULL, placement_reference_id STRING, ad_token STRING, status STRING NOT NULL, video_duration_millis INTEGER, view_end_millis INTEGER, view_start_millis INTEGER, download_end_millis INTEGER, template_id STRING, insert_timestamp_millis INTEGER NOT NULL, update_timestamp_millis INTEGER NOT NULL, app_id STRING, ordinal_view_count INTEGER);");
        hashMap.put("ad_play", "CREATE TABLE ad_play (id INTEGER PRIMARY KEY AUTOINCREMENT, report_id INTEGER NOT NULL REFERENCES ad_report(id) ON DELETE CASCADE ON UPDATE CASCADE, start_millis INTEGER, watched_millis INTEGER);");
        hashMap.put("ad_report_event", "CREATE TABLE ad_report_event (id INTEGER PRIMARY KEY AUTOINCREMENT, play_id INTEGER NOT NULL REFERENCES ad_play(id) ON DELETE CASCADE ON UPDATE CASCADE, event STRING NOT NULL, insert_timestamp_millis INTEGER NOT NULL, value STRING);");
        hashMap.put("event_tracking_http_log", "CREATE TABLE event_tracking_http_log (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL, campaign_id STRING NOT NULL, event STRING NOT NULL, response_code INTEGER NOT NULL, response_timestamp_millis INTEGER, url STRING NOT NULL, insert_timestamp_millis INTEGER NOT NULL);");
        hashMap.put("template_replacements", "CREATE TABLE template_replacements (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, key STRING, value STRING);");
        hashMap.put("errors", "CREATE TABLE errors (id INTEGER PRIMARY KEY AUTOINCREMENT, report_id STRING NOT NULL REFERENCES ad_report(id) ON DELETE CASCADE ON UPDATE CASCADE, code STRING);");
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!hashSet.contains((String) entry.getKey())) {
                throw new RuntimeException("all created tables must be listed in the `ALL_TABLES` member");
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            String str = (String) entry2.getValue();
            Logger.d(Logger.DATABASE_TAG, "creating table: " + ((String) entry2.getKey()));
            Logger.v(Logger.DATABASE_TAG, str);
            sQLiteDatabase.execSQL(str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Logger.d(Logger.DATABASE_TAG, "downgrading databse version " + i + " --> " + i2);
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Logger.d(Logger.DATABASE_TAG, "upgrading database version " + i + " --> " + i2);
        a(sQLiteDatabase);
    }

    public int a(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        return getWritableDatabase().updateWithOnConflict(str, contentValues, str2, strArr, i);
    }

    public long a(String str, String str2, ContentValues contentValues) {
        return getWritableDatabase().insertOrThrow(str, str2, contentValues);
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return getReadableDatabase().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor a(hp hpVar) {
        return a(hpVar.a, hpVar.b, hpVar.c, hpVar.d, hpVar.e, hpVar.f, hpVar.g, hpVar.h);
    }

    void a(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
        this.a.a();
        onCreate(sQLiteDatabase);
    }

    void b(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        for (String str : e) {
            Logger.d(Logger.DATABASE_TAG, "dropping table: " + str);
            String str2 = "DROP TABLE  IF EXISTS " + str;
            Logger.v(Logger.DATABASE_TAG, str2);
            sQLiteDatabase.execSQL(str2);
        }
    }

    void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Logger.d(Logger.DATABASE_TAG, (z ? "enabling" : "disabling") + " foreign keys");
        sQLiteDatabase.execSQL("PRAGMA foreign_keys = " + z);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        a(sQLiteDatabase, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String... strArr) {
        String b = this.c.b();
        Logger.d(Logger.DATABASE_DUMP_TAG, b + " sdk version " + VunglePubBase.VERSION + ", database version 23");
        if (strArr == null || strArr.length < 1) {
            Logger.d(Logger.DATABASE_DUMP_TAG, b + " dumping all tables");
            strArr = e;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        for (String str : strArr) {
            Logger.i(Logger.DATABASE_DUMP_TAG, b + " dumping table " + str);
            Cursor query = readableDatabase.query(str, null, null, new String[0], null, null, null);
            StringBuilder sb = new StringBuilder();
            DatabaseUtils.dumpCursor(query, sb);
            Logger.d(Logger.DATABASE_DUMP_TAG, sb.toString());
        }
    }
}
