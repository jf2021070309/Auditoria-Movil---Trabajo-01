package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.a;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.d;
import com.facebook.ads.internal.protocol.e;
import com.facebook.ads.internal.protocol.g;
import java.util.EnumSet;
/* loaded from: classes2.dex */
public class InterstitialAd implements Ad {
    private static final d a = d.ADS;
    private final Context b;
    private final String c;
    private DisplayAdController d;
    private boolean e;
    private boolean f;
    private InterstitialAdListener g;

    public InterstitialAd(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    private void a(EnumSet<CacheFlag> enumSet, String str) {
        this.e = false;
        if (this.f) {
            throw new IllegalStateException("InterstitialAd cannot be loaded while being displayed. Make sure your adapter calls adapterListener.onInterstitialDismissed().");
        }
        if (this.d != null) {
            this.d.c();
            this.d = null;
        }
        this.d = new DisplayAdController(this.b, this.c, g.a(this.b.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, e.INTERSTITIAL, a, 1, true, enumSet);
        this.d.a(new a() { // from class: com.facebook.ads.InterstitialAd.1
            @Override // com.facebook.ads.internal.adapters.a
            public void a() {
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onAdClicked(InterstitialAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(View view) {
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(AdAdapter adAdapter) {
                InterstitialAd.this.e = true;
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onAdLoaded(InterstitialAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(com.facebook.ads.internal.protocol.a aVar) {
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onError(InterstitialAd.this, AdError.getAdErrorFromWrapper(aVar));
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void b() {
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onLoggingImpression(InterstitialAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void d() {
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onInterstitialDisplayed(InterstitialAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void e() {
                InterstitialAd.this.f = false;
                if (InterstitialAd.this.d != null) {
                    InterstitialAd.this.d.c();
                    InterstitialAd.this.d = null;
                }
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onInterstitialDismissed(InterstitialAd.this);
                }
            }
        });
        this.d.a(str);
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        if (this.d != null) {
            this.d.b(true);
            this.d = null;
        }
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.c;
    }

    public boolean isAdLoaded() {
        return false;
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
    }

    public void loadAd(EnumSet<CacheFlag> enumSet) {
    }

    @Override // com.facebook.ads.Ad
    public void loadAdFromBid(String str) {
    }

    public void loadAdFromBid(EnumSet<CacheFlag> enumSet, String str) {
    }

    public void setAdListener(InterstitialAdListener interstitialAdListener) {
        this.g = interstitialAdListener;
    }

    public boolean show() {
        if (this.e) {
            this.d.b();
            this.f = true;
            this.e = false;
            return true;
        } else if (this.g != null) {
            this.g.onError(this, AdError.INTERNAL_ERROR);
            return false;
        } else {
            return false;
        }
    }
}
