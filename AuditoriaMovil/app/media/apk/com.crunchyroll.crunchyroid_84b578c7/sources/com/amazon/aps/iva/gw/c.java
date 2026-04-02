package com.amazon.aps.iva.gw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
/* compiled from: KalturaSQLiteOpenHelper.kt */
/* loaded from: classes2.dex */
public final class c extends SQLiteOpenHelper {
    public c(Context context, File file) {
        super(context, file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        j.f(sQLiteDatabase, "db");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        j.f(sQLiteDatabase, "db");
    }
}
