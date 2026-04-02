package com.amazon.aps.iva.v5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.aps.iva.q5.c0;
import com.amazon.aps.iva.t5.g0;
/* compiled from: VersionTable.java */
/* loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ int a = 0;

    static {
        c0.a("media3.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i, String str) throws a {
        try {
            if (!g0.b0(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
            if (query.getCount() == 0) {
                query.close();
                return -1;
            }
            query.moveToNext();
            int i2 = query.getInt(0);
            query.close();
            return i2;
        } catch (SQLException e) {
            throw new a(e);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws a {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new a(e);
        }
    }
}
