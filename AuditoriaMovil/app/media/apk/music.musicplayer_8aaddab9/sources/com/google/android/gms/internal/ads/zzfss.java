package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zzfss extends zzfsp implements ScheduledExecutorService, zzfsn {
    public final ScheduledExecutorService zza;

    public zzfss(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        zzftb zza = zzftb.zza(runnable, null);
        return new zzfsq(zza, this.zza.schedule(zza, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        zzftb zzftbVar = new zzftb(callable);
        return new zzfsq(zzftbVar, this.zza.schedule(zzftbVar, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzfsr zzfsrVar = new zzfsr(runnable);
        return new zzfsq(zzfsrVar, this.zza.scheduleAtFixedRate(zzfsrVar, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzfsr zzfsrVar = new zzfsr(runnable);
        return new zzfsq(zzfsrVar, this.zza.scheduleWithFixedDelay(zzfsrVar, j2, j3, timeUnit));
    }
}
