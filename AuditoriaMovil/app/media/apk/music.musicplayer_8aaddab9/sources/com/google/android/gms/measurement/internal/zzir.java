package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class zzir implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ zzjo zzd;

    public zzir(zzjo zzjoVar, AtomicReference atomicReference, zzp zzpVar, boolean z) {
        this.zzd = zzjoVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
        this.zzc = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzeb zzebVar;
        synchronized (this.zza) {
            try {
                zzebVar = this.zzd.zzb;
            } catch (RemoteException e2) {
                this.zzd.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e2);
                atomicReference = this.zza;
            }
            if (zzebVar == null) {
                this.zzd.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzebVar.zze(this.zzb, this.zzc));
            this.zzd.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
