package com.fyber.inneractive.sdk.dv.a;

import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.dv.c;
import com.fyber.inneractive.sdk.dv.e;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
/* loaded from: classes.dex */
public final class a extends com.fyber.inneractive.sdk.dv.a<AdView> {
    boolean a;
    boolean e;
    private final AdListener l;

    @Override // com.fyber.inneractive.sdk.d.g
    public final boolean a_() {
        return false;
    }

    public a(u uVar, s sVar, f fVar) {
        super(uVar, sVar, fVar);
        this.a = false;
        this.e = false;
        this.l = new AdListener() { // from class: com.fyber.inneractive.sdk.dv.a.a.1
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                com.fyber.inneractive.sdk.dv.c.b.a(a.this.f != null ? a.this.f.getSpotId() : null, com.fyber.inneractive.sdk.dv.b.a.Load, a.this.f, a.this.c(), loadAdError.getMessage());
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdLoaded() {
                if (a.this.b != null) {
                    a.this.e = true;
                    a.this.b.c();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdOpened() {
                if (a.this.c != null) {
                    a.this.c.a();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdImpression() {
                if (a.this.c != null) {
                    a.this.c.b();
                } else {
                    a.this.a = true;
                }
            }
        };
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.d.g
    public final boolean d() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.google.android.gms.ads.AdView] */
    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, c cVar) {
        super.a(adRequest, cVar);
        this.d = new AdView(l.p());
        AdView adView = (AdView) this.d;
        AdSize adSize = AdSize.BANNER;
        if (this.i != null && this.i.h() != null && this.i.h().a() == UnitDisplayType.MRECT) {
            adSize = AdSize.MEDIUM_RECTANGLE;
        }
        adView.setAdSize(adSize);
        ((AdView) this.d).setAdUnitId("FyberBanner");
        ((AdView) this.d).setAdListener(this.l);
        ((AdView) this.d).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(e eVar) {
        super.a(eVar);
        if (this.a) {
            eVar.b();
            this.a = false;
        }
    }
}
