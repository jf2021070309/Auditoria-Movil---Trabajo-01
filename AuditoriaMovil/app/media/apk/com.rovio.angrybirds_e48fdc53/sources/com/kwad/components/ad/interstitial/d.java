package com.kwad.components.ad.interstitial;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.kwad.components.core.e.a.h;
import com.kwad.components.core.widget.f;
import com.kwad.components.core.widget.g;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bi;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
/* loaded from: classes.dex */
public final class d extends com.kwad.components.core.o.d {
    private final KsAdVideoPlayConfig hA;
    private KsInterstitialAd.AdInteractionListener hB;
    private final g hC;
    private com.kwad.components.ad.interstitial.f.a hx;
    private boolean hy;
    private com.kwad.components.ad.interstitial.e.b hz;
    private final AdTemplate mAdTemplate;
    private bi mTimerHelper;

    public d(Activity activity, AdTemplate adTemplate, KsVideoPlayConfig ksVideoPlayConfig, KsInterstitialAd.AdInteractionListener adInteractionListener) {
        super(activity);
        this.hC = new g() { // from class: com.kwad.components.ad.interstitial.d.1
            @Override // com.kwad.components.core.widget.g
            public final void j(boolean z) {
                if (d.this.hy) {
                    Activity activity2 = d.this.mActivity;
                    com.kwad.sdk.core.c.b.AT();
                    if (activity2 == com.kwad.sdk.core.c.b.getCurrentActivity()) {
                        com.kwad.sdk.core.report.a.j(d.this.mAdTemplate, z ? 2 : 1);
                        d.this.cj();
                    }
                }
            }
        };
        this.hB = adInteractionListener;
        this.hA = new KsAdVideoPlayConfig.Builder().videoSoundEnable(ksVideoPlayConfig != null && ksVideoPlayConfig.isVideoSoundEnable()).dataFlowAutoStart(com.kwad.components.ad.interstitial.a.b.cB()).build();
        this.mAdTemplate = adTemplate;
    }

    private boolean ch() {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        return com.kwad.sdk.core.response.b.a.cc(ck) && !ci() && com.kwad.components.ad.interstitial.b.a.cJ() < com.kwad.sdk.core.response.b.a.cf(ck);
    }

    private boolean ci() {
        return com.kwad.sdk.core.response.b.b.aV(this.mAdTemplate) && com.kwad.components.ad.interstitial.c.a.cL() < com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.alo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cj() {
        int bZ = com.kwad.sdk.core.response.b.a.bZ(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
        this.hx = ch() ? new com.kwad.components.ad.interstitial.aggregate.b(this.mContext) : (TextUtils.isEmpty(com.kwad.sdk.core.response.b.b.bq(this.mAdTemplate)) || !ai.IK()) ? new com.kwad.components.ad.interstitial.f.c(this.mContext) : bZ == 2 ? new com.kwad.components.ad.interstitial.f.e(this.mContext) : bZ == 1 ? new com.kwad.components.ad.interstitial.f.d(this.mContext) : new com.kwad.components.ad.interstitial.f.c(this.mContext);
        this.hx.a(this.mAdTemplate, this, this.hA, this.hB);
        this.zz.removeAllViews();
        this.zz.addView(this.hx);
        ck();
    }

    private void ck() {
        com.kwad.components.ad.interstitial.e.b bVar = new com.kwad.components.ad.interstitial.e.b(this.hx, 100);
        this.hz = bVar;
        bVar.a(new com.kwad.sdk.core.h.c() { // from class: com.kwad.components.ad.interstitial.d.2
            @Override // com.kwad.sdk.core.h.c
            public final void aK() {
                d.this.getTimerHelper().JZ();
            }

            @Override // com.kwad.sdk.core.h.c
            public final void aL() {
                d.this.getTimerHelper().Ka();
            }
        });
        this.hz.sB();
    }

    @Override // com.kwad.components.core.o.d
    public final ViewGroup cg() {
        f fVar = new f(this.mContext);
        fVar.setOrientationChangeListener(this.hC);
        return fVar;
    }

    @Override // com.kwad.components.core.o.d, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        com.kwad.sdk.a.a.c.xY().yb();
        KsInterstitialAd.AdInteractionListener adInteractionListener = this.hB;
        if (adInteractionListener != null) {
            adInteractionListener.onPageDismiss();
        }
        h.mY();
    }

    @Override // com.kwad.components.core.o.d
    public final void g(View view) {
        h.a(getWindow());
        cj();
        com.kwad.sdk.i.a.af(GMAdConstant.RIT_TYPE_INTERSTITIAL, TTLogUtil.TAG_EVENT_SHOW);
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_INTERSTITIAL, "adShowSuccess").report();
    }

    @Override // com.kwad.components.core.o.d
    public final int getLayoutId() {
        return 0;
    }

    public final bi getTimerHelper() {
        if (this.mTimerHelper == null) {
            this.mTimerHelper = new bi();
        }
        return this.mTimerHelper;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (com.kwad.components.ad.interstitial.a.b.cF()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.kwad.components.ad.interstitial.e.b bVar = this.hz;
        if (bVar != null) {
            bVar.release();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.hy = z;
        com.kwad.components.ad.interstitial.f.a aVar = this.hx;
        if (aVar != null) {
            if (z) {
                aVar.co();
            } else {
                aVar.cp();
            }
        }
    }

    public final void setAdInteractionListener(KsInterstitialAd.AdInteractionListener adInteractionListener) {
        this.hB = adInteractionListener;
        com.kwad.components.ad.interstitial.f.a aVar = this.hx;
        if (aVar != null) {
            aVar.setAdInteractionListener(adInteractionListener);
        }
    }
}
