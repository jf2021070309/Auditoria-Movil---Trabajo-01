package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.vungle.publisher.ei;
import com.vungle.publisher.hr;
import com.vungle.publisher.jg;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class hq extends jg<hr> {
    @Inject
    hr.a a;
    @Inject
    a b;
    String c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: a */
    public a b_() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.jm
    /* renamed from: e */
    public hr.a y() {
        return this.a;
    }

    @Override // com.vungle.publisher.jg
    public Uri x() {
        return Uri.parse(this.c);
    }

    @Override // com.vungle.publisher.jg, com.vungle.publisher.jm, com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        a2.put("url", this.c);
        return a2;
    }

    @Override // com.vungle.publisher.jg, com.vungle.publisher.jm, com.vungle.publisher.dp
    protected StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "url", this.c);
        return p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jg.a<hr, hq, wm> {
        private static final ei.b b = ei.b.streamingVideo;
        @Inject
        Provider<hq> a;

        @Override // com.vungle.publisher.jg.a
        protected ei.b a() {
            return b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jg.a, com.vungle.publisher.jm.a
        public hq a(hr hrVar, wm wmVar) {
            hq hqVar = (hq) super.a((a) hrVar, (hr) wmVar);
            if (hqVar != null) {
                hqVar.c = wmVar.x();
                hqVar.r = b;
            }
            return hqVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jg.a, com.vungle.publisher.jm.a
        public hq a(hq hqVar, Cursor cursor, boolean z) {
            super.a((a) hqVar, cursor, z);
            hqVar.c = ce.e(cursor, "url");
            return hqVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public hq[] d(int i) {
            return new hq[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jm.a, com.vungle.publisher.dp.a
        /* renamed from: c */
        public Integer[] b(int i) {
            return new Integer[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: d */
        public hq g_() {
            return this.a.get();
        }
    }
}
