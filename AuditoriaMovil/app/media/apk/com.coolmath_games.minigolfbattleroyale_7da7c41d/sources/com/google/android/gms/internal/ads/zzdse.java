package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdse implements zzgla<zzazj> {
    private final zzgln<zzfar> zza;

    public zzdse(zzgln<zzfar> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzazj zzazjVar;
        if (((zzdat) this.zza).zza().zzo.zza == 3) {
            zzazjVar = zzazj.REWARDED_INTERSTITIAL;
        } else {
            zzazjVar = zzazj.REWARD_BASED_VIDEO_AD;
        }
        zzgli.zzb(zzazjVar);
        return zzazjVar;
    }
}
