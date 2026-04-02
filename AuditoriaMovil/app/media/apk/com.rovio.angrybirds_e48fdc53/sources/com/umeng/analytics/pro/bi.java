package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.debug.UMRTLog;
/* compiled from: CacheDBHelper.java */
/* loaded from: classes3.dex */
public class bi extends SQLiteOpenHelper {
    private static final Object b = new Object();
    private static bi c = null;
    private static final String d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";
    private static final String e = "DROP TABLE IF EXISTS stf";
    private static final String f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";
    private final Context a;

    public static bi a(Context context) {
        bi biVar;
        synchronized (b) {
            if (c == null) {
                c = new bi(context, bk.b, null, 1);
            }
            biVar = c;
        }
        return biVar;
    }

    private bi(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.a = context;
    }

    public static final int a() {
        return 1;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(e);
            sQLiteDatabase.execSQL(d);
        } catch (SQLException e2) {
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(d);
        } catch (SQLiteDatabaseCorruptException e2) {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]创建二级缓存数据库失败: " + th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && writableDatabase.isOpen()) {
                writableDatabase.close();
            }
        } catch (Throwable th) {
        }
    }

    public void a(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && writableDatabase.isOpen()) {
                writableDatabase.beginTransaction();
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]插入二级缓存数据记录 成功。");
                if (writableDatabase != null) {
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                }
            }
        } catch (Throwable th) {
        }
    }

    public void a(String str, String str2, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && writableDatabase.isOpen()) {
                writableDatabase.beginTransaction();
                writableDatabase.delete(str, str2, strArr);
                writableDatabase.setTransactionSuccessful();
                if (writableDatabase != null) {
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                }
            }
        } catch (Throwable th) {
        }
    }

    private void d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && writableDatabase.isOpen()) {
                try {
                    writableDatabase.execSQL(f);
                    if (writableDatabase == null) {
                        return;
                    }
                } catch (Throwable th) {
                    if (writableDatabase == null) {
                        return;
                    }
                }
                writableDatabase.close();
            }
        } catch (Throwable th2) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    public bj a(String str) {
        bj bjVar;
        Cursor cursor = null;
        r10 = null;
        bj bjVar2 = null;
        try {
            Cursor a = a(str, new String[]{bk.i, bk.e, bk.f, bk.g, bk.j, bk.k}, null, null, null, null, null, "1");
            if (a != null) {
                try {
                    if (a.moveToFirst()) {
                        bjVar = new bj();
                        try {
                            bjVar.a = a.getString(0);
                            bjVar.b = a.getString(1);
                            String string = a.getString(2);
                            String string2 = a.getString(3);
                            bjVar.c = i.a(this.a).d(string);
                            bjVar.d = i.a(this.a).d(string2);
                            bjVar.e = a.getString(4);
                            bjVar.f = a.getString(5);
                            bjVar2 = bjVar;
                        } catch (Throwable th) {
                            cursor = a;
                            try {
                                d();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return bjVar;
                            } catch (Throwable th2) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    bjVar = null;
                }
            }
            if (a != null) {
                a.close();
                return bjVar2;
            }
            return bjVar2;
        } catch (Throwable th4) {
            bjVar = null;
        }
    }

    public void a(String str, String str2) {
        a(str, "_uuid=?", new String[]{str2});
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return null;
            }
            return writableDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        } catch (Throwable th) {
            return null;
        }
    }

    public boolean b(String str) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            if (sQLiteDatabase != null) {
                try {
                    if (sQLiteDatabase.isOpen()) {
                        cursor = sQLiteDatabase.query(str, null, null, null, null, null, null, null);
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase == null) {
                        return false;
                    }
                    sQLiteDatabase.close();
                    return false;
                }
            }
            if (cursor != null) {
                if (cursor.getCount() > 0) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return true;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabase == null) {
                return false;
            }
        } catch (Throwable th2) {
            sQLiteDatabase = null;
        }
        sQLiteDatabase.close();
        return false;
    }

    public boolean c() {
        if (!b(bk.c)) {
            return true;
        }
        return false;
    }
}
