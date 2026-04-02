package com.amazon.aps.iva.v8;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
/* compiled from: FrameworkSQLiteProgram.java */
/* loaded from: classes.dex */
public class d implements Closeable {
    public final SQLiteProgram b;

    public d(SQLiteProgram sQLiteProgram) {
        this.b = sQLiteProgram;
    }

    public final void a(int i, byte[] bArr) {
        this.b.bindBlob(i, bArr);
    }

    public final void c(double d, int i) {
        this.b.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    public final void f(int i, long j) {
        this.b.bindLong(i, j);
    }

    public final void h(int i) {
        this.b.bindNull(i);
    }

    public final void i(int i, String str) {
        this.b.bindString(i, str);
    }
}
