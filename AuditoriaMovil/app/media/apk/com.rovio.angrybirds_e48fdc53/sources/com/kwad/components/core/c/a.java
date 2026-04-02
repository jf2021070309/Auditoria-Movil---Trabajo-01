package com.kwad.components.core.c;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.kwad.sdk.KsAdSDKImpl;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class a {
    private static volatile a Il;
    private final SQLiteDatabase Ik;

    /* renamed from: com.kwad.components.core.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0186a extends SQLiteOpenHelper {
        private static int Im = 1;
        private String In;
        private String Io;

        public C0186a(Context context) {
            super(context, "ksadcache.db", (SQLiteDatabase.CursorFactory) null, Im);
            this.In = "CREATE TABLE IF NOT EXISTS ksad_ad_cache (creativeId VARCHAR PRIMARY KEY NOT NULL, posId TEXT, adJson TEXT, ecpm INTEGER, playAgainJson TEXT, adSenseJson TEXT, createTime INTEGER, expireTime INTEGER)";
            this.Io = "CREATE TABLE IF NOT EXISTS ksad_ad_cache_strategy(posId VARCHAR PRIMARY KEY NOT NULL, cacheSize INTEGER, cacheSecond INTEGER, strategyCode INTEGER, enable INTEGER)";
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(this.In);
            sQLiteDatabase.execSQL(this.Io);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private a(Context context) {
        this.Ik = new C0186a(context).getWritableDatabase();
    }

    private <T extends h> void b(List<T> list, String str) {
        try {
            try {
                this.Ik.beginTransaction();
                for (T t : list) {
                    try {
                        long insertWithOnConflict = this.Ik.insertWithOnConflict(str, null, t.mx(), 5);
                        com.kwad.sdk.core.e.c.d("AdCacheDBManager", "insertData: " + str + ", rowId: " + insertWithOnConflict);
                    } catch (Exception e) {
                        com.kwad.sdk.core.e.c.printStackTrace(e);
                    }
                }
                this.Ik.setTransactionSuccessful();
                SQLiteDatabase sQLiteDatabase = this.Ik;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e2) {
                        com.kwad.sdk.core.e.c.printStackTrace(e2);
                    }
                }
            } catch (Exception e3) {
                com.kwad.sdk.core.e.c.printStackTrace(e3);
                SQLiteDatabase sQLiteDatabase2 = this.Ik;
                if (sQLiteDatabase2 != null) {
                    try {
                        sQLiteDatabase2.endTransaction();
                    } catch (Exception e4) {
                        com.kwad.sdk.core.e.c.printStackTrace(e4);
                    }
                }
            }
        } catch (Throwable th) {
            SQLiteDatabase sQLiteDatabase3 = this.Ik;
            if (sQLiteDatabase3 != null) {
                try {
                    sQLiteDatabase3.endTransaction();
                } catch (Exception e5) {
                    com.kwad.sdk.core.e.c.printStackTrace(e5);
                }
            }
            throw th;
        }
    }

    public static a mk() {
        KsAdSDKImpl ksAdSDKImpl;
        if (Il == null) {
            synchronized (a.class) {
                if (Il == null && (ksAdSDKImpl = KsAdSDKImpl.get()) != null) {
                    try {
                        Il = new a(ksAdSDKImpl.getContext());
                    } catch (SQLiteException e) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                        Il = null;
                    }
                }
            }
        }
        return Il;
    }

    public final void a(e eVar) {
        b(Collections.singletonList(eVar), "ksad_ad_cache_strategy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    public final e ag(String str) {
        Throwable th;
        Cursor cursor;
        try {
            try {
                cursor = this.Ik.rawQuery("select  * from ksad_ad_cache_strategy where posId=?", new String[]{str});
                try {
                    List<e> a = e.a(cursor);
                    if (a != null && a.size() > 0) {
                        e eVar = a.get(0);
                        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                        return eVar;
                    }
                } catch (Exception e) {
                    e = e;
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) str);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) str);
            throw th;
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0093: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:35:0x0093 */
    public final List<g> b(String str, long j, int i) {
        Cursor cursor;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                cursor = this.Ik.rawQuery("select  * from ksad_ad_cache where posId=? order by createTime desc", new String[]{str});
                try {
                    List<g> a = g.a(cursor);
                    if (a == null) {
                        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("(posId = " + str + ") AND (");
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    for (g gVar : a) {
                        i2++;
                        if (i2 > i) {
                            sb.append(" creativeId = ");
                            sb.append(gVar.mF());
                            sb.append(i2 == a.size() ? ")" : " OR");
                        } else if (gVar.mD() >= j) {
                            arrayList.add(gVar);
                        }
                    }
                    if (i2 > i) {
                        this.Ik.delete("ksad_ad_cache", sb.toString(), new String[0]);
                    }
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return arrayList;
                } catch (Exception e) {
                    e = e;
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                com.kwad.sdk.crash.utils.b.closeQuietly(closeable2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            com.kwad.sdk.crash.utils.b.closeQuietly(closeable2);
            throw th;
        }
    }

    public final void g(List<g> list) {
        b(list, "ksad_ad_cache");
    }

    public final void ml() {
        try {
            this.Ik.delete("ksad_ad_cache", "expireTime<?", new String[]{String.valueOf(System.currentTimeMillis() / 1000)});
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    public final void o(long j) {
        try {
            int delete = this.Ik.delete("ksad_ad_cache", "creativeId=?", new String[]{String.valueOf(j)});
            com.kwad.sdk.core.e.c.d("AdCacheDBManager", "deleteCachedAdByCreativeId result: " + delete);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }
}
