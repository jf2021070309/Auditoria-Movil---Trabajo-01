package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g implements c {
    private final Context a;
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122.a b;
    protected List<String> c = new ArrayList();

    public g(Context context, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122.a aVar) {
        this.a = context;
        this.b = aVar;
        if (aVar == null) {
            this.b = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122.a.c();
        }
    }

    private static String a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    private static String a(String str, List<?> list, int i, boolean z) {
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        int i2 = size % min == 0 ? size / min : (size / min) + 1;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String a = a(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(a);
            sb.append("')");
        }
        String sb2 = sb.toString();
        return a(sb2, str + str2 + "('')");
    }

    public static String f() {
        return "CREATE TABLE IF NOT EXISTS " + j.m().e().c() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public Context a() {
        return this.a;
    }

    public List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> a(int i, String str) {
        String str2;
        LinkedList linkedList;
        synchronized (this) {
            long a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.a.a(i, a());
            if (a <= 0 || TextUtils.isEmpty(str)) {
                str2 = null;
            } else {
                str2 = str + " DESC limit " + a;
            }
            String str3 = str2;
            linkedList = new LinkedList();
            this.c.clear();
            Cursor a2 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(a(), d(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str3);
            if (a2 != null) {
                while (a2.moveToNext()) {
                    try {
                        String string = a2.getString(a2.getColumnIndex("id"));
                        String string2 = a2.getString(a2.getColumnIndex("value"));
                        if (a2.getInt(a2.getColumnIndex("encrypt")) == 1) {
                            string2 = j.m().b().a(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.c.add(string);
                        } else {
                            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a aVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a(string, new JSONObject(string2));
                            aVar.b(c());
                            aVar.a(b());
                            linkedList.add(aVar);
                        }
                    } catch (Throwable th) {
                    }
                }
                if (a2 != null) {
                    try {
                        a2.close();
                        if (!this.c.isEmpty()) {
                            b(this.c);
                            this.c.clear();
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
        return linkedList;
    }

    public List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> a(String str) {
        List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> arrayList;
        synchronized (this) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122.a aVar = this.b;
            arrayList = aVar == null ? new ArrayList<>() : a(aVar.a(), str);
        }
        return arrayList;
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar) {
        synchronized (this) {
            JSONObject b = aVar.b();
            if (b != null && !TextUtils.isEmpty(aVar.i())) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", aVar.i());
                String b2 = j.m().b().b(b.toString());
                if (!TextUtils.isEmpty(b2)) {
                    contentValues.put("value", b2);
                    contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("retry", (Integer) 0);
                    contentValues.put("encrypt", (Integer) 1);
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(a(), d(), contentValues);
                }
            }
        }
    }

    public void a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list) {
        synchronized (this) {
            if (list != null) {
                if (list.size() != 0) {
                    LinkedList linkedList = new LinkedList();
                    for (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar : list) {
                        linkedList.add(aVar.i());
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.b(aVar);
                    }
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(a(), "DELETE FROM " + d() + " WHERE " + a("id", linkedList, 1000, true));
                }
            }
        }
    }

    public boolean a(int i) {
        boolean z;
        synchronized (this) {
            if (this.b != null) {
                z = e() >= this.b.b() ? true : true;
            }
            z = false;
        }
        return z;
    }

    public byte b() {
        return (byte) 1;
    }

    protected void b(List<String> list) {
        synchronized (this) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("states repo delete: " + list.size());
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(a(), "DELETE FROM " + d() + " WHERE " + a("id", list, 1000, true));
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.a0(), list.size());
        }
    }

    public byte c() {
        return (byte) 2;
    }

    public String d() {
        return j.m().e().c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r1 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.content.Context r1 = r9.a()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r9.d()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L28
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L25
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L23
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r2 = move-exception
            goto L2a
        L25:
            if (r1 == 0) goto L34
            goto L2c
        L28:
            r1 = move-exception
            r1 = 0
        L2a:
            if (r1 == 0) goto L34
        L2c:
            r1.close()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            goto L34
        L30:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L33:
            r1 = move-exception
        L34:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do.g.e():int");
    }
}
