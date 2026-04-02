package com.vungle.publisher;

import com.vungle.publisher.cy;
import com.vungle.publisher.gw;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class gq extends cy<gv, gq, gw> {
    @Inject
    a e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.cy
    /* renamed from: m */
    public gw.a a() {
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
    public static class a extends cy.a<gv, gq, gw> {
        @Inject
        Provider<gq> a;
        @Inject
        gw.a b;

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
        public gw.a a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: e */
        public gq g_() {
            return this.a.get();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public gq[] d(int i) {
            return new gq[i];
        }
    }
}
