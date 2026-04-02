package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzefv implements zzfrz<zzcvh> {
    final /* synthetic */ zzefw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefv(zzefw zzefwVar) {
        this.zza = zzefwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzcwe zzcweVar;
        zzdbe zzdbeVar;
        zzcweVar = this.zza.zza;
        zzbcz zzh = zzcweVar.zzY().zzh(th);
        zzdbeVar = this.zza.zzd;
        zzdbeVar.zzbD(zzh);
        zzfbh.zza(zzh.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzcvh zzcvhVar) {
        zzcvhVar.zzS();
    }
}
