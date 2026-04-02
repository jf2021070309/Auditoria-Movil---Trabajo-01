package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzftb<V> extends zzfrt<V> implements RunnableFuture<V> {
    @CheckForNull
    private volatile zzfsl<?> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftb(zzfrj<V> zzfrjVar) {
        this.zza = new zzfsz(this, zzfrjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    protected final String zzc() {
        zzfsl<?> zzfslVar = this.zza;
        if (zzfslVar != null) {
            String obj = zzfslVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 7);
            sb.append("task=[");
            sb.append(obj);
            sb.append("]");
            return sb.toString();
        }
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final void zzd() {
        zzfsl<?> zzfslVar;
        if (zzo() && (zzfslVar = this.zza) != null) {
            zzfslVar.zzh();
        }
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftb(Callable<V> callable) {
        this.zza = new zzfta(this, callable);
    }
}
