package com.applovin.impl.sdk.e;
/* loaded from: classes.dex */
public class z extends a {
    private final Runnable a;

    public z(com.applovin.impl.sdk.m mVar, Runnable runnable) {
        this(mVar, false, runnable);
    }

    public z(com.applovin.impl.sdk.m mVar, boolean z, Runnable runnable) {
        super("TaskRunnable", mVar, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.run();
    }
}
