package com.amazon.aps.iva.p8;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.amazon.aps.iva.s.b;
import com.amazon.aps.iva.u1.n;
import com.amazon.aps.iva.w5.s;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: InvalidationTracker.java */
/* loaded from: classes.dex */
public final class f {
    public static final String[] k = {"UPDATE", "DELETE", "INSERT"};
    public final String[] b;
    public final Map<String, Set<String>> c;
    public final g d;
    public volatile com.amazon.aps.iva.v8.e g;
    public final b h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public volatile boolean f = false;
    @SuppressLint({"RestrictedApi"})
    public final com.amazon.aps.iva.s.b<c, d> i = new com.amazon.aps.iva.s.b<>();
    public final a j = new a();
    public final HashMap<String, Integer> a = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public final HashSet a() {
            HashSet hashSet = new HashSet();
            Cursor g = f.this.d.g(new n("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (g.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(g.getInt(0)));
                } catch (Throwable th) {
                    g.close();
                    throw th;
                }
            }
            g.close();
            if (!hashSet.isEmpty()) {
                f.this.g.k();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReentrantReadWriteLock.ReadLock readLock = f.this.d.h.readLock();
            HashSet hashSet = null;
            try {
                readLock.lock();
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
            if (!f.this.a()) {
                readLock.unlock();
            } else if (!f.this.e.compareAndSet(true, false)) {
                readLock.unlock();
            } else if (((com.amazon.aps.iva.v8.a) f.this.d.c.getWritableDatabase()).b.inTransaction()) {
                readLock.unlock();
            } else {
                g gVar = f.this.d;
                if (gVar.f) {
                    com.amazon.aps.iva.v8.a aVar = (com.amazon.aps.iva.v8.a) gVar.c.getWritableDatabase();
                    aVar.a();
                    try {
                        hashSet = a();
                        aVar.k();
                        aVar.c();
                    } catch (Throwable th2) {
                        aVar.c();
                        throw th2;
                    }
                } else {
                    hashSet = a();
                }
                readLock.unlock();
                if (hashSet != null && !hashSet.isEmpty()) {
                    synchronized (f.this.i) {
                        b.e eVar = (b.e) f.this.i.iterator();
                        if (eVar.hasNext()) {
                            ((d) ((Map.Entry) eVar.next()).getValue()).getClass();
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class b {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public b(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public final int[] a() {
            boolean z;
            synchronized (this) {
                if (this.d && !this.e) {
                    int length = this.a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i < length) {
                            if (this.a[i] > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean[] zArr = this.b;
                            if (z != zArr[i]) {
                                int[] iArr = this.c;
                                if (!z) {
                                    i2 = 2;
                                }
                                iArr[i] = i2;
                            } else {
                                this.c[i] = 0;
                            }
                            zArr[i] = z;
                            i++;
                        } else {
                            this.e = true;
                            this.d = false;
                            return this.c;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class d {
    }

    public f(g gVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.d = gVar;
        this.h = new b(strArr.length);
        this.c = hashMap2;
        new s(gVar);
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) hashMap.get(strArr[i]);
            if (str2 != null) {
                this.b[i] = str2.toLowerCase(locale);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap3 = this.a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        boolean z;
        com.amazon.aps.iva.u8.a aVar = this.d.a;
        if (aVar != null && ((com.amazon.aps.iva.v8.a) aVar).b.isOpen()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (!this.f) {
            this.d.c.getWritableDatabase();
        }
        if (this.f) {
            return true;
        }
        return false;
    }

    public final void b(com.amazon.aps.iva.u8.a aVar, int i) {
        com.amazon.aps.iva.v8.a aVar2 = (com.amazon.aps.iva.v8.a) aVar;
        aVar2.f(com.amazon.aps.iva.c80.a.d("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i, ", 0)"));
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = k;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            com.amazon.aps.iva.m80.a.c(sb, str, "_", str2, "`");
            com.amazon.aps.iva.m80.a.c(sb, " AFTER ", str2, " ON `", str);
            com.amazon.aps.iva.m80.a.c(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            com.amazon.aps.iva.m80.a.c(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            aVar2.f(sb.toString());
        }
    }

    public final void c(com.amazon.aps.iva.u8.a aVar) {
        com.amazon.aps.iva.v8.a aVar2 = (com.amazon.aps.iva.v8.a) aVar;
        if (aVar2.b.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.d.h.readLock();
                readLock.lock();
                int[] a2 = this.h.a();
                if (a2 == null) {
                    readLock.unlock();
                    return;
                }
                int length = a2.length;
                aVar2.a();
                for (int i = 0; i < length; i++) {
                    int i2 = a2[i];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            String str = this.b[i];
                            StringBuilder sb = new StringBuilder();
                            String[] strArr = k;
                            for (int i3 = 0; i3 < 3; i3++) {
                                String str2 = strArr[i3];
                                sb.setLength(0);
                                sb.append("DROP TRIGGER IF EXISTS ");
                                sb.append("`");
                                sb.append("room_table_modification_trigger_");
                                sb.append(str);
                                sb.append("_");
                                sb.append(str2);
                                sb.append("`");
                                aVar2.f(sb.toString());
                            }
                        }
                    } else {
                        b(aVar2, i);
                    }
                }
                aVar2.k();
                aVar2.c();
                b bVar = this.h;
                synchronized (bVar) {
                    bVar.e = false;
                }
                readLock.unlock();
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }
}
