package com.kuaishou.weapon.p0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class t {
    private static t E = null;
    public static final String a = "k";
    public static final String b = "p";
    public static final String c = "v";
    public static final String d = "l";
    public static final String e = "i";
    public static final String f = "a";
    public static final String g = "s";
    public static final String h = "n";
    public static final String i = "u";
    public static final String j = "c";
    public static final String k = "r";
    public static final String l = "b";
    public static final String m = "m";
    public static final String n = "el";
    public static final String o = "ail";
    public static final String p = "aps";
    public static final String q = "dp";
    public static final String r = "pcn";
    public static final String s = "pst";
    public static final String t = "d";
    public static final String u = "at";
    public static final String v = "dm";
    public static final String w = "rm";
    public static final String x = "pc";
    public static final String y = "cbl";
    private a B;
    private SQLiteDatabase C;
    private Context D;
    private int z = 1;
    private String A = "create table wp(k INTEGER PRIMARY KEY ON CONFLICT ABORT,p TEXT UNIQUE ON CONFLICT ABORT,v TEXT,n INTEGER,s INTEGER,i INTEGER,u INTEGER,el INTEGER,c INTEGER,r INTEGER,aps INTEGER,dp TEXT,pcn TEXT,b TEXT,m TEXT,ail BLOB,pst INTEGER,d INTEGER,at INTEGER,dm TEXT,rm INTEGER,l TEXT,pc INTEGER DEFAULT -1,a TEXT,cbl INTEGER)";

    /* loaded from: classes.dex */
    class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, bh.p, (SQLiteDatabase.CursorFactory) null, t.this.z);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(t.this.A);
            } catch (Throwable th) {
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i >= 3 || i2 < 3) {
                return;
            }
            try {
                sQLiteDatabase.beginTransaction();
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE wp ADD COLUMN pc INTEGER  DEFAULT -1");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable th) {
                }
                sQLiteDatabase.endTransaction();
            } catch (Throwable th2) {
            }
        }
    }

    private t(Context context) {
        this.D = context.getApplicationContext();
        this.B = new a(context.getApplicationContext());
        try {
            if (context.getFilesDir().getParentFile().exists()) {
                this.C = this.B.getWritableDatabase();
            }
        } catch (Throwable th) {
        }
    }

    public static synchronized t a(Context context) {
        t tVar;
        synchronized (t.class) {
            if (E == null) {
                E = new t(context);
            }
            tVar = E;
        }
        return tVar;
    }

    public int a(int i2, int i3) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("u", Integer.valueOf(i3));
            SQLiteDatabase sQLiteDatabase = this.C;
            return sQLiteDatabase.update(bh.q, contentValues, "k=" + i2, null);
        } catch (Throwable th) {
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
    public long a(s sVar) {
        if (sVar == null) {
            return 0L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(h, Integer.valueOf(sVar.b));
        contentValues.put(p, Integer.valueOf(sVar.p));
        contentValues.put("p", sVar.c);
        contentValues.put("a", sVar.e);
        contentValues.put(d, sVar.h);
        contentValues.put("v", sVar.d);
        contentValues.put(q, sVar.n);
        contentValues.put("a", sVar.e);
        contentValues.put(r, sVar.o);
        contentValues.put(s, Long.valueOf(sVar.s));
        contentValues.put(w, Integer.valueOf(sVar.w));
        contentValues.put(u, Integer.valueOf(sVar.q));
        contentValues.put(x, Integer.valueOf(sVar.x));
        contentValues.put(y, Integer.valueOf(sVar.y ? 1 : 0));
        if (!TextUtils.isEmpty(sVar.j)) {
            contentValues.put(v, sVar.j);
        }
        try {
            if (!b(sVar.a)) {
                contentValues.put(a, Integer.valueOf(sVar.a));
                return this.C.insert(bh.q, null, contentValues);
            }
            SQLiteDatabase sQLiteDatabase = this.C;
            return sQLiteDatabase.update(bh.q, contentValues, "k=" + sVar.a, null);
        } catch (Throwable th) {
            return 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Throwable] */
    public s a(int i2) {
        s sVar;
        Cursor cursor = null;
        r0 = null;
        s sVar2 = null;
        try {
            Cursor query = this.C.query(bh.q, null, "k=" + i2, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        sVar = new s();
                        try {
                            sVar.a = i2;
                            sVar.b = query.getInt(query.getColumnIndex(h));
                            sVar.c = query.getString(query.getColumnIndex("p"));
                            sVar.e = query.getString(query.getColumnIndex("a"));
                            sVar.h = query.getString(query.getColumnIndex(d));
                            sVar.d = query.getString(query.getColumnIndex("v"));
                            sVar.n = query.getString(query.getColumnIndex(q));
                            sVar.p = query.getInt(query.getColumnIndex(p));
                            sVar.o = query.getString(query.getColumnIndex(r));
                            sVar.q = query.getInt(query.getColumnIndex(u));
                            sVar.s = query.getLong(query.getColumnIndex(s));
                            sVar.t = query.getInt(query.getColumnIndex(t));
                            sVar.w = query.getInt(query.getColumnIndex(w));
                            sVar.j = query.getString(query.getColumnIndex(v));
                            sVar.x = query.getInt(query.getColumnIndex(x));
                            boolean z = true;
                            if (query.getInt(query.getColumnIndex(y)) != 1) {
                                z = false;
                            }
                            sVar.y = z;
                            sVar2 = sVar;
                        } catch (Throwable th) {
                            cursor = query;
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return sVar;
                        }
                    }
                } catch (Throwable th2) {
                    sVar = null;
                }
            }
            if (query == null || query.isClosed()) {
                return sVar2;
            }
            query.close();
            return sVar2;
        } catch (Throwable th3) {
            sVar = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
        if (r1.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
        if (r1.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.kuaishou.weapon.p0.s> a() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r9.C     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = "wp"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto La4
        L15:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto La4
            com.kuaishou.weapon.p0.s r2 = new com.kuaishou.weapon.p0.s     // Catch: java.lang.Throwable -> La2
            r2.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "k"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.a = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "p"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.c = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "a"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.e = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "l"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.h = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "v"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La2
            r2.d = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "pst"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> La2
            r2.s = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "d"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.t = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "rm"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.w = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "pc"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r2.x = r3     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "cbl"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La2
            r4 = 1
            if (r3 != r4) goto L9a
            goto L9b
        L9a:
            r4 = 0
        L9b:
            r2.y = r4     // Catch: java.lang.Throwable -> La2
            r0.add(r2)     // Catch: java.lang.Throwable -> La2
            goto L15
        La2:
            r2 = move-exception
            goto Laf
        La4:
            if (r1 == 0) goto Lba
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto Lba
            goto Lb7
        Lad:
            r1 = move-exception
            r1 = 0
        Laf:
            if (r1 == 0) goto Lba
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto Lba
        Lb7:
            r1.close()
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.t.a():java.util.List");
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.C.delete(bh.q, "p=?", new String[]{str});
        } catch (Throwable th) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Throwable] */
    public s b(String str) {
        s sVar;
        Cursor cursor = null;
        r1 = null;
        s sVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            boolean z = true;
            Cursor query = this.C.query(bh.q, null, "p=?", new String[]{str}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        sVar = new s();
                        try {
                            sVar.a = query.getInt(query.getColumnIndex(a));
                            sVar.b = query.getInt(query.getColumnIndex(h));
                            sVar.c = query.getString(query.getColumnIndex("p"));
                            sVar.e = query.getString(query.getColumnIndex("a"));
                            sVar.h = query.getString(query.getColumnIndex(d));
                            sVar.d = query.getString(query.getColumnIndex("v"));
                            sVar.n = query.getString(query.getColumnIndex(q));
                            sVar.p = query.getInt(query.getColumnIndex(p));
                            sVar.o = query.getString(query.getColumnIndex(r));
                            sVar.q = query.getInt(query.getColumnIndex(u));
                            sVar.s = query.getLong(query.getColumnIndex(s));
                            sVar.t = query.getInt(query.getColumnIndex(t));
                            sVar.w = query.getInt(query.getColumnIndex(w));
                            sVar.j = query.getString(query.getColumnIndex(v));
                            sVar.x = query.getInt(query.getColumnIndex(x));
                            if (query.getInt(query.getColumnIndex(y)) != 1) {
                                z = false;
                            }
                            sVar.y = z;
                            sVar2 = sVar;
                        } catch (Throwable th) {
                            cursor = query;
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return sVar;
                        }
                    }
                } catch (Throwable th2) {
                    sVar = null;
                }
            }
            if (query == null || query.isClosed()) {
                return sVar2;
            }
            query.close();
            return sVar2;
        } catch (Throwable th3) {
            sVar = null;
        }
    }

    public void b() {
        ArrayList<s> arrayList = new ArrayList();
        for (s sVar : a()) {
            if (!dm.a(sVar.e)) {
                arrayList.add(sVar);
            }
        }
        try {
            r a2 = r.a();
            for (s sVar2 : arrayList) {
                if (a2 != null) {
                    a2.a(sVar2.e);
                }
                SQLiteDatabase sQLiteDatabase = this.C;
                sQLiteDatabase.delete(bh.q, "k=" + sVar2.a, null);
                if (r.b != null && !r.b.contains(Integer.valueOf(sVar2.a))) {
                    dm.c(this.D.getFilesDir().getCanonicalPath() + bh.j + sVar2.a);
                }
                if (a2.b() != null && a2.b().get(sVar2.c) != null) {
                    dm.c(this.D.getFileStreamPath(sVar2.c).getAbsolutePath());
                }
            }
        } catch (Throwable th) {
        }
    }

    public void b(int i2, int i3) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(h, Integer.valueOf(i3));
            SQLiteDatabase sQLiteDatabase = this.C;
            sQLiteDatabase.update(bh.q, contentValues, "k=" + i2, null);
        } catch (Throwable th) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r10.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r10.isClosed() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(int r10) {
        /*
            r9 = this;
            java.lang.String r1 = "wp"
            r8 = 0
            android.database.sqlite.SQLiteDatabase r0 = r9.C     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "p"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "k="
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            r3.append(r10)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3a
            if (r10 == 0) goto L2e
            int r0 = r10.getCount()     // Catch: java.lang.Throwable -> L2c
            if (r0 <= 0) goto L2e
            r0 = 1
            r8 = r0
            goto L2e
        L2c:
            r0 = move-exception
            goto L3c
        L2e:
            if (r10 == 0) goto L45
            boolean r0 = r10.isClosed()
            if (r0 != 0) goto L45
        L36:
            r10.close()
            goto L45
        L3a:
            r10 = move-exception
            r10 = 0
        L3c:
            if (r10 == 0) goto L45
            boolean r0 = r10.isClosed()
            if (r0 != 0) goto L45
            goto L36
        L45:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.t.b(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r11.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r11.isClosed() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = "n"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.C     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "wp"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r5.append(r11)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L41
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L41
            if (r11 == 0) goto L35
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L33
            int r0 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L33
            r1 = r0
            goto L35
        L33:
            r0 = move-exception
            goto L43
        L35:
            if (r11 == 0) goto L4c
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L4c
        L3d:
            r11.close()
            goto L4c
        L41:
            r11 = move-exception
            r11 = 0
        L43:
            if (r11 == 0) goto L4c
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L4c
            goto L3d
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.t.c(int):int");
    }

    public void c() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(h, (Integer) 0);
        try {
            this.C.update(bh.q, contentValues, "n=-1", null);
        } catch (Throwable th) {
        }
    }

    public void c(int i2, int i3) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(x, Integer.valueOf(i3));
            SQLiteDatabase sQLiteDatabase = this.C;
            sQLiteDatabase.update(bh.q, contentValues, "k=" + i2, null);
        } catch (Throwable th) {
        }
    }

    public void d() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("u", (Integer) 0);
        try {
            this.C.update(bh.q, contentValues, "u=1", null);
        } catch (Throwable th) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r11.isClosed() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r11.isClosed() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = "s"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.C     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "wp"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "k="
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L44
            r5.append(r11)     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L44
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L44
            if (r11 == 0) goto L38
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L38
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L36
            int r0 = r11.getInt(r0)     // Catch: java.lang.Throwable -> L36
            r2 = 1
            if (r0 != r2) goto L38
            r1 = r2
            goto L38
        L36:
            r0 = move-exception
            goto L46
        L38:
            if (r11 == 0) goto L4f
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L4f
        L40:
            r11.close()
            goto L4f
        L44:
            r11 = move-exception
            r11 = 0
        L46:
            if (r11 == 0) goto L4f
            boolean r0 = r11.isClosed()
            if (r0 != 0) goto L4f
            goto L40
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.t.d(int):boolean");
    }
}
