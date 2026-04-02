package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzeme implements zzfrz<zzcxg> {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzdlb zzb;
    final /* synthetic */ zzemf zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeme(zzemf zzemfVar, zzelx zzelxVar, zzdlb zzdlbVar) {
        this.zzc = zzemfVar;
        this.zza = zzelxVar;
        this.zzb = zzdlbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzcoj zzcojVar;
        final zzbcz zzh = this.zzb.zzR().zzh(th);
        this.zzb.zzS().zzbD(zzh);
        zzcojVar = this.zzc.zzb;
        zzcojVar.zze().execute(new Runnable(this, zzh) { // from class: com.google.android.gms.internal.ads.zzemd
            private final zzeme zza;
            private final zzbcz zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzh;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzelv zzelvVar;
                zzeme zzemeVar = this.zza;
                zzbcz zzbczVar = this.zzb;
                zzelvVar = zzemeVar.zzc.zzd;
                zzelvVar.zze().zzbD(zzbczVar);
            }
        });
        zzfbh.zza(zzh.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzcxg zzcxgVar) {
        zzelv zzelvVar;
        zzcoj zzcojVar;
        zzcxg zzcxgVar2 = zzcxgVar;
        synchronized (this.zzc) {
            zzdfj zzo = zzcxgVar2.zzo();
            zzelvVar = this.zzc.zzd;
            zzo.zza(zzelvVar.zzc());
            this.zza.zzb(zzcxgVar2);
            zzcojVar = this.zzc.zzb;
            zzcojVar.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzemc
                private final zzeme zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzelv zzelvVar2;
                    zzelvVar2 = this.zza.zzc.zzd;
                    zzelvVar2.zzd().zzf();
                }
            });
        }
    }
}
