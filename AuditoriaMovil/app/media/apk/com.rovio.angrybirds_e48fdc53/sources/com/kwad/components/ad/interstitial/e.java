package com.kwad.components.ad.interstitial;

import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.components.ad.KsAdLoadManager;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.request.model.a;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.components.core.t.k;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.i;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class e {
    public static void loadInterstitialAd(KsScene ksScene, final KsLoadManager.InterstitialAdListener interstitialAdListener) {
        if (!KsAdSDKImpl.get().hasInitFinish()) {
            com.kwad.sdk.core.e.c.e("KsAdInterstitialLoadManager", "loadInterstitialAd please init sdk first");
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.interstitial.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    KsLoadManager.InterstitialAdListener interstitialAdListener2 = KsLoadManager.InterstitialAdListener.this;
                    int i = f.aoZ.errorCode;
                    interstitialAdListener2.onError(i, f.aoZ.msg + "sdk not init");
                }
            });
            return;
        }
        final SceneImpl covert = SceneImpl.covert(ksScene);
        boolean a = k.qq().a(covert, "loadInterstitialAd");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        covert.setAdStyle(13);
        com.kwad.components.ad.interstitial.monitor.b.cM();
        com.kwad.components.ad.interstitial.monitor.b.g(covert.getPosId());
        KsAdLoadManager.M();
        KsAdLoadManager.a(new a.C0211a().e(new ImpInfo(covert)).aE(a).a(new com.kwad.components.core.request.c() { // from class: com.kwad.components.ad.interstitial.e.2
            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.b
            public final void a(AdResultData adResultData, boolean z) {
                b bVar;
                final List<AdTemplate> adTemplateList = adResultData.getAdTemplateList();
                if (adTemplateList.isEmpty()) {
                    onError(f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? f.aoZ.msg : adResultData.testErrorMsg);
                    i.aj("insertAd_", "onInterstitialAdCacheFailed");
                    return;
                }
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.interstitial.e.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            interstitialAdListener.onRequestResult(adTemplateList.size());
                        } catch (Throwable th) {
                            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                        }
                    }
                });
                com.kwad.components.ad.interstitial.monitor.b.cM();
                com.kwad.components.ad.interstitial.monitor.b.a(adTemplateList.get(0), elapsedRealtime, z);
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_INTERSTITIAL, "dataReady").report();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                final ArrayList arrayList = new ArrayList();
                for (AdTemplate adTemplate : adTemplateList) {
                    if (adTemplate != null) {
                        if (adTemplate.mAdScene == null) {
                            adTemplate.mAdScene = SceneImpl.this;
                        }
                        if (TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.F(com.kwad.sdk.core.response.b.d.ck(adTemplate)))) {
                            bVar = new b(SceneImpl.this, adTemplate);
                        } else {
                            boolean h = com.kwad.components.ad.interstitial.monitor.a.h(adTemplate);
                            if (com.kwad.sdk.core.config.d.yW() || h) {
                                bVar = new b(SceneImpl.this, adTemplate);
                            }
                        }
                        arrayList.add(bVar);
                    }
                }
                if (arrayList.size() == 0) {
                    onError(f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? f.aoZ.msg : adResultData.testErrorMsg);
                    i.aj("insertAd_", "onInterstitialAdCacheFailed");
                    return;
                }
                com.kwad.components.ad.interstitial.monitor.b.cM();
                com.kwad.components.ad.interstitial.monitor.b.b(adTemplateList.get(0), elapsedRealtime2, z);
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.interstitial.e.2.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        KsAdLoadManager.M().b(arrayList);
                        i.aj("insertAd_", "onInterstitialAdCacheSuccess");
                        interstitialAdListener.onInterstitialAdLoad(arrayList);
                    }
                });
            }

            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
            public final void onError(final int i, final String str) {
                com.kwad.components.ad.interstitial.monitor.b.cM();
                com.kwad.components.ad.interstitial.monitor.b.a(i, str, SceneImpl.this.getPosId());
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.interstitial.e.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.core.e.c.w("KsAdInterstitialLoadManager", "loadInterstitialAd onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                        interstitialAdListener.onError(i, str);
                    }
                });
            }
        }).pL());
    }
}
