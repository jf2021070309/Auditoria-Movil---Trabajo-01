package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.m;
/* loaded from: classes.dex */
public class f extends com.applovin.impl.sdk.e.a {
    private final a a;

    /* loaded from: classes.dex */
    public interface a {
        void a(m.a aVar);
    }

    public f(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a(this.b.T().j());
    }
}
