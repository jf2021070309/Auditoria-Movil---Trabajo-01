package com.kwad.components.ad.splashscreen.monitor;

import android.os.SystemClock;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.offline.api.tk.model.StyleTemplate;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a {
    private static volatile a CG;

    private static StyleTemplate F(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate e = com.kwad.sdk.core.response.b.b.e(adTemplate, j.b("ksad-splash-play-card", adTemplate));
        StyleTemplate styleTemplate = new StyleTemplate();
        if (e != null) {
            styleTemplate.templateId = e.templateId;
            styleTemplate.templateMd5 = e.templateMd5;
            styleTemplate.templateUrl = e.templateUrl;
            styleTemplate.templateVersionCode = (int) e.templateVersionCode;
        }
        return styleTemplate;
    }

    public static void H(AdTemplate adTemplate) {
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(1).setType(com.kwad.sdk.core.response.b.a.aV(d.ck(adTemplate)) ? 2 : 1).toJson());
    }

    public static void I(AdTemplate adTemplate) {
        AdInfo ck = d.ck(adTemplate);
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(4).setCreativeId(com.kwad.sdk.core.response.b.a.E(ck)).setType(com.kwad.sdk.core.response.b.a.aV(ck) ? 2 : 1).toJson());
    }

    public static void a(AdInfo adInfo, int i, String str, long j) {
        KSLoggerReporter.o(new SplashMonitorInfo(j).setStatus(2).setPreloadId(com.kwad.sdk.core.response.b.a.aS(adInfo)).setCreativeId(com.kwad.sdk.core.response.b.a.E(adInfo)).setUrl(com.kwad.sdk.core.response.b.a.aU(adInfo) ? com.kwad.sdk.core.response.b.a.F(adInfo) : com.kwad.sdk.core.response.b.a.aM(adInfo).materialUrl).setErrorCode(i).setErrorMsg(str).setMaterialType(com.kwad.sdk.core.response.b.a.aU(adInfo) ? 1 : 2).setType(1).toJson());
    }

    public static void a(AdInfo adInfo, long j, int i, long j2) {
        String F = com.kwad.sdk.core.response.b.a.aU(adInfo) ? com.kwad.sdk.core.response.b.a.F(adInfo) : com.kwad.sdk.core.response.b.a.aM(adInfo).materialUrl;
        File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(com.kwad.sdk.core.response.b.a.aS(adInfo));
        KSLoggerReporter.o(new SplashMonitorInfo(j2).setStatus(1).setPreloadId(com.kwad.sdk.core.response.b.a.aS(adInfo)).setCostTime(j).setCacheValidTime(adInfo.adPreloadInfo.validityPeriod * 1000).setSize((bP == null || !bP.exists()) ? 0L : bP.length()).setUrl(F).setMaterialType(com.kwad.sdk.core.response.b.a.aU(adInfo) ? 1 : 2).setType(i).setCreativeId(com.kwad.sdk.core.response.b.a.E(adInfo)).toJson());
    }

    public static void a(AdTemplate adTemplate, int i, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        KSLoggerReporter.m(new SplashMonitorInfo(adTemplate.posId).setType(adTemplate.notNetworkRequest ? 2 : 1).setStatus(3).setLoadDataTime(adTemplate.loadDataTime).setCheckStatus(i).setCheckDataTime(elapsedRealtime).setBeforeLoadDataTime(j2).setLoadAndCheckDataTime(adTemplate.loadDataTime + elapsedRealtime).setPreloadId(com.kwad.sdk.core.response.b.a.aS(d.ck(adTemplate))).toJson());
    }

    public static void a(AdTemplate adTemplate, StyleTemplate styleTemplate) {
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(101).setTemplateId(styleTemplate.templateId).setTemplateVersionCode(styleTemplate.templateVersionCode).toJson());
    }

    public static void a(AdTemplate adTemplate, StyleTemplate styleTemplate, int i, long j, int i2, long j2, long j3, long j4, long j5, long j6) {
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(104).setTemplateId(styleTemplate.templateId).setTemplateVersionCode(styleTemplate.templateVersionCode).setTkDefaultTimeout(com.kwad.sdk.core.response.b.b.cT(d.ck(adTemplate))).setSoSource(i).setSoLoadTime(j).setOfflineSource(i2).setOfflineLoadTime(j2).setTkFileLoadTime(j3).setTkInitTime(j4).setTkRenderTime(j5).setTkTotalTime(j6).toJson());
    }

    public static void a(AdTemplate adTemplate, String str, boolean z) {
        SplashMonitorInfo type;
        if (adTemplate == null) {
            type = new SplashMonitorInfo(0L).setStatus(7).setErrorMsg(str).setViewSource(z ? 1 : 2);
        } else {
            AdInfo ck = d.ck(adTemplate);
            type = new SplashMonitorInfo(adTemplate.posId).setStatus(7).setCreativeId(com.kwad.sdk.core.response.b.a.E(ck)).setErrorMsg(str).setViewSource(z ? 1 : 2).setType(com.kwad.sdk.core.response.b.a.aV(ck) ? 2 : 1);
        }
        KSLoggerReporter.q(type.toJson());
    }

    public static void a(String str, boolean z, int i, String str2, long j) {
        KSLoggerReporter.m(new SplashMonitorInfo(j).setStatus(4).setType(z ? 2 : 1).setErrorCode(i).setPreloadId(str).setErrorMsg(str2).toJson());
    }

    public static void a(List<AdTemplate> list, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        for (AdTemplate adTemplate : list) {
            arrayList.add(com.kwad.sdk.core.response.b.a.aS(d.ck(adTemplate)));
        }
        KSLoggerReporter.n(new SplashMonitorInfo(j2).setStatus(2).setIds(arrayList).setLoadDataTime(j).setCount(list.size()).toJson());
    }

    public static void b(int i, String str, long j) {
        KSLoggerReporter.n(new SplashMonitorInfo(j).setStatus(3).setErrorCode(i).setErrorMsg(str).toJson());
    }

    public static void b(AdTemplate adTemplate, int i, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        AdInfo ck = d.ck(adTemplate);
        KSLoggerReporter.m(new SplashMonitorInfo(adTemplate.posId).setType(adTemplate.notNetworkRequest ? 2 : 1).setStatus(5).setCheckStatus(i).setLoadDataTime(adTemplate.loadDataTime).setCheckDataTime(elapsedRealtime).setBeforeLoadDataTime(j2).setLoadAndCheckDataTime(adTemplate.loadDataTime + elapsedRealtime).setPreloadId(com.kwad.sdk.core.response.b.a.aS(ck)).setUrl(com.kwad.sdk.core.response.b.a.aU(ck) ? com.kwad.sdk.core.response.b.a.F(ck) : com.kwad.sdk.core.response.b.a.aM(ck).materialUrl).toJson());
    }

    public static void b(AdTemplate adTemplate, int i, String str) {
        AdInfo ck = d.ck(adTemplate);
        boolean aV = com.kwad.sdk.core.response.b.a.aV(ck);
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(3).setCreativeId(com.kwad.sdk.core.response.b.a.E(ck)).setPreloadId(com.kwad.sdk.core.response.b.a.aS(ck)).setType(aV ? 2 : 1).setUrl(aV ? com.kwad.sdk.core.response.b.a.aM(ck).materialUrl : com.kwad.sdk.core.response.b.a.F(ck)).setErrorCode(i).setErrorMsg(str).toJson());
    }

    public static void b(AdTemplate adTemplate, StyleTemplate styleTemplate) {
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(102).setTemplateId(styleTemplate.templateId).setTemplateVersionCode(styleTemplate.templateVersionCode).toJson());
    }

    public static void c(AdTemplate adTemplate, long j, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        AdInfo ck = d.ck(adTemplate);
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(6).setCreativeId(com.kwad.sdk.core.response.b.a.E(ck)).setViewSource(z ? 1 : 2).setLoadDataTime(elapsedRealtime).setType(com.kwad.sdk.core.response.b.a.aV(ck) ? 2 : 1).toJson());
    }

    public static void c(AdTemplate adTemplate, StyleTemplate styleTemplate) {
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(106).setTemplateId(styleTemplate.templateId).setTemplateVersionCode(styleTemplate.templateVersionCode).setTkDefaultTimeout(com.kwad.sdk.core.response.b.b.cT(d.ck(adTemplate))).toJson());
    }

    public static void d(long j, long j2) {
        KSLoggerReporter.m(new SplashMonitorInfo(j).setStatus(11).setBeforeLoadDataTime(j2).toJson());
    }

    public static void d(AdTemplate adTemplate, long j) {
        KSLoggerReporter.m(new SplashMonitorInfo(adTemplate.posId).setType(adTemplate.notNetworkRequest ? 2 : 1).setStatus(2).setBeforeLoadDataTime(j).setLoadDataTime(adTemplate.loadDataTime).setPreloadId(com.kwad.sdk.core.response.b.a.aS(d.ck(adTemplate))).toJson());
    }

    public static void e(AdResultData adResultData) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AdTemplate adTemplate : adResultData.getAdTemplateList()) {
            arrayList.add(String.valueOf(com.kwad.sdk.core.response.b.a.E(d.ck(adTemplate))));
            arrayList2.add(com.kwad.sdk.core.response.b.a.aS(d.ck(adTemplate)));
        }
        KSLoggerReporter.p(new SplashMonitorInfo(adResultData.getPosId()).setTotalCount(adResultData.getAdTemplateList().size()).setCreativeIds(arrayList).setPreloadIds(arrayList2).toJson());
    }

    public static void e(AdTemplate adTemplate, long j) {
        AdInfo ck = d.ck(adTemplate);
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(5).setType(com.kwad.sdk.core.response.b.a.aV(ck) ? 2 : 1).setCostTime(j).setCreativeId(com.kwad.sdk.core.response.b.a.E(ck)).setPreloadId(com.kwad.sdk.core.response.b.a.aS(ck)).toJson());
    }

    public static void f(AdTemplate adTemplate, long j) {
        AdInfo ck = d.ck(adTemplate);
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(2).setType(com.kwad.sdk.core.response.b.a.aV(ck) ? 2 : 1).setCostTime(j).setCreativeId(com.kwad.sdk.core.response.b.a.E(ck)).setPreloadId(com.kwad.sdk.core.response.b.a.aS(ck)).toJson());
    }

    public static a kP() {
        if (CG == null) {
            synchronized (a.class) {
                if (CG == null) {
                    CG = new a();
                }
            }
        }
        return CG;
    }

    public static void m(long j) {
        KSLoggerReporter.m(new SplashMonitorInfo(j).setStatus(1).toJson());
    }

    public static void n(long j) {
        KSLoggerReporter.n(new SplashMonitorInfo(j).setStatus(1).toJson());
    }

    public final void b(AdTemplate adTemplate, String str) {
        StyleTemplate F = F(adTemplate);
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(103).setTemplateId(F.templateId).setTemplateVersionCode(F.templateVersionCode).setTkDefaultTimeout(com.kwad.sdk.core.response.b.b.cT(d.ck(adTemplate))).setErrorMsg(str).toJson());
    }

    public final void c(AdTemplate adTemplate, String str) {
        StyleTemplate F = F(adTemplate);
        KSLoggerReporter.q(new SplashMonitorInfo(adTemplate.posId).setStatus(105).setTemplateId(F.templateId).setTemplateVersionCode(F.templateVersionCode).setErrorMsg(str).setTkDefaultTimeout(com.kwad.sdk.core.response.b.b.cT(d.ck(adTemplate))).toJson());
    }
}
