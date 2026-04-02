package e.d.b.b.j.c0.i;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import e.d.b.b.j.a0.a.a;
import e.d.b.b.j.a0.a.c;
import e.d.b.b.j.c0.i.h0;
import e.d.b.b.j.d0.b;
import e.d.b.b.j.i;
import e.d.b.b.j.j;
import e.d.b.b.j.n;
import e.d.b.b.j.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class h0 implements a0, e.d.b.b.j.d0.b, z {
    public static final e.d.b.b.b a = new e.d.b.b.b("proto");

    /* renamed from: b  reason: collision with root package name */
    public final j0 f6208b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6209c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6210d;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f6211e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.b.b.j.z.a<String> f6212f;

    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t);
    }

    /* loaded from: classes.dex */
    public static class c {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6213b;

        public c(String str, String str2, a aVar) {
            this.a = str;
            this.f6213b = str2;
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    public h0(e.d.b.b.j.e0.a aVar, e.d.b.b.j.e0.a aVar2, b0 b0Var, j0 j0Var, e.d.b.b.j.z.a<String> aVar3) {
        this.f6208b = j0Var;
        this.f6209c = aVar;
        this.f6210d = aVar2;
        this.f6211e = b0Var;
        this.f6212f = aVar3;
    }

    public static String y(Iterable<g0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<g0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }

    public static <T> T z(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // e.d.b.b.j.c0.i.a0
    public g0 N(final e.d.b.b.j.r rVar, final e.d.b.b.j.n nVar) {
        Object[] objArr = {rVar.d(), nVar.h(), rVar.b()};
        c.t.m.m("SQLiteEventStore");
        String.format("Storing event with priority=%s, name=%s for destination %s", objArr);
        long longValue = ((Long) u(new b() { // from class: e.d.b.b.j.c0.i.m
            @Override // e.d.b.b.j.c0.i.h0.b
            public final Object apply(Object obj) {
                long insert;
                h0 h0Var = h0.this;
                e.d.b.b.j.n nVar2 = nVar;
                e.d.b.b.j.r rVar2 = rVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (h0Var.m().compileStatement("PRAGMA page_size").simpleQueryForLong() * h0Var.m().compileStatement("PRAGMA page_count").simpleQueryForLong() >= h0Var.f6211e.e()) {
                    h0Var.i(1L, c.a.CACHE_FULL, nVar2.h());
                    return -1L;
                }
                Long r = h0Var.r(sQLiteDatabase, rVar2);
                if (r != null) {
                    insert = r.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", rVar2.b());
                    contentValues.put("priority", Integer.valueOf(e.d.b.b.j.f0.a.a(rVar2.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (rVar2.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(rVar2.c(), 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int d2 = h0Var.f6211e.d();
                byte[] bArr = nVar2.e().f6280b;
                boolean z = bArr.length <= d2;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", nVar2.h());
                contentValues2.put("timestamp_ms", Long.valueOf(nVar2.f()));
                contentValues2.put("uptime_ms", Long.valueOf(nVar2.i()));
                contentValues2.put("payload_encoding", nVar2.e().a.a);
                contentValues2.put("code", nVar2.d());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    double length = bArr.length;
                    double d3 = d2;
                    Double.isNaN(length);
                    Double.isNaN(d3);
                    Double.isNaN(length);
                    Double.isNaN(d3);
                    Double.isNaN(length);
                    Double.isNaN(d3);
                    int ceil = (int) Math.ceil(length / d3);
                    for (int i2 = 1; i2 <= ceil; i2++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, (i2 - 1) * d2, Math.min(i2 * d2, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i2));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(nVar2.c()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new y(longValue, rVar, nVar);
    }

    @Override // e.d.b.b.j.c0.i.a0
    public long R(e.d.b.b.j.r rVar) {
        Cursor rawQuery = m().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{rVar.b(), String.valueOf(e.d.b.b.j.f0.a.a(rVar.d()))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // e.d.b.b.j.c0.i.a0
    public boolean V(e.d.b.b.j.r rVar) {
        SQLiteDatabase m2 = m();
        m2.beginTransaction();
        try {
            Long r = r(m2, rVar);
            Boolean bool = r == null ? Boolean.FALSE : (Boolean) z(m().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{r.toString()}), new b() { // from class: e.d.b.b.j.c0.i.v
                @Override // e.d.b.b.j.c0.i.h0.b
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Cursor) obj).moveToNext());
                }
            });
            m2.setTransactionSuccessful();
            m2.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th) {
            m2.endTransaction();
            throw th;
        }
    }

    @Override // e.d.b.b.j.c0.i.a0
    public void X(Iterable<g0> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder y = e.a.d.a.a.y("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            y.append(y(iterable));
            String sb = y.toString();
            SQLiteDatabase m2 = m();
            m2.beginTransaction();
            try {
                Objects.requireNonNull(this);
                m2.compileStatement(sb).execute();
                z(m2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null), new b() { // from class: e.d.b.b.j.c0.i.o
                    @Override // e.d.b.b.j.c0.i.h0.b
                    public final Object apply(Object obj) {
                        h0 h0Var = h0.this;
                        Cursor cursor = (Cursor) obj;
                        Objects.requireNonNull(h0Var);
                        while (cursor.moveToNext()) {
                            int i2 = cursor.getInt(0);
                            h0Var.i(i2, c.a.MAX_RETRIES_REACHED, cursor.getString(1));
                        }
                        return null;
                    }
                });
                m2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                m2.setTransactionSuccessful();
            } finally {
                m2.endTransaction();
            }
        }
    }

    @Override // e.d.b.b.j.c0.i.z
    public void a() {
        SQLiteDatabase m2 = m();
        m2.beginTransaction();
        try {
            Objects.requireNonNull(this);
            m2.compileStatement("DELETE FROM log_event_dropped").execute();
            m2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f6209c.a()).execute();
            m2.setTransactionSuccessful();
        } finally {
            m2.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6208b.close();
    }

    @Override // e.d.b.b.j.c0.i.a0
    public int d() {
        long a2 = this.f6209c.a() - this.f6211e.b();
        SQLiteDatabase m2 = m();
        m2.beginTransaction();
        try {
            Objects.requireNonNull(this);
            String[] strArr = {String.valueOf(a2)};
            z(m2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: e.d.b.b.j.c0.i.j
                @Override // e.d.b.b.j.c0.i.h0.b
                public final Object apply(Object obj) {
                    h0 h0Var = h0.this;
                    Cursor cursor = (Cursor) obj;
                    Objects.requireNonNull(h0Var);
                    while (cursor.moveToNext()) {
                        int i2 = cursor.getInt(0);
                        h0Var.i(i2, c.a.MESSAGE_TOO_OLD, cursor.getString(1));
                    }
                    return null;
                }
            });
            Integer valueOf = Integer.valueOf(m2.delete("events", "timestamp_ms < ?", strArr));
            m2.setTransactionSuccessful();
            m2.endTransaction();
            return valueOf.intValue();
        } catch (Throwable th) {
            m2.endTransaction();
            throw th;
        }
    }

    @Override // e.d.b.b.j.c0.i.a0
    public void e(Iterable<g0> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder y = e.a.d.a.a.y("DELETE FROM events WHERE _id in ");
            y.append(y(iterable));
            m().compileStatement(y.toString()).execute();
        }
    }

    @Override // e.d.b.b.j.d0.b
    public <T> T f(b.a<T> aVar) {
        final SQLiteDatabase m2 = m();
        v(new d() { // from class: e.d.b.b.j.c0.i.e
            @Override // e.d.b.b.j.c0.i.h0.d
            public final Object a() {
                m2.beginTransaction();
                return null;
            }
        }, new b() { // from class: e.d.b.b.j.c0.i.b
            @Override // e.d.b.b.j.c0.i.h0.b
            public final Object apply(Object obj) {
                e.d.b.b.b bVar = h0.a;
                throw new e.d.b.b.j.d0.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            }
        });
        try {
            T a2 = aVar.a();
            m2.setTransactionSuccessful();
            return a2;
        } finally {
            m2.endTransaction();
        }
    }

    @Override // e.d.b.b.j.c0.i.z
    public e.d.b.b.j.a0.a.a h() {
        int i2 = e.d.b.b.j.a0.a.a.a;
        final a.C0134a c0134a = new a.C0134a();
        final HashMap hashMap = new HashMap();
        SQLiteDatabase m2 = m();
        m2.beginTransaction();
        try {
            Objects.requireNonNull(this);
            e.d.b.b.j.a0.a.a aVar = (e.d.b.b.j.a0.a.a) z(m2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new b() { // from class: e.d.b.b.j.c0.i.n
                @Override // e.d.b.b.j.c0.i.h0.b
                public final Object apply(Object obj) {
                    h0 h0Var = h0.this;
                    Map map = hashMap;
                    a.C0134a c0134a2 = c0134a;
                    Cursor cursor = (Cursor) obj;
                    Objects.requireNonNull(h0Var);
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        int i3 = cursor.getInt(1);
                        c.a aVar2 = c.a.REASON_UNKNOWN;
                        if (i3 != aVar2.getNumber()) {
                            c.a aVar3 = c.a.MESSAGE_TOO_OLD;
                            if (i3 != aVar3.getNumber()) {
                                aVar3 = c.a.CACHE_FULL;
                                if (i3 != aVar3.getNumber()) {
                                    aVar3 = c.a.PAYLOAD_TOO_BIG;
                                    if (i3 != aVar3.getNumber()) {
                                        aVar3 = c.a.MAX_RETRIES_REACHED;
                                        if (i3 != aVar3.getNumber()) {
                                            aVar3 = c.a.INVALID_PAYLOD;
                                            if (i3 != aVar3.getNumber()) {
                                                aVar3 = c.a.SERVER_ERROR;
                                                if (i3 != aVar3.getNumber()) {
                                                    c.t.m.g("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i3));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            aVar2 = aVar3;
                        }
                        long j2 = cursor.getLong(2);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        int i4 = e.d.b.b.j.a0.a.c.a;
                        ((List) map.get(string)).add(new e.d.b.b.j.a0.a.c(j2, aVar2));
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        int i5 = e.d.b.b.j.a0.a.d.a;
                        new ArrayList();
                        c0134a2.f6124b.add(new e.d.b.b.j.a0.a.d((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                    }
                    final long a2 = h0Var.f6209c.a();
                    c0134a2.a = (e.d.b.b.j.a0.a.f) h0Var.u(new h0.b() { // from class: e.d.b.b.j.c0.i.k
                        @Override // e.d.b.b.j.c0.i.h0.b
                        public final Object apply(Object obj2) {
                            final long j3 = a2;
                            return (e.d.b.b.j.a0.a.f) h0.z(((SQLiteDatabase) obj2).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new h0.b() { // from class: e.d.b.b.j.c0.i.c
                                @Override // e.d.b.b.j.c0.i.h0.b
                                public final Object apply(Object obj3) {
                                    long j4 = j3;
                                    Cursor cursor2 = (Cursor) obj3;
                                    cursor2.moveToNext();
                                    long j5 = cursor2.getLong(0);
                                    int i6 = e.d.b.b.j.a0.a.f.a;
                                    return new e.d.b.b.j.a0.a.f(j5, j4);
                                }
                            });
                        }
                    });
                    int i6 = e.d.b.b.j.a0.a.b.a;
                    int i7 = e.d.b.b.j.a0.a.e.a;
                    c0134a2.f6125c = new e.d.b.b.j.a0.a.b(new e.d.b.b.j.a0.a.e(h0Var.m().compileStatement("PRAGMA page_size").simpleQueryForLong() * h0Var.m().compileStatement("PRAGMA page_count").simpleQueryForLong(), b0.a.e()));
                    c0134a2.f6126d = h0Var.f6212f.get();
                    return new e.d.b.b.j.a0.a.a(c0134a2.a, Collections.unmodifiableList(c0134a2.f6124b), c0134a2.f6125c, c0134a2.f6126d);
                }
            });
            m2.setTransactionSuccessful();
            return aVar;
        } finally {
            m2.endTransaction();
        }
    }

    @Override // e.d.b.b.j.c0.i.z
    public void i(final long j2, final c.a aVar, final String str) {
        u(new b() { // from class: e.d.b.b.j.c0.i.i
            @Override // e.d.b.b.j.c0.i.h0.b
            public final Object apply(Object obj) {
                String str2 = str;
                c.a aVar2 = aVar;
                long j3 = j2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (((Boolean) h0.z(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(aVar2.getNumber())}), new h0.b() { // from class: e.d.b.b.j.c0.i.p
                    @Override // e.d.b.b.j.c0.i.h0.b
                    public final Object apply(Object obj2) {
                        e.d.b.b.b bVar = h0.a;
                        return Boolean.valueOf(((Cursor) obj2).getCount() > 0);
                    }
                })).booleanValue()) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(aVar2.getNumber())});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(aVar2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j3));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // e.d.b.b.j.c0.i.a0
    public Iterable<g0> l(final e.d.b.b.j.r rVar) {
        return (Iterable) u(new b() { // from class: e.d.b.b.j.c0.i.d
            @Override // e.d.b.b.j.c0.i.h0.b
            public final Object apply(Object obj) {
                final h0 h0Var = h0.this;
                final e.d.b.b.j.r rVar2 = rVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Objects.requireNonNull(h0Var);
                final ArrayList arrayList = new ArrayList();
                Long r = h0Var.r(sQLiteDatabase, rVar2);
                if (r != null) {
                    h0.z(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{r.toString()}, null, null, null, String.valueOf(h0Var.f6211e.c())), new h0.b() { // from class: e.d.b.b.j.c0.i.l
                        @Override // e.d.b.b.j.c0.i.h0.b
                        public final Object apply(Object obj2) {
                            h0 h0Var2 = h0.this;
                            List list = arrayList;
                            e.d.b.b.j.r rVar3 = rVar2;
                            Cursor cursor = (Cursor) obj2;
                            Objects.requireNonNull(h0Var2);
                            while (cursor.moveToNext()) {
                                long j2 = cursor.getLong(0);
                                boolean z = cursor.getInt(7) != 0;
                                n.a a2 = e.d.b.b.j.n.a();
                                a2.f(cursor.getString(1));
                                a2.e(cursor.getLong(2));
                                a2.g(cursor.getLong(3));
                                if (z) {
                                    String string = cursor.getString(4);
                                    a2.d(new e.d.b.b.j.m(string == null ? h0.a : new e.d.b.b.b(string), cursor.getBlob(5)));
                                } else {
                                    String string2 = cursor.getString(4);
                                    a2.d(new e.d.b.b.j.m(string2 == null ? h0.a : new e.d.b.b.b(string2), (byte[]) h0.z(h0Var2.m().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), new h0.b() { // from class: e.d.b.b.j.c0.i.g
                                        @Override // e.d.b.b.j.c0.i.h0.b
                                        public final Object apply(Object obj3) {
                                            Cursor cursor2 = (Cursor) obj3;
                                            e.d.b.b.b bVar = h0.a;
                                            ArrayList arrayList2 = new ArrayList();
                                            int i2 = 0;
                                            while (cursor2.moveToNext()) {
                                                byte[] blob = cursor2.getBlob(0);
                                                arrayList2.add(blob);
                                                i2 += blob.length;
                                            }
                                            byte[] bArr = new byte[i2];
                                            int i3 = 0;
                                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                                byte[] bArr2 = (byte[]) arrayList2.get(i4);
                                                System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                                                i3 += bArr2.length;
                                            }
                                            return bArr;
                                        }
                                    })));
                                }
                                if (!cursor.isNull(6)) {
                                    ((i.b) a2).f6259b = Integer.valueOf(cursor.getInt(6));
                                }
                                list.add(new y(j2, rVar3, a2.b()));
                            }
                            return null;
                        }
                    });
                }
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    sb.append(((g0) arrayList.get(i2)).b());
                    if (i2 < arrayList.size() - 1) {
                        sb.append(CoreConstants.COMMA_CHAR);
                    }
                }
                sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        long j2 = query.getLong(0);
                        Set set = (Set) hashMap.get(Long.valueOf(j2));
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(Long.valueOf(j2), set);
                        }
                        set.add(new h0.c(query.getString(1), query.getString(2), null));
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    g0 g0Var = (g0) listIterator.next();
                    if (hashMap.containsKey(Long.valueOf(g0Var.b()))) {
                        n.a j3 = g0Var.a().j();
                        for (h0.c cVar : (Set) hashMap.get(Long.valueOf(g0Var.b()))) {
                            j3.a(cVar.a, cVar.f6213b);
                        }
                        listIterator.set(new y(g0Var.b(), g0Var.c(), j3.b()));
                    }
                }
                return arrayList;
            }
        });
    }

    public SQLiteDatabase m() {
        final j0 j0Var = this.f6208b;
        Objects.requireNonNull(j0Var);
        return (SQLiteDatabase) v(new d() { // from class: e.d.b.b.j.c0.i.w
            @Override // e.d.b.b.j.c0.i.h0.d
            public final Object a() {
                return j0.this.getWritableDatabase();
            }
        }, new b() { // from class: e.d.b.b.j.c0.i.a
            @Override // e.d.b.b.j.c0.i.h0.b
            public final Object apply(Object obj) {
                e.d.b.b.b bVar = h0.a;
                throw new e.d.b.b.j.d0.a("Timed out while trying to open db.", (Throwable) obj);
            }
        });
    }

    @Override // e.d.b.b.j.c0.i.a0
    public void n(final e.d.b.b.j.r rVar, final long j2) {
        u(new b() { // from class: e.d.b.b.j.c0.i.f
            @Override // e.d.b.b.j.c0.i.h0.b
            public final Object apply(Object obj) {
                long j3 = j2;
                e.d.b.b.j.r rVar2 = rVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j3));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{rVar2.b(), String.valueOf(e.d.b.b.j.f0.a.a(rVar2.d()))}) < 1) {
                    contentValues.put("backend_name", rVar2.b());
                    contentValues.put("priority", Integer.valueOf(e.d.b.b.j.f0.a.a(rVar2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    public final Long r(SQLiteDatabase sQLiteDatabase, e.d.b.b.j.r rVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(rVar.b(), String.valueOf(e.d.b.b.j.f0.a.a(rVar.d()))));
        if (rVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(rVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    @Override // e.d.b.b.j.c0.i.a0
    public Iterable<e.d.b.b.j.r> s() {
        SQLiteDatabase m2 = m();
        m2.beginTransaction();
        try {
            List list = (List) z(m2.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: e.d.b.b.j.c0.i.h
                @Override // e.d.b.b.j.c0.i.h0.b
                public final Object apply(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    e.d.b.b.b bVar = h0.a;
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        r.a a2 = e.d.b.b.j.r.a();
                        a2.b(cursor.getString(1));
                        a2.c(e.d.b.b.j.f0.a.b(cursor.getInt(2)));
                        String string = cursor.getString(3);
                        j.b bVar2 = (j.b) a2;
                        bVar2.f6266b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(bVar2.a());
                    }
                    return arrayList;
                }
            });
            m2.setTransactionSuccessful();
            return list;
        } finally {
            m2.endTransaction();
        }
    }

    public <T> T u(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m2 = m();
        m2.beginTransaction();
        try {
            T apply = bVar.apply(m2);
            m2.setTransactionSuccessful();
            return apply;
        } finally {
            m2.endTransaction();
        }
    }

    public final <T> T v(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.f6210d.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f6210d.a() >= this.f6211e.a() + a2) {
                    return bVar.apply(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
