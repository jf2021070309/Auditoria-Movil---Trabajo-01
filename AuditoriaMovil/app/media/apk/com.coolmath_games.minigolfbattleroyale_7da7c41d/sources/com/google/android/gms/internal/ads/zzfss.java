package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfss extends zzfsp implements ScheduledExecutorService, zzfsn {
    final ScheduledExecutorService zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfss(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        if (scheduledExecutorService == null) {
            throw null;
        }
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzftb zza = zzftb.zza(runnable, null);
        return new zzfsq(zza, this.zza.schedule(zza, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfsr zzfsrVar = new zzfsr(runnable);
        return new zzfsq(zzfsrVar, this.zza.scheduleAtFixedRate(zzfsrVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfsr zzfsrVar = new zzfsr(runnable);
        return new zzfsq(zzfsrVar, this.zza.scheduleWithFixedDelay(zzfsrVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzftb zzftbVar = new zzftb(callable);
        return new zzfsq(zzftbVar, this.zza.schedule(zzftbVar, j, timeUnit));
    }
}
