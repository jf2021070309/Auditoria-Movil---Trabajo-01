package com.fyber.inneractive.sdk.dv.d;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
/* loaded from: classes.dex */
public final class b extends com.fyber.inneractive.sdk.a<InterstitialAd> {
    private final InterstitialAdLoadCallback e;
    private final FullScreenContentCallback l;

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean a_() {
        return true;
    }

    public b(u uVar, s sVar, f fVar) {
        super(uVar, sVar, fVar);
        this.e = new InterstitialAdLoadCallback() { // from class: com.fyber.inneractive.sdk.dv.d.b.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public final /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd interstitialAd2 = interstitialAd;
                if (b.this.b != null) {
                    b.this.d = interstitialAd2;
                    b.this.a();
                    b.this.b.c();
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                if (b.this.b != null) {
                    b.this.b.d();
                }
            }
        };
        this.l = new FullScreenContentCallback() { // from class: com.fyber.inneractive.sdk.dv.d.b.2
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdShowedFullScreenContent() {
                if (b.this.a != null) {
                    b.this.a.b();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                if (b.this.a != null) {
                    b.this.a.d();
                }
            }
        };
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(a aVar, Activity activity) {
        this.a = aVar;
        if (this.d != 0) {
            ((InterstitialAd) this.d).setFullScreenContentCallback(this.l);
            ((InterstitialAd) this.d).show(activity);
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.d.g
    public final boolean d() {
        return this.d != 0;
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        super.a(adRequest, cVar);
        InterstitialAd.load(l.p(), "FyberInterstitial", adRequest, this.e);
    }
}
