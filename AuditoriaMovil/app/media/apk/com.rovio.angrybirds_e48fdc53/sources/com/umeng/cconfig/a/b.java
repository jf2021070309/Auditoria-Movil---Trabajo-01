package com.umeng.cconfig.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.e;
import com.umeng.cconfig.b.d;
import com.umeng.commonsdk.statistics.common.ULog;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes3.dex */
public final class b {
    private static SQLiteOpenHelper c;
    private static Context d;
    public SQLiteDatabase a;
    private AtomicInteger b;

    /* loaded from: classes3.dex */
    static class a {
        private static final b a = new b((byte) 0);
    }

    private b() {
        this.b = new AtomicInteger();
    }

    /* synthetic */ b(byte b) {
        this();
    }

    public static b a(Context context) {
        if (d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            d = applicationContext;
            c = com.umeng.cconfig.a.a.a(applicationContext);
        }
        return a.a;
    }

    public final synchronized SQLiteDatabase a() {
        if (this.b.incrementAndGet() == 1) {
            this.a = c.getWritableDatabase();
        }
        return this.a;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:13:0x004c). Please submit an issue!!! */
    public final boolean a(String str) {
        try {
            try {
                a();
                this.a.beginTransaction();
                String str2 = "update  __cc set __a=\"1\" where __ts=\"" + str + "\"";
                ULog.i("jessie", "[DbManager] updateCloudConfigByTimestamp：".concat(String.valueOf(str2)));
                this.a.execSQL(str2);
                this.a.setTransactionSuccessful();
                SQLiteDatabase sQLiteDatabase = this.a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th) {
            }
        } catch (SQLiteDatabaseCorruptException e) {
            try {
                e.printStackTrace();
                try {
                    SQLiteDatabase sQLiteDatabase2 = this.a;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.endTransaction();
                    }
                } catch (Throwable th2) {
                }
                b();
                return false;
            } catch (Throwable th3) {
                try {
                    if (this.a != null) {
                        this.a.endTransaction();
                    }
                } catch (Throwable th4) {
                }
                b();
                throw th3;
            }
        } catch (Throwable th5) {
            SQLiteDatabase sQLiteDatabase3 = this.a;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.endTransaction();
            }
        }
        b();
        return true;
    }

    public final synchronized void b() {
        try {
            if (this.b.decrementAndGet() == 0) {
                this.a.close();
            }
        } catch (Throwable th) {
        }
    }

    public final boolean b(String str) {
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                a();
                this.a.beginTransaction();
                cursor = this.a.rawQuery("select *  from __cc where __a=\"1\" group by __ts", null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(cursor.getColumnIndex("__ts"));
                        String string2 = cursor.getString(cursor.getColumnIndex(e.d.a.d));
                        String string3 = cursor.getString(cursor.getColumnIndex("__a"));
                        String string4 = cursor.getString(cursor.getColumnIndex("id"));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(String.format("timeStamp = %s, content = %s, active = %s, id = %s", string, string2, string3, string4));
                        sb2.append("\n");
                        d dVar = new d();
                        dVar.a = string;
                        dVar.b = string2;
                        dVar.c = string3;
                        if (!TextUtils.isEmpty(string) && !str.equals(string)) {
                            arrayList.add(dVar);
                        }
                    }
                }
                int size = arrayList.size();
                String str2 = "";
                for (int i = 0; i < size; i++) {
                    d dVar2 = (d) arrayList.get(i);
                    if (i != size - 1) {
                        sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("__ts=\"");
                        sb.append(dVar2.a);
                        sb.append("\" or ");
                    } else {
                        sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("__ts=\"");
                        sb.append(dVar2.a);
                        sb.append("\"");
                    }
                    str2 = sb.toString();
                    String str3 = "update  __cc set __a=\"0\" where " + str2;
                    ULog.i("jessie", "[DbManager] updateOtherCloudConfigInfo : ".concat(String.valueOf(str3)));
                    this.a.execSQL(str3);
                    this.a.setTransactionSuccessful();
                }
                if (cursor != null) {
                    cursor.close();
                }
                SQLiteDatabase sQLiteDatabase = this.a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th) {
            }
        } catch (SQLiteDatabaseCorruptException e) {
            try {
                e.printStackTrace();
                if (cursor != null) {
                    try {
                    } catch (Throwable th2) {
                        return false;
                    }
                }
                return false;
            } finally {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th3) {
                        b();
                    }
                }
                SQLiteDatabase sQLiteDatabase2 = this.a;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.endTransaction();
                }
                b();
            }
        } catch (Throwable th4) {
            if (cursor != null) {
                cursor.close();
            }
            SQLiteDatabase sQLiteDatabase3 = this.a;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.endTransaction();
            }
        }
        b();
        return true;
    }

    public final d c() {
        Cursor rawQuery;
        d dVar = new d();
        Cursor cursor = null;
        try {
            try {
                a();
                this.a.beginTransaction();
                rawQuery = this.a.rawQuery("select *  from __cc where __a=\"1\" group by __ts", null);
            } catch (SQLiteDatabaseCorruptException e) {
                try {
                    e.printStackTrace();
                    if (0 != 0) {
                        cursor.close();
                    }
                    SQLiteDatabase sQLiteDatabase = this.a;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            cursor.close();
                        } catch (Throwable th2) {
                            b();
                            throw th;
                        }
                    }
                    SQLiteDatabase sQLiteDatabase2 = this.a;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.endTransaction();
                    }
                    b();
                    throw th;
                }
            } catch (Throwable th3) {
                if (0 != 0) {
                    cursor.close();
                }
                SQLiteDatabase sQLiteDatabase3 = this.a;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.endTransaction();
                }
            }
        } catch (Throwable th4) {
        }
        if (rawQuery == null || !rawQuery.moveToNext()) {
            this.a.setTransactionSuccessful();
            if (rawQuery != null) {
                rawQuery.close();
            }
            SQLiteDatabase sQLiteDatabase4 = this.a;
            if (sQLiteDatabase4 != null) {
                sQLiteDatabase4.endTransaction();
            }
            b();
            return dVar;
        }
        String string = rawQuery.getString(rawQuery.getColumnIndex("__ts"));
        String string2 = rawQuery.getString(rawQuery.getColumnIndex(e.d.a.d));
        String string3 = rawQuery.getString(rawQuery.getColumnIndex("__a"));
        String string4 = rawQuery.getString(rawQuery.getColumnIndex("id"));
        ULog.i("jessie", "[DbManager] selectRecentActiveOne".concat(String.valueOf(String.format("timeStamp = %s, content = %s, active = %s, id = %s", string, string2, string3, string4) + "\n")));
        d dVar2 = new d();
        dVar2.a = string;
        dVar2.b = string2;
        dVar2.c = string3;
        if (rawQuery != null) {
            try {
                rawQuery.close();
            } catch (Throwable th5) {
            }
        }
        SQLiteDatabase sQLiteDatabase5 = this.a;
        if (sQLiteDatabase5 != null) {
            sQLiteDatabase5.endTransaction();
        }
        b();
        return dVar2;
    }

    public final boolean d() {
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                a();
                this.a.beginTransaction();
                cursor = this.a.rawQuery("select *  from __cc where __a=\"0\" order by __ts asc", null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        arrayList.add(cursor.getString(cursor.getColumnIndex("__ts")));
                    }
                }
                int size = arrayList.size() - 5;
                String str = "";
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        if (i != size - 1) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("__ts=\"");
                            sb.append((String) arrayList.get(i));
                            sb.append("\" or ");
                        } else {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("__ts=\"");
                            sb.append((String) arrayList.get(i));
                            sb.append("\"");
                        }
                        str = sb.toString();
                    }
                    String str2 = "delete from __cc where " + str;
                    ULog.i("jessie", "[DbManager] deleteExtraCloudConfigInfo: ".concat(String.valueOf(str2)));
                    this.a.execSQL(str2);
                    this.a.setTransactionSuccessful();
                }
                if (cursor != null) {
                    cursor.close();
                }
                SQLiteDatabase sQLiteDatabase = this.a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th) {
            }
        } catch (SQLiteDatabaseCorruptException e) {
            try {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                SQLiteDatabase sQLiteDatabase2 = this.a;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.endTransaction();
                }
            } catch (Throwable th2) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th3) {
                        b();
                        throw th2;
                    }
                }
                SQLiteDatabase sQLiteDatabase3 = this.a;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.endTransaction();
                }
                b();
                throw th2;
            }
        } catch (Throwable th4) {
            if (cursor != null) {
                cursor.close();
            }
            SQLiteDatabase sQLiteDatabase4 = this.a;
            if (sQLiteDatabase4 != null) {
                sQLiteDatabase4.endTransaction();
            }
        }
        b();
        return false;
    }

    public final d e() {
        d dVar = new d();
        Cursor cursor = null;
        try {
            try {
                a();
                this.a.beginTransaction();
                cursor = this.a.rawQuery("select *  from __cc order by __ts desc", null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(cursor.getColumnIndex("__ts"));
                        String string2 = cursor.getString(cursor.getColumnIndex(e.d.a.d));
                        String string3 = cursor.getString(cursor.getColumnIndex("__a"));
                        String string4 = cursor.getString(cursor.getColumnIndex("id"));
                        ULog.i("jessie", "[DbManager] getLastestConfigInfo".concat(String.valueOf(String.format("timeStamp = %s, content = %s, active = %s, id = %s", string, string2, string3, string4) + "\n")));
                        dVar.a = string;
                        dVar.b = string2;
                        dVar.c = string3;
                        if (string != null) {
                            return dVar;
                        }
                    }
                }
                this.a.setTransactionSuccessful();
                if (cursor != null) {
                    cursor.close();
                }
                SQLiteDatabase sQLiteDatabase = this.a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th) {
            }
        } catch (SQLiteDatabaseCorruptException e) {
            try {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                SQLiteDatabase sQLiteDatabase2 = this.a;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.endTransaction();
                }
            } finally {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th2) {
                        b();
                    }
                }
                SQLiteDatabase sQLiteDatabase3 = this.a;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.endTransaction();
                }
                b();
            }
        } catch (Throwable th3) {
            if (cursor != null) {
                cursor.close();
            }
            SQLiteDatabase sQLiteDatabase4 = this.a;
            if (sQLiteDatabase4 != null) {
                sQLiteDatabase4.endTransaction();
            }
        }
        b();
        return dVar;
    }
}
