package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.msdk.adapter.util.Logger;
/* loaded from: classes.dex */
public class j extends SQLiteOpenHelper {
    public j(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        Logger.d("DBHelper", "initDB........");
        sQLiteDatabase.execSQL(b.e());
        sQLiteDatabase.execSQL(b.d());
    }

    private void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL(b.c());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            sQLiteDatabase.execSQL(b.b());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            a(sQLiteDatabase);
        } catch (Throwable th) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            Logger.d("DBHelper", "onUpgrade....数据库版本升级.....");
            if (i == 1 || i == 2) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'show_freqctl';");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'show_pacing';");
            } else if (i != 3) {
                return;
            }
            sQLiteDatabase.execSQL(b.d());
            a(sQLiteDatabase, i, i2);
        } catch (Throwable th) {
        }
    }
}
