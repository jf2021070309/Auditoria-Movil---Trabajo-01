package com.vungle.publisher;

import com.vungle.publisher.cn;
import com.vungle.publisher.hq;
import com.vungle.publisher.im;
import com.vungle.publisher.jh;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class hr extends jh<hr, hq, wm> {
    @Inject
    a w;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.jh
    /* renamed from: s */
    public a x() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: t */
    public a b_() {
        return x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cn
    public boolean b() {
        return true;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jh.a<hr, hq, wm> {
        @Inject
        Provider<hr> e;
        @Inject
        hq.a f;
        @Inject
        im.a g;

        @Override // com.vungle.publisher.jh.a
        public hr a(wm wmVar) {
            hr hrVar = (hr) super.a((a) wmVar);
            hrVar.a(cn.c.ready);
            return hrVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cn.a
        public m a() {
            return m.vungle_streaming;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jh.a
        /* renamed from: d */
        public hq.a k() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.jh.a
        /* renamed from: e */
        public im.a j() {
            return this.g;
        }

        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.dp.a
        protected String c() {
            return com.umeng.analytics.pro.bg.aw;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public hr[] d(int i) {
            return new hr[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cn.a, com.vungle.publisher.dp.a
        /* renamed from: a */
        public String[] b(int i) {
            return new String[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: f */
        public hr g_() {
            return this.e.get();
        }
    }
}
