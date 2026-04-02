package com.kwad.components.ad.splashscreen;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
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
/* loaded from: classes.dex */
public final class b {
    private static final Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private volatile boolean BQ;

        private a() {
            this.BQ = false;
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.splashscreen.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0176b {
        private volatile boolean BR;

        private C0176b() {
            this.BR = false;
        }

        /* synthetic */ C0176b(byte b) {
            this();
        }

        static /* synthetic */ boolean a(C0176b c0176b, boolean z) {
            c0176b.BR = true;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(ImpInfo impInfo) {
        final SceneImpl sceneImpl = impInfo.adScene;
        if (TextUtils.isEmpty(sceneImpl.getBidResponse()) && TextUtils.isEmpty(sceneImpl.getBidResponseV2())) {
            com.kwad.components.core.p.a.pC().pF();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            com.kwad.components.ad.splashscreen.monitor.a.kP();
            com.kwad.components.ad.splashscreen.monitor.a.n(sceneImpl.posId);
            sceneImpl.setAdStyle(4);
            sceneImpl.setAdNum(5);
            com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashScreenCache ");
            KsAdLoadManager.M();
            KsAdLoadManager.a(new a.C0211a().e(impInfo).aE(false).a(new com.kwad.components.core.request.c() { // from class: com.kwad.components.ad.splashscreen.b.4
                @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
                public final void a(AdResultData adResultData) {
                    if (adResultData.getAdTemplateList().size() > 0) {
                        int b = SplashPreloadManager.kD().b(adResultData, false);
                        com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashScreenCache onSuccess:" + adResultData.getAdTemplateList().size() + " saved " + b);
                        com.kwad.components.ad.splashscreen.monitor.a.kP();
                        com.kwad.components.ad.splashscreen.monitor.a.a(adResultData.getAdTemplateList(), SystemClock.elapsedRealtime() - elapsedRealtime, SceneImpl.this.getPosId());
                        com.kwad.components.core.p.a.pC().aB(adResultData.getAdTemplateList().size());
                    }
                }

                @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.i
                public final void onError(int i, String str) {
                    com.kwad.components.ad.splashscreen.monitor.a.kP();
                    com.kwad.components.ad.splashscreen.monitor.a.b(i, str, SceneImpl.this.getPosId());
                    com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashScreenCache onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                }
            }).pL());
        }
    }

    public static void loadSplashScreenAd(KsScene ksScene, final KsLoadManager.SplashScreenAdListener splashScreenAdListener) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final SceneImpl covert = SceneImpl.covert(ksScene);
        com.kwad.components.ad.splashscreen.monitor.a.kP();
        com.kwad.components.ad.splashscreen.monitor.a.m(covert.getPosId());
        boolean a2 = k.qq().a(covert, "loadSplashScreenAd");
        covert.setAdStyle(4);
        covert.setAdNum(1);
        com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashScreenAd ");
        final a aVar = new a((byte) 0);
        aVar.BQ = false;
        final long elapsedRealtime2 = SystemClock.elapsedRealtime();
        final ImpInfo impInfo = new ImpInfo(covert);
        final C0176b c0176b = new C0176b((byte) 0);
        com.kwad.components.core.p.a.pC().pE();
        Handler handler = mHandler;
        handler.postDelayed(new Runnable() { // from class: com.kwad.components.ad.splashscreen.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.a(ImpInfo.this);
            }
        }, 15000L);
        final Runnable runnable = new Runnable() { // from class: com.kwad.components.ad.splashscreen.b.2
            @Override // java.lang.Runnable
            public final void run() {
                C0176b.a(C0176b.this, true);
                com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd mTimeOutRunnable timeOut");
                splashScreenAdListener.onError(com.kwad.sdk.core.network.f.apb.errorCode, com.kwad.sdk.core.network.f.apb.msg);
                com.kwad.components.ad.splashscreen.monitor.a.kP();
                com.kwad.components.ad.splashscreen.monitor.a.a("", false, com.kwad.sdk.core.network.f.apb.errorCode, com.kwad.sdk.core.network.f.apb.msg, covert.getPosId());
                com.kwad.components.core.p.a.pC().aA(4);
            }
        };
        int a3 = com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CB);
        if (a3 < 0) {
            a3 = 5000;
        }
        handler.postDelayed(runnable, a3);
        final long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        com.kwad.components.ad.splashscreen.monitor.a.kP();
        com.kwad.components.ad.splashscreen.monitor.a.d(covert.getPosId(), elapsedRealtime3);
        KsAdLoadManager.M();
        KsAdLoadManager.a(new a.C0211a().e(impInfo).aD(true).aE(a2).a(new com.kwad.components.core.request.c() { // from class: com.kwad.components.ad.splashscreen.b.3
            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.b
            public final void a(final int i, final String str, boolean z) {
                if (C0176b.this.BR) {
                    com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd onError isTimeOut return " + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                    return;
                }
                b.mHandler.removeCallbacks(runnable);
                if (!aVar.BQ) {
                    com.kwad.components.ad.splashscreen.monitor.a.kP();
                    com.kwad.components.ad.splashscreen.monitor.a.a("", z, i, str, covert.getPosId());
                }
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                        splashScreenAdListener.onError(i, str);
                        if (i == com.kwad.sdk.core.network.f.apc.errorCode) {
                            com.kwad.components.core.p.a.pC().aA(0);
                        } else {
                            com.kwad.components.core.p.a.pC().aA(3);
                        }
                    }
                });
            }

            @Override // com.kwad.components.core.request.c, com.kwad.components.core.request.b
            public final void a(final AdResultData adResultData, boolean z) {
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.b.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            splashScreenAdListener.onRequestResult(adResultData.getAdTemplateList().size());
                        } catch (Throwable th) {
                            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                        }
                    }
                });
                if (adResultData.getAdTemplateList().size() <= 0) {
                    if (C0176b.this.BR) {
                        com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd isTimeOut return ");
                        return;
                    }
                    b.mHandler.removeCallbacks(runnable);
                    com.kwad.components.ad.splashscreen.monitor.a.kP();
                    com.kwad.components.ad.splashscreen.monitor.a.a("", z, com.kwad.sdk.core.network.f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? com.kwad.sdk.core.network.f.aoZ.msg : adResultData.testErrorMsg, covert.getPosId());
                    aVar.BQ = true;
                    a(com.kwad.sdk.core.network.f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? com.kwad.sdk.core.network.f.aoZ.msg : adResultData.testErrorMsg, z);
                    com.kwad.components.core.p.a.pC().aA(3);
                    return;
                }
                AdTemplate adTemplate = adResultData.getAdTemplateList().get(0);
                adTemplate.loadDataTime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                adTemplate.notNetworkRequest = z;
                com.kwad.components.ad.splashscreen.monitor.a.kP();
                com.kwad.components.ad.splashscreen.monitor.a.d(adTemplate, elapsedRealtime3);
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_SPLASH, "dataReady").report();
                long elapsedRealtime4 = SystemClock.elapsedRealtime();
                final KsSplashScreenAdControl ksSplashScreenAdControl = new KsSplashScreenAdControl(covert, adResultData);
                boolean c = SplashPreloadManager.kD().c(adResultData);
                com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd onSuccess " + c);
                if (!c) {
                    SplashPreloadManager.kD();
                    if (!SplashPreloadManager.d(adResultData)) {
                        if (C0176b.this.BR) {
                            com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd isTimeOut return ");
                            return;
                        }
                        b.mHandler.removeCallbacks(runnable);
                        com.kwad.components.ad.splashscreen.monitor.a.kP();
                        com.kwad.components.ad.splashscreen.monitor.a.b(adTemplate, 5, elapsedRealtime4, elapsedRealtime3);
                        aVar.BQ = true;
                        a(com.kwad.sdk.core.network.f.apa.errorCode, "请求成功，但缓存未命中", z);
                        com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd no cache returned");
                        com.kwad.components.core.p.a.pC().aA(3);
                        return;
                    }
                    com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd image returned");
                    int b = SplashPreloadManager.kD().b(adResultData, true);
                    if (!C0176b.this.BR) {
                        b.mHandler.removeCallbacks(runnable);
                        if (b > 0) {
                            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.b.3.4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        KsAdLoadManager.M().a((KsAdLoadManager) ksSplashScreenAdControl);
                                        splashScreenAdListener.onSplashScreenAdLoad(ksSplashScreenAdControl);
                                    } catch (Throwable th) {
                                        com.kwad.sdk.core.e.c.printStackTrace(th);
                                    }
                                }
                            });
                            com.kwad.components.ad.splashscreen.monitor.a.kP();
                            com.kwad.components.ad.splashscreen.monitor.a.a(adTemplate, 3, elapsedRealtime4, elapsedRealtime3);
                            com.kwad.components.core.p.a.pC().aA(2);
                            return;
                        }
                        com.kwad.components.ad.splashscreen.monitor.a.kP();
                        com.kwad.components.ad.splashscreen.monitor.a.b(adTemplate, 4, elapsedRealtime4, elapsedRealtime3);
                        aVar.BQ = true;
                        a(com.kwad.sdk.core.network.f.apc.errorCode, com.kwad.sdk.core.network.f.apc.msg, z);
                        return;
                    }
                } else if (!C0176b.this.BR) {
                    b.mHandler.removeCallbacks(runnable);
                    bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.b.3.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                KsAdLoadManager.M().a((KsAdLoadManager) ksSplashScreenAdControl);
                                splashScreenAdListener.onSplashScreenAdLoad(ksSplashScreenAdControl);
                            } catch (Throwable th) {
                                com.kwad.sdk.core.e.c.printStackTrace(th);
                            }
                        }
                    });
                    com.kwad.components.ad.splashscreen.monitor.a.kP();
                    com.kwad.components.ad.splashscreen.monitor.a.a(adTemplate, 2, elapsedRealtime4, elapsedRealtime3);
                    com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd cache returned");
                    com.kwad.components.core.p.a.pC().aA(1);
                    return;
                }
                com.kwad.components.ad.splashscreen.monitor.a.kP();
                com.kwad.components.ad.splashscreen.monitor.a.b(adTemplate, 7, elapsedRealtime4, elapsedRealtime3);
                com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd isTimeOut return ");
            }
        }).pL());
    }
}
