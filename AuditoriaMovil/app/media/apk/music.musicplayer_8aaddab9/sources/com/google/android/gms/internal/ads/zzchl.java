package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzchl<T> implements zzfsm<T> {
    private final zzfsu<T> zza = zzfsu.zza();

    private static final boolean zza(boolean z) {
        if (!z) {
            com.google.android.gms.ads.internal.zzt.zzg().zzl(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j2, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final boolean zzc(T t) {
        boolean zzp = this.zza.zzp(t);
        zza(zzp);
        return zzp;
    }

    public final boolean zzd(Throwable th) {
        boolean zzq = this.zza.zzq(th);
        zza(zzq);
        return zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzfsm
    public final void zze(Runnable runnable, Executor executor) {
        this.zza.zze(runnable, executor);
    }
}
