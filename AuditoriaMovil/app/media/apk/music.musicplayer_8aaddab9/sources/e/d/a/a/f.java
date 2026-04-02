package e.d.a.a;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
public final class f extends AdListener implements UnifiedNativeAd.OnUnifiedNativeAdLoadedListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener {
    @VisibleForTesting
    public final AbstractAdViewAdapter a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final MediationNativeListener f6040b;

    public f(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.a = abstractAdViewAdapter;
        this.f6040b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        MediationNativeListener mediationNativeListener = this.f6040b;
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f6040b.onAdClosed(this.a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f6040b.onAdFailedToLoad(this.a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f6040b.onAdImpression(this.a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f6040b.onAdOpened(this.a);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        this.f6040b.zzc(this.a, nativeCustomTemplateAd, str);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.f6040b.zzb(this.a, nativeCustomTemplateAd);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
        MediationNativeListener mediationNativeListener = this.f6040b;
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
        new b(unifiedNativeAd);
    }
}
