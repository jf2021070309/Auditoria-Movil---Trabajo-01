package com.fyber.inneractive.sdk.dv.d;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
/* loaded from: classes.dex */
public final class c extends com.fyber.inneractive.sdk.a<InterstitialAd> {
    private final AdListener e;
    private final AdListener l;

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean a_() {
        return true;
    }

    public c(u uVar, s sVar, f fVar) {
        super(uVar, sVar, fVar);
        this.e = new AdListener() { // from class: com.fyber.inneractive.sdk.dv.d.c.1
            public final void onAdFailedToLoad(int i) {
                if (c.this.b != null) {
                    c.this.b.d();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdLoaded() {
                if (c.this.b != null) {
                    c.this.a();
                    c.this.b.c();
                }
            }
        };
        this.l = new AdListener() { // from class: com.fyber.inneractive.sdk.dv.d.c.2
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClosed() {
                if (c.this.a != null) {
                    c.this.a.d();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdOpened() {
                if (c.this.a != null) {
                    c.this.a.b();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClicked() {
                if (c.this.a != null) {
                    c.this.a.a();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdImpression() {
                if (c.this.a != null) {
                    c.this.a.b();
                }
            }
        };
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(a aVar, Activity activity) {
        this.a = aVar;
        if (this.d != 0) {
            ((InterstitialAd) this.d).setAdListener(this.l);
            ((InterstitialAd) this.d).show();
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.d.g
    public final boolean d() {
        return this.d != 0 && ((InterstitialAd) this.d).isLoaded();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.google.android.gms.ads.InterstitialAd] */
    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        super.a(adRequest, cVar);
        this.d = new InterstitialAd(l.p());
        ((InterstitialAd) this.d).setAdListener(this.e);
        ((InterstitialAd) this.d).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.d).loadAd(adRequest);
    }
}
