package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
final class zzd extends FullScreenContentCallback {
    @VisibleForTesting
    final AbstractAdViewAdapter zza;
    @VisibleForTesting
    final MediationInterstitialListener zzb;

    public zzd(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.zzb.onAdClosed(this.zza);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.zzb.onAdOpened(this.zza);
    }
}
