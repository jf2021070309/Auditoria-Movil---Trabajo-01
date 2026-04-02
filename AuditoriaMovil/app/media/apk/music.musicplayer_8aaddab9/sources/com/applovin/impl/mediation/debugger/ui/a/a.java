package com.applovin.impl.mediation.debugger.ui.a;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.a.b;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {
    private m a;

    /* renamed from: b  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.a.a.a f3526b;

    /* renamed from: c  reason: collision with root package name */
    private b f3527c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.a.a.b f3528d;

    /* renamed from: e  reason: collision with root package name */
    private MaxAdView f3529e;

    /* renamed from: f  reason: collision with root package name */
    private MaxInterstitialAd f3530f;

    /* renamed from: g  reason: collision with root package name */
    private MaxRewardedInterstitialAd f3531g;

    /* renamed from: h  reason: collision with root package name */
    private MaxRewardedAd f3532h;

    /* renamed from: i  reason: collision with root package name */
    private MaxNativeAdView f3533i;

    /* renamed from: j  reason: collision with root package name */
    private MaxNativeAdLoader f3534j;

    /* renamed from: k  reason: collision with root package name */
    private d f3535k;

    /* renamed from: l  reason: collision with root package name */
    private ListView f3536l;

    /* renamed from: m  reason: collision with root package name */
    private View f3537m;

    /* renamed from: n  reason: collision with root package name */
    private AdControlButton f3538n;
    private TextView o;

    private void a() {
        String a = this.f3526b.a();
        if (this.f3526b.d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(a, this.f3526b.d(), this.a.Y(), this);
            this.f3529e = maxAdView;
            maxAdView.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f3526b.d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(a, this.a.Y(), this);
            this.f3530f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f3526b.d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(a, this.a.Y(), this);
            this.f3531g = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f3526b.d()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(a, this.a.Y(), this);
            this.f3532h = maxRewardedAd;
            maxRewardedAd.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f3526b.d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(a, this.a.Y(), this);
            this.f3534j = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.2
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
                    a.this.f3533i = maxNativeAdView;
                    a.this.onAdLoaded(maxAd);
                }
            });
            this.f3534j.setRevenueListener(this);
        }
    }

    private void a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.f3535k != null) {
            return;
        }
        d dVar = new d(viewGroup, size, this);
        this.f3535k = dVar;
        dVar.setOnShowListener(onShowListener);
        this.f3535k.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 instanceof MaxAdView) {
                    ((MaxAdView) viewGroup2).stopAutoRefresh();
                }
                a.this.f3535k = null;
            }
        });
        this.f3535k.show();
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.f3528d != null) {
            this.a.J().a(this.f3528d.b());
            this.a.J().a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            MaxAdView maxAdView = this.f3529e;
        } else if (MaxAdFormat.INTERSTITIAL == this.f3526b.d()) {
            MaxInterstitialAd maxInterstitialAd = this.f3530f;
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f3526b.d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f3531g;
        } else if (MaxAdFormat.REWARDED == this.f3526b.d()) {
            MaxRewardedAd maxRewardedAd = this.f3532h;
        } else if (MaxAdFormat.NATIVE == this.f3526b.d()) {
            MaxNativeAdLoader maxNativeAdLoader = this.f3534j;
        } else {
            Utils.showToast("Live ads currently unavailable for ad format", this);
        }
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f3529e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.3
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    a.this.f3529e.startAutoRefresh();
                }
            });
        } else if (MaxAdFormat.INTERSTITIAL == this.f3526b.d()) {
            this.f3530f.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f3526b.d()) {
            this.f3531g.showAd();
        } else if (MaxAdFormat.REWARDED == this.f3526b.d()) {
            this.f3532h.showAd();
        } else if (MaxAdFormat.NATIVE == this.f3526b.d()) {
            a(this.f3533i, MaxAdFormat.MREC.getSize(), null);
        }
    }

    public void initialize(final com.applovin.impl.mediation.debugger.a.a.a aVar, com.applovin.impl.mediation.debugger.a.a.b bVar, final m mVar) {
        this.a = mVar;
        this.f3526b = aVar;
        this.f3528d = bVar;
        b bVar2 = new b(aVar, bVar, this);
        this.f3527c = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar2, final com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                if (cVar instanceof b.a) {
                    a.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, mVar.ae(), new a.InterfaceC0078a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1.1
                        @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0078a
                        public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            com.applovin.impl.mediation.debugger.a.a.b a = ((b.a) cVar).a();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            maxDebuggerAdUnitDetailActivity.initialize(aVar, a, mVar);
                        }
                    });
                }
            }
        });
        a();
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
        this.f3538n.setControlState(AdControlButton.b.LOAD);
        this.o.setText("");
        Utils.showAlert("", "Failed to display with error code: " + maxError.getCode(), this);
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
        this.f3538n.setControlState(AdControlButton.b.LOAD);
        this.o.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        StringBuilder y = e.a.d.a.a.y("Failed to load with error code: ");
        y.append(maxError.getCode());
        Utils.showAlert("", y.toString(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.o;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.f3538n.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f3529e, maxAd.getFormat().getSize(), null);
        } else if (MaxAdFormat.NATIVE == this.f3526b.d()) {
            a(this.f3533i, MaxAdFormat.MREC.getSize(), null);
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.a.J().a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            a(this.f3526b.d());
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!this.f3526b.d().isAdViewAd() && this.f3526b.d() != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(this.f3526b.d());
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f3527c.a());
        this.f3536l = (ListView) findViewById(R.id.listView);
        this.f3537m = findViewById(R.id.ad_presenter_view);
        this.f3538n = (AdControlButton) findViewById(R.id.ad_control_button);
        this.o = (TextView) findViewById(R.id.status_textview);
        this.f3536l.setAdapter((ListAdapter) this.f3527c);
        this.o.setText(this.a.J().a() ? "Not Supported while Test Mode is enabled" : "Tap to load an ad");
        this.o.setTypeface(Typeface.DEFAULT_BOLD);
        this.f3538n.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f3537m.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f3528d != null) {
            this.a.J().a((String) null);
            this.a.J().a(false);
        }
        MaxAdView maxAdView = this.f3529e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f3530f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f3532h;
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
