package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.vungle.publisher.ei;
import com.vungle.publisher.el;
import com.vungle.publisher.ge;
import com.vungle.publisher.jg;
import java.io.File;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class ek extends jg<el> implements ge.b<el> {
    String a;
    ge b;
    @Inject
    el.a c;
    @Inject
    a d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: h */
    public a b_() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.jm
    /* renamed from: v */
    public el.a y() {
        return this.c;
    }

    @Override // com.vungle.publisher.ge.b
    public String a() {
        return o() + "." + w();
    }

    @Override // com.vungle.publisher.gd
    public String e() {
        return this.b.c();
    }

    public void a(String str) {
        this.b.a(str);
    }

    @Override // com.vungle.publisher.gd
    public void a(Integer num) {
        this.b.a(num);
    }

    public String w() {
        return "mp4";
    }

    @Override // com.vungle.publisher.gd
    public String i() {
        return this.b.f();
    }

    @Override // com.vungle.publisher.jg
    public Uri x() {
        return Uri.fromFile(new File(i()));
    }

    @Override // com.vungle.publisher.gd
    public boolean m() {
        return this.b.j();
    }

    @Override // com.vungle.publisher.ge.b
    public boolean t() {
        return this.b.k();
    }

    @Override // com.vungle.publisher.gd
    public boolean n() {
        return this.b.l();
    }

    @Override // com.vungle.publisher.ge.b
    public boolean u() {
        return this.b.m() && z();
    }

    boolean z() {
        return true;
    }

    @Override // com.vungle.publisher.dp
    public int q() {
        return this.b.h();
    }

    @Override // com.vungle.publisher.gd
    public boolean r() {
        return this.b.n();
    }

    @Override // com.vungle.publisher.gd
    public int s() {
        return super.q();
    }

    @Override // com.vungle.publisher.jg, com.vungle.publisher.jm, com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        this.b.a(a2);
        a2.put("checksum", this.a);
        return a2;
    }

    @Override // com.vungle.publisher.jg, com.vungle.publisher.jm, com.vungle.publisher.dp
    protected StringBuilder p() {
        StringBuilder p = super.p();
        this.b.a(p);
        a(p, "checksum", this.a);
        return p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jg.a<el, ek, wg> {
        private static final ei.b c = ei.b.localVideo;
        @Inject
        Provider<ek> a;
        @Inject
        ge.a b;

        @Override // com.vungle.publisher.jg.a
        protected ei.b a() {
            return c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jg.a, com.vungle.publisher.jm.a
        public ek a(el elVar, wg wgVar) {
            ek ekVar = (ek) super.a((a) elVar, (el) wgVar);
            if (ekVar != null) {
                return a(ekVar, wgVar);
            }
            return ekVar;
        }

        private ek a(ek ekVar, wg wgVar) {
            ekVar.a = wgVar.p();
            ekVar.a(wgVar.o());
            ekVar.a(wgVar.x());
            ekVar.r = c;
            return ekVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jg.a, com.vungle.publisher.jm.a
        public ek a(ek ekVar, Cursor cursor, boolean z) {
            super.a((a) ekVar, cursor, z);
            ekVar.b.a(cursor);
            ekVar.a = ce.e(cursor, "checksum");
            return ekVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public ek[] d(int i) {
            return new ek[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: d */
        public ek g_() {
            ek ekVar = this.a.get();
            ekVar.b = this.b.a(ekVar);
            return ekVar;
        }
    }
}
