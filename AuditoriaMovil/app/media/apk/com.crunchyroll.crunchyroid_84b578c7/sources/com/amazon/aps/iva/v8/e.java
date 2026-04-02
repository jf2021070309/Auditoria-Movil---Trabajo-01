package com.amazon.aps.iva.v8;

import android.database.sqlite.SQLiteStatement;
/* compiled from: FrameworkSQLiteStatement.java */
/* loaded from: classes.dex */
public final class e extends d {
    public final SQLiteStatement c;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.c = sQLiteStatement;
    }

    public final int k() {
        return this.c.executeUpdateDelete();
    }
}
