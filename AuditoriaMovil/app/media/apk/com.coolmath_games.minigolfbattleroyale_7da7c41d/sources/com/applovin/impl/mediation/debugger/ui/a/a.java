package com.applovin.impl.mediation.debugger.ui.a;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.a.b;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.k;
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
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {
    private k a;
    private com.applovin.impl.mediation.debugger.a.a.a b;
    private b c;
    private com.applovin.impl.mediation.debugger.a.a.b d;
    private MaxAdView e;
    private MaxInterstitialAd f;
    private MaxRewardedInterstitialAd g;
    private MaxRewardedAd h;
    private d i;
    private ListView j;
    private View k;
    private AdControlButton l;
    private TextView m;

    private void a() {
        String a = this.b.a();
        if (this.b.d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(a, this.b.d(), this.a.W(), this);
            this.e = maxAdView;
            maxAdView.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.b.d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(a, this.a.W(), this);
            this.f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(a, this.a.W(), this);
            this.g = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.b.d()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(a, this.a.W(), this);
            this.h = maxRewardedAd;
            maxRewardedAd.setListener(this);
        }
    }

    private void a(DialogInterface.OnShowListener onShowListener) {
        if (this.i != null) {
            return;
        }
        d dVar = new d(this.e, this.b.d(), this);
        this.i = dVar;
        dVar.setOnShowListener(onShowListener);
        this.i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.3
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                a.this.e.stopAutoRefresh();
                a.this.i = null;
            }
        });
        this.i.show();
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.d != null) {
            this.a.H().a(this.d.b());
            this.a.H().a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            this.e.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.b.d()) {
            this.f.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.d()) {
            this.g.loadAd();
        } else if (MaxAdFormat.REWARDED == this.b.d()) {
            this.h.loadAd();
        }
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.2
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    a.this.e.startAutoRefresh();
                }
            });
        } else if (MaxAdFormat.INTERSTITIAL == this.b.d()) {
            this.f.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.d()) {
            this.g.showAd();
        } else if (MaxAdFormat.REWARDED == this.b.d()) {
            this.h.showAd();
        }
    }

    public void initialize(final com.applovin.impl.mediation.debugger.a.a.a aVar, com.applovin.impl.mediation.debugger.a.a.b bVar, final k kVar) {
        this.a = kVar;
        this.b = aVar;
        this.d = bVar;
        b bVar2 = new b(aVar, bVar, this);
        this.c = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar2, final com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                if (cVar instanceof b.a) {
                    a.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, kVar.ad(), new a.InterfaceC0017a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1.1
                        @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0017a
                        public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            maxDebuggerAdUnitDetailActivity.initialize(aVar, ((b.a) cVar).a(), kVar);
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
        this.l.setControlState(AdControlButton.b.LOAD);
        this.m.setText("");
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
        this.l.setControlState(AdControlButton.b.LOAD);
        this.m.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        Utils.showAlert("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.m;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.l.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a((DialogInterface.OnShowListener) null);
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.a.H().a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
        } else if (AdControlButton.b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            a(this.b.d());
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!this.b.d().isAdViewAd()) {
                adControlButton.setControlState(AdControlButton.b.LOAD);
            }
            b(this.b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.c.a());
        this.j = (ListView) findViewById(R.id.listView);
        this.k = findViewById(R.id.ad_presenter_view);
        this.l = (AdControlButton) findViewById(R.id.ad_control_button);
        this.m = (TextView) findViewById(R.id.status_textview);
        this.j.setAdapter((ListAdapter) this.c);
        this.m.setText(this.a.H().a() ? "Not Supported while Test Mode is enabled" : "Tap to load an ad");
        this.m.setTypeface(Typeface.DEFAULT_BOLD);
        this.l.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.k.setBackground(layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.d != null) {
            this.a.H().a((String) null);
            this.a.H().a(false);
        }
        MaxAdView maxAdView = this.e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.h;
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
