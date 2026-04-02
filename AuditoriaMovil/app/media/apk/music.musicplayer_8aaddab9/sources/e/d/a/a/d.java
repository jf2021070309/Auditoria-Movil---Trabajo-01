package e.d.a.a;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
public final class d extends InterstitialAdLoadCallback {
    @VisibleForTesting
    public final AbstractAdViewAdapter a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final MediationInterstitialListener f6038b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.a = abstractAdViewAdapter;
        this.f6038b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f6038b.onAdFailedToLoad(this.a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        interstitialAd2.setFullScreenContentCallback(new e(abstractAdViewAdapter, this.f6038b));
        MediationInterstitialListener mediationInterstitialListener = this.f6038b;
        AbstractAdViewAdapter abstractAdViewAdapter2 = this.a;
    }
}
