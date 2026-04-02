package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {
    private com.applovin.impl.mediation.debugger.a.b.b a;
    private k b;
    private MaxAdView c;
    private MaxAdView d;
    private MaxInterstitialAd e;
    private MaxRewardedInterstitialAd f;
    private MaxRewardedAd g;
    private String h;
    private AdControlButton i;
    private AdControlButton j;
    private AdControlButton k;
    private AdControlButton l;
    private AdControlButton m;

    private AdControlButton a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.i;
        }
        if (str.equals("test_mode_mrec")) {
            return this.j;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.k;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.l;
        }
        if (str.equals(this.h)) {
            return this.m;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (!this.a.o().contains(maxAdFormat)) {
            findViewById(R.id.banner_control_view).setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.b.W(), this);
        this.c = maxAdView;
        maxAdView.setListener(this);
        frameLayout.addView(this.c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
        this.i = adControlButton;
        adControlButton.setOnClickListener(this);
        this.i.setFormat(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        this.b.H().a(this.a.g());
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.c;
        } else if (MaxAdFormat.MREC != maxAdFormat) {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.e.loadAd();
                return;
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f.loadAd();
                return;
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.g.loadAd();
                return;
            } else {
                return;
            }
        } else {
            maxAdView = this.d;
        }
        maxAdView.loadAd();
    }

    private void b() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        if (!this.a.o().contains(MaxAdFormat.MREC)) {
            findViewById(R.id.mrec_control_view).setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView("test_mode_mrec", MaxAdFormat.MREC, this.b.W(), this);
        this.d = maxAdView;
        maxAdView.setListener(this);
        frameLayout.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
        this.j = adControlButton;
        adControlButton.setOnClickListener(this);
        this.j.setFormat(MaxAdFormat.MREC);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.e.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.g.showAd();
        }
    }

    private void c() {
        if (!this.a.o().contains(MaxAdFormat.INTERSTITIAL)) {
            findViewById(R.id.interstitial_control_view).setVisibility(8);
            return;
        }
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.b.W(), this);
        this.e = maxInterstitialAd;
        maxInterstitialAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
        this.k = adControlButton;
        adControlButton.setOnClickListener(this);
        this.k.setFormat(MaxAdFormat.INTERSTITIAL);
    }

    private void d() {
        if (!this.a.o().contains(MaxAdFormat.REWARDED)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.a.g();
        this.h = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.b.W(), this);
        this.g = maxRewardedAd;
        maxRewardedAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.m = adControlButton;
        adControlButton.setOnClickListener(this);
        this.m.setFormat(MaxAdFormat.REWARDED);
    }

    public void initialize(com.applovin.impl.mediation.debugger.a.b.b bVar) {
        this.a = bVar;
        this.b = bVar.s();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        AdControlButton a = a(maxAd.getAdUnitId());
        a.setControlState(AdControlButton.b.LOAD);
        Utils.showAlert("", "Failed to display " + a.getFormat().getDisplayName() + " with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a = a(str);
        a.setControlState(AdControlButton.b.LOAD);
        Utils.showAlert("", "Failed to load " + a.getFormat().getLabel() + " with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        a(maxAd.getAdUnitId()).setControlState(maxAd.getFormat().isAdViewAd() ? AdControlButton.b.LOAD : AdControlButton.b.SHOW);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (AdControlButton.b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            a(adControlButton.getFormat());
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOAD);
            b(adControlButton.getFormat());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a == null) {
            r.i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.a.h() + " Test Ads");
        a();
        b();
        c();
        d();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            r.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.b.H().a((String) null);
        MaxAdView maxAdView = this.c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }
}
