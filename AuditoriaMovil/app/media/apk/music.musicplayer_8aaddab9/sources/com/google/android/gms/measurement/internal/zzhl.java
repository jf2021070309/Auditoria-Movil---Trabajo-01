package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class zzhl implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzia zzb;

    public zzhl(zzia zziaVar, AtomicReference atomicReference) {
        this.zzb = zziaVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            this.zza.set(Boolean.valueOf(this.zzb.zzs.zzf().zzs(this.zzb.zzs.zzh().zzl(), zzdy.zzJ)));
            this.zza.notify();
        }
    }
}
