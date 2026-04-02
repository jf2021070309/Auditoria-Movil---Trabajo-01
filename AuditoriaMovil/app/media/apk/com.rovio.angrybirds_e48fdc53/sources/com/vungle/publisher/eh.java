package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.dp;
import com.vungle.publisher.log.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class eh extends dp<Integer> {
    String a;
    String b;
    jf c;

    @Override // com.vungle.publisher.dp
    protected String c() {
        return "event_tracking";
    }

    @Override // com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", (Integer) this.u);
        contentValues.put("ad_id", this.b);
        contentValues.put("event", this.c.toString());
        contentValues.put("url", this.a);
        return contentValues;
    }

    @Override // com.vungle.publisher.dp
    public StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "ad_id", this.b);
        a(p, "event", this.c);
        a(p, "url", this.a);
        return p;
    }

    public String a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class a<E extends eh, T extends wu, R extends wc> extends dp.a<E, Integer> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Map<jf, List<E>> a(String str, T t);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vungle.publisher.dp.a
        protected /* bridge */ /* synthetic */ dp a(dp dpVar, Cursor cursor, boolean z) {
            return a((a<E, T, R>) ((eh) dpVar), cursor, z);
        }

        void a(String str) {
            Logger.v(Logger.DATABASE_TAG, "deleted " + this.d.getWritableDatabase().delete("event_tracking", "ad_id = ?", new String[]{str}) + " expired event_tracking records for adId: " + str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        public Map<jf, List<E>> a(R r) {
            String g = r.g();
            a(g);
            Map<jf, List<E>> a = a(g, (String) r.e());
            a((Map) a);
            return a;
        }

        void a(Map<jf, List<E>> map) {
            if (map != null) {
                for (List<E> list : map.values()) {
                    if (list != null) {
                        for (E e : list) {
                            e.d_();
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        public Map<jf, List<E>> b(String str) {
            HashMap hashMap;
            Cursor cursor = null;
            if (str == null) {
                Logger.w(Logger.DATABASE_TAG, "failed to fetch event_tracking records by ad_id: " + str);
                return null;
            }
            try {
                Logger.d(Logger.DATABASE_TAG, "fetching event_tracking records by ad_id: " + str);
                Cursor query = this.d.getReadableDatabase().query("event_tracking", null, "ad_id = ?", new String[]{str}, null, null, null);
                try {
                    int count = query.getCount();
                    Logger.v(Logger.DATABASE_TAG, count + " event_tracking for ad_id: " + str);
                    if (count > 0) {
                        HashMap hashMap2 = new HashMap();
                        while (query.moveToNext()) {
                            eh ehVar = (eh) g_();
                            b(ehVar, query, false);
                            a((Map<jf, List<HashMap>>) hashMap2, (HashMap) ehVar);
                        }
                        hashMap = hashMap2;
                    } else {
                        hashMap = null;
                    }
                    if (query != null) {
                        query.close();
                        return hashMap;
                    }
                    return hashMap;
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(String str, Map<jf, List<E>> map, jf jfVar, List<String> list) {
            List<E> a;
            if (list != null && list.size() > 0 && (a = a(str, jfVar, list)) != null && !a.isEmpty()) {
                map.put(jfVar, a);
            }
        }

        void a(Map<jf, List<E>> map, E e) {
            if (e != null) {
                jf jfVar = e.c;
                List<E> list = map.get(jfVar);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(jfVar, list);
                }
                list.add(e);
            }
        }

        List<E> a(String str, jf jfVar, List<String> list) {
            ArrayList arrayList;
            if (list == null || list.size() <= 0) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : list) {
                    E a = a(str, jfVar, str2);
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        E a(String str, jf jfVar, String str2) {
            if (jfVar == null || str2 == null) {
                return null;
            }
            E e = (E) g_();
            e.b = str;
            e.c = jfVar;
            e.a = str2;
            return e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Type inference failed for: r0v1, types: [I, java.lang.Integer] */
        public E a(E e, Cursor cursor, boolean z) {
            e.u = ce.c(cursor, "id");
            e.b = ce.e(cursor, "ad_id");
            e.a = ce.e(cursor, "url");
            return e;
        }

        @Override // com.vungle.publisher.dp.a
        protected String c() {
            return "event_tracking";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public Integer[] b(int i) {
            return new Integer[i];
        }
    }
}
