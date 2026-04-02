package com.vungle.publisher;

import com.vungle.publisher.cz;
import com.vungle.publisher.gk;
import com.vungle.publisher.gq;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class gv extends cz<gv, gq, gw, gk> implements eg {
    @Inject
    a s;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cz
    /* renamed from: D */
    public gq.a a() {
        return this.s.d();
    }

    @Override // com.vungle.publisher.eg
    public void a_(Long l) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: E */
    public a b_() {
        return this.s;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends cz.a<gv, gq, gw, gk, wj> {
        @Inject
        gk.a c;
        @Inject
        gq.a e;
        @Inject
        Provider<gv> f;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        /* renamed from: g */
        public gk.a a() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cz.a
        /* renamed from: h */
        public gq.a d() {
            return this.e;
        }

        @Override // com.vungle.publisher.cz.a
        public m e() {
            return m.third_party_mraid;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: i */
        public gv g_() {
            return this.f.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public gv[] d(int i) {
            return new gv[i];
        }
    }
}
