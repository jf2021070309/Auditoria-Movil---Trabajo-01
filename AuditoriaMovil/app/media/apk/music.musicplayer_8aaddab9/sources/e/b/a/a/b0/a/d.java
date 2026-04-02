package e.b.a.a.b0.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteStatement;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.ads.AdRequest;
import e.b.a.a.b0.a.c;
import e.b.a.a.h;
import e.b.a.a.i;
import e.b.a.a.m;
import e.b.a.a.s;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class d implements m {
    public SQLiteDatabase a;

    /* renamed from: b  reason: collision with root package name */
    public e.b.a.a.b0.a.a f5274b;

    /* renamed from: c  reason: collision with root package name */
    public c f5275c;

    /* renamed from: d  reason: collision with root package name */
    public e.b.a.a.b0.a.b f5276d;

    /* renamed from: e  reason: collision with root package name */
    public final StringBuilder f5277e = new StringBuilder();

    /* renamed from: f  reason: collision with root package name */
    public final long f5278f;

    /* renamed from: g  reason: collision with root package name */
    public e.b.a.a.b0.a.c f5279g;

    /* renamed from: h  reason: collision with root package name */
    public final f f5280h;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c {
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public d(e.b.a.a.w.a aVar, long j2, c cVar) {
        e.b.a.a.b0.a.a aVar2;
        this.f5278f = j2;
        this.f5276d = new e.b.a.a.b0.a.b(aVar.a, "jobs_default_job_manager");
        this.f5280h = new f(j2);
        Context context = aVar.a;
        c.C0106c c0106c = e.b.a.a.b0.a.a.a;
        synchronized (e.b.a.a.b0.a.a.class) {
            HashMap<String, e.b.a.a.b0.a.a> hashMap = e.b.a.a.b0.a.a.p;
            aVar2 = hashMap.get("db_default_job_manager");
            if (aVar2 == null) {
                aVar2 = new e.b.a.a.b0.a.a(context, "db_default_job_manager");
                hashMap.put("db_default_job_manager", aVar2);
            }
        }
        this.f5274b = aVar2;
        SQLiteDatabase writableDatabase = aVar2.getWritableDatabase();
        this.a = writableDatabase;
        c.C0106c c0106c2 = e.b.a.a.b0.a.a.f5243b;
        e.b.a.a.b0.a.c cVar2 = new e.b.a.a.b0.a.c(writableDatabase, "job_holder", "_id", 12, "job_holder_tags", 3, j2);
        this.f5279g = cVar2;
        this.f5275c = cVar;
        this.a.execSQL(cVar2.f5258d);
        m();
    }

    @Override // e.b.a.a.m
    public Set<i> a(e.b.a.a.e eVar) {
        e o = o(eVar);
        e.b.a.a.b0.a.c cVar = this.f5279g;
        if (o.f5285f == null) {
            o.f5285f = cVar.c(o.f5283d, null, new c.b[0]);
        }
        Cursor rawQuery = this.a.rawQuery(o.f5285f, o.f5282c);
        HashSet hashSet = new HashSet();
        while (rawQuery.moveToNext()) {
            try {
                try {
                    hashSet.add(n(rawQuery));
                } catch (a e2) {
                    e.b.a.a.y.c.a.d(e2, "invalid job found by tags.", new Object[0]);
                }
            } finally {
                rawQuery.close();
            }
        }
        return hashSet;
    }

    @Override // e.b.a.a.m
    public int b(e.b.a.a.e eVar) {
        try {
            return (int) o(eVar).a(this.a, this.f5277e).simpleQueryForLong();
        } catch (SQLiteCantOpenDatabaseException | SQLiteOutOfMemoryException unused) {
            return 0;
        }
    }

    @Override // e.b.a.a.m
    public void c(i iVar) {
        e.b.a.a.b0.a.c cVar = this.f5279g;
        if (cVar.f5267m == null) {
            c.C0106c c0106c = e.b.a.a.b0.a.a.f5253l;
            cVar.f5267m = cVar.f5259e.compileStatement("UPDATE job_holder SET cancelled = 1  WHERE _id = ? ");
        }
        SQLiteStatement sQLiteStatement = cVar.f5267m;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, iVar.f5333b);
        sQLiteStatement.execute();
    }

    @Override // e.b.a.a.m
    public void clear() {
        e.b.a.a.b0.a.c cVar = this.f5279g;
        cVar.f5259e.execSQL("DELETE FROM job_holder");
        cVar.f5259e.execSQL("DELETE FROM job_holder_tags");
        cVar.f5259e.execSQL("VACUUM");
        m();
    }

    @Override // e.b.a.a.m
    public void d(i iVar, i iVar2) {
        this.a.beginTransaction();
        try {
            p(iVar2.f5333b);
            g(iVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // e.b.a.a.m
    public i e(e.b.a.a.e eVar) {
        e o = o(eVar);
        e.b.a.a.b0.a.c cVar = this.f5279g;
        if (o.f5287h == null) {
            String str = o.f5283d;
            c.C0106c c0106c = e.b.a.a.b0.a.a.f5247f;
            c.b.a aVar = c.b.a.ASC;
            o.f5287h = cVar.c(str, 1, new c.b(e.b.a.a.b0.a.a.f5244c, c.b.a.DESC), new c.b(c0106c, aVar), new c.b(e.b.a.a.b0.a.a.a, aVar));
        }
        String str2 = o.f5287h;
        while (true) {
            Cursor rawQuery = this.a.rawQuery(str2, o.f5282c);
            try {
                if (!rawQuery.moveToNext()) {
                    return null;
                }
                i n2 = n(rawQuery);
                t(n2);
                return n2;
            } catch (a unused) {
                c.C0106c c0106c2 = e.b.a.a.b0.a.a.f5243b;
                String string = rawQuery.getString(1);
                if (string == null) {
                    e.b.a.a.y.c.a.c("cannot find job id on a retrieved job", new Object[0]);
                } else {
                    p(string);
                }
            } finally {
                rawQuery.close();
            }
        }
    }

    @Override // e.b.a.a.m
    public i f(String str) {
        Cursor rawQuery = this.a.rawQuery(this.f5279g.a, new String[]{str});
        try {
            if (rawQuery.moveToFirst()) {
                return n(rawQuery);
            }
            return null;
        } catch (a e2) {
            e.b.a.a.y.c.a.d(e2, "invalid job on findJobById", new Object[0]);
            return null;
        } finally {
            rawQuery.close();
        }
    }

    @Override // e.b.a.a.m
    public boolean g(i iVar) {
        Set<String> set;
        try {
            r(iVar);
            set = iVar.f5335d;
        } catch (RuntimeException unused) {
        }
        if (set != null && set.size() > 0) {
            return q(iVar);
        }
        SQLiteStatement g2 = this.f5279g.g();
        g2.clearBindings();
        l(g2, iVar);
        long executeInsert = g2.executeInsert();
        iVar.b(executeInsert);
        return executeInsert != -1;
    }

    @Override // e.b.a.a.m
    public Long h(e.b.a.a.e eVar) {
        try {
            long simpleQueryForLong = o(eVar).b(this.a, this.f5279g).simpleQueryForLong();
            if (simpleQueryForLong == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(simpleQueryForLong);
        } catch (SQLiteCantOpenDatabaseException | SQLiteDoneException | SQLiteOutOfMemoryException | SQLiteException unused) {
            return null;
        }
    }

    @Override // e.b.a.a.m
    public boolean i(i iVar) {
        if (iVar.f5345n == null) {
            return g(iVar);
        }
        r(iVar);
        iVar.q = Long.MIN_VALUE;
        e.b.a.a.b0.a.c cVar = this.f5279g;
        if (cVar.f5264j == null) {
            cVar.f5260f.setLength(0);
            StringBuilder sb = cVar.f5260f;
            sb.append("INSERT OR REPLACE INTO ");
            sb.append("job_holder");
            cVar.f5260f.append(" VALUES (");
            for (int i2 = 0; i2 < 12; i2++) {
                if (i2 != 0) {
                    cVar.f5260f.append(",");
                }
                cVar.f5260f.append(CallerData.NA);
            }
            cVar.f5260f.append(")");
            cVar.f5264j = cVar.f5259e.compileStatement(cVar.f5260f.toString());
        }
        SQLiteStatement sQLiteStatement = cVar.f5264j;
        sQLiteStatement.clearBindings();
        l(sQLiteStatement, iVar);
        boolean z = sQLiteStatement.executeInsert() != -1;
        e.b.a.a.y.c.a.a("reinsert job result %s", Boolean.valueOf(z));
        return z;
    }

    @Override // e.b.a.a.m
    public void j(i iVar) {
        p(iVar.f5333b);
    }

    @Override // e.b.a.a.m
    public int k() {
        e.b.a.a.b0.a.c cVar = this.f5279g;
        if (cVar.f5261g == null) {
            SQLiteDatabase sQLiteDatabase = cVar.f5259e;
            c.C0106c c0106c = e.b.a.a.b0.a.a.f5249h;
            cVar.f5261g = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM job_holder WHERE running_session_id != ?");
        }
        SQLiteStatement sQLiteStatement = cVar.f5261g;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, this.f5278f);
        return (int) sQLiteStatement.simpleQueryForLong();
    }

    public final void l(SQLiteStatement sQLiteStatement, i iVar) {
        Long l2 = iVar.f5345n;
        if (l2 != null) {
            c.C0106c c0106c = e.b.a.a.b0.a.a.a;
            sQLiteStatement.bindLong(1, l2.longValue());
        }
        c.C0106c c0106c2 = e.b.a.a.b0.a.a.f5243b;
        sQLiteStatement.bindString(2, iVar.f5333b);
        c.C0106c c0106c3 = e.b.a.a.b0.a.a.f5244c;
        sQLiteStatement.bindLong(3, iVar.o);
        String str = iVar.a;
        if (str != null) {
            c.C0106c c0106c4 = e.b.a.a.b0.a.a.f5245d;
            sQLiteStatement.bindString(4, str);
        }
        c.C0106c c0106c5 = e.b.a.a.b0.a.a.f5246e;
        sQLiteStatement.bindLong(5, iVar.p);
        c.C0106c c0106c6 = e.b.a.a.b0.a.a.f5247f;
        sQLiteStatement.bindLong(6, iVar.f5342k);
        c.C0106c c0106c7 = e.b.a.a.b0.a.a.f5248g;
        sQLiteStatement.bindLong(7, iVar.f5344m);
        c.C0106c c0106c8 = e.b.a.a.b0.a.a.f5249h;
        sQLiteStatement.bindLong(8, iVar.q);
        c.C0106c c0106c9 = e.b.a.a.b0.a.a.f5250i;
        sQLiteStatement.bindLong(9, iVar.f5337f);
        c.C0106c c0106c10 = e.b.a.a.b0.a.a.f5251j;
        sQLiteStatement.bindLong(10, iVar.f5343l);
        c.C0106c c0106c11 = e.b.a.a.b0.a.a.f5252k;
        sQLiteStatement.bindLong(11, iVar.f5339h ? 1L : 0L);
        c.C0106c c0106c12 = e.b.a.a.b0.a.a.f5253l;
        sQLiteStatement.bindLong(12, iVar.f5340i ? 1L : 0L);
    }

    public final void m() {
        String[] list;
        Cursor rawQuery = this.a.rawQuery(this.f5279g.f5256b, null);
        HashSet hashSet = new HashSet();
        while (rawQuery.moveToNext()) {
            try {
                hashSet.add(rawQuery.getString(0));
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
        rawQuery.close();
        e.b.a.a.b0.a.b bVar = this.f5276d;
        for (String str : bVar.a.list()) {
            if (str.endsWith(".jobs")) {
                if (!hashSet.contains(str.length() < 6 ? null : str.substring(0, str.length() - 5))) {
                    File file = new File(bVar.a, str);
                    if (!file.delete()) {
                        StringBuilder y = e.a.d.a.a.y("cannot delete unused job toFile ");
                        y.append(file.getAbsolutePath());
                        e.b.a.a.y.c.a.a(y.toString(), new Object[0]);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Set] */
    public final i n(Cursor cursor) throws a {
        ?? hashSet;
        c.C0106c c0106c = e.b.a.a.b0.a.a.f5243b;
        String string = cursor.getString(1);
        try {
            h s = s(this.f5276d.a(string));
            if (s != null) {
                Cursor rawQuery = this.a.rawQuery(this.f5279g.f5257c, new String[]{string});
                try {
                    if (rawQuery.getCount() == 0) {
                        hashSet = Collections.EMPTY_SET;
                    } else {
                        hashSet = new HashSet();
                        while (rawQuery.moveToNext()) {
                            hashSet.add(rawQuery.getString(0));
                        }
                    }
                    rawQuery.close();
                    i.b bVar = new i.b();
                    c.C0106c c0106c2 = e.b.a.a.b0.a.a.a;
                    bVar.f5351g = Long.valueOf(cursor.getLong(0));
                    c.C0106c c0106c3 = e.b.a.a.b0.a.a.f5244c;
                    bVar.f5354j = cursor.getInt(2);
                    bVar.f5355k |= 1;
                    c.C0106c c0106c4 = e.b.a.a.b0.a.a.f5245d;
                    bVar.f5349e = cursor.getString(3);
                    bVar.f5355k |= 8;
                    c.C0106c c0106c5 = e.b.a.a.b0.a.a.f5246e;
                    bVar.f5357m = cursor.getInt(4);
                    bVar.f5352h = s;
                    int i2 = bVar.f5355k | 16;
                    bVar.f5355k = i2;
                    bVar.f5350f = string;
                    int i3 = i2 | 4;
                    bVar.f5355k = i3;
                    bVar.o = hashSet;
                    int i4 = i3 | AdRequest.MAX_CONTENT_URL_LENGTH;
                    bVar.f5355k = i4;
                    bVar.f5353i = true;
                    bVar.f5355k = i4 | 2;
                    c.C0106c c0106c6 = e.b.a.a.b0.a.a.f5251j;
                    long j2 = cursor.getLong(9);
                    c.C0106c c0106c7 = e.b.a.a.b0.a.a.f5252k;
                    boolean z = cursor.getInt(10) == 1;
                    bVar.f5347c = j2;
                    bVar.a = z;
                    bVar.f5355k |= 128;
                    c.C0106c c0106c8 = e.b.a.a.b0.a.a.f5247f;
                    bVar.f5346b = cursor.getLong(5);
                    bVar.f5355k |= 32;
                    c.C0106c c0106c9 = e.b.a.a.b0.a.a.f5248g;
                    bVar.f5348d = cursor.getLong(6);
                    bVar.f5355k |= 64;
                    c.C0106c c0106c10 = e.b.a.a.b0.a.a.f5249h;
                    bVar.f5358n = cursor.getLong(7);
                    bVar.f5355k |= 256;
                    c.C0106c c0106c11 = e.b.a.a.b0.a.a.f5250i;
                    bVar.f5356l = cursor.getInt(8);
                    bVar.f5355k |= 1024;
                    return bVar.a();
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            throw new a("null job");
        } catch (IOException e2) {
            throw new a("cannot load job from disk", e2);
        }
    }

    public final e o(e.b.a.a.e eVar) {
        int i2;
        int i3;
        f fVar = this.f5280h;
        StringBuilder sb = this.f5277e;
        Objects.requireNonNull(fVar);
        boolean z = eVar.f5301g.size() < 64 && eVar.a.size() < 64 && eVar.f5296b.size() < 64;
        s sVar = eVar.f5300f;
        long ordinal = ((sVar == null ? 2 : sVar.ordinal()) << 0) | (eVar.f5301g.size() << 2) | (eVar.a.size() << 8) | (eVar.f5296b.size() << 14) | ((eVar.f5297c ? 1 : 0) << 20) | ((eVar.f5302h == null ? 1 : 0) << 21);
        e eVar2 = z ? fVar.a.get(Long.valueOf(ordinal)) : null;
        if (eVar2 == null) {
            sb.setLength(0);
            sb.append("( (");
            c.C0106c c0106c = e.b.a.a.b0.a.a.f5251j;
            sb.append("deadline");
            sb.append(" != ");
            e.a.d.a.a.M(sb, e.f5281b, " AND ", "deadline", " <= ?) OR ");
            c.C0106c c0106c2 = e.b.a.a.b0.a.a.f5250i;
            e.a.d.a.a.L(sb, "network_type", " <= ?)", " AND (");
            c.C0106c c0106c3 = e.b.a.a.b0.a.a.f5253l;
            e.a.d.a.a.M(sb, "cancelled", " IS NULL OR ", "cancelled", " != 1)");
            if (eVar.f5302h != null) {
                sb.append(" AND ");
                c.C0106c c0106c4 = e.b.a.a.b0.a.a.f5248g;
                sb.append("delay_until_ns");
                sb.append(" <= ?");
                i3 = 3;
            } else {
                i3 = 2;
            }
            if (eVar.f5300f != null) {
                if (eVar.f5301g.isEmpty()) {
                    sb.append(" AND 0 ");
                } else {
                    sb.append(" AND ");
                    c.C0106c c0106c5 = e.b.a.a.b0.a.a.f5243b;
                    sb.append("_id");
                    sb.append(" IN ( SELECT ");
                    c.C0106c c0106c6 = e.b.a.a.b0.a.a.f5255n;
                    e.a.d.a.a.M(sb, "job_id", " FROM ", "job_holder_tags", " WHERE ");
                    c.C0106c c0106c7 = e.b.a.a.b0.a.a.o;
                    sb.append("tag_name");
                    sb.append(" IN (");
                    e.b.a.a.b0.a.c.a(sb, eVar.f5301g.size());
                    sb.append(")");
                    s sVar2 = eVar.f5300f;
                    if (sVar2 == s.ANY) {
                        sb.append(")");
                    } else if (sVar2 != s.ALL) {
                        throw new IllegalArgumentException("unknown constraint " + eVar);
                    } else {
                        e.a.d.a.a.M(sb, " GROUP BY (`", "job_id", "`)", " HAVING count(*) = ");
                        sb.append(eVar.f5301g.size());
                        sb.append(")");
                    }
                    i3 += eVar.f5301g.size();
                }
            }
            if (!eVar.a.isEmpty()) {
                sb.append(" AND (");
                c.C0106c c0106c8 = e.b.a.a.b0.a.a.f5245d;
                e.a.d.a.a.M(sb, "group_id", " IS NULL OR ", "group_id", " NOT IN(");
                e.b.a.a.b0.a.c.a(sb, eVar.a.size());
                sb.append("))");
                i3 += eVar.a.size();
            }
            if (!eVar.f5296b.isEmpty()) {
                sb.append(" AND ");
                c.C0106c c0106c9 = e.b.a.a.b0.a.a.f5243b;
                sb.append("_id");
                sb.append(" NOT IN(");
                e.b.a.a.b0.a.c.a(sb, eVar.f5296b.size());
                sb.append(")");
                i3 += eVar.f5296b.size();
            }
            if (eVar.f5297c) {
                sb.append(" AND ");
                c.C0106c c0106c10 = e.b.a.a.b0.a.a.f5249h;
                sb.append("running_session_id");
                sb.append(" != ?");
                i3++;
            }
            eVar2 = new e(ordinal, sb.toString(), new String[i3]);
            if (z) {
                fVar.a.put(Long.valueOf(ordinal), eVar2);
            }
        }
        eVar2.f5282c[0] = Long.toString(eVar.f5299e);
        eVar2.f5282c[1] = Integer.toString(eVar.f5298d);
        Long l2 = eVar.f5302h;
        if (l2 != null) {
            eVar2.f5282c[2] = Long.toString(l2.longValue());
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (eVar.f5300f != null) {
            for (String str : eVar.f5301g) {
                eVar2.f5282c[i2] = str;
                i2++;
            }
        }
        for (String str2 : eVar.a) {
            eVar2.f5282c[i2] = str2;
            i2++;
        }
        for (String str3 : eVar.f5296b) {
            eVar2.f5282c[i2] = str3;
            i2++;
        }
        if (eVar.f5297c) {
            eVar2.f5282c[i2] = fVar.f5288b;
            i2++;
        }
        if (i2 == eVar2.f5282c.length) {
            return eVar2;
        }
        StringBuilder y = e.a.d.a.a.y("something is wrong with where query cache for ");
        y.append(eVar2.f5283d);
        throw new IllegalStateException(y.toString());
    }

    public final void p(String str) {
        this.a.beginTransaction();
        try {
            SQLiteStatement f2 = this.f5279g.f();
            f2.clearBindings();
            f2.bindString(1, str);
            f2.execute();
            SQLiteStatement e2 = this.f5279g.e();
            e2.bindString(1, str);
            e2.execute();
            this.a.setTransactionSuccessful();
            File c2 = this.f5276d.c(str);
            if (c2.exists()) {
                c2.delete();
            }
        } finally {
            this.a.endTransaction();
        }
    }

    public final boolean q(i iVar) {
        SQLiteStatement g2 = this.f5279g.g();
        e.b.a.a.b0.a.c cVar = this.f5279g;
        if (cVar.f5266l == null) {
            cVar.f5260f.setLength(0);
            StringBuilder sb = cVar.f5260f;
            sb.append("INSERT INTO ");
            sb.append("job_holder_tags");
            cVar.f5260f.append(" VALUES (");
            for (int i2 = 0; i2 < 3; i2++) {
                if (i2 != 0) {
                    cVar.f5260f.append(",");
                }
                cVar.f5260f.append(CallerData.NA);
            }
            cVar.f5260f.append(")");
            cVar.f5266l = cVar.f5259e.compileStatement(cVar.f5260f.toString());
        }
        SQLiteStatement sQLiteStatement = cVar.f5266l;
        this.a.beginTransaction();
        try {
            g2.clearBindings();
            l(g2, iVar);
        } finally {
            try {
                return false;
            } finally {
            }
        }
        if (g2.executeInsert() != -1) {
            for (String str : iVar.f5335d) {
                sQLiteStatement.clearBindings();
                String str2 = iVar.f5333b;
                c.C0106c c0106c = e.b.a.a.b0.a.a.f5255n;
                sQLiteStatement.bindString(2, str2);
                c.C0106c c0106c2 = e.b.a.a.b0.a.a.o;
                sQLiteStatement.bindString(3, str);
                sQLiteStatement.executeInsert();
            }
            this.a.setTransactionSuccessful();
            return true;
        }
        return false;
    }

    public final void r(i iVar) {
        try {
            e.b.a.a.b0.a.b bVar = this.f5276d;
            String str = iVar.f5333b;
            c cVar = this.f5275c;
            h hVar = iVar.f5336e;
            Objects.requireNonNull((b) cVar);
            byte[] bArr = null;
            ByteArrayOutputStream byteArrayOutputStream = null;
            if (hVar != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        new ObjectOutputStream(byteArrayOutputStream2).writeObject(hVar);
                        bArr = byteArrayOutputStream2.toByteArray();
                        byteArrayOutputStream2.close();
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            bVar.b(str, bArr);
        } catch (IOException e2) {
            throw new RuntimeException("cannot save job to disk", e2);
        }
    }

    public final h s(byte[] bArr) {
        ObjectInputStream objectInputStream;
        try {
            Objects.requireNonNull((b) this.f5275c);
            if (bArr == null || bArr.length == 0) {
                return null;
            }
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
                try {
                    h hVar = (h) objectInputStream.readObject();
                    objectInputStream.close();
                    return hVar;
                } catch (Throwable th) {
                    th = th;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = null;
            }
        } catch (Throwable th3) {
            e.b.a.a.y.c.a.d(th3, "error while deserializing job", new Object[0]);
            return null;
        }
    }

    public final void t(i iVar) {
        e.b.a.a.b0.a.c cVar = this.f5279g;
        if (cVar.f5268n == null) {
            c.C0106c c0106c = e.b.a.a.b0.a.a.f5246e;
            c.C0106c c0106c2 = e.b.a.a.b0.a.a.f5249h;
            cVar.f5268n = cVar.f5259e.compileStatement("UPDATE job_holder SET run_count = ? , running_session_id = ?  WHERE _id = ? ");
        }
        SQLiteStatement sQLiteStatement = cVar.f5268n;
        iVar.p++;
        iVar.q = this.f5278f;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, iVar.p);
        sQLiteStatement.bindLong(2, this.f5278f);
        sQLiteStatement.bindString(3, iVar.f5333b);
        sQLiteStatement.execute();
    }
}
