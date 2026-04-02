package com.kwad.components.ad.splashscreen;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo;
import com.kwad.components.core.e.d.a;
import com.kwad.components.offline.api.tk.model.StyleTemplate;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsSplashScreenAd;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.bi;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h extends com.kwad.sdk.mvp.a {
    private KsSplashScreenAd.SplashScreenAdInteractionListener BV;
    public com.kwad.components.ad.splashscreen.e.a Ch;
    public StyleTemplate Ci;
    public com.kwad.sdk.core.h.a Cj;
    public int Cq;
    public int Cr;
    public long Cs;
    public long Ct;
    public long Cu;
    public long Cv;
    public long Cw;
    public long Cx;
    public long Cy;
    public SceneImpl mAdScene;
    public com.kwad.components.core.e.d.c mApkDownloadHelper;
    public AdBaseFrameLayout mRootContainer;
    public bi mTimerHelper;
    public KsVideoPlayConfig mVideoPlayConfig;
    private List<g> Ck = new CopyOnWriteArrayList();
    private List<f> Cl = new CopyOnWriteArrayList();
    private boolean Cm = false;
    public boolean Cn = false;
    public boolean Co = false;
    public long Cp = SystemClock.elapsedRealtime();
    public boolean isWebTimeout = false;

    /* loaded from: classes.dex */
    public interface a {
        void b(j jVar);
    }

    private void kL() {
        kM();
        for (g gVar : this.Ck) {
            gVar.kF();
        }
    }

    private void kM() {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        SplashMonitorInfo elementTypes = new SplashMonitorInfo(this.mAdTemplate.posId).setStatus(8).setElementTypes(com.kwad.components.core.webview.b.d.a.se().sf());
        bi biVar = this.mTimerHelper;
        KSLoggerReporter.q(elementTypes.setShowEndTime(biVar != null ? biVar.getTime() : -1L).setRotateComposeTimeout(this.Co).setTkDefaultTimeout(com.kwad.sdk.core.response.b.b.cT(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))).setSoSource(this.Cq).setSoLoadTime(this.Cs).setOfflineSource(this.Cr).setOfflineLoadTime(this.Ct).setTkFileLoadTime(this.Cu).setTkInitTime(this.Cv).setTkRenderTime(this.Cw).setNativeLoadTime(this.Cx).setWebTimeout(this.isWebTimeout).setWebLoadTime(this.Cy).setInteractiveStyle(com.kwad.sdk.core.response.b.b.de(ck)).setInteractivityDefaultStyle(com.kwad.sdk.core.response.b.b.df(ck)).setCreativeId(com.kwad.sdk.core.response.b.a.E(ck)).toJson());
        com.kwad.components.core.webview.b.d.a.se().sg();
    }

    private void kN() {
        for (f fVar : this.Cl) {
            fVar.kB();
        }
    }

    public static boolean m(AdInfo adInfo) {
        return adInfo.adSplashInfo.fullScreenClickSwitch == 1;
    }

    public static boolean o(AdInfo adInfo) {
        return com.kwad.sdk.core.response.b.b.cK(adInfo) && com.kwad.sdk.core.response.b.a.aV(adInfo);
    }

    public final void S(Context context) {
        if (this.mAdTemplate.mPvReported) {
            return;
        }
        com.kwad.components.ad.splashscreen.local.a.T(context);
        com.kwad.components.core.t.b.ql().a(this.mAdTemplate, null, null);
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_SPLASH, "adShowSuccess").report();
        kH();
    }

    public final void Y(int i) {
        for (g gVar : this.Ck) {
            gVar.X(i);
        }
    }

    public final void a(int i, Context context, final int i2, int i3, final a aVar) {
        com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        com.kwad.components.core.e.d.a.a(new a.C0197a(context).S(this.mAdTemplate).b(this.mApkDownloadHelper).ao(i3).al(false).an(i2).am(i).a(new a.b() { // from class: com.kwad.components.ad.splashscreen.h.1
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                if (h.this.BV != null) {
                    h.this.BV.onAdClicked();
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    if (h.this.Ch != null) {
                        jSONObject.put("duration", h.this.Ch.getCurrentPosition());
                    }
                } catch (JSONException e) {
                    com.kwad.sdk.core.e.c.printStackTrace(e);
                }
                j c = new j().cg(i2).c(h.this.mRootContainer.getTouchCoords());
                com.kwad.sdk.core.report.a.a(h.this.mAdTemplate, c, jSONObject);
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(c);
                }
            }
        }));
    }

    public final void a(f fVar) {
        if (fVar == null) {
            return;
        }
        this.Cl.add(fVar);
    }

    public final void a(g gVar) {
        this.Ck.add(gVar);
    }

    public final void b(f fVar) {
        if (fVar == null) {
            return;
        }
        this.Cl.remove(fVar);
    }

    public final void b(g gVar) {
        this.Ck.remove(gVar);
    }

    public final void c(int i, Context context, int i2, int i3) {
        a(i, context, i2, i3, null);
    }

    public final void g(int i, String str) {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.BV;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowError(0, str);
        }
        com.kwad.components.ad.splashscreen.monitor.a.kP();
        com.kwad.components.ad.splashscreen.monitor.a.b(this.mAdTemplate, 0, String.valueOf(str));
        kL();
    }

    public final void kG() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.BV;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdClicked();
        }
    }

    public final void kH() {
        com.kwad.components.ad.splashscreen.monitor.a.kP();
        com.kwad.components.ad.splashscreen.monitor.a.f(this.mAdTemplate, SystemClock.elapsedRealtime() - this.mAdTemplate.showStartTime);
        com.kwad.components.ad.splashscreen.monitor.b.kQ();
        com.kwad.sdk.a.a.c.xY().bc(true);
        bi biVar = this.mTimerHelper;
        if (biVar != null) {
            biVar.startTiming();
        }
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.BV;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowStart();
        }
    }

    public final void kI() {
        if (this.Cm) {
            return;
        }
        this.Cm = true;
        if (!o(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)) || this.mAdTemplate.converted) {
            z.a aVar = new z.a();
            bi biVar = this.mTimerHelper;
            if (biVar != null) {
                aVar.duration = biVar.getTime();
            }
            com.kwad.sdk.core.report.a.b(this.mAdTemplate, new j().ch(14).cm(22).a(aVar), (JSONObject) null);
            KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.BV;
            if (splashScreenAdInteractionListener != null) {
                splashScreenAdInteractionListener.onAdShowEnd();
            }
        } else {
            kN();
        }
        kL();
    }

    public final void kJ() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.BV;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowEnd();
        }
    }

    public final void kK() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.BV;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onSkippedAd();
        }
        kL();
    }

    public final void kO() {
        this.mRootContainer.post(new Runnable() { // from class: com.kwad.components.ad.splashscreen.h.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.kwad.components.core.e.c.b.nd()) {
                    h.this.mRootContainer.postDelayed(this, 1000L);
                } else {
                    h.this.kJ();
                }
            }
        });
    }

    public final ViewGroup p(AdInfo adInfo) {
        View findViewById;
        if (com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CF)) {
            ViewStub viewStub = (ViewStub) this.mRootContainer.findViewById(com.kwad.components.ad.splashscreen.f.c.v(adInfo) ? R.id.ksad_splash_right_top_view_stub : R.id.ksad_splash_left_top_view_stub);
            if (viewStub != null) {
                findViewById = viewStub.inflate();
            } else {
                findViewById = this.mRootContainer.findViewById(com.kwad.components.ad.splashscreen.f.c.v(adInfo) ? R.id.ksad_splash_right_top_root : R.id.ksad_splash_left_top_root);
            }
            ViewGroup viewGroup = (ViewGroup) findViewById;
            viewGroup.setVisibility(0);
            return viewGroup;
        }
        return this.mRootContainer;
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
        com.kwad.components.ad.splashscreen.e.a aVar = this.Ch;
        if (aVar != null) {
            aVar.release();
        }
        com.kwad.sdk.core.h.a aVar2 = this.Cj;
        if (aVar2 != null) {
            aVar2.release();
        }
    }

    public final void setSplashScreenAdListener(KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener) {
        this.BV = splashScreenAdInteractionListener;
    }
}
