package com.kwad.components.ad.adbit;

import android.text.TextUtils;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.request.model.a;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.internal.api.SceneImpl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c {
    private static <T extends com.kwad.components.core.request.a> T a(com.kwad.sdk.g.c<T> cVar) {
        return cVar.get();
    }

    private static AdTemplate a(AdBitResultData adBitResultData, long j) {
        for (AdTemplate adTemplate : adBitResultData.getAdTemplateList()) {
            if (adTemplate != null && j == d.cu(adTemplate)) {
                return adTemplate;
            }
        }
        return null;
    }

    public static String a(SceneImpl sceneImpl) {
        SceneImpl.covert(sceneImpl);
        final com.kwad.components.core.request.model.a pL = new a.C0211a().e(new ImpInfo(sceneImpl)).a(new com.kwad.components.core.request.c()).pL();
        b bVar = (b) a(new com.kwad.sdk.g.c<b>() { // from class: com.kwad.components.ad.adbit.c.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.c
            /* renamed from: O */
            public b get() {
                return new b(com.kwad.components.core.request.model.a.this);
            }
        });
        return new a(bVar.getBody(), bVar.getHeader()).N();
    }

    private static List<String> a(AdBitResultData adBitResultData) {
        ArrayList arrayList = new ArrayList();
        for (AdBid adBid : adBitResultData.adBidList) {
            if (adBid != null && adBid.bidEcpm > 0 && adBid.creativeId > 0) {
                arrayList.add(adBid.materialId);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<AdTemplate> a(AdBitResultData adBitResultData, AdBitResultData adBitResultData2) {
        AdTemplate a;
        ArrayList arrayList = new ArrayList();
        for (AdBid adBid : adBitResultData.adBidList) {
            if (adBid != null && adBid.bidEcpm > 0 && adBid.creativeId > 0 && (a = a(adBitResultData2, adBid.creativeId)) != null) {
                a.mBidEcpm = adBid.bidEcpm;
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private static void a(String str, com.kwad.components.core.request.model.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AdBitResultData adBitResultData = new AdBitResultData(aVar.Lp.adScene);
            adBitResultData.parseJson(jSONObject);
            List<String> a = a(adBitResultData);
            if (a.isEmpty()) {
                com.kwad.components.core.request.model.a.a(aVar, f.aoZ.errorCode, TextUtils.isEmpty(adBitResultData.testErrorMsg) ? f.aoZ.msg : adBitResultData.testErrorMsg, false);
            } else {
                a(a, adBitResultData, aVar);
            }
        } catch (Exception e) {
            com.kwad.components.core.request.model.a.a(aVar, f.aoY.errorCode, f.aoY.msg, false);
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }

    private static void a(final List<String> list, final AdBitResultData adBitResultData, final com.kwad.components.core.request.model.a aVar) {
        new m<com.kwad.components.ad.a.b, AdBitResultData>() { // from class: com.kwad.components.ad.adbit.c.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: Q */
            public com.kwad.components.ad.a.b createRequest() {
                return new com.kwad.components.ad.a.b(adBitResultData.adxId, list);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.m
            /* renamed from: n */
            public AdBitResultData parseData(String str) {
                JSONObject jSONObject = new JSONObject(str);
                AdBitResultData adBitResultData2 = new AdBitResultData(com.kwad.components.core.request.model.a.this.Lp.adScene);
                adBitResultData2.parseJson(jSONObject);
                return adBitResultData2;
            }
        }.request(new p<com.kwad.components.ad.a.b, AdBitResultData>() { // from class: com.kwad.components.ad.adbit.c.5
            private void b(int i, String str) {
                com.kwad.components.core.request.model.a.a(aVar, i, str, false);
            }

            private void c(AdBitResultData adBitResultData2) {
                adBitResultData2.setAdTemplateList(c.a(AdBitResultData.this, adBitResultData2));
                if (adBitResultData2.isAdResultDataEmpty()) {
                    com.kwad.components.core.request.model.a.a(aVar, f.aoZ.errorCode, TextUtils.isEmpty(adBitResultData2.testErrorMsg) ? f.aoZ.msg : adBitResultData2.testErrorMsg, false);
                    return;
                }
                AdTemplate adTemplate = adBitResultData2.getAdTemplateList().get(0);
                int i = aVar.Lp.adScene.adStyle;
                if (i == 10000 || i == d.ce(adTemplate)) {
                    com.kwad.components.core.request.model.a.a(aVar, adBitResultData2, false);
                } else {
                    com.kwad.components.core.request.model.a.a(aVar, f.apd.errorCode, f.apd.msg, false);
                }
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onError(g gVar, int i, String str) {
                b(i, str);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(g gVar, BaseResultData baseResultData) {
                c((AdBitResultData) baseResultData);
            }
        });
    }

    public static List<AdTemplate> b(AdBitResultData adBitResultData) {
        AdTemplate a;
        ArrayList arrayList = new ArrayList();
        for (AdBid adBid : adBitResultData.adBidList) {
            if (adBid != null && adBid.bidEcpm > 0 && adBid.creativeId > 0 && (a = a(adBitResultData, adBid.creativeId)) != null) {
                a.mBidEcpm = adBid.bidEcpm;
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public static boolean b(final com.kwad.components.core.request.model.a aVar) {
        String bidResponseV2 = aVar.Lp.adScene.getBidResponseV2();
        if (!TextUtils.isEmpty(bidResponseV2)) {
            a(bidResponseV2, aVar);
            return true;
        }
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        final String bidResponse = aVar.Lp.adScene.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            return false;
        }
        GlobalThreadPools.CV().submit(new Runnable() { // from class: com.kwad.components.ad.adbit.c.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject(bidResponse);
                    AdBitResultData adBitResultData = new AdBitResultData(aVar.Lp.adScene);
                    adBitResultData.parseJson(jSONObject);
                    adBitResultData.setAdTemplateList(c.b(adBitResultData));
                    if (adBitResultData.isAdResultDataEmpty()) {
                        com.kwad.components.core.request.model.a.a(aVar, f.aoZ.errorCode, TextUtils.isEmpty(adBitResultData.testErrorMsg) ? f.aoZ.msg : adBitResultData.testErrorMsg, true);
                        return;
                    }
                    AdTemplate adTemplate = adBitResultData.getAdTemplateList().get(0);
                    int adStyle = aVar.Lp.adScene.getAdStyle();
                    if (adStyle == 10000 || adStyle == d.ce(adTemplate)) {
                        com.kwad.components.core.request.model.a.a(aVar, adBitResultData, true);
                    } else {
                        com.kwad.components.core.request.model.a.a(aVar, f.apd.errorCode, f.apd.msg, true);
                    }
                } catch (Exception e) {
                    com.kwad.components.core.request.model.a.a(aVar, f.aoY.errorCode, f.aoY.msg, true);
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                }
            }
        });
        return true;
    }

    public static String getBidRequestTokenV2(KsScene ksScene) {
        final com.kwad.components.core.request.model.a pL = new a.C0211a().e(new ImpInfo(SceneImpl.covert(ksScene))).a(new com.kwad.components.core.request.c()).pL();
        com.kwad.components.ad.a.a aVar = (com.kwad.components.ad.a.a) a(new com.kwad.sdk.g.c<com.kwad.components.ad.a.a>() { // from class: com.kwad.components.ad.adbit.c.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.c
            /* renamed from: P */
            public com.kwad.components.ad.a.a get() {
                return new com.kwad.components.ad.a.a(com.kwad.components.core.request.model.a.this);
            }
        });
        return new a(aVar.getBody(), aVar.getHeader()).N();
    }
}
