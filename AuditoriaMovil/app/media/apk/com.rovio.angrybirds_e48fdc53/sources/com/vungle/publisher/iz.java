package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.dp;
import com.vungle.publisher.log.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class iz extends dp<Integer> {
    @Inject
    a a;
    String b;
    String c;
    String d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: a */
    public a b_() {
        return this.a;
    }

    @Override // com.vungle.publisher.dp
    protected String c() {
        return "template_replacements";
    }

    public String e() {
        return this.b;
    }

    public String h() {
        return this.c;
    }

    @Override // com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put(h_(), (Integer) this.u);
            contentValues.put("ad_id", this.d);
        }
        contentValues.put("key", this.b);
        contentValues.put("value", this.c);
        return contentValues;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends dp.a<iz, Integer> {
        @Inject
        Provider<iz> a;

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ int a(List<iz> list) {
            return super.a((List) list);
        }

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ List<iz> a(String str, String[] strArr) {
            return super.a(str, strArr);
        }

        public iz a(String str, String str2, String str3) {
            iz g_ = g_();
            g_.d = str;
            g_.b = str2;
            g_.c = str3;
            return g_;
        }

        public List<iz> a(String str, JSONObject jSONObject) {
            ArrayList arrayList = new ArrayList();
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(a(str, next, jSONObject.getString(next)));
                }
            } catch (Exception e) {
                Logger.e(Logger.DATABASE_TAG, "could not create template replacement list", e);
            }
            return arrayList;
        }

        protected List<iz> a(String str) {
            return a("ad_id = ?", new String[]{str});
        }

        public b b(String str) {
            return new b(a(str));
        }

        @Override // com.vungle.publisher.dp.a
        protected String c() {
            return "template_replacements";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        public iz a(iz izVar, Cursor cursor, boolean z) {
            izVar.d = ce.e(cursor, "ad_id");
            izVar.b = ce.e(cursor, "key");
            izVar.c = ce.e(cursor, "value");
            return izVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public iz g_() {
            return this.a.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public iz[] d(int i) {
            return new iz[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public Integer[] b(int i) {
            return new Integer[i];
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends vs {
        private final JSONObject a = new JSONObject();

        public b(List<iz> list) {
            try {
                for (iz izVar : list) {
                    this.a.put(izVar.e(), izVar.h());
                }
            } catch (Exception e) {
                Logger.e(Logger.PROTOCOL_TAG, "could not parse json", e);
            }
        }

        @Override // com.vungle.publisher.vs, com.vungle.publisher.vt
        /* renamed from: a */
        public JSONObject b() {
            return this.a;
        }
    }
}
