package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfsa<V> implements Runnable {
    final Future<V> zza;
    final zzfrz<? super V> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsa(Future<V> future, zzfrz<? super V> zzfrzVar) {
        this.zza = future;
        this.zzb = zzfrzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future<V> future = this.zza;
        if (!(future instanceof zzfte) || (zza = zzftf.zza((zzfte) future)) == null) {
            try {
                this.zzb.zzb(zzfsd.zzq(this.zza));
                return;
            } catch (Error e) {
                e = e;
                this.zzb.zza(e);
                return;
            } catch (RuntimeException e2) {
                e = e2;
                this.zzb.zza(e);
                return;
            } catch (ExecutionException e3) {
                this.zzb.zza(e3.getCause());
                return;
            }
        }
        this.zzb.zza(zza);
    }

    public final String toString() {
        zzflr zza = zzfls.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
