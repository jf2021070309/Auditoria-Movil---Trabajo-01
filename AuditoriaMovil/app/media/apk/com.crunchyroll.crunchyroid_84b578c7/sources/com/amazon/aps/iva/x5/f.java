package com.amazon.aps.iva.x5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Set;
/* compiled from: CacheFileMetadataIndex.java */
/* loaded from: classes.dex */
public final class f {
    public static final String[] c = {AppMeasurementSdk.ConditionalUserProperty.NAME, "length", "last_touch_timestamp"};
    public final com.amazon.aps.iva.v5.b a;
    public String b;

    public f(com.amazon.aps.iva.v5.b bVar) {
        this.a = bVar;
    }

    public final HashMap a() throws com.amazon.aps.iva.v5.a {
        try {
            this.b.getClass();
            Cursor query = this.a.getReadableDatabase().query(this.b, c, null, null, null, null, null);
            HashMap hashMap = new HashMap(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(0);
                string.getClass();
                hashMap.put(string, new e(query.getLong(1), query.getLong(2)));
            }
            query.close();
            return hashMap;
        } catch (SQLException e) {
            throw new com.amazon.aps.iva.v5.a(e);
        }
    }

    public final void b(long j) throws com.amazon.aps.iva.v5.a {
        com.amazon.aps.iva.v5.b bVar = this.a;
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata" + hexString;
            if (com.amazon.aps.iva.v5.d.a(bVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                com.amazon.aps.iva.v5.d.b(writableDatabase, 2, hexString, 1);
                String str = this.b;
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                writableDatabase.execSQL("CREATE TABLE " + this.b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new com.amazon.aps.iva.v5.a(e);
        }
    }

    public final void c(Set<String> set) throws com.amazon.aps.iva.v5.a {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (String str : set) {
                writableDatabase.delete(this.b, "name = ?", new String[]{str});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new com.amazon.aps.iva.v5.a(e);
        }
    }

    public final void d(long j, long j2, String str) throws com.amazon.aps.iva.v5.a {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.b, null, contentValues);
        } catch (SQLException e) {
            throw new com.amazon.aps.iva.v5.a(e);
        }
    }
}
