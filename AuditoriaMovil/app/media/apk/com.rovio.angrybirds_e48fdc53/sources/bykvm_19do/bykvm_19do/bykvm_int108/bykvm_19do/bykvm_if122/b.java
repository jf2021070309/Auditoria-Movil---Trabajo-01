package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes.dex */
public class b extends SQLiteOpenHelper {
    public b(Context context) {
        super(context, "npth_m_log.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        new bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.bykvm_if122.b().a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
