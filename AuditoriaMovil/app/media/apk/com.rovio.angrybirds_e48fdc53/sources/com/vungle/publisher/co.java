package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.vungle.publisher.dp;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class co extends dp<Integer> {
    @Inject
    a a;
    private String b;
    private Integer c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: a */
    public a b_() {
        return this.a;
    }

    @Override // com.vungle.publisher.dp
    protected String c() {
        return "errors";
    }

    @Override // com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put(h_(), (Integer) this.u);
            contentValues.put("report_id", this.c);
        }
        contentValues.put(PluginConstants.KEY_ERROR_CODE, this.b);
        return contentValues;
    }

    @Override // com.vungle.publisher.dp
    public String toString() {
        return this.b;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends dp.a<co, Integer> {
        @Inject
        Provider<co> a;

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ int a(List<co> list) {
            return super.a((List) list);
        }

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ List<co> a(String str, String[] strArr) {
            return super.a(str, strArr);
        }

        public co a(Integer num, String str) {
            co g_ = g_();
            g_.b = str;
            g_.c = num;
            return g_;
        }

        @Override // com.vungle.publisher.dp.a
        protected String c() {
            return "errors";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        public co a(co coVar, Cursor cursor, boolean z) {
            coVar.b = ce.e(cursor, PluginConstants.KEY_ERROR_CODE);
            coVar.c = ce.c(cursor, "report_id");
            return coVar;
        }

        public List<co> a(Integer num) {
            return a("report_id = ?", new String[]{num.toString()});
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public co g_() {
            return this.a.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public co[] d(int i) {
            return new co[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public Integer[] b(int i) {
            return new Integer[i];
        }
    }
}
