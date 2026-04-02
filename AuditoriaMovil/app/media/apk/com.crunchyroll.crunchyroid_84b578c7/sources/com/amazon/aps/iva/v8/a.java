package com.amazon.aps.iva.v8;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import com.amazon.aps.iva.u1.n;
import java.io.IOException;
/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.u8.a {
    public static final String[] c = new String[0];
    public final SQLiteDatabase b;

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: com.amazon.aps.iva.v8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0787a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ com.amazon.aps.iva.u8.c a;

        public C0787a(com.amazon.aps.iva.u8.c cVar) {
            this.a = cVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    public final void a() {
        this.b.beginTransaction();
    }

    public final void c() {
        this.b.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    public final void f(String str) throws SQLException {
        this.b.execSQL(str);
    }

    public final Cursor h(com.amazon.aps.iva.u8.c cVar) {
        return this.b.rawQueryWithFactory(new C0787a(cVar), cVar.c(), c, null);
    }

    public final Cursor i(String str) {
        return h(new n(str));
    }

    public final void k() {
        this.b.setTransactionSuccessful();
    }
}
