package com.vungle.publisher;

import com.vungle.publisher.je;
import com.vungle.publisher.jy;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class ks extends je<ks, jn, wr, jy, jy.a, vu> {
    @Inject
    a a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.je
    /* renamed from: a */
    public a b() {
        return this.a;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends je.a<ks, jn, wr, jy, jy.a, vu> {
        @Inject
        Provider<ks> a;
        @Inject
        jy.a b;

        @Override // com.vungle.publisher.je.a
        /* renamed from: a */
        public jy.a c() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.je.a
        /* renamed from: b */
        public ks d() {
            return this.a.get();
        }
    }
}
