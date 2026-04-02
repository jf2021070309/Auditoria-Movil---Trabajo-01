package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class zzhq implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzia zzb;

    public zzhq(zzia zziaVar, AtomicReference atomicReference) {
        this.zzb = zziaVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            this.zza.set(Long.valueOf(this.zzb.zzs.zzf().zzi(this.zzb.zzs.zzh().zzl(), zzdy.zzL)));
            this.zza.notify();
        }
    }
}
