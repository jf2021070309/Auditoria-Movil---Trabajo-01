package c.v;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public class e {
    public static final String[] a = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: c  reason: collision with root package name */
    public final String[] f2749c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Set<String>> f2750d;

    /* renamed from: e  reason: collision with root package name */
    public final f f2751e;

    /* renamed from: h  reason: collision with root package name */
    public volatile c.x.a.f.f f2754h;

    /* renamed from: i  reason: collision with root package name */
    public b f2755i;

    /* renamed from: f  reason: collision with root package name */
    public AtomicBoolean f2752f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f2753g = false;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: j  reason: collision with root package name */
    public final c.c.a.b.b<c, d> f2756j = new c.c.a.b.b<>();

    /* renamed from: k  reason: collision with root package name */
    public Runnable f2757k = new a();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, Integer> f2748b = new HashMap<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor j2 = e.this.f2751e.j(new c.x.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
            while (j2.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(j2.getInt(0)));
                } catch (Throwable th) {
                    j2.close();
                    throw th;
                }
            }
            j2.close();
            if (!hashSet.isEmpty()) {
                e.this.f2754h.a();
            }
            return hashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00ea A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v9 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.v.e.a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final long[] a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f2758b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f2759c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2760d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2761e;

        public b(int i2) {
            long[] jArr = new long[i2];
            this.a = jArr;
            boolean[] zArr = new boolean[i2];
            this.f2758b = zArr;
            this.f2759c = new int[i2];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                if (this.f2760d && !this.f2761e) {
                    int length = this.a.length;
                    int i2 = 0;
                    while (true) {
                        int i3 = 1;
                        if (i2 >= length) {
                            this.f2761e = true;
                            this.f2760d = false;
                            return this.f2759c;
                        }
                        boolean z = this.a[i2] > 0;
                        boolean[] zArr = this.f2758b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.f2759c;
                            if (!z) {
                                i3 = 2;
                            }
                            iArr[i2] = i3;
                        } else {
                            this.f2759c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i2++;
                    }
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* loaded from: classes.dex */
    public static class d {
        public final int[] a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f2762b;

        /* renamed from: c  reason: collision with root package name */
        public final c f2763c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f2764d;
    }

    public e(f fVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f2751e = fVar;
        this.f2755i = new b(strArr.length);
        this.f2750d = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f2749c = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f2748b.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.f2749c[i2] = str2.toLowerCase(locale);
            } else {
                this.f2749c[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f2748b.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f2748b;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public boolean a() {
        if (this.f2751e.i()) {
            if (!this.f2753g) {
                this.f2751e.f2766c.A();
            }
            if (this.f2753g) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    public final void b(c.x.a.b bVar, int i2) {
        String[] strArr;
        c.x.a.f.a aVar = (c.x.a.f.a) bVar;
        aVar.f2835b.execSQL(e.a.d.a.a.f("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i2, ", 0)"));
        String str = this.f2749c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            e.a.d.a.a.M(sb, str, "_", str2, "`");
            e.a.d.a.a.M(sb, " AFTER ", str2, " ON `", str);
            e.a.d.a.a.M(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            e.a.d.a.a.M(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            aVar.f2835b.execSQL(sb.toString());
        }
    }

    public final void c(c.x.a.b bVar, int i2) {
        String[] strArr;
        String str = this.f2749c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            ((c.x.a.f.a) bVar).f2835b.execSQL(e.a.d.a.a.t(sb, str, "_", str2, "`"));
        }
    }

    public void d(c.x.a.b bVar) {
        if (((c.x.a.f.a) bVar).f2835b.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f2751e.f2771h.readLock();
                readLock.lock();
                try {
                    int[] a2 = this.f2755i.a();
                    if (a2 == null) {
                        return;
                    }
                    int length = a2.length;
                    ((c.x.a.f.a) bVar).f2835b.beginTransaction();
                    for (int i2 = 0; i2 < length; i2++) {
                        int i3 = a2[i2];
                        if (i3 == 1) {
                            b(bVar, i2);
                        } else if (i3 == 2) {
                            c(bVar, i2);
                        }
                    }
                    ((c.x.a.f.a) bVar).f2835b.setTransactionSuccessful();
                    ((c.x.a.f.a) bVar).f2835b.endTransaction();
                    b bVar2 = this.f2755i;
                    synchronized (bVar2) {
                        bVar2.f2761e = false;
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                return;
            }
        }
    }
}
