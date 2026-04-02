package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.dp;
import com.vungle.publisher.log.Logger;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public class ct extends dp<String> {
    public String a;
    public String b;
    @Inject
    a c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    public StringBuilder p() {
        return super.p();
    }

    @Override // com.vungle.publisher.dp
    public String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: a */
    public a b_() {
        return this.c;
    }

    @Override // com.vungle.publisher.dp
    protected String c() {
        return "ad_placement";
    }

    @Override // com.vungle.publisher.dp
    /* renamed from: e */
    public String c_() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    public void a(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    public String h_() {
        return "ad_id";
    }

    @Override // com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("ad_id", this.a);
        contentValues.put("placement_reference_id", this.b);
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    public int q() {
        String c = c();
        int delete = this.v.getWritableDatabase().delete(c, "placement_reference_id = ? AND ad_id = ? ", new String[]{this.b, this.a});
        switch (delete) {
            case 0:
                Logger.d(Logger.DATABASE_TAG, "no " + c + " rows updated ");
                break;
            case 1:
                Logger.d(Logger.DATABASE_TAG, "delete successful " + B());
                break;
            default:
                Logger.w(Logger.DATABASE_TAG, "deleted " + delete + " " + c + " records");
                break;
        }
        return delete;
    }

    @Override // com.vungle.publisher.dp, com.vungle.publisher.gj
    public int f_() {
        String c = c();
        int a2 = this.v.a(c, a(false), "placement_reference_id = ? AND ad_id = ? ", new String[]{this.b, this.a}, 3);
        switch (a2) {
            case 0:
                Logger.d(Logger.DATABASE_TAG, "no " + c + " rows updated ");
                break;
            case 1:
                Logger.d(Logger.DATABASE_TAG, "update successful " + B());
                break;
            default:
                Logger.w(Logger.DATABASE_TAG, "updated " + a2 + " " + c + " records");
                break;
        }
        return a2;
    }

    @Override // com.vungle.publisher.dp
    /* renamed from: h */
    public String e_() {
        return (String) super.e_();
    }

    @Override // com.vungle.publisher.dp
    /* renamed from: i */
    public String d_() {
        return (String) super.d_();
    }

    @Override // com.vungle.publisher.dp
    protected boolean i_() {
        return false;
    }

    /* loaded from: classes4.dex */
    public static class a extends dp.a<ct, String> {
        @Inject
        Provider<ct> a;

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ int a(List<ct> list) {
            return super.a((List) list);
        }

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ List<ct> a(String str, String[] strArr) {
            return super.a(str, strArr);
        }

        public ct a(String str, String str2) {
            ct g_ = g_();
            g_.t = String.class;
            g_.a = str2;
            g_.b = str;
            return g_;
        }

        @Override // com.vungle.publisher.dp.a
        public List<String> a(ct... ctVarArr) {
            return super.a((dp[]) ctVarArr);
        }

        @Override // com.vungle.publisher.dp.a
        protected String c() {
            return "ad_placement";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        public ct a(ct ctVar, Cursor cursor, boolean z) {
            ctVar.b = ce.e(cursor, "placement_reference_id");
            ctVar.a = ce.e(cursor, "ad_id");
            return ctVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public ct g_() {
            return this.a.get();
        }

        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public ct[] d(int i) {
            return new ct[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public String[] b(int i) {
            return new String[i];
        }

        public List<ct> a(String str) {
            return super.a("ad_id = ?", new String[]{str}, (String) null);
        }

        public List<ct> b(String str) {
            return super.a("placement_reference_id = ?", new String[]{str}, (String) null);
        }
    }
}
