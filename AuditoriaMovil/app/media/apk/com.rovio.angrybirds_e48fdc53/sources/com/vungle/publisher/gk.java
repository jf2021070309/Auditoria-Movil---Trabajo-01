package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.cn;
import com.vungle.publisher.gl;
import com.vungle.publisher.li;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class gk extends dq implements dr<gk> {
    String w;
    @Inject
    a x;
    @Inject
    li.a y;

    @Override // com.vungle.publisher.dr
    public /* synthetic */ String d() {
        return (String) super.c_();
    }

    @Override // com.vungle.publisher.cn
    /* renamed from: t */
    public a a() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: u */
    public a b_() {
        return a();
    }

    @Override // com.vungle.publisher.dq
    /* renamed from: v */
    public li s() {
        return this.y.a(this.w);
    }

    @Override // com.vungle.publisher.cn
    protected boolean b() {
        return true;
    }

    @Override // com.vungle.publisher.cn, com.vungle.publisher.dp
    protected ContentValues a(boolean z) {
        ContentValues a2 = super.a(z);
        a2.put("html_content", this.w);
        return a2;
    }

    @Override // com.vungle.publisher.dr
    /* renamed from: w */
    public gk m_() {
        return this;
    }

    @Override // com.vungle.publisher.dr
    public boolean l_() {
        return true;
    }

    @Override // com.vungle.publisher.dr
    public List<gd<gk>> k_() {
        return new ArrayList();
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends cn.a<gk, wj> implements ea<gk, wj> {
        @Inject
        Provider<gk> e;
        @Inject
        gl.a f;

        @Override // com.vungle.publisher.ea
        public /* bridge */ /* synthetic */ dr<gk> a(String str, boolean z) {
            return (dr) super.a((a) str, z);
        }

        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.ea
        public gk a(wj wjVar) {
            gk gkVar = (gk) super.a((a) wjVar);
            gkVar.w = wjVar.n();
            gkVar.a(cn.c.aware);
            return gkVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.dp.a
        public gk a(gk gkVar, Cursor cursor, boolean z) {
            super.a((a) gkVar, cursor, z);
            gkVar.w = ce.e(cursor, "html_content");
            return gkVar;
        }

        @Override // com.vungle.publisher.cn.a
        protected m a() {
            return m.third_party_mraid;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: e */
        public gk g_() {
            return this.e.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public gk[] d(int i) {
            return new gk[i];
        }

        @Override // com.vungle.publisher.ea
        public cn.a<gk, wj> n_() {
            return this;
        }

        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.dp.a
        public int a(List<gk> list) {
            return d().a(list);
        }

        @Override // com.vungle.publisher.ea
        /* renamed from: f */
        public gl d() {
            return this.f.a(this);
        }
    }
}
