package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbwd extends zzbvq {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbwe zzb;

    public zzbwd(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbwe zzbweVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzf(zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzg() {
        zzbwe zzbweVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null && (zzbweVar = this.zzb) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzbweVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zze(int i) {
    }
}
