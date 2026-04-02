package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdzu implements zzfrz<zzfal> {
    final /* synthetic */ zzdzv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzu(zzdzv zzdzvVar) {
        this.zza = zzdzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzddz zzddzVar;
        zzddzVar = this.zza.zzh;
        zzddzVar.zzbB(true);
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzfal zzfalVar) {
        zzddv zzddvVar;
        zzddvVar = this.zza.zzg;
        zzddvVar.zzq(zzfalVar);
    }
}
