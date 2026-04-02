package e.d.a.a;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbcv;
@VisibleForTesting
/* loaded from: classes.dex */
public final class c extends AdListener implements AppEventListener, zzbcv {
    @VisibleForTesting
    public final AbstractAdViewAdapter a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final MediationBannerListener f6037b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.a = abstractAdViewAdapter;
        this.f6037b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        MediationBannerListener mediationBannerListener = this.f6037b;
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f6037b.onAdClosed(this.a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f6037b.onAdFailedToLoad(this.a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        MediationBannerListener mediationBannerListener = this.f6037b;
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f6037b.onAdOpened(this.a);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f6037b.zza(this.a, str, str2);
    }
}
