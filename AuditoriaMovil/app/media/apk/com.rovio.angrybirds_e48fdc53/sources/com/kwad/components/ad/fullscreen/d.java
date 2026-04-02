package com.kwad.components.ad.fullscreen;

import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.components.ad.KsAdLoadManager;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.request.model.a;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.components.core.t.k;
import com.kwad.sdk.api.KsFullScreenVideoAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.i;
import com.kwad.sdk.utils.s;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d {
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
                if ((1 == com.kwad.sdk.core.response.b.a.aW(ck) && !TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.F(ck))) || com.kwad.sdk.core.response.b.a.aV(ck) || com.kwad.sdk.core.response.b.a.cw(ck)) {
                    arrayList.add(adTemplate);
                }
            }
        }
        return arrayList;
    }

    public static void loadFullScreenVideoAd(KsScene ksScene, final KsLoadManager.FullScreenVideoAdListener fullScreenVideoAdListener) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final SceneImpl covert = SceneImpl.covert(ksScene);
        com.kwad.components.ad.reward.monitor.a.a(false, covert.getPosId());
        boolean a = k.qq().a(covert, "loadFullScreenVideoAd");
        covert.setAdStyle(3);
        KsAdLoadManager.M();
        KsAdLoadManager.a(new a.C0211a().e(new ImpInfo(covert)).aE(a).a(new com.kwad.components.core.request.c() { // from class: com.kwad.components.ad.fullscreen.d.1
            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.b
            public final void a(AdResultData adResultData, boolean z) {
                List<AdTemplate> a2 = d.a(SceneImpl.this, adResultData.getAdTemplateList());
                if (a2.isEmpty()) {
                    onError(f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? f.aoZ.msg : adResultData.testErrorMsg);
                    i.aj("fullAd_", "onFullScreenVideoAdCacheFailed");
                    return;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                final ArrayList<KsFullScreenVideoAd> arrayList = new ArrayList();
                for (AdTemplate adTemplate : a2) {
                    arrayList.add(new e(adTemplate));
                    adTemplate.setLoadDataTime(elapsedRealtime2);
                    adTemplate.setLoadFromCache(z);
                }
                com.kwad.components.ad.reward.monitor.a.a(false, (AdTemplate) a2.get(0), a2.size(), elapsedRealtime);
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_FULLSCREEN, "dataReady").report();
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.fullscreen.d.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            fullScreenVideoAdListener.onFullScreenVideoResult(arrayList);
                        } catch (Throwable th) {
                        }
                        try {
                            s.f(fullScreenVideoAdListener, "onRequestResult", Integer.valueOf(arrayList.size()));
                        } catch (Throwable th2) {
                        }
                    }
                });
                ArrayList arrayList2 = new ArrayList();
                for (KsFullScreenVideoAd ksFullScreenVideoAd : arrayList) {
                    AdTemplate adTemplate2 = ((e) ksFullScreenVideoAd).getAdTemplate();
                    AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate2);
                    if (com.kwad.components.ad.c.a.a(adTemplate2, false) || com.kwad.sdk.core.response.b.a.aV(ck) || com.kwad.sdk.core.response.b.a.cw(ck)) {
                        arrayList2.add(ksFullScreenVideoAd);
                    }
                }
                if (arrayList2.isEmpty()) {
                    onError(f.apa.errorCode, f.apa.msg);
                    i.aj("fullAd_", "onFullScreenVideoAdCacheFailed");
                    return;
                }
                com.kwad.components.ad.reward.monitor.a.b(false, (AdTemplate) a2.get(0), a2.size(), elapsedRealtime);
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.fullscreen.d.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.aj("fullAd_", "onFullScreenVideoAdCacheFailed");
                        KsAdLoadManager.M().b(arrayList);
                        fullScreenVideoAdListener.onFullScreenVideoAdLoad(arrayList);
                    }
                });
            }

            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
            public final void onError(final int i, final String str) {
                com.kwad.components.ad.reward.monitor.a.a(false, i, str, SceneImpl.this.getPosId());
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.fullscreen.d.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.core.e.c.d("KsAdFullScreenLoadManager", "onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                        fullScreenVideoAdListener.onError(i, str);
                    }
                });
            }
        }).pL());
    }
}
