package com.kwad.components.ad.reward;

import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.components.ad.KsAdLoadManager;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.request.model.a;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsRewardVideoAd;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.s;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static List<AdTemplate> a(SceneImpl sceneImpl, List<AdTemplate> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        for (AdTemplate adTemplate : list) {
            if (adTemplate != null) {
                if (adTemplate.mAdScene == null) {
                    adTemplate.mAdScene = sceneImpl;
                }
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
                int aW = com.kwad.sdk.core.response.b.a.aW(ck);
                if (com.kwad.sdk.core.response.b.a.bK(ck) || com.kwad.sdk.core.response.b.a.cw(ck) || ((1 == aW && !TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.F(ck))) || com.kwad.sdk.core.response.b.a.aV(ck))) {
                    arrayList.add(adTemplate);
                }
            }
        }
        return arrayList;
    }

    public static void loadRewardVideoAd(KsScene ksScene, final KsLoadManager.RewardVideoAdListener rewardVideoAdListener) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final SceneImpl covert = SceneImpl.covert(ksScene);
        com.kwad.components.ad.reward.monitor.a.a(true, covert.getPosId());
        boolean a = com.kwad.components.core.t.k.qq().a(covert, "loadRewardVideoAd");
        covert.setAdStyle(2);
        KsAdLoadManager.M();
        KsAdLoadManager.a(new a.C0211a().e(new ImpInfo(covert)).aE(a).a(new com.kwad.components.core.request.c() { // from class: com.kwad.components.ad.reward.e.1
            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.b
            public final void a(AdResultData adResultData, boolean z) {
                List<AdTemplate> a2 = e.a(SceneImpl.this, adResultData.getProceedTemplateList());
                if (a2.isEmpty()) {
                    onError(com.kwad.sdk.core.network.f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? com.kwad.sdk.core.network.f.aoZ.msg : adResultData.testErrorMsg);
                    com.kwad.sdk.utils.i.aj("rewardAd_", "onRewardVideoAdCacheFailed");
                    return;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                final ArrayList<KsRewardVideoAd> arrayList = new ArrayList();
                for (AdTemplate adTemplate : a2) {
                    arrayList.add(new f(adTemplate));
                    adTemplate.setLoadDataTime(elapsedRealtime2);
                    adTemplate.setLoadFromCache(z);
                }
                com.kwad.components.ad.reward.monitor.a.a(true, (AdTemplate) a2.get(0), a2.size(), elapsedRealtime);
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_REWARD, "dataReady").report();
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.e.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            KsAdLoadManager.M().b(arrayList);
                            rewardVideoAdListener.onRewardVideoResult(arrayList);
                        } catch (Throwable th) {
                        }
                        try {
                            s.f(rewardVideoAdListener, "onRequestResult", Integer.valueOf(arrayList.size()));
                        } catch (Throwable th2) {
                        }
                    }
                });
                final ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (KsRewardVideoAd ksRewardVideoAd : arrayList) {
                    AdTemplate adTemplate2 = ((f) ksRewardVideoAd).getAdTemplate();
                    AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate2);
                    if (com.kwad.sdk.core.response.b.a.bK(ck) || com.kwad.sdk.core.response.b.a.cw(ck) || com.kwad.sdk.core.response.b.a.aV(ck)) {
                        arrayList2.add(ksRewardVideoAd);
                        z2 = true;
                    } else if (com.kwad.components.ad.c.a.a(adTemplate2, true)) {
                        arrayList2.add(ksRewardVideoAd);
                    }
                }
                if (z2 || !arrayList2.isEmpty()) {
                    com.kwad.components.ad.reward.monitor.a.b(true, (AdTemplate) a2.get(0), a2.size(), elapsedRealtime);
                    bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.e.1.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.kwad.sdk.utils.i.aj("rewardAd_", "onRewardVideoAdCacheSuccess");
                            rewardVideoAdListener.onRewardVideoAdLoad(arrayList2);
                        }
                    });
                    return;
                }
                onError(com.kwad.sdk.core.network.f.apa.errorCode, com.kwad.sdk.core.network.f.apa.msg);
                com.kwad.sdk.utils.i.aj("rewardAd_", "onRewardVideoAdCacheFailed");
            }

            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
            public final void onError(final int i, final String str) {
                com.kwad.components.ad.reward.monitor.a.a(true, i, str, SceneImpl.this.getPosId());
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.e.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.core.e.c.d("KsAdRewardLoadManager", "onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                        rewardVideoAdListener.onError(i, str);
                    }
                });
            }
        }).pL());
    }
}
