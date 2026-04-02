package c.x.a.f;

import android.database.sqlite.SQLiteProgram;
/* loaded from: classes.dex */
public class e implements c.x.a.d {
    public final SQLiteProgram a;

    public e(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
