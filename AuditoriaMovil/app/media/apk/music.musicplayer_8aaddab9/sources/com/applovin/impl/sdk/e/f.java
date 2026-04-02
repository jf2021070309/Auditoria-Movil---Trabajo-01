package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.o;
/* loaded from: classes.dex */
public class f extends com.applovin.impl.sdk.e.a {
    private final a a;

    /* loaded from: classes.dex */
    public interface a {
        void a(o.a aVar);
    }

    public f(com.applovin.impl.sdk.m mVar, a aVar) {
        super("TaskCollectAdvertisingId", mVar, true);
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a(this.f4020b.V().l());
    }
}
