package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class zzhr implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzia zzb;

    public zzhr(zzia zziaVar, AtomicReference atomicReference) {
        this.zzb = zziaVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            this.zza.set(Integer.valueOf(this.zzb.zzs.zzf().zze(this.zzb.zzs.zzh().zzl(), zzdy.zzM)));
            this.zza.notify();
        }
    }
}
