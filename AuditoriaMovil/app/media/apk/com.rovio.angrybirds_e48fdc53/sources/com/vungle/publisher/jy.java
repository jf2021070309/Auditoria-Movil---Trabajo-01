package com.vungle.publisher;

import android.database.Cursor;
import com.vungle.publisher.eh;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class jy extends eh {
    @Inject
    a d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: e */
    public a b_() {
        return this.d;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends eh.a<jy, vu, wr> {
        @Inject
        Provider<jy> a;

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ int a(List list) {
            return super.a(list);
        }

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ List a(String str, String[] strArr) {
            return super.a(str, strArr);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.vungle.publisher.eh.a
        public Map<jf, List<jy>> a(String str, vu vuVar) {
            if (vuVar == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (String str2 : vuVar.c()) {
                a(str, hashMap, new hf(str2), vuVar.a(str2));
            }
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.eh.a
        public jy a(jy jyVar, Cursor cursor, boolean z) {
            super.a((a) jyVar, cursor, z);
            jyVar.c = new hf(ce.e(cursor, "event"));
            return jyVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public jy g_() {
            return this.a.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public jy[] d(int i) {
            return new jy[i];
        }
    }
}
