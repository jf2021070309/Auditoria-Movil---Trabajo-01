package com.kwad.components.ad.interstitial.aggregate;

import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.components.core.request.h;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.bj;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class c {
    private volatile boolean ia;
    private m<com.kwad.components.core.request.a, AdResultData> ib;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.interstitial.aggregate.c$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends h {
        final /* synthetic */ SceneImpl dU;
        final /* synthetic */ long hF;
        final /* synthetic */ b ic;

        AnonymousClass1(SceneImpl sceneImpl, b bVar, long j) {
            this.dU = sceneImpl;
            this.ic = bVar;
            this.hF = j;
        }

        @Override // com.kwad.components.core.request.i
        public final void a(final AdResultData adResultData) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.interstitial.aggregate.c.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    final ArrayList arrayList = new ArrayList();
                    for (AdTemplate adTemplate : adResultData.getAdTemplateList()) {
                        if (adTemplate != null) {
                            if (adTemplate.mAdScene == null) {
                                adTemplate.mAdScene = AnonymousClass1.this.dU;
                            }
                            arrayList.add(adTemplate);
                        }
                    }
                    bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.interstitial.aggregate.c.1.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1.this.ic.onInterstitialAdLoad(arrayList);
                            c cVar = c.this;
                            c.a(adResultData, AnonymousClass1.this.hF);
                        }
                    });
                }
            });
        }

        @Override // com.kwad.components.core.request.i
        public final void onError(final int i, final String str) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.interstitial.aggregate.c.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.kwad.sdk.core.e.c.e("InterstitialAggregateDataFetcher", "loadAggregationAd onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static c ik = new c((byte) 0);
    }

    /* loaded from: classes.dex */
    public interface b {
        void onInterstitialAdLoad(List<AdTemplate> list);
    }

    private c() {
        this.ia = false;
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    private void a(ImpInfo impInfo, final h hVar) {
        com.kwad.components.core.m.a aVar = new com.kwad.components.core.m.a(impInfo);
        this.ib = aVar;
        aVar.request(new p<com.kwad.components.core.request.a, AdResultData>() { // from class: com.kwad.components.ad.interstitial.aggregate.c.2
            private void b(AdResultData adResultData) {
                c.a(c.this, false);
                if (adResultData.isAdResultDataEmpty()) {
                    hVar.onError(f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? f.aoZ.msg : adResultData.testErrorMsg);
                } else {
                    hVar.a(adResultData);
                }
            }

            private void f(int i, String str) {
                c.a(c.this, false);
                hVar.onError(i, str);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onError(g gVar, int i, String str) {
                f(i, str);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(g gVar, BaseResultData baseResultData) {
                b((AdResultData) baseResultData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AdResultData adResultData, long j) {
        AdTemplate adTemplate;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (adResultData.getAdTemplateList().size() <= 0 || (adTemplate = adResultData.getAdTemplateList().get(0)) == null) {
            return;
        }
        com.kwad.components.core.p.a.pC().g(adTemplate, elapsedRealtime - j);
    }

    static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.ia = false;
        return false;
    }

    public static c cu() {
        return a.ik;
    }

    public final void a(int i, int i2, SceneImpl sceneImpl, b bVar) {
        if (this.ia) {
            return;
        }
        SceneImpl m20clone = sceneImpl.m20clone();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m20clone.setAdStyle(16);
        m20clone.setAdNum(i2);
        a(new ImpInfo(m20clone), new AnonymousClass1(sceneImpl, bVar, elapsedRealtime));
    }

    public final void release() {
        m<com.kwad.components.core.request.a, AdResultData> mVar = this.ib;
        if (mVar != null) {
            mVar.cancel();
        }
    }
}
