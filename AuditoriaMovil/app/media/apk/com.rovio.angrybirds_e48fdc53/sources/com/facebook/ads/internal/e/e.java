package com.facebook.ads.internal.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes2.dex */
public class e extends SQLiteOpenHelper {
    private final d a;

    public e(Context context, d dVar) {
        super(context, "ads.db", (SQLiteDatabase.CursorFactory) null, 4);
        if (dVar == null) {
            throw new IllegalArgumentException("AdDatabaseHelper can not be null");
        }
        this.a = dVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (g gVar : this.a.c()) {
            gVar.a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        g[] c;
        for (g gVar : this.a.c()) {
            gVar.b(sQLiteDatabase);
            gVar.a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 2 && i2 >= 3) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crashes");
        }
        if (i > 3 || i2 < 4) {
            return;
        }
        b bVar = c.i;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN " + bVar.b + " " + bVar.c + " DEFAULT 0");
    }
}
