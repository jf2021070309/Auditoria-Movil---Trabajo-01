package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public abstract class zzfrp<T> extends zzfsl<T> {
    private final Executor zza;
    public final /* synthetic */ zzfrq zzb;

    public zzfrp(zzfrq zzfrqVar, Executor executor) {
        this.zzb = zzfrqVar;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    public abstract void zzb(T t);

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final boolean zzd() {
        return this.zzb.isDone();
    }

    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e2) {
            this.zzb.zzq(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zzf(T t) {
        zzfrq.zzJ(this.zzb, null);
        zzb((zzfrp<T>) t);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zzg(Throwable th) {
        zzfrq.zzJ(this.zzb, null);
        if (th instanceof ExecutionException) {
            this.zzb.zzq(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzq(th);
        }
    }
}
