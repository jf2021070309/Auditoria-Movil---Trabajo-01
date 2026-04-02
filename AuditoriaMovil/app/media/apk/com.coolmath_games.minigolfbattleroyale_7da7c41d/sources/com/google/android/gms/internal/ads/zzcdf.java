package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcdf extends zzccy {
    private final RewardedAdLoadCallback zza;
    private final RewardedAd zzb;

    public zzcdf(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.zza = rewardedAdLoadCallback;
        this.zzb = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zze() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zza;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzg(zzbcz zzbczVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzbczVar.zzb());
        }
    }
}
