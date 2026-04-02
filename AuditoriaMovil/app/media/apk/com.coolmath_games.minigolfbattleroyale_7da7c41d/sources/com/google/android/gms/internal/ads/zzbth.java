package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbth implements zzchp<zzbsn> {
    final /* synthetic */ zzbtr zza;
    final /* synthetic */ zzbts zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbth(zzbts zzbtsVar, zzbtr zzbtrVar) {
        this.zzb = zzbtsVar;
        this.zza = zzbtrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchp
    public final /* bridge */ /* synthetic */ void zza(zzbsn zzbsnVar) {
        Object obj;
        zzbtr zzbtrVar;
        zzbtr zzbtrVar2;
        zzbtr zzbtrVar3;
        obj = this.zzb.zza;
        synchronized (obj) {
            this.zzb.zzh = 0;
            zzbtrVar = this.zzb.zzg;
            if (zzbtrVar != null) {
                zzbtr zzbtrVar4 = this.zza;
                zzbtrVar2 = this.zzb.zzg;
                if (zzbtrVar4 != zzbtrVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbtrVar3 = this.zzb.zzg;
                    zzbtrVar3.zzc();
                }
            }
            this.zzb.zzg = this.zza;
        }
    }
}
