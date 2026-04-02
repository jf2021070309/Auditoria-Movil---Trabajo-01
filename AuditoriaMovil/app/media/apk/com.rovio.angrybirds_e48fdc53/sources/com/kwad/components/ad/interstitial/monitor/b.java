package com.kwad.components.ad.interstitial.monitor;

import android.os.SystemClock;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static final b jb = new b((byte) 0);
    }

    private b() {
        init();
    }

    /* synthetic */ b(byte b) {
        this();
    }

    public static void a(int i, String str, long j) {
        KSLoggerReporter.t(new InterstitialMonitorInfo(j).setStatus(5).setErrorCode(i).setErrorMsg(str).toJson());
    }

    public static void a(long j, int i, String str) {
        if (KsAdSDKImpl.get().hasInitFinish()) {
            KSLoggerReporter.t(new InterstitialMonitorInfo(j).setStatus(9).setErrorCode(i).setErrorMsg(str).toJson());
        }
    }

    public static void a(AdTemplate adTemplate, int i, String str) {
        AdInfo ck = d.ck(adTemplate);
        KSLoggerReporter.y(new InterstitialMonitorInfo(adTemplate.posId).setCreativeId(com.kwad.sdk.core.response.b.a.E(ck)).setVideoUrl(com.kwad.sdk.core.response.b.a.F(ck)).setDownloadType(adTemplate.getDownloadType()).setDownloadSize(adTemplate.getDownloadSize()).setVideoDuration(com.kwad.sdk.core.response.b.a.G(ck) * 1000).setStatus(2).setErrorMsg(str).setErrorCode(i).toJson());
    }

    public static void a(AdTemplate adTemplate, long j) {
        AdInfo ck = d.ck(adTemplate);
        KSLoggerReporter.u(new InterstitialMonitorInfo(adTemplate.posId).setStatus(3).setCreativeId(d.cu(adTemplate)).setVideoUrl(com.kwad.sdk.core.response.b.a.F(ck)).setVideoDuration(com.kwad.sdk.core.response.b.a.G(ck) * 1000).setPlayStartedDuration(j).toJson());
    }

    public static void a(AdTemplate adTemplate, long j, boolean z) {
        if (j <= 0) {
            return;
        }
        adTemplate.loadDataTime = SystemClock.elapsedRealtime() - j;
        if (adTemplate.loadDataTime <= 0 || adTemplate.loadDataTime >= 60000) {
            return;
        }
        KSLoggerReporter.t(new InterstitialMonitorInfo(adTemplate.posId).setStatus(2).setType(z ? 2 : 1).setLoadDataTime(adTemplate.loadDataTime).setExpectedRenderType(com.kwad.sdk.core.response.b.b.bF(adTemplate)).toJson());
    }

    public static void a(AdTemplate adTemplate, String str) {
        AdInfo ck = d.ck(adTemplate);
        KSLoggerReporter.w(new InterstitialMonitorInfo(adTemplate.posId).setCreativeId(com.kwad.sdk.core.response.b.a.E(ck)).setVideoUrl(com.kwad.sdk.core.response.b.a.F(ck)).setDownloadSize(adTemplate.getDownloadSize()).setDownloadType(adTemplate.getDownloadType()).setVideoDuration(com.kwad.sdk.core.response.b.a.G(ck) * 1000).setStatus(2).setErrorMsg(str).toJson());
    }

    public static void b(AdTemplate adTemplate, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - adTemplate.adShowStartTimeStamp;
        if (adTemplate.adShowStartTimeStamp <= 0 || adTemplate.loadDataTime <= 0 || adTemplate.loadDataTime >= 60000 || elapsedRealtime <= 0 || elapsedRealtime >= PushUIConfig.dismissTime) {
            return;
        }
        KSLoggerReporter.t(new InterstitialMonitorInfo(adTemplate.posId).setStatus(4).setType(adTemplate.notNetworkRequest ? 2 : 1).setMaterialType(com.kwad.sdk.core.response.b.a.aW(d.ck(adTemplate))).setRenderDuration(elapsedRealtime).setRenderType(i).setExpectedRenderType(com.kwad.sdk.core.response.b.b.bF(adTemplate)).toJson());
    }

    public static void b(AdTemplate adTemplate, long j, boolean z) {
        if (j > 0 && com.kwad.sdk.core.response.b.a.aZ(d.ck(adTemplate))) {
            adTemplate.downloadDuration = SystemClock.elapsedRealtime() - j;
            if (adTemplate.downloadDuration <= 0 || adTemplate.downloadDuration >= 60000) {
                return;
            }
            adTemplate.notNetworkRequest = z;
            KSLoggerReporter.t(new InterstitialMonitorInfo(adTemplate.posId).setStatus(3).setType(adTemplate.notNetworkRequest ? 2 : 1).setDownloadDuration(adTemplate.downloadDuration).setDownloadSize(adTemplate.getDownloadSize()).setDownloadType(adTemplate.getDownloadType()).toJson());
        }
    }

    public static b cM() {
        return a.jb;
    }

    public static void g(long j) {
        KSLoggerReporter.t(new InterstitialMonitorInfo(j).setStatus(1).toJson());
    }

    public static void h(long j) {
        if (KsAdSDKImpl.get().hasInitFinish()) {
            KSLoggerReporter.t(new InterstitialMonitorInfo(j).setStatus(6).toJson());
        }
    }

    public static void i(AdTemplate adTemplate) {
        KSLoggerReporter.t(new InterstitialMonitorInfo(adTemplate.posId).setStatus(8).setType(adTemplate.notNetworkRequest ? 2 : 1).setMaterialType(com.kwad.sdk.core.response.b.a.aW(d.ck(adTemplate))).toJson());
    }

    private static void init() {
        KsAdSDKImpl.get().getContext();
    }

    public static void j(AdTemplate adTemplate) {
        KSLoggerReporter.v(new InterstitialMonitorInfo(adTemplate.posId).setDownloadType(adTemplate.getDownloadType()).setStatus(1).toJson());
    }

    public static void k(AdTemplate adTemplate) {
        KSLoggerReporter.u(new InterstitialMonitorInfo(adTemplate.posId).setStatus(1).toJson());
    }

    public static void l(AdTemplate adTemplate) {
        KSLoggerReporter.x(new InterstitialMonitorInfo(adTemplate.posId).setDownloadType(adTemplate.getDownloadType()).setStatus(1).toJson());
    }
}
