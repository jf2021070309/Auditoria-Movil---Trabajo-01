package com.kwad.components.ad.reward;

import android.app.Activity;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy;
import com.kwad.sdk.api.KsInnerAd;
import com.kwad.sdk.api.KsRewardVideoAd;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.sdk.ksdk.util.Var;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class f implements com.kwad.components.core.internal.api.a, KsRewardVideoAd {
    private final AdInfo mAdInfo;
    private final AdTemplate mAdTemplate;
    private com.kwad.components.core.i.d oL;
    private com.kwad.components.ad.reward.e.g oP;
    private com.kwad.components.core.internal.api.c bP = new com.kwad.components.core.internal.api.c();
    public int rewardType = 1;

    public f(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        com.kwad.components.ad.h.b.fc().a(this);
    }

    private void a(Activity activity, KsVideoPlayConfig ksVideoPlayConfig) {
        fB();
        if (com.kwad.sdk.core.response.b.a.bK(this.mAdInfo)) {
            AdRewardPreviewActivityProxy.launch(activity, this.mAdTemplate, com.kwad.sdk.core.response.b.a.aK(this.mAdInfo), this.oP);
        } else {
            KSRewardVideoActivityProxy.launch(activity, this.mAdTemplate, ksVideoPlayConfig, this.oP, this.oL, this.rewardType);
        }
    }

    private void fB() {
        AdInfo adInfo;
        if (com.kwad.components.ad.reward.c.c.a(this.oP) || (adInfo = this.mAdInfo) == null) {
            return;
        }
        adInfo.adBaseInfo.extraClickReward = false;
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void a(com.kwad.components.core.internal.api.b bVar) {
        this.bP.a(bVar);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean ae() {
        return true;
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void b(com.kwad.components.core.internal.api.b bVar) {
        this.bP.b(bVar);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final int getECPM() {
        return com.kwad.sdk.core.response.b.a.aJ(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final int getInteractionType() {
        return com.kwad.sdk.core.response.b.a.aI(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final int getMaterialType() {
        return com.kwad.sdk.core.response.b.a.aW(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public final Map<String, Object> getMediaExtraInfo() {
        HashMap hashMap = new HashMap();
        if (com.kwad.sdk.core.config.d.zs()) {
            hashMap.put("llsid", Long.valueOf(this.mAdTemplate.llsid));
        }
        return hashMap;
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final boolean isAdEnable() {
        if (com.kwad.sdk.core.config.d.zy() >= 0) {
            return true;
        }
        return com.kwad.components.core.video.j.m(this.mAdTemplate);
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final void reportAdExposureFailed(int i, AdExposureFailedReason adExposureFailedReason) {
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, i, adExposureFailedReason);
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final void setBidEcpm(int i) {
        setBidEcpm(i, -1L);
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final void setBidEcpm(long j, long j2) {
        this.mAdTemplate.mBidEcpm = j;
        com.kwad.sdk.core.report.a.j(this.mAdTemplate, j2);
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final void setInnerAdInteractionListener(KsInnerAd.KsInnerAdInteractionListener ksInnerAdInteractionListener) {
        this.oL = new com.kwad.components.core.i.d(ksInnerAdInteractionListener);
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final void setRewardAdInteractionListener(KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        if (this.oP == null) {
            this.oP = new com.kwad.components.ad.reward.e.g() { // from class: com.kwad.components.ad.reward.f.1
                @Override // com.kwad.components.ad.reward.e.g, com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public final void onPageDismiss() {
                    super.onPageDismiss();
                    f.this.bP.i(f.this);
                }

                @Override // com.kwad.components.ad.reward.e.g, com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public final void onVideoPlayStart() {
                    super.onVideoPlayStart();
                    f.this.bP.h(f.this);
                }
            };
        }
        this.oP.b(rewardAdInteractionListener);
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final void setRewardPlayAgainInteractionListener(KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public final void showRewardVideoAd(Activity activity, KsVideoPlayConfig ksVideoPlayConfig) {
        if (activity == null || activity.isFinishing()) {
            com.kwad.sdk.core.e.c.e("KsRewardVideoAdControl", "showRewardVideoAd error, activity is null or finished");
            return;
        }
        com.kwad.sdk.i.a.ae(Var.REWARD_KEY, TTLogUtil.TAG_EVENT_SHOW);
        com.kwad.components.ad.reward.monitor.a.a(true, this.mAdTemplate);
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_REWARD, "callShow").report();
        if (!isAdEnable()) {
            com.kwad.sdk.core.e.c.i("KsRewardVideoAdControl", "isAdEnable is false");
            com.kwad.sdk.i.a.af(Var.REWARD_KEY, TTLogUtil.TAG_EVENT_SHOW);
            return;
        }
        if (ksVideoPlayConfig == null) {
            ksVideoPlayConfig = new KsVideoPlayConfig.Builder().build();
        }
        a(activity, ksVideoPlayConfig);
    }
}
