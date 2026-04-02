package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
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
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.List;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {
    private com.applovin.impl.mediation.debugger.a.b.b a;

    /* renamed from: b  reason: collision with root package name */
    private m f3660b;

    /* renamed from: c  reason: collision with root package name */
    private MaxAdView f3661c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdView f3662d;

    /* renamed from: e  reason: collision with root package name */
    private MaxInterstitialAd f3663e;

    /* renamed from: f  reason: collision with root package name */
    private MaxRewardedInterstitialAd f3664f;

    /* renamed from: g  reason: collision with root package name */
    private MaxRewardedAd f3665g;

    /* renamed from: h  reason: collision with root package name */
    private MaxAd f3666h;

    /* renamed from: i  reason: collision with root package name */
    private MaxNativeAdLoader f3667i;

    /* renamed from: j  reason: collision with root package name */
    private String f3668j;

    /* renamed from: k  reason: collision with root package name */
    private AdControlButton f3669k;

    /* renamed from: l  reason: collision with root package name */
    private AdControlButton f3670l;

    /* renamed from: m  reason: collision with root package name */
    private AdControlButton f3671m;

    /* renamed from: n  reason: collision with root package name */
    private AdControlButton f3672n;
    private AdControlButton o;
    private AdControlButton p;
    private Button q;
    private Button r;
    private FrameLayout s;
    private FrameLayout t;

    private AdControlButton a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f3669k;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f3670l;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f3671m;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.f3672n;
        }
        if (str.equals(this.f3668j)) {
            return this.o;
        }
        if (str.equals("test_mode_native")) {
            return this.p;
        }
        throw new IllegalArgumentException(e.a.d.a.a.k("Invalid test mode ad unit identifier provided ", str));
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
        if (!this.a.p().contains(maxAdFormat)) {
            findViewById(R.id.banner_control_view).setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f3660b.Y(), this);
        this.f3661c = maxAdView;
        maxAdView.setListener(this);
        frameLayout.addView(this.f3661c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
        this.f3669k = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f3669k.setFormat(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        this.f3660b.J().a(this.a.h());
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            MaxAdView maxAdView = this.f3661c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            MaxAdView maxAdView2 = this.f3662d;
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            MaxInterstitialAd maxInterstitialAd = this.f3663e;
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f3664f;
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            MaxRewardedAd maxRewardedAd = this.f3665g;
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            MaxNativeAdLoader maxNativeAdLoader = this.f3667i;
        }
    }

    private void b() {
        this.s = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List<MaxAdFormat> p = this.a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (!p.contains(maxAdFormat)) {
            findViewById(R.id.mrec_control_view).setVisibility(8);
            this.s.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f3660b.Y(), this);
        this.f3662d = maxAdView;
        maxAdView.setListener(this);
        this.s.addView(this.f3662d, new FrameLayout.LayoutParams(-1, -1));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
        this.f3670l = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f3670l.setFormat(maxAdFormat);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f3663e.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f3664f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f3665g.showAd();
        }
    }

    private void c() {
        List<MaxAdFormat> p = this.a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (!p.contains(maxAdFormat)) {
            findViewById(R.id.interstitial_control_view).setVisibility(8);
            return;
        }
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f3660b.Y(), this);
        this.f3663e = maxInterstitialAd;
        maxInterstitialAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
        this.f3671m = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f3671m.setFormat(maxAdFormat);
    }

    private void d() {
        List<MaxAdFormat> p = this.a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!p.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        StringBuilder y = e.a.d.a.a.y("test_mode_rewarded_");
        y.append(this.a.h());
        String sb = y.toString();
        this.f3668j = sb;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(sb, this.f3660b.Y(), this);
        this.f3665g = maxRewardedAd;
        maxRewardedAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.o = adControlButton;
        adControlButton.setOnClickListener(this);
        this.o.setFormat(maxAdFormat);
    }

    private void e() {
        this.t = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (!this.a.q()) {
            findViewById(R.id.native_control_view).setVisibility(8);
            this.t.setVisibility(8);
            return;
        }
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f3660b.Y(), this);
        this.f3667i = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.3
            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdClicked(MaxAd maxAd) {
                a.this.onAdClicked(maxAd);
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoadFailed(String str, MaxError maxError) {
                a.this.onAdLoadFailed(str, maxError);
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                if (a.this.f3666h != null) {
                    a.this.f3667i.destroy(a.this.f3666h);
                }
                a.this.f3666h = maxAd;
                a.this.t.removeAllViews();
                a.this.t.addView(maxNativeAdView);
                a.this.onAdLoaded(maxAd);
            }
        });
        this.f3667i.setRevenueListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
        this.p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.p.setFormat(MaxAdFormat.NATIVE);
    }

    public void initialize(com.applovin.impl.mediation.debugger.a.b.b bVar) {
        this.a = bVar;
        this.f3660b = bVar.v();
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
        a(maxAd.getAdUnitId()).setControlState((maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) ? AdControlButton.b.LOAD : AdControlButton.b.SHOW);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            a(adControlButton.getFormat());
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(bVar);
            b(adControlButton.getFormat());
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a == null) {
            v.i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.a.i() + " Test Ads");
        a();
        b();
        c();
        d();
        e();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        this.q = (Button) findViewById(R.id.show_mrec_button);
        this.r = (Button) findViewById(R.id.show_native_button);
        if (this.a.q() && this.a.p().contains(MaxAdFormat.MREC)) {
            this.t.setVisibility(8);
            this.q.setBackgroundColor(-1);
            this.r.setBackgroundColor(-3355444);
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.s.setVisibility(0);
                    a.this.t.setVisibility(8);
                    a.this.q.setBackgroundColor(-1);
                    a.this.r.setBackgroundColor(-3355444);
                }
            });
            this.r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.t.setVisibility(0);
                    a.this.s.setVisibility(8);
                    a.this.r.setBackgroundColor(-1);
                    a.this.q.setBackgroundColor(-3355444);
                }
            });
        } else {
            this.q.setVisibility(8);
            this.r.setVisibility(8);
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            v.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f3660b.J().a((String) null);
        MaxAdView maxAdView = this.f3661c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f3662d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f3663e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f3665g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f3667i;
        if (maxNativeAdLoader == null || (maxAd = this.f3666h) == null) {
            return;
        }
        maxNativeAdLoader.destroy(maxAd);
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
