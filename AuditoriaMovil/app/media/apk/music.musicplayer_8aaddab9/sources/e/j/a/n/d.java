package e.j.a.n;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import e.j.d.c0.a0;
import i.a.j;
import n.a.a;
/* loaded from: classes2.dex */
public final class d extends InterstitialAdLoadCallback {
    public final /* synthetic */ j<a0<? extends InterstitialAd>> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f8480b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(j<? super a0<? extends InterstitialAd>> jVar, e eVar) {
        this.a = jVar;
        this.f8480b = eVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        h.o.c.j.e(loadAdError, "error");
        a.c b2 = n.a.a.b("PremiumHelper");
        StringBuilder y = e.a.d.a.a.y("AdMobInterstitial: Failed to load ");
        y.append(loadAdError.getCode());
        y.append(" (");
        y.append(loadAdError.getMessage());
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        b2.b(y.toString(), new Object[0]);
        if (this.a.a()) {
            this.a.resumeWith(new a0.b(new IllegalStateException(loadAdError.getMessage())));
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        h.o.c.j.e(interstitialAd2, "ad");
        n.a.a.b("PremiumHelper").a(h.o.c.j.i("AdMobInterstitial: loaded ad from ", interstitialAd2.getResponseInfo().getMediationAdapterClassName()), new Object[0]);
        if (this.a.a()) {
            interstitialAd2.setOnPaidEventListener(new c(this.f8480b, interstitialAd2));
            this.a.resumeWith(new a0.c(interstitialAd2));
        }
    }
}
