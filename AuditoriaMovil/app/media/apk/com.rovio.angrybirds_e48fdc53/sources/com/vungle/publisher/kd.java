package com.vungle.publisher;

import com.vungle.publisher.cy;
import com.vungle.publisher.kj;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class kd extends cy<ki, kd, kj> {
    @Inject
    a e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cy
    /* renamed from: m */
    public kj.a a() {
        return this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: n */
    public a b_() {
        return this.e;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends cy.a<ki, kd, kj> {
        @Inject
        Provider<kd> a;
        @Inject
        kj.a b;

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ int a(List list) {
            return super.a(list);
        }

        @Override // com.vungle.publisher.dp.a
        public /* bridge */ /* synthetic */ List a(String str, String[] strArr) {
            return super.a(str, strArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.cy.a
        /* renamed from: d */
        public kj.a a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: e */
        public kd g_() {
            return this.a.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public kd[] d(int i) {
            return new kd[i];
        }
    }
}
