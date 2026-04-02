package bykvm_19do.bykvm_19do.bykvm_19do;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import bolts.MeasurementEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class v {
    private static int d;
    static final HashMap<String, u> e = new HashMap<>();
    private final j2 a;
    private final k2 b;
    private final a c;

    /* loaded from: classes.dex */
    static class a extends SQLiteOpenHelper {
        a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (u uVar : v.e.values()) {
                        String c = uVar.c();
                        if (c != null) {
                            sQLiteDatabase.execSQL(c);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } finally {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                    }
                }
                sQLiteDatabase.endTransaction();
            } catch (Exception e) {
                l0.a(e);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            onUpgrade(sQLiteDatabase, i, i2);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:1|(5:2|3|(2:6|4)|7|8)|9|10|11|12|(1:(0))) */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onUpgrade, "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = r0.toString()
                r5 = 0
                bykvm_19do.bykvm_19do.bykvm_19do.l0.d(r4, r5)
                r3.beginTransaction()     // Catch: java.lang.Throwable -> L53
                java.util.HashMap<java.lang.String, bykvm_19do.bykvm_19do.bykvm_19do.u> r4 = bykvm_19do.bykvm_19do.bykvm_19do.v.e     // Catch: java.lang.Throwable -> L53
                java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L53
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L53
            L2a:
                boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L53
                if (r5 == 0) goto L4f
                java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L53
                bykvm_19do.bykvm_19do.bykvm_19do.u r5 = (bykvm_19do.bykvm_19do.bykvm_19do.u) r5     // Catch: java.lang.Throwable -> L53
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
                r0.<init>()     // Catch: java.lang.Throwable -> L53
                java.lang.String r1 = "DROP TABLE IF EXISTS "
                r0.append(r1)     // Catch: java.lang.Throwable -> L53
                java.lang.String r5 = r5.d()     // Catch: java.lang.Throwable -> L53
                r0.append(r5)     // Catch: java.lang.Throwable -> L53
                java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L53
                r3.execSQL(r5)     // Catch: java.lang.Throwable -> L53
                goto L2a
            L4f:
                r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L53
                goto L59
            L53:
                r4 = move-exception
                java.lang.String r5 = ""
                bykvm_19do.bykvm_19do.bykvm_19do.l0.c(r5, r4)     // Catch: java.lang.Throwable -> L65
            L59:
                r3.endTransaction()     // Catch: java.lang.Exception -> L5d
                goto L61
            L5d:
                r4 = move-exception
                bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r4)
            L61:
                r2.onCreate(r3)
                return
            L65:
                r4 = move-exception
                r3.endTransaction()     // Catch: java.lang.Exception -> L6a
                goto L6e
            L6a:
                r3 = move-exception
                bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r3)
            L6e:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.v.a.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
        }
    }

    static {
        r0 = "SELECT * FROM " + c0.o + " WHERE " + MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY + " =?  AND monitor_status=?";
        String str = "UPDATE " + c0.o + " SET monitor_num =? WHERE " + MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY + " =? AND monitor_status =?";
        String str2 = "SELECT * FROM " + c0.o + " WHERE date<? ORDER BY local_time_ms LIMIT ?";
        String str3 = "DELETE FROM " + c0.o + " WHERE local_time_ms <= ?";
        a(new b0());
        a(new w());
        a(new y(null, false, null));
        a(new z());
        a(new d0());
        a(new a0());
        a(new x("", new JSONObject()));
        a(new c0());
    }

    public v(Application application, k2 k2Var, j2 j2Var) {
        this.c = new a(application, "bd_embed_m_log.db", null, 29);
        this.b = k2Var;
        this.a = j2Var;
    }

    private int a(u[] uVarArr, int i, SQLiteDatabase sQLiteDatabase, String str, JSONArray[] jSONArrayArr) {
        int i2 = 0;
        while (i2 < i) {
            jSONArrayArr[i2] = null;
            i2++;
        }
        int i3 = 200;
        while (i3 > 0 && i2 < uVarArr.length) {
            jSONArrayArr[i2] = a(sQLiteDatabase, uVarArr[i2], str, i3);
            i3 -= jSONArrayArr[i2].length();
            if (i3 > 0) {
                i2++;
            }
        }
        return i2;
    }

    private String a(long j, int i) {
        return "UPDATE pack SET _fail=" + i + " WHERE local_time_ms=" + j;
    }

    private String a(u uVar, String str, int i) {
        return "SELECT * FROM " + uVar.d() + " WHERE session_id='" + str + "' ORDER BY local_time_ms LIMIT " + i;
    }

    private String a(u uVar, String str, long j) {
        return "DELETE FROM " + uVar.d() + " WHERE session_id='" + str + "' AND local_time_ms<=" + j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r13 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        bykvm_19do.bykvm_19do.bykvm_19do.l0.a("queryEvent, " + r11 + ", " + r1.length() + ", " + r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONArray a(android.database.sqlite.SQLiteDatabase r10, bykvm_19do.bykvm_19do.bykvm_19do.u r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r2 = 0
            r4 = 0
            java.lang.String r13 = r9.a(r11, r12, r13)     // Catch: java.lang.Throwable -> L5b
            android.database.Cursor r13 = r10.rawQuery(r13, r4)     // Catch: java.lang.Throwable -> L5b
            r5 = r2
        L13:
            boolean r7 = r13.moveToNext()     // Catch: java.lang.Throwable -> L58
            if (r7 == 0) goto L4a
            r11.a(r13)     // Catch: java.lang.Throwable -> L58
            boolean r7 = bykvm_19do.bykvm_19do.bykvm_19do.l0.a     // Catch: java.lang.Throwable -> L58
            if (r7 == 0) goto L3a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r7.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = "queryEvnetInner, "
            r7.append(r8)     // Catch: java.lang.Throwable -> L58
            r7.append(r12)     // Catch: java.lang.Throwable -> L58
            r7.append(r0)     // Catch: java.lang.Throwable -> L58
            r7.append(r11)     // Catch: java.lang.Throwable -> L58
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L58
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r7, r4)     // Catch: java.lang.Throwable -> L58
        L3a:
            org.json.JSONObject r7 = r11.f()     // Catch: java.lang.Throwable -> L58
            r1.put(r7)     // Catch: java.lang.Throwable -> L58
            long r7 = r11.a     // Catch: java.lang.Throwable -> L58
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 <= 0) goto L13
            long r5 = r11.a     // Catch: java.lang.Throwable -> L58
            goto L13
        L4a:
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L55
            java.lang.String r12 = r9.a(r11, r12, r5)     // Catch: java.lang.Throwable -> L58
            r10.execSQL(r12)     // Catch: java.lang.Throwable -> L58
        L55:
            if (r13 == 0) goto L66
            goto L63
        L58:
            r10 = move-exception
            r2 = r5
            goto L5d
        L5b:
            r10 = move-exception
            r13 = r4
        L5d:
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r10)     // Catch: java.lang.Throwable -> L8b
            r5 = r2
            if (r13 == 0) goto L66
        L63:
            r13.close()
        L66:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "queryEvent, "
            r10.append(r12)
            r10.append(r11)
            r10.append(r0)
            int r11 = r1.length()
            r10.append(r11)
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r10, r4)
            return r1
        L8b:
            r10 = move-exception
            if (r13 == 0) goto L91
            r13.close()
        L91:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.v.a(android.database.sqlite.SQLiteDatabase, bykvm_19do.bykvm_19do.bykvm_19do.u, java.lang.String, int):org.json.JSONArray");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r8 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r3.length() <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r5 <= 1000) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
        r5 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        r13.i = r5;
        r13.c = r12.c;
        r13.a = r12.a;
        r13.j = (r12.a + r5) / 1000;
        r13.b = bykvm_19do.bykvm_19do.bykvm_19do.b2.a(r11.a);
        r13.e = r12.e;
        r13.f = r12.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (bykvm_19do.bykvm_19do.bykvm_19do.l0.a == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
        bykvm_19do.bykvm_19do.bykvm_19do.l0.a("queryPage, " + r13 + ", " + r3.length(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONArray a(bykvm_19do.bykvm_19do.bykvm_19do.z r12, bykvm_19do.bykvm_19do.bykvm_19do.d0 r13, bykvm_19do.bykvm_19do.bykvm_19do.b0 r14, android.database.sqlite.SQLiteDatabase r15) {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = r12.c
            r4 = 0
            r2[r4] = r3
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r5 = 0
            r7 = 0
            java.lang.String r8 = "SELECT * FROM page WHERE session_id=? LIMIT 500"
            android.database.Cursor r8 = r15.rawQuery(r8, r2)     // Catch: java.lang.Throwable -> L5e
        L18:
            boolean r9 = r8.moveToNext()     // Catch: java.lang.Throwable -> L5c
            if (r9 == 0) goto L52
            r14.a(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r4 = bykvm_19do.bykvm_19do.bykvm_19do.l0.a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = "queryPageInner, "
            r4.append(r9)     // Catch: java.lang.Throwable -> L5c
            r4.append(r2)     // Catch: java.lang.Throwable -> L5c
            r4.append(r0)     // Catch: java.lang.Throwable -> L5c
            r4.append(r14)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5c
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r4, r7)     // Catch: java.lang.Throwable -> L5c
        L3f:
            boolean r4 = r14.j()     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L4d
            org.json.JSONObject r4 = r14.f()     // Catch: java.lang.Throwable -> L5c
            r3.put(r4)     // Catch: java.lang.Throwable -> L5c
            goto L50
        L4d:
            long r9 = r14.i     // Catch: java.lang.Throwable -> L5c
            long r5 = r5 + r9
        L50:
            r4 = r1
            goto L18
        L52:
            if (r4 == 0) goto L59
            java.lang.String r14 = "DELETE FROM page WHERE session_id=?"
            r15.execSQL(r14, r2)     // Catch: java.lang.Throwable -> L5c
        L59:
            if (r8 == 0) goto L68
            goto L65
        L5c:
            r14 = move-exception
            goto L60
        L5e:
            r14 = move-exception
            r8 = r7
        L60:
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r14)     // Catch: java.lang.Throwable -> Lb9
            if (r8 == 0) goto L68
        L65:
            r8.close()
        L68:
            int r14 = r3.length()
            if (r14 <= 0) goto L96
            r14 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r1 <= 0) goto L75
            goto L76
        L75:
            r5 = r14
        L76:
            r13.i = r5
            java.lang.String r1 = r12.c
            r13.c = r1
            long r1 = r12.a
            r13.a = r1
            long r1 = r12.a
            long r1 = r1 + r5
            long r1 = r1 / r14
            r13.j = r1
            bykvm_19do.bykvm_19do.bykvm_19do.j2 r14 = r11.a
            long r14 = bykvm_19do.bykvm_19do.bykvm_19do.b2.a(r14)
            r13.b = r14
            java.lang.String r14 = r12.e
            r13.e = r14
            java.lang.String r12 = r12.f
            r13.f = r12
        L96:
            boolean r12 = bykvm_19do.bykvm_19do.bykvm_19do.l0.a
            if (r12 == 0) goto Lb8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "queryPage, "
            r12.append(r14)
            r12.append(r13)
            r12.append(r0)
            int r13 = r3.length()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r12, r7)
        Lb8:
            return r3
        Lb9:
            r12 = move-exception
            if (r8 == 0) goto Lbf
            r8.close()
        Lbf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.v.a(bykvm_19do.bykvm_19do.bykvm_19do.z, bykvm_19do.bykvm_19do.bykvm_19do.d0, bykvm_19do.bykvm_19do.bykvm_19do.b0, android.database.sqlite.SQLiteDatabase):org.json.JSONArray");
    }

    private void a(a0 a0Var, HashMap<String, Integer> hashMap, boolean z) {
    }

    private static void a(u uVar) {
        e.put(uVar.d(), uVar);
    }

    private boolean a(z zVar, boolean z) {
        return !zVar.l && z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        bykvm_19do.bykvm_19do.bykvm_19do.l0.a("queryPack, " + r0.size() + ", " + r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r3 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<bykvm_19do.bykvm_19do.bykvm_19do.a0> a() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, bykvm_19do.bykvm_19do.bykvm_19do.u> r1 = bykvm_19do.bykvm_19do.bykvm_19do.v.e
            java.lang.String r2 = "pack"
            java.lang.Object r1 = r1.get(r2)
            bykvm_19do.bykvm_19do.bykvm_19do.a0 r1 = (bykvm_19do.bykvm_19do.bykvm_19do.a0) r1
            r2 = 0
            bykvm_19do.bykvm_19do.bykvm_19do.v$a r3 = r5.c     // Catch: java.lang.Throwable -> L34
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "SELECT * FROM pack ORDER BY local_time_ms DESC,_full DESC LIMIT 2"
            android.database.Cursor r3 = r3.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> L34
        L1c:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L2f
            bykvm_19do.bykvm_19do.bykvm_19do.u r1 = r1.clone()     // Catch: java.lang.Throwable -> L32
            bykvm_19do.bykvm_19do.bykvm_19do.a0 r1 = (bykvm_19do.bykvm_19do.bykvm_19do.a0) r1     // Catch: java.lang.Throwable -> L32
            r1.a(r3)     // Catch: java.lang.Throwable -> L32
            r0.add(r1)     // Catch: java.lang.Throwable -> L32
            goto L1c
        L2f:
            if (r3 == 0) goto L3e
            goto L3b
        L32:
            r1 = move-exception
            goto L36
        L34:
            r1 = move-exception
            r3 = r2
        L36:
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r1)     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L3e
        L3b:
            r3.close()
        L3e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "queryPack, "
            r1.append(r3)
            int r3 = r0.size()
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r1, r2)
            return r0
        L5f:
            r0 = move-exception
            if (r3 == 0) goto L65
            r3.close()
        L65:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.v.a():java.util.ArrayList");
    }

    public void a(ArrayList<u> arrayList) {
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        l0.a("save, " + arrayList.toString(), null);
        try {
            sQLiteDatabase = this.c.getWritableDatabase();
            try {
                sQLiteDatabase.beginTransaction();
                Iterator<u> it = arrayList.iterator();
                ContentValues contentValues = null;
                while (it.hasNext()) {
                    u next = it.next();
                    String d2 = next.d();
                    contentValues = next.b(contentValues);
                    sQLiteDatabase.insert(d2, null, contentValues);
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase == null) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    d += arrayList.size();
                    l0.a(th);
                    if (sQLiteDatabase == null) {
                        return;
                    }
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th3) {
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable th4) {
                            l0.a(th4);
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            sQLiteDatabase = null;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Throwable th6) {
            l0.a(th6);
        }
    }

    public void a(ArrayList<a0> arrayList, ArrayList<a0> arrayList2) {
        int i;
        SQLiteDatabase sQLiteDatabase = null;
        l0.a("setResult, " + arrayList + ", " + arrayList2, null);
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        HashMap<String, Integer> hashMap4 = new HashMap<>();
        HashMap<String, Integer> hashMap5 = new HashMap<>();
        if (arrayList != null && arrayList.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2).j == 0) {
                    a(arrayList.get(i2), hashMap, true);
                } else {
                    a(arrayList.get(i2), hashMap4, false);
                }
            }
        }
        Iterator<a0> it = arrayList2.iterator();
        while (it.hasNext()) {
            a0 next = it.next();
            if (next.j == 0) {
                HashMap<String, Integer> hashMap6 = (HashMap) hashMap2.get(Integer.valueOf(next.k));
                if (hashMap6 == null) {
                    hashMap6 = new HashMap<>();
                    hashMap2.put(Integer.valueOf(next.k), hashMap6);
                }
                a(next, hashMap6, false);
            } else if (i + 1 > 5) {
                a(next, hashMap3, false);
                arrayList.add(next);
                it.remove();
            } else {
                a(next, hashMap5, false);
            }
        }
        try {
            sQLiteDatabase = this.c.getWritableDatabase();
            sQLiteDatabase.beginTransaction();
            Iterator<a0> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sQLiteDatabase.execSQL("DELETE FROM pack WHERE local_time_ms=?", new String[]{String.valueOf(it2.next().a)});
            }
            Iterator<a0> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                a0 next2 = it3.next();
                long j = next2.a;
                int i3 = next2.j + 1;
                next2.j = i3;
                sQLiteDatabase.execSQL(a(j, i3));
            }
            sQLiteDatabase.setTransactionSuccessful();
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            try {
                l0.a(th);
                if (sQLiteDatabase == null) {
                    return;
                }
            } catch (Throwable th2) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e2) {
                        l0.a(e2);
                    }
                }
                throw th2;
            }
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e3) {
            l0.a(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0283 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb A[Catch: all -> 0x01ee, Exception -> 0x01f2, TryCatch #13 {Exception -> 0x01f2, all -> 0x01ee, blocks: (B:18:0x00b5, B:20:0x00bb, B:22:0x00c2, B:24:0x00c8, B:26:0x00cf, B:28:0x00de, B:30:0x00fb, B:31:0x0123), top: B:136:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8 A[Catch: all -> 0x01ee, Exception -> 0x01f2, TryCatch #13 {Exception -> 0x01f2, all -> 0x01ee, blocks: (B:18:0x00b5, B:20:0x00bb, B:22:0x00c2, B:24:0x00c8, B:26:0x00cf, B:28:0x00de, B:30:0x00fb, B:31:0x0123), top: B:136:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: all -> 0x01ee, Exception -> 0x01f2, TryCatch #13 {Exception -> 0x01f2, all -> 0x01ee, blocks: (B:18:0x00b5, B:20:0x00bb, B:22:0x00c2, B:24:0x00c8, B:26:0x00cf, B:28:0x00de, B:30:0x00fb, B:31:0x0123), top: B:136:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123 A[Catch: all -> 0x01ee, Exception -> 0x01f2, TRY_LEAVE, TryCatch #13 {Exception -> 0x01f2, all -> 0x01ee, blocks: (B:18:0x00b5, B:20:0x00bb, B:22:0x00c2, B:24:0x00c8, B:26:0x00cf, B:28:0x00de, B:30:0x00fb, B:31:0x0123), top: B:136:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018d A[Catch: all -> 0x01e6, Exception -> 0x01ea, TRY_LEAVE, TryCatch #15 {Exception -> 0x01ea, all -> 0x01e6, blocks: (B:34:0x0152, B:36:0x0156, B:40:0x016b, B:41:0x017f, B:44:0x018d, B:33:0x014f), top: B:132:0x0156 }] */
    /* JADX WARN: Type inference failed for: r45v1 */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r45v3 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Throwable, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(org.json.JSONObject r48) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.v.a(org.json.JSONObject):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
        if (r5[0].length() <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (r5[2].length() <= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
        if (r5[0].length() <= 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4 A[Catch: all -> 0x016d, Exception -> 0x016f, TRY_LEAVE, TryCatch #16 {Exception -> 0x016f, all -> 0x016d, blocks: (B:32:0x00b2, B:34:0x00c0, B:36:0x00c6, B:37:0x00e4, B:41:0x00f4, B:59:0x0142, B:66:0x015c), top: B:111:0x00b2 }] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(org.json.JSONObject r26, bykvm_19do.bykvm_19do.bykvm_19do.z r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.v.a(org.json.JSONObject, bykvm_19do.bykvm_19do.bykvm_19do.z, boolean):boolean");
    }
}
