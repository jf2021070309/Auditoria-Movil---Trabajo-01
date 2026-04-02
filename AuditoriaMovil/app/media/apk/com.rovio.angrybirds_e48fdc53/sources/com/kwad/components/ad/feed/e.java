package com.kwad.components.ad.feed;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.kwad.components.ad.KsAdLoadManager;
import com.kwad.components.ad.feed.c;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.request.model.a;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.components.core.t.k;
import com.kwad.components.model.FeedType;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.api.KsFeedAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.bj;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: com.kwad.components.ad.feed.e$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static class AnonymousClass2 extends com.kwad.components.core.request.c {
        final /* synthetic */ KsLoadManager.FeedAdListener dT;
        final /* synthetic */ SceneImpl dU;
        final /* synthetic */ boolean dV;
        final /* synthetic */ long dW;

        AnonymousClass2(KsLoadManager.FeedAdListener feedAdListener, SceneImpl sceneImpl, boolean z, long j) {
            this.dT = feedAdListener;
            this.dU = sceneImpl;
            this.dV = z;
            this.dW = j;
        }

        @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
        public final void a(AdResultData adResultData) {
            final ArrayList arrayList = new ArrayList();
            com.kwad.sdk.core.e.c.d("KsAdFeedLoadManager", "loadFeedAd onSuccess:" + adResultData.getAdTemplateList().size());
            String str = null;
            for (AdTemplate adTemplate : adResultData.getAdTemplateList()) {
                if (adTemplate != null) {
                    AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
                    if (FeedType.checkTypeValid(adTemplate)) {
                        adTemplate.mAdScene = this.dU;
                        if (!TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.F(ck))) {
                            Pair<Integer, String> d = com.kwad.components.ad.feed.monitor.a.d(adTemplate);
                            com.kwad.components.ad.feed.monitor.b.e(((Integer) d.first).intValue(), (String) d.second);
                        }
                        arrayList.add(new c(adTemplate, this.dV));
                    } else {
                        str = String.format("(模板不匹配materialType:%s_feedType:%s)", Integer.valueOf(com.kwad.sdk.core.response.b.a.aW(ck)), FeedType.fromInt(adTemplate.type));
                    }
                }
            }
            com.kwad.sdk.core.e.c.d("KsAdFeedLoadManager", "loadFeedAd onSuccess:" + arrayList.size());
            com.kwad.components.ad.feed.monitor.b.t(arrayList.size());
            if (!arrayList.isEmpty()) {
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_FEED, "dataReady").ct(arrayList.size()).report();
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.feed.e.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        final int size = arrayList.size();
                        final int[] iArr = {0};
                        for (final KsFeedAd ksFeedAd : arrayList) {
                            final c cVar = (c) ksFeedAd;
                            com.kwad.sdk.core.e.c.d("KsAdFeedLoadManager", "ksFeedAd " + ksFeedAd);
                            final long elapsedRealtime = SystemClock.elapsedRealtime();
                            cVar.a(new c.a() { // from class: com.kwad.components.ad.feed.e.2.2.1
                                @Override // com.kwad.components.ad.feed.c.a
                                public final void c(int i, String str2) {
                                    com.kwad.sdk.core.e.c.d("KsAdFeedLoadManager", "ksFeedAd onLoadFinished" + cVar);
                                    com.kwad.components.ad.feed.monitor.b.a(((c) ksFeedAd).getAdTemplate(), i, SystemClock.elapsedRealtime() - elapsedRealtime, str2);
                                    int[] iArr2 = iArr;
                                    int i2 = iArr2[0] + 1;
                                    iArr2[0] = i2;
                                    int i3 = size;
                                    if (i2 == i3) {
                                        com.kwad.components.ad.feed.monitor.b.a(i3, SystemClock.elapsedRealtime() - AnonymousClass2.this.dW);
                                        KsAdLoadManager.M().b(arrayList);
                                        AnonymousClass2.this.dT.onFeedAdLoad(arrayList);
                                    }
                                }
                            });
                        }
                    }
                });
                return;
            }
            int i = com.kwad.sdk.core.network.f.aoZ.errorCode;
            com.kwad.components.ad.feed.monitor.b.d(i, com.kwad.sdk.core.network.f.aoZ.msg + str);
            int i2 = com.kwad.sdk.core.network.f.aoZ.errorCode;
            onError(i2, com.kwad.sdk.core.network.f.aoZ.msg + str);
            com.kwad.sdk.core.e.c.d("KsAdFeedLoadManager", "loadFeedAd onError");
        }

        @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
        public final void onError(final int i, final String str) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.feed.e.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.kwad.sdk.core.e.c.d("KsAdFeedLoadManager", "loadFeedAd onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                    com.kwad.components.ad.feed.monitor.b.d(i, str);
                    AnonymousClass2.this.dT.onError(i, str);
                }
            });
        }
    }

    public static void a(KsScene ksScene, final KsLoadManager.FeedAdListener feedAdListener, boolean z) {
        if (!KsAdSDKImpl.get().hasInitFinish()) {
            com.kwad.sdk.core.e.c.e("KsAdFeedLoadManager", "loadConfigFeedAd please init sdk first");
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.feed.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    KsLoadManager.FeedAdListener feedAdListener2 = KsLoadManager.FeedAdListener.this;
                    int i = com.kwad.sdk.core.network.f.aoZ.errorCode;
                    feedAdListener2.onError(i, com.kwad.sdk.core.network.f.aoZ.msg + "sdk not init");
                }
            });
            return;
        }
        SceneImpl covert = SceneImpl.covert(ksScene);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.kwad.components.ad.feed.monitor.b.s(covert.getAdNum());
        boolean a = k.qq().a(covert, "loadConfigFeedAd");
        covert.setAdStyle(1);
        KsAdLoadManager.M();
        KsAdLoadManager.a(new a.C0211a().e(new ImpInfo(covert)).aE(a).a(new AnonymousClass2(feedAdListener, covert, z, elapsedRealtime)).pL());
    }
}
