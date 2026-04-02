package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
/* loaded from: classes.dex */
public final class zzcdl extends zzccy {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcdm zzb;

    public zzcdl(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcdm zzcdmVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zze() {
        if (this.zza == null || this.zzb != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzf(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzg(zzbcz zzbczVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzbczVar.zzb());
        }
    }
}
