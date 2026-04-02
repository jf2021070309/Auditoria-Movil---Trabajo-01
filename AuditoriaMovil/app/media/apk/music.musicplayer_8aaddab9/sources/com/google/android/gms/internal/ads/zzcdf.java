package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
/* loaded from: classes.dex */
public final class zzcdf extends zzccy {
    private final RewardedAdLoadCallback zza;
    private final RewardedAd zzb;

    public zzcdf(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.zza = rewardedAdLoadCallback;
        this.zzb = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zze() {
        if (this.zza != null) {
            RewardedAd rewardedAd = this.zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzf(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzg(zzbcz zzbczVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzbczVar.zzb());
        }
    }
}
