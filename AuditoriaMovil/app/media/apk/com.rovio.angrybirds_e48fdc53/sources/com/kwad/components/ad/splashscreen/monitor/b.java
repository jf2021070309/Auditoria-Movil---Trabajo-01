package com.kwad.components.ad.splashscreen.monitor;

import com.kwad.sdk.core.report.KSLoggerReporter;
/* loaded from: classes.dex */
public final class b {
    public static void Y(String str) {
        KSLoggerReporter.k(new SplashWebMonitorInfo().setEvent("webview_load_url").setSceneId("ad_splash").setUrl(str).toJson());
    }

    public static void a(String str, long j, int i, String str2) {
        KSLoggerReporter.k(new SplashWebMonitorInfo().setEvent("webview_timeout").setSceneId("ad_splash").setDurationMs(j).setTimeType(i).setUrl(str).setErrorMsg(str2).toJson());
    }

    public static void d(String str, long j) {
        KSLoggerReporter.k(new SplashWebMonitorInfo().setEvent("webview_load_finish").setSceneId("ad_splash").setDurationMs(j).setUrl(str).toJson());
    }

    public static void kQ() {
        KSLoggerReporter.k(new SplashWebMonitorInfo().setEvent("ad_show").setSceneId("ad_splash").toJson());
    }

    public static void kR() {
        KSLoggerReporter.k(new SplashWebMonitorInfo().setEvent("webview_init").setSceneId("ad_splash").toJson());
    }
}
