package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbtn implements zzchp<zzbsn> {
    final /* synthetic */ zzbtm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtn(zzbtr zzbtrVar, zzbtm zzbtmVar) {
        this.zza = zzbtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchp
    public final /* bridge */ /* synthetic */ void zza(zzbsn zzbsnVar) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzg(zzbsnVar.zzk());
    }
}
