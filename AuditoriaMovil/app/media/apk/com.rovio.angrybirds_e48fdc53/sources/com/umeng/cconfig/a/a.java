package com.umeng.cconfig.a;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes3.dex */
public final class a extends SQLiteOpenHelper {
    private static Context b = null;
    private String a;

    /* renamed from: com.umeng.cconfig.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0319a {
        private static final a a = new a(a.b, (byte) 0);
    }

    private a(Context context) {
        super(context, "cc.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.a = null;
    }

    /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    public static a a(Context context) {
        if (b == null) {
            b = context.getApplicationContext();
        }
        return C0319a.a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.a = "create table if not exists __cc(id INTEGER primary key autoincrement, __ts TEXT, __c TEXT, __a TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __cc(id INTEGER primary key autoincrement, __ts TEXT, __c TEXT, __a TEXT)");
        } catch (SQLException e) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
