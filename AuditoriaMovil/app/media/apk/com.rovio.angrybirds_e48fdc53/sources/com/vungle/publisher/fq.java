package com.vungle.publisher;

import com.vungle.publisher.ew;
import com.vungle.publisher.je;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class fq extends je<fq, el, wg, ji, ew.a, wv> {
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
    public static class a extends je.a<fq, el, wg, ji, ew.a, wv> {
        @Inject
        Provider<fq> a;
        @Inject
        ew.a b;

        @Override // com.vungle.publisher.je.a
        /* renamed from: a */
        public ew.a c() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.je.a
        /* renamed from: b */
        public fq d() {
            return this.a.get();
        }
    }
}
