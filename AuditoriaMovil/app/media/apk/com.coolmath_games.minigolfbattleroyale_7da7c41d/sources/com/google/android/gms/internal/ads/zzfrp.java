package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfrp<T> extends zzfsl<T> {
    private final Executor zza;
    final /* synthetic */ zzfrq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrp(zzfrq zzfrqVar, Executor executor) {
        this.zzb = zzfrqVar;
        if (executor == null) {
            throw null;
        }
        this.zza = executor;
    }

    abstract void zzb(T t);

    @Override // com.google.android.gms.internal.ads.zzfsl
    final boolean zzd() {
        return this.zzb.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzq(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final void zzf(T t) {
        zzfrq.zzJ(this.zzb, null);
        zzb((zzfrp<T>) t);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final void zzg(Throwable th) {
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
