package com.kwad.components.ad.f;

import android.text.TextUtils;
import com.kwad.components.ad.KsAdLoadManager;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.request.model.a;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.components.core.t.k;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.bj;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c {
    public static void loadNativeAd(KsScene ksScene, final KsLoadManager.NativeAdListener nativeAdListener) {
        final SceneImpl covert = SceneImpl.covert(ksScene);
        boolean a = k.qq().a(covert, "loadNativeAd");
        covert.setAdStyle(10000);
        KsAdLoadManager.M();
        KsAdLoadManager.a(new a.C0211a().e(new ImpInfo(covert)).aE(a).a(new com.kwad.components.core.request.c() { // from class: com.kwad.components.ad.f.c.1
            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
            public final void a(AdResultData adResultData) {
                final ArrayList arrayList = new ArrayList();
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_NATIVE, "dataReady").report();
                for (AdTemplate adTemplate : adResultData.getAdTemplateList()) {
                    if (adTemplate != null) {
                        adTemplate.mAdScene = covert;
                        arrayList.add(new d(adTemplate));
                    }
                }
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.f.c.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        KsAdLoadManager.M().b(arrayList);
                        KsLoadManager.NativeAdListener.this.onNativeAdLoad(arrayList);
                    }
                });
            }

            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
            public final void onError(final int i, final String str) {
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.f.c.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.core.e.c.d("KsAdNativeLoadManager", "loadNativeAd onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                        KsLoadManager.NativeAdListener.this.onError(i, str);
                    }
                });
            }
        }).pL());
    }

    public static void loadNativeAd(String str, final KsLoadManager.NativeAdListener nativeAdListener) {
        if (k.qq().a((SceneImpl) null, "loadNativeAdByJson") && k.qq().qr() == 1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.f.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.kwad.sdk.core.e.c.e("KsAdNativeLoadManager", "method parseJson params jsonResult is empty");
                    KsLoadManager.NativeAdListener.this.onError(com.kwad.sdk.core.network.f.aoZ.errorCode, com.kwad.sdk.core.network.f.aoZ.msg);
                }
            });
        }
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_NATIVE, "requestFinish").be(true).report();
        try {
            JSONObject jSONObject = new JSONObject(str);
            final AdResultData adResultData = new AdResultData();
            adResultData.parseJson(jSONObject);
            if (adResultData.result != 1) {
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.f.c.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.core.e.c.e("KsAdNativeLoadManager", "loadNativeAd onError:" + String.format("%s__%s", Integer.valueOf(AdResultData.this.result), AdResultData.this.errorMsg));
                        nativeAdListener.onError(AdResultData.this.result, AdResultData.this.errorMsg);
                    }
                });
            } else if (adResultData.isAdResultDataEmpty()) {
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.f.c.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        KsLoadManager.NativeAdListener.this.onError(com.kwad.sdk.core.network.f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? com.kwad.sdk.core.network.f.aoZ.msg : adResultData.testErrorMsg);
                    }
                });
            } else {
                final ArrayList arrayList = new ArrayList();
                for (AdTemplate adTemplate : adResultData.getAdTemplateList()) {
                    if (adTemplate != null) {
                        arrayList.add(new d(adTemplate));
                    }
                }
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_NATIVE, "dataReady").be(true).report();
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.f.c.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        KsLoadManager.NativeAdListener.this.onNativeAdLoad(arrayList);
                    }
                });
            }
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            nativeAdListener.onError(com.kwad.sdk.core.network.f.aoY.errorCode, com.kwad.sdk.core.network.f.aoY.msg);
        }
    }
}
