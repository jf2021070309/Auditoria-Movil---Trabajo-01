package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzezj implements zzfrz<zzdrw> {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzezl zzb;
    final /* synthetic */ zzezm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezj(zzezm zzezmVar, zzelx zzelxVar, zzezl zzezlVar) {
        this.zzc = zzezmVar;
        this.zza = zzelxVar;
        this.zzb = zzezlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzexo zzexoVar;
        final zzbcz zzh;
        zzezc zzezcVar;
        zzdsa zzh2;
        Executor executor;
        zzexoVar = this.zzc.zze;
        zzdsb zzdsbVar = (zzdsb) zzexoVar.zzd();
        if (zzdsbVar == null) {
            zzh = zzfbm.zzb(th, null);
        } else {
            zzh = zzdsbVar.zzP().zzh(th);
        }
        synchronized (this.zzc) {
            if (zzdsbVar != null) {
                zzdsbVar.zzT().zzbD(zzh);
                executor = this.zzc.zzb;
                executor.execute(new Runnable(this, zzh) { // from class: com.google.android.gms.internal.ads.zzezi
                    private final zzezj zza;
                    private final zzbcz zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zzh;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzezc zzezcVar2;
                        zzezj zzezjVar = this.zza;
                        zzbcz zzbczVar = this.zzb;
                        zzezcVar2 = zzezjVar.zzc.zzd;
                        zzezcVar2.zzbD(zzbczVar);
                    }
                });
            } else {
                zzezcVar = this.zzc.zzd;
                zzezcVar.zzbD(zzh);
                zzh2 = this.zzc.zzh(this.zzb);
                zzh2.zza().zzP().zze().zzp();
            }
            zzfbh.zza(zzh.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzdrw zzdrwVar) {
        zzezc zzezcVar;
        Executor executor;
        zzezc zzezcVar2;
        zzezc zzezcVar3;
        zzdrw zzdrwVar2 = zzdrwVar;
        synchronized (this.zzc) {
            zzdfj zzo = zzdrwVar2.zzo();
            zzezcVar = this.zzc.zzd;
            zzo.zzd(zzezcVar);
            this.zza.zzb(zzdrwVar2);
            executor = this.zzc.zzb;
            zzezcVar2 = this.zzc.zzd;
            zzezcVar2.getClass();
            executor.execute(zzezh.zza(zzezcVar2));
            zzezcVar3 = this.zzc.zzd;
            zzezcVar3.zzu();
        }
    }
}
