package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfei implements zzfrz {
    final /* synthetic */ zzfdy zza;
    final /* synthetic */ zzfej zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfei(zzfej zzfejVar, zzfdy zzfdyVar) {
        this.zzb = zzfejVar;
        this.zza = zzfdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzfel zzfelVar;
        zzfelVar = this.zzb.zza.zzd;
        zzfelVar.zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zzb(Object obj) {
        zzfel zzfelVar;
        zzfelVar = this.zzb.zza.zzd;
        zzfelVar.zzd(this.zza);
    }
}
