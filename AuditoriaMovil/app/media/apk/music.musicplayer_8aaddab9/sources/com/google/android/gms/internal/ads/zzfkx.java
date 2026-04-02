package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zzfkx implements zzfkw {
    private zzfkx() {
    }

    public /* synthetic */ zzfkx(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final ExecutorService zza(int i2, ThreadFactory threadFactory, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final ExecutorService zzb(int i2) {
        return zza(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final ExecutorService zzc(ThreadFactory threadFactory, int i2) {
        return zza(1, threadFactory, 1);
    }
}
