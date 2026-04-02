package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class zzfdf implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, a.R(25, "AdWorker(NG) #", this.zza.getAndIncrement()));
    }
}
