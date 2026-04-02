package e.h.b;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.provider.MediaStore;
import android.text.format.DateFormat;
import android.util.LongSparseArray;
import e.h.b.o;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.l0;
import e.h.g.r0;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.v0;
import e.h.g.x0;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes2.dex */
public class n {

    /* renamed from: b  reason: collision with root package name */
    public static SQLiteDatabase f8064b;

    /* renamed from: e  reason: collision with root package name */
    public static String f8067e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f8068f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f8069g;

    /* renamed from: h  reason: collision with root package name */
    public static final r0 f8070h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f8071i;
    public static final ReentrantLock a = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public static String f8065c = "_mdID";

    /* renamed from: d  reason: collision with root package name */
    public static int f8066d = -1;

    static {
        r0 r0Var = new r0();
        r0Var.h();
        f8070h = r0Var;
    }

    public static boolean A(String str) {
        try {
            f8064b.execSQL(str);
        } catch (SQLException e2) {
            x0.f8405d.A(e2);
            s1.l(e2, true);
        }
        return true;
    }

    public static Cursor B(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return C(str, strArr, str2, strArr2, null, null, str5, null);
    }

    public static Cursor C(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            SQLiteDatabase sQLiteDatabase = f8064b;
            if (sQLiteDatabase != null) {
                return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, null);
            }
        } catch (Exception e2) {
            x0.f8405d.A(e2);
            s1.l(e2, true);
        }
        return null;
    }

    public static void D(boolean z, boolean z2) {
        try {
            try {
                a(z, z2);
            } catch (SQLiteException unused) {
                a(z, z2);
            }
        } catch (Throwable th) {
            s1.l(th, true);
        }
    }

    public static boolean E(String str, ContentValues contentValues, String str2, String[] strArr) {
        try {
            SQLiteDatabase sQLiteDatabase = f8064b;
            if (sQLiteDatabase != null) {
                return ((long) sQLiteDatabase.update(str, contentValues, str2, strArr)) > 0;
            }
            return false;
        } catch (Exception e2) {
            x0.f8405d.A(e2);
            s1.l(e2, true);
            return false;
        }
    }

    public static void F(p pVar) {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            if (f8064b != null) {
                ContentValues a2 = pVar.a();
                E("playlist", a2, "_dum = " + pVar.f8081d, null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void G(ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        if (f8064b == null || arrayList.size() <= 0) {
            return;
        }
        f8064b.beginTransaction();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            try {
                q qVar = arrayList.get(i2);
                q qVar2 = arrayList2.get(i2);
                qVar2.f8085c = qVar.f8085c;
                E("song", qVar2.a(), "_dum = ?", new String[]{String.valueOf(qVar.f8085c)});
                f8064b.yieldIfContendedSafely();
            } finally {
                f8064b.endTransaction();
            }
        }
        f8064b.setTransactionSuccessful();
    }

    public static void a(boolean z, boolean z2) {
        f8068f = z;
        Object obj = j1.a;
        if (x0.f8405d == null) {
            return;
        }
        if (!v0.l()) {
            t1.i("Don't init without permission granted");
        } else if (!f8068f && !f8069g) {
            f8071i = true;
        } else {
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            try {
                long nanoTime = System.nanoTime();
                if (f8064b == null && (f8068f || f8069g)) {
                    h(true);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("INIT TIME: ");
                sb.append(((System.nanoTime() - nanoTime) / 1000000) + "ms");
                t1.i(sb.toString());
                reentrantLock.unlock();
                boolean z3 = false;
                if (z2 && f8070h.c() > 5) {
                    z3 = true;
                }
                if (!z3 && f8070h.b() > TimeUnit.HOURS.toMillis(1L)) {
                    z3 = true;
                }
                if (z3) {
                    long nanoTime2 = System.nanoTime();
                    reentrantLock.lock();
                    try {
                        if (f8064b != null) {
                            d();
                            m();
                        }
                        reentrantLock.unlock();
                        reentrantLock.lock();
                        try {
                            if (f8064b != null) {
                                l();
                            }
                            reentrantLock.unlock();
                            reentrantLock.lock();
                            try {
                                if (f8064b != null) {
                                    z();
                                }
                                l0.g().n("75903135-bf4c-476d-a9ee-236d5bbe09ba", f8066d);
                                if (f8067e != null) {
                                    l0.g().p("cc02f51a-99c8-4fe4-aa66-b5ab16cfd365", f8067e);
                                }
                                reentrantLock.unlock();
                                f8071i = true;
                                x();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("DB Sync = ");
                                sb2.append(((System.nanoTime() - nanoTime2) / 1000000) + "ms");
                                t1.i(sb2.toString());
                                f8070h.g();
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            reentrantLock.unlock();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
            } finally {
                try {
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
    }

    public static boolean b(boolean z, final ArrayList<Long> arrayList, long j2) {
        boolean z2;
        Object obj = j1.a;
        int i2 = 1;
        int i3 = 0;
        boolean z3 = j2 == -4;
        g(z, false);
        if (!f8068f && !z3) {
            boolean z4 = o.a(arrayList, j2) > 0;
            x();
            return z4;
        }
        String[] strArr = {"_id", "title", "artist", "album", "duration", "_data"};
        if (v0.d()) {
            strArr = new String[]{"_id", "title", "artist", "album", "duration", "_data", "relative_path", "_display_name"};
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        LongSparseArray longSparseArray = new LongSparseArray(arrayList.size());
        int i4 = 0;
        while (i4 < arrayList.size()) {
            StringBuilder y = e.a.d.a.a.y("_id IN (");
            int i5 = 0;
            for (int i6 = i4; i6 < arrayList.size() && i6 < i4 + 500; i6++) {
                if (arrayList.get(i6).longValue() != -1) {
                    if (i5 > 0) {
                        y.append(",");
                    }
                    y.append(arrayList.get(i6));
                    i5++;
                }
            }
            y.append(")");
            if (i5 != 0) {
                long nanoTime = System.nanoTime();
                Cursor n2 = o.n(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, y.toString(), null, null);
                StringBuilder y2 = e.a.d.a.a.y("Querying for database ids in ");
                y2.append(((System.nanoTime() - nanoTime) / 1000000) + "ms");
                t1.i(y2.toString());
                if (n2 != null) {
                    try {
                        if (n2.moveToFirst()) {
                            while (true) {
                                long j3 = n2.getLong(i3);
                                if (longSparseArray.get(j3) == null) {
                                    String string = n2.getString(i2);
                                    String string2 = n2.getString(2);
                                    String string3 = n2.getString(3);
                                    int i7 = n2.getInt(4);
                                    String string4 = v0.d() ? n2.getString(6) + n2.getString(7) : n2.getString(5);
                                    q qVar = new q();
                                    qVar.f8084b = j3;
                                    qVar.e(string);
                                    qVar.d(string2);
                                    qVar.c(string3);
                                    qVar.a = i7;
                                    qVar.f(string4);
                                    longSparseArray.put(j3, qVar);
                                }
                                if (!n2.moveToNext()) {
                                    break;
                                }
                                i2 = 1;
                                i3 = 0;
                            }
                        }
                    } finally {
                        n2.close();
                    }
                } else {
                    continue;
                }
            }
            i4 += 500;
            i2 = 1;
            i3 = 0;
        }
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            q qVar2 = (q) longSparseArray.get(it.next().longValue());
            if (qVar2 != null) {
                arrayList2.add(qVar2);
            }
        }
        k(arrayList2);
        final p o = o(j2);
        if (o == null && z3) {
            Object obj2 = j1.a;
            f8069g = true;
            try {
                ReentrantLock reentrantLock = a;
                reentrantLock.lock();
                q(f8068f);
                ContentValues contentValues = new ContentValues();
                contentValues.put("_pName", "x900929");
                contentValues.put("_pMDID", (Long) (-4L));
                contentValues.put("_pDM", Long.valueOf(System.currentTimeMillis() / 1000));
                contentValues.put("_pStatus", (Integer) 0);
                contentValues.put("_dum", (Long) (-4L));
                t("playlist", contentValues);
                reentrantLock.unlock();
            } catch (Throwable th) {
                s1.l(th, true);
            }
            o = o(j2);
        }
        if (o != null) {
            if (!z3) {
                j0.c(new j0.b() { // from class: e.h.b.b
                    @Override // e.h.g.j0.b
                    public final void a() {
                        o.a(arrayList, o.f8080c);
                    }
                });
            }
            ArrayList<q> s = s(j2);
            if (z3) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    q qVar3 = (q) it2.next();
                    if (qVar3 != null) {
                        Iterator<q> it3 = s.iterator();
                        while (it3.hasNext()) {
                            q next = it3.next();
                            if (next != null && next.f8084b == qVar3.f8084b) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        s.add(qVar3);
                    }
                }
            } else {
                s.addAll(arrayList2);
            }
            j(o, s);
            x();
            return true;
        }
        return false;
    }

    public static void c(q qVar) {
        if (f8064b != null) {
            qVar.f8084b = -1L;
            E("song", qVar.a(), "_dum = ?", new String[]{String.valueOf(qVar.f8085c)});
        }
    }

    public static void d() {
        int i2;
        long nanoTime = System.nanoTime();
        for (int i3 = 0; i3 < 3; i3++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Cursor n2 = o.n(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"title"}, "is_music = 1", null, "title_key");
                if (n2 != null) {
                    if (n2.moveToFirst()) {
                        i2 = 0;
                        do {
                            i2++;
                            String string = n2.getString(0);
                            if (string == null) {
                                string = "";
                            }
                            messageDigest.update(string.getBytes());
                        } while (n2.moveToNext());
                    } else {
                        i2 = 0;
                    }
                    n2.close();
                } else {
                    i2 = 0;
                }
                f8066d = i2;
                f8067e = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                break;
            } catch (Throwable unused) {
            }
        }
        StringBuilder y = e.a.d.a.a.y("DATABASE HASH TIME = ");
        y.append(((System.nanoTime() - nanoTime) / 1000000) + "ms");
        t1.i(y.toString());
    }

    public static void e(ArrayList<Long> arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator<Long> it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        f(jArr);
    }

    public static void f(long[] jArr) {
        Object obj = j1.a;
        if (f8068f) {
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            try {
                if (f8064b != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(f8065c);
                    sb.append(" in ( ");
                    String[] strArr = new String[jArr.length];
                    int i2 = 0;
                    for (long j2 : jArr) {
                        strArr[i2] = String.valueOf(j2);
                        if (i2 > 0) {
                            sb.append(" , ");
                        }
                        sb.append(" ?");
                        i2++;
                    }
                    sb.append(" ) ");
                    if (f8064b.delete("song", sb.toString(), strArr) > 0) {
                        x();
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                try {
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void g(boolean z, boolean z2) {
        if (f8064b == null) {
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            try {
                D(z, z2);
                reentrantLock.unlock();
            } catch (Throwable th) {
                try {
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void h(boolean z) {
        x0 x0Var = x0.f8405d;
        if (x0Var == null) {
            return;
        }
        File databasePath = x0Var.getDatabasePath("plist");
        if (databasePath == null) {
            t1.i("databaseFile is null");
        } else if (z || databasePath.exists()) {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(databasePath.getAbsolutePath(), null, 268435456);
            f8064b = openDatabase;
            if (openDatabase == null) {
                t1.i("database is null");
                return;
            }
            try {
                openDatabase.setLocale(Locale.getDefault());
            } catch (SQLiteException unused) {
                t1.i("can't collate for this language");
            }
            int version = f8064b.getVersion();
            if (version < 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("CREATE TABLE IF NOT EXISTS ");
                sb.append("playlist");
                sb.append(" ( ");
                sb.append("_dum");
                sb.append(" INTEGER PRIMARY KEY AUTOINCREMENT");
                sb.append(")");
                A(sb.toString());
                sb.setLength(0);
                sb.append("CREATE TABLE IF NOT EXISTS ");
                sb.append("song");
                e.a.d.a.a.M(sb, " ( ", "_dum", " INTEGER PRIMARY KEY AUTOINCREMENT", ")");
                sb.append("");
                A(sb.toString());
                sb.setLength(0);
                sb.append("CREATE TABLE IF NOT EXISTS ");
                sb.append("playlistM");
                sb.append(" ( ");
                sb.append("_dum");
                sb.append(" INTEGER PRIMARY KEY AUTOINCREMENT");
                sb.append(")");
                A(sb.toString());
                sb.setLength(0);
                sb.append("CREATE TABLE IF NOT EXISTS ");
                sb.append("favortiesM");
                sb.append(" ( ");
                sb.append("_dum");
                sb.append(" INTEGER PRIMARY KEY AUTOINCREMENT");
                sb.append(")");
                A(sb.toString());
                if (version < 1) {
                    A(" ALTER TABLE song ADD COLUMN _name TEXT COLLATE LOCALIZED");
                    A(" ALTER TABLE song ADD COLUMN _artist TEXT COLLATE LOCALIZED");
                    A(" ALTER TABLE song ADD COLUMN _album TEXT COLLATE LOCALIZED");
                    A(" ALTER TABLE song ADD COLUMN _duration INTEGER  DEFAULT 0");
                    A(" ALTER TABLE song ADD COLUMN " + f8065c + " INTEGER  DEFAULT 0");
                    A(" ALTER TABLE song ADD COLUMN _path TEXT COLLATE LOCALIZED");
                    A(" ALTER TABLE playlist ADD COLUMN _pName TEXT COLLATE LOCALIZED");
                    A(" ALTER TABLE playlist ADD COLUMN _pDM INTEGER  DEFAULT 0");
                    A(" ALTER TABLE playlist ADD COLUMN _pMDID INTEGER  DEFAULT 0");
                    A(" ALTER TABLE playlist ADD COLUMN _pStatus INTEGER  DEFAULT 0");
                    A(" ALTER TABLE playlistM ADD COLUMN _pID INTEGER  DEFAULT 0");
                    A(" ALTER TABLE playlistM ADD COLUMN _sID INTEGER  DEFAULT 0");
                    A(" ALTER TABLE playlistM ADD COLUMN _position INTEGER  DEFAULT 0");
                }
                f8064b.setVersion(1);
            }
        }
    }

    public static void i(p pVar, long j2) {
        Cursor B;
        if (j2 != -1) {
            pVar.f8081d = j2;
            E("playlist", pVar.a(), "_dum = ?", new String[]{String.valueOf(j2)});
        } else if (t("playlist", pVar.a()) <= 0 || (B = B("playlist", new String[]{"_dum", "_pName", "_pMDID", "_pDM"}, "_pMDID = ?", new String[]{String.valueOf(pVar.f8080c)}, null, null, null)) == null) {
        } else {
            try {
                if (B.moveToFirst()) {
                    pVar.f8081d = B.getLong(0);
                }
            } finally {
                B.close();
            }
        }
    }

    public static void j(p pVar, ArrayList<q> arrayList) {
        SQLiteDatabase sQLiteDatabase = f8064b;
        int i2 = 0;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.delete("playlistM", "_pID = ? ", new String[]{String.valueOf(pVar.f8081d)});
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<q> it = arrayList.iterator();
        while (it.hasNext()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_pID", Long.valueOf(pVar.f8081d));
            contentValues.put("_sID", Long.valueOf(it.next().f8085c));
            contentValues.put("_position", Integer.valueOf(i2));
            arrayList2.add(contentValues);
            i2++;
        }
        try {
            SQLiteDatabase sQLiteDatabase2 = f8064b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.beginTransaction();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    f8064b.insert("playlistM", null, (ContentValues) it2.next());
                    f8064b.yieldIfContendedSafely();
                }
                f8064b.setTransactionSuccessful();
                f8064b.endTransaction();
            }
        } catch (Exception e2) {
            x0.f8405d.A(e2);
            s1.l(e2, true);
        }
    }

    public static void k(ArrayList<q> arrayList) {
        Cursor B;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList2);
        for (int i2 = 0; i2 < arrayList2.size(); i2 += 50) {
            StringBuilder sb = new StringBuilder();
            sb.append(f8065c + " IN (");
            int i3 = 0;
            for (int i4 = i2; i4 < arrayList2.size() && i4 < i4 + 50; i4++) {
                if (i3 > 0) {
                    sb.append(",");
                }
                sb.append(((q) arrayList2.get(i4)).f8084b);
                i3++;
            }
            sb.append(")");
            if (i3 != 0 && (B = B("song", new String[]{f8065c, "_dum"}, sb.toString(), null, null, null, null)) != null) {
                try {
                    if (B.moveToFirst()) {
                        do {
                            long j2 = B.getLong(0);
                            long j3 = B.getLong(1);
                            int i5 = 0;
                            while (i5 < arrayList3.size()) {
                                q qVar = (q) arrayList3.get(i5);
                                if (qVar.f8084b == j2) {
                                    qVar.f8085c = j3;
                                    arrayList3.remove(i5);
                                    i5--;
                                }
                                i5++;
                            }
                        } while (B.moveToNext());
                    }
                } finally {
                    B.close();
                }
            }
        }
        if (arrayList3.size() > 0) {
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            try {
                SQLiteDatabase sQLiteDatabase = f8064b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.beginTransaction();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        q qVar2 = (q) it.next();
                        long insert = f8064b.insert("song", null, qVar2.a());
                        if (insert != -1) {
                            qVar2.f8085c = insert;
                        }
                        f8064b.yieldIfContendedSafely();
                    }
                    f8064b.setTransactionSuccessful();
                    f8064b.endTransaction();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                try {
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void l() {
        long j2;
        int i2;
        long j3;
        boolean z;
        Iterator it;
        long j4;
        long j5;
        boolean z2;
        p o;
        boolean z3;
        p o2;
        ArrayList<q> arrayList;
        Iterator<q> it2;
        boolean z4;
        boolean z5;
        ArrayList arrayList2 = new ArrayList();
        o.e(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(q(f8068f));
        ArrayList arrayList4 = new ArrayList(arrayList3);
        ArrayList arrayList5 = new ArrayList(arrayList2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j2 = -1;
            i2 = 1;
            if (i4 >= arrayList4.size()) {
                break;
            }
            p pVar = (p) arrayList4.get(i4);
            if (pVar.f8080c != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList5.size()) {
                        z5 = false;
                        break;
                    } else if (pVar.f8080c == ((p) arrayList5.get(i5)).f8080c) {
                        arrayList4.remove(i4);
                        arrayList5.remove(i5);
                        i4--;
                        z5 = true;
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z5) {
                    pVar.f8080c = -2L;
                }
            }
            i4++;
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            p pVar2 = (p) it3.next();
            int i6 = 0;
            while (i6 < arrayList5.size()) {
                p pVar3 = (p) arrayList5.get(i6);
                if (pVar3.f8083f.equals(pVar2.f8083f) && pVar3.f8079b == pVar2.f8079b) {
                    pVar2.f8080c = pVar3.f8080c;
                    arrayList5.remove(i6);
                    i6--;
                }
                i6++;
            }
            long j6 = pVar2.f8080c;
            if (j6 == -2) {
                pVar2.f8080c = -1L;
                F(pVar2);
            } else if (j6 != -1) {
                F(pVar2);
            }
        }
        long nanoTime = System.nanoTime();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            p pVar4 = (p) it4.next();
            long nanoTime2 = System.nanoTime();
            if (pVar4.f8079b >= i2) {
                StringBuilder y = e.a.d.a.a.y("Comparing msp = ");
                y.append(pVar4.f8083f);
                t1.i(y.toString());
                String[] strArr = new String[i2];
                strArr[i3] = String.valueOf(pVar4.f8080c);
                Cursor B = B("playlist", new String[]{"_dum", "_pName", "_pMDID", "_pDM"}, "_pMDID = ?", strArr, null, null, null);
                if (B != null) {
                    try {
                        if (B.moveToFirst()) {
                            long j7 = B.getLong(i3);
                            if (B.getLong(3) > pVar4.a) {
                                t1.i("Our date modified is later, skip");
                                z = false;
                                j3 = j7;
                            } else {
                                j3 = j7;
                            }
                        } else {
                            j3 = j2;
                        }
                        z = true;
                    } finally {
                        B.close();
                    }
                } else {
                    z = true;
                    j3 = j2;
                }
                if (z) {
                    r0 r0Var = new r0();
                    ArrayList<q> f2 = o.f(pVar4.f8080c);
                    if (j3 == j2 || (o = o(j3)) == null || o.f8079b < pVar4.f8079b) {
                        it = it4;
                        j4 = nanoTime;
                    } else {
                        ArrayList<q> s = s(j3);
                        Iterator<q> it5 = f2.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it5.hasNext()) {
                                it = it4;
                                j4 = nanoTime;
                                z3 = false;
                                break;
                            }
                            q next = it5.next();
                            it = it4;
                            while (true) {
                                if (i7 >= s.size()) {
                                    j4 = nanoTime;
                                    arrayList = s;
                                    it2 = it5;
                                    z4 = false;
                                    break;
                                }
                                arrayList = s;
                                it2 = it5;
                                j4 = nanoTime;
                                if (s.get(i7).f8084b == next.f8084b) {
                                    z4 = true;
                                    break;
                                }
                                i7++;
                                s = arrayList;
                                it5 = it2;
                                nanoTime = j4;
                            }
                            if (!z4) {
                                z3 = true;
                                break;
                            }
                            it4 = it;
                            s = arrayList;
                            it5 = it2;
                            nanoTime = j4;
                        }
                        if (!z3) {
                            ReentrantLock reentrantLock = a;
                            reentrantLock.lock();
                            try {
                                if (f8064b != null && (o2 = o(j3)) != null) {
                                    E("playlist", o2.a(), "_dum = " + j3, null);
                                }
                                reentrantLock.unlock();
                                z = false;
                            } catch (Throwable th) {
                                try {
                                    reentrantLock.unlock();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }
                    if (z) {
                        r0Var.g();
                        k(f2);
                        t1.i("ensureSongsInTable in " + r0Var.f());
                        r0Var.g();
                        if (j3 >= 0) {
                            i(pVar4, j3);
                            j5 = -1;
                        } else {
                            ArrayList<p> q = q(f8068f);
                            boolean z6 = false;
                            int i8 = 1;
                            for (boolean z7 = false; !z7; z7 = z2) {
                                Iterator<p> it6 = q.iterator();
                                z2 = true;
                                while (it6.hasNext()) {
                                    if (it6.next().f8083f.compareToIgnoreCase(pVar4.f8083f) == 0) {
                                        if (z6) {
                                            pVar4.b(pVar4.f8083f + " " + i8);
                                            i8++;
                                        } else {
                                            pVar4.b(pVar4.f8083f + " " + DateFormat.getDateFormat(x0.f8405d).format(new Date()));
                                            z6 = true;
                                        }
                                        z2 = false;
                                    }
                                }
                            }
                            j5 = -1;
                            i(pVar4, -1L);
                        }
                        StringBuilder y2 = e.a.d.a.a.y("ensurePlaylist in ");
                        y2.append(r0Var.f());
                        t1.i(y2.toString());
                        r0Var.g();
                        j(pVar4, f2);
                        t1.i("ensurePlaylistMember in " + r0Var.f());
                    } else {
                        j5 = -1;
                        t1.i("Inserting not needed");
                    }
                    j2 = j5;
                } else {
                    it = it4;
                    j4 = nanoTime;
                }
                StringBuilder y3 = e.a.d.a.a.y("Done importing playlist in ");
                y3.append(((System.nanoTime() - nanoTime2) / 1000000) + "ms");
                t1.i(y3.toString());
                i3 = 0;
                i2 = 1;
                it4 = it;
                nanoTime = j4;
            }
        }
        long j8 = nanoTime;
        StringBuilder y4 = e.a.d.a.a.y("Fetched all media store playlists in ");
        y4.append(((System.nanoTime() - j8) / 1000000) + "ms");
        t1.i(y4.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m() {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.b.n.m():void");
    }

    public static q n(long j2) {
        q qVar;
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            if (f8064b != null) {
                int i2 = 6;
                int i3 = 5;
                Cursor C = C("song", new String[]{f8065c, "_name", "_artist", "_album", "_duration", "_path", "_dum"}, f8065c + " = " + j2, null, null, null, null, null);
                if (C != null) {
                    if (C.moveToFirst()) {
                        while (true) {
                            long j3 = C.getLong(0);
                            String string = C.getString(1);
                            String string2 = C.getString(2);
                            String string3 = C.getString(3);
                            int i4 = C.getInt(4);
                            String string4 = C.getString(i3);
                            int i5 = C.getInt(i2);
                            qVar = new q();
                            qVar.f8084b = j3;
                            qVar.e(string);
                            qVar.d(string2);
                            qVar.c(string3);
                            qVar.a = i4;
                            qVar.f(string4);
                            qVar.f8085c = i5;
                            if (!C.moveToNext()) {
                                break;
                            }
                            i3 = 5;
                            i2 = 6;
                        }
                    } else {
                        qVar = null;
                    }
                    C.close();
                    reentrantLock.unlock();
                    return qVar;
                }
            }
            qVar = null;
            reentrantLock.unlock();
            return qVar;
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static p o(long j2) {
        if (f8068f || j2 == -4) {
            if (j2 == -4) {
                f8069g = true;
            }
            p pVar = null;
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            try {
                if (f8064b != null) {
                    Cursor B = B("playlist", new String[]{"_pName", "_pDM", "_pMDID", "_dum", "_pStatus"}, "_dum = " + j2, null, null, null, null);
                    if (B != null) {
                        if (B.moveToFirst()) {
                            do {
                                pVar = new p();
                                pVar.b(B.getString(0));
                                pVar.a = B.getLong(1);
                                pVar.f8080c = B.getLong(2);
                                pVar.f8081d = B.getLong(3);
                                pVar.f8082e = B.getInt(4);
                            } while (B.moveToNext());
                            B.close();
                        } else {
                            B.close();
                        }
                    }
                    if (pVar != null) {
                        pVar.f8079b = p(j2);
                    }
                }
                reentrantLock.unlock();
                return pVar;
            } catch (Throwable th) {
                try {
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return o.d(j2);
    }

    public static int p(long j2) {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            if (f8064b != null) {
                Cursor rawQuery = f8064b.rawQuery("SELECT _pID , count(*) FROM playlistM , song WHERE _sID = song._dum AND _pID = " + j2 + " GROUP BY _pID", null);
                if (rawQuery != null) {
                    r5 = rawQuery.moveToFirst() ? rawQuery.getInt(1) : -1;
                    rawQuery.close();
                }
            }
            reentrantLock.unlock();
            return r5;
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static ArrayList<p> q(boolean z) {
        Object obj = j1.a;
        if (!z) {
            o.b bVar = o.a;
            ArrayList<p> arrayList = new ArrayList<>();
            o.e(arrayList);
            return arrayList;
        }
        g(z, false);
        ArrayList<p> arrayList2 = new ArrayList<>();
        try {
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            if (f8064b != null) {
                Cursor B = B("playlist", new String[]{"_dum", "_pMDID", "_pDM", "_pName", "_pStatus"}, null, null, null, null, "_pName");
                if (B != null) {
                    try {
                        if (B.moveToFirst()) {
                            do {
                                p pVar = new p();
                                long j2 = B.getLong(0);
                                pVar.f8081d = j2;
                                if (j2 != -4) {
                                    pVar.f8080c = B.getLong(1);
                                    pVar.a = B.getLong(2);
                                    pVar.b(B.getString(3));
                                    int i2 = B.getInt(4);
                                    pVar.f8082e = i2;
                                    if (i2 == 0) {
                                        arrayList2.add(pVar);
                                    }
                                }
                            } while (B.moveToNext());
                            B.close();
                        } else {
                            B.close();
                        }
                    } catch (Throwable th) {
                        B.close();
                        throw th;
                    }
                }
                Cursor rawQuery = f8064b.rawQuery("SELECT _pID , count(*) FROM playlistM , song WHERE _sID = song._dum AND " + f8065c + " IS NOT -1  GROUP BY _pID", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.moveToFirst()) {
                            do {
                                long j3 = rawQuery.getLong(0);
                                if (j3 != -4) {
                                    int i3 = rawQuery.getInt(1);
                                    Iterator<p> it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        p next = it.next();
                                        if (next.f8081d == j3) {
                                            next.f8079b = i3;
                                        }
                                    }
                                }
                            } while (rawQuery.moveToNext());
                            rawQuery.close();
                        } else {
                            rawQuery.close();
                        }
                    } catch (Throwable th2) {
                        rawQuery.close();
                        throw th2;
                    }
                }
            }
            reentrantLock.unlock();
        } catch (SQLiteException e2) {
            s1.l(e2, true);
        }
        return arrayList2;
    }

    public static ArrayList<Integer> r(long j2, long j3) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        Cursor C = C("playlistM", new String[]{"_position"}, "_sID = " + j3 + " AND _pID = " + j2, null, null, null, null, null);
        if (C != null) {
            try {
                if (C.moveToFirst()) {
                    do {
                        arrayList.add(Integer.valueOf(C.getInt(0)));
                    } while (C.moveToNext());
                }
            } finally {
                C.close();
            }
        }
        return arrayList;
    }

    public static ArrayList<q> s(long j2) {
        Object obj = j1.a;
        boolean z = j2 == -4;
        if (z) {
            f8069g = true;
        }
        if (f8068f || z) {
            ArrayList<q> arrayList = new ArrayList<>();
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            try {
                if (f8064b != null) {
                    Cursor rawQuery = f8064b.rawQuery("SELECT _sID , " + f8065c + " , _name , _artist , _album , _duration , _path FROM song , playlistM WHERE _sID = song._dum AND _pID = " + j2 + " ORDER BY _position", null);
                    if (rawQuery != null) {
                        if (rawQuery.moveToFirst()) {
                            do {
                                long j3 = rawQuery.getLong(0);
                                long j4 = rawQuery.getLong(1);
                                String string = rawQuery.getString(2);
                                String string2 = rawQuery.getString(3);
                                String string3 = rawQuery.getString(4);
                                int i2 = rawQuery.getInt(5);
                                String string4 = rawQuery.getString(6);
                                q qVar = new q();
                                qVar.f8085c = j3;
                                qVar.f8084b = j4;
                                qVar.e(string);
                                qVar.d(string2);
                                qVar.c(string3);
                                qVar.a = i2;
                                qVar.f(string4);
                                arrayList.add(qVar);
                            } while (rawQuery.moveToNext());
                            rawQuery.close();
                        } else {
                            rawQuery.close();
                        }
                    }
                }
                reentrantLock.unlock();
                return arrayList;
            } catch (Throwable th) {
                try {
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return o.f(j2);
    }

    public static long t(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabase = f8064b;
            if (sQLiteDatabase != null) {
                return sQLiteDatabase.insert(str, null, contentValues);
            }
        } catch (Exception e2) {
            x0.f8405d.A(e2);
            s1.l(e2, true);
        }
        return -1L;
    }

    public static boolean u(boolean z, long j2) {
        Object obj = j1.a;
        f8069g = true;
        boolean z2 = false;
        g(z, false);
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            if (f8064b != null) {
                Cursor rawQuery = f8064b.rawQuery("SELECT _sID FROM song , playlistM WHERE _sID = song._dum AND _pID = -4 AND song." + f8065c + " = " + j2 + " ORDER BY _position", null);
                if (rawQuery != null) {
                    z2 = rawQuery.moveToFirst();
                    rawQuery.close();
                }
            }
            reentrantLock.unlock();
            return z2;
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int v(q qVar, q qVar2) {
        if (qVar.f8084b == qVar2.f8084b && qVar.a == qVar2.a) {
            String b2 = qVar.b();
            String b3 = qVar2.b();
            if (qVar.f8088f.equals(qVar2.f8088f) || b2.equals(b3)) {
                return (qVar.f8088f.equals(qVar2.f8088f) && qVar.f8087e.equals(qVar2.f8087e) && qVar.f8086d.equals(qVar2.f8086d) && qVar.f8089g.equals(qVar2.f8089g)) ? 2 : 1;
            }
        }
        return 0;
    }

    public static void w(long j2, final long j3, final int i2, final long j4, final int i3) {
        int abs;
        int abs2;
        Object obj = j1.a;
        if (!f8068f) {
            o.i(j2, j3, i2, j4, i3);
            x();
            return;
        }
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            if (f8064b != null) {
                if (j3 != -1 && j4 != -1) {
                    q n2 = n(j3);
                    q n3 = n(j4);
                    if (n2 != null && n3 != null) {
                        ArrayList<q> s = s(j2);
                        int i4 = 0;
                        int i5 = 100000;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 100000;
                        int i9 = -1;
                        while (true) {
                            if (i7 >= s.size()) {
                                i7 = i9;
                                break;
                            }
                            if (s.get(i7).f8085c == n2.f8085c && (abs2 = Math.abs(i2 - i7)) < i8) {
                                if (abs2 == 0) {
                                    break;
                                }
                                i9 = i7;
                                i8 = abs2;
                            }
                            i7++;
                        }
                        while (true) {
                            if (i4 >= s.size()) {
                                i4 = i6;
                                break;
                            }
                            if (s.get(i4).f8085c == n3.f8085c && (abs = Math.abs(i3 - i4)) < i5) {
                                if (abs == 0) {
                                    break;
                                }
                                i6 = i4;
                                i5 = abs;
                            }
                            i4++;
                        }
                        if (i7 >= 0 && i4 >= 0) {
                            if (i7 > i4) {
                                s.remove(i7);
                                s.add(i4, n2);
                            } else {
                                s.add(i4 + 1, n2);
                                s.remove(i7);
                            }
                            final p o = o(j2);
                            if (o != null) {
                                j0.c(new j0.b() { // from class: e.h.b.c
                                    @Override // e.h.g.j0.b
                                    public final void a() {
                                        p pVar = p.this;
                                        o.i(pVar.f8080c, j3, i2, j4, i3);
                                    }
                                });
                                j(o, s);
                            }
                        }
                    }
                    reentrantLock.unlock();
                    return;
                }
                ArrayList<q> s2 = s(j2);
                if (i2 < s2.size() && i3 < s2.size()) {
                    if (i2 > i3) {
                        s2.add(i3, s2.remove(i2));
                    } else {
                        s2.add(i3 + 1, s2.get(i2));
                        s2.remove(i2);
                    }
                    final p o2 = o(j2);
                    if (o2 != null) {
                        j0.c(new j0.b() { // from class: e.h.b.f
                            @Override // e.h.g.j0.b
                            public final void a() {
                                p pVar = p.this;
                                o.i(pVar.f8080c, j3, i2, j4, i3);
                            }
                        });
                        j(o2, s2);
                    }
                }
                x();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void x() {
        try {
            Intent intent = new Intent("OUR_PLAYLISTS_UPDATED");
            intent.setPackage(x0.f8405d.getPackageName());
            x0.f8405d.sendBroadcast(intent);
        } catch (Throwable th) {
            x0.f8405d.A(th);
            s1.l(th, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        if (e.h.b.n.f8064b.delete("playlistM", r12.toString(), null) > 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y(boolean r8, final long r9, final long r11, int r13) {
        /*
            java.lang.String r0 = " AND "
            java.lang.String r1 = " = "
            java.lang.Object r2 = e.h.g.j1.a
            r2 = -4
            r4 = 0
            r5 = 1
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L15
            e.h.b.n.f8069g = r5
        L15:
            g(r8, r4)
            boolean r8 = e.h.b.n.f8068f
            if (r8 != 0) goto L2b
            if (r2 != 0) goto L2b
            boolean r8 = e.h.b.o.k(r9, r11)     // Catch: java.lang.Throwable -> L26
            x()
            return r8
        L26:
            r8 = move-exception
            x()
            throw r8
        L2b:
            e.h.b.q r8 = n(r11)
            if (r8 != 0) goto L32
            return r4
        L32:
            java.util.concurrent.locks.ReentrantLock r3 = e.h.b.n.a
            r3.lock()
            android.database.sqlite.SQLiteDatabase r6 = e.h.b.n.f8064b     // Catch: java.lang.Throwable -> Lcd
            if (r6 == 0) goto Lc9
            if (r2 != 0) goto L45
            e.h.b.d r2 = new e.h.b.d     // Catch: java.lang.Throwable -> Lcd
            r2.<init>()     // Catch: java.lang.Throwable -> Lcd
            e.h.g.j0.c(r2)     // Catch: java.lang.Throwable -> Lcd
        L45:
            long r11 = r8.f8085c     // Catch: java.lang.Throwable -> Lcd
            java.util.ArrayList r11 = r(r9, r11)     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r12.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = "_sID"
            r12.append(r2)     // Catch: java.lang.Throwable -> Lcd
            r12.append(r1)     // Catch: java.lang.Throwable -> Lcd
            long r6 = r8.f8085c     // Catch: java.lang.Throwable -> Lcd
            r12.append(r6)     // Catch: java.lang.Throwable -> Lcd
            r12.append(r0)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r8 = "_pID"
            r12.append(r8)     // Catch: java.lang.Throwable -> Lcd
            r12.append(r1)     // Catch: java.lang.Throwable -> Lcd
            r12.append(r9)     // Catch: java.lang.Throwable -> Lcd
            int r8 = r11.size()     // Catch: java.lang.Throwable -> Lcd
            r9 = 0
            java.lang.String r10 = "playlistM"
            if (r8 == r5) goto Lb9
            if (r13 >= 0) goto L77
            goto Lb9
        L77:
            r8 = -1
            r2 = 100000(0x186a0, float:1.4013E-40)
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lcd
        L7f:
            boolean r6 = r11.hasNext()     // Catch: java.lang.Throwable -> Lcd
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r11.next()     // Catch: java.lang.Throwable -> Lcd
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> Lcd
            int r7 = r6.intValue()     // Catch: java.lang.Throwable -> Lcd
            int r7 = r13 - r7
            int r7 = java.lang.Math.abs(r7)     // Catch: java.lang.Throwable -> Lcd
            if (r7 >= r2) goto L7f
            int r8 = r6.intValue()     // Catch: java.lang.Throwable -> Lcd
            r2 = r7
            goto L7f
        L9d:
            r12.append(r0)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r11 = "_position"
            r12.append(r11)     // Catch: java.lang.Throwable -> Lcd
            r12.append(r1)     // Catch: java.lang.Throwable -> Lcd
            r12.append(r8)     // Catch: java.lang.Throwable -> Lcd
            android.database.sqlite.SQLiteDatabase r8 = e.h.b.n.f8064b     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> Lcd
            int r8 = r8.delete(r10, r11, r9)     // Catch: java.lang.Throwable -> Lcd
            if (r8 <= 0) goto Lc6
        Lb7:
            r4 = 1
            goto Lc6
        Lb9:
            android.database.sqlite.SQLiteDatabase r8 = e.h.b.n.f8064b     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> Lcd
            int r8 = r8.delete(r10, r11, r9)     // Catch: java.lang.Throwable -> Lcd
            if (r8 <= 0) goto Lc6
            goto Lb7
        Lc6:
            x()     // Catch: java.lang.Throwable -> Lcd
        Lc9:
            r3.unlock()
            return r4
        Lcd:
            r8 = move-exception
            r3.unlock()     // Catch: java.lang.Throwable -> Ld2
            goto Ld6
        Ld2:
            r9 = move-exception
            r8.addSuppressed(r9)
        Ld6:
            goto Ld8
        Ld7:
            throw r8
        Ld8:
            goto Ld7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.b.n.y(boolean, long, long, int):boolean");
    }

    public static void z() {
        long nanoTime = System.nanoTime();
        Cursor rawQuery = f8064b.rawQuery("SELECT _dum FROM song WHERE _dum NOT IN (SELECT _sID FROM playlistM ) ", null);
        ArrayList arrayList = new ArrayList();
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        arrayList.add(Long.valueOf(rawQuery.getLong(0)));
                    } while (rawQuery.moveToNext());
                }
            } finally {
                rawQuery.close();
            }
        }
        if (f8064b != null && arrayList.size() > 0) {
            f8064b.beginTransaction();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f8064b.delete("song", "_dum = ?", new String[]{String.valueOf((Long) it.next())});
                    f8064b.yieldIfContendedSafely();
                }
                f8064b.setTransactionSuccessful();
            } finally {
                f8064b.endTransaction();
            }
        }
        StringBuilder y = e.a.d.a.a.y("Removed unusued songs in ");
        y.append(((System.nanoTime() - nanoTime) / 1000000) + "ms");
        t1.i(y.toString());
    }
}
