package com.vungle.publisher;

import com.vungle.publisher.ji;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class ew extends ji {
    @Inject
    a d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: e */
    public a b_() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends ji.b<wg> {
        @Inject
        Provider<ew> a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public ew g_() {
            return this.a.get();
        }
    }
}
