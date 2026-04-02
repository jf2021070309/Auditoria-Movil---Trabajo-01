package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbtk implements zzchp<zzbtt> {
    public final /* synthetic */ zzbtm zza;

    public zzbtk(zzbtm zzbtmVar) {
        this.zza = zzbtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchp
    public final /* bridge */ /* synthetic */ void zza(zzbtt zzbttVar) {
        zzbtr zzbtrVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbtrVar = this.zza.zzb;
        zzbtrVar.zzb();
    }
}
