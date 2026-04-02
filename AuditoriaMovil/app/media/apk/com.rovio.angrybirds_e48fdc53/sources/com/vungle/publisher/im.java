package com.vungle.publisher;

import com.vungle.publisher.hs;
import com.vungle.publisher.je;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class im extends je<im, hr, wm, ji, hs.a, wv> {
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
    public static class a extends je.a<im, hr, wm, ji, hs.a, wv> {
        @Inject
        Provider<im> a;
        @Inject
        hs.a b;

        @Override // com.vungle.publisher.je.a
        /* renamed from: a */
        public hs.a c() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.je.a
        /* renamed from: b */
        public im d() {
            return this.a.get();
        }
    }
}
