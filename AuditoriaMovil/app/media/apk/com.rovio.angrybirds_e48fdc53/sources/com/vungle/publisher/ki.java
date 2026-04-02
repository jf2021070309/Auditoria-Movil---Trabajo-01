package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.cz;
import com.vungle.publisher.ds;
import com.vungle.publisher.jn;
import com.vungle.publisher.kd;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class ki extends cz<ki, kd, kj, jn> implements eg {
    ds s;
    String w;
    @Inject
    a x;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cz
    /* renamed from: D */
    public kd.a a() {
        return this.x.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: E */
    public a b_() {
        return this.x;
    }

    public int F() {
        return this.s.a();
    }

    @Override // com.vungle.publisher.eg
    public void a_(Long l) {
        this.s.b(l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cz, com.vungle.publisher.dp
    public ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        this.s.a(a2);
        if (z) {
            a2.put("template_id", this.w);
        }
        return a2;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends cz.a<ki, kd, kj, jn, wr> {
        @Inject
        jn.a c;
        @Inject
        kd.a e;
        @Inject
        Provider<ki> f;
        @Inject
        ds.a g;

        @Override // com.vungle.publisher.cz.a
        public ki a(jn jnVar) {
            ki kiVar = (ki) super.a((a) jnVar);
            kiVar.s = this.g.a(kiVar);
            kiVar.w = jnVar.i();
            return kiVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a, com.vungle.publisher.dp.a
        public ki a(ki kiVar, Cursor cursor, boolean z) {
            super.a((a) kiVar, cursor, z);
            kiVar.o = ce.d(cursor, "download_end_millis");
            kiVar.w = ce.e(cursor, "template_id");
            return kiVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        public ki a(ki kiVar, jn jnVar, boolean z) {
            super.a((a) kiVar, (ki) jnVar, z);
            kiVar.s = this.g.a(kiVar);
            kiVar.w = ((jn) kiVar.a).i();
            return kiVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        /* renamed from: g */
        public jn.a a() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        /* renamed from: h */
        public kd.a d() {
            return this.e;
        }

        @Override // com.vungle.publisher.cz.a
        public m e() {
            return m.vungle_mraid;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: i */
        public ki g_() {
            return this.f.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public ki[] d(int i) {
            return new ki[i];
        }
    }
}
