package com.vungle.publisher;

import android.database.Cursor;
import com.vungle.publisher.da;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class gw extends da<gq> {
    @Inject
    a e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: m */
    public a b_() {
        return this.e;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends da.a<gq, gw> {
        @Inject
        Provider<gw> a;

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ int a(List list) {
            return super.a(list);
        }

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ List a(String str, String[] strArr) {
            return super.a(str, strArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public gw g_() {
            return this.a.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public gw[] d(int i) {
            return new gw[i];
        }

        @Override // com.vungle.publisher.da.a
        protected jf a(Cursor cursor) {
            return new hf(ce.e(cursor, "event"));
        }
    }
}
