package com.amazon.aps.iva.m6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.t5.g0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DefaultDownloadIndex.java */
/* loaded from: classes.dex */
public final class a implements v {
    public static final String d = m(3, 4);
    public static final String[] e = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    public final com.amazon.aps.iva.v5.b a;
    public final Object b = new Object();
    public boolean c;

    /* compiled from: DefaultDownloadIndex.java */
    /* renamed from: com.amazon.aps.iva.m6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0503a implements Closeable {
        public final Cursor b;

        public C0503a(Cursor cursor) {
            this.b = cursor;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.b.close();
        }
    }

    public a(com.amazon.aps.iva.v5.b bVar) {
        this.a = bVar;
    }

    public static ArrayList i(String str) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i = g0.a;
        for (String str2 : str.split(",", -1)) {
            String[] split = str2.split("\\.", -1);
            if (split.length == 3) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
            arrayList.add(new p0(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
        }
        return arrayList;
    }

    public static c k(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        int i = 0;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        ArrayList i2 = i(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        m mVar = new m(string, parse, string3, i2, blob, cursor.getString(4), cursor.getBlob(5));
        l lVar = new l();
        lVar.a = cursor.getLong(13);
        lVar.b = cursor.getFloat(12);
        int i3 = cursor.getInt(6);
        if (i3 == 4) {
            i = cursor.getInt(11);
        }
        return new c(mVar, i3, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i, lVar);
    }

    public static c l(Cursor cursor) {
        String str;
        int i = 0;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if ("ss".equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        m mVar = new m(string, parse, str, i(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        l lVar = new l();
        lVar.a = cursor.getLong(13);
        lVar.b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        if (i2 == 4) {
            i = cursor.getInt(11);
        }
        return new c(mVar, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i, lVar);
    }

    public static String m(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.m6.v
    public final C0503a a(int... iArr) throws com.amazon.aps.iva.v5.a {
        j();
        try {
            return new C0503a(this.a.getReadableDatabase().query("ExoPlayerDownloads", e, m(iArr), null, null, null, "start_time_ms ASC"));
        } catch (SQLiteException e2) {
            throw new com.amazon.aps.iva.v5.a(e2);
        }
    }

    @Override // com.amazon.aps.iva.m6.v
    public final c b(String str) throws com.amazon.aps.iva.v5.a {
        j();
        try {
            try {
                Cursor query = this.a.getReadableDatabase().query("ExoPlayerDownloads", e, "id = ?", new String[]{str}, null, null, "start_time_ms ASC");
                if (query.getCount() == 0) {
                    query.close();
                    return null;
                }
                query.moveToNext();
                c k = k(query);
                query.close();
                return k;
            } catch (SQLiteException e2) {
                throw new com.amazon.aps.iva.v5.a(e2);
            }
        } catch (SQLiteException e3) {
            throw new com.amazon.aps.iva.v5.a(e3);
        }
    }

    @Override // com.amazon.aps.iva.m6.v
    public final void c(c cVar) throws com.amazon.aps.iva.v5.a {
        j();
        try {
            o(cVar, this.a.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new com.amazon.aps.iva.v5.a(e2);
        }
    }

    @Override // com.amazon.aps.iva.m6.v
    public final void d(int i) throws com.amazon.aps.iva.v5.a {
        j();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, d, null);
        } catch (SQLException e2) {
            throw new com.amazon.aps.iva.v5.a(e2);
        }
    }

    @Override // com.amazon.aps.iva.m6.v
    public final void e() throws com.amazon.aps.iva.v5.a {
        j();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e2) {
            throw new com.amazon.aps.iva.v5.a(e2);
        }
    }

    @Override // com.amazon.aps.iva.m6.v
    public final void f(int i, String str) throws com.amazon.aps.iva.v5.a {
        j();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.update("ExoPlayerDownloads", contentValues, d + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new com.amazon.aps.iva.v5.a(e2);
        }
    }

    @Override // com.amazon.aps.iva.m6.v
    public final void g() throws com.amazon.aps.iva.v5.a {
        j();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e2) {
            throw new com.amazon.aps.iva.v5.a(e2);
        }
    }

    @Override // com.amazon.aps.iva.m6.v
    public final void h(String str) throws com.amazon.aps.iva.v5.a {
        j();
        try {
            this.a.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str});
        } catch (SQLiteException e2) {
            throw new com.amazon.aps.iva.v5.a(e2);
        }
    }

    public final void j() throws com.amazon.aps.iva.v5.a {
        ArrayList<c> arrayList;
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            try {
                int a = com.amazon.aps.iva.v5.d.a(this.a.getReadableDatabase(), 0, "");
                if (a != 3) {
                    SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        com.amazon.aps.iva.v5.d.b(writableDatabase, 0, "", 3);
                        if (a == 2) {
                            arrayList = n(writableDatabase);
                        } else {
                            arrayList = new ArrayList();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        for (c cVar : arrayList) {
                            o(cVar, writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.c = true;
            } catch (SQLException e2) {
                throw new com.amazon.aps.iva.v5.a(e2);
            }
        }
    }

    public final ArrayList n(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!g0.b0(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(l(query));
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        query.close();
        return arrayList;
    }

    public final void o(c cVar, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = cVar.a.f;
        if (bArr == null) {
            bArr = g0.e;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", cVar.a.b);
        contentValues.put("mime_type", cVar.a.d);
        contentValues.put("uri", cVar.a.c.toString());
        List<p0> list = cVar.a.e;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            p0 p0Var = list.get(i);
            sb.append(p0Var.b);
            sb.append('.');
            sb.append(p0Var.c);
            sb.append('.');
            sb.append(p0Var.d);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", cVar.a.g);
        contentValues.put("data", cVar.a.h);
        contentValues.put("state", Integer.valueOf(cVar.b));
        contentValues.put("start_time_ms", Long.valueOf(cVar.c));
        contentValues.put("update_time_ms", Long.valueOf(cVar.d));
        contentValues.put("content_length", Long.valueOf(cVar.e));
        contentValues.put("stop_reason", Integer.valueOf(cVar.f));
        contentValues.put("failure_reason", Integer.valueOf(cVar.g));
        contentValues.put("percent_downloaded", Float.valueOf(cVar.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(cVar.h.a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }
}
