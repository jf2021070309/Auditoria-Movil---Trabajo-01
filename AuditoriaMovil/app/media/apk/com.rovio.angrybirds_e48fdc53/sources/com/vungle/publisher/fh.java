package com.vungle.publisher;

import com.vungle.publisher.jl;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class fh extends jl<fb> {
    @Inject
    a e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.dp
    /* renamed from: m */
    public a b_() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends jl.b<fh, fb> {
        @Inject
        Provider<fh> a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: c */
        public fh[] d(int i) {
            return new fh[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.dp.a
        /* renamed from: a */
        public fh g_() {
            return this.a.get();
        }
    }
}
