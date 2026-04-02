package com.kwad.components.ad.interstitial;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class b implements com.kwad.components.core.internal.api.a, KsInterstitialAd {
    private com.kwad.components.core.internal.api.c bP = new com.kwad.components.core.internal.api.c();
    private KsScene hs;
    private c ht;
    private d hu;
    private final AdTemplate mAdTemplate;

    public b(KsScene ksScene, AdTemplate adTemplate) {
        this.hs = ksScene;
        this.mAdTemplate = adTemplate;
        com.kwad.components.ad.h.b.fc().a(this);
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

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final int getECPM() {
        return com.kwad.sdk.core.response.b.a.aJ(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final int getInteractionType() {
        return com.kwad.sdk.core.response.b.a.aI(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final int getMaterialType() {
        return com.kwad.sdk.core.response.b.a.aW(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public final Map<String, Object> getMediaExtraInfo() {
        HashMap hashMap = new HashMap();
        if (com.kwad.sdk.core.config.d.zs()) {
            hashMap.put("llsid", Long.valueOf(this.mAdTemplate.llsid));
        }
        return hashMap;
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final boolean isVideo() {
        return com.kwad.sdk.core.response.b.a.aU(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final void reportAdExposureFailed(int i, AdExposureFailedReason adExposureFailedReason) {
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, i, adExposureFailedReason);
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final void setAdInteractionListener(KsInterstitialAd.AdInteractionListener adInteractionListener) {
        if (this.ht == null) {
            this.ht = new c() { // from class: com.kwad.components.ad.interstitial.b.1
                @Override // com.kwad.components.ad.interstitial.c, com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public final void onAdShow() {
                    super.onAdShow();
                    b.this.bP.h(b.this);
                }

                @Override // com.kwad.components.ad.interstitial.c, com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public final void onPageDismiss() {
                    super.onPageDismiss();
                    b.this.bP.i(b.this);
                }
            };
        }
        this.ht.a(adInteractionListener);
        d dVar = this.hu;
        if (dVar != null) {
            dVar.setAdInteractionListener(this.ht);
        }
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final void setBidEcpm(int i) {
        setBidEcpm(i, -1L);
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final void setBidEcpm(long j, long j2) {
        this.mAdTemplate.mBidEcpm = j;
        com.kwad.sdk.core.report.a.j(this.mAdTemplate, j);
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final void showInterstitialAd(Activity activity, KsVideoPlayConfig ksVideoPlayConfig) {
        com.kwad.components.ad.interstitial.monitor.b.cM();
        com.kwad.components.ad.interstitial.monitor.b.h(this.hs.getPosId());
        if (activity == null || activity.isFinishing()) {
            com.kwad.sdk.core.e.c.e("StayAdHelper", "showInterstitialAd activity must not be null");
            com.kwad.components.ad.interstitial.monitor.b.cM();
            com.kwad.components.ad.interstitial.monitor.b.a(this.hs.getPosId(), f.ape.errorCode, f.ape.msg);
        } else if (!KsAdSDKImpl.get().hasInitFinish()) {
            com.kwad.components.ad.interstitial.monitor.b.cM();
            com.kwad.components.ad.interstitial.monitor.b.a(this.hs.getPosId(), f.apf.errorCode, f.apf.msg);
            com.kwad.sdk.core.e.c.e("StayAdHelper", "showInterstitialAd please init sdk first");
        } else {
            if (ksVideoPlayConfig == null) {
                ksVideoPlayConfig = new KsVideoPlayConfig.Builder().build();
            }
            com.kwad.sdk.i.a.ae(GMAdConstant.RIT_TYPE_INTERSTITIAL, TTLogUtil.TAG_EVENT_SHOW);
            KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_INTERSTITIAL, "callShow").report();
            this.mAdTemplate.adShowStartTimeStamp = SystemClock.elapsedRealtime();
            if (ksVideoPlayConfig.isVideoSoundEnable()) {
                this.mAdTemplate.mInitVoiceStatus = 2;
            } else {
                this.mAdTemplate.mInitVoiceStatus = 1;
            }
            com.kwad.sdk.a.a.c.xY().bc(true);
            if (this.hu == null) {
                d dVar = new d(activity, this.mAdTemplate, ksVideoPlayConfig, this.ht);
                this.hu = dVar;
                dVar.show();
                com.kwad.components.ad.interstitial.monitor.b.cM();
                com.kwad.components.ad.interstitial.monitor.b.i(this.mAdTemplate);
                com.kwad.components.ad.interstitial.b.b.J(activity);
            }
        }
    }
}
