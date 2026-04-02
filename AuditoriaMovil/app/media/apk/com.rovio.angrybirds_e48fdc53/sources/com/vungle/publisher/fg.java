package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.ds;
import com.vungle.publisher.el;
import com.vungle.publisher.fb;
import com.vungle.publisher.jk;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class fg extends jk<fg, fb, fh, el, ek> implements eg {
    @Inject
    a s;
    @Inject
    fb.a w;
    ds x;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: D */
    public a b_() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cz
    /* renamed from: E */
    public fb.a a() {
        return this.w;
    }

    public int F() {
        return this.x.a();
    }

    @Override // com.vungle.publisher.eg
    public void a_(Long l) {
        this.x.b(l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cz, com.vungle.publisher.dp
    public ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        this.x.a(a2);
        return a2;
    }

    @Override // com.vungle.publisher.cz, com.vungle.publisher.dp
    public StringBuilder p() {
        StringBuilder p = super.p();
        a(p, "download_end_millis", this.o);
        return p;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jk.a<fg, fb, fh, el, ek, wg> {
        @Inject
        el.a c;
        @Inject
        fb.a e;
        @Inject
        Provider<fg> f;
        @Inject
        ds.a g;

        @Override // com.vungle.publisher.cz.a
        public m e() {
            return m.vungle_local;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        /* renamed from: g */
        public el.a a() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        /* renamed from: h */
        public fb.a d() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a, com.vungle.publisher.dp.a
        public fg a(fg fgVar, Cursor cursor, boolean z) {
            super.a((a) fgVar, cursor, z);
            fgVar.o = ce.d(cursor, "download_end_millis");
            return fgVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        public fg a(fg fgVar, el elVar, boolean z) {
            super.a((a) fgVar, (fg) elVar, z);
            fgVar.x = this.g.a(fgVar);
            return fgVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public fg[] d(int i) {
            return new fg[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: i */
        public fg g_() {
            return this.f.get();
        }
    }
}
