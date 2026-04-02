package com.vungle.publisher;

import com.vungle.publisher.hr;
import com.vungle.publisher.hx;
import com.vungle.publisher.jk;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class ic extends jk<ic, hx, id, hr, hq> {
    @Inject
    a s;
    @Inject
    hx.a w;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: D */
    public a b_() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cz
    /* renamed from: E */
    public hx.a a() {
        return this.w;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jk.a<ic, hx, id, hr, hq, wm> {
        @Inject
        hx.a c;
        @Inject
        hr.a e;
        @Inject
        Provider<ic> f;

        @Override // com.vungle.publisher.cz.a
        public m e() {
            return m.vungle_streaming;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        /* renamed from: g */
        public hr.a a() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        /* renamed from: h */
        public hx.a d() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public ic[] d(int i) {
            return new ic[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: i */
        public ic g_() {
            return this.f.get();
        }
    }
}
