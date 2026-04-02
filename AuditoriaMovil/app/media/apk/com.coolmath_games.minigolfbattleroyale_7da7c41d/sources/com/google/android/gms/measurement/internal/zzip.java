package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzip implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzjk zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzip(zzjk zzjkVar, AtomicReference atomicReference, zzp zzpVar) {
        this.zzc = zzjkVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzed zzedVar;
        synchronized (this.zza) {
            try {
            } catch (RemoteException e) {
                this.zzc.zzs.zzau().zzb().zzb("Failed to get app instance id", e);
                atomicReference = this.zza;
            }
            if (!this.zzc.zzs.zzd().zzi().zzh()) {
                this.zzc.zzs.zzau().zzh().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzs.zzk().zzE(null);
                this.zzc.zzs.zzd().zze.zzb(null);
                this.zza.set(null);
                this.zza.notify();
                return;
            }
            zzedVar = this.zzc.zzb;
            if (zzedVar == null) {
                this.zzc.zzs.zzau().zzb().zza("Failed to get app instance id");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzedVar.zzl(this.zzb));
            String str = (String) this.zza.get();
            if (str != null) {
                this.zzc.zzs.zzk().zzE(str);
                this.zzc.zzs.zzd().zze.zzb(str);
            }
            this.zzc.zzP();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
