package com.kwad.components.ad.feed.monitor;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.report.p;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    public static void a(int i, long j) {
        c(new FeedPageInfo().setStatus(6).setAdNum(i).setLoadDataDuration(j).toJson());
    }

    public static void a(AdTemplate adTemplate, int i) {
        c(new FeedPageInfo().setStatus(7).setType(adTemplate.type).setMaterialType(com.kwad.sdk.core.response.b.a.aW(d.ck(adTemplate))).setRenderType(i).setExpectedRenderType(2).toJson());
    }

    public static void a(AdTemplate adTemplate, int i, int i2, String str, String str2, long j) {
        if (i2 == 1 && adTemplate.mHasReportVideoLoad) {
            return;
        }
        if (i2 == 1) {
            adTemplate.mHasReportVideoLoad = true;
        }
        a(new FeedPageInfo().setStatus(3).setType(adTemplate.type).setLoadStatus(i).setResourceLoadDuration(j).setMaterialType(i2).setMaterialUrl(str).setErrorMsg(str2).toJson(), i == 2);
    }

    public static void a(AdTemplate adTemplate, int i, long j) {
        c(new FeedPageInfo().setStatus(8).setType(adTemplate.type).setMaterialType(com.kwad.sdk.core.response.b.a.aW(d.ck(adTemplate))).setRenderType(i).setConvertDuration(j).toJson());
    }

    public static void a(AdTemplate adTemplate, int i, long j, String str) {
        AdInfo ck = d.ck(adTemplate);
        a(new FeedPageInfo().setStatus(5).setType(adTemplate.type).setMaterialType(com.kwad.sdk.core.response.b.a.aW(ck)).setRenderType(i).setExpectedRenderType(2).setErrorMsg(str).setRenderDuration(j).setExtMsg(ck.adStyleInfo.feedAdInfo.toString()).toJson(), i != 2);
    }

    public static void a(String str, long j, int i) {
        KSLoggerReporter.k(new FeedWebViewInfo().setEvent("webview_timeout").setSceneId("ad_feed").setTimeType(i).setDurationMs(j).setUrl(str).toJson());
    }

    private static void a(JSONObject jSONObject, boolean z) {
        KSLoggerReporter.a(new p.a().dz(z ? ILoggerReporter.Category.ERROR_LOG : ILoggerReporter.Category.APM_LOG).b(BusinessType.AD_FEED).a(SubBusinessType.OTHER).a(com.kwai.adclient.kscommerciallogger.model.a.aNo).dA("ad_sdk_feed_load").C(jSONObject).Cc());
    }

    public static void aW() {
        KSLoggerReporter.k(new FeedWebViewInfo().setEvent("ad_show").setSceneId("ad_feed").toJson());
    }

    public static void aX() {
        KSLoggerReporter.k(new FeedWebViewInfo().setEvent("webview_init").setSceneId("ad_feed").toJson());
    }

    public static void c(String str, long j) {
        KSLoggerReporter.k(new FeedWebViewInfo().setEvent("webview_load_finish").setSceneId("ad_feed").setDurationMs(j).setUrl(str).toJson());
    }

    private static void c(JSONObject jSONObject) {
        a(jSONObject, false);
    }

    public static void d(int i, String str) {
        a(new FeedPageInfo().setStatus(9).setErrorCode(i).setErrorMsg(str).toJson(), true);
    }

    public static void e(int i, String str) {
        a(new FeedPageInfo().setStatus(10).setLoadStatus(i).setErrorMsg(str).toJson(), i == 2);
    }

    public static void o(String str) {
        KSLoggerReporter.k(new FeedWebViewInfo().setEvent("webview_load_url").setSceneId("ad_feed").setUrl(str).toJson());
    }

    public static void s(int i) {
        c(new FeedPageInfo().setStatus(1).setAdNum(i).toJson());
    }

    public static void t(int i) {
        c(new FeedPageInfo().setStatus(2).setAdNum(i).toJson());
    }
}
