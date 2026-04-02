package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbti implements zzchn {
    public final /* synthetic */ zzbtr zza;
    public final /* synthetic */ zzbts zzb;

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
