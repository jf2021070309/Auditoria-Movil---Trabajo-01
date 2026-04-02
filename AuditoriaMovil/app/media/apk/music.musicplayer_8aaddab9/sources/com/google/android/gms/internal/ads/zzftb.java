package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzftb<V> extends zzfrt<V> implements RunnableFuture<V> {
    @CheckForNull
    private volatile zzfsl<?> zza;

    public zzftb(zzfrj<V> zzfrjVar) {
        this.zza = new zzfsz(this, zzfrjVar);
    }

    public zzftb(Callable<V> callable) {
        this.zza = new zzfta(this, callable);
    }

    public static <V> zzftb<V> zza(Runnable runnable, V v) {
        return new zzftb<>(Executors.callable(runnable, v));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfsl<?> zzfslVar = this.zza;
        if (zzfslVar != null) {
            zzfslVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    public final String zzc() {
        zzfsl<?> zzfslVar = this.zza;
        if (zzfslVar != null) {
            String zzfslVar2 = zzfslVar.toString();
            return a.s(new StringBuilder(zzfslVar2.length() + 7), "task=[", zzfslVar2, "]");
        }
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zzd() {
        zzfsl<?> zzfslVar;
        if (zzo() && (zzfslVar = this.zza) != null) {
            zzfslVar.zzh();
        }
        this.zza = null;
    }
}
