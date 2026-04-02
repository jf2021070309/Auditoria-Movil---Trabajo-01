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
public class a implements c {
    private final Context a;
    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122.a b;
    protected List<String> c = new ArrayList();

    public a(Context context, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122.a aVar) {
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
        return "CREATE TABLE IF NOT EXISTS " + j.m().e().b() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public Context a() {
        return this.a;
    }

    public List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> a(int i, String str) {
        String str2;
        LinkedList linkedList;
        synchronized (this) {
            long a = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.a.a(i, a());
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("" + d() + " query db max :" + a + " limit:" + i);
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
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b = j.m().b();
                while (a2.moveToNext()) {
                    String string = a2.getString(a2.getColumnIndex("id"));
                    String string2 = a2.getString(a2.getColumnIndex("value"));
                    if (a2.getInt(a2.getColumnIndex("encrypt")) == 1) {
                        string2 = b.a(string2);
                    }
                    if (TextUtils.isEmpty(string2)) {
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("log_show_query : value is null");
                        this.c.add(string);
                    } else {
                        JSONObject jSONObject = new JSONObject(string2);
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a aVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a(string, jSONObject);
                        aVar.a(b());
                        aVar.b(c());
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.a(jSONObject, aVar);
                        linkedList.add(aVar);
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
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("" + d() + " query db actually size :" + linkedList.size());
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
            if (b == null || TextUtils.isEmpty(aVar.i())) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("log_show_save", "save error");
            } else {
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
            z = false;
            if (this.b != null) {
                int e = e();
                int b = this.b.b();
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.d("" + d() + " check dbCount:" + e + " MaxCacheCount:" + b + " message:" + i);
                if (!bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.d() || (i != 1 && i != 2) ? e >= b : e >= 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    public byte b() {
        return (byte) 0;
    }

    protected void b(List<String> list) {
        synchronized (this) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("adevent repo delete: " + list.size());
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(a(), "DELETE FROM " + d() + " WHERE " + a("id", list, 1000, true));
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.d.h.a0(), list.size());
        }
    }

    public byte c() {
        return (byte) 2;
    }

    public String d() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.e e = j.m().e();
        if (e != null) {
            return e.b();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 0
            android.content.Context r2 = r10.a()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.lang.String r3 = r10.d()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.lang.String r4 = "count(1)"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.c.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            if (r0 == 0) goto L28
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            goto L28
        L24:
            r1 = move-exception
            goto L2b
        L26:
            r2 = move-exception
            goto L35
        L28:
            if (r0 == 0) goto L3e
            goto L37
        L2b:
            if (r0 == 0) goto L32
            r0.close()     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L33
            goto L32
        L31:
            r0 = move-exception
        L32:
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r0 = move-exception
            goto L3b
        L35:
            if (r0 == 0) goto L3e
        L37:
            r0.close()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L3d
            goto L3e
        L3b:
            monitor-exit(r10)
            throw r0
        L3d:
            r0 = move-exception
        L3e:
            monitor-exit(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do.a.e():int");
    }
}
