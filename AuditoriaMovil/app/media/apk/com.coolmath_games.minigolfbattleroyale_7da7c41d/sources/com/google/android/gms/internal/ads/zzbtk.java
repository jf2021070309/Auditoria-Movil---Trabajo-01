package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbtk implements zzchp<zzbtt> {
    final /* synthetic */ zzbtm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
