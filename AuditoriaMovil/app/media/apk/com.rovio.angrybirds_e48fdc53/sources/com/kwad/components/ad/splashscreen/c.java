package com.kwad.components.ad.splashscreen;

import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.kwad.components.ad.splashscreen.c.k;
import com.kwad.components.ad.splashscreen.c.l;
import com.kwad.components.ad.splashscreen.c.m;
import com.kwad.components.ad.splashscreen.c.n;
import com.kwad.components.ad.splashscreen.c.o;
import com.kwad.components.ad.splashscreen.c.p;
import com.kwad.components.ad.splashscreen.c.q;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.offline.api.tk.model.StyleTemplate;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsSplashScreenAd;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.utils.bi;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.core.l.c<h> implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
    private KsSplashScreenAd.SplashScreenAdInteractionListener BV;
    private com.kwad.components.ad.splashscreen.f.d BW;
    private com.kwad.sdk.core.h.b bJ;
    private AdInfo mAdInfo;
    private SceneImpl mAdScene;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private DetailVideoView mDetailVideoView;
    private boolean mPageDismissCalled;
    private AdBaseFrameLayout mRootContainer;
    private KsVideoPlayConfig mVideoPlayConfig;

    private c(Context context, AdTemplate adTemplate) {
        super(context);
        this.mAdTemplate = adTemplate;
        this.mAdScene = adTemplate.mAdScene;
        oh();
    }

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

    private static Presenter G(AdTemplate adTemplate) {
        Presenter hVar;
        Presenter pVar;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        Presenter presenter = new Presenter();
        presenter.a(new k());
        presenter.a(new com.kwad.components.ad.splashscreen.c.b());
        presenter.a(new com.kwad.components.ad.splashscreen.c.c());
        presenter.a(new o());
        if (com.kwad.sdk.core.response.b.a.aU(ck)) {
            presenter.a(new com.kwad.components.ad.splashscreen.c.d());
            hVar = new q();
        } else {
            hVar = new com.kwad.components.ad.splashscreen.c.h();
        }
        presenter.a(hVar);
        boolean dn = com.kwad.sdk.core.response.b.b.dn(ck);
        boolean dd = com.kwad.sdk.core.response.b.b.dd(ck);
        boolean dh = com.kwad.sdk.core.response.b.b.dh(ck);
        boolean dm = com.kwad.sdk.core.response.b.b.dm(ck);
        boolean dj = com.kwad.sdk.core.response.b.b.dj(ck);
        if (!dn) {
            if (dj) {
                pVar = new n();
            } else if (dd) {
                pVar = new m();
            } else if (dh) {
                pVar = new l();
            } else if (dm) {
                pVar = new p();
            }
            presenter.a(pVar);
        }
        if (com.kwad.sdk.core.response.b.a.aH(ck)) {
            presenter.a(new com.kwad.components.ad.splashscreen.c.f());
        }
        if (h.o(ck)) {
            presenter.a(new com.kwad.components.ad.splashscreen.c.a.f());
        }
        presenter.a(new com.kwad.components.ad.splashscreen.c.j());
        presenter.a(new com.kwad.components.ad.splashscreen.c.a());
        presenter.a(new com.kwad.components.ad.splashscreen.c.g());
        return presenter;
    }

    public static c a(Context context, AdTemplate adTemplate, boolean z, com.kwad.sdk.core.h.b bVar, KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener) {
        c cVar = null;
        try {
            com.kwad.sdk.i.a.ae(GMAdConstant.RIT_TYPE_SPLASH, TTLogUtil.TAG_EVENT_SHOW);
            adTemplate.showStartTime = SystemClock.elapsedRealtime();
            com.kwad.components.ad.splashscreen.monitor.a.kP();
            com.kwad.components.ad.splashscreen.monitor.a.I(adTemplate);
            com.kwad.components.ad.splashscreen.monitor.a.kP();
            com.kwad.components.ad.splashscreen.monitor.a.c(adTemplate, KsAdSDKImpl.get().getSDKInitTime(), z);
            c cVar2 = new c(com.kwad.sdk.m.l.wrapContextIfNeed(context), adTemplate);
            try {
                cVar2.setPageExitListener(bVar);
                cVar2.setSplashScreenAdListener(splashScreenAdInteractionListener);
                com.kwad.sdk.i.a.af(GMAdConstant.RIT_TYPE_SPLASH, TTLogUtil.TAG_EVENT_SHOW);
                return cVar2;
            } catch (Throwable th) {
                th = th;
                cVar = cVar2;
                com.kwad.components.ad.splashscreen.monitor.a.kP();
                com.kwad.components.ad.splashscreen.monitor.a.a(adTemplate, th.toString(), z);
                if (KsAdSDKImpl.get().getIsExternal()) {
                    com.kwad.components.core.d.a.b(th);
                    return cVar;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private com.kwad.sdk.core.h.c a(final h hVar) {
        return new com.kwad.sdk.core.h.c() { // from class: com.kwad.components.ad.splashscreen.c.1
            @Override // com.kwad.sdk.core.h.c
            public final void aK() {
                if (hVar.mTimerHelper != null) {
                    hVar.mTimerHelper.JZ();
                }
            }

            @Override // com.kwad.sdk.core.h.c
            public final void aL() {
                if (hVar.mTimerHelper != null) {
                    hVar.mTimerHelper.Ka();
                }
            }
        };
    }

    private int getSplashLayoutId() {
        return com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CF) ? R.layout.ksad_splash_screen_layout : this.mAdInfo.adSplashInfo.skipButtonPosition == 0 ? R.layout.ksad_splash_screen_skip_button_top_right : R.layout.ksad_splash_screen_skip_button_top_left;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.components.core.l.c
    /* renamed from: kw */
    public h ky() {
        com.kwad.components.ad.splashscreen.f.d dVar = new com.kwad.components.ad.splashscreen.f.d(this.lN, com.kwad.sdk.core.response.b.a.cl(this.mAdInfo));
        this.BW = dVar;
        dVar.a(this.bJ);
        this.BW.sB();
        if (this.mVideoPlayConfig == null) {
            this.mVideoPlayConfig = new KsVideoPlayConfig.Builder().videoSoundEnable(this.mAdInfo.adSplashInfo.mute != 1).build();
        }
        h hVar = new h();
        hVar.setSplashScreenAdListener(this.BV);
        hVar.mRootContainer = this.mRootContainer;
        hVar.mAdTemplate = this.mAdTemplate;
        hVar.mAdScene = this.mAdScene;
        hVar.mVideoPlayConfig = this.mVideoPlayConfig;
        hVar.Cj = this.BW;
        hVar.mApkDownloadHelper = this.mApkDownloadHelper;
        hVar.Ci = F(this.mAdTemplate);
        hVar.mTimerHelper = new bi();
        if (com.kwad.sdk.core.response.b.a.aU(this.mAdInfo)) {
            com.kwad.components.ad.splashscreen.e.a aVar = new com.kwad.components.ad.splashscreen.e.a(this.mAdTemplate, this.mDetailVideoView, this.mVideoPlayConfig);
            hVar.Ch = aVar;
            hVar.Cj.a(aVar);
        }
        hVar.Cj.a(a(hVar));
        return hVar;
    }

    public static boolean m(AdInfo adInfo) {
        return adInfo.adSplashInfo != null && adInfo.adSplashInfo.fullScreenClickSwitch == 1;
    }

    private void notifyPageDismiss() {
        com.kwad.sdk.a.a.c.xY().yb();
        if (this.mPageDismissCalled) {
            return;
        }
        this.mPageDismissCalled = true;
    }

    @Override // com.kwad.components.core.l.c, com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
        super.aa();
        if (((h) this.Lo).Ch != null) {
            ((h) this.Lo).Ch.lF();
        }
    }

    @Override // com.kwad.components.core.l.c, com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.setOnDismissListener(null);
            this.mApkDownloadHelper.setOnShowListener(null);
        }
        this.BW.sC();
        notifyPageDismiss();
    }

    @Override // com.kwad.components.core.l.c
    public final int getLayoutId() {
        return getSplashLayoutId();
    }

    @Override // com.kwad.components.core.l.c
    public final void initData() {
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        KsVideoPlayConfig build = new KsVideoPlayConfig.Builder().videoSoundEnable(this.mAdInfo.adSplashInfo.mute != 1).build();
        this.mVideoPlayConfig = build;
        this.mAdTemplate.mInitVoiceStatus = build.isVideoSoundEnable() ? 2 : 1;
        com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate);
        this.mApkDownloadHelper = cVar;
        cVar.setOnDismissListener(this);
        this.mApkDownloadHelper.setOnShowListener(this);
    }

    @Override // com.kwad.components.core.l.c
    public final boolean kv() {
        return true;
    }

    @Override // com.kwad.components.core.l.c
    public final void kx() {
        this.mRootContainer = (AdBaseFrameLayout) this.lN.findViewById(R.id.ksad_splash_root_container);
        DetailVideoView detailVideoView = (DetailVideoView) this.lN.findViewById(R.id.ksad_splash_video_player);
        this.mDetailVideoView = detailVideoView;
        detailVideoView.setAd(true);
        this.mDetailVideoView.setVisibility(8);
        this.mRootContainer.findViewById(R.id.splash_play_card_view).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.splashscreen.c.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (com.kwad.sdk.d.a.a.yA() || !c.m(c.this.mAdInfo) || c.this.Lo == null) {
                    return;
                }
                ((h) c.this.Lo).c(1, view.getContext(), 53, 2);
            }
        });
    }

    @Override // com.kwad.components.core.l.c
    public final Presenter onCreatePresenter() {
        getContext();
        return G(this.mAdTemplate);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean nf = dialogInterface instanceof com.kwad.components.core.e.c.b ? ((com.kwad.components.core.e.c.b) dialogInterface).nf() : false;
        try {
            KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.BV;
            if (splashScreenAdInteractionListener != null) {
                if (nf) {
                    splashScreenAdInteractionListener.onDownloadTipsDialogDismiss();
                } else {
                    splashScreenAdInteractionListener.onDownloadTipsDialogCancel();
                }
            }
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        try {
            KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.BV;
            if (splashScreenAdInteractionListener != null) {
                splashScreenAdInteractionListener.onDownloadTipsDialogShow();
            }
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    public final void setPageExitListener(com.kwad.sdk.core.h.b bVar) {
        this.bJ = bVar;
    }

    public final void setSplashScreenAdListener(KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener) {
        this.BV = splashScreenAdInteractionListener;
        if (this.Lo != 0) {
            ((h) this.Lo).setSplashScreenAdListener(splashScreenAdInteractionListener);
        }
    }
}
