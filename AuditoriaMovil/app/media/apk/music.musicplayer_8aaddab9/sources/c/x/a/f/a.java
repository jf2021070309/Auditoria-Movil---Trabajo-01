package c.x.a.f;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.io.IOException;
/* loaded from: classes.dex */
public class a implements c.x.a.b {
    public static final String[] a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public final SQLiteDatabase f2835b;

    /* renamed from: c.x.a.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0059a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ c.x.a.e a;

        public C0059a(a aVar, c.x.a.e eVar) {
            this.a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.f(new e(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f2835b = sQLiteDatabase;
    }

    public String a() {
        return this.f2835b.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2835b.close();
    }

    public Cursor f(c.x.a.e eVar) {
        return this.f2835b.rawQueryWithFactory(new C0059a(this, eVar), eVar.a(), a, null);
    }

    public Cursor h(String str) {
        return f(new c.x.a.a(str));
    }
}
