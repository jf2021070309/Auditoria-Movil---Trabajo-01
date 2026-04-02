package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzbcv;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
final class zzb extends AdListener implements AppEventListener, zzbcv {
    final AbstractAdViewAdapter zza;
    final com.google.android.gms.ads.mediation.MediationBannerListener zzb;

    public zzb(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.zzb.onAdClicked(this.zza);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.zzb.onAdClosed(this.zza);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.onAdFailedToLoad(this.zza, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzb.onAdLoaded(this.zza);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.zzb.onAdOpened(this.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.zzb.zza(this.zza, str, str2);
    }
}
