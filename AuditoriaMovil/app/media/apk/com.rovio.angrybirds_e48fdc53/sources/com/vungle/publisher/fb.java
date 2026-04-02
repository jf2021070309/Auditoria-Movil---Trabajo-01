package com.vungle.publisher;

import com.vungle.publisher.fh;
import com.vungle.publisher.jj;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class fb extends jj<fg, fb, fh> {
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
    public fh.a a() {
        return this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jj.a<fg, fb, fh, el, ek> {
        @Inject
        Provider<fb> a;
        @Inject
        fh.a b;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cy.a
        /* renamed from: d */
        public fh.a a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public fb[] d(int i) {
            return new fb[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: e */
        public fb g_() {
            return this.a.get();
        }
    }
}
