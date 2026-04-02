package com.applovin.impl.sdk.e;
/* loaded from: classes.dex */
public class y extends a {
    private final Runnable a;

    public y(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this(kVar, false, runnable);
    }

    public y(com.applovin.impl.sdk.k kVar, boolean z, Runnable runnable) {
        super("TaskRunnable", kVar, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.run();
    }
}
