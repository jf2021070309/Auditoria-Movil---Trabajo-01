package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class zzcex implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzcex(zzcfa zzcfaVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, a.R(42, "AdWorker(SCION_TASK_EXECUTOR) #", this.zza.getAndIncrement()));
    }
}
