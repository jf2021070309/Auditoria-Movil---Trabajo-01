package com.vungle.publisher;

import com.vungle.publisher.id;
import com.vungle.publisher.jj;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class hx extends jj<ic, hx, id> {
    @Inject
    a e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: m */
    public a b_() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cy
    /* renamed from: n */
    public id.a a() {
        return this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jj.a<ic, hx, id, hr, hq> {
        @Inject
        Provider<hx> a;
        @Inject
        id.a b;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cy.a
        /* renamed from: d */
        public id.a a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public hx[] d(int i) {
            return new hx[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: e */
        public hx g_() {
            return this.a.get();
        }
    }
}
