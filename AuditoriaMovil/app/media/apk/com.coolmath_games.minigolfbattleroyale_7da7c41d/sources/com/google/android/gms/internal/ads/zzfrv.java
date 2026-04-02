package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfrv<V> extends zzfru<V> {
    private final zzfsm<V> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrv(zzfsm<V> zzfsmVar) {
        if (zzfsmVar == null) {
            throw null;
        }
        this.zza = zzfsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw, java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw, com.google.android.gms.internal.ads.zzfsm
    public final void zze(Runnable runnable, Executor executor) {
        this.zza.zze(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(j, timeUnit);
    }
}
