package com.kwad.sdk.core.videocache.d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.kwad.sdk.core.videocache.m;
import com.kwad.sdk.utils.ao;
/* loaded from: classes.dex */
final class a extends SQLiteOpenHelper implements b {
    private static final String[] axj = {"_id", "url", "length", "mime"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        ao.checkNotNull(context);
    }

    private static ContentValues a(m mVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", mVar.url);
        contentValues.put("length", Long.valueOf(mVar.axd));
        contentValues.put("mime", mVar.axe);
        return contentValues;
    }

    private static m i(Cursor cursor) {
        return new m(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
    }

    @Override // com.kwad.sdk.core.videocache.d.b
    public final void a(String str, m mVar) {
        ao.e(str, mVar);
        boolean z = dW(str) != null;
        ContentValues a = a(mVar);
        if (z) {
            getWritableDatabase().update("SourceInfo", a, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, a);
        }
    }

    @Override // com.kwad.sdk.core.videocache.d.b
    public final m dW(String str) {
        Throwable th;
        Cursor cursor;
        ao.fF(str);
        m mVar = null;
        try {
            cursor = getReadableDatabase().query("SourceInfo", axj, "url=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        mVar = i(cursor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    throw th;
                }
            }
            com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
            return mVar;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ao.checkNotNull(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }
}
