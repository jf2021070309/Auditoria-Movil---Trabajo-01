package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzevc implements zzfrz {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzevd zzb;
    final /* synthetic */ zzevf zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzevc(zzevf zzevfVar, zzelx zzelxVar, zzevd zzevdVar) {
        this.zzc = zzevfVar;
        this.zza = zzelxVar;
        this.zzb = zzevdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzexo zzexoVar;
        final zzbcz zzh;
        zzevv zzevvVar;
        zzdak zzk;
        Executor executor;
        zzexoVar = this.zzc.zze;
        zzcup zzcupVar = (zzcup) zzexoVar.zzd();
        if (zzcupVar == null) {
            zzh = zzfbm.zzb(th, null);
        } else {
            zzh = zzcupVar.zzP().zzh(th);
        }
        synchronized (this.zzc) {
            zzevf.zzg(this.zzc, null);
            if (zzcupVar != null) {
                zzcupVar.zzO().zzbD(zzh);
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfP)).booleanValue()) {
                    executor = this.zzc.zzc;
                    executor.execute(new Runnable(this, zzh) { // from class: com.google.android.gms.internal.ads.zzevb
                        private final zzevc zza;
                        private final zzbcz zzb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                            this.zzb = zzh;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzevv zzevvVar2;
                            zzevc zzevcVar = this.zza;
                            zzbcz zzbczVar = this.zzb;
                            zzevvVar2 = zzevcVar.zzc.zzd;
                            zzevvVar2.zzbD(zzbczVar);
                        }
                    });
                }
            } else {
                zzevvVar = this.zzc.zzd;
                zzevvVar.zzbD(zzh);
                zzk = this.zzc.zzk(this.zzb);
                ((zzcup) zzk.zzf()).zzP().zze().zzp();
            }
            zzfbh.zza(zzh.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzevv zzevvVar;
        zzcxg zzcxgVar = (zzcxg) obj;
        synchronized (this.zzc) {
            zzevf.zzg(this.zzc, null);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfP)).booleanValue()) {
                zzdfj zzo = zzcxgVar.zzo();
                zzevvVar = this.zzc.zzd;
                zzo.zzc(zzevvVar);
            }
            this.zza.zzb(zzcxgVar);
        }
    }
}
