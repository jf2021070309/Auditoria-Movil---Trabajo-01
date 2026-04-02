package com.kwad.components.ad.interstitial.d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.ImageView;
import com.kwad.components.ad.g.a.a.b;
import com.kwad.components.ad.interstitial.d.c;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.video.a;
import com.kwad.components.core.webview.b.a.o;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.a.u;
import com.kwad.components.core.webview.b.b.m;
import com.kwad.components.core.webview.b.b.y;
import com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler;
import com.kwad.components.core.webview.jshandler.aa;
import com.kwad.components.core.webview.jshandler.ac;
import com.kwad.components.core.webview.jshandler.ad;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ai;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.ar;
import com.kwad.components.core.webview.jshandler.as;
import com.kwad.components.core.webview.jshandler.ay;
import com.kwad.components.core.webview.jshandler.r;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.core.webview.a.c;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class d extends b {
    private static long jO = 400;
    private static float jP = 0.8f;
    private static float jQ = 1.0f;
    private static float jR = 0.749f;
    private com.kwad.components.core.widget.a.b bG;
    private com.kwad.components.core.webview.a cD;
    private com.kwad.sdk.core.webview.b cE;
    private KsAdVideoPlayConfig dJ;
    private com.kwad.sdk.core.g.d dO;
    private Vibrator dP;
    private ImageView ew;
    private com.kwad.sdk.core.video.videoview.a ex;
    private ap fn;
    private boolean fr;
    private ar jN;
    private KSFrameLayout jS;
    private KSFrameLayout jT;
    private Dialog jU;
    private KsAdWebView jV;
    private ImageView jW;
    private a.c jX;
    private p jY;
    private c.a jZ;
    private c jh;
    private com.kwad.components.ad.g.a.a.b ka;
    private volatile boolean kc;
    protected AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    protected Context mContext;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private int cF = -1;
    private boolean kb = false;
    private h kd = new h() { // from class: com.kwad.components.ad.interstitial.d.d.1
        @Override // com.kwad.components.ad.interstitial.d.h
        public final void dw() {
            d.this.kc = false;
            d.this.cV.aK();
        }

        @Override // com.kwad.components.ad.interstitial.d.h
        public final void dx() {
            d.this.cV.aL();
            d.this.kc = true;
        }
    };
    private com.kwad.sdk.core.h.c cV = new com.kwad.sdk.core.h.d() { // from class: com.kwad.components.ad.interstitial.d.d.12
        @Override // com.kwad.sdk.core.h.d, com.kwad.sdk.core.h.c
        public final void aK() {
            if (d.this.kc) {
                return;
            }
            com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "onPageVisible");
            if (d.this.fn != null) {
                d.this.fn.rC();
                d.this.fn.rD();
            }
        }

        @Override // com.kwad.sdk.core.h.d, com.kwad.sdk.core.h.c
        public final void aL() {
            if (d.this.kc) {
                return;
            }
            com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "onPageInvisible");
            if (d.this.fn != null) {
                d.this.fn.rE();
                d.this.fn.rF();
            }
        }
    };
    private final Runnable ke = new Runnable() { // from class: com.kwad.components.ad.interstitial.d.d.20
        @Override // java.lang.Runnable
        public final void run() {
            com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "rollBackRunnable run");
            d.this.s("4");
        }
    };
    private ae.a kf = new ae.a() { // from class: com.kwad.components.ad.interstitial.d.d.25
        @Override // com.kwad.components.core.webview.jshandler.ae.a
        public final void onAdShow() {
            if (d.this.mAdTemplate.mPvReported || d.this.jh.jm || d.this.jh.hB == null) {
                return;
            }
            d.this.jh.hB.onAdShow();
            d.this.jh.hI.getTimerHelper().startTiming();
            com.kwad.components.ad.interstitial.monitor.b.cM();
            com.kwad.components.ad.interstitial.monitor.b.b(d.this.mAdTemplate, 2);
        }
    };
    private ak.b cK = new ak.b() { // from class: com.kwad.components.ad.interstitial.d.d.18
        @Override // com.kwad.components.core.webview.jshandler.ak.b
        public final void a(ak.a aVar) {
            if (d.this.fr || d.this.kb) {
                return;
            }
            d.this.cF = aVar.status;
            if (d.this.cF != 1) {
                d.this.s("3");
                return;
            }
            d.this.jV.setVisibility(0);
            com.kwad.components.core.p.a.pC().X(d.this.mAdTemplate);
            d.this.mHandler.removeCallbacksAndMessages(null);
            bj.b(d.this.ke);
            if (d.this.ka != null) {
                d.this.ka.eZ();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static ViewGroup.LayoutParams A(int i) {
        int i2 = (int) (i * jR);
        return new ViewGroup.LayoutParams((int) (i2 / 0.749f), i2);
    }

    private static float a(boolean z, boolean z2) {
        return (z && z2) ? 1.7777778f : 0.749f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ViewGroup.LayoutParams a(int i, boolean z) {
        int i2 = (int) (i * (z ? jP : jQ));
        return new ViewGroup.LayoutParams(i2, (int) (i2 * (z ? 1.7777778f : 0.749f)));
    }

    private static ViewGroup.MarginLayoutParams a(WebCardVideoPositionHandler.VideoPosition videoPosition, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.topMargin = videoPosition.topMargin;
        marginLayoutParams.leftMargin = videoPosition.leftMargin;
        marginLayoutParams.width = videoPosition.width;
        marginLayoutParams.height = videoPosition.height;
        return marginLayoutParams;
    }

    private static void a(ViewGroup.MarginLayoutParams marginLayoutParams, ViewGroup.MarginLayoutParams marginLayoutParams2) {
        marginLayoutParams2.leftMargin = marginLayoutParams.leftMargin;
        marginLayoutParams2.rightMargin = marginLayoutParams.rightMargin;
        marginLayoutParams2.topMargin = marginLayoutParams.topMargin;
        marginLayoutParams2.bottomMargin = marginLayoutParams.bottomMargin;
        marginLayoutParams2.width = marginLayoutParams.width;
        marginLayoutParams2.height = marginLayoutParams.height;
    }

    private void a(com.kwad.components.core.webview.a aVar, String str) {
        aVar.a(dv());
        aVar.a(du());
        aVar.a(new com.kwad.components.core.webview.b.a.f());
        aVar.a(dn());
        aVar.a(new x(this.cE));
        aVar.a(dm());
        aVar.a(dl());
        aVar.a(dr());
        ap apVar = new ap();
        this.fn = apVar;
        aVar.a(apVar);
        this.jh.a(m15do());
        aVar.a(ds());
        aVar.a(dp());
        aVar.a(new aa(this.cE));
        aVar.a(di());
        aVar.a(new ak(this.cK, str));
        aVar.a(dg());
        ae aeVar = new ae(this.cE);
        aeVar.a(this.kf);
        aVar.a(aeVar);
        aVar.a(dq());
        aVar.a(new ai(getOpenNewPageListener()));
        if (com.kwad.sdk.core.response.b.b.cX(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) {
            aVar.a(df());
        }
        if (dj() != null) {
            aVar.a(this.ka);
        }
        aVar.a(dh());
        aVar.a(dk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdInfo adInfo, WebCardVideoPositionHandler.VideoPosition videoPosition, KSFrameLayout kSFrameLayout, boolean z) {
        kSFrameLayout.setWidthBasedRatio(!z);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kSFrameLayout.getLayoutParams();
        com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "updateVideoContainerSize before size: " + marginLayoutParams.width + ", " + marginLayoutParams.height);
        a(videoPosition, marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(marginLayoutParams);
        float aP = com.kwad.sdk.core.response.b.a.aP(adInfo);
        com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "updateVideoContainerSize materialRatio: " + aP);
        if (!z || aP <= 0.0f) {
            kSFrameLayout.setRatio(0.0f);
        } else {
            int i = marginLayoutParams.width;
            int i2 = (int) (marginLayoutParams.height / aP);
            marginLayoutParams.width = i2;
            marginLayoutParams.leftMargin += (i - i2) / 2;
            if (marginLayoutParams.width != 0) {
                float f = marginLayoutParams.height / marginLayoutParams.width;
                com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "cardParams ratio: " + f);
                kSFrameLayout.setRatio(f);
            }
        }
        com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "cardParams width: " + marginLayoutParams.width + ", height: " + marginLayoutParams.height);
        kSFrameLayout.setLayoutParams(marginLayoutParams);
        float dimension = getContext().getResources().getDimension(R.dimen.ksad_interstitial_card_radius);
        if (videoPosition.cornerRadius != null) {
            kSFrameLayout.setRadius((float) videoPosition.cornerRadius.topLeft, (float) videoPosition.cornerRadius.topRight, (float) videoPosition.cornerRadius.bottomRight, (float) videoPosition.cornerRadius.bottomLeft);
        } else if (marginLayoutParams.width > marginLayoutParams.height) {
            kSFrameLayout.setRadius(dimension, dimension, 0.0f, 0.0f);
        } else {
            kSFrameLayout.setRadius(dimension, dimension, dimension, dimension);
        }
        if (z) {
            this.jW.setVisibility(0);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.jW.getLayoutParams();
            a(marginLayoutParams2, marginLayoutParams3);
            this.jW.setLayoutParams(marginLayoutParams3);
            this.jh.a(this.mContext, adInfo, this.mAdTemplate, this.jW);
        } else {
            this.jW.setVisibility(8);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            kSFrameLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.kwad.components.ad.interstitial.d.d.17
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    outline.setRect(0, 0, view.getWidth(), view.getHeight());
                }
            });
            kSFrameLayout.setClipToOutline(true);
        }
    }

    private void av() {
        com.kwad.sdk.core.webview.b bVar = new com.kwad.sdk.core.webview.b();
        this.cE = bVar;
        bVar.setAdTemplate(this.jh.mAdTemplate);
        this.cE.mScreenOrientation = !com.kwad.sdk.utils.ai.IK() ? 1 : 0;
        this.cE.aym = this.jS;
        this.cE.MZ = this.jS;
        this.cE.My = this.jV;
        this.cE.mReportExtData = null;
    }

    private void aw() {
        String bG = com.kwad.sdk.core.response.b.b.bG(this.mAdTemplate);
        if (TextUtils.isEmpty(bG) || this.jV == null) {
            s("1");
        } else {
            r(bG);
        }
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    static /* synthetic */ boolean b(d dVar, boolean z) {
        dVar.kb = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        float bD = com.kwad.sdk.core.response.b.b.bD(this.mAdTemplate);
        if (this.dO == null) {
            com.kwad.sdk.core.g.d dVar = new com.kwad.sdk.core.g.d(bD);
            this.dO = dVar;
            dVar.a(new com.kwad.sdk.core.g.b() { // from class: com.kwad.components.ad.interstitial.d.d.19
                @Override // com.kwad.sdk.core.g.b
                public final void a(double d) {
                    if (bm.o(d.this.jS, 100)) {
                        d.this.d(d);
                    }
                    bj.a(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.d.19.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "onShakeEvent openGate2");
                            d.this.dO.CF();
                        }
                    }, null, 500L);
                }

                @Override // com.kwad.sdk.core.g.b
                public final void aT() {
                }
            });
        }
        this.dO.e(bD);
        this.dO.bi(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(double d) {
        this.jh.a(new c.b(getContext()).l(true).c(d).y(2).a(this.jS.getTouchCoords()).z(157));
        bj.a(getContext(), this.dP);
    }

    private KsAdWebView.d dd() {
        return new KsAdWebView.d() { // from class: com.kwad.components.ad.interstitial.d.d.22
            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageStart() {
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str, String str2) {
                d.this.s("1");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void de() {
        final boolean aO = com.kwad.sdk.core.response.b.a.aO(this.mAdInfo);
        final boolean IK = com.kwad.sdk.utils.ai.IK();
        float a = a(IK, aO);
        com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "replaceNativeView cardRatio: " + a);
        this.jh.ji.setRatio(a);
        final ViewGroup viewGroup = (ViewGroup) this.jS.findViewById(R.id.ksad_interstitial_native);
        viewGroup.setVisibility(0);
        viewGroup.post(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.d.24
            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup.LayoutParams a2 = IK ? d.a(d.this.jS.getWidth(), aO) : d.A(d.this.jS.getHeight());
                if (d.this.jV != null) {
                    d.this.jV.setVisibility(8);
                }
                d.this.jT.setVisibility(8);
                ViewParent parent = d.this.jh.ji.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(d.this.jh.ji);
                }
                viewGroup.addView(d.this.jh.ji);
                d.this.jh.ji.f(a2.width, a2.height);
                d.this.ex.requestLayout();
                d.b(d.this, true);
            }
        });
    }

    private ar df() {
        ar arVar = new ar(new ar.a() { // from class: com.kwad.components.ad.interstitial.d.d.26
            @Override // com.kwad.components.core.webview.jshandler.ar.a
            public final void bA() {
                d.this.bs();
            }
        });
        this.jN = arVar;
        return arVar;
    }

    private as dg() {
        return new as(this.cE, this.mApkDownloadHelper);
    }

    private com.kwad.components.core.webview.b.a.g dh() {
        com.kwad.components.core.webview.b.b.k kVar = new com.kwad.components.core.webview.b.b.k();
        kVar.Xd = this.jh.jw;
        return new com.kwad.components.core.webview.b.a.g(kVar);
    }

    private w di() {
        w wVar = new w(this.cE);
        wVar.a(new w.b() { // from class: com.kwad.components.ad.interstitial.d.d.2
            @Override // com.kwad.components.core.webview.jshandler.w.b
            public final void c(w.a aVar) {
                aVar.height = com.kwad.sdk.d.a.a.getScreenHeight(d.this.mContext);
                aVar.width = com.kwad.sdk.d.a.a.getScreenHeight(d.this.mContext);
            }
        });
        return wVar;
    }

    private com.kwad.components.ad.g.a.a.b dj() {
        com.kwad.components.ad.g.a.a.b o = com.kwad.components.ad.g.a.a.b.o(this.mAdTemplate);
        this.ka = o;
        if (o != null) {
            o.a(new b.InterfaceC0149b() { // from class: com.kwad.components.ad.interstitial.d.d.3
                @Override // com.kwad.components.ad.g.a.a.b.InterfaceC0149b
                public final void C(int i) {
                    if (i == com.kwad.components.ad.g.a.a.b.nG) {
                        d.this.jh.b(d.this.getContext(), d.this.mAdTemplate);
                        d.this.jh.a(true, -1, d.this.jh.ex);
                    }
                    d.this.dt();
                }
            });
        }
        return this.ka;
    }

    private com.kwad.components.ad.g.a.a.a dk() {
        final com.kwad.components.ad.g.a.a.a aVar = new com.kwad.components.ad.g.a.a.a();
        this.jh.js.add(new c.InterfaceC0156c() { // from class: com.kwad.components.ad.interstitial.d.d.4
            @Override // com.kwad.components.ad.interstitial.d.c.InterfaceC0156c
            public final void db() {
                aVar.eY();
            }
        });
        return aVar;
    }

    private u dl() {
        u uVar = new u();
        uVar.a(new u.a() { // from class: com.kwad.components.ad.interstitial.d.d.5
            @Override // com.kwad.components.core.webview.b.a.u.a
            public final void a(m mVar) {
                d.this.ex.setVideoSoundEnable(!mVar.Xg);
            }
        });
        return uVar;
    }

    private o dm() {
        return new o() { // from class: com.kwad.components.ad.interstitial.d.d.6
            @Override // com.kwad.components.core.webview.b.a.o, com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                m mVar = new m();
                mVar.Xg = !d.this.dJ.isVideoSoundEnable();
                cVar.a(mVar);
            }
        };
    }

    private ad dn() {
        return new ad(this.cE, new ad.b() { // from class: com.kwad.components.ad.interstitial.d.d.7
            @Override // com.kwad.components.core.webview.jshandler.ad.b
            public final void a(ad.a aVar) {
            }
        });
    }

    /* renamed from: do  reason: not valid java name */
    private a.c m15do() {
        final y yVar = new y();
        a.c cVar = new a.c() { // from class: com.kwad.components.ad.interstitial.d.d.8
            @Override // com.kwad.components.core.video.a.c
            public final void bj() {
                if (d.this.ew.getVisibility() == 0) {
                    d.this.ew.setVisibility(8);
                }
                yVar.Xq = false;
                yVar.Xm = false;
                yVar.nQ = (int) Math.ceil(((float) d.this.ex.getCurrentPosition()) / 1000.0f);
                d.this.jY.a(yVar);
            }

            @Override // com.kwad.components.core.video.a.c
            public final void bk() {
                yVar.Xq = false;
                yVar.Xm = true;
                yVar.nQ = com.kwad.sdk.core.response.b.a.G(com.kwad.sdk.core.response.b.d.ck(d.this.cE.getAdTemplate()));
                d.this.jY.a(yVar);
            }

            @Override // com.kwad.components.core.video.a.c
            public final void d(long j) {
                yVar.Xq = false;
                yVar.Xm = false;
                yVar.nQ = (int) Math.ceil(((float) j) / 1000.0f);
                d.this.jY.a(yVar);
            }

            @Override // com.kwad.components.core.video.a.c
            public final void onVideoPlayStart() {
                yVar.Xq = false;
                yVar.Xm = false;
                yVar.nQ = 0;
                d.this.jY.a(yVar);
            }
        };
        this.jX = cVar;
        return cVar;
    }

    private WebCardVideoPositionHandler dp() {
        return new WebCardVideoPositionHandler(new WebCardVideoPositionHandler.a() { // from class: com.kwad.components.ad.interstitial.d.d.9
            @Override // com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler.a
            public final void a(WebCardVideoPositionHandler.VideoPosition videoPosition) {
                com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "onVideoSetPosition hadRollBackToNative: " + d.this.kb);
                if (d.this.kb || d.this.mAdInfo == null || !com.kwad.sdk.core.response.b.a.aU(d.this.mAdInfo)) {
                    return;
                }
                c unused = d.this.jh;
                boolean a = c.a(d.this.mContext, d.this.mAdInfo);
                d dVar = d.this;
                dVar.a(dVar.mAdInfo, videoPosition, d.this.jT, a);
                d.this.jT.setVisibility(0);
                d.this.jV.setVisibility(0);
            }
        });
    }

    private ay dq() {
        ay ayVar = new ay(getContext(), this.mAdTemplate);
        ayVar.a(new ay.a() { // from class: com.kwad.components.ad.interstitial.d.d.10
            @Override // com.kwad.components.core.webview.jshandler.ay.a
            public final boolean dy() {
                if (d.this.jY != null) {
                    d.this.jY.aO(false);
                }
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.d.10.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.this.dt();
                    }
                });
                boolean z = !d.this.jh.ju;
                if (z) {
                    d.this.jh.a(true, -1, d.this.jh.ex);
                }
                return z;
            }
        });
        return ayVar;
    }

    private ac dr() {
        return new ac(new ac.b() { // from class: com.kwad.components.ad.interstitial.d.d.13
            @Override // com.kwad.components.core.webview.jshandler.ac.b
            public final void a(final ac.a aVar) {
                if (d.this.jU != null) {
                    d.this.mHandler.post(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.d.13.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (d.this.jh.jm || aVar.type != 0 || d.this.jh.jk || d.this.jh.jl || !com.kwad.components.ad.interstitial.e.a.c(d.this.jh)) {
                                d.this.jh.a(aVar.type == 3, -1, d.this.ex);
                                d.this.dt();
                                return;
                            }
                            d.this.jh.jl = true;
                            com.kwad.components.ad.interstitial.b.b.K(d.this.mContext);
                        }
                    });
                }
            }
        });
    }

    private p ds() {
        p pVar = new p() { // from class: com.kwad.components.ad.interstitial.d.d.14
            @Override // com.kwad.components.core.webview.b.a.p, com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
            public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
                super.a(str, cVar);
                if (d.this.ex.isIdle()) {
                    y yVar = new y();
                    yVar.Xq = false;
                    yVar.Xm = false;
                    yVar.nQ = 0;
                    cVar.a(yVar);
                }
                if (d.this.ex.isCompleted()) {
                    y yVar2 = new y();
                    yVar2.Xq = false;
                    yVar2.Xm = true;
                    yVar2.nQ = com.kwad.sdk.core.response.b.a.G(com.kwad.sdk.core.response.b.d.ck(d.this.cE.getAdTemplate()));
                    cVar.a(yVar2);
                }
            }
        };
        this.jY = pVar;
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dt() {
        Activity ownerActivity;
        KsInterstitialAd.AdInteractionListener adInteractionListener;
        Dialog dialog = this.jU;
        if (dialog == null || (ownerActivity = dialog.getOwnerActivity()) == null || ownerActivity.isFinishing()) {
            return;
        }
        this.jU.dismiss();
        if (!this.jh.jm && (adInteractionListener = this.jh.hB) != null) {
            adInteractionListener.onAdClosed();
        }
        if (this.jh.ex != null) {
            this.jh.ex.release();
        }
    }

    private r du() {
        return new r(this.cE, this.mApkDownloadHelper, new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.interstitial.d.d.15
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                if (aVar != null) {
                    if (!d.this.jh.jm && d.this.jh.hB != null) {
                        d.this.jh.hB.onAdClicked();
                    }
                    d.this.jh.jk = true;
                    if (!d.this.jh.jm) {
                        d.this.jh.cl();
                    }
                    if (d.this.jh.hI == null || !com.kwad.components.ad.interstitial.a.b.cH()) {
                        return;
                    }
                    d.this.jh.a(false, -1, d.this.jh.ex);
                    d.this.jh.hI.dismiss();
                }
            }
        });
    }

    private com.kwad.components.core.webview.jshandler.u dv() {
        return new com.kwad.components.core.webview.jshandler.u(this.cE, this.mApkDownloadHelper, new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.interstitial.d.d.16
            @Override // com.kwad.sdk.core.webview.d.a.a
            public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
                if (aVar != null) {
                    if (!d.this.jh.jm && d.this.jh.hB != null) {
                        d.this.jh.hB.onAdClicked();
                    }
                    d.this.jh.jk = true;
                    if (!d.this.jh.jm) {
                        d.this.jh.cl();
                    }
                    if (d.this.jh.hI == null || !com.kwad.components.ad.interstitial.a.b.cH()) {
                        return;
                    }
                    d.this.jh.a(false, -1, d.this.jh.ex);
                    d.this.jh.hI.dismiss();
                }
            }
        });
    }

    private ai.a getOpenNewPageListener() {
        return new ai.a() { // from class: com.kwad.components.ad.interstitial.d.d.11
            @Override // com.kwad.components.core.webview.jshandler.ai.a
            public final void a(com.kwad.components.core.webview.a.b bVar) {
                AdWebViewActivityProxy.launch(d.this.mContext, new AdWebViewActivityProxy.a.C0206a().as(bVar.title).at(bVar.url).ax(true).V(d.this.mAdTemplate).oE());
            }
        };
    }

    private void r(String str) {
        ay();
        c.a b = this.jV.getClientConfig().cC(this.mAdTemplate).b(dd());
        this.jZ = b;
        this.jV.setClientConfig(b);
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(this.jV);
        this.cD = aVar;
        a(aVar, str);
        this.jV.addJavascriptInterface(this.cD, "KwaiAd");
        this.jV.setBackgroundColor(0);
        this.jV.setVisibility(4);
        this.jV.loadUrl(str);
        bj.a(this.ke, null, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(String str) {
        com.kwad.sdk.core.e.c.d("InterstitialWebViewPresenter", "handleWebViewError " + str);
        com.kwad.sdk.core.g.d dVar = this.dO;
        if (dVar != null) {
            dVar.bj(getContext());
        }
        this.mHandler.removeCallbacksAndMessages(null);
        if (this.fr) {
            return;
        }
        this.fr = true;
        com.kwad.components.core.p.a pC = com.kwad.components.core.p.a.pC();
        AdTemplate adTemplate = this.mAdTemplate;
        pC.b(adTemplate, com.kwad.sdk.core.response.b.b.bG(adTemplate), str);
        this.mHandler.post(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.d.23
            @Override // java.lang.Runnable
            public final void run() {
                d.this.de();
                d.this.jh.cQ();
            }
        });
        c.a aVar = this.jZ;
        if (aVar != null) {
            aVar.b((KsAdWebView.d) null);
        }
    }

    @Override // com.kwad.components.ad.interstitial.d.b, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        c cVar = (c) Gh();
        this.jh = cVar;
        this.kb = false;
        this.jU = cVar.hI;
        this.dJ = this.jh.dJ;
        this.mApkDownloadHelper = this.jh.mApkDownloadHelper;
        AdTemplate adTemplate = this.jh.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.ex = this.jh.ex;
        this.bG.sB();
        this.bG.a(this.cV);
        this.jh.a(this.kd);
        if (com.kwad.sdk.core.response.b.b.bE(this.mAdTemplate)) {
            this.mHandler.post(new Runnable() { // from class: com.kwad.components.ad.interstitial.d.d.21
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.de();
                    d.this.jh.cQ();
                }
            });
            return;
        }
        av();
        aw();
    }

    @Override // com.kwad.components.ad.interstitial.d.b
    public final void cO() {
        super.cO();
        com.kwad.components.ad.g.a.a.b bVar = this.ka;
        if (bVar != null) {
            bVar.fb();
        }
    }

    @Override // com.kwad.components.ad.interstitial.d.b
    public final void cP() {
        super.cP();
        com.kwad.components.ad.g.a.a.b bVar = this.ka;
        if (bVar != null) {
            bVar.fa();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.jV = (KsAdWebView) getRootView().findViewById(R.id.ksad_web_card_webView);
        this.bG = new com.kwad.components.core.widget.a.b(getRootView(), 100);
        this.jS = (KSFrameLayout) getRootView().findViewById(R.id.ksad_container);
        this.jT = (KSFrameLayout) getRootView().findViewById(R.id.ksad_video_container);
        this.ew = (ImageView) getRootView().findViewById(R.id.ksad_video_first_frame_container);
        this.jW = (ImageView) getRootView().findViewById(R.id.ksad_interstitial_video_blur);
        Context context = getContext();
        this.mContext = context;
        if (context != null) {
            this.dP = (Vibrator) context.getSystemService("vibrator");
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.mHandler.removeCallbacksAndMessages(null);
        this.bG.b(this.cV);
        this.bG.sC();
        com.kwad.sdk.core.g.d dVar = this.dO;
        if (dVar != null) {
            dVar.bj(getContext());
        }
        c.a aVar = this.jZ;
        if (aVar != null) {
            aVar.b((KsAdWebView.d) null);
        }
        this.jh.b(this.kd);
    }
}
