package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbti implements zzchn {
    final /* synthetic */ zzbtr zza;
    final /* synthetic */ zzbts zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbti(zzbts zzbtsVar, zzbtr zzbtrVar) {
        this.zzb = zzbtsVar;
        this.zza = zzbtrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zza() {
        Object obj;
        obj = this.zzb.zza;
        synchronized (obj) {
            this.zzb.zzh = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzc();
        }
    }
}
